package com.ehcs.vacine.services;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 75, 940, 687);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("   Admin Login\r\n");
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBackground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6.setBounds(407, 94, 133, 35);
		contentPane.add(lblNewLabel_6);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(405, 353, 213, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("UserName ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(256, 203, 121, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(267, 310, 110, 45);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setOpaque(false);
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		textField.setBackground(new Color(0, 204, 255));
		textField.setBounds(405, 207, 213, 45);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(407, 310, 213, 44);
		passwordField.setOpaque(false);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("admin")&&passwordField.getText().equals("1122")) 
				{
				DashBoardAdmin da = new DashBoardAdmin();
				da.setVisible(true);
				setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, " Enter Correct ID & Pass");
				}
			}
		});
		btnNewButton.setBounds(351, 448, 133, 45);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3_2 = new JLabel("E-HEALTH CARE SERVICES ");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 25));
		lblNewLabel_3_2.setBounds(249, 5, 419, 44);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\heading.jpeg"));
		lblNewLabel_2_1.setBounds(0, 0, 924, 55);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Login lg = new Login();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\back.jpg"));
		lblNewLabel_4.setBounds(792, 566, 56, 55);
		contentPane.add(lblNewLabel_4);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		separator.setBounds(209, 110, 514, 438);
		contentPane.add(separator);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\blue_gradient_bg.jpg"));
		lblNewLabel_3.setBounds(0, 46, 924, 594);
		contentPane.add(lblNewLabel_3);
	}
}