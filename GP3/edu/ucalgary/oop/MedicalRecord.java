package edu.ucalgary.oop;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment){
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        setDateOfTreatment(dateOfTreatment); 
    }

    /* Setters */
    public void setLocation(Location location) {
        this.location = location;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public void setDateOfTreatment(String date) throws IllegalArgumentException {
        try {
            LocalDate.parse(date);
            this.dateOfTreatment = date;
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid Format. Provide the date in the format 'YYYY-MM-DD'.");
        }
    }

    /* Getters */
    public Location getLocation() {return this.location;}

    public String getTreatmentDetails() {return this.treatmentDetails;}

    public String getDateOfTreatment() {return this.dateOfTreatment;}
}