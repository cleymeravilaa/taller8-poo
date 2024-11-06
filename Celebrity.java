
// No es posible la multiherencia en java
public class Celebrity extends People , Manager {
    private String occupation;
    private String nationality;

    public Celebrity(String name, int age, String occupation, String nationality) {
        super(name, age);
        this.occupation = occupation;
        this.nationality = nationality;
    }

    // 
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Es un celebridad y su ocupación es " + occupation + " y su nacionalidad es " + nationality);
    }
}
