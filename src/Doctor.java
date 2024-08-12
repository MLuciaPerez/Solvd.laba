public class Doctor extends Employee {
    private String specialization;

    // Constructor
    public Doctor(String name, int age, String employeeId, String specialization) {
        super(name, age, employeeId);
        this.specialization = specialization;
    }

    // Getter and Setter
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Overriding the getName method from Employee class
    @Override
    public String getName() {
        return "Employee Name: " + super.getName() + " (Specialization: " + specialization + ")";
    }

    // Overriding the getEmployeeId method from Employee class
    @Override
    public String getEmployeeId() {
        return "Doctor ID: " + super.getEmployeeId();
    }

    // Overloading Example
    public void prescribeMedication() {
        System.out.println("Prescribing medication.");
    }

    public void prescribeMedication(String medication) {
        System.out.println("Prescribing: " + medication);
    }

    public void prescribeMedication(String medication, String dosage) {
        System.out.println("Prescribing: " + medication + " with dosage: " + dosage);
    }
}