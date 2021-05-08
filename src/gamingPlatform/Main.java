package gamingPlatform;

import abstracts.BaseUserManager;
import concrete.DiscountManager;
import concrete.GameManager;
import entities.Discount;
import entities.Game;
import entities.User;

public class Main {

	public static void main(String[] args) {
		BaseUserManager userManager=new BaseUserManager();
		userManager.save(new User("ali","zengin",123));
		
		Game minecraft= new Game("Minecraft", 320);
		User aliOsman= new User("Ali","Zengin",123);
		DiscountManager yazIndirimi = new DiscountManager();
		yazIndirimi.makeDiscount(minecraft,new Discount(10));
		
		GameManager gameStore=new GameManager();
		gameStore.buy(minecraft, aliOsman);
		gameStore.rebate(minecraft, aliOsman);
		

	}

	

}
