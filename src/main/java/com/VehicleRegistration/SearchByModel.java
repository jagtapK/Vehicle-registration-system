package com.VehicleRegistration;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import vehicleRegisteration.Utility.vehicleRegistrationUtility;
import vehicleRegistration.Entity.Vehicles;

public class SearchByModel {

	public void SearchName() {
		// 1/session factory
		SessionFactory factory = vehicleRegistrationUtility.getSessionFactory();

		// 2. session from session factory
		Session session = factory.openSession();

		// 3. Transaction from session
		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle ID to Search : ");
		int Id = sc.nextInt();
		
		// 4.write your logic here
		Vehicles vehicle = session.find(Vehicles.class, Id);
		System.out.println(vehicle.toString());

		// 5.pass to database
		transaction.commit();

		// 6.session close
		session.close();

	}

}
