/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

/**
 *
 * @author Hemant
 */
public class Login {
    String loginas;
    String username;
    String companyname;

    public Login(String companyname) {
        this.companyname = companyname;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public Login(String loginas, String username, String password, String companyname) {
        this.loginas = loginas;
        this.username = username;
        this.password = password;
        this.companyname = companyname;
    }

    public String getLoginas() {
        return loginas;
    }

    public void setLoginas(String loginas) {
        this.loginas = loginas;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    String password;
}
