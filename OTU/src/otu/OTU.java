package otu;
import java.sql.Connection;
import java.sql.*;
import java.util.Scanner;
public class OTU {
public static void main(String[] args) throws SQLException {
   try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection VA=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
            Statement s=VA.createStatement();
            s.execute("create table mmxklo(id number primary key ,name varchar2(20),gpa number(30),email varchar2(30))");
            System.out.println("done");
        } catch (Exception ex) {
           System.out.println(ex);
        }
}
}
