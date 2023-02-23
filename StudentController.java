package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class StudentController {
@Value("${value.name}")
	@GetMapping("/")
	public String HomePage() {
		return "Welcome to student list";
	}
	@GetMapping("/list")
	public List<Student> getList() {
		List<Student> detailsList=new ArrayList<>();
		detailsList.add(new Student(1,"SANJAY",12));
		detailsList.add(new Student(2,"NATTU",13));
		detailsList.add(new Student(3,"JAGA",9));
		
		return detailsList;
	}
}