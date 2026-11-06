package Activities.Tasks;

public class Task13 {
    static void main() {
        Car car1 = new Car("Mercedes-Benz", "SLR", 2002, 2);
        Car car2 = new Car("Lamborghini", "LP650 Aventador",2006, 2);
        Car car3 = new Car("Toyota", "Camry", 2022, 4);

        System.out.println("Car 1: ");
        System.out.println(car1 + "\n");
        System.out.println("Car 2:");
        System.out.println(car2 + "\n");
        System.out.println("Car 3:");
        System.out.println(car3 + "\n");
    }
}
class Vehicle{
     public String make;
     public String model;
     public int year;

    public Vehicle(String make,
                String model,
                int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

}

class Car extends Vehicle{
    private int numberOfDoors;
    public Car(String make,
               String model,
               int year,
               int numberOfDoors){
        super(make,model,year);
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public String toString(){
        return "Car Details: \n" +
                "Make: \"" + make + "\"\n" +
                "Model: \"" + model + "\"\n" +
                "Year: " + year + "\n" +
                "Number of Doors:" + numberOfDoors;
    }
}
