package com.ehcs.vacine.services;

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
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import com.ehcs.main.Start_Page;
import com.ehcs.vacine.dao.DataBase;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserid;
	private JPasswordField passwordField;
	private JButton lblNewLabel_7;

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
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
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
		lblNewLabel.setBounds(366, 72, 99, 40);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 255));
		panel.setBounds(128, 298, 528, 327);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_7 = new JButton("Admin Login");
		lblNewLabel_7.setBorderPainted(false);
		lblNewLabel_7.setBackground(new Color(255, 255, 255));
		lblNewLabel_7.setForeground(new Color(0, 0, 0));
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AdminLogin al = new AdminLogin();
				al.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7.setBounds(52, 266, 146, 38);
		panel.add(lblNewLabel_7);
		
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
		lblNewLabel_1.setBounds(64, 52, 86, 56);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel_1_1 = new JLabel("  PassWord :");
		lblNewLabel_1_1.setBounds(64, 153, 126, 25);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
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
		
		
		JButton btnNewButton_1 = new JButton("LOGIN ");
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(252, 266, 115, 38);
		
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_8.setVisible(false);
				lblNewLabel_3_1.setVisible(false);
				lblNewLabel_3.setVisible(false);
				lblNewLabel_5.setVisible(false);
				if(txtUserid.getText()==null && passwordField.getText()==null)
				{
					lblNewLabel_8.setVisible(true);
					lblNewLabel_3_1.setVisible(true);
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
				case 3:
					setVisible(false);
					break;
				}
				
				}
			}
		});
		
		JLabel btnNewButton = new JLabel("");
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		btnNewButton.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\doc_1.png"));
		btnNewButton.setBounds(254, 168, 111, 131);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		lblNewLabel_2.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\user.png"));
		lblNewLabel_2.setBounds(455, 168, 111, 131);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_6.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\water-1330252_1280.jpg"));
		lblNewLabel_6.setBounds(0, 55, 913, 604);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3_2 = new JLabel("E-HEALTH CARE SERVICES ");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_3_2.setBounds(219, 0, 389, 44);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\heading.jpeg"));
		lblNewLabel_2_1.setBounds(-11, 0, 924, 55);
		contentPane.add(lblNewLabel_2_1);
		
	}
}