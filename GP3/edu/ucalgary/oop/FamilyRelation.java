package edu.ucalgary.oop;

public class FamilyRelation {
    private DisasterVictim personOne;
    private DisasterVictim personTwo;
    private String relationshipTo;

    public FamilyRelation(DisasterVictim p_one, String relationship, DisasterVictim p_two){
        this.personOne = p_one;
        this.relationshipTo = relationship;
        this.personTwo = p_two;
    }

    /*Setters*/
    public void setPersonOne(DisasterVictim p_one) {this.personOne = p_one;}
    public void setRelationshipTo(String relationship) {this.relationshipTo = relationship;}
    public void setPersonTwo(DisasterVictim p_two) {this.personTwo = p_two;}

    /*Getters*/
    public DisasterVictim getPersonOne() {return this.personOne;}
    public String getRelationshipTo() {return this.relationshipTo;}
    public DisasterVictim getPersonTwo() {return this.personTwo;}
}
