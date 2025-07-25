package vehicleRegistration.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Documents {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int docid;
	private int AdharNo;
	private int PanNo;
	
	private String Username;
	
	@OneToOne(mappedBy = "document")
	private Employee employee;
	
	public int getAdharNo() {
		return AdharNo;
	}

	public void setAdharNo(int adharNo) {
		AdharNo = adharNo;
	}

	public int getPanNo() {
		return PanNo;
	}

	public void setPanNo(int panNo) {
		PanNo = panNo;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	@Override
	public String toString() {
		return "document [AdharNo=" + AdharNo + ", PanNo=" + PanNo + ", Username=" + Username + "]";
	}
	
}
