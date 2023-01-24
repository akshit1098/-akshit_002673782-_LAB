/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author akshitsaxena
 */
public class Address {
    String street;
    long apt;
    String city;
    long zip;
    
    public Address(){
        this.street = "";
        this.city = "";
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getApt() {
        return apt;
    }

    public void setApt(long apt) {
        this.apt = apt;
    }
 
}
