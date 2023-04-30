package com.ehcs.main;

import java.awt.EventQueue; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.ehcs.vacine.services.Login;
import com.ehcs.vacine.services.Registration;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Start_Page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start_Page frame = new Start_Page();
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
	public Start_Page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 0,1011,768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Signup");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		btnNewButton.setBackground(new Color(0, 204, 255));
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Registration sup = new Registration();
				sup.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(0, 191, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Login sup = new Login();
				sup.setVisible(true);
				setVisible(false);
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\logo.jpg"));
		lblNewLabel.setBounds(556, -20, 533, 320);
		contentPane.add(lblNewLabel);
		btnNewButton_1.setBounds(808, 616,  154, 79);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		contentPane.add(btnNewButton_1);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton.setBounds(556, 616, 154, 79);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\Home Page.png"));
		lblNewLabel_1.setLocation(0, -20);
		lblNewLabel_1.setSize(1011,768);
		contentPane.add(lblNewLabel_1);
	}
}