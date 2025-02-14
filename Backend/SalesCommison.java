/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author Hemant
 */
public class SalesCommison {
    String cust_id;
    String sales_id;
    int premium;
    public SalesCommison(String cust_id, String sales_id, int premium) {
        this.cust_id = cust_id;
        this.sales_id = sales_id;
        this.premium = premium;
    }
    

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public void setSales_id(String sales_id) {
        this.sales_id = sales_id;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public String getCust_id() {
        return cust_id;
    }

    public String getSales_id() {
        return sales_id;
    }

    public int getPremium() {
        return premium;
    }
}
