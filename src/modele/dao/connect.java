package modele.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connect {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName ("oracle.jdbc.OracleDriver");
  
         Connection conn = DriverManager.getConnection
             ("jdbc:oracle:thin:@192.168.1.78:1521:oracle", "GSBJAVAPROC", "GSBJAVAPROC");
                             // @//machineName:port/SID,   userid,  password
        try {
         Statement stmt = conn.createStatement();
         try {
         ResultSet rset = stmt.executeQuery("select * from MEDECIN ");;
         try {
         while (rset.next())
               System.out.println (rset.getString(1));   // Print col 1
         } finally {
             try { rset.close(); } catch (Exception ignore) {}
         }
         } finally {
             try { stmt.close(); } catch (Exception ignore) {}
         }
         } finally {
             try { conn.close(); } catch (Exception ignore) {}
         }
   }
}
