package com.ehcs.vacine.services;

import java.awt.BorderLayout; 

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;

import com.ehcs.main.Start_Page;
import com.ehcs.vacine.dao.DataBase;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.TitledBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserid;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setBounds(new Rectangle(0, 0, 900, 600));
		setMaximumSize(new Dimension(900, 700));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 75, 929, 698);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Start_Page hg=new Start_Page();
				hg.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_9.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\back.jpg"));
		lblNewLabel_9.setBounds(803, 619, 47, 40);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Script MT Bold", Font.BOLD, 29));
		lblNewLabel.setBounds(368, 58, 99, 40);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(184, 298, 514, 327);
		contentPane.add(panel);
		panel.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(214, 152, 241, 29);
		panel.add(passwordField);
		passwordField.setOpaque(false);
		passwordField.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(214, 179, 241, 2);
		panel.add(separator);
		separator.setBackground(Color.BLACK);
		separator.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		txtUserid = new JTextField();
		txtUserid.setBounds(214, 68, 241, 31);
		panel.add(txtUserid);
		txtUserid.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		txtUserid.setOpaque(false);
		txtUserid.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(" User ID :");
		lblNewLabel_1.setBounds(91, 69, 93, 25);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JLabel lblNewLabel_1_1 = new JLabel("  PassWord :");
		lblNewLabel_1_1.setBounds(91, 153, 99, 25);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JLabel lblNewLabel_3_1 = new JLabel("* Enter Correct Pass");
		lblNewLabel_3_1.setBounds(332, 128, 107, 14);
		panel.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setForeground(Color.RED);
		
		JLabel lblNewLabel_3 = new JLabel("* This Aadhar No is Not Registered ");
		lblNewLabel_3.setBounds(214, 55, 170, 14);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(Color.RED);
		
		JLabel lblNewLabel_8 = new JLabel("* Enter Aadhar No");
		lblNewLabel_8.setBounds(312, 55, 93, 14);
		panel.add(lblNewLabel_8);
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setVisible(false);
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3_1.setVisible(false);
		
		
		JButton btnNewButton_1 = new JButton("LOGIN ");
		btnNewButton_1.setBackground(new Color(240, 248, 255));
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 191, 255), 3));
		btnNewButton_1.setBounds(252, 278, 115, 29);
		
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Forgot PassWord");
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ForgotPass ps = new ForgotPass(txtUserid.getText());
				ps.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_5.setBounds(332, 207, 86, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("Admin Login");
		lblNewLabel_7.setBorder(new LineBorder(new Color(0, 191, 255), 2));
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminLogin al = new AdminLogin();
				al.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setBounds(91, 279, 99, 25);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\heading.jpeg"));
		lblNewLabel_2_1.setBounds(0, 0, 927, 55);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home_page hp = new Home_page();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\sumit\\Downloads\\BACK.jpg"));
		lblNewLabel_4.setBounds(822, 610, 37, 38);
		contentPane.add(lblNewLabel_4);
		
		JLabel btnNewButton = new JLabel("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
			}
		});
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\doc.jpg"));
		btnNewButton.setBounds(254, 168, 111, 131);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_2.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\patient.jpg"));
		lblNewLabel_2.setBounds(455, 168, 111, 131);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\sky blue.png"));
		lblNewLabel_6.setBounds(0, 55, 913, 604);
		contentPane.add(lblNewLabel_6);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_8.setVisible(false);
				lblNewLabel_3_1.setVisible(false);
				lblNewLabel_3.setVisible(false);
				lblNewLabel_5.setVisible(false);
				if(txtUserid.getText()==null)
				{
					lblNewLabel_8.setVisible(true);
				}
				else {
				
				DataBase db = new DataBase();
				int a = db.login(passwordField.getText(),txtUserid.getText());
				switch (a)
				{
				case 1: 
					lblNewLabel_3.setVisible(true);
					break;
				case 2:
					lblNewLabel_3_1.setVisible(true);
					lblNewLabel_5.setVisible(true);
					break;
				}
				
				}
				
				setVisible(false);
			}
		});
		
	}
}