package Activities.Tasks;

import java.util.Arrays;

public class Task6 {
    static void main() {
        int[] numbers = {
                951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
                615, 83, 165, 141, 501, 263, 617, 865, 575, 219, 390, 984, 592, 236, 105, 942, 941,
                386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345,
                399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217,
                815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717,
                958, 609, 842, 451, 688, 753, 854, 685, 93, 857, 440, 380, 126, 721, 328, 753, 470, 743, 527};
        Arrays.sort(numbers);

        //Type 1
        for(int i = 0; i < numbers.length; i++){
            int lastNum = numbers[i];
            if(lastNum % 2 == 0 )
                System.out.println(lastNum + " Is an Even Number (for loop)");
            if(lastNum == 237){
                break;
            }
        }

        //Type 2
        int i = 0;
            while(i < numbers.length){

                int lastNum2 = numbers[i];
                if(lastNum2 == 237)
                    break;
                i++;
                System.out.println((lastNum2 % 2 == 0) ? lastNum2 + " Is an Even Numbers (ternary)":"");
                if(lastNum2 % 2 == 0) {
                    System.out.println(lastNum2 + " Is an Even Numbers (while loop)");
                }
            }
    }
}
