package com.ehcs.e_medico.services;

import java.awt.Color; 
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import com.ehcs.vacine.services.Login;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cart extends JFrame {

	private static final long serialVersionUID = -2409059355684017614L;
	static String name;
	static String adrress;
	static String email;
	String id1;
	@SuppressWarnings("rawtypes")
	ArrayList ab,  ab1;
	
	public void Cart1(String id) {
		id = id1;

	}

	public Cart(ArrayList a, ArrayList a1, ArrayList a2) {
		ab=a;
		ab1=a1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 0, 950, 800);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		lblNewLabel_4_1_1.setBounds(833, 674, 47, 44);
		contentPane.add(lblNewLabel_4_1_1);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
//		panel.setBounds(149, 155, 649, 451);
//		contentPane.add(panel);
		
		JScrollPane scroll = new JScrollPane(panel);
		scroll.setBounds(149, 155, 650, 451);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);  
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        contentPane.add(scroll);  
		
		int len =-1;
		len += a.size();
		panel.setLayout(new GridLayout(1+len, a.size(), 3, 3));

		int sum = 0;
		for (int i = 0; i < a.size(); i++) {
			JLabel lblNewLabel_1 = new JLabel("" + a.get(i));
			lblNewLabel_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 255), new Color(255, 0, 0),
					new Color(0, 255, 0), new Color(34, 139, 34)));
					lblNewLabel_1.setVerticalAlignment(SwingConstants.CENTER);
			panel.add(lblNewLabel_1);

			JLabel lblNewLabel_2 = new JLabel("" + a2.get(i));
			lblNewLabel_2.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 255), new Color(255, 0, 0),
					new Color(0, 255, 0), new Color(34, 139, 34)));
			lblNewLabel_2.setVerticalAlignment(SwingConstants.CENTER);
			panel.add(lblNewLabel_2);

			sum += Integer.parseInt((String) a1.get(i));
		}
		
		
		JLabel label = new JLabel("" + sum);
		label.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		label.setBounds(713, 626, 85, 36);
		label.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.add(label);

		JLabel lblNewLabel = new JLabel("Total Price ");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel.setBounds(149, 626, 113, 36);
		contentPane.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 255));
		panel_1.setBounds(0, 0, 936, 133);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("E-HEALTH CARE SERVICES ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(256, 10, 467, 58);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("ALWAYS CARING , ALWAYS HERE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(351, 77, 290, 30);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\E Medico\\WhatsApp_Image_2022-11-26_at_1-removebg-preview.png"));
		lblNewLabel_3.setBounds(10, 0, 222, 133);
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("ORDER  NOW");
		btnNewButton.setFocusTraversalPolicyProvider(true);
		btnNewButton.setFocusCycleRoot(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "YOUR ORDER HAS BEEN CONFIRMED");
				 String email=JOptionPane.showInputDialog(null,"Enter E-mail");     
				 System.out.print(email);
				 EmailSending em = new EmailSending();
	    		 em.sendEmail(email,ab,ab1);
				btnNewButton.setEnabled(false);

			}
		});
		btnNewButton.setBounds(630, 689, 169, 43);
		contentPane.add(btnNewButton);
		
		JButton btnCancelOrderNow = new JButton("CANCEL ORDER  NOW");
		btnCancelOrderNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				a.clear();
				a1.clear();
				a2.clear();
				MedicineLists ml = new MedicineLists();
				ml.clr();
				JOptionPane.showMessageDialog(btnCancelOrderNow,"Your Order Has Been Canceled");
				ml.setVisible(true);
				setVisible(false);
			}
		});
		btnCancelOrderNow.setForeground(Color.BLACK);
		btnCancelOrderNow.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		btnCancelOrderNow.setFocusTraversalPolicyProvider(true);
		btnCancelOrderNow.setFocusCycleRoot(true);
		btnCancelOrderNow.setBorderPainted(false);
		btnCancelOrderNow.setBackground(Color.CYAN);
		btnCancelOrderNow.setBounds(149, 689, 255, 43);
		contentPane.add(btnCancelOrderNow);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("E:\\CPP PROJECT 2023\\Images\\vaccine\\water-1330252_1280.jpg"));
		lblNewLabel_4.setBounds(-12, 127, 948, 648);
		contentPane.add(lblNewLabel_4);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String id = null;
					ArrayList a = new ArrayList();
					ArrayList a1 = new ArrayList();
					ArrayList a2 = new ArrayList();
					Cart frame = new Cart(a, a1, a2);
//					Cart frame1 = new Cart(id);
					frame.setVisible(true);
//					frame.C;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}