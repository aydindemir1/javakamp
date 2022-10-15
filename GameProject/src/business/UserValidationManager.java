package business;

import entities.Gamer;

public class UserValidationManager implements UserValidationService {

	@Override
	public boolean validate(Gamer gamer) {
		
		if(gamer.birthYear ==  1985 && gamer.firstName == "Engin" && gamer.lastName == "Demiroğ" && gamer.identityNumber == 12345  ) {
			return true;
		}
		else {
			return false;
		}
		
	}

	
}
