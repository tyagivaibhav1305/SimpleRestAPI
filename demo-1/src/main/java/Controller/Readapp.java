package Controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Application;
import Model.Offers;
import Services.CreateOffer;
import Services.ReadApplication;
import Services.ApplyJob;

@RestController
public class Readapp {
	
	@Autowired
    ReadApplication app;
	CreateOffer off;
	ApplyJob  ap;
	@GetMapping("/ReadAllApplication")
	public List<Application> getAll() {
        return app.getAll();
    }
	@GetMapping("/ReadAllOffers")
	public List<Offers> findAll()
	{
		return off.findAll();
	}
	@PostMapping("/OfferCreate")
	public void createoffer(@RequestBody Offers offer)
	{
	Offers croffer = off.save(offer);	
	}
	@PostMapping("/applyJob")
	public void applyjob(@RequestBody Offers offer)
	{
		Offers apoffer =  ap.Applyjob();	
	}
	
		

}
