package com.ehcs.main;

import java.awt.Dimension; 
import java.awt.EventQueue; 
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.ehcs.e_medico.services.MedicineLists;
import com.ehcs.vacine.services.DashBoard;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Select_Page extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String adhar = null;
					Select_Page frame = new Select_Page(adhar);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Select_Page(String adhar ) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 0, 940, 687);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setSize(new Dimension(900, 700));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("BUY MEDICINE");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				MedicineLists ml = new MedicineLists();
				ml.setVisible(true);
				setVisible(false);	
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNewLabel_3.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\buy_medicine.png"));
		lblNewLabel_3.setBounds(495, 82, 395, 431);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_2 = new JLabel("E-HEALTH CARE SERVICES ");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Dialog", Font.BOLD, 25));
		lblNewLabel_3_2.setBounds(230, 0, 389, 44);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\heading.jpeg"));
		lblNewLabel_2_1.setBounds(0, 0, 924, 55);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNewLabel_2.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\let-s-get-vaccinated.jpg"));
		lblNewLabel_2.setBounds(75, 82, 395, 431);
		contentPane.add(lblNewLabel_2);
		btnNewButton.setBounds(495, 537,  395, 47);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		contentPane.add(btnNewButton);
		JButton btnVaccine = new JButton("BOOK VACCINE ");
		btnVaccine.setBackground(new Color(72, 209, 204));
		btnVaccine.setBorderPainted(false);
		
		btnVaccine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				DashBoard r = new DashBoard(adhar);
				r.setVisible(true);
				setVisible(false);	
			}
		});
		btnVaccine.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnVaccine.setBounds(75, 537, 395, 47);
		contentPane.add(btnVaccine);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\low_poly_banner_design_1711.jpg"));
		lblNewLabel.setBounds(0, 54, 924, 594);
		contentPane.add(lblNewLabel);
	}
}