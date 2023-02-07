import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, pi = 3.14159, triangleArea, circleArea, trapezeArea, squareArea, rectangleArea;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangleArea = a * c / 2.0;
        circleArea = pi * c * c;
        trapezeArea = (a + b) * c / 2.0;
        squareArea = b * b;
        rectangleArea = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangleArea);
        System.out.printf("CIRCULO: %.3f%n", circleArea);
        System.out.printf("TRAPEZIO: %.3f%n", trapezeArea);
        System.out.printf("QUADRADO: %.3f%n", squareArea);
        System.out.printf("RETANGULO: %.3f%n", rectangleArea);
        
        sc.close();
    }
}