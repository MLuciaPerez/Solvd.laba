package Model;

public class Billing {
    private Patient patient;
    private double amount;

    // Constructor
    public Billing(Patient patient, double amount) {
        this.patient = patient;
        this.amount = amount;
    }

    // Getters and Setters
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}