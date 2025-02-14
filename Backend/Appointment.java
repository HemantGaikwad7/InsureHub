/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author Hemant
 */
public class Appointment {

    public Appointment(String cust_id, String r, String date_of_app, String time) {
        
        this.cust_id = cust_id;
        this.r = r;
        this.date_of_app = date_of_app;
        this.time = time;
    }

    public String getCompany() {
        return company;
    }

    public String getCust_id() {
        return cust_id;
    }

    public String getR() {
        return r;
    }

    public String getDate_of_app() {
        return date_of_app;
    }

    public String getTime() {
        return time;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public void setR(String r) {
        this.r = r;
    }

    public void setDate_of_app(String date_of_app) {
        this.date_of_app = date_of_app;
    }

    public void setTime(String time) {
        this.time = time;
    }
    String company;
    String cust_id;
    String r;
    String date_of_app;
    String time;
}
