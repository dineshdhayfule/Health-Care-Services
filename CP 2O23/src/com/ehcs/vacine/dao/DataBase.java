package com.ehcs.vacine.dao;

import java.sql.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.ehcs.main.Select_Page;
import com.ehcs.vacine.services.Login;

public class DataBase 
{
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "system";
	private static String pass = "root";
	private static String driver = "oracle.jdbc.driver.OracleDriver";

	public String fname = null;
	public String lname = null;
	public String name = null;
	public String EMAIL = null;
	public String PHONE = null;
	public String GENDER = null;
	public String ADDRESS = null;
	public String dob = null;
	public String passw = null;
	public String FIRST_DOSE = null;
	public String FIRST_DOSE_DATE = null;
	public String SECOND_DOSE = null;
	public String SECON_DOSE_DATE = null;
	public String BOOSTER_DOSE = null;
	public String BOOSTER_DOSE_DATE = null;
	public int insertIntoDB(ArrayList e) {
		String sql;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		int a = 0;
		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			stmt = con.createStatement();
			sql = "INSERT into registration VALUES(sequence05.nextval,?,?,?,?,?,?,?,?,?)";
			stm = con.prepareStatement(sql);
			stm.setString(1, (String) e.get(0));
			stm.setString(2, (String) e.get(1));
			stm.setString(3, (String) e.get(2));
			stm.setString(4, (String) e.get(3));
			stm.setString(5, (String) e.get(4));
			stm.setString(6, (String) e.get(5));
			stm.setString(7, (String) e.get(6));
			stm.setString(8, (String) e.get(7));
			stm.setString(9, (String) e.get(8));
			a = stm.executeUpdate();

		} catch (Exception e1) {
			System.out.print(e1);
		}
		return a;
	}

	public int login(String pa, String adhar) {
		String sql;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		String user_id;
		String pas = null;
		String name = null;
		ResultSet rs = null;
		int b = 0;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			stmt = con.createStatement();
			sql = "select  PASSWORD ,FNAME  from registration where AADHAR = ? ";
			stm = con.prepareStatement(sql);
			stm.setString(1, adhar);
			rs = stm.executeQuery();
			if (rs.next() == false) {
				b = 1;
			} else {
				do {
					pas = rs.getString(1);
					name = rs.getString(2);
				} while (rs.next());
			}
			if (pa.equals(pas)) {
				JOptionPane.showMessageDialog(null, "Welcome  " + name);
				Login n = new Login();
				Select_Page pg = new Select_Page(adhar);
				pg.setVisible(true);
				n.setVisible(false);
				b=3;
			} else {
				b = 2;
			}

		} catch (NumberFormatException e) {

			JOptionPane.showMessageDialog(null, "Enter Only Numbers  ");
		} catch (Exception e) {

		}
		return b;

	}

	public void getDetails(String adhar) {
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			stmt = con.createStatement();
			String sql = "select FNAME ,LNAME,EMAIL,PHONE,GENDER, ADDRESS , DOB ,PASSWORD from registration where AADHAR = ? ";
			stm = con.prepareStatement(sql);
			stm.setString(1, adhar);
			rs = stm.executeQuery();

			while (rs.next()) {
				fname = rs.getString(1);
				lname = rs.getString(2);
				EMAIL = rs.getString(3);
				PHONE = rs.getString(4);
				GENDER = rs.getString(5);
				ADDRESS = rs.getString(6);
				dob = rs.getString(7);
				passw = rs.getString(8);

			}
			name = fname + " " + lname;

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Enter Only Numbers  ");
		} catch (Exception e) {

		}

	}

	public int UpdateDetails(ArrayList e, String Adhar) {
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		int a = 0;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			stmt = con.createStatement();
			String sql = "UPDATE registration SET FNAME = ? , LNAME = ? ,PHONE = ? ,EMAIL = ? , DOB = ? , ADDRESS = ?   where AADHAR = ? ";
			stm = con.prepareStatement(sql);
			stm.setString(7, Adhar);
			stm.setString(1, (String) e.get(0));
			stm.setString(2, (String) e.get(1));
			stm.setString(3, (String) e.get(2));
			stm.setString(4, (String) e.get(3));
			stm.setString(5, (String) e.get(4));
			stm.setString(6, (String) e.get(5));
			a = stm.executeUpdate();

		} catch (Exception g) {
		}
		return a;
	}

	public int forgotPass(String Adhar, String pass1) {
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		int a = 0;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			stmt = con.createStatement();
			String sql = "UPDATE registration SET PASSWORD = ?  where AADHAR = ? ";
			stm = con.prepareStatement(sql);
			stm.setString(2, Adhar);
			stm.setString(1, (String) pass1);
			a = stm.executeUpdate();

		} catch (Exception g) {
		}
		return a;
	}

	public void avaiblity(String Vaccine, String center, String Adhar, String date) {
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		int slot = 0;
		int count;
		String cent;
		boolean b = false;
		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			stmt = con.createStatement();
			String sql = "select VACCINE_NAME,SLOTS from Vaccine_slots where CENTER_NAME = ?";
			stm = con.prepareStatement(sql);
			stm.setString(1, center);
			rs = stm.executeQuery();
			while (rs.next()) {
				cent = rs.getString(1);
				String slots = rs.getString(2);
				slot = Integer.parseInt(slots);
				if (cent.equals(Vaccine) && slot > 0) {
					b = true;
				}
			}
			if (b == true) {
				sql = "UPDATE Vaccine_slots  SET SLOTS = ? WHERE VACCINE_NAME = ? AND  CENTER_NAME = ? ";
				stm = con.prepareStatement(sql);
				stm.setInt(1, slot - 1);
				stm.setString(2, Vaccine);
				stm.setString(3, center);
				count = stm.executeUpdate();
				if (count == 1) {
					JOptionPane.showMessageDialog(null, "Successfully Booked :)");
					DataBase db = new DataBase();
					db.bookingCheck(Adhar);
					db.bookingUpdate(Adhar, Vaccine, date, center);
				} else {
					JOptionPane.showMessageDialog(null, "Unsuccessful To Booked");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Slot Unavaliable..");
			}

		} catch (Exception n) {
//			JOptionPane.showMessageDialog(null, n);
		}
	}

	public void bookingCheck(String Adhar) {
		String sql;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		int a = 0;
		ResultSet rs = null;
		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			stmt = con.createStatement();
			sql = "select FIRST_DOSE,FIRST_DOSE_DATE,	SECOND_DOSE,SECON_DOSE_DATE , BOOSTER_DOSE,BOOSTER_DOSE_DATE from CovidVaccinabooking where AADHAR = ? ";
			stm = con.prepareStatement(sql);
			stm.setString(1, Adhar);
			rs = stm.executeQuery();
			while (rs.next()) {
				FIRST_DOSE = rs.getString(1);
				FIRST_DOSE_DATE = rs.getString(2);
				SECOND_DOSE = rs.getString(3);
				SECON_DOSE_DATE = rs.getString(4);
				BOOSTER_DOSE = rs.getString(5);
				BOOSTER_DOSE_DATE = rs.getString(6);
			}
		} catch (Exception f) {
			JOptionPane.showMessageDialog(null, f);
		}
	}

	public int bookingUpdate(String Adhar, String Vaccine, String date, String center) {
		String sql = null;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		int a = 0;
		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			stmt = con.createStatement();
			System.out.println(SECOND_DOSE);
			if (FIRST_DOSE == null) {

				sql = "INSERT into CovidVaccinabooking(VACCINE,FIRST_DOSE,FIRST_DOSE_DATE,CENTER, AADHAR) VALUES(?,?,?,?,?) ";

			} else if (FIRST_DOSE.equals("Taken") && SECOND_DOSE == null) {
//				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
//				java.util.Date date1 = sdf.parse(FIRST_DOSE_DATE);
//				java.util.Date date2 = sdf.parse(date);
//				long diffInMillies = Math.abs(date2.getTime() - date1.getTime());
//				long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
//				if (diff == 31) {
		sql = "UPDATE CovidVaccinabooking set VACCINE = ? ,SECOND_DOSE = ? ,SECON_DOSE_DATE = ? ,CENTER = ? where AADHAR = ? ";
//				} else {
//					JOptionPane.showMessageDialog(null,
//							"YOU CANT BOOK 2ND VACCINE Until 31 Days ARE COMPLETE FROM YOUR 1ST VACCINE ");
//				}

			}
			else if (FIRST_DOSE.equals("Taken") && SECOND_DOSE.equals("Taken") && BOOSTER_DOSE == null ) {
//				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
//				java.util.Date date1 = sdf.parse(FIRST_DOSE_DATE);
//				java.util.Date date2 = sdf.parse(date);
//				long diffInMillies = Math.abs(date2.getTime() - date1.getTime());
//				long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
//				if (diff == 80) {
		sql = "UPDATE CovidVaccinabooking set VACCINE = ? ,BOOSTER_DOSE= ?,BOOSTER_DOSE_DATE=?,CENTER = ? where AADHAR = ? ";
//				} else {
//					JOptionPane.showMessageDialog(null,
//							"YOU CANT BOOK BOOSTER_DOSE VACCINE Until 31 Days ARE COMPLETE FROM YOUR 1ST VACCINE ");
//				}
			}
			else if (FIRST_DOSE.equals("Taken") && SECOND_DOSE.equals("Taken") && BOOSTER_DOSE.equals("Taken") ) 
			{
				JOptionPane.showMessageDialog(null, "You Had Taken Both Vaccine & BOOSTER_DOSE  You Cant Book Vaccine NOW");
	
			}
			
			else {
				JOptionPane.showMessageDialog(null, "You Had Taken Both Vaccine You Cant Book Vaccine NOW");
			}

			stm = con.prepareStatement(sql);
			stm.setString(1, Vaccine);
			stm.setString(2, "Booked");
			stm.setString(3, date);
			stm.setString(4, center);
			stm.setString(5, Adhar);
			a = stm.executeUpdate();
			if (a == 1) {
				JOptionPane.showMessageDialog(null, "Your  Vaccine Has Been Booked on  " + date);
			}
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, e1);
		}
		return a;
	}

	public int markAsTaken(String Adhar) {
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		int a = 0;
		String sql = null;
		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			stmt = con.createStatement();
			bookingCheck(Adhar);

		if (FIRST_DOSE.equals("Booked") && SECOND_DOSE == null) 
			{
				sql = "UPDATE CovidVaccinabooking set FIRST_DOSE = ?  where AADHAR = ? ";
			}
		else if (FIRST_DOSE.equals("Taken") && SECOND_DOSE == null) 
			{
					JOptionPane.showMessageDialog(null, "SECOND_DOSE not booked");
			}
	   else if (FIRST_DOSE.equals("Taken") && SECOND_DOSE.equals("Booked")) 
	   		{
		   		sql = "UPDATE CovidVaccinabooking set SECOND_DOSE = ?  where AADHAR = ? ";
			}
	   else if (FIRST_DOSE.equals("Taken") && SECOND_DOSE.equals("Taken")&& BOOSTER_DOSE.equals("Booked")) 
  		{
	   		sql = "UPDATE CovidVaccinabooking set BOOSTER_DOSE = ?  where AADHAR = ? ";
		}
	   else if (FIRST_DOSE.equals("Taken") && SECOND_DOSE.equals("Taken")&& BOOSTER_DOSE.equals("Taken")) 
 		{
			JOptionPane.showMessageDialog(null,"He/she Had Taken Both Vaccine You Cant Mark as Vaccine Taken  NOW");
		}
	   else {
				JOptionPane.showMessageDialog(null,"He/she Had Taken Both Vaccine You Cant Mark as Vaccine Taken  NOW");
			}
			stm = con.prepareStatement(sql);
			stm.setString(2, Adhar);
			stm.setString(1, "Taken");
			a = stm.executeUpdate();
		} catch (Exception g) {
		}
		return a;
	}
}