/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author Hemant
 */
public class Commission {

    public Commission(String sales_id,int commission) {
        this.commission = commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public String getSales_id() {
        return sales_id;
    }

    public int getCommission() {
        return commission;
    }
    int commission;

    public void setSales_id(String sales_id) {
        this.sales_id = sales_id;
    }
    String sales_id;
}
