package edu.ucalgary.oop;

import java.util.ArrayList;

public class Location {
    private String name;
    private String address;
    private ArrayList<DisasterVictim> occupants;
    private ArrayList<Supply> supplies;

    /*Constructor*/
    public Location(String name, String address) {
        this.name = name;
        this.address = address;
    } 

    /*Setters*/
    public void setName(String name) {this.name = name;}
    public void setAddress(String address) {this.address = address;}
    public void setOccupants(ArrayList<DisasterVictim> occupants) {this.occupants = occupants;}
    public void setSupplies(ArrayList<Supply> supplies) {this.supplies = supplies;}

    /*Getters*/
    public String getName() {return this.name;}
    public String getAddress() {return this.address;}
    public ArrayList<DisasterVictim> getOccupants() {return this.occupants;}
    public ArrayList<Supply> getSupplies() {return this.supplies;}

    /*Add to ArrayList*/
    public void addOccupant(DisasterVictim occupant) {
        this.occupants.add(occupant);
    }

    public void addSupply(Supply supply){
        this.supplies.add(supply);
    }

    /*Remove from ArrayList*/
    public void removeOccupant(DisasterVictim occupant) {
        this.occupants.remove(occupant);
    }

    public void removeSupply(Supply supply){
        this.supplies.remove(supply);
    }
}
