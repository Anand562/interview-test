package com.travix.medusa.busyflights.domain.crazyair;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CrazyAirResponse implements Serializable{

  /**
	 * 
	 */
	private static final long serialVersionUID = 3949319993155976130L;
List<CrazyAirDetails> crazyAirDetailsList;

public List<CrazyAirDetails> getCrazyAirDetailsList() {
	if(crazyAirDetailsList==null)
	{
		crazyAirDetailsList = new ArrayList<CrazyAirDetails>();
	}
	return crazyAirDetailsList;
}

public void setCrazyAirDetailsList(List<CrazyAirDetails> crazyAirDetailsList) {
	this.crazyAirDetailsList = crazyAirDetailsList;
} 
  
  
}
