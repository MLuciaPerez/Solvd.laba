package Model;

abstract class MedicalStaff extends Employee {
    protected String department;

    // Constructor
    public MedicalStaff(String name, int age, String employeeId, String department) {
        super(name, age, employeeId);
        this.department = department;
    }

    // Abstract method
    public abstract void performDuties();

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}