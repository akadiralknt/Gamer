
public class Main {

	public static void main(String[] args) {

		Gamer gamer = new Gamer(1, "gamerName", "gamer@mail.com");
		
		Product product1 = new Product("Fifa21", 100);
		Product product2 = new Product("Cossaks", 75);
		
		Campaign campaign1 = new Campaign("Employer Discount", 1, 35);
		Campaign campaign2 = new Campaign("The World Games Day Discount", 2, 50);
		
		GamerManager gamerManager = new GamerManager(new MernisValidationManager());
		gamerManager.add(gamer);
		
		SaleManager saleManager = new SaleManager();
		saleManager.promotion(gamer, product2, campaign2);

	}

}
