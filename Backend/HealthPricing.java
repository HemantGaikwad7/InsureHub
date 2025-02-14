/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author Hemant
 */
public class HealthPricing {
    int base_premium;
    int tobacco_no;
    int tobacco_yes;
    int child_no;
    int child_yes;
    int cancer;
    int heart_patient;
    int AIDS_HIV;
    int renal_kidney_failure;
    int bipolar_disorder;

    public HealthPricing(int base_premium, int tobacco_no, int tobacco_yes, int child_no, int child_yes, int cancer, int heart_patient, int AIDS_HIV, int renal_kidney_failure, int bipolar_disorder) {
        this.base_premium = base_premium;
        this.tobacco_no = tobacco_no;
        this.tobacco_yes = tobacco_yes;
        this.child_no = child_no;
        this.child_yes = child_yes;
        this.cancer = cancer;
        this.heart_patient = heart_patient;
        this.AIDS_HIV = AIDS_HIV;
        this.renal_kidney_failure = renal_kidney_failure;
        this.bipolar_disorder = bipolar_disorder;
    }

    public void setBase_premium(int base_premium) {
        this.base_premium = base_premium;
    }

    public void setTobacco_no(int tobacco_no) {
        this.tobacco_no = tobacco_no;
    }

    public void setTobacco_yes(int tobacco_yes) {
        this.tobacco_yes = tobacco_yes;
    }

    public void setChild_no(int child_no) {
        this.child_no = child_no;
    }

    public void setChild_yes(int child_yes) {
        this.child_yes = child_yes;
    }

    public void setCancer(int cancer) {
        this.cancer = cancer;
    }

    public void setHeart_patient(int heart_patient) {
        this.heart_patient = heart_patient;
    }

    public void setAIDS_HIV(int AIDS_HIV) {
        this.AIDS_HIV = AIDS_HIV;
    }

    public void setRenal_kidney_failure(int renal_kidney_failure) {
        this.renal_kidney_failure = renal_kidney_failure;
    }

    public void setBipolar_disorder(int bipolar_disorder) {
        this.bipolar_disorder = bipolar_disorder;
    }

    public int getBase_premium() {
        return base_premium;
    }

    public int getTobacco_no() {
        return tobacco_no;
    }

    public int getTobacco_yes() {
        return tobacco_yes;
    }

    public int getChild_no() {
        return child_no;
    }

    public int getChild_yes() {
        return child_yes;
    }

    public int getCancer() {
        return cancer;
    }

    public int getHeart_patient() {
        return heart_patient;
    }

    public int getAIDS_HIV() {
        return AIDS_HIV;
    }

    public int getRenal_kidney_failure() {
        return renal_kidney_failure;
    }

    public int getBipolar_disorder() {
        return bipolar_disorder;
    }
}
