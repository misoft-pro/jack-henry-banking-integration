
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
 * <p>Java class for CRMActInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMActInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMActInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActInfoRec_CType"/&gt;
 *         &lt;element name="CRMActType" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActType_Type"/&gt;
 *         &lt;element name="CRMActId" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMRelCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctRelCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMEventId" type="{http://jackhenry.com/jxchange/TPG/2008}CRMEventId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActCrtOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMActStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ActCrtTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}ActCrtTimeDt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="PurpDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PurpDesc_Type" minOccurs="0"/&gt;
 *             &lt;element name="MeetLocDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MeetLocDesc_Type" minOccurs="0"/&gt;
 *             &lt;element name="CRMActSumDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActSumDesc_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="x_MktCmpgnInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_MktCmpgnInfoArray_AType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
 *             &lt;/sequence&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "CRMActInqRec_CType", propOrder = {
    "crmActInfoRec",
    "crmActType",
    "crmActId",
    "custId",
    "crmRelCode",
    "taxId",
    "crmEventId",
    "actCrtOffDesc",
    "crmActStatDesc",
    "custom",
    "ver1",
    "actCrtTimeDt",
    "ver2",
    "purpDesc",
    "meetLocDesc",
    "crmActSumDesc",
    "ver3",
    "xMktCmpgnInfoArray",
    "ver4",
    "any"
})
public class CRMActInqRecCType {

    @XmlElement(name = "CRMActInfoRec", required = true)
    protected CRMActInfoRecCType crmActInfoRec;
    @XmlElement(name = "CRMActType", required = true)
    protected CRMActTypeType crmActType;
    @XmlElement(name = "CRMActId")
    protected CRMActIdType crmActId;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "CRMRelCode")
    protected AcctRelCodeType crmRelCode;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "CRMEventId")
    protected CRMEventIdType crmEventId;
    @XmlElement(name = "ActCrtOffDesc")
    protected CRMOffDescType actCrtOffDesc;
    @XmlElement(name = "CRMActStatDesc")
    protected CRMActStatDescType crmActStatDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ActCrtTimeDt")
    protected ActCrtTimeDtType actCrtTimeDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "PurpDesc")
    protected PurpDescType purpDesc;
    @XmlElement(name = "MeetLocDesc")
    protected MeetLocDescType meetLocDesc;
    @XmlElement(name = "CRMActSumDesc")
    protected CRMActSumDescType crmActSumDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "x_MktCmpgnInfoArray")
    protected XMktCmpgnInfoArrayAType xMktCmpgnInfoArray;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the crmActInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActInfoRecCType }
     *     
     */
    public CRMActInfoRecCType getCRMActInfoRec() {
        return crmActInfoRec;
    }

    /**
     * Sets the value of the crmActInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActInfoRecCType }
     *     
     */
    public void setCRMActInfoRec(CRMActInfoRecCType value) {
        this.crmActInfoRec = value;
    }

    /**
     * Gets the value of the crmActType property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActTypeType }
     *     
     */
    public CRMActTypeType getCRMActType() {
        return crmActType;
    }

    /**
     * Sets the value of the crmActType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActTypeType }
     *     
     */
    public void setCRMActType(CRMActTypeType value) {
        this.crmActType = value;
    }

    /**
     * Gets the value of the crmActId property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActIdType }
     *     
     */
    public CRMActIdType getCRMActId() {
        return crmActId;
    }

    /**
     * Sets the value of the crmActId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActIdType }
     *     
     */
    public void setCRMActId(CRMActIdType value) {
        this.crmActId = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCustId(CustIdType value) {
        this.custId = value;
    }

    /**
     * Gets the value of the crmRelCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRelCodeType }
     *     
     */
    public AcctRelCodeType getCRMRelCode() {
        return crmRelCode;
    }

    /**
     * Sets the value of the crmRelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRelCodeType }
     *     
     */
    public void setCRMRelCode(AcctRelCodeType value) {
        this.crmRelCode = value;
    }

    /**
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdType }
     *     
     */
    public TaxIdType getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdType }
     *     
     */
    public void setTaxId(TaxIdType value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the crmEventId property.
     * 
     * @return
     *     possible object is
     *     {@link CRMEventIdType }
     *     
     */
    public CRMEventIdType getCRMEventId() {
        return crmEventId;
    }

    /**
     * Sets the value of the crmEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMEventIdType }
     *     
     */
    public void setCRMEventId(CRMEventIdType value) {
        this.crmEventId = value;
    }

    /**
     * Gets the value of the actCrtOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffDescType }
     *     
     */
    public CRMOffDescType getActCrtOffDesc() {
        return actCrtOffDesc;
    }

    /**
     * Sets the value of the actCrtOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffDescType }
     *     
     */
    public void setActCrtOffDesc(CRMOffDescType value) {
        this.actCrtOffDesc = value;
    }

    /**
     * Gets the value of the crmActStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActStatDescType }
     *     
     */
    public CRMActStatDescType getCRMActStatDesc() {
        return crmActStatDesc;
    }

    /**
     * Sets the value of the crmActStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActStatDescType }
     *     
     */
    public void setCRMActStatDesc(CRMActStatDescType value) {
        this.crmActStatDesc = value;
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
     * Gets the value of the actCrtTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link ActCrtTimeDtType }
     *     
     */
    public ActCrtTimeDtType getActCrtTimeDt() {
        return actCrtTimeDt;
    }

    /**
     * Sets the value of the actCrtTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActCrtTimeDtType }
     *     
     */
    public void setActCrtTimeDt(ActCrtTimeDtType value) {
        this.actCrtTimeDt = value;
    }

    /**
     * Gets the value of the ver2 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver2CType }
     *     
     */
    public Ver2CType getVer2() {
        return ver2;
    }

    /**
     * Sets the value of the ver2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver2CType }
     *     
     */
    public void setVer2(Ver2CType value) {
        this.ver2 = value;
    }

    /**
     * Gets the value of the purpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PurpDescType }
     *     
     */
    public PurpDescType getPurpDesc() {
        return purpDesc;
    }

    /**
     * Sets the value of the purpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurpDescType }
     *     
     */
    public void setPurpDesc(PurpDescType value) {
        this.purpDesc = value;
    }

    /**
     * Gets the value of the meetLocDesc property.
     * 
     * @return
     *     possible object is
     *     {@link MeetLocDescType }
     *     
     */
    public MeetLocDescType getMeetLocDesc() {
        return meetLocDesc;
    }

    /**
     * Sets the value of the meetLocDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetLocDescType }
     *     
     */
    public void setMeetLocDesc(MeetLocDescType value) {
        this.meetLocDesc = value;
    }

    /**
     * Gets the value of the crmActSumDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActSumDescType }
     *     
     */
    public CRMActSumDescType getCRMActSumDesc() {
        return crmActSumDesc;
    }

    /**
     * Sets the value of the crmActSumDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActSumDescType }
     *     
     */
    public void setCRMActSumDesc(CRMActSumDescType value) {
        this.crmActSumDesc = value;
    }

    /**
     * Gets the value of the ver3 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver3CType }
     *     
     */
    public Ver3CType getVer3() {
        return ver3;
    }

    /**
     * Sets the value of the ver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver3CType }
     *     
     */
    public void setVer3(Ver3CType value) {
        this.ver3 = value;
    }

    /**
     * Gets the value of the xMktCmpgnInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link XMktCmpgnInfoArrayAType }
     *     
     */
    public XMktCmpgnInfoArrayAType getXMktCmpgnInfoArray() {
        return xMktCmpgnInfoArray;
    }

    /**
     * Sets the value of the xMktCmpgnInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMktCmpgnInfoArrayAType }
     *     
     */
    public void setXMktCmpgnInfoArray(XMktCmpgnInfoArrayAType value) {
        this.xMktCmpgnInfoArray = value;
    }

    /**
     * Gets the value of the ver4 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver4CType }
     *     
     */
    public Ver4CType getVer4() {
        return ver4;
    }

    /**
     * Sets the value of the ver4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver4CType }
     *     
     */
    public void setVer4(Ver4CType value) {
        this.ver4 = value;
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
