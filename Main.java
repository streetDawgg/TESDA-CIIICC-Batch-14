
public class Main {
        String greet;
    Main(String greet){
            this.greet = greet;
        }
   public static void main(String[] args) {
        Main Eng = new Main("Hello World");
        Main Fil = new Main("Kamusta Mundo");
        Main Due = new Main("Guten Tag, Hallo");

        System.out.println(Eng.greet);
        System.out.println(Fil.greet);
        System.out.println(Due.greet);
    }
}