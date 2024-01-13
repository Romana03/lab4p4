// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter width: ");
        double w = in.nextInt();
        System.out.print("Enter length: ");
        double l = in.nextInt();
        Rectangle rectangle = new Rectangle(w, l);
            System.out.println("Width: " + rectangle.getWidth());
            System.out.println("Length: " + rectangle.getLength());
            System.out.println("Area: " + rectangle.calcul_Arie());
            System.out.println("Perimeter: " + rectangle.calcul_Perimetru());
        }

    }
