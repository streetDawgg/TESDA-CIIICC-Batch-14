package Activities.Task2;

public class Task2 {

    public static void main(String[] args) {
    char clh = 'H';
    char slw = 'w';
    char slr = 'r';
    char sld = 'd';

    short  e = 3;
    int l = 1;  
    byte zero = 0;
    float point = 2.0f;

    boolean tru = true;

    String output = "W" + zero + "w"; 

    String output1 = " " + clh + e + l + l + zero;
    String output2 = " " + slw + zero + slr + l + sld;
    String output3 = " " + point + " " + tru;

    String whole = " " + clh + e + l + l + zero + " " + slw + zero + slr + l + sld + " " + point + " " + tru;

    System.out.println(output1+output2+output3);
    System.out.print(output +" "+ whole);  
    }

}
