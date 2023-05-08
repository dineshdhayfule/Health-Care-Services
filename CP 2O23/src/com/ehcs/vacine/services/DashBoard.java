package com.ehcs.vacine.services;

import java.awt.BorderLayout; 
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;

import com.ehcs.e_medico.services.MedicineLists;
import com.ehcs.vacine.dao.DataBase;

import javax.swing.JLayeredPane;
import java.awt.Label;
import javax.swing.SwingConstants;

public class DashBoard extends JFrame {
	
	private JPanel contentPane;
	private JButton btnNewButton,btnNewButton10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard frame = new DashBoard("");
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
	
	
	public static int calculateAge(LocalDate dob)   
	{  
	//creating an instance of the LocalDate class and invoking the now() method      
	//now() method obtains the current date from the system clock in the default time zone      
	LocalDate curDate = LocalDate.now();  
	//calculates the amount of time between two dates and returns the years  
	if ((dob != null) && (curDate != null))   
	{  
	return Period.between(dob, curDate).getYears();  
	}  
	else  
	{  
	return 0;  
	}  
	}  
	
	
	public DashBoard(String Adhar) {
		
		DataBase db = new DataBase();
		db.getDetails(Adhar);
		db.bookingCheck(Adhar);
		setTitle("User Dash Board");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 75, 957, 729);//
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Book");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(377, 614, 229, 34);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VaccineBooking vb = new VaccineBooking(Adhar);
				vb.setVisible(true);
				setVisible(false);
			}
		});
		
		JLabel lblNewLabel_4_1_1 = new JLabel("");
		lblNewLabel_4_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				Login h = new Login();
				h.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_4_1_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\back.jpg"));
		lblNewLabel_4_1_1.setBounds(886, 638, 47, 44);
		contentPane.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("");
		lblNewLabel_11_1_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\right.png"));
		lblNewLabel_11_1_1.setBounds(652, 487, 64, 62);
		contentPane.add(lblNewLabel_11_1_1);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("New label");
		lblNewLabel_9_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9_1_1.setBounds(632, 559, 189, 20);
		contentPane.add(lblNewLabel_9_1_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 86, 219, 452);
		panel.setBackground(Color.WHITE);
		panel.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setVisible(false);
		
		JLabel lblNewLabel_14 = new JLabel("Username");
		lblNewLabel_14.setBounds(136, 23, 94, 14);
		panel.add(lblNewLabel_14);
		lblNewLabel_14.setVisible(false);
		
		JLabel lblNewLabel = new JLabel(Adhar);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_14.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_14.setVisible(false);
			}
		});
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel.setBounds(59, 21, 150, 19);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(db.name);
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_1.setBounds(59, 51, 150, 19);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(db.EMAIL);
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_2.setBounds(59, 91, 150, 19);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(db.GENDER);
		lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_3.setBounds(59, 121, 150, 19);
		panel.add(lblNewLabel_3);
		
		
		JLabel lblNewLabel_3_1 = new JLabel(db.PHONE);
		lblNewLabel_3_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_3_1.setBounds(59, 162, 150, 19);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("Edit Profile");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EditProfile ep = new EditProfile(Adhar);
				ep.setVisible(true);
				setVisible(false);
				
			}
		});
		lblNewLabel_3_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_3_3.setBounds(59, 314, 78, 19);
		panel.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("LOG OUT");
		lblNewLabel_3_3_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3_3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login n = new Login();
				n.setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_3_3_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_3_3_2.setBounds(59, 354, 78, 19);
		panel.add(lblNewLabel_3_3_2);
		
		JLabel lblNewLabel_5 = new JLabel("BOOK");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VaccineBooking vb = new VaccineBooking(Adhar);
				vb.setVisible(true);
				setVisible(false);
				
			}
		});
		
		
		JLabel lblNewLabel_3_3_2_1 = new JLabel("Cancel");
		lblNewLabel_3_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_3_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			panel.setVisible(false);
				
			}
		});
		lblNewLabel_3_3_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		lblNewLabel_3_3_2_1.setBounds(59, 413, 78, 19);
		panel.add(lblNewLabel_3_3_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\log out.png"));
		lblNewLabel_4.setBounds(10, 343, 30, 30);
		panel.add(lblNewLabel_4);
		
		
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_5.setBounds(58, 206, 151, 19);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\edit.png"));
		lblNewLabel_6.setBounds(10, 303, 30, 30);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\cancle.png"));
		lblNewLabel_7.setBounds(10, 402, 25, 30);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\profiel_icon.png"));
		lblNewLabel_13.setBounds(10, 11, 40, 26);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\mail.png"));
		lblNewLabel_15.setBounds(10, 83, 30, 27);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\id.png"));
		lblNewLabel_16.setBounds(13, 51, 46, 22);
		panel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\male (1).png"));
		lblNewLabel_17.setBounds(10, 121, 30, 30);
		panel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\phone.png"));
		lblNewLabel_18.setBounds(10, 162, 30, 30);
		panel.add(lblNewLabel_18);
		
		JLabel lblNewLabel_18_1 = new JLabel("");
		lblNewLabel_18_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\male (1).png"));
		lblNewLabel_18_1.setBounds(10, 112, 46, 42);
		panel.add(lblNewLabel_18_1);
		
		JLabel lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\book.png"));
		lblNewLabel_19.setBounds(10, 206, 30, 30);
		panel.add(lblNewLabel_19);
		
		JSeparator separator = new JSeparator();
		separator.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		separator.setBounds(132, 84, 735, 547);
		contentPane.add(separator);
		
		JLabel lblNewLabel_10_2_1_1 = new JLabel("Not Taken ");
		lblNewLabel_10_2_1_1.setForeground(Color.RED);
		lblNewLabel_10_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_10_2_1_1.setBounds(620, 435, 201, 28);
		contentPane.add(lblNewLabel_10_2_1_1);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("Booster Dose");
		lblNewLabel_10_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10_1_1.setBounds(642, 383, 125, 28);
		contentPane.add(lblNewLabel_10_1_1);
		
		JLabel status_name_1 = new JLabel("  YOUR VACCINATION STATUS");
		status_name_1.setBackground(Color.WHITE);
		status_name_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		status_name_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		status_name_1.setBounds(388, 57, 235, 28);
		contentPane.add(status_name_1);
		
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			}
		});
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("");
		lblNewLabel_3_3_1.setBounds(0, 51, 39, 34);
		contentPane.add(lblNewLabel_3_3_1);
		lblNewLabel_3_3_1.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("unlikely-arg-type")
			@Override
			public void mouseClicked(MouseEvent e) {
				if(panel.isVisible()==true)
				{
					panel.setVisible(false);
				}
				panel.setVisible(true);
				if(lblNewLabel_3.getText().equals("Male")) 
				{
					lblNewLabel_17.setVisible(true);
					lblNewLabel_18_1.setVisible(false);
					
				}
				else 
				{
					lblNewLabel_18_1.setVisible(true);
					lblNewLabel_17.setVisible(false);
				}
				
			}
		});
		lblNewLabel_3_3_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\menu_icon1.jpg"));
		
		JLabel lblNewLabel_3_2 = new JLabel("E-HEALTH CARE SERVICES ");
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("Perpetua Titling MT", Font.BOLD, 25));
		lblNewLabel_3_2.setBounds(297, 5, 488, 44);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\heading.jpeg"));
		lblNewLabel_2_1.setBounds(0, 0, 941, 55);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setBounds(388, 70, 235, 20);
		contentPane.add(lblNewLabel_8);
		
		JLabel status_name = new JLabel(db.name);
		status_name.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 15));
		status_name.setBorder(new LineBorder(new Color(0, 0, 0)));
		status_name.setBounds(388, 318, 229, 28);
		contentPane.add(status_name);
		
		JLabel lblNewLabel_10 = new JLabel("Dose 1");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(288, 383, 85, 28);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_10_1 = new JLabel("Dose 2");
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10_1.setBounds(477, 383, 85, 28);
		contentPane.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("Successfully Taken ");
		lblNewLabel_10_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_10_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_10_2.setBounds(229, 436, 170, 28);
		contentPane.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_10_2_1 = new JLabel("Not Taken ");
		lblNewLabel_10_2_1.setForeground(Color.RED);
		lblNewLabel_10_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_10_2_1.setBounds(427, 437, 170, 28);
		contentPane.add(lblNewLabel_10_2_1);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\right.png"));
		lblNewLabel_11.setBounds(272, 487, 64, 62);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_11_1 = new JLabel("");
		lblNewLabel_11_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\X.png"));
		lblNewLabel_11_1.setBounds(477, 487, 64, 62);
		contentPane.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setBounds(184, 560, 215, 20);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("New label");
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9_1.setBounds(427, 559, 189, 20);
		contentPane.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("");
		lblNewLabel_8_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\kindpng_1468338-modified-modified.png"));
		lblNewLabel_8_1.setBounds(409, 127, 181, 180);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\db2.jpg"));
		lblNewLabel_12.setBounds(0, 51, 941, 639);
		contentPane.add(lblNewLabel_12);
		if(db.FIRST_DOSE==null && db.SECOND_DOSE==null && db.BOOSTER_DOSE==null)
		{
			lblNewLabel_11.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\X.png"));
			lblNewLabel_11_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\X.png"));
			lblNewLabel_11_1_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\X.png"));
		    lblNewLabel_10_2_1.setText("    Not Taken ");
		    lblNewLabel_10_2_1.setForeground(Color.RED);
		    lblNewLabel_10_2.setText("    Not Taken ");
		    lblNewLabel_10_2.setForeground(Color.RED);
		    lblNewLabel_10_2_1_1.setText("    Not Taken ");
		    lblNewLabel_10_2_1_1.setForeground(Color.RED);
		    lblNewLabel_9.setVisible(false);
		    lblNewLabel_9_1.setVisible(false);
		    lblNewLabel_9_1_1.setVisible(false);

		    btnNewButton.setText("BOOK YOUR FIRST VACCINE");
		}
		else if(db.FIRST_DOSE.equals("Taken") && db.SECOND_DOSE==null ) {
			lblNewLabel_11.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\right.png"));
			lblNewLabel_10_2.setText("Successfully Taken ");
			lblNewLabel_10_2.setForeground(Color.BLACK);
			lblNewLabel_11_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\X.png"));
			lblNewLabel_11_1_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\X.png"));
		    lblNewLabel_10_2_1.setText("    Not Taken ");
		    lblNewLabel_10_2_1.setForeground(Color.RED);
		    lblNewLabel_10_2_1_1.setText("    Not Taken ");
		    lblNewLabel_10_2_1_1.setForeground(Color.RED);
		    lblNewLabel_9.setText("Taken on "+db.FIRST_DOSE_DATE);
		    lblNewLabel_9_1.setVisible(false);
		    lblNewLabel_9_1_1.setVisible(false);
		    btnNewButton.setText("BOOK YOUR SECOND VACCINE");
		}
		else if(db.FIRST_DOSE.equals("Taken")&&db.SECOND_DOSE.equals("Taken") && db.BOOSTER_DOSE==null ) {
			lblNewLabel_11.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\right.png"));			
			lblNewLabel_11_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\right.png"));
			lblNewLabel_11_1_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\X.png"));
			lblNewLabel_10_2.setText("Successfully Taken ");
			lblNewLabel_10_2.setForeground(Color.BLACK);
		    lblNewLabel_10_2_1.setText("Successfully Taken ");
		    lblNewLabel_10_2_1.setForeground(Color.BLACK);
		    lblNewLabel_10_2_1_1.setText("    Not Taken ");
		    lblNewLabel_10_2_1_1.setForeground(Color.RED);
		    lblNewLabel_9.setText("Taken on "+db.FIRST_DOSE_DATE);
		    lblNewLabel_9_1.setText("Taken on "+db.SECON_DOSE_DATE);
		    lblNewLabel_9_1_1.setVisible(false);
		    btnNewButton.setText("BOOK YOUR Booster Dose");
		}	
		else if(db.FIRST_DOSE.equals("Taken") && db.SECOND_DOSE.equals("Taken") && db.BOOSTER_DOSE.equals("Taken")){			
			lblNewLabel_11.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\right.png"));
			lblNewLabel_11_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\right.png"));
			lblNewLabel_11_1_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\right.png"));
		    lblNewLabel_10_2_1.setText("Successfully Taken");
		    lblNewLabel_10_2.setText("Successfully Taken"); 
		    lblNewLabel_10_2_1_1.setText("Successfully Taken");
			lblNewLabel_10_2.setForeground(Color.BLACK);
		    lblNewLabel_10_2_1.setForeground(Color.BLACK);
		    lblNewLabel_10_2_1_1.setForeground(Color.BLACK);
		    lblNewLabel_9.setText("Taken on "+db.FIRST_DOSE_DATE);
		    lblNewLabel_9_1.setText("Taken on "+db.SECON_DOSE_DATE);
		    lblNewLabel_9_1_1.setText("Taken on "+db.BOOSTER_DOSE_DATE);
		    btnNewButton.setVisible(false);
		    lblNewLabel_5.setText("Buy Medicine");
		    lblNewLabel_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					MedicineLists vb = new MedicineLists();
					vb.setVisible(true);
					setVisible(false);
					
				}
			});
		    btnNewButton10 = new JButton("Buy Medicine");
			btnNewButton10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					MedicineLists vb = new MedicineLists();
					vb.setVisible(true);
					setVisible(false);
				}
			});
			btnNewButton10.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnNewButton10.setBackground(Color.BLUE);
			btnNewButton10.setForeground(Color.WHITE);
			btnNewButton10.setBounds(377, 614, 229, 34);
			contentPane.add(btnNewButton10);
		}
		
}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}