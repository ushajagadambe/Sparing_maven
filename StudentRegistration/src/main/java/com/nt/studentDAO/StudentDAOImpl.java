package com.nt.studentDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.StudentBO.StudentBO;

public class StudentDAOImpl implements StudentDAO{
	private DataSource ds;
private static final String  insert_Query="insert into student values(?,?,?,?,?,?)";
	@Override
	public int insert(StudentBO BO)throws Exception {
		Connection con=ds.getConnection();
		PreparedStatement statement=con.prepareStatement(insert_Query);
		statement.setInt(1, BO.getSno());
		statement.setString(2, BO.getSname());
		statement.setString(3, BO.getSadd());
		statement.setInt(4, BO.getTotal());
		statement.setDouble(5, BO.getAvg());
		statement.setString(6, BO.getResult());
		int res=statement.executeUpdate();
		if(res==0)
			return 0;
		else
			 return 1;

	
	}

	public StudentDAOImpl(DataSource ds) {
		super();
		this.ds = ds;
	}

}
