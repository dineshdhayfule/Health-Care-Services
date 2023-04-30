package com.ehcs.e_medico.services;

import java.util.ArrayList;
import java.util.Properties; 

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class EmailSending {
	public void sendEmail(String to,ArrayList ar,ArrayList ar1)
	{
		String message = " list		|		price \n";
	String []msg ;
		String subject = "MEDICINE LISTS";
		int sum = 0;

		for(int i =0; i<ar.size();i++)
		{
			message += " \n "+ ar.get(i)+"  : ₹"+ar1.get(i)+"";	
			sum += Integer.parseInt((String) ar1.get(i));

		}
		
		message += " \n \n \n total price: "+sum;
		String from = "dineshdhayfule@gmail.com";
		System.out.println("Preparing to send message");
		
		String host = "smtp.gmail.com";
		Properties p = System.getProperties();
		System.out.println("Properties = "+p);
		
		p.put("mail.smtp.host", host);
		p.put("mail.smtp.port", "465");
		p.put("mail.smtp.ssl.enable", "true");
		p.put("mail.smtp.auth", "true");
		Session s = Session.getInstance(p, new Authenticator()
				{

					@Override
					protected PasswordAuthentication getPasswordAuthentication() {
						// TODO Auto-generated method stub
						return new PasswordAuthentication("dineshdhayfule@gmail.com","czwptzvkpiusaivj");
					}
			
				});
		MimeMessage m = new MimeMessage(s);
		try {
			m.setFrom(from);
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			m.setSubject(subject);
			m.setText(message);
			Transport.send(m);
		}
		catch(MessagingException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Completed");
			JOptionPane.showMessageDialog(null,"E-mail has been sended!");

		}
	}
}