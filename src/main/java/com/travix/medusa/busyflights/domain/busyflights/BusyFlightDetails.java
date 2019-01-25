package com.travix.medusa.busyflights.domain.busyflights;

import java.io.Serializable;
import java.util.Date;

public class BusyFlightDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6091351681862459101L;
	
	private String airline;
	private String supplier;
	private Double fare;
	private String departureAirportCode;
	private String destinationAirportCode;
	private Date departureDate;
	private Date arrivalDate;
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	public String getDepartureAirportCode() {
		return departureAirportCode;
	}
	public void setDepartureAirportCode(String departureAirportCode) {
		this.departureAirportCode = departureAirportCode;
	}
	public String getDestinationAirportCode() {
		return destinationAirportCode;
	}
	public void setDestinationAirportCode(String destinationAirportCode) {
		this.destinationAirportCode = destinationAirportCode;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airline == null) ? 0 : airline.hashCode());
		result = prime * result + ((arrivalDate == null) ? 0 : arrivalDate.hashCode());
		result = prime * result + ((departureAirportCode == null) ? 0 : departureAirportCode.hashCode());
		result = prime * result + ((departureDate == null) ? 0 : departureDate.hashCode());
		result = prime * result + ((destinationAirportCode == null) ? 0 : destinationAirportCode.hashCode());
		result = prime * result + ((fare == null) ? 0 : fare.hashCode());
		result = prime * result + ((supplier == null) ? 0 : supplier.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusyFlightDetails other = (BusyFlightDetails) obj;
		if (airline == null) {
			if (other.airline != null)
				return false;
		} else if (!airline.equals(other.airline))
			return false;
		if (arrivalDate == null) {
			if (other.arrivalDate != null)
				return false;
		} else if (!arrivalDate.equals(other.arrivalDate))
			return false;
		if (departureAirportCode == null) {
			if (other.departureAirportCode != null)
				return false;
		} else if (!departureAirportCode.equals(other.departureAirportCode))
			return false;
		if (departureDate == null) {
			if (other.departureDate != null)
				return false;
		} else if (!departureDate.equals(other.departureDate))
			return false;
		if (destinationAirportCode == null) {
			if (other.destinationAirportCode != null)
				return false;
		} else if (!destinationAirportCode.equals(other.destinationAirportCode))
			return false;
		if (fare == null) {
			if (other.fare != null)
				return false;
		} else if (!fare.equals(other.fare))
			return false;
		if (supplier == null) {
			if (other.supplier != null)
				return false;
		} else if (!supplier.equals(other.supplier))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BusyFlightDetails [airline=" + airline + ", supplier=" + supplier + ", fare=" + fare
				+ ", departureAirportCode=" + departureAirportCode + ", destinationAirportCode="
				+ destinationAirportCode + ", departureDate=" + departureDate + ", arrivalDate=" + arrivalDate + "]";
	}
}
