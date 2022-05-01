public class Bike extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.honk();
        System.out.println(myBike.brand + " " + myBike.modelName);
    }
}

class Vehicle {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}
