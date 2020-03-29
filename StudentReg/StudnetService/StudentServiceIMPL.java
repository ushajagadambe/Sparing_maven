package com.nt.StudnetService;

import com.nt.StudentBO.StudentBO;
import com.nt.StudentDTO.StudentDTO;
import com.nt.studentDAO.StudentDAOImpl;

public class StudentServiceIMPL implements StudentService{
private StudentDAOImpl DAO;

	public StudentServiceIMPL(StudentDAOImpl dAO) {
	super();
	DAO = dAO;
}

	@Override
	public String register(StudentDTO dto) throws Exception {
		int m1,m2,m3,total,avg;String res;int r;
		StudentBO BO=new StudentBO();
		 m1=dto.getM1();
		 m2=dto.getM2();
		 m3=dto.getM3();
		total=m1+m2+m3;
		avg=total/3;
		BO.setSno(dto.getSno());
		BO.setSname(dto.getSname());
		BO.setSadd(dto.getSadd());
		BO.setAvg(avg);
		BO.setTotal(total);
		if(avg>=35)
			res="fail";
		else 
			res="pass";
		BO.setResult(res);
		r=DAO.insert(BO);
		if(r==0)
			return "operation insert unsuccessfull";
		else
			return "operation insert  successfull";
		
	}

}
