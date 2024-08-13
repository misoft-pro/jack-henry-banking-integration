
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
 * <p>Java class for IntnetAccessInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntnetAccessInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctIdAccess" type="{http://jackhenry.com/jxchange/TPG/2008}AcctIdAccess_Type" minOccurs="0"/&gt;
 *         &lt;element name="RelCodeAccessArray" type="{http://jackhenry.com/jxchange/TPG/2008}RelCodeAccessArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="AcctIdAccessArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctIdAccessArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ACHXferAllowCnt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHXferAllowCnt_Type" minOccurs="0"/&gt;
 *           &lt;element name="IntnetFinInstACHXferArray" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstACHXferArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "IntnetAccessInfoRec_CType", propOrder = {
    "acctIdAccess",
    "relCodeAccessArray",
    "acctIdAccessArray",
    "ver1",
    "achXferAllowCnt",
    "intnetFinInstACHXferArray",
    "ver2",
    "any"
})
public class IntnetAccessInfoRecCType {

    @XmlElement(name = "AcctIdAccess")
    protected AcctIdAccessType acctIdAccess;
    @XmlElement(name = "RelCodeAccessArray")
    protected RelCodeAccessArrayAType relCodeAccessArray;
    @XmlElement(name = "AcctIdAccessArray")
    protected AcctIdAccessArrayAType acctIdAccessArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ACHXferAllowCnt")
    protected ACHXferAllowCntType achXferAllowCnt;
    @XmlElement(name = "IntnetFinInstACHXferArray")
    protected IntnetFinInstACHXferArrayAType intnetFinInstACHXferArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the acctIdAccess property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdAccessType }
     *     
     */
    public AcctIdAccessType getAcctIdAccess() {
        return acctIdAccess;
    }

    /**
     * Sets the value of the acctIdAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdAccessType }
     *     
     */
    public void setAcctIdAccess(AcctIdAccessType value) {
        this.acctIdAccess = value;
    }

    /**
     * Gets the value of the relCodeAccessArray property.
     * 
     * @return
     *     possible object is
     *     {@link RelCodeAccessArrayAType }
     *     
     */
    public RelCodeAccessArrayAType getRelCodeAccessArray() {
        return relCodeAccessArray;
    }

    /**
     * Sets the value of the relCodeAccessArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelCodeAccessArrayAType }
     *     
     */
    public void setRelCodeAccessArray(RelCodeAccessArrayAType value) {
        this.relCodeAccessArray = value;
    }

    /**
     * Gets the value of the acctIdAccessArray property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdAccessArrayAType }
     *     
     */
    public AcctIdAccessArrayAType getAcctIdAccessArray() {
        return acctIdAccessArray;
    }

    /**
     * Sets the value of the acctIdAccessArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdAccessArrayAType }
     *     
     */
    public void setAcctIdAccessArray(AcctIdAccessArrayAType value) {
        this.acctIdAccessArray = value;
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
     * Gets the value of the achXferAllowCnt property.
     * 
     * @return
     *     possible object is
     *     {@link ACHXferAllowCntType }
     *     
     */
    public ACHXferAllowCntType getACHXferAllowCnt() {
        return achXferAllowCnt;
    }

    /**
     * Sets the value of the achXferAllowCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHXferAllowCntType }
     *     
     */
    public void setACHXferAllowCnt(ACHXferAllowCntType value) {
        this.achXferAllowCnt = value;
    }

    /**
     * Gets the value of the intnetFinInstACHXferArray property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetFinInstACHXferArrayAType }
     *     
     */
    public IntnetFinInstACHXferArrayAType getIntnetFinInstACHXferArray() {
        return intnetFinInstACHXferArray;
    }

    /**
     * Sets the value of the intnetFinInstACHXferArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetFinInstACHXferArrayAType }
     *     
     */
    public void setIntnetFinInstACHXferArray(IntnetFinInstACHXferArrayAType value) {
        this.intnetFinInstACHXferArray = value;
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
