package business;

import entities.Offer;

public class OfferManager implements OfferService {



	@Override
	public void add(Offer offer) {
		System.out.println("kampanya eklendi : " + offer.name );
		
	}

	@Override
	public void update(Offer offer) {
		System.out.println("kampanya güncellendi : " + offer.name);
		
	}

	@Override
	public void delete(Offer offer) {
		System.out.println("kampanya silindi : " + offer.name);
		
	}



}
