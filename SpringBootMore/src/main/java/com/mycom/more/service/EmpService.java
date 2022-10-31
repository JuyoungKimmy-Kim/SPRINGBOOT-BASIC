package com.mycom.more.service;

import java.util.List;

import com.mycom.more.dto.EmpDto;

public interface EmpService {
	List<EmpDto> empList();
	EmpDto empDetail (int employeeId);
	int empInsert (EmpDto empDto);
	int empUpdate (EmpDto empDto);
	int empDelete (int employeeId);
}
