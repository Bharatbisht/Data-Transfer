package database;
import java.sql.*;

public class Insert {
	public void insert(int a,String b){
	  //Establish connection
		String url="jdbc:mysql://localhost:/boss";
		try {
			Connection con=DriverManager.getConnection(url,"root","");
			
			PreparedStatement ps=con.prepareStatement("INSERT INTO `table`(`S_no`,`Name`) VALUES (?,?)"); 
	           
             ps.setInt(1,a);
             ps.setString(2, b);
             ps.executeUpdate();
			 ps.close();
			con.close();  
		}catch(Exception e){}
	}

}
