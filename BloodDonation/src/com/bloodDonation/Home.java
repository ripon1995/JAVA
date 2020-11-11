package com.bloodDonation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	public Home(String uName) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Blood Donor");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(10, 55, 106, 14);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Blood Reciever");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setBounds(10, 115, 106, 14);
		contentPane.add(label2);
		
		JButton button1 = new JButton("Go");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new bloodDonor().setVisible(true);
			}
		});
		button1.setBounds(161, 51, 89, 23);
		contentPane.add(button1);
		
		JButton button2 = new JButton("Go");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new bloodReciever().setVisible(true);
			}
		});
		button2.setBounds(161, 111, 89, 23);
		contentPane.add(button2);
	}

}
