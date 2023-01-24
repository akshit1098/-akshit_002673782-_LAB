/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author akshitsaxena
 */
public class Person {
    private String nuid;
    private String fname;
    private String lname;
    private String cname;
    Address address;
    Address permanentAddress;
    Contact personalContact;
    Contact officialContact;
    
    public Person(){
        this.fname = "";
        this.lname = "";
        this.nuid = "";
        this.cname = "";
        
        this.address = new Address();
        this.permanentAddress = new Address();
        
        this.personalContact = new Contact();
        this.officialContact = new Contact();
        
    }

    public String getNuid() {
        return nuid;
    }

    public void setNuid(String nuid) {
        this.nuid = nuid;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Address getAddress() {
        return address;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public Contact getPersonalContact() {
        return personalContact;
    }

    public Contact getOfficialContact() {
        return officialContact;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public void setPersonalContact(Contact personalContact) {
        this.personalContact = personalContact;
    }

    public void setOfficialContact(Contact officialContact) {
        this.officialContact = officialContact;
    }
}
