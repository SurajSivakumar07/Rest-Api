package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentModel {
	
		@Id
		private int studentId;
		private String studentName;
		private String departmentName;
		private String mailId;
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getDepartmentName() {
			return departmentName;
		}
		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}
		public String getMailId() {
			return mailId;
		}
		public void setMailId(String mailId) {
			this.mailId = mailId;
		}
		@Override
		public String toString() {
			return "StudentModel [studentId=" + studentId + ", studentName=" + studentName + ", departmentName="
					+ departmentName + ", mailId=" + mailId + "]";
		}
		public StudentModel() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}
