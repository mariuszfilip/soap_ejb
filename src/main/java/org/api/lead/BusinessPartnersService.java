package org.api.lead;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.transaction.Transactional;

import org.api.source.BonusInfo;
import org.api.source.Lead;
import org.api.source.LeadStatus;
import org.api.source.LibraryPersistentBean;





@Stateless
@WebService(
        portName = "PartnerzyPort",
        serviceName = "PartnerzyService",
        targetNamespace = "http://localhost/test/wsdl",
        endpointInterface = "org.api.lead.LeadService")

public class BusinessPartnersService implements LeadService {
	
	@Inject
	private LibraryPersistentBean persistent;

	@Override
	public LeadStatus getStatus(int id_lead) {
		try{
			Lead entity = persistent.getLead(id_lead);
			
			LeadStatus status = new LeadStatus();
			status.setIdStatusu(entity.getIdstatusu());
			return status;
		}catch(Exception e){
			return null;
		}
	}

	@Override
	@Transactional
	public int save(Lead lead) {
		int addLead = persistent.addLead(lead);
		return addLead;
	}

	@Override
	public BonusInfo getBonus(int id_lead) {
		Lead entity = persistent.getLead(id_lead);		
		BonusInfo bonus = new BonusInfo();
		double bonus2 = entity.getAmmount()*0.010;
		bonus.setBonus(bonus2);
		return bonus;
	}
	
	
	

}
