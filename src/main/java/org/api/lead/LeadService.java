package org.api.lead;


import javax.jws.WebMethod;
import javax.jws.WebService;

import org.api.source.BonusInfo;
import org.api.source.Lead;
import org.api.source.LeadStatus;


@WebService(targetNamespace = "http://localhost/test/wsdl")
public interface LeadService {
	
	
	@WebMethod
	public LeadStatus getStatus(int id_lead);
	
	@WebMethod
	public int save(Lead lead);
	
	@WebMethod
	public BonusInfo getBonus(int id_lead);

}
