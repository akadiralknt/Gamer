
public class Campaign implements Entities {
	
	private String campaignName;
	private int campaignId;
	private double discountRate;
	
	
	public Campaign(String campaignName, int campaignId,double discountRate) {
		super();
		this.campaignName = campaignName;
		this.campaignId = campaignId;
		this.discountRate = discountRate;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	public int getCampaignId() {
		return campaignId;
	}


	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}


	public double getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
}
