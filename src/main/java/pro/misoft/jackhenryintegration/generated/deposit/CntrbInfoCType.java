
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
 * <p>Java class for CntrbInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CntrbInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CntrbYr" type="{http://jackhenry.com/jxchange/TPG/2008}CntrbYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="CntrbType" type="{http://jackhenry.com/jxchange/TPG/2008}CntrbType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CntrbAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CntrbAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CntrbInfo_CType", propOrder = {
    "cntrbYr",
    "cntrbType",
    "cntrbAmt",
    "ver1",
    "any"
})
public class CntrbInfoCType {

    @XmlElement(name = "CntrbYr")
    protected CntrbYrType cntrbYr;
    @XmlElement(name = "CntrbType")
    protected CntrbTypeType cntrbType;
    @XmlElement(name = "CntrbAmt")
    protected CntrbAmtType cntrbAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the cntrbYr property.
     * 
     * @return
     *     possible object is
     *     {@link CntrbYrType }
     *     
     */
    public CntrbYrType getCntrbYr() {
        return cntrbYr;
    }

    /**
     * Sets the value of the cntrbYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntrbYrType }
     *     
     */
    public void setCntrbYr(CntrbYrType value) {
        this.cntrbYr = value;
    }

    /**
     * Gets the value of the cntrbType property.
     * 
     * @return
     *     possible object is
     *     {@link CntrbTypeType }
     *     
     */
    public CntrbTypeType getCntrbType() {
        return cntrbType;
    }

    /**
     * Sets the value of the cntrbType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntrbTypeType }
     *     
     */
    public void setCntrbType(CntrbTypeType value) {
        this.cntrbType = value;
    }

    /**
     * Gets the value of the cntrbAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CntrbAmtType }
     *     
     */
    public CntrbAmtType getCntrbAmt() {
        return cntrbAmt;
    }

    /**
     * Sets the value of the cntrbAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntrbAmtType }
     *     
     */
    public void setCntrbAmt(CntrbAmtType value) {
        this.cntrbAmt = value;
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
