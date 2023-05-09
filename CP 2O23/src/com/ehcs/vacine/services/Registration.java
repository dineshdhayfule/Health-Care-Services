package com.ehcs.vacine.services;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Color;
import com.ehcs.main.Select_Page;
import com.ehcs.main.Start_Page;
import com.ehcs.vacine.dao.DataBase;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField fname;
	private JTextField lname;
	private JTextField txtDineshdhayfulegmailcom;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField txtSolapur;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 70, 940, 687);
		contentPane = new JPanel();
		setTitle("Sign-Up");
		contentPane.setSize(new Dimension(900, 700));
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		ArrayList al = new ArrayList();
		
		JLabel lblNewLabel_8 = new JLabel(" Registration");
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setFont(new Font("Arial Black", Font.BOLD, 21));
		lblNewLabel_8.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_8.setBounds(374, 83, 169, 55);
		contentPane.add(lblNewLabel_8);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(191, 169, 36, -20);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(156, 175, 52, -14);
		separator_1.setBackground(Color.GRAY);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(150, 207, -39, 7);
		contentPane.add(separator_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("E-HEALTH CARE SERVICES ");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 25));
		lblNewLabel_3_1.setBounds(245, 5, 355, 44);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\heading.jpeg"));
		lblNewLabel_2_1.setBounds(-3, 6, 927, 55);
		contentPane.add(lblNewLabel_2_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(206, 128, -137, -14);
		contentPane.add(separator_3);
		
		fname = new JTextField();
		fname.setFont(new Font("Tahoma", Font.BOLD, 14));
		fname.setOpaque(false);
		fname.setBounds(245, 175, 159, 28);
		contentPane.add(fname);
		fname.setBackground(new Color(255, 255, 255));
		fname.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		fname.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name");
		lblNewLabel_1_1.setBounds(101, 180, 93, 17);
		contentPane.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel_2 = new JLabel("* Enter Valid First Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(290, 207, 159, 17);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(Color.RED);
		
		JLabel lblNewLabel_1_3_1 = new JLabel(" Phone No");
		lblNewLabel_1_3_1.setBounds(101, 237, 93, 28);
		contentPane.add(lblNewLabel_1_3_1);
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_4.setOpaque(false);
		textField_4.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField_4.setBounds(245, 244, 159, 28);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_2_3 = new JLabel("*  Enter Valid Phone No");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_3.setBounds(290, 274, 159, 17);
		contentPane.add(lblNewLabel_2_3);
		lblNewLabel_2_3.setForeground(Color.RED);
		
		JLabel lblNewLabel_1_3_2 = new JLabel(" DOB :");
		lblNewLabel_1_3_2.setBounds(101, 304, 93, 28);
		contentPane.add(lblNewLabel_1_3_2);
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		dateChooser.setBounds(245, 312, 159, 20);
		contentPane.add(dateChooser);
		dateChooser.setDateFormatString("dd-MM-yyyy");
		
		JLabel lblNewLabel_1_3_2_1 = new JLabel(" Gender");
		lblNewLabel_1_3_2_1.setBounds(101, 368, 93, 28);
		contentPane.add(lblNewLabel_1_3_2_1);
		lblNewLabel_1_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setOpaque(false);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		comboBox.setBounds(245, 372, 169, 28);
		contentPane.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female", "Other"}));
		
		JLabel lblNewLabel_3 = new JLabel("* Select Apropriate Gender");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(287, 404, 162, 14);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(Color.RED);
		
		JLabel lblNewLabel_1_3_2_1_2 = new JLabel("Enter Password");
		lblNewLabel_1_3_2_1_2.setBounds(101, 436, 138, 28);
		contentPane.add(lblNewLabel_1_3_2_1_2);
		lblNewLabel_1_3_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 14));
		passwordField.setOpaque(false);
		passwordField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		passwordField.setBounds(249, 443, 159, 28);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_5 = new JLabel("* Enter Pass");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(286, 473, 122, 14);
		contentPane.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(Color.RED);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(492, 566, 147, 43);
		contentPane.add(btnSubmit);
		btnSubmit.setBorderPainted(false);
		btnSubmit.setForeground(Color.BLACK);
		btnSubmit.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnSubmit.setBackground(Color.GREEN);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(268, 566, 147, 43);
		contentPane.add(btnReset);
		btnReset.setForeground(Color.WHITE);
		btnReset.setBorderPainted(false);
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnReset.setBackground(Color.RED);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setBounds(483, 169, 93, 28);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		lname = new JTextField();
		lname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lname.setOpaque(false);
		lname.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		lname.setBounds(626, 169, 159, 28);
		contentPane.add(lname);
		lname.setColumns(10);
		
		JLabel lblNewLabel_2_2 = new JLabel("* Enter Valid Last Name");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(605, 207, 159, 17);
		contentPane.add(lblNewLabel_2_2);
		lblNewLabel_2_2.setForeground(Color.RED);
		
		JLabel lblNewLabel_1_3 = new JLabel(" Email ID");
		lblNewLabel_1_3.setBounds(483, 237, 93, 28);
		contentPane.add(lblNewLabel_1_3);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		txtDineshdhayfulegmailcom = new JTextField();
		txtDineshdhayfulegmailcom.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtDineshdhayfulegmailcom.setOpaque(false);
		txtDineshdhayfulegmailcom.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtDineshdhayfulegmailcom.setBounds(626, 244, 242, 28);
		contentPane.add(txtDineshdhayfulegmailcom);
		txtDineshdhayfulegmailcom.setColumns(10);
		
		JLabel lblNewLabel_2_4 = new JLabel(" * Enter Valid Email");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_4.setBounds(626, 274, 134, 17);
		contentPane.add(lblNewLabel_2_4);
		lblNewLabel_2_4.setForeground(Color.RED);
		
		JLabel lblNewLabel_1_3_2_1_1 = new JLabel(" Aadhaar No");
		lblNewLabel_1_3_2_1_1.setBounds(483, 304, 110, 28);
		contentPane.add(lblNewLabel_1_3_2_1_1);
		lblNewLabel_1_3_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_6.setOpaque(false);
		textField_6.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField_6.setBounds(626, 311, 159, 28);
		contentPane.add(textField_6);
		textField_6.setColumns(12);
		
		JLabel lblNewLabel_2_6 = new JLabel("* Enter valid Aadhaar No");
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_6.setBounds(626, 346, 159, 19);
		contentPane.add(lblNewLabel_2_6);
		lblNewLabel_2_6.setForeground(Color.RED);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setBounds(483, 370, 93, 24);
		contentPane.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		

		txtSolapur = new JTextField();
		txtSolapur.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtSolapur.setOpaque(false);
		txtSolapur.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtSolapur.setBounds(626, 375, 242, 25);
		contentPane.add(txtSolapur);
		txtSolapur.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("* Enter address");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(626, 404, 159, 14);
		contentPane.add(lblNewLabel_6);
		lblNewLabel_6.setForeground(Color.RED);
		
		JLabel lblNewLabel_1_3_2_1_2_1 = new JLabel("Confirm Password");
		lblNewLabel_1_3_2_1_2_1.setBounds(471, 436, 147, 28);
		contentPane.add(lblNewLabel_1_3_2_1_2_1);
		lblNewLabel_1_3_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		passwordField_1.setOpaque(false);
		passwordField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		passwordField_1.setBounds(636, 440, 169, 27);
		contentPane.add(passwordField_1);
		
		JLabel lblNewLabel_4 = new JLabel("* Confirm Pass Is Incorrect");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(626, 473, 166, 14);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(Color.RED);
		
		JLabel lblNewLabel_2_5 = new JLabel("* Select Correct Date");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_5.setBounds(301, 338, 138, 20);
		contentPane.add(lblNewLabel_2_5);
		lblNewLabel_2_5.setForeground(Color.RED);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Start_Page hg=new Start_Page();
				hg.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_4_1.setIcon(new ImageIcon("E:\\\\CPP PROJECT 2023\\\\Images\\\\vaccine\\BACK.jpg"));
		lblNewLabel_4_1.setBounds(839, 577, 47, 44);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\Reg.jpg"));
		lblNewLabel_10.setBounds(0, 54, 924, 594);
		contentPane.add(lblNewLabel_10);
		lblNewLabel_2_5.setVisible(false);
		lblNewLabel_4.setVisible(false);
		lblNewLabel_6.setVisible(false);
		lblNewLabel_2_6.setVisible(false);
		lblNewLabel_2_4.setVisible(false);
		lblNewLabel_2_2.setVisible(false);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fname.setText("");
			//	textField_1.setText("");
				lname.setText("");
				txtDineshdhayfulegmailcom.setText("");
				textField_4.setText("");
				dateChooser.setDate(null);
				textField_6.setText("");
				passwordField_1.setText(null);
				passwordField.setText(null);
				
				lblNewLabel_2.setVisible(false);
			//	lblNewLabel_2_1.setVisible(false);
				lblNewLabel_2_2.setVisible(false);
				lblNewLabel_2_3.setVisible(false);
				lblNewLabel_2_4.setVisible(false);
				lblNewLabel_2_5.setVisible(false);
				lblNewLabel_2_6.setVisible(false);
				comboBox.setSelectedIndex(0);
				lblNewLabel_3.setVisible(false);
				lblNewLabel_4.setVisible(false);
				 lblNewLabel_5.setVisible(false);
				 
				 
				
			}
		});
		btnSubmit.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
			boolean b;
			int a = 0;
			int c =0;
			
				lblNewLabel_2.setVisible(false);
			//	lblNewLabel_2_1.setVisible(false);
				lblNewLabel_2_2.setVisible(false);
				lblNewLabel_2_3.setVisible(false);
				lblNewLabel_2_4.setVisible(false);
				lblNewLabel_2_5.setVisible(false);
				lblNewLabel_2_6.setVisible(false);
				lblNewLabel_3.setVisible(false);
				lblNewLabel_4.setVisible(false);
				 lblNewLabel_5.setVisible(false);
				 
				 
			
			 b = Pattern.compile("([a-zA-Z]{3,30}\s*)+").matcher(fname.getText()).matches(); 
			 if(b==false) { 
				 lblNewLabel_2.setVisible(true);
				 a=1;
							}
			 else {al.add(fname.getText());}
			 
		/*	 b =Pattern.compile("([a-zA-Z]{3,30}\s*)+").matcher(textField_1.getText()).matches(); 
			 if(b==false) { 
				 lblNewLabel_2_1.setVisible(true);
							}
*/
			 b =Pattern.compile("[a-zA-Z]{3,30}").matcher(lname.getText()).matches(); 
			 if(b==false) { 
				 lblNewLabel_2_2.setVisible(true);
				 a=1;
							}
			 else {al.add(lname.getText());}
			 
				 b =Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$").matcher(txtDineshdhayfulegmailcom.getText()).matches(); 
				 if(b==false) { 
					 lblNewLabel_2_4.setVisible(true);
					 a=1;
								}
				 else {al.add(txtDineshdhayfulegmailcom.getText());}
				 
				 b =Pattern.compile("^\\d{10}$").matcher(textField_4.getText()).matches(); 
				 if(b==false) { 
					 lblNewLabel_2_3.setVisible(true);
					 a=1;
								}
				 else { al.add(textField_4.getText()); }
				 
				 b =Pattern.compile("^[2-9]{1}[0-9]{3}[0-9]{4}[0-9]{4}$").matcher(textField_6.getText()).matches(); 
				 if(b==false) { 
					 lblNewLabel_2_6.setVisible(true);
					 a=1;
								}
				 else {al.add(textField_6.getText());}
				 
				
				if(comboBox.getSelectedIndex()==0)
				{
					lblNewLabel_3.setVisible(true);
					 a=1;
				}
				else {al.add(comboBox.getSelectedItem().toString());}
				
				
				 b =Pattern.compile("").matcher(passwordField.getText()).matches(); 
				 if(b==true) { 
					 lblNewLabel_5.setVisible(true);
					 a=1;
					 }
				
				if(!passwordField_1.getText().equals(passwordField.getText())) {
					lblNewLabel_4.setVisible(true);
					 a=1;
				}
				else {al.add(passwordField_1.getText());}
				
				if(txtSolapur.getText()==null) {
					lblNewLabel_6.setVisible(true);
					 a=1;
				}
				else{al.add(txtSolapur.getText());}
				
				if (dateChooser.getDate()==null) {
					lblNewLabel_2_5.setVisible(true);
					a=1;
				}else {
					SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd");
					String stringDate= DateFor.format(dateChooser.getDate());
					al.add(stringDate);
				}
				
			if(a==0) {
			DataBase db = new DataBase();
			 c = db.insertIntoDB(al);
			}
			if(c==1) {
				JOptionPane.showMessageDialog(null, "Succesfully Submited");
				String adhar = null;
				Login lg = new Login();
				lg.setVisible(true);
				setVisible(false);
				}
			else {JOptionPane.showMessageDialog(null, " Dosent Submited");
			a=0;}
			a=0;
			}
			});
		lblNewLabel_5.setVisible(false);
		lblNewLabel_3.setVisible(false);
		lblNewLabel_2_3.setVisible(false);
		lblNewLabel_2.setVisible(false);	
	}
}