package com.bloodDonation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class bloodDonor extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bloodDonor frame = new bloodDonor();
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
	public bloodDonor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Please Fill Up The Form");
		label1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(102, 11, 208, 14);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("FullName");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setBounds(10, 62, 98, 14);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel("BloodGroup");
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setBounds(10, 102, 98, 14);
		contentPane.add(label3);
		
		JLabel label4 = new JLabel("Weight");
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setBounds(10, 152, 98, 14);
		contentPane.add(label4);
		
		JLabel label5 = new JLabel("Contact");
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setBounds(10, 204, 98, 14);
		contentPane.add(label5);
		
		text1 = new JTextField();
		text1.setHorizontalAlignment(SwingConstants.CENTER);
		text1.setBounds(118, 59, 86, 20);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setHorizontalAlignment(SwingConstants.CENTER);
		text2.setBounds(118, 99, 86, 20);
		contentPane.add(text2);
		text2.setColumns(10);
		
		text3 = new JTextField();
		text3.setHorizontalAlignment(SwingConstants.CENTER);
		text3.setBounds(118, 149, 86, 20);
		contentPane.add(text3);
		text3.setColumns(10);
		
		text4 = new JTextField();
		text4.setHorizontalAlignment(SwingConstants.CENTER);
		text4.setBounds(118, 201, 86, 20);
		contentPane.add(text4);
		text4.setColumns(10);
		
		JButton button1 = new JButton("Done");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fullName=text1.getText();
				String bloodGroup=text2.getText();
				String weight=text3.getText();
				String contact=text4.getText();
				try
				{
					
					String str="insert into Donor(name,bloodGroup,weight,contact)values(?,?,?,?)";
					Class.forName("oracle.jdbc.driver.OracleDriver");
					java.sql.Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba", "mydatabase");
					PreparedStatement ps=null;
					ps=con.prepareStatement(str);
					ps.setString(1, fullName);
					ps.setString(2, bloodGroup);
					ps.setString(3, weight);
					ps.setString(4, contact);
					ps.executeUpdate();
				
					
					
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
				
			}
		});
		button1.setBounds(335, 227, 89, 23);
		contentPane.add(button1);
	}

}
