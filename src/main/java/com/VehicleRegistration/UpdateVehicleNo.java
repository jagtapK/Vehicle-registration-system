package com.VehicleRegistration;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import vehicleRegisteration.Utility.vehicleRegistrationUtility;
import vehicleRegistration.Entity.Vehicles;

public class UpdateVehicleNo {

	public void UpdateDetails() {

		SessionFactory factory = vehicleRegistrationUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vehicle Number");
		String vehicleNo = sc.nextLine();
//		sc.nextLine();

		Vehicles s1 = session.find(Vehicles.class, vehicleNo);
      
		System.out.println(s1.toString());
        s1.setVehicleNumber(vehicleNo);

		transaction.commit();

		session.close();
	}
}
