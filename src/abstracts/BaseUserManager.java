package abstracts;



import entities.User;

public class BaseUserManager implements UserService{
	
	@Override
	public void save(User user) {
		
		System.out.println("M��teri veritaban�na kaydedildi."+user.getFirstName()+" "
		+user.getLastName());
	
	}

	

}
