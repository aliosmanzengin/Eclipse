package abstracts;

import entities.Game;
import entities.User;

public interface GamerService {
	void add(User user );
	
	void update(User user);
	
	void delete(User user);

}
