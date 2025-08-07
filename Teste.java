import java.util.Locale;

public class Teste {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);           // garante ponto como separador
        String produto1 = "Computador";
        String produto2 = "Mesa";

        int age = 21;
        int code = 5230;
        char gender = 'F';

        double price1 = 2100.00;
        double price2 = 650.00;
        double mesure = 53.23445;

        System.out.println("Products:");
        System.out.printf("%s, which price is $%.2f%n", produto1, price1);
        System.out.printf("%s, which price is $%.2f%n", produto2, price2);

        System.out.printf("Record: %d years old, code %d and gender %c%n",
                          age, code, gender);

        System.out.printf("Measure with eight decimal places: %.8f%n", mesure);
        System.out.printf("Rounded (three decimal places): %.3f%n", mesure);

        System.out.println("US decimal point test complete.");
    }
}
