public class Car extends Vehicle {
    private int numberOfDoors;
    private String color;

    public Car(String make, String model, int year, int numberOfDoors, String color) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Color: " + color);
    }
}
