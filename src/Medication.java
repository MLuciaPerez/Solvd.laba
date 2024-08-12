public class Medication {
    private String name;
    private String dosage;

    // Constructor
    public Medication(String name, String dosage) {
        this.name = name;
        this.dosage = dosage;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}