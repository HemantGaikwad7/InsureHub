/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Emailfunctionality;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Hemant
 */
public class managerapproved {
    public static void sendMail (String recepient) throws Exception {
        System.out.println("Preparing to send email");
        Properties properties = new Properties ();
        properties.put ("mail.smtp.auth","true");
        properties.put ("mail.smtp.starttls.enable","true");
        properties.put ("mail.smtp.host" , "smtp.gmail.com");
        properties.put ("mail.smtp.port","587");
        String myAccountEmail = "prabhurahul98@gmail.com";
        String password = "Qwerty@12345";

        Session session = Session.getInstance (properties, new Authenticator () {
        @Override
            protected PasswordAuthentication getPasswordAuthentication () {
                return new PasswordAuthentication (myAccountEmail, password);
            }
            });
        Message message = prepareMessage (session, myAccountEmail, recepient);
        Transport.send (message);
        //System.out.println("Message sent successfully");
    }
    private static Message prepareMessage (Session session, String myAccountEmail, String recepient) {
        try{
            Message message = new MimeMessage (session);
            message.setFrom(new InternetAddress (myAccountEmail));
            message. setRecipient (Message.RecipientType.TO, new InternetAddress (recepient));
            message.setSubject("Claim approved");
            message. setText ("Congratulations user! Your claim has been approved by the manager and forwarded to finance department.");
        return message;
        } catch (Exception ex) {
//        Logger.getLogger(Emailcode.class.getName ()). log (Level.SEVERE, null, ex);
        }
        return null;
        }
    
}
