
package pro.misoft.jackhenryintegration.generated.transaction;

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
 * <p>Java class for WireIntlCustInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireIntlCustInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdVerifyCode" type="{http://jackhenry.com/jxchange/TPG/2008}IdVerifyCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdVerifyVal" type="{http://jackhenry.com/jxchange/TPG/2008}IdVerifyVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustType" type="{http://jackhenry.com/jxchange/TPG/2008}CustType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireCustInfo" type="{http://jackhenry.com/jxchange/TPG/2008}WireCustInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireInternalRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="WireInfoRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="WireConArray" type="{http://jackhenry.com/jxchange/TPG/2008}WireConArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "WireIntlCustInfoRec_CType", propOrder = {
    "idVerifyCode",
    "idVerifyVal",
    "custType",
    "custId",
    "wireCustInfo",
    "taxId",
    "wireInternalRmkArray",
    "wireInfoRmkArray",
    "wireConArray",
    "custom",
    "ver1",
    "any"
})
public class WireIntlCustInfoRecCType {

    @XmlElement(name = "IdVerifyCode")
    protected IdVerifyCodeType idVerifyCode;
    @XmlElement(name = "IdVerifyVal")
    protected IdVerifyValType idVerifyVal;
    @XmlElement(name = "CustType")
    protected CustTypeType custType;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "WireCustInfo")
    protected WireCustInfoCType wireCustInfo;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "WireInternalRmkArray")
    protected RmkAType wireInternalRmkArray;
    @XmlElement(name = "WireInfoRmkArray")
    protected RmkAType wireInfoRmkArray;
    @XmlElement(name = "WireConArray")
    protected WireConArrayAType wireConArray;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the idVerifyCode property.
     * 
     * @return
     *     possible object is
     *     {@link IdVerifyCodeType }
     *     
     */
    public IdVerifyCodeType getIdVerifyCode() {
        return idVerifyCode;
    }

    /**
     * Sets the value of the idVerifyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdVerifyCodeType }
     *     
     */
    public void setIdVerifyCode(IdVerifyCodeType value) {
        this.idVerifyCode = value;
    }

    /**
     * Gets the value of the idVerifyVal property.
     * 
     * @return
     *     possible object is
     *     {@link IdVerifyValType }
     *     
     */
    public IdVerifyValType getIdVerifyVal() {
        return idVerifyVal;
    }

    /**
     * Sets the value of the idVerifyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdVerifyValType }
     *     
     */
    public void setIdVerifyVal(IdVerifyValType value) {
        this.idVerifyVal = value;
    }

    /**
     * Gets the value of the custType property.
     * 
     * @return
     *     possible object is
     *     {@link CustTypeType }
     *     
     */
    public CustTypeType getCustType() {
        return custType;
    }

    /**
     * Sets the value of the custType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustTypeType }
     *     
     */
    public void setCustType(CustTypeType value) {
        this.custType = value;
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
     * Gets the value of the wireCustInfo property.
     * 
     * @return
     *     possible object is
     *     {@link WireCustInfoCType }
     *     
     */
    public WireCustInfoCType getWireCustInfo() {
        return wireCustInfo;
    }

    /**
     * Sets the value of the wireCustInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireCustInfoCType }
     *     
     */
    public void setWireCustInfo(WireCustInfoCType value) {
        this.wireCustInfo = value;
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
     * Gets the value of the wireInternalRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getWireInternalRmkArray() {
        return wireInternalRmkArray;
    }

    /**
     * Sets the value of the wireInternalRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setWireInternalRmkArray(RmkAType value) {
        this.wireInternalRmkArray = value;
    }

    /**
     * Gets the value of the wireInfoRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getWireInfoRmkArray() {
        return wireInfoRmkArray;
    }

    /**
     * Sets the value of the wireInfoRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setWireInfoRmkArray(RmkAType value) {
        this.wireInfoRmkArray = value;
    }

    /**
     * Gets the value of the wireConArray property.
     * 
     * @return
     *     possible object is
     *     {@link WireConArrayAType }
     *     
     */
    public WireConArrayAType getWireConArray() {
        return wireConArray;
    }

    /**
     * Sets the value of the wireConArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireConArrayAType }
     *     
     */
    public void setWireConArray(WireConArrayAType value) {
        this.wireConArray = value;
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
     * {@link Element }
     * {@link Object }
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
