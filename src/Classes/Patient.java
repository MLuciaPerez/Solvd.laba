package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Patient extends Person {
    protected String patientId; // protected modifier
    protected String ailment; // protected modifier
    private Billing billing;
    private ArrayList<Medication> medications; // Assuming a patient can have multiple medications

    // Constructor
    public Patient(String name, int age, String patientId, String ailment, Billing billing, ArrayList<Medication> medications) {
        super(name, age);
        this.patientId = patientId;
        this.ailment = ailment;
        this.billing = billing;
        this.medications = medications;
    }

    // Overriding Object methods
    @Override
    public String toString() {
        return "Patients name= " + getName() + ", Ailment= " + ailment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), patientId, ailment);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Patient patient = (Patient) obj;
        return Objects.equals(getName(), patient.getName()) &&
                Objects.equals(patientId, patient.patientId) &&
                Objects.equals(ailment, patient.ailment);
    }

    // Getters and Setters
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public List<Medication> getMedications() {
        return medications;
    }

    public void setMedications(ArrayList<Medication> medications) {
        this.medications = medications;
    }
}