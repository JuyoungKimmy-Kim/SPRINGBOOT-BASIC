package com.mycom.more.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


// lombok은 setter나 getter 등을 자동으로 생성해주는 lib
// 이것이 가능하려면 현재 사용하고 있는 IDE - STS와 lombok library가 소통해야 함
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentDto {
	private int studentId;
	private String studentNm;
	private String email;
	private String phone;

}
