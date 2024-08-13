
package pro.misoft.jackhenryintegration.generated.ach;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for AcctOffsetInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctOffsetInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctOffsetType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctOffsetType_Type"/&gt;
 *         &lt;element name="AcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type"/&gt;
 *         &lt;element name="AcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHOffsetBalType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHOffsetBalType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHOffsetDefType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHOffsetDefType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHOffsetBrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "AcctOffsetInfo_CType", propOrder = {
    "acctOffsetType",
    "acctId",
    "acctType",
    "achOffsetBalType",
    "achOffsetDefType",
    "achOffsetBrCode",
    "custom",
    "ver1",
    "any"
})
public class AcctOffsetInfoCType {

    @XmlElement(name = "AcctOffsetType", required = true)
    protected AcctOffsetTypeType acctOffsetType;
    @XmlElement(name = "AcctId", required = true)
    protected AcctIdType acctId;
    @XmlElement(name = "AcctType")
    protected AcctTypeType acctType;
    @XmlElement(name = "ACHOffsetBalType")
    protected ACHOffsetBalTypeType achOffsetBalType;
    @XmlElement(name = "ACHOffsetDefType")
    protected ACHOffsetDefTypeType achOffsetDefType;
    @XmlElement(name = "ACHOffsetBrCode")
    protected BrCodeType achOffsetBrCode;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the acctOffsetType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctOffsetTypeType }
     *     
     */
    public AcctOffsetTypeType getAcctOffsetType() {
        return acctOffsetType;
    }

    /**
     * Sets the value of the acctOffsetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctOffsetTypeType }
     *     
     */
    public void setAcctOffsetType(AcctOffsetTypeType value) {
        this.acctOffsetType = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setAcctId(AcctIdType value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setAcctType(AcctTypeType value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the achOffsetBalType property.
     * 
     * @return
     *     possible object is
     *     {@link ACHOffsetBalTypeType }
     *     
     */
    public ACHOffsetBalTypeType getACHOffsetBalType() {
        return achOffsetBalType;
    }

    /**
     * Sets the value of the achOffsetBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHOffsetBalTypeType }
     *     
     */
    public void setACHOffsetBalType(ACHOffsetBalTypeType value) {
        this.achOffsetBalType = value;
    }

    /**
     * Gets the value of the achOffsetDefType property.
     * 
     * @return
     *     possible object is
     *     {@link ACHOffsetDefTypeType }
     *     
     */
    public ACHOffsetDefTypeType getACHOffsetDefType() {
        return achOffsetDefType;
    }

    /**
     * Sets the value of the achOffsetDefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHOffsetDefTypeType }
     *     
     */
    public void setACHOffsetDefType(ACHOffsetDefTypeType value) {
        this.achOffsetDefType = value;
    }

    /**
     * Gets the value of the achOffsetBrCode property.
     * 
     * @return
     *     possible object is
     *     {@link BrCodeType }
     *     
     */
    public BrCodeType getACHOffsetBrCode() {
        return achOffsetBrCode;
    }

    /**
     * Sets the value of the achOffsetBrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrCodeType }
     *     
     */
    public void setACHOffsetBrCode(BrCodeType value) {
        this.achOffsetBrCode = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public JAXBElement<CustomCType> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public void setCustom(JAXBElement<CustomCType> value) {
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
