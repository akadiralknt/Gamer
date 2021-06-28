
public class PersonSelfValidationManager implements GamerCheckService {

	@Override
	public boolean realPerson(Gamer gamer) {
		System.out.println("Self-Validation is successful.");
		return true;
	}

}
