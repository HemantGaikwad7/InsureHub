/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author Hemant
 */
public class ClaimInfo {
    String cust_id;
    String reason;
    String detailed_desc;
    String company_name;

    public ClaimInfo(String cust_id, String reason, String detailed_desc, String company_name) {
        this.cust_id = cust_id;
        this.reason = reason;
        this.detailed_desc = detailed_desc;
        this.company_name = company_name;
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDetailed_desc() {
        return detailed_desc;
    }

    public void setDetailed_desc(String detailed_desc) {
        this.detailed_desc = detailed_desc;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
}
