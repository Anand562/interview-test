package com.travix.medusa.busyflights.domain.busyflights;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/busyFlights")
public class BusyFlightResource {

	@SuppressWarnings("unchecked")
	@PostMapping
	public BusyFlightsResponse findBusyFlights(@RequestBody BusyFlightsRequest request)
	{
		BusyFlightsResponse busyFlightsResponse = new BusyFlightsResponse();
		try
		{
		 // using executor frame work to get the flights from multiple providers for the given input request.
		 ExecutorService executor = Executors.newFixedThreadPool(10);
         List <Future<BusyFlightsResponse>> list = new ArrayList<Future<BusyFlightsResponse>>();
         List<String> flightProviders = new ArrayList<String>(); 
         flightProviders.add("CrazyAir");
         flightProviders.add("ToughJet");
         for(String flightProvider:flightProviders)
         {
        	 BusyFlightsSearch busyFlightSearch = new BusyFlightsSearch();
        	 busyFlightSearch.setBusyFlightsRequest(request);
        	 busyFlightSearch.setProviderName(flightProvider);
        	 
			Future<BusyFlightsResponse> future = executor.submit(busyFlightSearch);
             list.add(future);
             continue;           
          }
         
         List<BusyFlightDetails> busyFlightDetailsList = new ArrayList<>();
         for(Future<BusyFlightsResponse> future : list)
         {
                     try {
                    	 busyFlightDetailsList.addAll(future.get().getBusyFlightDetailsList());
                                 
                     } catch (Exception e) { 
                    	         //log the exception
                                 e.printStackTrace();
                     }
         }  
         
         //sorting the flights based on fare
         Collections.sort(busyFlightDetailsList,new FlightFrameComparator());
         busyFlightsResponse.setBusyFlightDetailsList(busyFlightDetailsList);
		}
		catch(Exception e)
		{
          //log the exception
		}
         return busyFlightsResponse;                       
}                     
		
	}

