import java.util.Scanner;

public class Teste14 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);


     Triangulo x,y;
     x= new Triangulo();
     y = new Triangulo();


     System.out.println("Enter the measures of triangle X: ");
     x.a = sc.nextDouble();
     x.b = sc.nextDouble();
     x.c = sc.nextDouble();
     System.out.println("Enter the measures of triangle Y: ");
     y.a = sc.nextDouble();
     y.b = sc.nextDouble();
     y.c = sc.nextDouble();

     double areaX = x.area();
     double areaY = y.area();


     System.out.println(areaX);
     System.out.println(areaY);


     sc.close();
  }
}

class Triangulo {
  public double a;
  public double b;
  public double c;

  public double area(){
    double p = (a + b + c) / 2.0;
    return Math.sqrt(p * (p-a) * (p-b) * (p-c));

  }
}
