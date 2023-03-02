package org.task;

import java.sql.*;
import java.util.Scanner;


public class LoginModule {

  

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter username: ");
    String inputUsername = sc.nextLine();
    System.out.print("Enter password: ");
    String inputPassword = sc.nextLine();
    Class.forName("oracle.jdbc.driver.OracleDriver");
    //Connection conn = DriverManager.getConnection("jdbc:mysql://bjiuqhyjoqhbezdefkr9-mysql.services.clever-cloud.com:3306/bjiuqhyjoqhbezdefkr9", "uvszvyzfhiqmxsnt", "uvszvyzfhiqmxsnt");
    try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "naresh")) {
      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery("SELECT * FROM users WHERE username='" + inputUsername + "' AND password='" + inputPassword + "'");

      if (resultSet.next()) {
        System.out.println("Login successful!");
      } else {
        System.out.println("Incorrect username or password. Please try again.");
      }
    } catch (SQLException e) {
      System.out.println("Error connecting to the database: " + e.getMessage());
    }
  }


		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


