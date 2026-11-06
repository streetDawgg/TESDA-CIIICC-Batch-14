package Activities.Tasks;

public class Task13 {
    static void main() {
        Vehicle car1 = new Car("Mercedes-Benz", "SLR", 2002, 2);
        Vehicle car2 = new Car("Lamborghini", "LP650 Aventador",2006, 2);
        Car car3 = new Car("Toyota", "Camry", 2022, 4);
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
        return "Car Details: \n " +
                "Make: \"" + make + "\"\n" +
                "Model: \"" + model + "\"\n" +
                "Year: " + year + "\n" +
                "Number of Doors:" + numberOfDoors;
    }
}
