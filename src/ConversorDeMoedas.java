import java.io.IOException;
import java.util.Map;

public class ConversorDeMoedas {

    public static double converter(String deMoeda, String paraMoeda, double valor) throws IOException, InterruptedException {
        Map<String, Double> taxas = APIdeTaxaDeCambio.obterTaxasDeCambio(deMoeda);
        if (taxas.containsKey(paraMoeda)) {
            double taxa = taxas.get(paraMoeda);
            return valor * taxa;
        } else {
            throw new IllegalArgumentException("Moeda não suportada: " + paraMoeda);
        }
    }
}
