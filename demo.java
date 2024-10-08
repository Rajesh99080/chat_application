package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class demo {


	public static void main(String[] args) {
		try
		{
			//System.out.println("rakesh");
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("reddy");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat_application", "sa", "1234");
			Scanner sc= new Scanner(System.in);
			String username = sc.next();
			String password = sc.next();
			PreparedStatement ps =con.prepareStatement("select * from login where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs= ps.executeQuery();
			if(rs.next())
			{
				System.out.println("yes");
				
			}
			else
			{
				System.out.println("no");
			}
					
		}
		catch (Exception e) {
			System.out.println(e);
		}
		}

		}

