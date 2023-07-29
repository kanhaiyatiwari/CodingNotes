package com.masai.dao;

import com.exception.AdminException;
import com.exception.BatchException;
import com.exception.CourceplanException;
import com.exception.FacultyException;

public interface AdministratorDao {
	public String loginAdmin1( String username,String password)throws AdminException;

	public String  CreateCourse(int id,String name,int fee,String desc) throws CourceplanException;
	public String  UpdateCourse(String New_V,int con) throws CourceplanException;
	public String  ViewCourse(int id) throws CourceplanException;
	
	public String  CreateBatch(int id,int cid,int N_s,String date,String duration)throws BatchException ;
	public String  UpdateBatch(int New_V,int con)throws BatchException;
	public String  ViewBatch()throws BatchException;
	
	public String  CreateFaculty(int id ,String name,String address,String mobile,String emaile,String username,String password) throws FacultyException;
	public String  UpdateFaculty(String New_V,int con) throws FacultyException;
	public String  ViewFaculty(int id) throws FacultyException;
	public String  AloatBatchfaculty();
	
	public String  CreateCoursePlan();
	public String  UpdateCoursePlan();
	public String  ViewCoursePlan();
	public String batchReport();

	
	
}
