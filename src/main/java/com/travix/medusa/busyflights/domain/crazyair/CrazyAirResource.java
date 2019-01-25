package com.travix.medusa.busyflights.domain.crazyair;

import java.sql.Date;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/crazyAirFlights")
public class CrazyAirResource {

	@PostMapping
	public CrazyAirResponse findCrazyAirFlights(@RequestBody CrazyAirRequest request)
	{
		CrazyAirDetails crazyAirDetails = new CrazyAirDetails();
		crazyAirDetails.setAirline("CrazyAir");
		crazyAirDetails.setArrivalDate(new Date(0));
		crazyAirDetails.setCabinclass("A");
		crazyAirDetails.setDepartureAirportCode("AHS");
		crazyAirDetails.setDepartureDate(new Date(0));
		crazyAirDetails.setDestinationAirportCode("TDS");
		crazyAirDetails.setPrice(30000.00);
		
		CrazyAirResponse crazyAirResponse = new CrazyAirResponse();
		crazyAirResponse.getCrazyAirDetailsList().add(crazyAirDetails);
		return crazyAirResponse;
	}
}
