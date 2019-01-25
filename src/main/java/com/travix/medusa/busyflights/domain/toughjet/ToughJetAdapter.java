package com.travix.medusa.busyflights.domain.toughjet;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightDetails;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;

//This class converts BusyFlightRequest to ToughJetRequest and calls the TougJet service to get the flights.
public class ToughJetAdapter {
	
	public BusyFlightsResponse findToughJetFlights(BusyFlightsRequest request) throws Exception
	{
		BusyFlightsResponse busyFlightsResponse = new BusyFlightsResponse();
		try
		{
		ToughJetRequest toughJetRequest = new ToughJetRequest();
		toughJetRequest.setFrom(request.getOrigin());
		toughJetRequest.setTo(request.getDestination());
		toughJetRequest.setInboundDate(request.getDepartureDate());
		toughJetRequest.setOutboundDate(request.getReturnDate());
		toughJetRequest.setNumberOfAdults(request.getNumberOfPassengers());
		
		String url = "http://localhost:8080/rest/toughJetFlights";

        ResponseEntity<?> response = new RestTemplate().postForEntity(url, request, String.class);
        ToughJetResponse toughJetResponse = (ToughJetResponse) response.getBody();
        
        //Convert ToughJetResponse to BusyFlightsResponse        
        for(ToughJetDetails toughJetDetails: toughJetResponse.getToughJetDetailsList())
        {
        	BusyFlightDetails busyFlightDetails= new BusyFlightDetails();
        	busyFlightDetails.setAirline(toughJetDetails.getCarrier());
        	busyFlightDetails.setArrivalDate(toughJetDetails.getInboundDateTime());
        	busyFlightDetails.setDepartureAirportCode(toughJetDetails.getDepartureAirportName());
        	busyFlightDetails.setDestinationAirportCode(toughJetDetails.getDepartureAirportName());
        	busyFlightDetails.setFare(toughJetDetails.getBasePrice());
        	busyFlightsResponse.getBusyFlightDetailsList().add(busyFlightDetails);
        }
		}
		catch(Exception e)
		{
			//log the exception
			throw e;
		}
        return busyFlightsResponse;
	}


}
