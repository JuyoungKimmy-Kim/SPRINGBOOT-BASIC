package com.mycom.more.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycom.more.dto.EmpDto;
import com.mycom.more.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	EmpService service;
	
	@GetMapping (value="/emps")
	public List<EmpDto> empList () {
		List<EmpDto> list=service.empList();
		
		return list;
	}
	
	@GetMapping (value="/emps/{employeeId}")
	public EmpDto empDetail (@PathVariable int employeeId) {
		return service.empDetail(employeeId);
	}
	
	@PostMapping (value="/emps")
	public int empInsert (EmpDto dto) {
		return service.empInsert(dto);
	}
	
	@PutMapping (value="/emps/{employeeId}")
	public int update (EmpDto dto) {
		return service.empUpdate(dto);
	}
	
	@DeleteMapping (value="/emps/{employeeId}")
	public int delete (@PathVariable int employeeId) {
		return service.empDelete(employeeId);
	}
	
}
