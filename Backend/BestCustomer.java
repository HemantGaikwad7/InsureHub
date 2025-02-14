/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author Hemant
 */
public class BestCustomer {
    String cust_id;
    int counter;

    public BestCustomer(String cust_id, int counter) {
        this.cust_id = cust_id;
        this.counter = counter;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getCust_id() {
        return cust_id;
    }

    public int getCounter() {
        return counter;
    }
}
