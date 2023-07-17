package form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    Connection conn;
    Statement stm;
    ResultSet rst;

    Database(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_database","root","");
            stm = conn.createStatement();

            String query = "CREATE DATABASE IF NOT EXISTS user_database";
            stm.executeUpdate(query);

            String tb_query = "CREATE TABLE IF NOT EXISTS user_info(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), username VARCHAR(30) NOT NULL, email VARCHAR(50) NOT NULL, password VARCHAR(255) NOT NULL)";
            stm.executeUpdate(tb_query);

            System.out.println("Success...");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void insertInformation(String name, String username, String email, String password){
        try{
            String insert_query = String.format("INSERT INTO user_info (name, username, email, password) VALUES ('%s', '%s', '%s', '%s')", name, username, email, password);
            System.out.println(insert_query);
            stm.executeUpdate(insert_query);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public boolean checkUser(String username, String password){
        try{
            String read_query = "SELECT * FROM user_info";
            rst = stm.executeQuery(read_query);
            int i = 0;
            while(rst.next()){
                String user = rst.getString("username");
                String pass = rst.getString("password");
                if(user.equals(username) && pass.equals(password)){
                    return true;
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean checkDuplicate(String username, String email){
        try{
            String read_query = "SELECT * FROM user_info";
            rst = stm.executeQuery(read_query);
            int i = 0;
            while(rst.next()){
                String user = rst.getString("username");
                String mail = rst.getString("email");
                if(user.equals(username) || mail.equals(email)){
                    return true;
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}
