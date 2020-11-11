package com.medicalAssistant;

import java.sql. *;
import java.util.Scanner;


public class Connection {

	public static void main(String[] args) {
		
		try
		{
			
			Scanner in = new Scanner (System.in);
			String str=in.nextLine();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			java.sql.Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba", "mydatabase");
			Statement st=con.createStatement();
			String sql=str;
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
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
