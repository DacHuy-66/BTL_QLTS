package Contructer;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectDB {
    protected Connection con;
    public Connection getConnection() 
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionurl = "jdbc:sqlserver://HuyLaptop\\HIEUNE:1433; databaseName=QUANLYTUYENSINH; encrypt=false";
            con = DriverManager.getConnection(connectionurl, "sa", "123456");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return con;
    }
    public void getClose()
    {
        try {
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể đóng kết nối tới CSDL");
        }
    }
}
