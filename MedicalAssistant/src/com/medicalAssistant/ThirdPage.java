//this page for Doctor

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
import java.awt.event.ActionEvent;

public class ThirdPage extends JFrame {

	private JPanel contentPane;
	private JTextField tT1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThirdPage frame = new ThirdPage();
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
	public ThirdPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tL1 = new JLabel("Doctor");
		tL1.setHorizontalAlignment(SwingConstants.CENTER);
		tL1.setBounds(168, 11, 46, 14);
		contentPane.add(tL1);
		
		JLabel tL2 = new JLabel("SearchByName");
		tL2.setHorizontalAlignment(SwingConstants.CENTER);
		tL2.setBounds(10, 73, 141, 14);
		contentPane.add(tL2);
		
		JLabel tL3 = new JLabel("SearchBySpeciality");
		tL3.setHorizontalAlignment(SwingConstants.CENTER);
		tL3.setBounds(272, 73, 141, 14);
		contentPane.add(tL3);
		
		tT1 = new JTextField();
		tT1.setHorizontalAlignment(SwingConstants.CENTER);
		tT1.setBounds(169, 100, 86, 20);
		contentPane.add(tT1);
		tT1.setColumns(10);
		
		JButton tB1 = new JButton("Back");
		tB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FirstPage fp=new FirstPage("");
				fp.setVisible(true);
			}
		});
		tB1.setBounds(22, 193, 89, 23);
		contentPane.add(tB1);
		
		JButton tB2 = new JButton("Next");
		tB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=tT1.getText();
				if(str1.equals("1"))
				{
					str1="select * from Doctor where dname='M R Khan'";
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
							System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
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
					str1="select * from Doctor where speciality='Medicine'";
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
							System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
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
						String sql="select * from Doctor";
						ResultSet rs= st.executeQuery(sql);
						ResultSetMetaData md = rs.getMetaData();
						int c=md.getColumnCount();
						while(rs.next())
						{
							System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
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
		tB2.setBounds(300, 193, 89, 23);
		contentPane.add(tB2);
		
		JLabel tL4 = new JLabel("All");
		tL4.setHorizontalAlignment(SwingConstants.CENTER);
		tL4.setBounds(168, 73, 46, 14);
		contentPane.add(tL4);
	}

}
