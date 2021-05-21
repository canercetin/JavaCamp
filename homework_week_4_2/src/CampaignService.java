
public interface CampaignService {

	public void addCampaign(Campaign[] campaigns, Campaign campaign);
	public void deleteCampaign(Campaign[] campaigns, Campaign campaign);
	public void updateCampaign(Campaign campaign, String name, double discountRate);
	
}
