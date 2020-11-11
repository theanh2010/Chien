package CaseStudy.models;

public class Employee {
    private String name;
    private String dateOfBirth;
    private int cmnd;
    private int numPhone;
    private String email;
    private String address;
    private String level;
    private String position;
    private double salary;

    public  Employee(){}

    public Employee(String name, String dateOfBirth,String address, int cmnd, int numPhone, String email, String level, String position, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.cmnd = cmnd;
        this.numPhone = numPhone;
        this.email = email;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, String dateOfBirth,String address ) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(int numPhone) {
        this.numPhone = numPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return " Name Employee : " + name + "\n" +
                " Age Employee : " + dateOfBirth + "\n" +
                " Address Employee : " + address + "\n"+
                "-------------------------------------------------";
    }
}
