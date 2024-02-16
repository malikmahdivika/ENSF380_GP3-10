package edu.ucalgary.oop;
import java.time.LocalDate;
public class ReliefService {
    //--------------------------------------------------------------------------------
    //                               LOCAL VARIABLES
    //--------------------------------------------------------------------------------
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    
    //--------------------------------------------------------------------------------
    //                               FUNCTIONS
    //--------------------------------------------------------------------------------
    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, 
                         Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    public Inquirer getInquirer() {
        return this.inquirer;
    }

    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }

    public DisasterVictim getMissingPerson() {
        return this.missingPerson;
    }

    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }

    public String getDateOfInquiry() {
        return this.dateOfInquiry;
    }

    public void setDateOfInquiry(String dateOfInquiry) throws IllegalArgumentException {
        try {
            LocalDate.parse(dateOfInquiry);
            this.dateOfInquiry = dateOfInquiry;
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid date format");
        }
        
    }

    public String getInfoProvided() {
        return this.infoProvided;
    }

    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }

    public Location getLastKnownLocation() {
        return this.lastKnownLocation;
    }

    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    public String getLogDetails() {
        return "Inquirer: " + this.inquirer.getFirstName() + ", Missing Person: " + this.missingPerson.getFirstName() + 
                this.missingPerson.getLastName()+ ", " +
                "Date of Inquiry: " + this.dateOfInquiry + ", Info Provided: " + this.infoProvided + ", " +
                "Last Known Location: " + this.lastKnownLocation.getName();
    }
}
