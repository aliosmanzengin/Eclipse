package entities;

public class Game {
	private String gameName;
	private double gamePrice;
	private double newPrice;
	
	

	public Game(String gameName,int gamePrice) {
		
		this.gameName = gameName;
		this.gamePrice= gamePrice;
				
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

	public double getNewPrice() {
		return newPrice;
	}

	public void setNewPrice(double newPrice) {
		this.newPrice = newPrice;
		
	}

}
