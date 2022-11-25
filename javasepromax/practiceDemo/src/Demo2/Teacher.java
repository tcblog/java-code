package Demo2;


public class Teacher extends People {

    private String employeeNumber;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Teacher(String name, int age, String employeeNumber) {
        super(name, age);
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void write(){
        System.out.println("I am writing article");
    }

    @Override
    public void talk() {
        System.out.println("I am talking with my students,Teacher");
    }
}
