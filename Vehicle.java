public class Vehicle {
    private String brand;
    private double maxSpeed;

    public Vehicle(String brand, double maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void showInfo() {
        System.out.println("Este es un vehículo de " + brand + " con un tope de velocidad de " + maxSpeed + " km/h");
    }

}


class Car extends Vehicle {
    private int numberOfDoors;
    private String color;

    public Car(String brand, double maxSpeed, int numberOfDoors, String color) {
        super(brand, maxSpeed);
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Tiene " + numberOfDoors + " puertas y es de color " + color);
    }
}