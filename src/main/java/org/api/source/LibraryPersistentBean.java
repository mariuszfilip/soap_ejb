package org.api.source;


import java.util.List;
import java.util.logging.Logger;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



public class LibraryPersistentBean {
	
	   @PersistenceContext(unitName="EjbComponentPU")
	   private EntityManager entityManager;         
	   
	   
	   private final static Logger LOGGER = Logger.getLogger(LibraryPersistentBean.class.getName()); 
	   
	 @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	   public int addLead(Lead lead) {
		   LOGGER.info("save lead : "+lead.getId());
		   entityManager.persist(lead);
		   LOGGER.info("id : "+lead.getId());
		   return lead.getId();
		   
	   }    

	   public List<Lead> getLeads() {
	      return entityManager.createQuery("From Book").getResultList();
	   }

	   public Lead getLead(int id_lead) {
		      return entityManager.find(Lead.class, id_lead);
		   }
	
}
