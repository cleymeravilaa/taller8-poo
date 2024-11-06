public class Test {
    public static void main(String[] args) {
        People person = new Student("Juan", 20, "123456");
        person.showInfo();

        Vehicle vehicle = new Car("Audi", 200, 4, "Blanco");
        vehicle.showInfo();

        Employee employee = new Manager("Juan", 10000, "IT");
        employee.showInfo();
    }
}
