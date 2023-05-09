package com.ehcs.vacine.services;
import java.awt.BorderLayout; 
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;
import java.util.regex.Pattern;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

import com.ehcs.vacine.dao.DataBase;

import javax.swing.JPasswordField;

public class ForgotPass extends JFrame {

	private JPanel contentPane;
	private JTextField phnoo;
	private JTextField textOTP;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	OTP otp=new OTP();
	JButton btnNewButton_1=null;
	String otpmessage;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPass frame = new ForgotPass("");
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
	public ForgotPass(String Adhar) {
		
		DataBase db = new DataBase();
		db.getDetails(Adhar);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 75, 940, 687);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(201, 94, 468, 452);
		panel.setVisible(false);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_15 = new JLabel("Forgot Pass");
		lblNewLabel_15.setBounds(160, 12, 142, 55);
		panel.add(lblNewLabel_15);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		
		JLabel lblNewLabel_6_2 = new JLabel("Enter New PassWord\r\n");
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_2.setBounds(26, 139, 168, 28);
		panel.add(lblNewLabel_6_2);
		
		passwordField = new JPasswordField();
		passwordField.setOpaque(false);
		passwordField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		passwordField.setBounds(247, 145, 152, 20);
		panel.add(passwordField);
		
		JLabel lblNewLabel_6_3 = new JLabel("Confirm New PassWord\r\n");
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_3.setBounds(26, 223, 181, 28);
		panel.add(lblNewLabel_6_3);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setOpaque(false);
		passwordField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		passwordField_1.setBounds(247, 229, 152, 20);
		panel.add(passwordField_1);
		
		JLabel newpasserror = new JLabel("");
		newpasserror.setForeground(Color.RED);
		newpasserror.setBounds(247, 175, 142, 14);
		panel.add(newpasserror);
		
		JLabel confirmpasserror = new JLabel("");
		confirmpasserror.setForeground(Color.RED);
		confirmpasserror.setBounds(257, 271, 142, 14);
		panel.add(confirmpasserror);
		
		JButton btnNewButton_2 = new JButton("Submit\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Pattern.compile("").matcher(passwordField.getText()).matches()) {
					newpasserror.setText("* Enter New Pass");
				}else {
				
				if (!passwordField_1.getText().equals(passwordField.getText()))
				{
					confirmpasserror.setText("Enter Correct Confirm Pass");
			}else
			{
				int a = db.forgotPass(Adhar, passwordField_1.getText());
				if(a!=0) {
					JOptionPane.showMessageDialog(null,"Password Changed Successfully");
				}
				else {
					JOptionPane.showMessageDialog(null,"Password Dosent Changed ");
				}
			}
			}
				if(panel.isVisible()==true) {
					btnNewButton_1.setVisible(false);
				}	
			}
			
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBackground(Color.BLUE);
		btnNewButton_2.setBounds(155, 369, 99, 35);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_14 = new JLabel("X");
		lblNewLabel_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login lg = new Login();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_14.setForeground(Color.RED);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_14.setBounds(412, 10, 46, 28);
		panel.add(lblNewLabel_14);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("E-HEALTH CARE SERVICES");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 25));
		lblNewLabel_3.setBounds(251, -1, 348, 44);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\\\CPP PROJECT 2023\\\\Images\\\\vaccine\\\\heading.jpeg"));
		lblNewLabel_2.setBounds(0, 0, 926, 55);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("Enter Phone No");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setBounds(238, 120, 167, 41);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Enter OTP ");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6_1.setBounds(238, 181, 116, 33);
		contentPane.add(lblNewLabel_6_1);
		
		phnoo = new JTextField();
		phnoo.setFont(new Font("Tahoma", Font.BOLD, 17));
		phnoo.setOpaque(false);
		phnoo.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		phnoo.setColumns(10);
		phnoo.setBounds(415, 128, 246, 33);
		contentPane.add(phnoo);
		
		textOTP = new JTextField();
		textOTP.setFont(new Font("Tahoma", Font.BOLD, 14));
		textOTP.setOpaque(false);
		textOTP.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textOTP.setColumns(10);
		textOTP.setBounds(415, 187, 162, 28);
		contentPane.add(textOTP);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(721, 129, 158, 14);
		lblNewLabel.setVisible(false);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(673, 192, 158, 14);
		lblNewLabel_1.setVisible(false);
		contentPane.add(lblNewLabel_1);
		
	    btnNewButton_1 = new JButton("Submit OTP");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textOTP.getText().equals(otpmessage)) {
					panel.setVisible(true);
					btnNewButton_1.setVisible(false);
					
				}else 
				{
					lblNewLabel_1.setText("* Enter Correct OTP ");
				}
					
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setBounds(320, 348, 181, 33);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("Get OTP");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!phnoo.getText().equals(db.EMAIL)) {
					lblNewLabel.setText("* Enter Correct Email ");
					lblNewLabel.setVisible(true);
				}
			else {

				otpmessage=otp.generateOTP(5);
				boolean b=SendOTP.sendOTP("\t\t\t\t E-HEALTH CARE SERVICES \\n\\n\\n .\n This otp is sent for reset your password \n Your OTP is :"+ otpmessage ,db.EMAIL,"Forgot Pass OTP");
				if(b==false) {
					JOptionPane.showMessageDialog(null, "Unsuccessful To Send An OTP  ");
				}else {
						 JOptionPane.showMessageDialog(null, "OTP Sent ");
				}
//				 JOptionPane.showMessageDialog(null, "OTP Sent ");
			}
			}
		});
		lblNewLabel_8.setForeground(new Color(0, 0, 0));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel_8.setBounds(349, 250, 127, 60);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login lg = new Login();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon("E:\\\\CPP PROJECT 2023\\\\Images\\\\vaccine\\\\BACK.jpg"));
		lblNewLabel_4.setBounds(832, 585,47, 44);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\water-1330252_1280.jpg"));
		lblNewLabel_5.setBounds(0, 52, 926, 598);
		contentPane.add(lblNewLabel_5);
		
		
	}
}