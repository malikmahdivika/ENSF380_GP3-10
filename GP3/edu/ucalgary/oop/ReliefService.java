package edu.ucalgary.oop;

public class ReliefService {
    //-----------------------------------------------------------------------------------------------
    // LOCAL VARIABLES
    //-----------------------------------------------------------------------------------------------
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private Location lastKnownLocation;

    //-----------------------------------------------------------------------------------------------
    // PUBLIC FUNCTIONS
    //-----------------------------------------------------------------------------------------------
    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, 
                         Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.lastKnownLocation = lastKnownLocation;
    }
    
    public Inquirer getInquirer() {
        return this.inquirer;
    }
    
    public DisasterVictim getMissingPerson() {
        return this.missingPerson;
    }
    
    public String getDateOfInquiry() {
        return this.dateOfInquiry;
    }
    
    public Location getLastKnownLocation() {
        return this.lastKnownLocation;
    }

    public void setDateOfInquiry(String date) throws IllegalArgumentException {
        try {
            LocalDate.parse(date);
            this.dateOfInquiry = date;
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid Format. Provide the date in the format 'YYYY-MM-DD'.");
        }
    }
    
    public void setLastKnownLocation(Location location) {
        this.lastKnownLocation = location;
    }
    
    public void setInfoProvided(String info) {
        this.inquirer.setInfoProvided(info);
    }
    
    public String getLogDetails() {
        return "Inquirer: " + this.inquirer.getFirstName() + ", Missing Person: " + this.missingPerson.getName() + ", " +
                "Date of Inquiry: " + this.dateOfInquiry + ", Info Provided: " + this.inquirer.getInfoProvided() + ", " +
                "Last Known Location: " + this.lastKnownLocation.getName();
    }
    
}
