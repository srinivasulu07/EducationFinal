package com.loan.eduaction.dao;

import java.sql.*;
class DeletePrepared{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/sys","root","Deepika$69");

PreparedStatement stmt=con.prepareStatement("delete from students where id=?");
stmt.setInt(1,6);

int i=stmt.executeUpdate();
System.out.println(i+" records deleted");

con.close();

}catch(Exception e){ System.out.println(e);}

}
}