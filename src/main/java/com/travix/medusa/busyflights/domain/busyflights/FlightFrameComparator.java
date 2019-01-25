package com.travix.medusa.busyflights.domain.busyflights;

import java.util.Comparator;

public class FlightFrameComparator implements Comparator<BusyFlightDetails> {

	@Override
	public int compare(BusyFlightDetails obj1, BusyFlightDetails obj2) {
		return obj1.getFare().compareTo(obj2.getFare());
	}
	
	

}
