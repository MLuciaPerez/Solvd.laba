package Model;

import java.util.List;

public class Clinic {
    // Protected properties
    protected String name;
    protected String address;
    protected List<MedicalStaff> staff;
    protected List<Patient> patients;

    // Constructor
    public Clinic(String name, String address, List<MedicalStaff> staff, List<Patient> patients) {
        this.name = name;
        this.address = address;
        this.staff = staff;
        this.patients = patients;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<MedicalStaff> getStaff() {
        return staff;
    }

    public void setStaff(List<MedicalStaff> staff) {
        this.staff = staff;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

}