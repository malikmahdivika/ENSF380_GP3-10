package edu.ucalgary.oop;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;


public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private ArrayList<MedicalRecord> medicalRecords;
    private ArrayList<FamilyRelation> familyConnection;
    private String entryDate;
    private ArrayList<Supply> personalBelongings;
    private String gender;
    private static int counter; 

    public DisasterVictim(String fName, String eDate){
        this.firstName = fName;
        this.entryDate = eDate;
    }

    /*Setters*/
    public void setFirstName(String fname) {this.firstName = fname;}
    public void setLastName(String lname) {this.lastName = lname;}
    
    public void setDateOfBirth(String DOB) {
        try {
            LocalDate.parse(DOB);
            this.dateOfBirth = DOB;
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid Format. Provide the date in the format 'YYYY-MM-DD'.");
        }
    }

    public void setComments(String comments) {this.comments = comments;}
    public void setMedicalRecords(ArrayList<MedicalRecord> medicalRecords) {this.medicalRecords = medicalRecords;}
    public void setPersonalBelongings(ArrayList<Supply> supplies) {this.personalBelongings = supplies;}
    public void setFamilyConnections(ArrayList<FamilyRelation> relation) {this.familyConnection = relation;}
    public void setGender(String gender) {this.gender = gender;}

    /*Getters*/
    public String getFirstName() {return this.firstName;}
    public String getLirstName() {return this.lastName;}
    public String getDateOfBirth() {return this.dateOfBirth;}
    public String getComments() {return this.comments;}
    public ArrayList<MedicalRecord> getMedicalRecords() {return this.medicalRecords;}
    public String getEntryDate() {return this.entryDate;}
    public int getAssignedSocialID() {return this.ASSIGNED_SOCIAL_ID;}
    public ArrayList<Supply> getPersonalBelongings() {return this.personalBelongings;}
    public ArrayList<FamilyRelation> getFamilyConnections() {return this.familyConnection;}
    public String getGender() {return this.gender;}

    /*Add to ArrayList*/
    public void addPersonalBelongings(Supply supply) {
        this.personalBelongings.add(supply);
    }

    public void addFamilyConnection(FamilyRelation familyConnection) {
        this.familyConnection.add(familyConnection);
    }

    public void addMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecords.add(medicalRecord);
    }

    /*Remove from ArrayList*/
    public void removePersonalBelongings(Supply supply) {
        this.personalBelongings.remove(supply);
    }

    public void removeFamilyConnection(FamilyRelation familyConnection) {
        this.familyConnection.remove(familyConnection);
    }
}
