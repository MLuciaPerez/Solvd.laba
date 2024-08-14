package Model;

public class Employee extends Person {
    private String employeeId;

    // Constructor
    public Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    // Getter and Setter
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // Method Overriding Example
    @Override
    public String getName() {
        return  super.getName();
    }
}