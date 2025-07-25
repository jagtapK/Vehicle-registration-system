package com.VehicleRegistration;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import vehicleRegisteration.Utility.vehicleRegistrationUtility;
import vehicleRegistration.Entity.Employee;
import vehicleRegistration.Entity.Vehicles;

public class Details {

	public void detail(){

		SessionFactory factory = vehicleRegistrationUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		
		Employee e = new Employee();
		e.setFname("Tonny");
		e.setLname("Deo");
		e.setDepartment("HR");
		e.setMobileNo(123456);
		
		
		Vehicles v = new Vehicles();
		v.setModel("car");
		v.setOwnerName("John");
		v.setRegistrationYear(2010);
		v.setVehicleNumber("MH12jk2020");

		Vehicles v1 = new Vehicles();
		v.setModel("Scooter");
		v.setOwnerName("Jony");
		v.setRegistrationYear(2010);
		v.setVehicleNumber("MH12jk2020");
		
		Vehicles v2 = new Vehicles();
		v.setModel("City");
		v.setOwnerName("John");
		v.setRegistrationYear(2010);
		v.setVehicleNumber("MH12jk2020");
		
//		Documents d = new Documents();
//		d.setUsername("Alice");
//		d.setAdharNo(12345678);
//		d.setPanNo(3214);

		List<Vehicles> vlist = Arrays.asList(v, v1, v2);
		e.setVehicle(vlist);
		session.persist(e);
		
		transaction.commit();
		session.close();
		

	}

}
