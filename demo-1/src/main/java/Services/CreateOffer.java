package Services;

import java.util.ArrayList;
import java.util.List;

import Model.Offers;

public class CreateOffer {

	private static List<Offers> offers=new ArrayList<>();
	public List<Offers> findAll()
	{
	return offers;
	}
	public Offers save(Offers offer)
	{
	if(offer.getOfferId()==0)
	{
	offer.setOfferId(1);;
	}
	offers.add(offer);
	return offer;
	}
}
