package com.cg.iter.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.iter.bean.Student;
import com.cg.iter.dao.StudentDao;

public class StudentServiceImpl implements StudentService {
	@Autowired
    private StudentDao studDao;
	public StudentServiceImpl() {
	}
	@Override
	public boolean create(Student stud) {
		return studDao.create(stud);
	}
	
	@Override
	public Student getStudent(int id) {
		return studDao.getStudent(id);
	}
	@Override
	public boolean updateStudent(Student stud) {
		return studDao.updateStudent(stud);
	}
		
	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		return studDao.deleteStudent(id);
	}
	
	@Override
	public Student findStudentByName(String name) {
		// TODO Auto-generated method stub
		return studDao.findStudentByName(name);
	}
   
}