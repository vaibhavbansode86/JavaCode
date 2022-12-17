package com.atimsa.hibernate.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.atimsa.hibernate.Department;
import com.atimsa.hibernate.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();

		Employee emp=new Employee();
		Department dept=new Department();
		dept.setDepartmentId("Mech101");
		dept.setDepartmentName("Mechanical");
		
		Department dept1=new Department();
		dept1.setDepartmentId("Elect101");
		dept1.setDepartmentName("Electrical");
		
		List <Department>l=new ArrayList<Department>();
		l.add(dept1);
		l.add(dept);
		
		
		emp.setName("Ramesh");
		emp.setDepartmentId("Mech01");
//		emp.setName("Ashrita");
//		emp.setDepartmentId("Elect01");
		
		emp.setDept(l);
		dept.setEmp(emp);
		dept1.setEmp(emp);
		//dept.setEmp(emp);
		
		
		session.save(emp);
		session.save(dept);
		transaction.commit();
		session.close();
		
		sf.close();
		
		
		

	}

}
