package vehicleRegisteration.Utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class vehicleRegistrationUtility {
	
	private static SessionFactory factory;
	public static SessionFactory getSessionFactory() {
		if(factory == null) {
			factory = new Configuration().configure("vehicle.cfg.xml")
					.buildSessionFactory();
		}
		return factory;
	}
	
}
