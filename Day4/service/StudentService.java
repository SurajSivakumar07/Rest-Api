package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentModel;
import com.example.demo.reposistory.StudentReposistory;

@Service
public class StudentService {
	@Autowired
	StudentReposistory respo;
	
	
	
	public String addData( StudentModel model) {
		respo.save(model);
		return "Addded";
	}
	public List<StudentModel> getData(){
		return respo.findAll();
	}
	public Optional<StudentModel> getById(int a) {
		 
		return respo.findById(a);
	}
	public String deleteById( int a) {
		respo.deleteById(a);
		return  "deleted";
	}
	
	public String updata(StudentModel student) {
		respo.save(student);
		return "updated";
		
	}
	
	
	
	

}
