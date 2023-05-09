package com.ehcs.e_medico.services;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ehcs.main.Select_Page;
import com.ehcs.vacine.services.Login;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class MedicineLists extends JFrame {
	public JPanel contentPane;
	ArrayList ar,ar1,ar2;
	JTextArea tt;
	public ImageIcon ii;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MedicineLists frame = new MedicineLists();
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
	public MedicineLists() {
		 ar=new ArrayList();	
		 ar1=new ArrayList ();
		 ar2=new ArrayList ();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 75, 940, 687);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0 ,0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_7_1 = new JLabel("₹ 52");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7_1.setBounds(762, 554, 88, 14);
		contentPane.add(lblNewLabel_7_1);
		
		JButton Diazepam_bt = new JButton("Diazepam");
		Diazepam_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ar.add(Diazepam_bt.getText());
				ar2.add(lblNewLabel_7_1.getText());
				ar1.add("52");
			}
		});
		
		Diazepam_bt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Diazepam_bt.setText("Add To Cart");
			}
			public void mouseExited(MouseEvent e)
			{
				Diazepam_bt.setText("Diazepam");

			}
		});
	
		Diazepam_bt.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		Diazepam_bt.setBorderPainted(false);
		Diazepam_bt.setBackground(Color.WHITE);
		Diazepam_bt.setBounds(752, 496, 128, 45);
		contentPane.add(Diazepam_bt);
		
		JLabel Diazepam = new JLabel("Diazepam");
		Diazepam.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\E Medico\\Diazepam.jpg"));
		Diazepam.setBounds(747, 332, 121, 143);
		contentPane.add(Diazepam);
		
		JLabel lblNewLabel_3_1 = new JLabel("₹ 55");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_1.setBounds(744, 252, 88, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JButton btnNewButton_3_1 = new JButton("Antihistamine");
		btnNewButton_3_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			ar.add(btnNewButton_3_1.getText());
			ar2.add(lblNewLabel_3_1.getText());
			ar1.add("42");
					
		}
		});
		btnNewButton_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_3_1.setText("Add To Cart");	
			}
			public void mouseExited(MouseEvent e)
			{
				btnNewButton_3_1.setText("Antihistamine");

			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		btnNewButton_3_1.setBorderPainted(false);
		btnNewButton_3_1.setBackground(Color.WHITE);
		btnNewButton_3_1.setBounds(725, 198, 171, 45);
		contentPane.add(btnNewButton_3_1);
		
		JLabel Sinarest_1 = new JLabel("medicine");
		Sinarest_1.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\E Medico\\Antihistamine.jpg"));
//		Sinarest_1.setToolTipText("It is used for reducing fever, cough, cold and symptoms of seasonal allergies such as blocked or stuffed nose, sneezing etc");
		Sinarest_1.setBounds(752, 21, 144, 150);
		contentPane.add(Sinarest_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.setToolTipText("Go To Back");
		btnBack.setIcon(null);
		btnBack.setBounds(10, 592, 165, 40);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Login h = new Login();
				h.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		btnBack.setBorderPainted(false);
		btnBack.setBackground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("₹ 90 ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(56, 249, 88, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("₹ 62");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(243, 253, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("₹ 50");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(438, 249, 88, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("₹ 55");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(606, 249, 88, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("₹ 38");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(56, 562, 88, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("₹ 40");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(233, 565, 88, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("₹  45");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(438, 565, 88, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("₹ 42");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_7.setBounds(606, 551, 88, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel Nise = new JLabel("Nise");
//		Nise.setToolTipText("Nise Tablet is a pain-relieving medicine");
		ii = new ImageIcon("E:\\CPP PROJECT 2023\\Images\\E Medico\\Nise Just.jpg");
		Nise.setIcon(ii);
		Nise.setBounds(46, 21, 121, 150);
		contentPane.add(Nise);
		
		JButton btnNewButton = new JButton("NISE");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
					ar.add(Nise.getText());
					ar2.add(lblNewLabel.getText());
					ar1.add("90");
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e)
			{
				btnNewButton.setText("Add To Card");
			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				btnNewButton.setText("Nise");

			}
		});
		btnNewButton.setBounds(46, 198, 121, 45);
		contentPane.add(btnNewButton);
		
		JLabel VomitebTablet = new JLabel("Vomiteb_Tablet");
//		VomitebTablet.setToolTipText("helps reduce the vomiting sensation and discomfort.");
		VomitebTablet.setIcon(new ImageIcon("E:\\\\CPP PROJECT 2023\\\\Images\\\\E Medico\\\\Vomiteb.png"));
		VomitebTablet.setBounds(233, 21, 121, 150);
		contentPane.add(VomitebTablet);
		
		JButton btnNewButton_1 = new JButton("VOMITEB");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ar.add(VomitebTablet.getText());
				ar2.add(lblNewLabel_1.getText());
				ar1.add("62");
			}
		});
		
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e)
			{
				btnNewButton_1.setText("Add To Card");
			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				btnNewButton_1.setText("Vomiteb Tablet");

			}
		});
		btnNewButton_1.setBounds(229, 198, 128, 45);
		contentPane.add(btnNewButton_1);
		
		JLabel Crocin = new JLabel("Crocin");
		Crocin.setIcon(new ImageIcon("E:\\\\CPP PROJECT 2023\\\\Images\\\\E Medico\\\\crosin just.png"));
//		Crocin.setToolTipText("provides symptomatic relief from mild to moderate pain e.g from headache, migraine, toothache and musculoskeletal pain");
		Crocin.setBounds(412, 21, 121, 150);
		contentPane.add(Crocin);
		
		JButton btnNewButton_2 = new JButton("CROCIN");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ar.add(Crocin.getText());
				ar2.add(lblNewLabel_2.getText());
				ar1.add("50");
			}
		});
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e)
			{
				btnNewButton_2.setText("Add To Card");
			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				btnNewButton_2.setText("Crocin Tablet ");

			}
		});
		btnNewButton_2.setBounds(412, 198, 121, 45);
		contentPane.add(btnNewButton_2);
		
		JLabel Sinarest = new JLabel("Sinarest");
//		Sinarest.setToolTipText("It is used for reducing fever, cough, cold and symptoms of seasonal allergies such as blocked or stuffed nose, sneezing etc");
		Sinarest.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\E Medico\\sinarest.jpg"));
		Sinarest.setBounds(567, 21, 121, 150);
		contentPane.add(Sinarest);
		
		JButton btnNewButton_3 = new JButton("SINAREST");
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ar.add(Sinarest.getText());
				ar2.add(lblNewLabel_3.getText());
				ar1.add("55");
			}
		});
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_3.setText("Add To Cart");	
			}
			public void mouseExited(MouseEvent e)
			{
				btnNewButton_3.setText("Sinarest");

			}
		});
		btnNewButton_3.setBounds(550, 198, 144, 45);
		contentPane.add(btnNewButton_3);
		
		JLabel Cheston_Cold = new JLabel("Cheston_Cold");
		Cheston_Cold.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\E Medico\\Cheston Cold.png"));
//		Cheston_Cold.setToolTipText(" It effectively relieves symptoms of the common cold such as blocked nose, runny nose, watery eyes, sneezing, and congestion or stuffiness");
		Cheston_Cold.setBounds(46, 323, 121, 143);
		contentPane.add(Cheston_Cold);
		
		JButton btnNewButton_4 = new JButton("CHESTON-COLD");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ar.add(Cheston_Cold.getText());
				ar2.add(lblNewLabel_4.getText());
				ar1.add("38");
			}
		});
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_4.setText("Add To Cart");	
			}
			public void mouseExited(MouseEvent e)
			{
				btnNewButton_4.setText("Cheston Cold");

			}
		});
		btnNewButton_4.setBounds(-6, 496, 193, 45);
		contentPane.add(btnNewButton_4);
		
		JLabel Azithromycin_Tablet = new JLabel("Azithromycin_Tablet");
//		Azithromycin_Tablet.setToolTipText("Azipro 500 Tablet is an antibiotic used to treat various types of bacterial infections of the respiratory tract, ear, nose, throat, lungs, skin, and eye in adults and children. It is also effective in typhoid fever and some sexually transmitted diseases like gonorrhea.");
		Azithromycin_Tablet.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\E Medico\\Azithromycin tablet.png"));
		Azithromycin_Tablet.setBounds(233, 323, 121, 143);
		contentPane.add(Azithromycin_Tablet);
		
		JButton btnNewButton_5 = new JButton("AZIPRO-500");
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ar.add(Azithromycin_Tablet.getText());
				ar2.add(lblNewLabel_5.getText());
				ar1.add("40");
			}
		});
		btnNewButton_5.setBounds(226, 496, 178, 45);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_5.setText("Add To Cart");	
			}
			public void mouseExited(MouseEvent e)
			{
				btnNewButton_5.setText("Azithromycin Tablet");

			}
		});
		
		JLabel Cyclopam_Tablet = new JLabel("Cyclopam_Tablet");
//		Cyclopam_Tablet.setToolTipText("Cyclopam Tablet  is commonly  <br> used for the diagnosis or treatment  <br> of Irritable bowel, Pain in stomach,  <br> Bloating, Spasms, Urine incontrolability");
		Cyclopam_Tablet.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\E Medico\\cyclopam.png"));
		Cyclopam_Tablet.setBounds(428, 323, 121, 143);
		contentPane.add(Cyclopam_Tablet);
		
		JButton btnNewButton_6 = new JButton("CYCLOPAM");
		btnNewButton_6.setBackground(new Color(240, 240, 240));
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ar.add(Cyclopam_Tablet.getText());
				ar2.add(lblNewLabel_6.getText());
				ar1.add("45");
			}
		});
		btnNewButton_6.setBounds(433, 496, 139, 45);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_6.setText("Add To Cart");	
			}
			public void mouseExited(MouseEvent e)
			{
				btnNewButton_6.setText("Cyclopam Tablet");

			}
		});
		
		JLabel Tus_Q = new JLabel("Tus_Q");
		Tus_Q.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\E Medico\\Tus-Q.png"));
//		Tus_Q.setToolTipText("Tus -Q Tablet is commonly used for \r\n the diagnosis or treatment of Cough, \r\nbronchitis, breathing difficulties, \r\ncommon cold, chest congestion.");
		Tus_Q.setBounds(596, 332, 121, 130);
		contentPane.add(Tus_Q);
		
		JButton btnNewButton_7 = new JButton("TUS-Q");
		btnNewButton_7.setBackground(new Color(255, 255, 255));
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				ar.add(Tus_Q.getText());
				ar2.add(lblNewLabel_7.getText());
				ar1.add("42");
			}
		});
		btnNewButton_7.setBounds(596, 496, 121, 45);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_7.setText("Add To Cart");
			}
			public void mouseExited(MouseEvent e)
			{
				btnNewButton_7.setText("Tus-Q ");

			}
		});
	
		JButton btnNewButton_8 = new JButton("View Cart");
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setBackground(Color.WHITE);
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	
				Cart c = new Cart(ar,ar1,ar2);
				c.setVisible(true);
			}
		});
		btnNewButton_8.setBounds(596, 593, 178, 40);
		contentPane.add(btnNewButton_8);
		
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\E Medico\\mlist.png"));
		lblNewLabel_8.setBounds(0, 0, 926, 662);
		contentPane.add(lblNewLabel_8);
		
			}
public void clr()
{
	ar.clear();
	ar1.clear();
	ar2.clear();	
}
}