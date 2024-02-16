package edu.ucalgary.oop;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private LocalDate dateOfTreatment;

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
            this.dateOfTreatment = LocalDate.parse(date);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid Format. Provide the date in the format 'YYYY-MM-DD'.");
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid Format. Provide the date in the format 'YYYY-MM-DD'.");
        }
    }

    /* Getters */
    public Location getLocation() {return this.location;}

    public String getTreatmentDetails() {return this.treatmentDetails;}

    public LocalDate getDateOfTreatment() {return this.dateOfTreatment;}
}