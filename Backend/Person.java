/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Hemant
 */
public class Person {
    int Person_id;
    String FirstName;
    String LastName;
  

    public int getPerson_id() {
        return Person_id;
    }

    public void setPerson_id(int Person_id) {
        this.Person_id = Person_id;
    }

    public Person(int Person_id, String FirstName, String LastName) {
        this.Person_id = Person_id;
        this.FirstName = FirstName;
        this.LastName = LastName;
       
    }
    

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    
  
    
}
