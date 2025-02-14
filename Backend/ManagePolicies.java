/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author Hemant
 */
public class ManagePolicies {
    
    
    
    
    
               String cust_id;
               String cus;
               String LastName;
               String sDate;
               String tobacco;
               String preg_child;
               String chronic;
               String annual;
               String height;
               String weight;
               String premium;
               String sales_id ;

    public ManagePolicies(String cust_id, String cus, String LastName, String sDate, String tobacco, String preg_child, String chronic, String annual, String height, String weight, String premium, String sales_id) {
        this.cust_id = cust_id;
        this.cus = cus;
        this.LastName = LastName;
        this.sDate = sDate;
        this.tobacco = tobacco;
        this.preg_child = preg_child;
        this.chronic = chronic;
        this.annual = annual;
        this.height = height;
        this.weight = weight;
        this.premium = premium;
        this.sales_id = sales_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public void setCus(String cus) {
        this.cus = cus;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }

    public void setTobacco(String tobacco) {
        this.tobacco = tobacco;
    }

    public void setPreg_child(String preg_child) {
        this.preg_child = preg_child;
    }

    public void setChronic(String chronic) {
        this.chronic = chronic;
    }

    public void setAnnual(String annual) {
        this.annual = annual;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public void setSales_id(String sales_id) {
        this.sales_id = sales_id;
    }

    public String getCust_id() {
        return cust_id;
    }

    public String getCus() {
        return cus;
    }

    public String getLastName() {
        return LastName;
    }

    public String getsDate() {
        return sDate;
    }

    public String getTobacco() {
        return tobacco;
    }

    public String getPreg_child() {
        return preg_child;
    }

    public String getChronic() {
        return chronic;
    }

    public String getAnnual() {
        return annual;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getPremium() {
        return premium;
    }

    public String getSales_id() {
        return sales_id;
    }
               
              
}
