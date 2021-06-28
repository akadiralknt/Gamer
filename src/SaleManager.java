
public class SaleManager implements SaleService {

	@Override
	public void sale(Gamer gamer, Product product) {
		System.out.println(product.getProductName() + "sold to" + gamer.getGamerName());
		
	}

	@Override
	public void promotion(Gamer gamer, Product product, Campaign campaign) {
		System.out.println("Bargain sell for private customer Id is"
	+ gamer.getGamerId() + "\nDiscount Rate:"
		+ campaign.getDiscountRate() + "Game Name:" +product.getProductName() );

	}

}
