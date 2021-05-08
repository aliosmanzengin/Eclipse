package entities;

public class Gamer extends User{

		private String nationalIdentity;
		
		public Gamer() { 
			
		}
		

		public Gamer(String nationalIdentity) {
			this.setNationalIdentity(nationalIdentity);
			
		}


		public String getNationalIdentity() {
			return nationalIdentity;
		}


		public void setNationalIdentity(String nationalIdentity) {
			this.nationalIdentity = nationalIdentity;
		}
				

		
			
		
		
	}
