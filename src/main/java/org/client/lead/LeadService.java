package org.client.lead;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.13
 * 2015-05-14T22:41:34.768+02:00
 * Generated source version: 2.7.13
 * 
 */
@WebService(targetNamespace = "http://localhost/test/wsdl", name = "LeadService")
@XmlSeeAlso({ObjectFactory.class})
public interface LeadService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getBonus", targetNamespace = "http://localhost/test/wsdl", className = "org.client.lead.GetBonus")
    @WebMethod
    @ResponseWrapper(localName = "getBonusResponse", targetNamespace = "http://localhost/test/wsdl", className = "org.client.lead.GetBonusResponse")
    public org.client.lead.BonusInfo getBonus(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "save", targetNamespace = "http://localhost/test/wsdl", className = "org.client.lead.Save")
    @WebMethod
    @ResponseWrapper(localName = "saveResponse", targetNamespace = "http://localhost/test/wsdl", className = "org.client.lead.SaveResponse")
    public int save(
        @WebParam(name = "arg0", targetNamespace = "")
        org.client.lead.Lead arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getStatus", targetNamespace = "http://localhost/test/wsdl", className = "org.client.lead.GetStatus")
    @WebMethod
    @ResponseWrapper(localName = "getStatusResponse", targetNamespace = "http://localhost/test/wsdl", className = "org.client.lead.GetStatusResponse")
    public org.client.lead.LeadStatus getStatus(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );
}
