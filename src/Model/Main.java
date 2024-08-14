package Model;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Doctor doctor = new Doctor("Celia Smith", 45, "D001", "Cardiology");
        MedicalStaff nurse = new Nurse("Nina Martin", 29, "N001", "Night");
        Billing billing = new Billing(null, 1500.00);

        // Create a list of medications
        ArrayList<Medication> medications = new ArrayList<>();
        medications.add(new Medication("Amoxicillin", "500mg"));
        medications.add(new Medication("Ibuprofen", "200mg"));

        // Instantiate a Patient object with the list of medications
        Patient patient = new Patient("Juan Gomez", 30, "P001", "Flu", billing, medications);

        // Example of method overriding
        System.out.println("Demonstrating method overriding");
        System.out.println("Doctor's Name: " + doctor.getName());
        System.out.println("Doctor's Employee ID: " + doctor.getEmployeeId());

        // Link the Billing object back to the patient
        billing.setPatient(patient);

        // Instantiate Clinic with staff and patients
        List<MedicalStaff> staff = new ArrayList<>();
        staff.add(doctor);
        staff.add(nurse);

        List<Patient> patients = new ArrayList<>();
        patients.add(patient);

        Clinic clinic = new Clinic("Healthy Life Clinic", "123 Wellness Blvd", staff, patients);

        // Example of method overloading
        System.out.println("\n");
        System.out.println("Doctor prescribing medication without specifics:");
        ((Doctor) doctor).prescribeMedication();

        System.out.println("Doctor prescribing specific medication:");
        ((Doctor) doctor).prescribeMedication("Amoxicillin");

        System.out.println("Doctor prescribing specific medication with dosage:");
        ((Doctor) doctor).prescribeMedication("Amoxicillin", "500mg");

        System.out.println("\n");
        System.out.println("Displaying patient's medications and billing");
        // Display the patient's medications
        System.out.println("Medications for " + patient.getName() + ":");
        for (Medication med : patient.getMedications()) {
            System.out.println("- " + med.getName() + " " + med.getDosage());
        }

        // Display the patient's bill
        System.out.println("Patient's Bill: $" + patient.getBilling().getAmount());


        // Perform duties
        System.out.println("\nDoctor performing duties:");
        doctor.performDuties();

        System.out.println("Nurse performing duties:");
        nurse.performDuties();


        // Display overridden toString(), hashCode(), and equals() methods for patient
        System.out.println("\nDisplaying patient's toString() method:");
        System.out.println(patient.toString());

        System.out.println("\nDisplaying patient's hashCode():");
        System.out.println("HashCode: " + patient.hashCode());

        System.out.println("\nComparing patient with another Patient object:");
        System.out.println("Equals: " + patient.equals(new Patient("Juan Gomez", 30, "P001", "Flu", billing, medications)));
    }
    }