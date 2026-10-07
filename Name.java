public class Name {
    String first;
    String last;
    String full;
public static void main(String[] args) {
    Name Mother = new Name();
    Mother.first = "Jumbo";
    Mother.last = "Hatdog";
    Mother.full = Mother.first +" "+ Mother.last; 
    System.out.println(Mother.full);
}
}
public void eatMore(boolean hungry, int amountOfFood){
    int roomInBelly = 5;
    if(hungry){
        boolean timeToEat = true;
        while (amountOfFood > 0){
            int amountEaten = 2;
            roomInBelly = roomInBelly - amountEaten;
            amountOfFood = amountOfFood - amountEaten; 
        }
    }
    System.out.println(amountOfFood);
}
