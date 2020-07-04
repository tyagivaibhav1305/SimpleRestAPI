package Services;

import Model.Offers;

public class ApplyJob {

	public Offers Applyjob()
	{
		Offers offer = new Offers();
		offer.setNumberOfApplications(offer.getNumberOfApplications()+1);
		return offer;
	}
}
