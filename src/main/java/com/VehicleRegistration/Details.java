package com.VehicleRegistration;

import vehicleRegistration.Entity.Documents;
import vehicleRegistration.Entity.Employee;
import vehicleRegistration.Entity.Vehicles;

public class Details {

	public static void main(String[] args) {
		
		Vehicles v = new Vehicles();
		v.setModel("car");
		v.setOwnerName("John");
		v.setRegistrationYear(2010);
		v.setVehicleNumber("MH12jk2020");
		
		
		Documents d = new Documents();
		d.setUsername("Alice");
		d.setAdharNo(12345678);
		d.setPanNo(3214);
		
		Employee e = new Employee();
		e.setFname("Tonny");
		e.setLname("Deo");
		e.setDepartment("HR");
		e.setMobileNo(123456);
		

	}

}
