package org.client.lead.clientsample;

import org.client.lead.*;



public class ClientSample {

	public static void main(String[] args) {
		  System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        PartnerzyService service1 = new PartnerzyService();
	        System.out.println("Create Web Service...");
	        LeadService port1 = service1.getPartnerzyPort();
	        System.out.println("Call Web Service Operation...");
	       // System.out.println("Server said: " + port1.getBonus(Integer.parseInt(args[0])));
	        Lead lead = new Lead();
	        lead.setAmmount((double) 1);
	        lead.setFirstName("Mario");
	        lead.setLastName("asd");
	        lead.setPesel("asd");
	        lead.setIdstatusu(1);
	        //lead.setId(2);
	        int id = port1.save(lead);
	        System.out.println("Server said: " + port1.save(lead));
	        	
	        LeadStatus status = port1.getStatus(id);
	        
	        //System.out.println("Server said status : " + status.getStatus());
	        System.out.println("Create Web Service...");
	        LeadService port2 = service1.getPartnerzyPort();
	        System.out.println("Call Web Service Operation...");
	        BonusInfo bonus = port2.getBonus(id);
	        System.out.println("Server said bonus: " + bonus.getBonus());

	        //lease input the parameters instead of 'null' for the upper method!

	       // System.out.println("Server said: " + port2.getStatus(Integer.parseInt(args[3])));
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
