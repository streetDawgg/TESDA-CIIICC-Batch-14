package Activities.Tasks;
import java.util.Scanner;

public class Task7 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double userInput1 = scanner.nextDouble();

        System.out.print("Enter Second Number: ");
        double userInput2 = scanner.nextDouble();

        System.out.println("Results:");
        System.out.println("Addition:" + addNumbers(userInput1,userInput2));
        System.out.println("Subtraction:" + subtractNumbers(userInput1,userInput2));
        System.out.println("Multiplication:" + multiplyNumbers(userInput1,userInput2));
        System.out.println("Division:" + divideNumbers(userInput1,userInput2));

        System.out.println("______________________________________________");

        Addition addition = new Addition(userInput1,userInput2);
        Subtraction subtraction = new Subtraction(userInput1,userInput2);
        Multiplication multiplication = new Multiplication(userInput1,userInput2);
        Division division = new Division(userInput1,userInput2);

        System.out.println("Constructor Method Results:");
        System.out.println("Addition:" + addition.getResult());
        System.out.println("Subtraction:" + subtraction.result);
        System.out.println("Multiplication:" + multiplication.result);
        System.out.println("Division:" + division.result);

    }

    public static double addNumbers(double num1, double num2){
        double addition = num1 + num2;
        return addition;
    }

    public static double subtractNumbers(double num1, double num2){
        double subtract = num1 - num2;
        return subtract;
    }

    public static double multiplyNumbers(double num1, double num2){
        double multiply = num1 * num2;
        return multiply;
    }

    public static double divideNumbers(double num1, double num2){
        if (num2 ==0){
            System.out.println("Can not Divide 'Zero' / '0'!");
            return 0;
        }
        double division = num1 / num2;
        return division;
    }
}

// Construction worker
class Addition{
    double add;
    public Addition(double num1, double num2){
        add = num1 + num2;
    }
    public double getResult(){
        return add;
    }
}

class Subtraction{
    double num1;
    double num2;
    double result;
    public Subtraction(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
        this.result = num1 - num2;
    }
}

class Multiplication {
    double num1;
    double num2;
    double result;

    public Multiplication(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = num1 * num2;
    }
}

class Division {
    double num1;
    double num2;
    double result;

    public Division(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;

        if(num2 == 0){
            System.out.println("Can not Divide 'Zero' / '0'!");
        return;
        }
        this.result = num1 / num2;
    }
}

