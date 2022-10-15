package business;


import entities.Gamer;


public class GamerManager implements GamerService {



	
	UserValidationService userValidationService;
	

	public GamerManager(NewEStateUserManager newEStateUserManager) {
		this.userValidationService = newEStateUserManager;
	}

	@Override
	public void add(Gamer gamer) {
		
		if(userValidationService.validate(gamer) == true) {
			System.out.println("kayıt oldu");
		}else {
			System.out.println("doğrulama başarısız. kayıt başarısız.");
		}
	
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("kayıt güncellendi");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("kayıt silindi");
		
	}

	



}
