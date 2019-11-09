package dao;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Employee;

public class ManageEmployee {
	private static SessionFactory factory;
	public Integer addEmployee(Employee employee) {
		return addEmployee(employee.getFirstName(),employee.getLastName(),employee.getSalary());
	}
	/* 添加employee */
	public Integer addEmployee(String fname,String lname,int salary) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer employeeID = null;
		try {
			tx = session.beginTransaction();
			Employee employee = new Employee();
			employee.setFirstName(fname);
			employee.setLastName(lname);
			employee.setSalary(salary);
			employeeID = (Integer) session.save(employee);
			tx.commit();
		}catch(HibernateException e) {
			if(tx!=null)
				tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		return employeeID;
	}
	/* 查询所有employee */
	public void listEmployees() {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			@SuppressWarnings("unchecked")
			List<Employee> employees = session.createQuery("FROM Employee").list();
			for(Employee employee : employees) {
				System.out.println(employee);
			}
			tx.commit();
		} catch (HibernateException e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	/* 更新employee */
	public void updateEmployee(Integer employeeID,int salary) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Employee employee = (Employee)session.get(Employee.class, employeeID);
			employee.setSalary(salary);
			session.update(employee);
			tx.commit();
		} catch (HibernateException e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	/* 删除employee */
	public void deleteEmployee(Integer employeeID) {
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Employee employee = (Employee)session.get(Employee.class, employeeID);
			session.delete(employee);
			tx.commit();
		} catch (HibernateException e) {
			if(tx!=null) tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	public static void main(String[] args) {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println("Failed to create sessionFactory object." + e);
		}
		ManageEmployee me = new ManageEmployee();
		Integer empID1 = me.addEmployee("wu", "tong", 900);
		Integer empID2 = me.addEmployee("man", "yu", 500);
		me.addEmployee("zhu", "xia", 800);
		me.listEmployees();
		me.updateEmployee(empID1, 9000);
		me.deleteEmployee(empID2);
		me.listEmployees();
	}
}
