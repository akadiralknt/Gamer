
public class GamerManager implements GamerService{
	
	private GamerCheckService checkService;
	
	public GamerManager(GamerCheckService checkService) {
		super();
		this.checkService = checkService;
	}

	@Override
	public void add(Gamer gamer) {
		try {
			if(checkService.realPerson(gamer)) {
				System.out.println(gamer.getGamerName() + " new gamer Succesfully added.");		 
			}
		}
		catch(Exception e) 
		{
					
			 System.out.println("Invalid Request");	
		}
	
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getGamerName() + " gamer deleted.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getGamerName() + " gamer updated.");

		
	}
	
}
