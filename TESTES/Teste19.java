import java.util.Locale;
import java.util.Scanner;

public class Teste19 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);               
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollarsToBuy = sc.nextDouble();

        double amountToPay = Dolar.amountInReais(dollarPrice, dollarsToBuy);

        System.out.printf("Amount to be paid in reais = %.2f%n", amountToPay);

        sc.close();
    }
}

class Dolar {

    private static final double IOF = 0.06;         

   
    public static double amountInReais(double dollarPrice, double dollarsToBuy) {
        double semImposto = dollarPrice * dollarsToBuy;
        return semImposto * (1.0 + IOF);           
    }
}
