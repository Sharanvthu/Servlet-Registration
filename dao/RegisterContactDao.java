package net.java.Registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import net.java.Registration.model.Contact;

public class RegisterContactDao {
	public int registerContact(Contact contact) throws ClassNotFoundException
	{
		String s="INSERT INTO logo VALUES(?,?)";
		int result=0;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		   try(Connection con=DriverManager.getConnection
						("jdbc:oracle:thin:@localhost:1521:ORCLE123","SCOTT","tiger");

				PreparedStatement st=con.prepareStatement(s)){
				
				
				st.setString(1, contact.getName());
				st.setString(2, contact.getNumber());
				System.out.println(st);
				result=st.executeUpdate();

				
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		return result;
	
	
		

	}

	
}
