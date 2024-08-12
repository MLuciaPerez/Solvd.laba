import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create objects for Doctor and Billing
        Doctor doctor = new Doctor("Dr. Smith", 45, "D001", "Cardiology");
        Billing billing = new Billing(null, 1500.00);

        // Create a list of medications
        List<Medication> medications = new ArrayList<>();
        medications.add(new Medication("Amoxicillin", "500mg"));
        medications.add(new Medication("Ibuprofen", "200mg"));

        // Instantiate a Patient object with the list of medications
        Patient patient = new Patient("Juan Gomez", 30, "P001", "Flu", billing, medications);

        // Example of method overriding
        System.out.println(doctor.getName()); // Output: Employee Name: Dr. Smith (Specialization: Cardiology)
        System.out.println(doctor.getEmployeeId()); // Output: Doctor ID: D001

        // Example of method overloading
        doctor.prescribeMedication(); // Calls method without parameters
        doctor.prescribeMedication("Amoxicillin"); // Calls overloaded method with one parameter
        doctor.prescribeMedication("Amoxicillin", "500mg"); // Calls overloaded method with two parameters

        // Display the patient's medications
        System.out.println("Medications for " + patient.getName() + ":");
        for (Medication med : patient.getMedications()) {
            System.out.println("- " + med.getName() + " " + med.getDosage());
        }

        // Display the patient's bill
        System.out.println("Patient's Bill: $" + patient.getBilling().getAmount());
    }
}