package Classes;

import java.util.Objects;

public class Doctor extends MedicalStaff {
    private String specialization;

    // Constructor
    public Doctor(String name, int age, String employeeId, String specialization) {
        super(name, age, employeeId, "Medical");
        this.specialization = specialization;
    }

    // Getter and Setter
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Overriding the abstract method
    @Override
    public void performDuties() {
        System.out.println("Doctor " + getName() + " is diagnosing patients.");
    }

    // Overriding Object methods
    @Override
    public String toString() {
        return "Doctor{Name='" + getName() + "', Specialization='" + specialization + "'}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), specialization);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Doctor doctor = (Doctor) obj;
        return Objects.equals(getName(), doctor.getName()) &&
                Objects.equals(specialization, doctor.specialization);
    }

    // Overriding the getName method from Classes.Employee class
    @Override
    public String getName() {
        return  super.getName() + " (Specialization: " + specialization + ")";
    }

    // Overriding the getEmployeeId method from Classes.Employee class
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