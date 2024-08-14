package Classes;

import Classes.Employee;

public class Receptionist extends Employee {
    private String deskNumber;

    // Constructor
    public Receptionist(String name, int age, String employeeId, String deskNumber) {
        super(name, age, employeeId);
        this.deskNumber = deskNumber;
    }

    // Getter and Setter
    public String getDeskNumber() {
        return deskNumber;
    }

    public void setDeskNumber(String deskNumber) {
        this.deskNumber = deskNumber;
    }
}