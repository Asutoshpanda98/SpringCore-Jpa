package com.cg.iter.dao;

import com.cg.iter.bean.Student;

public interface StudentDao {

	boolean create(Student stud);
	Student getStudent(int id);
	boolean updateStudent(Student student);
	boolean deleteStudent(int id);
	Student findStudentByName(String name);
	

}
