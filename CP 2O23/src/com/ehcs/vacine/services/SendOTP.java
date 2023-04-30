package com.ehcs.vacine.services;
import javax.mail.*; 
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;
import java.util.Properties;

public class SendOTP {
	final static String from = "dineshdhayfule@gmail.com";
	static String subject;
 	
	public static Boolean sendOTP(String string, String eMAIL, String string2)
	{
		Boolean b = true;
		subject = string2;
		String host = "smtp.gmail.com";
		Properties p = System.getProperties();
		p.put("mail.smtp.host", host);
		p.put("mail.smtp.port", "465");
		p.put("mail.smtp.ssl.enable", "true");
		p.put("mail.smtp.auth", "true");
		Session s = Session.getInstance(p, new Authenticator()
				{

					@Override
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(from,"czwptzvkpiusaivj");
					}
			
				});
		MimeMessage m = new MimeMessage(s);
		try {
			m.setFrom(from);
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(eMAIL));
			m.setSubject(subject);
			m.setText(string);
			Transport.send(m);
		}
		catch(MessagingException e)
		{
			e.printStackTrace();
			b = false;
		}
		finally
		{
			System.out.println("Completed");
			
		}
		return b;
	}
}