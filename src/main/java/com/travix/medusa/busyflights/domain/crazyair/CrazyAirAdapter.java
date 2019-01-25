package com.travix.medusa.busyflights.domain.crazyair;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.travix.medusa.busyflights.domain.busyflights.BusyFlightDetails;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsRequest;
import com.travix.medusa.busyflights.domain.busyflights.BusyFlightsResponse;

//This class converts BusyFlightRequest to CrazyAirRequest and calls the crazyAir service to get the flights.
public class CrazyAirAdapter {
	
	public BusyFlightsResponse findCrazyFlights(BusyFlightsRequest request) throws Exception
	{
		BusyFlightsResponse busyFlightsResponse = new BusyFlightsResponse();
		try
		{
		CrazyAirRequest crazyAirRequest = new CrazyAirRequest();
		crazyAirRequest.setDepartureDate(request.getDepartureDate());
		crazyAirRequest.setDestination(request.getDestination());
		crazyAirRequest.setOrigin(request.getOrigin());
		crazyAirRequest.setPassengerCount(request.getNumberOfPassengers());
		crazyAirRequest.setReturnDate(request.getReturnDate());
		
		String url = "http://localhost:8080/rest/crazyAirFlights";

        ResponseEntity<?> response = new RestTemplate().postForEntity(url, request, String.class);
        CrazyAirResponse crazyAirResponse = (CrazyAirResponse) response.getBody();
        
      //Convert ToughJetResponse to BusyFlightsResponse        
        for(CrazyAirDetails crazyAirDetails: crazyAirResponse.getCrazyAirDetailsList())
        {
        	BusyFlightDetails busyFlightDetails= new BusyFlightDetails();
        	busyFlightDetails.setAirline(crazyAirDetails.getAirline());
        	busyFlightDetails.setArrivalDate(crazyAirDetails.getArrivalDate());
        	busyFlightDetails.setDepartureAirportCode(crazyAirDetails.getDestinationAirportCode());
        	busyFlightDetails.setDestinationAirportCode(crazyAirDetails.getDestinationAirportCode());
        	busyFlightDetails.setFare(crazyAirDetails.getPrice());
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
