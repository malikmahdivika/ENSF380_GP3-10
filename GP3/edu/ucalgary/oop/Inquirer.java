package edu.ucalgary.oop;

public class Inquirer {
    private String firstName;
    private String lastName;
    private String info;
    private String servicePhone;

    /*Constructor*/
    public Inquirer(String fname, String lname, String sphone, String info) {
        this.firstName = fname;
        this.lastName = lname;
        this.servicePhone = sphone;
        this.info = info;

    }
    
    /*Getters*/
    public String getFirstName() {return this.firstName;}
    public String getLastName() {return this.lastName;}
    public String getInfo() {return this.info;}
    public String getServicesPhoneNum() {return this.servicePhone;}
}
