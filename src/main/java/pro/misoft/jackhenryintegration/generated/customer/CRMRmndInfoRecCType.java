
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
 * <p>Java class for CRMRmndInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMRmndInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RmndType" type="{http://jackhenry.com/jxchange/TPG/2008}RmndType_Type"/&gt;
 *         &lt;element name="RmndDt" type="{http://jackhenry.com/jxchange/TPG/2008}RmndDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AssignOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RecurInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}RecurInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="CRMItemId" type="{http://jackhenry.com/jxchange/TPG/2008}CRMItemId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMItemType" type="{http://jackhenry.com/jxchange/TPG/2008}CRMItemType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrtOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RmndCrtTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}RmndCrtTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RmndSubj" type="{http://jackhenry.com/jxchange/TPG/2008}RmndSubj_Type" minOccurs="0"/&gt;
 *         &lt;element name="RmndDetlArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
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
@XmlType(name = "CRMRmndInfoRec_CType", propOrder = {
    "rmndType",
    "rmndDt",
    "assignOffCode",
    "recurInfoRec",
    "crmItemId",
    "crmItemType",
    "crtOffCode",
    "rmndCrtTimeDt",
    "rmndSubj",
    "rmndDetlArray",
    "custom",
    "ver1",
    "any"
})
public class CRMRmndInfoRecCType {

    @XmlElement(name = "RmndType", required = true)
    protected RmndTypeType rmndType;
    @XmlElement(name = "RmndDt")
    protected RmndDtType rmndDt;
    @XmlElement(name = "AssignOffCode")
    protected CRMOffCodeType assignOffCode;
    @XmlElement(name = "RecurInfoRec")
    protected RecurInfoRecCType recurInfoRec;
    @XmlElement(name = "CRMItemId")
    protected CRMItemIdType crmItemId;
    @XmlElement(name = "CRMItemType")
    protected CRMItemTypeType crmItemType;
    @XmlElement(name = "CrtOffCode")
    protected CRMOffCodeType crtOffCode;
    @XmlElement(name = "RmndCrtTimeDt")
    protected RmndCrtTimeDtType rmndCrtTimeDt;
    @XmlElement(name = "RmndSubj")
    protected RmndSubjType rmndSubj;
    @XmlElement(name = "RmndDetlArray")
    protected RmkAType rmndDetlArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the rmndType property.
     * 
     * @return
     *     possible object is
     *     {@link RmndTypeType }
     *     
     */
    public RmndTypeType getRmndType() {
        return rmndType;
    }

    /**
     * Sets the value of the rmndType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmndTypeType }
     *     
     */
    public void setRmndType(RmndTypeType value) {
        this.rmndType = value;
    }

    /**
     * Gets the value of the rmndDt property.
     * 
     * @return
     *     possible object is
     *     {@link RmndDtType }
     *     
     */
    public RmndDtType getRmndDt() {
        return rmndDt;
    }

    /**
     * Sets the value of the rmndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmndDtType }
     *     
     */
    public void setRmndDt(RmndDtType value) {
        this.rmndDt = value;
    }

    /**
     * Gets the value of the assignOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffCodeType }
     *     
     */
    public CRMOffCodeType getAssignOffCode() {
        return assignOffCode;
    }

    /**
     * Sets the value of the assignOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffCodeType }
     *     
     */
    public void setAssignOffCode(CRMOffCodeType value) {
        this.assignOffCode = value;
    }

    /**
     * Gets the value of the recurInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link RecurInfoRecCType }
     *     
     */
    public RecurInfoRecCType getRecurInfoRec() {
        return recurInfoRec;
    }

    /**
     * Sets the value of the recurInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurInfoRecCType }
     *     
     */
    public void setRecurInfoRec(RecurInfoRecCType value) {
        this.recurInfoRec = value;
    }

    /**
     * Gets the value of the crmItemId property.
     * 
     * @return
     *     possible object is
     *     {@link CRMItemIdType }
     *     
     */
    public CRMItemIdType getCRMItemId() {
        return crmItemId;
    }

    /**
     * Sets the value of the crmItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMItemIdType }
     *     
     */
    public void setCRMItemId(CRMItemIdType value) {
        this.crmItemId = value;
    }

    /**
     * Gets the value of the crmItemType property.
     * 
     * @return
     *     possible object is
     *     {@link CRMItemTypeType }
     *     
     */
    public CRMItemTypeType getCRMItemType() {
        return crmItemType;
    }

    /**
     * Sets the value of the crmItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMItemTypeType }
     *     
     */
    public void setCRMItemType(CRMItemTypeType value) {
        this.crmItemType = value;
    }

    /**
     * Gets the value of the crtOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffCodeType }
     *     
     */
    public CRMOffCodeType getCrtOffCode() {
        return crtOffCode;
    }

    /**
     * Sets the value of the crtOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffCodeType }
     *     
     */
    public void setCrtOffCode(CRMOffCodeType value) {
        this.crtOffCode = value;
    }

    /**
     * Gets the value of the rmndCrtTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link RmndCrtTimeDtType }
     *     
     */
    public RmndCrtTimeDtType getRmndCrtTimeDt() {
        return rmndCrtTimeDt;
    }

    /**
     * Sets the value of the rmndCrtTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmndCrtTimeDtType }
     *     
     */
    public void setRmndCrtTimeDt(RmndCrtTimeDtType value) {
        this.rmndCrtTimeDt = value;
    }

    /**
     * Gets the value of the rmndSubj property.
     * 
     * @return
     *     possible object is
     *     {@link RmndSubjType }
     *     
     */
    public RmndSubjType getRmndSubj() {
        return rmndSubj;
    }

    /**
     * Sets the value of the rmndSubj property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmndSubjType }
     *     
     */
    public void setRmndSubj(RmndSubjType value) {
        this.rmndSubj = value;
    }

    /**
     * Gets the value of the rmndDetlArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getRmndDetlArray() {
        return rmndDetlArray;
    }

    /**
     * Sets the value of the rmndDetlArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setRmndDetlArray(RmkAType value) {
        this.rmndDetlArray = value;
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
