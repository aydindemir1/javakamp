import business.GamerManager;
import business.NewEStateUserManager;
import business.OfferManager;
import entities.Gamer;
import entities.Offer;

public class Main {

	public static void main(String[] args) {

		GamerManager gamerManager = new GamerManager(new NewEStateUserManager());
		gamerManager.add(new Gamer( 1, "Engin", "Demiroğ", 1985, 12345));
	
		OfferManager offerManager = new OfferManager();
	    offerManager.add(new Offer(1, "15 ekim"));
	    offerManager.update(new Offer(1, "15 ekim"));
	    offerManager.delete(new Offer(1, "15 ekim"));
	}

}
