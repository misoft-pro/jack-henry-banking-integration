
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for LobbyQueInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LobbyQueInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LobbyQueId" type="{http://jackhenry.com/jxchange/TPG/2008}LobbyQueId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LobbyQueInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}LobbyQueInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EventOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LobbyQueStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LobbyQueStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="QueEntryTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}QueEntryTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LobbyQueInqRec_CType", propOrder = {
    "lobbyQueId",
    "lobbyQueInfoRec",
    "brDesc",
    "eventOffDesc",
    "lobbyQueStatDesc",
    "queEntryTimeDt",
    "custom",
    "ver1",
    "any"
})
public class LobbyQueInqRecCType {

    @XmlElement(name = "LobbyQueId")
    protected LobbyQueIdType lobbyQueId;
    @XmlElement(name = "LobbyQueInfoRec")
    protected LobbyQueInfoRecCType lobbyQueInfoRec;
    @XmlElement(name = "BrDesc")
    protected BrDescType brDesc;
    @XmlElement(name = "EventOffDesc")
    protected CRMOffDescType eventOffDesc;
    @XmlElement(name = "LobbyQueStatDesc")
    protected LobbyQueStatDescType lobbyQueStatDesc;
    @XmlElement(name = "QueEntryTimeDt")
    protected QueEntryTimeDtType queEntryTimeDt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lobbyQueId property.
     * 
     * @return
     *     possible object is
     *     {@link LobbyQueIdType }
     *     
     */
    public LobbyQueIdType getLobbyQueId() {
        return lobbyQueId;
    }

    /**
     * Sets the value of the lobbyQueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LobbyQueIdType }
     *     
     */
    public void setLobbyQueId(LobbyQueIdType value) {
        this.lobbyQueId = value;
    }

    /**
     * Gets the value of the lobbyQueInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link LobbyQueInfoRecCType }
     *     
     */
    public LobbyQueInfoRecCType getLobbyQueInfoRec() {
        return lobbyQueInfoRec;
    }

    /**
     * Sets the value of the lobbyQueInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link LobbyQueInfoRecCType }
     *     
     */
    public void setLobbyQueInfoRec(LobbyQueInfoRecCType value) {
        this.lobbyQueInfoRec = value;
    }

    /**
     * Gets the value of the brDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrDescType }
     *     
     */
    public BrDescType getBrDesc() {
        return brDesc;
    }

    /**
     * Sets the value of the brDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrDescType }
     *     
     */
    public void setBrDesc(BrDescType value) {
        this.brDesc = value;
    }

    /**
     * Gets the value of the eventOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffDescType }
     *     
     */
    public CRMOffDescType getEventOffDesc() {
        return eventOffDesc;
    }

    /**
     * Sets the value of the eventOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffDescType }
     *     
     */
    public void setEventOffDesc(CRMOffDescType value) {
        this.eventOffDesc = value;
    }

    /**
     * Gets the value of the lobbyQueStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LobbyQueStatDescType }
     *     
     */
    public LobbyQueStatDescType getLobbyQueStatDesc() {
        return lobbyQueStatDesc;
    }

    /**
     * Sets the value of the lobbyQueStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LobbyQueStatDescType }
     *     
     */
    public void setLobbyQueStatDesc(LobbyQueStatDescType value) {
        this.lobbyQueStatDesc = value;
    }

    /**
     * Gets the value of the queEntryTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link QueEntryTimeDtType }
     *     
     */
    public QueEntryTimeDtType getQueEntryTimeDt() {
        return queEntryTimeDt;
    }

    /**
     * Sets the value of the queEntryTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueEntryTimeDtType }
     *     
     */
    public void setQueEntryTimeDt(QueEntryTimeDtType value) {
        this.queEntryTimeDt = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustom(CustomCType value) {
        this.custom = value;
    }

    /**
     * Gets the value of the ver1 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver1CType }
     *     
     */
    public Ver1CType getVer1() {
        return ver1;
    }

    /**
     * Sets the value of the ver1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver1CType }
     *     
     */
    public void setVer1(Ver1CType value) {
        this.ver1 = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
