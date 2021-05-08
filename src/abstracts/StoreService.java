package abstracts;

import entities.Game;
import entities.User;

public interface StoreService {
	void buy(Game game,User user);
	
	void rebate(Game game,User user);
	
}
