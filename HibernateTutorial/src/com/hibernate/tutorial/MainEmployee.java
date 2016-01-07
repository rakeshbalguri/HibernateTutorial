package com.hibernate.tutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainEmployee {

	public static void main(String[] args) {

		Employee e = new Employee();
		
		e.setFirstName("Rakesh");
		e.setLastName("Balguri");
		e.setSalary(10);
		
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();

		EmployeeUtil util = new EmployeeUtil(sessionFactory);
		
		Integer empID1 = util.addEmployee("Zara", "Ali", 1000);
		Integer empID2 = util.addEmployee("Daisy", "Das", 5000);
		Integer empID3 = util.addEmployee("John", "Paul", 10000); /*
																 * List down all
																 * the employees
																 */
		util.listEmployees(); /* Update employee's records */
		util.updateEmployee(empID1, 5000); /* Delete an employee from the database */
		util.deleteEmployee(empID2); /* List down new list of the employees */
		util.listEmployees();
		
		sessionFactory.close();
		
	}
	
	

}
