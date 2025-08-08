import java.util.Locale;
import java.util.Scanner;

public class Teste21 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter account number: ");
    int number = sc.nextInt();
    sc.nextLine();                          // consome \n pendente

    System.out.print("Enter account holder: ");
    String holder = sc.nextLine();

    System.out.print("Is there an initial deposit (y/n)? ");
    char resp = sc.next().toLowerCase().charAt(0);

    Account acc;
    if (resp == 'y') {
        System.out.print("Enter initial deposit value: ");
        double initialDeposit = sc.nextDouble();
        acc = new Account(number, holder, initialDeposit);
    } else {
        acc = new Account(number, holder);  // saldo zero
    }

    System.out.println("\nAccount data:");
    System.out.println(acc);

    // depósito
    System.out.print("\nEnter a deposit value: ");
    double depositValue = sc.nextDouble();
    acc.deposit(depositValue);
    System.out.println("Updated account data:");
    System.out.println(acc);

    // saque
    System.out.print("\nEnter a withdraw value: ");
    double withdrawValue = sc.nextDouble();
    acc.withdraw(withdrawValue);
    System.out.println("Updated account data:");
    System.out.println(acc);

    sc.close();
  }
 }


/* ---------- Classe Account (encapsulamento adequado) ---------- */
class Account {

private final int number;        // imutável
private String holder;           // pode alterar
private double balance;          // acesso só por métodos

private static final double WITHDRAW_FEE = 5.0;

/* Construtor sem depósito inicial */
public Account(int number, String holder) {
    this.number = number;
    this.holder = holder;
}

/* Construtor com depósito inicial */
public Account(int number, String holder, double initialDeposit) {
    this.number = number;
    this.holder = holder;
    deposit(initialDeposit);     // reutiliza lógica de depósito
}

/* ---------- getters & setter para holder ---------- */
public int getNumber() {
    return number;
}

public String getHolder() {
    return holder;
}

public void setHolder(String holder) {
    this.holder = holder;
}

public double getBalance() {
    return balance;
}

/* ---------- operações de negócio ---------- */
public void deposit(double amount) {
    balance += amount;
}

public void withdraw(double amount) {
    balance -= amount + WITHDRAW_FEE;
}

/* ---------- representação legível ---------- */
@Override
public String toString() {
    return String.format("Account %d, Holder: %s, Balance: $ %.2f",
                         number, holder, balance);
}
}