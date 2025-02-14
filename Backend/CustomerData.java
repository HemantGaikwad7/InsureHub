/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author Hemant
 */
public class CustomerData {
    String cust_id;
    String  gender;
    String dob;

    public CustomerData(String cust_id, String gender, String dob) {
        this.cust_id = cust_id;
        this.gender = gender;
        this.dob = dob;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCust_id() {
        return cust_id;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }
}
