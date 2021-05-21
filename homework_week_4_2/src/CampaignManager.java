
public class CampaignManager implements CampaignService {
	
	public void addCampaign(Campaign[] campaigns, Campaign campaign) {
		int i = 0;
		while(campaigns[i] != null)
		{
			i++;
		}
		campaigns[i] = campaign;
		System.out.println(campaign.getName()+" ADDED: "+campaign.getDiscountRate()+"%");
	}
	public void deleteCampaign(Campaign[] campaigns, Campaign campaign) {
		int i;
		for(i = 0; campaigns[i].getName() != campaign.getName(); i++) {}
		campaigns[i] = null;
		System.out.println(campaign.getName()+" DELETED!");
	}
	public void updateCampaign(Campaign campaign, String name, double discountRate) {
		campaign.setName(name);
		campaign.setDiscountRate(discountRate);
		System.out.println(campaign.getName()+" UPDATED: "+campaign.getDiscountRate()+"%");
	}
	
}
