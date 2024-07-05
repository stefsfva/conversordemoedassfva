import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class APIdeTaxaDeCambio {

    public static Map<String, Double> obterTaxasDeCambio(String baseMoeda) throws IOException, InterruptedException {
        String apiKey = "7a4f4a85d817fd6edbb4c3f3"; // Chave API de stephanne.fva@gmail.com
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + baseMoeda;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Configuração do Gson para modo lenient
        Gson gson = new GsonBuilder().setLenient().create();

        JsonReader jsonReader = new JsonReader(new java.io.StringReader(response.body()));
        jsonReader.setLenient(true);

        JsonObject jsonObject = gson.fromJson(jsonReader, JsonObject.class);

        // Verificação: se a resposta contém o objeto "conversion_rates"
        if (!jsonObject.has("conversion_rates")) {
            throw new IOException("Resposta da API não contém 'conversion_rates'");
        }

        JsonObject taxas = jsonObject.getAsJsonObject("conversion_rates");

        Map<String, Double> mapaDeTaxas = new HashMap<>();
        for (String chave : taxas.keySet()) {
            mapaDeTaxas.put(chave, taxas.get(chave).getAsDouble());
        }

        return mapaDeTaxas;
    }
}
