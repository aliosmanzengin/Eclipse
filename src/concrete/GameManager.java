package concrete;


import abstracts.StoreService;
import entities.Game;
import entities.User;

public class GameManager implements StoreService{

	@Override
	public void buy(Game game, User user) {
		System.out.println(game.getGameName() + " adlý oyun" +game.getGamePrice() +"fiyat ile satýn alýndý. "+user.getFirstName()+" "
				+user.getLastName());
		
	}

	@Override
	public void rebate(Game game, User user) {
		System.out.println(game.getGameName() + " adlý oyun iade alýndý. "+ game.getGamePrice()+"Tl hesabýnýza iade edildi."+user.getFirstName()+" "
				+user.getLastName());
		
	}

	
}
