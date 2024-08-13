
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
 * <p>Java class for MktCmpgnInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MktCmpgnInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MktCmpgnId" type="{http://jackhenry.com/jxchange/TPG/2008}MktCmpgnId_Type" minOccurs="0"/&gt;
 *         &lt;element name="MktCmpgnType" type="{http://jackhenry.com/jxchange/TPG/2008}MktCmpgnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="MktCmpgnName" type="{http://jackhenry.com/jxchange/TPG/2008}MktCmpgnName_Type" minOccurs="0"/&gt;
 *         &lt;element name="MktCmpgnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MktCmpgnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="MktCmpgnStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MktCmpgnEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MktCmpgnExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMProdArray" type="{http://jackhenry.com/jxchange/TPG/2008}CRMProdArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "MktCmpgnInfoRec_CType", propOrder = {
    "mktCmpgnId",
    "mktCmpgnType",
    "mktCmpgnName",
    "mktCmpgnDesc",
    "mktCmpgnStartDt",
    "mktCmpgnEndDt",
    "mktCmpgnExpDt",
    "crmProdArray",
    "custom",
    "ver1",
    "any"
})
public class MktCmpgnInfoRecCType {

    @XmlElement(name = "MktCmpgnId")
    protected MktCmpgnIdType mktCmpgnId;
    @XmlElement(name = "MktCmpgnType")
    protected MktCmpgnTypeType mktCmpgnType;
    @XmlElement(name = "MktCmpgnName")
    protected MktCmpgnNameType mktCmpgnName;
    @XmlElement(name = "MktCmpgnDesc")
    protected MktCmpgnDescType mktCmpgnDesc;
    @XmlElement(name = "MktCmpgnStartDt")
    protected StartDtType mktCmpgnStartDt;
    @XmlElement(name = "MktCmpgnEndDt")
    protected EndDtType mktCmpgnEndDt;
    @XmlElement(name = "MktCmpgnExpDt")
    protected ExpDtType mktCmpgnExpDt;
    @XmlElement(name = "CRMProdArray")
    protected CRMProdArrayAType crmProdArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the mktCmpgnId property.
     * 
     * @return
     *     possible object is
     *     {@link MktCmpgnIdType }
     *     
     */
    public MktCmpgnIdType getMktCmpgnId() {
        return mktCmpgnId;
    }

    /**
     * Sets the value of the mktCmpgnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MktCmpgnIdType }
     *     
     */
    public void setMktCmpgnId(MktCmpgnIdType value) {
        this.mktCmpgnId = value;
    }

    /**
     * Gets the value of the mktCmpgnType property.
     * 
     * @return
     *     possible object is
     *     {@link MktCmpgnTypeType }
     *     
     */
    public MktCmpgnTypeType getMktCmpgnType() {
        return mktCmpgnType;
    }

    /**
     * Sets the value of the mktCmpgnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MktCmpgnTypeType }
     *     
     */
    public void setMktCmpgnType(MktCmpgnTypeType value) {
        this.mktCmpgnType = value;
    }

    /**
     * Gets the value of the mktCmpgnName property.
     * 
     * @return
     *     possible object is
     *     {@link MktCmpgnNameType }
     *     
     */
    public MktCmpgnNameType getMktCmpgnName() {
        return mktCmpgnName;
    }

    /**
     * Sets the value of the mktCmpgnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MktCmpgnNameType }
     *     
     */
    public void setMktCmpgnName(MktCmpgnNameType value) {
        this.mktCmpgnName = value;
    }

    /**
     * Gets the value of the mktCmpgnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link MktCmpgnDescType }
     *     
     */
    public MktCmpgnDescType getMktCmpgnDesc() {
        return mktCmpgnDesc;
    }

    /**
     * Sets the value of the mktCmpgnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MktCmpgnDescType }
     *     
     */
    public void setMktCmpgnDesc(MktCmpgnDescType value) {
        this.mktCmpgnDesc = value;
    }

    /**
     * Gets the value of the mktCmpgnStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartDtType }
     *     
     */
    public StartDtType getMktCmpgnStartDt() {
        return mktCmpgnStartDt;
    }

    /**
     * Sets the value of the mktCmpgnStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDtType }
     *     
     */
    public void setMktCmpgnStartDt(StartDtType value) {
        this.mktCmpgnStartDt = value;
    }

    /**
     * Gets the value of the mktCmpgnEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link EndDtType }
     *     
     */
    public EndDtType getMktCmpgnEndDt() {
        return mktCmpgnEndDt;
    }

    /**
     * Sets the value of the mktCmpgnEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDtType }
     *     
     */
    public void setMktCmpgnEndDt(EndDtType value) {
        this.mktCmpgnEndDt = value;
    }

    /**
     * Gets the value of the mktCmpgnExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getMktCmpgnExpDt() {
        return mktCmpgnExpDt;
    }

    /**
     * Sets the value of the mktCmpgnExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setMktCmpgnExpDt(ExpDtType value) {
        this.mktCmpgnExpDt = value;
    }

    /**
     * Gets the value of the crmProdArray property.
     * 
     * @return
     *     possible object is
     *     {@link CRMProdArrayAType }
     *     
     */
    public CRMProdArrayAType getCRMProdArray() {
        return crmProdArray;
    }

    /**
     * Sets the value of the crmProdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMProdArrayAType }
     *     
     */
    public void setCRMProdArray(CRMProdArrayAType value) {
        this.crmProdArray = value;
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
