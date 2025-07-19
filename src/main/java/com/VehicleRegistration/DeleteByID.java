package com.VehicleRegistration;

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

		Vehicles st = session.find(Vehicles.class, 123);
		session.remove(st);

		transaction.commit();
		session.close();

	}

}
