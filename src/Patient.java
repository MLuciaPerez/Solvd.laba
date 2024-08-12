import java.util.List;

public class Patient extends Person {
    private String patientId;
    private String ailment;
    private Billing billing;
    private List<Medication> medications; // Assuming a patient can have multiple medications

    // Constructor
    public Patient(String name, int age, String patientId, String ailment, Billing billing, List<Medication> medications) {
        super(name, age);
        this.patientId = patientId;
        this.ailment = ailment;
        this.billing = billing;
        this.medications = medications;
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

    public void setMedications(List<Medication> medications) {
        this.medications = medications;
    }
}