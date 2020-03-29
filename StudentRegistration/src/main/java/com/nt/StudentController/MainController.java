package com.nt.StudentController;

import com.nt.StudentDTO.StudentDTO;
import com.nt.StudentVO.StudentVO;
import com.nt.StudnetService.StudentServiceIMPL;

public class MainController {
public MainController() {
		super();
	}
private StudentServiceIMPL service;

public MainController(StudentServiceIMPL service) {
	super();
	this.service = service;
}
public String Handle(StudentVO VO) throws Exception
{
	
	StudentDTO dto=new StudentDTO();
	dto.setSno(Integer.parseInt(VO.getSno()));
	dto.setSname(VO.getSname());
	dto.setSadd(VO.getSadd());
	dto.setM1(Integer.parseInt(VO.getM1()));
	dto.setM2(Integer.parseInt(VO.getM2()));
	dto.setM3(Integer.parseInt(VO.getM3()));
	String res=service.register(dto);
	return res;
	
}
}
