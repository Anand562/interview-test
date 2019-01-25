package com.travix.medusa.busyflights.domain.busyflights;

import com.travix.medusa.busyflights.domain.crazyair.CrazyAirAdapter;
import com.travix.medusa.busyflights.domain.toughjet.ToughJetAdapter;

//using Facade design pattern to call different airline services and getting the flights  
public class BusyFlightsHelperFacade {
	
	public static BusyFlightsResponse findFlightsBasedOnFlightService(String flightService,BusyFlightsRequest busyFlightsRequest) throws Exception
	{
		BusyFlightsResponse busyFlightsResponse = null;
		try
		{		
		switch(flightService)
		{
		case Constants.crazyAir: 
			
			CrazyAirAdapter crazyAirAdapter = new CrazyAirAdapter();
			busyFlightsResponse = crazyAirAdapter.findCrazyFlights(busyFlightsRequest);
			
		case Constants.toughJet:
			ToughJetAdapter toughtJetAdapter = new ToughJetAdapter();
			busyFlightsResponse = toughtJetAdapter.findToughJetFlights(busyFlightsRequest);
			
		}
		}
		catch(Exception e)
		{
			throw e;
		}
		return busyFlightsResponse;
	}

}
