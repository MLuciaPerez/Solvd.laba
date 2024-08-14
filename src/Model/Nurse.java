package Model;

public class Nurse extends MedicalStaff {
    private String shift;

    // Constructor
    public Nurse(String name, int age, String employeeId, String shift) {
        super(name, age, employeeId, "Nursing");
        this.shift = shift;
    }

    @Override
    public void performDuties() {
        System.out.println("Nurse " + getName() + " is caring for patients.");
    }

    // Getter and Setter
    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}