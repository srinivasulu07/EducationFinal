package com.loan.eduaction.dao;
import java.sql.*;
public class InsertPrepared{
public void insert( int j,String string, String phoneno, String string2, String string3, int l, int m, int n){
try{
Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/sys", "root", "Deepika$69");

PreparedStatement stmt=con.prepareStatement("insert into students values(?,?,?,?,?,?,?,?)");
stmt.setInt(1,j);
stmt.setString(2,string);
stmt.setString(3,phoneno);
stmt.setString(4,string2);

stmt.setString(5,string3);
stmt.setInt(6, l);
stmt.setInt(7, m);
stmt.setInt(8, n);
int i=stmt.executeUpdate();
System.out.println(i+" records inserted");
con.close();
}catch(Exception e){ System.out.println(e);}
}
public void insertinto(int j,  int l, long amount, int n){
try{
Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/sys", "root", "Deepika$69");

PreparedStatement stmt=con.prepareStatement("insert into loan_details values(?,?,?,?)");
stmt.setInt(1,j);
stmt.setInt(2, l);
stmt.setLong(3, amount);
stmt.setInt(4, n);
int i=stmt.executeUpdate();
System.out.println(i+" records inserted");

con.close();
}catch(Exception e){ System.out.println(e);}
}

public void insertintof(int j,  int l,String status,int intrest){
try{
Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/sys", "root", "Deepika$69");

PreparedStatement stmt=con.prepareStatement("insert into loan_status values(?,?,?,?)");
stmt.setInt(1,j);
stmt.setInt(2, l);
stmt.setString(3,status);
stmt.setInt(4,intrest );
int i=stmt.executeUpdate();
System.out.println(i+" records inserted");

con.close();
}catch(Exception e){ System.out.println(e);}

}

//public static void main(String[] args) {
//	new InsertPrepared()
}
