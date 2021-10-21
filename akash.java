package net.codejava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class akash{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jdbcUrl = "jdbc:sqlite:/C:\\sqlite\\Akash.db";
		try {
			Connection connection = DriverManager.getConnection(jdbcUrl);
			String sql = "SELECT * FROM Movie";
			
			Statement statement = connection.createStatement();
			
			ResultSet result = statement.executeQuery(sql);
			
			while(result.next()) {
				String Name = result.getString("Name");
				String Actor = result.getString("Actor");
				String Actrees = result.getString("Actrees");
				String Director = result.getString("Director");
				Integer Year_of_Release = result.getInt("Year_of_Release");
				
				System.out.println(Name + " | " + Actor + " | " + Actrees + " | " + Director + " | " + Year_of_Release + " | ");
				System.out.println("\n");
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error connecting to SQLite Database");
			e.printStackTrace();
		}
		
		try {
			Connection connection = DriverManager.getConnection(jdbcUrl);
			String sql = "SELECT  Name,Actor FROM Movie";
			
			Statement statement = connection.createStatement();
			
			ResultSet result = statement.executeQuery(sql);
			
			while(result.next()) {
				String Name = result.getString("Name");
				String Actor = result.getString("Actor");
				
				
				System.out.println(Name + " | " + Actor);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error connecting to SQLite Database");
			e.printStackTrace();
		}
		

	}

}
