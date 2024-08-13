
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
 * <p>Java class for IntnetFinInstIdMod_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntnetFinInstIdMod_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntnetInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="IntnetXferInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetXferInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="IntnetAccessInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetAccessInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="ValidXferInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ValidXferInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="IntnetCashMgmtInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetCashMgmtInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="BilPayInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}BilPayInfoRec_CType" minOccurs="0"/&gt;
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
@XmlType(name = "IntnetFinInstIdMod_CType", propOrder = {
    "intnetInfoRec",
    "intnetXferInfoRec",
    "intnetAccessInfoRec",
    "validXferInfoArray",
    "intnetCashMgmtInfoRec",
    "bilPayInfoRec",
    "ver1",
    "any"
})
public class IntnetFinInstIdModCType {

    @XmlElement(name = "IntnetInfoRec")
    protected IntnetInfoRecCType intnetInfoRec;
    @XmlElement(name = "IntnetXferInfoRec")
    protected IntnetXferInfoRecCType intnetXferInfoRec;
    @XmlElement(name = "IntnetAccessInfoRec")
    protected IntnetAccessInfoRecCType intnetAccessInfoRec;
    @XmlElement(name = "ValidXferInfoArray")
    protected ValidXferInfoArrayAType validXferInfoArray;
    @XmlElement(name = "IntnetCashMgmtInfoRec")
    protected IntnetCashMgmtInfoRecCType intnetCashMgmtInfoRec;
    @XmlElement(name = "BilPayInfoRec")
    protected BilPayInfoRecCType bilPayInfoRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the intnetInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetInfoRecCType }
     *     
     */
    public IntnetInfoRecCType getIntnetInfoRec() {
        return intnetInfoRec;
    }

    /**
     * Sets the value of the intnetInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetInfoRecCType }
     *     
     */
    public void setIntnetInfoRec(IntnetInfoRecCType value) {
        this.intnetInfoRec = value;
    }

    /**
     * Gets the value of the intnetXferInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetXferInfoRecCType }
     *     
     */
    public IntnetXferInfoRecCType getIntnetXferInfoRec() {
        return intnetXferInfoRec;
    }

    /**
     * Sets the value of the intnetXferInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetXferInfoRecCType }
     *     
     */
    public void setIntnetXferInfoRec(IntnetXferInfoRecCType value) {
        this.intnetXferInfoRec = value;
    }

    /**
     * Gets the value of the intnetAccessInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetAccessInfoRecCType }
     *     
     */
    public IntnetAccessInfoRecCType getIntnetAccessInfoRec() {
        return intnetAccessInfoRec;
    }

    /**
     * Sets the value of the intnetAccessInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetAccessInfoRecCType }
     *     
     */
    public void setIntnetAccessInfoRec(IntnetAccessInfoRecCType value) {
        this.intnetAccessInfoRec = value;
    }

    /**
     * Gets the value of the validXferInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link ValidXferInfoArrayAType }
     *     
     */
    public ValidXferInfoArrayAType getValidXferInfoArray() {
        return validXferInfoArray;
    }

    /**
     * Sets the value of the validXferInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidXferInfoArrayAType }
     *     
     */
    public void setValidXferInfoArray(ValidXferInfoArrayAType value) {
        this.validXferInfoArray = value;
    }

    /**
     * Gets the value of the intnetCashMgmtInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetCashMgmtInfoRecCType }
     *     
     */
    public IntnetCashMgmtInfoRecCType getIntnetCashMgmtInfoRec() {
        return intnetCashMgmtInfoRec;
    }

    /**
     * Sets the value of the intnetCashMgmtInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetCashMgmtInfoRecCType }
     *     
     */
    public void setIntnetCashMgmtInfoRec(IntnetCashMgmtInfoRecCType value) {
        this.intnetCashMgmtInfoRec = value;
    }

    /**
     * Gets the value of the bilPayInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link BilPayInfoRecCType }
     *     
     */
    public BilPayInfoRecCType getBilPayInfoRec() {
        return bilPayInfoRec;
    }

    /**
     * Sets the value of the bilPayInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilPayInfoRecCType }
     *     
     */
    public void setBilPayInfoRec(BilPayInfoRecCType value) {
        this.bilPayInfoRec = value;
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
