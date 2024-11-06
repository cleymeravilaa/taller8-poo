public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("El nombre es " + name + " y tiene " + age + " años");
    }
}

class Student extends People {
    private String registration;

    public Student(String name, int age, String registration) {
        super(name, age);
        this.registration = registration;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("La matricula del estudiante es " + registration);
    }
}
