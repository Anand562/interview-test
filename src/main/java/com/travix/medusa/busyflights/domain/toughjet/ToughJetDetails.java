package com.travix.medusa.busyflights.domain.toughjet;

import java.io.Serializable;
import java.util.Date;

public class ToughJetDetails implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2464037099312766810L;
	private String carrier;
    private double basePrice;
    private double tax;
    private double discount;
    private String departureAirportName;
    private String arrivalAirportName;
    private Date outboundDateTime;
    private Date inboundDateTime;
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getDepartureAirportName() {
		return departureAirportName;
	}
	public void setDepartureAirportName(String departureAirportName) {
		this.departureAirportName = departureAirportName;
	}
	public String getArrivalAirportName() {
		return arrivalAirportName;
	}
	public void setArrivalAirportName(String arrivalAirportName) {
		this.arrivalAirportName = arrivalAirportName;
	}
	public Date getOutboundDateTime() {
		return outboundDateTime;
	}
	public void setOutboundDateTime(Date outboundDateTime) {
		this.outboundDateTime = outboundDateTime;
	}
	public Date getInboundDateTime() {
		return inboundDateTime;
	}
	public void setInboundDateTime(Date inboundDateTime) {
		this.inboundDateTime = inboundDateTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arrivalAirportName == null) ? 0 : arrivalAirportName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(basePrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((carrier == null) ? 0 : carrier.hashCode());
		result = prime * result + ((departureAirportName == null) ? 0 : departureAirportName.hashCode());
		temp = Double.doubleToLongBits(discount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((inboundDateTime == null) ? 0 : inboundDateTime.hashCode());
		result = prime * result + ((outboundDateTime == null) ? 0 : outboundDateTime.hashCode());
		temp = Double.doubleToLongBits(tax);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		ToughJetDetails other = (ToughJetDetails) obj;
		if (arrivalAirportName == null) {
			if (other.arrivalAirportName != null)
				return false;
		} else if (!arrivalAirportName.equals(other.arrivalAirportName))
			return false;
		if (Double.doubleToLongBits(basePrice) != Double.doubleToLongBits(other.basePrice))
			return false;
		if (carrier == null) {
			if (other.carrier != null)
				return false;
		} else if (!carrier.equals(other.carrier))
			return false;
		if (departureAirportName == null) {
			if (other.departureAirportName != null)
				return false;
		} else if (!departureAirportName.equals(other.departureAirportName))
			return false;
		if (Double.doubleToLongBits(discount) != Double.doubleToLongBits(other.discount))
			return false;
		if (inboundDateTime == null) {
			if (other.inboundDateTime != null)
				return false;
		} else if (!inboundDateTime.equals(other.inboundDateTime))
			return false;
		if (outboundDateTime == null) {
			if (other.outboundDateTime != null)
				return false;
		} else if (!outboundDateTime.equals(other.outboundDateTime))
			return false;
		if (Double.doubleToLongBits(tax) != Double.doubleToLongBits(other.tax))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ToughJetDetails [carrier=" + carrier + ", basePrice=" + basePrice + ", tax=" + tax + ", discount="
				+ discount + ", departureAirportName=" + departureAirportName + ", arrivalAirportName="
				+ arrivalAirportName + ", outboundDateTime=" + outboundDateTime + ", inboundDateTime=" + inboundDateTime
				+ "]";
	}

    

}
