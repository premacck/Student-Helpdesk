/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.sql.*;
import java.sql.Connection;
public class datacon {
    Connection con;
Statement st;
public datacon() throws Exception
{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
st=con.createStatement();
}
public void setdata(String s) throws Exception
{
st.executeUpdate(s);
}
public ResultSet getdata(String s)throws Exception
{
ResultSet rs=st.executeQuery(s);
return rs;
}
    
}
