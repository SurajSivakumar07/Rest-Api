package com.example.demo.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.StudentModel;
@Repository

public interface StudentReposistory  extends JpaRepository<StudentModel, Integer>{

}
