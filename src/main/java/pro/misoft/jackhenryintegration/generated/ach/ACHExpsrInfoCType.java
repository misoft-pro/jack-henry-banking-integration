
package pro.misoft.jackhenryintegration.generated.ach;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ACHExpsrInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHExpsrInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpsrEffDtType" type="{http://jackhenry.com/jxchange/TPG/2008}ExpsrEffDtType_Type"/&gt;
 *         &lt;element name="ExpsrDrCr" type="{http://jackhenry.com/jxchange/TPG/2008}DrCr_Type"/&gt;
 *         &lt;element name="ACHExpsrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHExpsrAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ACHExpsrInfo_CType", propOrder = {
    "expsrEffDtType",
    "expsrDrCr",
    "achExpsrAmt",
    "custom",
    "ver1",
    "any"
})
public class ACHExpsrInfoCType {

    @XmlElement(name = "ExpsrEffDtType", required = true)
    protected ExpsrEffDtTypeType expsrEffDtType;
    @XmlElement(name = "ExpsrDrCr", required = true)
    protected DrCrType expsrDrCr;
    @XmlElement(name = "ACHExpsrAmt")
    protected ACHExpsrAmtType achExpsrAmt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the expsrEffDtType property.
     * 
     * @return
     *     possible object is
     *     {@link ExpsrEffDtTypeType }
     *     
     */
    public ExpsrEffDtTypeType getExpsrEffDtType() {
        return expsrEffDtType;
    }

    /**
     * Sets the value of the expsrEffDtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpsrEffDtTypeType }
     *     
     */
    public void setExpsrEffDtType(ExpsrEffDtTypeType value) {
        this.expsrEffDtType = value;
    }

    /**
     * Gets the value of the expsrDrCr property.
     * 
     * @return
     *     possible object is
     *     {@link DrCrType }
     *     
     */
    public DrCrType getExpsrDrCr() {
        return expsrDrCr;
    }

    /**
     * Sets the value of the expsrDrCr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrCrType }
     *     
     */
    public void setExpsrDrCr(DrCrType value) {
        this.expsrDrCr = value;
    }

    /**
     * Gets the value of the achExpsrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ACHExpsrAmtType }
     *     
     */
    public ACHExpsrAmtType getACHExpsrAmt() {
        return achExpsrAmt;
    }

    /**
     * Sets the value of the achExpsrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHExpsrAmtType }
     *     
     */
    public void setACHExpsrAmt(ACHExpsrAmtType value) {
        this.achExpsrAmt = value;
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
