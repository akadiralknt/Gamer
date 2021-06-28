
public class Gamer implements Entities {
	private int gamerId;
	private String gamerName;
	private String gamerMail;
	
	public Gamer(int gamerId, String gamerName, String gamerMail) {
		super();
		this.gamerId = gamerId;
		this.gamerName = gamerName;
		this.gamerMail = gamerMail;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public String getGamerName() {
		return gamerName;
	}

	public void setGamerName(String gamerName) {
		this.gamerName = gamerName;
	}

	public String getGamerMail() {
		return gamerMail;
	}

	public void setGamerMail(String gamerMail) {
		this.gamerMail = gamerMail;
	}
	
	

}
