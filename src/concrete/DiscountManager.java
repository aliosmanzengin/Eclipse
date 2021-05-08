package concrete;

import abstracts.DiscountService;
import entities.Discount;
import entities.Game;

public class DiscountManager implements DiscountService{

	@Override
	public double makeDiscount(Game game,Discount discount) {
		System.out.println("-------------------------------------------");
		double newPrice= game.getGamePrice()-(discount.getDiscount()*game.getGamePrice())/100;
		System.out.println(game.getGameName()+" Adlý Oyun yüzde" + discount.getDiscount()+ "indirimle"+ newPrice + " TL Fiyatýna düþürüldü");
		System.out.println("-------------------------------------------");
		return newPrice;
	}
	
	
	

	
}
