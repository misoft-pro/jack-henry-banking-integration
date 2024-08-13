
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for MultiDepRateRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiDepRateRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EffDt_Type"/&gt;
 *         &lt;element name="IntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccrInt" type="{http://jackhenry.com/jxchange/TPG/2008}AccrInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccrBal" type="{http://jackhenry.com/jxchange/TPG/2008}AccrBal_Type" minOccurs="0"/&gt;
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
@XmlType(name = "MultiDepRateRec_CType", propOrder = {
    "depEffDt",
    "intRate",
    "accrInt",
    "accrBal",
    "ver1",
    "any"
})
public class MultiDepRateRecCType {

    @XmlElement(name = "DepEffDt", required = true)
    protected EffDtType depEffDt;
    @XmlElement(name = "IntRate")
    protected IntRateType intRate;
    @XmlElement(name = "AccrInt")
    protected AccrIntType accrInt;
    @XmlElement(name = "AccrBal")
    protected AccrBalType accrBal;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the depEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link EffDtType }
     *     
     */
    public EffDtType getDepEffDt() {
        return depEffDt;
    }

    /**
     * Sets the value of the depEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffDtType }
     *     
     */
    public void setDepEffDt(EffDtType value) {
        this.depEffDt = value;
    }

    /**
     * Gets the value of the intRate property.
     * 
     * @return
     *     possible object is
     *     {@link IntRateType }
     *     
     */
    public IntRateType getIntRate() {
        return intRate;
    }

    /**
     * Sets the value of the intRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRateType }
     *     
     */
    public void setIntRate(IntRateType value) {
        this.intRate = value;
    }

    /**
     * Gets the value of the accrInt property.
     * 
     * @return
     *     possible object is
     *     {@link AccrIntType }
     *     
     */
    public AccrIntType getAccrInt() {
        return accrInt;
    }

    /**
     * Sets the value of the accrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccrIntType }
     *     
     */
    public void setAccrInt(AccrIntType value) {
        this.accrInt = value;
    }

    /**
     * Gets the value of the accrBal property.
     * 
     * @return
     *     possible object is
     *     {@link AccrBalType }
     *     
     */
    public AccrBalType getAccrBal() {
        return accrBal;
    }

    /**
     * Sets the value of the accrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccrBalType }
     *     
     */
    public void setAccrBal(AccrBalType value) {
        this.accrBal = value;
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
