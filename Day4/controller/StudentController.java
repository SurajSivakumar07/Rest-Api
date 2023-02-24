package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentModel;
import com.example.demo.service.StudentService;

@RestController

public class StudentController {
	
	@Autowired 
	 StudentService repo;
	
	
	@RequestMapping("/student")
	public String add(@RequestBody StudentModel student)
	{
			return repo.addData(student);
			
	}
	
	
	@GetMapping("/student")
	public List<StudentModel> getData(){
		return   repo.getData();
	}
	
	
	
	@GetMapping("/student/{a}")
	public Optional<StudentModel> getByData(@PathVariable int a){
		return   repo.getById(a);
	}
	
	
	@PutMapping("/student")
	
	public String update(@RequestBody StudentModel student) {
		return repo.updata(student);
	}
	
	
	
	@DeleteMapping("/student")
	public String  delete(@RequestParam int a) {
		return repo.deleteById(a);
	}
	
	

}
