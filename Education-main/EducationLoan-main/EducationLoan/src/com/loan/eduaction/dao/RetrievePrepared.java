package com.loan.eduaction.dao;


import java.sql.*;
public class RetrievePrepared{
	static int rid;
	static int loanid;
public static void main(String args[]){
try{
	
Class.forName("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection(
"jdbc:mysql://localhost:3306/sys","root","Deepika$69");

PreparedStatement stmt=con.prepareStatement("select id,name from students");
ResultSet rs=stmt.executeQuery();

while(rs.next()){
System.out.println(rs.getInt(1)+" "+rs.getString(2));
}

con.close();

}catch(Exception e){ System.out.println(e);}

}
public static int id() {
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/sys","root","Deepika$69");

PreparedStatement st=con.prepareStatement("select max(id) from students");
ResultSet rs1=st.executeQuery();

while(rs1.next()){
 rid = rs1.getInt(1);
}

return rid;
}
	catch(Exception ex) {
		System.out.println(ex);
		}
	return 0;
	}
public static int loanid() {
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con=DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/sys","root","Deepika$69");

PreparedStatement st=con.prepareStatement("select max(loanid) from loan_details");
ResultSet rs1=st.executeQuery();


while(rs1.next()){
 loanid= rs1.getInt(1);
}

return loanid;
}
	catch(Exception ex) {
		System.out.println(ex);
		}
	return 0;
	}
}

