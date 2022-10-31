package com.mycom.more.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mycom.more.dto.EmpDto;

@Mapper
public interface EmpDao {
	//등록 , 수정, 삭제
	
	List<EmpDto> empList();
	EmpDto empDetail (int employeeId);
	int empInsert (EmpDto empDto);
	int empUpdate (EmpDto empDto);
	int empDelete (int employeeId);
}
