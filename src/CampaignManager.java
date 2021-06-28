
public class CampaignManager implements CampaignService  {

	@Override
	public void campaingnAdd(Campaign campaign) {
		System.out.println(" Campaign Id :" + campaign.getCampaignId()+
				"\nCampaign Name" + campaign.getCampaignName()+
				"\nCampaign Discount" + campaign.getDiscountRate() +
				"\nnew campaign added.");
		
	}

	@Override
	public void campaignDelete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() +" campaign deleted.");
		
	}

	@Override
	public void campaignUpdate(Campaign campaign) {
		System.out.println(campaign.getCampaignName() +" campaign updated.");
		
	}

}
