//this page for Hospital
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
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class SecondPage extends JFrame {

	private JPanel contentPane;
	private JTextField sT1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondPage frame = new SecondPage();
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
	public SecondPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel sL1 = new JLabel("Hospital");
		sL1.setHorizontalAlignment(SwingConstants.CENTER);
		sL1.setBounds(173, 11, 46, 14);
		contentPane.add(sL1);
		
		JLabel sL2 = new JLabel("SearchByAddress");
		sL2.setHorizontalAlignment(SwingConstants.CENTER);
		sL2.setBounds(10, 53, 142, 14);
		contentPane.add(sL2);
		
		JLabel sL3 = new JLabel("SearchByHospital");
		sL3.setHorizontalAlignment(SwingConstants.CENTER);
		sL3.setBounds(282, 53, 118, 14);
		contentPane.add(sL3);
		
		sT1 = new JTextField();
		sT1.setHorizontalAlignment(SwingConstants.CENTER);
		sT1.setBounds(161, 90, 86, 20);
		contentPane.add(sT1);
		sT1.setColumns(10);
		
		JButton sB1 = new JButton("Next");
		sB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=sT1.getText();
				if(str1.equals("1"))
				{
					try
					{
						
						str1="select * from Hospital where address='Uttara'";
						Class.forName("oracle.jdbc.driver.OracleDriver");
						java.sql.Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba", "mydatabase");
						Statement st=con.createStatement();
						String sql=str1;
						ResultSet rs= st.executeQuery(sql);
						ResultSetMetaData md = rs.getMetaData();
						int c=md.getColumnCount();
						while(rs.next())
						{
							System.out.println(rs.getString(1)+" "+rs.getString(2));
							//System.out.println("Found");
						}
						//System.out.println("Found")
					}
					catch(Exception f)
					{
						System.out.println(f);
					}

				}
				else if(str1.equals("3"))
				{
					str1="select * from Hospital where name='Birdem'";
					try
					{
						
						Class.forName("oracle.jdbc.driver.OracleDriver");
						java.sql.Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba", "mydatabase");
						Statement st=con.createStatement();
						String sql=str1;
						ResultSet rs= st.executeQuery(sql);
						ResultSetMetaData md = rs.getMetaData();
						int c=md.getColumnCount();
						while(rs.next())
						{
							System.out.println(rs.getString(1)+" "+rs.getString(2));
							//System.out.println("Found");
						}
						//System.out.println("Found")
					}
					catch(Exception f)
					{
						System.out.println(f);
					}
					
				}
				else if(str1.equals("2"))
				{
					try
					{
						
						Class.forName("oracle.jdbc.driver.OracleDriver");
						java.sql.Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba", "mydatabase");
						Statement st=con.createStatement();
						String sql="select * from Hospital";
						ResultSet rs= st.executeQuery(sql);
						ResultSetMetaData md = rs.getMetaData();
						int c=md.getColumnCount();
						while(rs.next())
						{
							System.out.println(rs.getString(1)+" "+rs.getString(2));
							//System.out.println("Found");
						}
						//System.out.println("Found")
					}
					catch(Exception f)
					{
						System.out.println(f);
					}
					
				}
				
			}
		});
		sB1.setBounds(312, 164, 89, 23);
		contentPane.add(sB1);
		
		JButton sB2 = new JButton("Back");
		sB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPage fp= new FirstPage("");
				fp.setVisible(true);
			}
		});
		sB2.setBounds(10, 164, 89, 23);
		contentPane.add(sB2);
		
		JLabel sL4 = new JLabel("All");
		sL4.setHorizontalAlignment(SwingConstants.CENTER);
		sL4.setBounds(173, 53, 46, 14);
		contentPane.add(sL4);
	}

}
