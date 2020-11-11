package com.bloodDonation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("LogIn");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(173, 11, 46, 14);
		contentPane.add(label1);
		
		text1 = new JTextField();
		text1.setHorizontalAlignment(SwingConstants.CENTER);
		text1.setBounds(149, 58, 86, 20);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setHorizontalAlignment(SwingConstants.CENTER);
		text2.setBounds(149, 122, 86, 20);
		contentPane.add(text2);
		text2.setColumns(10);
		
		JLabel label2 = new JLabel("UserName");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setBounds(10, 61, 105, 14);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("Password");
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setBounds(10, 125, 96, 14);
		contentPane.add(label3);
		
		JButton button1 = new JButton("LogIn");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String uName=text1.getText();
				String pass=text2.getText();
				if((uName.equals("Raka") && pass.equals("1111"))||uName.equals("Sadia") && pass.equals("2222"))
				{
					new Home(uName).setVisible(true);
				}
				else
				{
					button1.setText("Invalid");
					button1.disable();
				}
			}
		});
		button1.setBounds(310, 227, 89, 23);
		contentPane.add(button1);
	}
}
