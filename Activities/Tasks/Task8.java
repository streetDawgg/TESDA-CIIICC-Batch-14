package Activities.Tasks;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Task8 {

    static void main(String[] args) {
        sumOfIntegers(4,5,10);
        sumOfIntegers(7, 9, 90);

    }

    public static void sumOfIntegers(int... numbers) {
        int parameters = Arrays.stream(numbers).sum();

        System.out.println("Cumulative Sums for Each Parameter:");
        Arrays.stream(numbers).forEach(num -> {
            int sum = IntStream.rangeClosed(1, num).sum();

            System.out.println(num + " =  " + sum);
        });

        System.out.println("\nSum of all parameters: " + parameters);
    }

}

