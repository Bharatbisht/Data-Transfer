package database;

public class Mysqlconnection{
	  //Loading Driver
    public void connect() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver is loaded");
    } catch (Exception e) {
        System.out.println("Driver is not loaded");
       }
}
}   
