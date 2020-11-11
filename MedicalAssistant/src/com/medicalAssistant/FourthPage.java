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

public class FourthPage extends JFrame {

	private JPanel contentPane;
	private JTextField foT1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FourthPage frame = new FourthPage();
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
	public FourthPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel foL1 = new JLabel("BloodBank");
		foL1.setHorizontalAlignment(SwingConstants.CENTER);
		foL1.setBounds(169, 11, 71, 14);
		contentPane.add(foL1);
		
		JLabel foL2 = new JLabel("SearchByName");
		foL2.setHorizontalAlignment(SwingConstants.CENTER);
		foL2.setBounds(10, 64, 104, 14);
		contentPane.add(foL2);
		
		JLabel foL3 = new JLabel("SearchByBranch");
		foL3.setHorizontalAlignment(SwingConstants.CENTER);
		foL3.setBounds(154, 64, 86, 14);
		contentPane.add(foL3);
		
		JLabel foL4 = new JLabel("All");
		foL4.setHorizontalAlignment(SwingConstants.CENTER);
		foL4.setBounds(352, 64, 46, 14);
		contentPane.add(foL4);
		
		foT1 = new JTextField();
		foT1.setHorizontalAlignment(SwingConstants.CENTER);
		foT1.setBounds(154, 117, 86, 20);
		contentPane.add(foT1);
		foT1.setColumns(10);
		
		JButton foB1 = new JButton("Back");
		foB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstPage fp=new FirstPage("");
				fp.setVisible(true);
			}
		});
		foB1.setBounds(10, 198, 89, 23);
		contentPane.add(foB1);
		
		JButton foB2 = new JButton("Next");
		foB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String str1=foT1.getText();
				if(str1.equals("1"))
				{
					str1="select * from BloodBank where bName='Shandhani'";
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
							System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
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
							
						str1="select * from BloodBank where bAddress='DMC branch'";
						try
							{
						
								Class.forName("oracle.jdbc.driver.OracleDriver");
								java.sql.Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba", "mydatabase");
								Statement st=con.createStatement();
								String sql=str1	;
								ResultSet rs= st.executeQuery(sql);
								ResultSetMetaData md = rs.getMetaData();
								int c=md.getColumnCount();
								while(rs.next())
								{
									System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
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
					try
					{
				
						Class.forName("oracle.jdbc.driver.OracleDriver");
						java.sql.Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba", "mydatabase");
						Statement st=con.createStatement();
						String sql="select *from BloodBank";
						ResultSet rs= st.executeQuery(sql);
						ResultSetMetaData md = rs.getMetaData();
						int c=md.getColumnCount();
						while(rs.next())
						{
							System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
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
		foB2.setBounds(323, 198, 89, 23);
		contentPane.add(foB2);
	}

}
