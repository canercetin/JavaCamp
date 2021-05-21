
public class SaleManager implements SaleService{
	
	private Campaign[] campaigns;
	public SaleManager(Campaign[] campaigns) {  
		this.campaigns = campaigns;
	}

	public void sellGame(Player player, Game game) {
		int i = 0;
		while(i<10)
		{
			if(campaigns[i] != null)
			{
				game.setPrice(game.getPrice() - (game.getPrice() * campaigns[i].getDiscountRate() / 100)); 
			}
			i++;
		}
		
		System.out.println(player.getName()+" "+player.getSurname()+" bought "+game.getName()+"! - Price: "+game.getPrice()+"$");
		
	}

}
