import java.util.Locale;
import java.util.Scanner;

public class Teste15 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);     // garante ponto decimal
        Scanner sc = new Scanner(System.in);

        Product product = new Product();  // objeto vazio a ser preenchido

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        // Mostra os dados iniciais
        System.out.println("\nProduct data: " + product);

        // Adiciona unidades
        System.out.print("\nEnter the number of products to be ADDED in stock: ");
        int addQty = sc.nextInt();
        product.addProducts(addQty);
        System.out.println("Updated data after add: " + product);

        // Remove unidades
        System.out.print("\nEnter the number of products to be REMOVED from stock: ");
        int removeQty = sc.nextInt();
        product.removeProducts(removeQty);
        System.out.println("Updated data after remove: " + product);

        sc.close();
    }
}

class Product {
    public String name;
    public double price;
    public int quantity;

    // Valor total em estoque
    public double totalValueInStock() {
        return price * quantity;
    }

    // Adiciona unidades
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    // Remove unidades
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    // Quando chamamos System.out.println(product) ele usa este método
    @Override
    public String toString() {
        return String.format("%s, $%.2f, %d units, Total: $%.2f",
                             name, price, quantity, totalValueInStock());
    }
}
