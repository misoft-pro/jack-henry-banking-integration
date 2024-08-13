
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
 * <p>Java class for XtendInfoDetailRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XtendInfoDetailRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientInfoReqName" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClientInfoReqCode" type="{http://jackhenry.com/jxchange/TPG/2008}ClientInfoReqCode_Type"/&gt;
 *         &lt;element name="ClientInfoReqVal" type="{http://jackhenry.com/jxchange/TPG/2008}Val_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClientInfoReqDesc" type="{http://jackhenry.com/jxchange/TPG/2008}Name_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClientInfoReqDeclineType" type="{http://jackhenry.com/jxchange/TPG/2008}ClientInfoReqDeclineType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClientInfoReqModTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}ModTimeDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "XtendInfoDetailRec_CType", propOrder = {
    "clientInfoReqName",
    "clientInfoReqCode",
    "clientInfoReqVal",
    "clientInfoReqDesc",
    "clientInfoReqDeclineType",
    "clientInfoReqModTimeDt",
    "crmOffCode",
    "crmOffDesc",
    "custom",
    "ver1",
    "any"
})
public class XtendInfoDetailRecCType {

    @XmlElement(name = "ClientInfoReqName")
    protected RmkType clientInfoReqName;
    @XmlElement(name = "ClientInfoReqCode", required = true)
    protected ClientInfoReqCodeType clientInfoReqCode;
    @XmlElement(name = "ClientInfoReqVal")
    protected ValType clientInfoReqVal;
    @XmlElement(name = "ClientInfoReqDesc")
    protected NameType clientInfoReqDesc;
    @XmlElement(name = "ClientInfoReqDeclineType")
    protected ClientInfoReqDeclineTypeType clientInfoReqDeclineType;
    @XmlElement(name = "ClientInfoReqModTimeDt")
    protected ModTimeDtType clientInfoReqModTimeDt;
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
     * Gets the value of the clientInfoReqName property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getClientInfoReqName() {
        return clientInfoReqName;
    }

    /**
     * Sets the value of the clientInfoReqName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setClientInfoReqName(RmkType value) {
        this.clientInfoReqName = value;
    }

    /**
     * Gets the value of the clientInfoReqCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClientInfoReqCodeType }
     *     
     */
    public ClientInfoReqCodeType getClientInfoReqCode() {
        return clientInfoReqCode;
    }

    /**
     * Sets the value of the clientInfoReqCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientInfoReqCodeType }
     *     
     */
    public void setClientInfoReqCode(ClientInfoReqCodeType value) {
        this.clientInfoReqCode = value;
    }

    /**
     * Gets the value of the clientInfoReqVal property.
     * 
     * @return
     *     possible object is
     *     {@link ValType }
     *     
     */
    public ValType getClientInfoReqVal() {
        return clientInfoReqVal;
    }

    /**
     * Sets the value of the clientInfoReqVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValType }
     *     
     */
    public void setClientInfoReqVal(ValType value) {
        this.clientInfoReqVal = value;
    }

    /**
     * Gets the value of the clientInfoReqDesc property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getClientInfoReqDesc() {
        return clientInfoReqDesc;
    }

    /**
     * Sets the value of the clientInfoReqDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setClientInfoReqDesc(NameType value) {
        this.clientInfoReqDesc = value;
    }

    /**
     * Gets the value of the clientInfoReqDeclineType property.
     * 
     * @return
     *     possible object is
     *     {@link ClientInfoReqDeclineTypeType }
     *     
     */
    public ClientInfoReqDeclineTypeType getClientInfoReqDeclineType() {
        return clientInfoReqDeclineType;
    }

    /**
     * Sets the value of the clientInfoReqDeclineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientInfoReqDeclineTypeType }
     *     
     */
    public void setClientInfoReqDeclineType(ClientInfoReqDeclineTypeType value) {
        this.clientInfoReqDeclineType = value;
    }

    /**
     * Gets the value of the clientInfoReqModTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link ModTimeDtType }
     *     
     */
    public ModTimeDtType getClientInfoReqModTimeDt() {
        return clientInfoReqModTimeDt;
    }

    /**
     * Sets the value of the clientInfoReqModTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModTimeDtType }
     *     
     */
    public void setClientInfoReqModTimeDt(ModTimeDtType value) {
        this.clientInfoReqModTimeDt = value;
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
