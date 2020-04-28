package com.cg.iter.service;

import com.cg.iter.bean.Student;

public interface StudentService {

	boolean create(Student stud);
	Student getStudent(int nextInt);
	boolean updateStudent(Student student);
	boolean deleteStudent(int id);
	Student findStudentByName(String name);
}
