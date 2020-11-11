package com.medicalAssistant;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField lT1;
	private JTextField lT2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lL1 = new JLabel("Login");
		lL1.setHorizontalAlignment(SwingConstants.CENTER);
		lL1.setBounds(179, 11, 46, 14);
		contentPane.add(lL1);
		
		JLabel lL2 = new JLabel("User");
		lL2.setHorizontalAlignment(SwingConstants.CENTER);
		lL2.setBounds(25, 52, 46, 14);
		contentPane.add(lL2);
		
		JLabel lL3 = new JLabel("Pass");
		lL3.setHorizontalAlignment(SwingConstants.CENTER);
		lL3.setBounds(25, 105, 46, 14);
		contentPane.add(lL3);
		
		lT1 = new JTextField();
		lT1.setBounds(122, 49, 86, 20);
		contentPane.add(lT1);
		lT1.setColumns(10);
		
		lT2 = new JTextField();
		lT2.setBounds(122, 102, 86, 20);
		contentPane.add(lT2);
		lT2.setColumns(10);
		
		JButton lB1 = new JButton("Go");
		lB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=lT1.getText();
				if(str1.equals("Anup")||str1.equals("Emon")||str1.equals("Jami"))
				{	//FirstPage fp=new FirstPage();
					//fp.setVisible(true);
					new FirstPage(str1).setVisible(true);
				}
				else
				{
					lB1.setText("Invalid");
					lB1.disable();
				}
			}
		});
		lB1.setBounds(316, 209, 89, 23);
		contentPane.add(lB1);
	}
}
