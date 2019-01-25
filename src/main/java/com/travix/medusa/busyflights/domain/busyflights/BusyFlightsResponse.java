package com.travix.medusa.busyflights.domain.busyflights;

import java.io.Serializable;
import java.util.List;


public class BusyFlightsResponse  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5315853592010901863L;
	private List<BusyFlightDetails> busyFlightDetailsList;

	public List<BusyFlightDetails> getBusyFlightDetailsList() {
		return busyFlightDetailsList;
	}

	public void setBusyFlightDetailsList(List<BusyFlightDetails> busyFlightDetailsList) {
		this.busyFlightDetailsList = busyFlightDetailsList;
	}
	
}
