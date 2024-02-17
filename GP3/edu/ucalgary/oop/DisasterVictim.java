package edu.ucalgary.oop;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnection;
    private String entryDate;
    private Supply[] personalBelongings;
    private String gender; 
    private static int counter = 0;

    public DisasterVictim(String fName, String eDate){
        this.ASSIGNED_SOCIAL_ID = counter++;
        this.firstName = fName;
        try {
            LocalDate.parse(eDate);
            this.entryDate = eDate;
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid Format. Provide the date in the format 'YYYY-MM-DD'.");
        }
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
    public void setMedicalRecords(MedicalRecord[] medicalRecords) {this.medicalRecords = medicalRecords;}
    public void setPersonalBelongings(Supply[] supplies) {this.personalBelongings = supplies;}
    public void setFamilyConnections(FamilyRelation[] relation) {this.familyConnection = relation;}
    public void setGender(String gender) {this.gender = gender;}

    /*Getters*/
    public String getFirstName() {return this.firstName;}
    public String getLastName() {return this.lastName;}
    public String getDateOfBirth() {return this.dateOfBirth;}
    public String getComments() {return this.comments;}
    public MedicalRecord[] getMedicalRecords() {return this.medicalRecords;}
    public String getEntryDate() {return this.entryDate;}
    public int getAssignedSocialID() {return this.ASSIGNED_SOCIAL_ID;}
    public Supply[] getPersonalBelongings() {return this.personalBelongings;}
    public FamilyRelation[] getFamilyConnections() {return this.familyConnection;}
    public String getGender() {return this.gender;}

    /*Add to ArrayList*/
    public void addPersonalBelonging(Supply newSupply) {
        if (counter == personalBelongings.length) {
            personalBelongings = Arrays.copyOf(personalBelongings, personalBelongings.length * 2);
        }
        personalBelongings[counter] = newSupply;
        counter++;
    }

    public void addFamilyConnection(FamilyRelation newConnection) {
        FamilyRelation[] newArray = new FamilyRelation[familyConnection.length + 1];
        System.arraycopy(familyConnection, 0, newArray, 0, familyConnection.length);
        newArray[familyConnection.length] = newConnection;
        familyConnection = newArray;
    }

    public void addMedicalRecord(MedicalRecord newRecord) {
        if (medicalRecords == null) {
            medicalRecords = new MedicalRecord[1];
        } else {
            medicalRecords = Arrays.copyOf(medicalRecords, medicalRecords.length + 1);
        }
        medicalRecords[medicalRecords.length - 1] = newRecord;
    }

    /*Remove from ArrayList*/
    public void removePersonalBelonging(Supply supply) {
        int indexToRemove = -1;
        for (int i = 0; i < personalBelongings.length; i++) {
            if (supply.equals(personalBelongings[i])) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < personalBelongings.length - 1; i++) {
                personalBelongings[i] = personalBelongings[i + 1];
            }
            personalBelongings[personalBelongings.length - 1] = null;
        }
    }

    public void removeFamilyConnection(FamilyRelation connectionToRemove) {
        int indexToRemove = -1;
        for (int i = 0; i < familyConnection.length; i++) {
            if (connectionToRemove.equals(familyConnection[i])) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < familyConnection.length - 1; i++) {
                familyConnection[i] = familyConnection[i + 1];
            }
            familyConnection[familyConnection.length - 1] = null;
        }
    }
    }
    
