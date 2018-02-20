package com.lara;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
class SmtpAuthenticator extends Authenticator {
	public SmtpAuthenticator() {

	    super();
	}

	@Override
	public PasswordAuthentication getPasswordAuthentication() {
	 String username = "manish.aec1104@gmail.com";
	 String password = "mkp252849";
	    if ((username != null) && (username.length() > 0) && (password != null) 
	      && (password.length   () > 0)) {

	        return new PasswordAuthentication(username, password);
	    }

	    return null;
	}
}
public class SendMail 
{ public static void main(String[] args) 
{
String to="mkp252849@gmail.com";
String from="manish.aec1104@gmail.com";

Properties pt=System.getProperties();
pt.put("mail.smtp.starttls.enable", "true"); 
pt.put("mail.smtp.host", "smtp.gmail.com");
//pt.put("mail.smtp.user", "manish.aec1104@gmail.com"); // User name
//pt.put("mail.smtp.password", "mkp252849"); // password
pt.put("mail.smtp.port", "587");
pt.put("mail.smtp.auth", "true");
//pt.setProperty("mail.user", "manish.aec1104@gmail.com");
//pt.setProperty("mail.password", "mkp252849");
SmtpAuthenticator authentication = new SmtpAuthenticator();
Session s=Session.getDefaultInstance(pt,authentication);
try {
	
	MimeMessage m=new MimeMessage(s);
	m.setFrom(new InternetAddress(from));
	m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	//m.setSubject("Test Java_mail_By_Manish");
	m.setText("When will I get Job..?");
	 m.setContent("<h1>This is actual message</h1>",
             "text/html" );
	Transport.send(m);
	System.out.println("Message send SuccesFully done!!!!!!");
	
} catch (MessagingException e) {
	System.out.println("Message sending faile and Error at line : ");
	e.printStackTrace();
}
}
}
