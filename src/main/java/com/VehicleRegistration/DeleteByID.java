package com.VehicleRegistration;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import vehicleRegisteration.Utility.vehicleRegistrationUtility;
import vehicleRegistration.Entity.Vehicles;

public class DeleteByID {

	public void DeleteDetails() {
		
		SessionFactory factory = vehicleRegistrationUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle ID to delete : ");
		int Id = sc.nextInt();
		Vehicles st = session.find(Vehicles.class, Id);
		session.remove(st);

		transaction.commit();
		session.close();

	}

}
