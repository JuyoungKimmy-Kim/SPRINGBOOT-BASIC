package com.mycom.more.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycom.more.dao.EmpDao;
import com.mycom.more.dto.EmpDto;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpDao dao;
	
	@Override
	public List<EmpDto> empList() {
		// TODO Auto-generated method stub
		return dao.empList();
	}

	@Override
	public EmpDto empDetail(int employeeId) {
		// TODO Auto-generated method stub
		return dao.empDetail(employeeId);
	}

	@Override
	public int empInsert(EmpDto empDto) {
		// TODO Auto-generated method stub
		return dao.empInsert(empDto);
	}

	@Override
	public int empUpdate(EmpDto empDto) {
		// TODO Auto-generated method stub
		return dao.empUpdate(empDto);
	}

	@Override
	public int empDelete(int employeeId) {
		// TODO Auto-generated method stub
		return dao.empDelete(employeeId);
	}

}
