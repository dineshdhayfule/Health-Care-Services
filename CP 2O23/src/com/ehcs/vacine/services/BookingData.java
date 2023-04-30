package com.ehcs.vacine.services;
import java.awt.BorderLayout; 
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ehcs.vacine.dao.DataBase;
import com.ehcs.vacine.dao.JtableData;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

public class BookingData extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingData frame = new BookingData();
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
	public BookingData() {
		
		JtableData jd = new JtableData(); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 75, 940, 687);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DashBoardAdmin dba= new DashBoardAdmin();
				dba.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\back.jpg"));
		lblNewLabel_2.setBounds(763, 520, 47, 44);
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 281, 755, 183);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBackground(new Color(255, 255, 255));
		jd.ShowDataInJtable("select * from CovidVaccinabooking ",table);
		
		
		JLabel lblNewLabel = new JLabel("Enter Adhar No :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(197, 136, 181, 20);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(404, 138, 241, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Mark AS Taken");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataBase db = new DataBase();
			int a =	db.markAsTaken(textField.getText());
				if(a==1) {
					JOptionPane.showMessageDialog(null, "Successfully marked ");
					jd.ShowDataInJtable("select * from CovidVaccinabooking ",table);
				}else {
					JOptionPane.showMessageDialog(null, "UnSuccessful marke ");
				}
			}
		});
		btnNewButton.setBounds(320, 222, 193, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3_2 = new JLabel("Coronavirus disease (COVID-19): Vaccines");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 25));
		lblNewLabel_3_2.setBounds(109, 11, 655, 44);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\heading.jpeg"));
		lblNewLabel_2_1.setBounds(0, 0, 926, 55);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\low_poly_banner_design_1711.jpg"));
		lblNewLabel_1.setBounds(0, 52, 926, 611);
		contentPane.add(lblNewLabel_1);
	}
}