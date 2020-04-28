package com.cg.iter.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.cg.iter.bean.Student;
import com.cg.iter.util.JpaUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public boolean create(Student stud) {
		try {
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(stud);
		em.getTransaction().commit();
		return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public Student getStudent(int id) {
		Student stu = null;
		try{
			EntityManager em = JpaUtil.getEntityManager();
			stu = em.find(Student.class, id);
		}
		catch(Exception e){			
		}
		return stu;
	}
	
	@Override
	public boolean updateStudent(Student student) {
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(student);
		em.getTransaction().commit();
		return true;
	}
	
	@Override
	public boolean deleteStudent(int id) {
		EntityManager em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.remove(getStudent(id));
		em.getTransaction().commit();
		return true;
	}
	
	@Override
	public Student findStudentByName(String name) {
		try {
			EntityManager em = JpaUtil.getEntityManager();
			Query query = em.createQuery("select stud from Student stud where stud.name=:name");
			query.setParameter("name",name);
			return (Student) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
		
	}

}