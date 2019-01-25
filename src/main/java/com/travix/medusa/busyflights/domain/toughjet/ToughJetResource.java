package com.travix.medusa.busyflights.domain.toughjet;

import java.util.Date;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest/toughJetFlights")
public class ToughJetResource {

	@PostMapping
	public ToughJetResponse findToughJetFlights(@RequestBody ToughJetRequest request)
	{
		ToughJetDetails toughJetDetails = new ToughJetDetails();
		toughJetDetails.setCarrier("Toughjet");
		toughJetDetails.setBasePrice(20000);
		toughJetDetails.setArrivalAirportName("Amsterdam");
		toughJetDetails.setDepartureAirportName("New Delhi");
		toughJetDetails.setDiscount(10);
		toughJetDetails.setInboundDateTime(new Date());
		toughJetDetails.setOutboundDateTime(new Date());
		toughJetDetails.setTax(2);
		
		ToughJetResponse toughJetResponse = new ToughJetResponse();
		toughJetResponse.getToughJetDetailsList().add(toughJetDetails);
		return toughJetResponse;		
	}
}
