import java.util.Scanner;

public class Derivata {
    public static void  main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vilken punkt vill du beräkna darivata i?");
        double x = in.nextDouble();
        System.out.println("Derivata i punkten x="+x+" : f'("+x+")="+derivatan(x));
    }
    public static double f(double x) {
        return 3*x*x+4*x+6;
    }
    public static double derivatan(double x) {
        // noggrannheten
        double h = 0.00000001;
        // Derivatans definition
        return  (f(x+h)-f(x))/h;
    }
}