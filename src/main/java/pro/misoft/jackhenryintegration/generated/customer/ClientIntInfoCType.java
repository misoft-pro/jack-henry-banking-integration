
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ClientIntInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientIntInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientIntName" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClientIntCode" type="{http://jackhenry.com/jxchange/TPG/2008}ClientIntCode_Type"/&gt;
 *         &lt;element name="ClientIntType" type="{http://jackhenry.com/jxchange/TPG/2008}ClientIntType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClientIntModTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}ModTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Rstr" type="{http://jackhenry.com/jxchange/TPG/2008}Rstr_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientIntInfo_CType", propOrder = {
    "clientIntName",
    "clientIntCode",
    "clientIntType",
    "clientIntModTimeDt",
    "crmOffCode",
    "crmOffDesc",
    "custom",
    "ver1",
    "any"
})
public class ClientIntInfoCType {

    @XmlElement(name = "ClientIntName")
    protected RmkType clientIntName;
    @XmlElement(name = "ClientIntCode", required = true)
    protected ClientIntCodeType clientIntCode;
    @XmlElement(name = "ClientIntType")
    protected ClientIntTypeType clientIntType;
    @XmlElement(name = "ClientIntModTimeDt")
    protected ModTimeDtType clientIntModTimeDt;
    @XmlElement(name = "CRMOffCode")
    protected CRMOffCodeType crmOffCode;
    @XmlElement(name = "CRMOffDesc")
    protected CRMOffDescType crmOffDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the clientIntName property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getClientIntName() {
        return clientIntName;
    }

    /**
     * Sets the value of the clientIntName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setClientIntName(RmkType value) {
        this.clientIntName = value;
    }

    /**
     * Gets the value of the clientIntCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClientIntCodeType }
     *     
     */
    public ClientIntCodeType getClientIntCode() {
        return clientIntCode;
    }

    /**
     * Sets the value of the clientIntCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientIntCodeType }
     *     
     */
    public void setClientIntCode(ClientIntCodeType value) {
        this.clientIntCode = value;
    }

    /**
     * Gets the value of the clientIntType property.
     * 
     * @return
     *     possible object is
     *     {@link ClientIntTypeType }
     *     
     */
    public ClientIntTypeType getClientIntType() {
        return clientIntType;
    }

    /**
     * Sets the value of the clientIntType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientIntTypeType }
     *     
     */
    public void setClientIntType(ClientIntTypeType value) {
        this.clientIntType = value;
    }

    /**
     * Gets the value of the clientIntModTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link ModTimeDtType }
     *     
     */
    public ModTimeDtType getClientIntModTimeDt() {
        return clientIntModTimeDt;
    }

    /**
     * Sets the value of the clientIntModTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModTimeDtType }
     *     
     */
    public void setClientIntModTimeDt(ModTimeDtType value) {
        this.clientIntModTimeDt = value;
    }

    /**
     * Gets the value of the crmOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffCodeType }
     *     
     */
    public CRMOffCodeType getCRMOffCode() {
        return crmOffCode;
    }

    /**
     * Sets the value of the crmOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffCodeType }
     *     
     */
    public void setCRMOffCode(CRMOffCodeType value) {
        this.crmOffCode = value;
    }

    /**
     * Gets the value of the crmOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffDescType }
     *     
     */
    public CRMOffDescType getCRMOffDesc() {
        return crmOffDesc;
    }

    /**
     * Sets the value of the crmOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffDescType }
     *     
     */
    public void setCRMOffDesc(CRMOffDescType value) {
        this.crmOffDesc = value;
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

    /**
     * Gets the value of the rstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstr() {
        return rstr;
    }

    /**
     * Sets the value of the rstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstr(String value) {
        this.rstr = value;
    }

}
