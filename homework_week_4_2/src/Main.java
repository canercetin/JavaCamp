
public class Main {

	public static void main(String[] args) {
		
		Game game1 = new Game("GameOne", 60);
		
		Player player1 = new Player("88888888", "Brian", "Cohen", "0");
				
		PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());
		playerManager.addPlayer(player1);
		playerManager.deletePlayer(player1);
		playerManager.updatePlayerInfo(player1, "7777777", "Brian", "Kohen", "1");
								
		Campaign campaign1 = new Campaign("Winter Sales", 15);
		Campaign campaign2 = new Campaign("Black Friday Sales", 10);
		Campaign campaign3 = new Campaign("Weekly Discount", 5);
		
		Campaign[] campaigns = new Campaign[10];
		
		SaleManager sale = new SaleManager(campaigns);
		sale.sellGame(player1, game1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaigns, campaign1);
		campaignManager.addCampaign(campaigns, campaign2);
		campaignManager.addCampaign(campaigns, campaign3);
		campaignManager.deleteCampaign(campaigns, campaign2);
		campaignManager.updateCampaign(campaign1, "Winter Sales", 20);
		
		sale.sellGame(player1, game1);		
	}

}
