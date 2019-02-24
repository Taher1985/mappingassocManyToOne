package com.componentmapping.client;

import org.hibernate.Session;

import com.componentmapping.entity.Guide;
import com.componentmapping.entity.Student;
import com.componentmapping.sessionfactory.HibernateSessionFactory;

public class HibernateClient {

	public static void main(String[] args) {

		Session session1 = HibernateSessionFactory.getSession();
		session1.beginTransaction();

		Guide guide1 = new Guide("Ashley");
		Student student1 = new Student("John", guide1);

		Integer guideId = (Integer) session1.save(guide1);
		Integer studentId = (Integer) session1.save(student1);
		session1.getTransaction().commit();
		System.out.println("Record Inserted Successfully");
		System.out.println();

		Session session2 = HibernateSessionFactory.getSession();
		session2.beginTransaction();
		Student student2 = session2.get(Student.class, studentId);
		session2.getTransaction().commit();
		System.out.println(student2);
	}

}
