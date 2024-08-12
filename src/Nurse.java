public class Nurse extends Employee {
    private String shift;

    // Constructor
    public Nurse(String name, int age, String employeeId, String shift) {
        super(name, age, employeeId);
        this.shift = shift;
    }

    // Getter and Setter
    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}