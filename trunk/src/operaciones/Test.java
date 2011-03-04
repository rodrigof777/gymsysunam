/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package operaciones;

import java.sql.*;
public class Test {
public static void main(String[] args) throws Exception {

Class.forName("org.sqlite.JDBC");
Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");
Statement stat = conn.createStatement();
stat.executeUpdate("create table people (name, occupation);");
stat.executeUpdate("insert into people values ('Gandhi', 'politics');");
stat.executeUpdate("insert into people values ('Turing', 'computers');");
stat.executeUpdate("insert into people values ('Wittgenstein', 'smartypants');");
ResultSet rs = stat.executeQuery("select * from people;");
while (rs.next()) {
System.out.println("name = " + rs.getString("name"));
System.out.println("occupation = " + rs.getString("occupation"));
}
rs.close();
conn.close();
}
}