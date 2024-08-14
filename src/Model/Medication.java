package Model;

import java.util.Objects;

public class Medication {
    private String name;
    private String dosage;

    // Constructor
    public Medication(String name, String dosage) {
        this.name = name;
        this.dosage = dosage;
    }

    // Overriding Object methods
    @Override
    public String toString() {
        return "Model.Medication{Name='" + name + "', Dosage='" + dosage + "'}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dosage);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Medication medication = (Medication) obj;
        return Objects.equals(name, medication.name) &&
                Objects.equals(dosage, medication.dosage);
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