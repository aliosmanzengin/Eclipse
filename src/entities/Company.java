package entities;

public class Company extends User{

	private String companyName;
	
	public Company(String companyName) {
		this.setCompanyName(companyName);
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
