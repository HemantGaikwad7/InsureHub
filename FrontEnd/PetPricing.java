package FrontEnd;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Hemant
 */
public class PetPricing {
    int base_premium;
    int pet_dog;
    int pet_cat;
    int female;
    int male;
    int age_0_6_months;
    int age_6_12_months;
    int age_1_3_years;
    int age_3_5_years;
    int age_5_7_years;
    int age_7_9_years;
    int age_9plus_years;
    String company;

    public void setBase_premium(int base_premium) {
        this.base_premium = base_premium;
    }

    public void setPet_dog(int pet_dog) {
        this.pet_dog = pet_dog;
    }

    public void setPet_cat(int pet_cat) {
        this.pet_cat = pet_cat;
    }

    public void setFemale(int female) {
        this.female = female;
    }

    public void setMale(int male) {
        this.male = male;
    }

    public void setAge_0_6_months(int age_0_6_months) {
        this.age_0_6_months = age_0_6_months;
    }

    public void setAge_6_12_months(int age_6_12_months) {
        this.age_6_12_months = age_6_12_months;
    }

    public void setAge_1_3_years(int age_1_3_years) {
        this.age_1_3_years = age_1_3_years;
    }

    public void setAge_5_7_years(int age_5_7_years) {
        this.age_5_7_years = age_5_7_years;
    }

    public void setAge_7_9_years(int age_7_9_years) {
        this.age_7_9_years = age_7_9_years;
    }

    public void setAge_9plus_years(int age_9plus_years) {
        this.age_9plus_years = age_9plus_years;
    }

    public PetPricing(int base_premium, int pet_dog,int pet_cat, int female, int male, int age_0_6_months, int age_6_12_months, int age_1_3_years, int age_3_5_years, int age_5_7_years, int age_7_9_years, int age_9plus_years, String company)
    {
        this.base_premium = base_premium;
        this.pet_dog = pet_dog;
        this.pet_cat = pet_cat;
        this.female = female;
        this.male = male;
        this.age_0_6_months = age_0_6_months;
        this.age_6_12_months = age_6_12_months;
        this.age_1_3_years = age_1_3_years;
        this.age_3_5_years = age_3_5_years;
        this.age_5_7_years = age_5_7_years;
        this.age_7_9_years = age_7_9_years;
        this.age_9plus_years = age_9plus_years;
        this.company = company;
    }

    public int getBase_premium() {
        return base_premium;
    }

    public int getPet_dog() {
        return pet_dog;
    }

    public int getPet_cat() {
        return pet_cat;
    }

    public int getFemale() {
        return female;
    }

    public int getMale() {
        return male;
    }

    public int getAge_0_6_months() {
        return age_0_6_months;
    }

    public int getAge_6_12_months() {
        return age_6_12_months;
    }

    public int getAge_1_3_years() {
        return age_1_3_years;
    }

    public int getAge_3_5_years() {
        return age_3_5_years;
    }

    public int getAge_5_7_years() {
        return age_5_7_years;
    }

    public int getAge_7_9_years() {
        return age_7_9_years;
    }

    public int getAge_9plus_years() {
        return age_9plus_years;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    
    
    
}
