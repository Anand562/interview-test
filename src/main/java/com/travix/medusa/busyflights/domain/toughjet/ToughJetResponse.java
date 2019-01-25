package com.travix.medusa.busyflights.domain.toughjet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ToughJetResponse implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -3183483122530196440L;
	List<ToughJetDetails> toughJetDetailsList;

	public List<ToughJetDetails> getToughJetDetailsList() {
		
		if(toughJetDetailsList==null)
		{
			toughJetDetailsList = new ArrayList<ToughJetDetails>();
		}
		return toughJetDetailsList;
	}

	public void setToughJetDetailsList(List<ToughJetDetails> toughJetDetailsList) {
		this.toughJetDetailsList = toughJetDetailsList;
	}
    
    
    }
