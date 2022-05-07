import java.util.Scanner;

public class UseComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real and imaginary part of first complex number ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        Complex num1 = new Complex(x, y);
        System.out.print("Enter real and imaginary part of first complex number");
        first = sc.nextInt();
        second = sc.nextInt();
        Complex num2 = new Complex(x, y);
        Complex num3 = num1.addition(num2);
        System.out.println("Addition of two complex number: ");
        num3.display();
        Complex num4 = num1.subtraction(num2);
        System.out.println("Subtraction of two complex number: ");
        num4.display();
        Complex num5 = num1.multiplication(num2);
        System.out.println("Multiplication of two complex number: ");
        Complex num6 = num1.division(num2);
        System.out.println("division of two complex number: ");
        num6.display();
    }
}
