/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author Hemant
 */
public class SalesAgent {
    String salesagent_id ; 
    String fname;
    String lname;
    String street_address;
    String state;
    String city;
    String zip_code;
    String gender;
    String dob;
    String phone;
    String email;

    public String getSalesagent_id() {
        return salesagent_id;
    }

    public void setSalesagent_id(String salesagent_id) {
        this.salesagent_id = salesagent_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SalesAgent(String salesagent_id, String fname, String lname, String street_address, String state, String city, String zip_code, String phone) {
        this.salesagent_id = salesagent_id;
        this.fname = fname;
        this.lname = lname;
        this.street_address = street_address;
        this.state = state;
        this.city = city;
        this.zip_code = zip_code;
        this.phone = phone;
    }
    
    
    
}
