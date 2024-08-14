package Model;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    // Protected properties
    protected String name;
    protected String address;
    protected ArrayList<MedicalStaff> staff;
    protected ArrayList<Patient> patients;

    // Constructor
    public Clinic(String name, String address, ArrayList<MedicalStaff> staff, ArrayList<Patient> patients) {
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

    public ArrayList<MedicalStaff> getStaff() {
        return staff;
    }

    public void setStaff(ArrayList<MedicalStaff> staff) {
        this.staff = staff;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

}