package org.api.source;

import java.io.Serializable;
import java.util.ArrayList;



public class LeadStatus implements Serializable {
	
	
	private ArrayList<String> statusArray;
	
	private int id_status;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void __construct(){
		statusArray = new ArrayList<String>();
		statusArray.add("nowe");
		statusArray.add("oczekujace");
		statusArray.add("zakonczone");
	}
	
	public void setIdStatusu(int id_statusu){
		id_status = id_statusu;
	}
	
	public String getStatus(){
		return statusArray.get(id_status);
	}
	

}
