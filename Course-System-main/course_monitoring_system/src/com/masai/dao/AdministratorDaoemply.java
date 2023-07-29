package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.colors.Color;
import com.exception.AdminException;
import com.exception.BatchException;
import com.exception.CourceplanException;
import com.exception.FacultyException;
import com.masai.utility.Dbutily;

public class AdministratorDaoemply implements AdministratorDao {
	public static final String ANSI_RESET = "\u001B[0m";
	 public static final String ANSI_white= "\u001B[37m";
	 public static final String ANSI_green_BACKGROUND= "\u001B[42m";
	 public static final String ANSI_blue= "\u001B[34m";
	 public static final String ANSI_black_BACKGROUND= "\u001B[40m";
	@Override
	public String loginAdmin1(String username, String password) throws AdminException {
		// TODO Auto-generated method stub
String message="userename and password not matched";
		
String dusername="kanhaiya";
String dpassword="123";
if(dusername.equals(username)&&dpassword.equals(password) )
	message=ANSI_green_BACKGROUND+ANSI_white+"Welcom"+" "+username+ANSI_RESET;

//		1
		return message;
	}

	@Override
	public String CreateCourse(int id,String name,int fee,String desc) throws CourceplanException {
		// TODO Auto-generated method stub
		String message="Not created please try once again";
		try (Connection conn = Dbutily.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("insert into course values(?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, fee);
			ps.setString(4, desc);
			int x= ps.executeUpdate();
			if(x > 0)
				message = "Record Inserted Sucessfully..!";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		
			
			e.printStackTrace();
			message=e.getMessage();
		}
		return message;
	}

	@Override
	public String  UpdateCourse(String New_V,int con) throws CourceplanException{
		// TODO Auto-generated method stub
		String message ="not_updated";
		try(Connection conn = Dbutily.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("update course set courseName=? where  courseid =?");
			
			ps.setString(1,New_V);
			ps.setInt(2, con);
			
			int x= ps.executeUpdate();
			if(x > 0)
				message = "Record updated Sucessfully..!";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message=e.getMessage();
		}
		return message;
	}

	@Override
	public String ViewCourse(int id) throws CourceplanException {
		// TODO Auto-generated method stub
		String message ="Not fund";
		try(Connection conn = Dbutily.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from course where courseid= ?");
                   ps.setInt(1, id);
			
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				int cid= rs.getInt("courseid");
				String name= rs.getString("courseName");
				int fee= rs.getInt("fee");
				String desc= rs.getString("courseDescription");
				System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
				System.out.println();
				
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"Course id :-"+Color.ANSI_RESET+" "+Color.ANSI_green_BACKGROUND+Color.ANSI_blue+cid+Color.ANSI_RESET);
				System.out.println();
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"Course name :-"+Color.ANSI_RESET+" "+Color.ANSI_green_BACKGROUND+Color.ANSI_blue+name+Color.ANSI_RESET);
				System.out.println();
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"Course fees :-"+Color.ANSI_RESET+" "+Color.ANSI_green_BACKGROUND+Color.ANSI_blue+fee+Color.ANSI_RESET);
				System.out.println();
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"Course desc :-"+Color.ANSI_RESET+" "+Color.ANSI_green_BACKGROUND+Color.ANSI_blue+desc+Color.ANSI_RESET);
				System.out.println();
				message="Student details printed succesfully";
				System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return message;
	}

	@Override
	public String CreateBatch(int id,int cid,int N_s,String date,String duration) throws BatchException{
		String message="Not created please try once again";
		try (Connection conn = Dbutily.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("insert into  batch values(?,?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setInt(2, cid);
			ps.setString(3, null);
			
			ps.setInt(4, N_s);
			ps.setString(5, date);
			ps.setString(6, duration);
			int x= ps.executeUpdate();
			if(x > 0)
				message = "Record Inserted Sucessfully..!";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		
			
			e.printStackTrace();
			message=e.getMessage();
		}
		return message;
		// TODO Auto-generated method stub
	
	}

	@Override
	public String UpdateBatch(int New_V,int con)throws BatchException {
		String message ="not_updated";
		try(Connection conn = Dbutily.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("update batch set  numberofStudents=? where  batchid =?");
			
			ps.setInt(1,New_V);
			ps.setInt(2, con);
			
			int x= ps.executeUpdate();
			if(x > 0)
				message = "Record updated Sucessfully..!";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message=e.getMessage();
		}
		return message;
	}

	@Override
	public String ViewBatch()throws BatchException {
		String message ="Not fund";
		try(Connection conn = Dbutily.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from batch where batchid= ?");
                   
			ps.set
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				int cid= rs.getInt("batchid");
				rs.getString("facultyname");
				String ad= rs.getString("facultyaddress");
				String m= rs.getString("mobile");
				String e= rs.getString("email");
				String ur= rs.getString("username");
				String p= rs.getString("password");
				
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"+Color.ANSI_RESET);
				System.out.println();
				
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"Course id :-"+Color.ANSI_RESET+" "+Color.ANSI_green_BACKGROUND+Color.ANSI_blue+cid+Color.ANSI_RESET);
				System.out.println();
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"Course name :-"+Color.ANSI_RESET+" "+Color.ANSI_green_BACKGROUND+Color.ANSI_blue+name+Color.ANSI_RESET);
				System.out.println();
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"Course fees :-"+Color.ANSI_RESET+" "+Color.ANSI_green_BACKGROUND+Color.ANSI_blue+ad+Color.ANSI_RESET);
				System.out.println();
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"Course desc :-"+Color.ANSI_RESET+" "+Color.ANSI_green_BACKGROUND+Color.ANSI_blue+m+Color.ANSI_RESET);
				System.out.println();
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"Course desc :-"+Color.ANSI_RESET+" "+Color.ANSI_green_BACKGROUND+Color.ANSI_blue+e+Color.ANSI_RESET);
				System.out.println();
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"Course desc :-"+Color.ANSI_RESET+" "+Color.ANSI_green_BACKGROUND+Color.ANSI_blue+ur+Color.ANSI_RESET);
				System.out.println();
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"Course desc :-"+Color.ANSI_RESET+" "+Color.ANSI_green_BACKGROUND+Color.ANSI_blue+p+Color.ANSI_RESET);
				System.out.println();
				message="Student details printed succesfully";
				System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 message=e.getMessage();
		}
		
		return message;
	}

	@Override
	public String CreateFaculty(int id ,String name,String address,String mobile,String email,String username,String password) throws FacultyException{
		String message="Not inserted in faculty !";
		try (Connection conn = Dbutily.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("insert into faculty values(?,?,?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setString(4, mobile);
			ps.setString(5, email);
			ps.setString(6, username);
			ps.setString(7, password);
			int x= ps.executeUpdate();
			if(x > 0)
				message = "Record Inserted Sucessfully..!";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		
			
			e.printStackTrace();
			message=e.getMessage();
		}
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public String UpdateFaculty(String New_V,int con) throws FacultyException{
		
		String message ="not_updated";
		try(Connection conn = Dbutily.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("update faculty set facultyname=? where  facultyid =?");
			
			ps.setString(1,New_V);
			ps.setInt(2, con);
			
			int x= ps.executeUpdate();
			if(x > 0)
				message = "Record updated Sucessfully..!";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message=e.getMessage();
		}
		return message;
	}

	@Override
	public String ViewFaculty(int id)throws FacultyException {
		String message ="Not fund";
		try(Connection conn = Dbutily.provideConnection()){
			PreparedStatement ps= conn.prepareStatement("select * from faculty where facultyid= ?");
                   ps.setInt(1, id);
			
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				int cid= rs.getInt("facultyid");
				String name= rs.getString("facultyname");
				String ad= rs.getString("facultyaddress");
				String m= rs.getString("mobile");
				String e= rs.getString("email");
				String ur= rs.getString("username");
				String p= rs.getString("password");
				
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"+Color.ANSI_RESET);
				System.out.println();
				
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"Course id :-"+Color.ANSI_RESET+" "+Color.ANSI_green_BACKGROUND+Color.ANSI_blue+cid+Color.ANSI_RESET);
				System.out.println();
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"Course name :-"+Color.ANSI_RESET+" "+Color.ANSI_green_BACKGROUND+Color.ANSI_blue+name+Color.ANSI_RESET);
				System.out.println();
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"Course fees :-"+Color.ANSI_RESET+" "+Color.ANSI_green_BACKGROUND+Color.ANSI_blue+ad+Color.ANSI_RESET);
				System.out.println();
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"Course desc :-"+Color.ANSI_RESET+" "+Color.ANSI_green_BACKGROUND+Color.ANSI_blue+m+Color.ANSI_RESET);
				System.out.println();
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"Course desc :-"+Color.ANSI_RESET+" "+Color.ANSI_green_BACKGROUND+Color.ANSI_blue+e+Color.ANSI_RESET);
				System.out.println();
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"Course desc :-"+Color.ANSI_RESET+" "+Color.ANSI_green_BACKGROUND+Color.ANSI_blue+ur+Color.ANSI_RESET);
				System.out.println();
				System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_white+"Course desc :-"+Color.ANSI_RESET+" "+Color.ANSI_green_BACKGROUND+Color.ANSI_blue+p+Color.ANSI_RESET);
				System.out.println();
				message="Student details printed succesfully";
				System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 message=e.getMessage();
		}
		
		return message;
	}

	@Override
	public String AloatBatchfaculty() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String CreateCoursePlan() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String UpdateCoursePlan() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ViewCoursePlan() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String batchReport() {
		// TODO Auto-generated method stub
		return null;
	}

}
