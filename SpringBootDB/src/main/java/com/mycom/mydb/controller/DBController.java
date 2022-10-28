package com.mycom.mydb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycom.mydb.dto.EmpDto;
import com.mycom.mydb.service.DBService;

@RestController
public class DBController {

	@Autowired
	DBService service;

	@GetMapping(value="/empDetail/{employeeId}")
	public EmpDto empDetail(@PathVariable int employeeId) {
		System.out.println(employeeId);
		EmpDto empDto = service.empDetail(employeeId);
		
		return empDto;
	}
	
	@GetMapping(value="/empList")
	public List<EmpDto> empList() {
		List<EmpDto> list = service.empList();
		return list;
	}
	
	@PostMapping(value="/empInsert")
	public int empInsert(EmpDto dto) {  
		System.out.println(dto);
		int ret = service.empInsert(dto);
		return ret;
	}
	
	@PostMapping(value="/empUpdate")
	public int empUpdate(EmpDto dto) { 
		System.out.println(dto);
		int ret = service.empUpdate(dto);
		return ret;
	}
	
	@GetMapping(value="/empDelete/{employeeId}")
	public int empDelete(@PathVariable int employeeId) {
		System.out.println(employeeId);
		int ret = service.empDelete(employeeId);
		return ret;
	}
}
