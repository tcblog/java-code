package demo1;

public class Teacher extends Person implements Perform{
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

    @Override
    public String reward() {
        return "优秀班主任";
    }

    @Override
    public String punish() {
        return "被投诉一次";
    }
}
