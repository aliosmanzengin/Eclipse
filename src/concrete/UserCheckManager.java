package concrete;

import abstracts.BaseUserManager;
import abstracts.UserCheckService;
import entities.User;

public class UserCheckManager  extends BaseUserManager{
	
	UserCheckService userCheckService;
	
	public UserCheckManager(UserCheckService userCheckService) {
		
		this.userCheckService=userCheckService;	
	}


@Override
public void save (User user) {
	
	if(this.userCheckService.checkIfRealPerson(user)) {
		
		System.out.println("Müþteri kaydedildi."+user.getFirstName()+" "+user.getLastName());
		  
	}else {
		
		System.out.println(user.getFirstName()+" "+user.getLastName()+" isimli müşteri kaydedilemedi.");
	}
}


	
	

}
