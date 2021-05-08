package concrete;


import abstracts.StoreService;
import entities.Game;
import entities.User;

public class GameManager implements StoreService{

	@Override
	public void buy(Game game, User user) {
		System.out.println(game.getGameName() + " adl� oyun" +game.getGamePrice() +"fiyat ile sat�n al�nd�. "+user.getFirstName()+" "
				+user.getLastName());
		
	}

	@Override
	public void rebate(Game game, User user) {
		System.out.println(game.getGameName() + " adl� oyun iade al�nd�. "+ game.getGamePrice()+"Tl hesab�n�za iade edildi."+user.getFirstName()+" "
				+user.getLastName());
		
	}

	
}
