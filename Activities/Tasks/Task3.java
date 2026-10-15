package Activities.Tasks;

public class Task3 {
    public static void main(String[] args) {
    String a = new String("Wow");
    String b = "Wow";
    String c = a;
    String d = c;

    Boolean b1 = ! (a == b);
    Boolean b2 = d.equals(b);
    Boolean b3 = c.equals(a);

    if (b1 && b2 && b3) {
        System.out.println("Success!");
    }
    }
}
/**
String a =  new String("Wow");
String b =  "Wow";
String c = a;
String d = c;

Boolean b1 = a == b;                  "False"         
Boolean b2 = d.equals(b+"!"); 
Boolean b3 = !c.equals(a);

if(b1 && b2 && b3){                 "so b1 is false it will immediately skip the if statement and not print" 
System.out.println("Success!");
}
 */