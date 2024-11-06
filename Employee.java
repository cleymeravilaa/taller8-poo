public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println("El empleado es " + name + " y su salario es " + salary);
    }

}

class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Su departamento es " + department);
    }
}
