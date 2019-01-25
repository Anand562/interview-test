package com.travix.medusa.busyflights.domain.busyflights;

import java.util.concurrent.Callable;

public class BusyFlightsSearch implements Callable{

	private String providerName;
	private BusyFlightsRequest busyFlightsRequest;
	
	
	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}	

	public BusyFlightsRequest getBusyFlightsRequest() {
		return busyFlightsRequest;
	}

	public void setBusyFlightsRequest(BusyFlightsRequest busyFlightsRequest) {
		this.busyFlightsRequest = busyFlightsRequest;
	}


	@Override
	public BusyFlightsResponse call() throws Exception {
		
		try
		{
		return BusyFlightsHelperFacade.findFlightsBasedOnFlightService(providerName, busyFlightsRequest);
		}
		catch(Exception e){
			//log the exception
			throw e;
		}
	}

}
