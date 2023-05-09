package com.ehcs.vacine.services;

import java.awt.EventQueue;  
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.ehcs.vacine.dao.DataBase;
import javax.swing.border.MatteBorder;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VaccineBooking extends JFrame {
	private JTextField phno;
	public int a;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VaccineBooking frame = new VaccineBooking("");
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
	public VaccineBooking(String Adhar) {
		
		DataBase Db = new DataBase();
		Db.getDetails(Adhar);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 75, 940, 687);
		JPanel contentPane = new JPanel();
		contentPane.setToolTipText("Select Center");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				DashBoard db = new DashBoard(Adhar);
				db.setVisible(true);
			}
		});
		lblNewLabel_7.setIcon(new ImageIcon("E:\\cp\\CPP PROJECT 2023\\Images\\vaccine\\back.jpg"));
		lblNewLabel_7.setBounds(738, 452, 54, 44);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_3_2 = new JLabel("E-HEALTH CARE SERVICES");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 25));
		lblNewLabel_3_2.setBounds(280, 10, 347, 44);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\heading.jpeg"));
		lblNewLabel_2.setBounds(0, 0, 926, 55);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Enter Your Phone NO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(176, 212, 177, 19);
		contentPane.add(lblNewLabel);
		
		phno = new JTextField();
		phno.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		phno.setOpaque(false);
		phno.setFont(new Font("Tahoma", Font.BOLD, 16));
		phno.setBounds(390, 198, 177, 34);
		contentPane.add(phno);
		phno.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Select Your Vaccine");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(176, 275, 168, 19);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Covishild");
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnNewRadioButton.setBounds(392, 275, 105, 25);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Covaxin");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnNewRadioButton_1.setBounds(392, 313, 105, 25);
		contentPane.add(rdbtnNewRadioButton_1);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton);
		
		JLabel pno_error = new JLabel("New label");
		pno_error.setFont(new Font("Tahoma", Font.BOLD, 13));
		pno_error.setForeground(Color.RED);
		pno_error.setBounds(516, 224, 163, 44);
		pno_error.setVisible(false);
		contentPane.add(pno_error);
		
		JLabel lblNewLabel_5 = new JLabel("*Select Center");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBounds(505, 374, 116, 14);
		lblNewLabel_5.setVisible(false);
		contentPane.add(lblNewLabel_5);
		
		JLabel vaccine_error1 = new JLabel("New label");
		vaccine_error1.setFont(new Font("Tahoma", Font.BOLD, 13));
		vaccine_error1.setForeground(Color.RED);
		vaccine_error1.setBounds(505, 279, 156, 44);
		vaccine_error1.setVisible(false);
		contentPane.add(vaccine_error1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Center", "CNS Hospital", "Shiv Santoshi Hospital", "CIVIL Hospital", ""}));
		comboBox.setBounds(391, 393, 230, 34);
		contentPane.add(comboBox);
		
		
		JButton btnNewButton = new JButton("BOOK ");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String vaccine= "";
				int c = 0;
			if(phno.getText()==" ") {
				pno_error.setText("Enter Your Phone No");
				pno_error.setVisible(true);
				c=1;
			}else
			if(phno.getText().equals(Db.PHONE))
				{
				DashBoard db = new DashBoard(Adhar);
				LocalDate dob = LocalDate.parse(Db.dob);  
				int age = db.calculateAge(dob);
				if(!rdbtnNewRadioButton.isSelected()&&!rdbtnNewRadioButton_1.isSelected())
				{
					vaccine_error1.setText("Select Your Vaccine ");
					vaccine_error1.setVisible(true);
					c=1;
				}
			
				if(rdbtnNewRadioButton.isSelected()) {
					vaccine="Covishild";
				}
				else {
					vaccine="Covaxin";
				}
				//vaccine= group.getSelection().getActionCommand();
				System.out.println(vaccine);
				if(vaccine=="Covishild")
				{
					if(age>=18)
					{
					a=1;
					rdbtnNewRadioButton.setSelected(true);
					
					}
					else
					{
						JOptionPane.showMessageDialog(null, "YOU ARE UNDER 18 You Have TO Take Covaxin ");
						rdbtnNewRadioButton_1.setSelected(true);
						
					}
					if(comboBox.getSelectedIndex()==0)
					{
						lblNewLabel_5.setVisible(true);
						c=1;
					}
					
					
				}
				}else {
					pno_error.setText("*Enter Registred Number ");
					pno_error.setVisible(true);
					c=1;
			}
			if(c==0) {
				   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
				   LocalDateTime now = LocalDateTime.now(); 
				Db.getDetails( Adhar);
				String vaccine_status ="";
				int vs = 0;
				if (Db.FIRST_DOSE==null)
				{
					vaccine_status = " First Dose ";
					vs=1;
					
				}
				else if (Db.FIRST_DOSE=="Taken" && Db.SECOND_DOSE==null)
				{
					vaccine_status = " Second Dose ";
					vs=2;

				}
				else if (Db.FIRST_DOSE=="Taken" && Db.SECOND_DOSE=="Taken" && Db.BOOSTER_DOSE==null)
				{
					vaccine_status = " Booster Dose ";
					vs = 3;

				}
				boolean b=SendOTP.sendOTP("\t\t\t\t E-HEALTH CARE SERVICES \n\n\nDear "+Db.name + ",\n\n\t\t Your Vaccine Is Successfully Booked.\n\n\t\t Booking Date: "+dtf.format(now) ,Db.EMAIL,"Vaccine Status");
				if(b==false) {
					JOptionPane.showMessageDialog(null, "Unsuccessful To Send An OTP  ");
				}else {
//						DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
//					   LocalDateTime now = LocalDateTime.now();   
					  Db.avaiblity(vaccine , comboBox.getSelectedItem().toString(),Adhar,dtf.format(now));
				}
				
			
			}
			Login lg = new Login ();
			lg.setVisible(true);
			setVisible(false);
			}
			
		});
		btnNewButton.setBounds(340, 510, 116, 49);
		contentPane.add(btnNewButton);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Select Your Center ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(176, 402, 168, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Vaccine Booking");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 19));
		lblNewLabel_4.setBounds(340, 83, 166, 49);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setOpaque(true);
		lblNewLabel_4_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		lblNewLabel_4_1.setIcon(null);
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4_1.setBounds(323, 83, 193, 49);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("");
		lblNewLabel_4_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				DashBoard db = new DashBoard(Adhar);
				db.setVisible(true);
			}
		});
		lblNewLabel_4_1_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\back.jpg"));
		lblNewLabel_4_1_1.setBounds(614, 570, 47, 44);
		contentPane.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\VaccBook (Custom).jpg"));
		lblNewLabel_6.setBounds(0, 55, 926, 595);
		contentPane.add(lblNewLabel_6);
		
	}
}