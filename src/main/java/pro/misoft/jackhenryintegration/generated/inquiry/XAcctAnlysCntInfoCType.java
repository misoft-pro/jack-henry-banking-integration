
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for x_AcctAnlysCntInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_AcctAnlysCntInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctAnlysCntInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AcctAnlysCntInfo_CType"/&gt;
 *         &lt;element name="AcctAnlysTrnInqArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctAnlysTrnInqArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "x_AcctAnlysCntInfo_CType", propOrder = {
    "acctAnlysCntInfo",
    "acctAnlysTrnInqArray",
    "ver1",
    "any"
})
public class XAcctAnlysCntInfoCType {

    @XmlElement(name = "AcctAnlysCntInfo", required = true)
    protected AcctAnlysCntInfoCType acctAnlysCntInfo;
    @XmlElement(name = "AcctAnlysTrnInqArray")
    protected AcctAnlysTrnInqArrayAType acctAnlysTrnInqArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the acctAnlysCntInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AcctAnlysCntInfoCType }
     *     
     */
    public AcctAnlysCntInfoCType getAcctAnlysCntInfo() {
        return acctAnlysCntInfo;
    }

    /**
     * Sets the value of the acctAnlysCntInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctAnlysCntInfoCType }
     *     
     */
    public void setAcctAnlysCntInfo(AcctAnlysCntInfoCType value) {
        this.acctAnlysCntInfo = value;
    }

    /**
     * Gets the value of the acctAnlysTrnInqArray property.
     * 
     * @return
     *     possible object is
     *     {@link AcctAnlysTrnInqArrayAType }
     *     
     */
    public AcctAnlysTrnInqArrayAType getAcctAnlysTrnInqArray() {
        return acctAnlysTrnInqArray;
    }

    /**
     * Sets the value of the acctAnlysTrnInqArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctAnlysTrnInqArrayAType }
     *     
     */
    public void setAcctAnlysTrnInqArray(AcctAnlysTrnInqArrayAType value) {
        this.acctAnlysTrnInqArray = value;
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
