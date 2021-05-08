package abstracts;

import entities.Discount;
import entities.Game;

public interface DiscountService {
	double makeDiscount(Game game,Discount discount);

}
