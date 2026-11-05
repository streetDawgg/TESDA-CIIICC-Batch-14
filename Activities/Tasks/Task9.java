package Activities.Tasks;
import static java.lang.Math.*;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = scanner.nextInt();

        System.out.println("\n");
        System.out.println("Java Math Operations: Operand 1: " + num1 +" Operand 2: " + num2);
        System.out.println("Java Math Addition: "+ add(num1,num2));
        System.out.println("Java Math Subtraction: "+ subtract(num1,num2));
        System.out.println("Java Math Multiplication: "+ multiply(num1,num2));
        System.out.println("Java Math Division: "+ divide(num1,num2));
        // Demonstrate the math operations here
    }
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return (float) floorDiv(a, b);
    }


}
