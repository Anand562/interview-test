package com.travix.medusa.busyflights.domain.crazyair;

import java.io.Serializable;
import java.util.Date;

public class CrazyAirDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2239211681540218256L;
	
	private String airline;
	private Double price;
	private String cabinclass;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCabinclass() {
		return cabinclass;
	}
	public void setCabinclass(String cabinclass) {
		this.cabinclass = cabinclass;
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
		result = prime * result + ((cabinclass == null) ? 0 : cabinclass.hashCode());
		result = prime * result + ((departureAirportCode == null) ? 0 : departureAirportCode.hashCode());
		result = prime * result + ((departureDate == null) ? 0 : departureDate.hashCode());
		result = prime * result + ((destinationAirportCode == null) ? 0 : destinationAirportCode.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
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
		CrazyAirDetails other = (CrazyAirDetails) obj;
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
		if (cabinclass == null) {
			if (other.cabinclass != null)
				return false;
		} else if (!cabinclass.equals(other.cabinclass))
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
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CrazyAirDetails [airline=" + airline + ", price=" + price + ", cabinclass=" + cabinclass
				+ ", departureAirportCode=" + departureAirportCode + ", destinationAirportCode="
				+ destinationAirportCode + ", departureDate=" + departureDate + ", arrivalDate=" + arrivalDate + "]";
	}
	
	
	
}
