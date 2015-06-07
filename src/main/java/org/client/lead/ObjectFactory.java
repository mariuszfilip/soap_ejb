
package org.client.lead;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.client.lead package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetStatus_QNAME = new QName("http://localhost/test/wsdl", "getStatus");
    private final static QName _GetStatusResponse_QNAME = new QName("http://localhost/test/wsdl", "getStatusResponse");
    private final static QName _Save_QNAME = new QName("http://localhost/test/wsdl", "save");
    private final static QName _GetBonusResponse_QNAME = new QName("http://localhost/test/wsdl", "getBonusResponse");
    private final static QName _SaveResponse_QNAME = new QName("http://localhost/test/wsdl", "saveResponse");
    private final static QName _GetBonus_QNAME = new QName("http://localhost/test/wsdl", "getBonus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.client.lead
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

    /**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

    /**
     * Create an instance of {@link GetBonusResponse }
     * 
     */
    public GetBonusResponse createGetBonusResponse() {
        return new GetBonusResponse();
    }

    /**
     * Create an instance of {@link GetBonus }
     * 
     */
    public GetBonus createGetBonus() {
        return new GetBonus();
    }

    /**
     * Create an instance of {@link BonusInfo }
     * 
     */
    public BonusInfo createBonusInfo() {
        return new BonusInfo();
    }

    /**
     * Create an instance of {@link Lead }
     * 
     */
    public Lead createLead() {
        return new Lead();
    }

    /**
     * Create an instance of {@link LeadStatus }
     * 
     */
    public LeadStatus createLeadStatus() {
        return new LeadStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/test/wsdl", name = "getStatus")
    public JAXBElement<GetStatus> createGetStatus(GetStatus value) {
        return new JAXBElement<GetStatus>(_GetStatus_QNAME, GetStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/test/wsdl", name = "getStatusResponse")
    public JAXBElement<GetStatusResponse> createGetStatusResponse(GetStatusResponse value) {
        return new JAXBElement<GetStatusResponse>(_GetStatusResponse_QNAME, GetStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/test/wsdl", name = "save")
    public JAXBElement<Save> createSave(Save value) {
        return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBonusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/test/wsdl", name = "getBonusResponse")
    public JAXBElement<GetBonusResponse> createGetBonusResponse(GetBonusResponse value) {
        return new JAXBElement<GetBonusResponse>(_GetBonusResponse_QNAME, GetBonusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/test/wsdl", name = "saveResponse")
    public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
        return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBonus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/test/wsdl", name = "getBonus")
    public JAXBElement<GetBonus> createGetBonus(GetBonus value) {
        return new JAXBElement<GetBonus>(_GetBonus_QNAME, GetBonus.class, null, value);
    }

}
