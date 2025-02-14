/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author Hemant
 */
public class SalesPie {
    String sales_id;
    int comm;

    public SalesPie(String sales_id, int comm) {
        this.sales_id = sales_id;
        this.comm = comm;
    }

    public String getSales_id() {
        return sales_id;
    }

    public int getComm() {
        return comm;
    }

    public void setSales_id(String sales_id) {
        this.sales_id = sales_id;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }
    
}
