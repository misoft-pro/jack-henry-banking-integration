
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
 * <p>Java class for BilPayInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPayInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}DrAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}DrAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AliasAcctName" type="{http://jackhenry.com/jxchange/TPG/2008}AliasAcctName_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilPayCrCompCode" type="{http://jackhenry.com/jxchange/TPG/2008}BilPayCrCompCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SerChgWav" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgWav_Type" minOccurs="0"/&gt;
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
@XmlType(name = "BilPayInfoRec_CType", propOrder = {
    "drAcctId",
    "drAcctType",
    "aliasAcctName",
    "bilPayCrCompCode",
    "serChgWav",
    "custom",
    "ver1",
    "any"
})
public class BilPayInfoRecCType {

    @XmlElement(name = "DrAcctId")
    protected DrAcctIdType drAcctId;
    @XmlElement(name = "DrAcctType")
    protected DrAcctTypeType drAcctType;
    @XmlElement(name = "AliasAcctName")
    protected AliasAcctNameType aliasAcctName;
    @XmlElement(name = "BilPayCrCompCode")
    protected BilPayCrCompCodeType bilPayCrCompCode;
    @XmlElement(name = "SerChgWav")
    protected SerChgWavType serChgWav;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the drAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link DrAcctIdType }
     *     
     */
    public DrAcctIdType getDrAcctId() {
        return drAcctId;
    }

    /**
     * Sets the value of the drAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrAcctIdType }
     *     
     */
    public void setDrAcctId(DrAcctIdType value) {
        this.drAcctId = value;
    }

    /**
     * Gets the value of the drAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link DrAcctTypeType }
     *     
     */
    public DrAcctTypeType getDrAcctType() {
        return drAcctType;
    }

    /**
     * Sets the value of the drAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrAcctTypeType }
     *     
     */
    public void setDrAcctType(DrAcctTypeType value) {
        this.drAcctType = value;
    }

    /**
     * Gets the value of the aliasAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link AliasAcctNameType }
     *     
     */
    public AliasAcctNameType getAliasAcctName() {
        return aliasAcctName;
    }

    /**
     * Sets the value of the aliasAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasAcctNameType }
     *     
     */
    public void setAliasAcctName(AliasAcctNameType value) {
        this.aliasAcctName = value;
    }

    /**
     * Gets the value of the bilPayCrCompCode property.
     * 
     * @return
     *     possible object is
     *     {@link BilPayCrCompCodeType }
     *     
     */
    public BilPayCrCompCodeType getBilPayCrCompCode() {
        return bilPayCrCompCode;
    }

    /**
     * Sets the value of the bilPayCrCompCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilPayCrCompCodeType }
     *     
     */
    public void setBilPayCrCompCode(BilPayCrCompCodeType value) {
        this.bilPayCrCompCode = value;
    }

    /**
     * Gets the value of the serChgWav property.
     * 
     * @return
     *     possible object is
     *     {@link SerChgWavType }
     *     
     */
    public SerChgWavType getSerChgWav() {
        return serChgWav;
    }

    /**
     * Sets the value of the serChgWav property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerChgWavType }
     *     
     */
    public void setSerChgWav(SerChgWavType value) {
        this.serChgWav = value;
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
