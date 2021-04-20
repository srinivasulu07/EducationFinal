package com.loan.eduaction.dao;

import java.sql.*;
class UpdatePrepared{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/sys","root","Deepika$69");

PreparedStatement stmt=con.prepareStatement("update students set address=? where id=?");
stmt.setString(1,"Nellore");//1 specifies the first parameter in the query i.e. name
stmt.setInt(2,4);

int i=stmt.executeUpdate();
System.out.println(i+" records updated");

con.close();

}catch(Exception e){ System.out.println(e);}

}
}