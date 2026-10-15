package Activities.Tasks;

public class Task4{
    public static void main(String[] args) {
        String input1 = "kayak"; // is palindrome
        String input2 = "hello"; // not palindrome
        String input3 = "racecar"; // is palindrome

        checkPalindrome(input1);
        checkPalindrome(input2);
        checkPalindrome(input3);
    }
    public static void checkPalindrome(String input) {
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();

        if (input.equals(reversed)) {
            System.out.println(input + " The input string is palindrome");
        } else {    
            System.out.println(input + " The input string is not a palindrome");
        }
    }

}

/* construction worker
public class Task4{
    public static void main(String[] args) {
        String input1 = "kayak"; // is palindrome
        String input2 = "hello"; // not palindrome
        String input3 = "racecar"; // is palindrome

        class CheckPalindrome {
            public CheckPalindrome(String input) {
                StringBuilder sb = new StringBuilder(input);
                String reversed = sb.reverse().toString();

                if (input.equals(reversed)) {
                    System.out.println(input + " The input string is palindrome");
                } else {
                    System.out.println(input + " The input string is not a palindrome");
                }
            }
        }
        new CheckPalindrome(input1);
        new CheckPalindrome(input2);
        new CheckPalindrome(input3);
    }

}
*/