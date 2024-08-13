
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
 * <p>Java class for LnShdwInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnShdwInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnShdwChgOff" type="{http://jackhenry.com/jxchange/TPG/2008}LnShdwChgOff_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnShdwType" type="{http://jackhenry.com/jxchange/TPG/2008}LnShdwType_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnShdwProcDt" type="{http://jackhenry.com/jxchange/TPG/2008}LnShdwProcDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnShdwStat" type="{http://jackhenry.com/jxchange/TPG/2008}LnShdwStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnShdwChgOffPrin" type="{http://jackhenry.com/jxchange/TPG/2008}LnShdwChgOffPrin_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnShdwGLPrinBal" type="{http://jackhenry.com/jxchange/TPG/2008}LnShdwGLPrinBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnShdwGLBookBal" type="{http://jackhenry.com/jxchange/TPG/2008}LnShdwGLBookBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnShdwAccrType" type="{http://jackhenry.com/jxchange/TPG/2008}LnShdwAccrType_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnShdwChgOffInt" type="{http://jackhenry.com/jxchange/TPG/2008}LnShdwChgOffInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnShdwAccrInt" type="{http://jackhenry.com/jxchange/TPG/2008}LnShdwAccrInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnShdwGLBookAccrInt" type="{http://jackhenry.com/jxchange/TPG/2008}LnShdwGLBookAccrInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnShdwIntPrin" type="{http://jackhenry.com/jxchange/TPG/2008}LnShdwIntPrin_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnShdwCaplzeFee" type="{http://jackhenry.com/jxchange/TPG/2008}LnShdwCaplzeFee_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnShdwInfo_CType", propOrder = {
    "lnShdwChgOff",
    "lnShdwType",
    "lnShdwProcDt",
    "lnShdwStat",
    "lnShdwChgOffPrin",
    "lnShdwGLPrinBal",
    "lnShdwGLBookBal",
    "lnShdwAccrType",
    "lnShdwChgOffInt",
    "lnShdwAccrInt",
    "lnShdwGLBookAccrInt",
    "lnShdwIntPrin",
    "lnShdwCaplzeFee",
    "ver1",
    "any"
})
public class LnShdwInfoCType {

    @XmlElement(name = "LnShdwChgOff")
    protected LnShdwChgOffType lnShdwChgOff;
    @XmlElement(name = "LnShdwType")
    protected LnShdwTypeType lnShdwType;
    @XmlElement(name = "LnShdwProcDt")
    protected LnShdwProcDtType lnShdwProcDt;
    @XmlElement(name = "LnShdwStat")
    protected LnShdwStatType lnShdwStat;
    @XmlElement(name = "LnShdwChgOffPrin")
    protected LnShdwChgOffPrinType lnShdwChgOffPrin;
    @XmlElement(name = "LnShdwGLPrinBal")
    protected LnShdwGLPrinBalType lnShdwGLPrinBal;
    @XmlElement(name = "LnShdwGLBookBal")
    protected LnShdwGLBookBalType lnShdwGLBookBal;
    @XmlElement(name = "LnShdwAccrType")
    protected LnShdwAccrTypeType lnShdwAccrType;
    @XmlElement(name = "LnShdwChgOffInt")
    protected LnShdwChgOffIntType lnShdwChgOffInt;
    @XmlElement(name = "LnShdwAccrInt")
    protected LnShdwAccrIntType lnShdwAccrInt;
    @XmlElement(name = "LnShdwGLBookAccrInt")
    protected LnShdwGLBookAccrIntType lnShdwGLBookAccrInt;
    @XmlElement(name = "LnShdwIntPrin")
    protected LnShdwIntPrinType lnShdwIntPrin;
    @XmlElement(name = "LnShdwCaplzeFee")
    protected LnShdwCaplzeFeeType lnShdwCaplzeFee;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnShdwChgOff property.
     * 
     * @return
     *     possible object is
     *     {@link LnShdwChgOffType }
     *     
     */
    public LnShdwChgOffType getLnShdwChgOff() {
        return lnShdwChgOff;
    }

    /**
     * Sets the value of the lnShdwChgOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnShdwChgOffType }
     *     
     */
    public void setLnShdwChgOff(LnShdwChgOffType value) {
        this.lnShdwChgOff = value;
    }

    /**
     * Gets the value of the lnShdwType property.
     * 
     * @return
     *     possible object is
     *     {@link LnShdwTypeType }
     *     
     */
    public LnShdwTypeType getLnShdwType() {
        return lnShdwType;
    }

    /**
     * Sets the value of the lnShdwType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnShdwTypeType }
     *     
     */
    public void setLnShdwType(LnShdwTypeType value) {
        this.lnShdwType = value;
    }

    /**
     * Gets the value of the lnShdwProcDt property.
     * 
     * @return
     *     possible object is
     *     {@link LnShdwProcDtType }
     *     
     */
    public LnShdwProcDtType getLnShdwProcDt() {
        return lnShdwProcDt;
    }

    /**
     * Sets the value of the lnShdwProcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnShdwProcDtType }
     *     
     */
    public void setLnShdwProcDt(LnShdwProcDtType value) {
        this.lnShdwProcDt = value;
    }

    /**
     * Gets the value of the lnShdwStat property.
     * 
     * @return
     *     possible object is
     *     {@link LnShdwStatType }
     *     
     */
    public LnShdwStatType getLnShdwStat() {
        return lnShdwStat;
    }

    /**
     * Sets the value of the lnShdwStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnShdwStatType }
     *     
     */
    public void setLnShdwStat(LnShdwStatType value) {
        this.lnShdwStat = value;
    }

    /**
     * Gets the value of the lnShdwChgOffPrin property.
     * 
     * @return
     *     possible object is
     *     {@link LnShdwChgOffPrinType }
     *     
     */
    public LnShdwChgOffPrinType getLnShdwChgOffPrin() {
        return lnShdwChgOffPrin;
    }

    /**
     * Sets the value of the lnShdwChgOffPrin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnShdwChgOffPrinType }
     *     
     */
    public void setLnShdwChgOffPrin(LnShdwChgOffPrinType value) {
        this.lnShdwChgOffPrin = value;
    }

    /**
     * Gets the value of the lnShdwGLPrinBal property.
     * 
     * @return
     *     possible object is
     *     {@link LnShdwGLPrinBalType }
     *     
     */
    public LnShdwGLPrinBalType getLnShdwGLPrinBal() {
        return lnShdwGLPrinBal;
    }

    /**
     * Sets the value of the lnShdwGLPrinBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnShdwGLPrinBalType }
     *     
     */
    public void setLnShdwGLPrinBal(LnShdwGLPrinBalType value) {
        this.lnShdwGLPrinBal = value;
    }

    /**
     * Gets the value of the lnShdwGLBookBal property.
     * 
     * @return
     *     possible object is
     *     {@link LnShdwGLBookBalType }
     *     
     */
    public LnShdwGLBookBalType getLnShdwGLBookBal() {
        return lnShdwGLBookBal;
    }

    /**
     * Sets the value of the lnShdwGLBookBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnShdwGLBookBalType }
     *     
     */
    public void setLnShdwGLBookBal(LnShdwGLBookBalType value) {
        this.lnShdwGLBookBal = value;
    }

    /**
     * Gets the value of the lnShdwAccrType property.
     * 
     * @return
     *     possible object is
     *     {@link LnShdwAccrTypeType }
     *     
     */
    public LnShdwAccrTypeType getLnShdwAccrType() {
        return lnShdwAccrType;
    }

    /**
     * Sets the value of the lnShdwAccrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnShdwAccrTypeType }
     *     
     */
    public void setLnShdwAccrType(LnShdwAccrTypeType value) {
        this.lnShdwAccrType = value;
    }

    /**
     * Gets the value of the lnShdwChgOffInt property.
     * 
     * @return
     *     possible object is
     *     {@link LnShdwChgOffIntType }
     *     
     */
    public LnShdwChgOffIntType getLnShdwChgOffInt() {
        return lnShdwChgOffInt;
    }

    /**
     * Sets the value of the lnShdwChgOffInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnShdwChgOffIntType }
     *     
     */
    public void setLnShdwChgOffInt(LnShdwChgOffIntType value) {
        this.lnShdwChgOffInt = value;
    }

    /**
     * Gets the value of the lnShdwAccrInt property.
     * 
     * @return
     *     possible object is
     *     {@link LnShdwAccrIntType }
     *     
     */
    public LnShdwAccrIntType getLnShdwAccrInt() {
        return lnShdwAccrInt;
    }

    /**
     * Sets the value of the lnShdwAccrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnShdwAccrIntType }
     *     
     */
    public void setLnShdwAccrInt(LnShdwAccrIntType value) {
        this.lnShdwAccrInt = value;
    }

    /**
     * Gets the value of the lnShdwGLBookAccrInt property.
     * 
     * @return
     *     possible object is
     *     {@link LnShdwGLBookAccrIntType }
     *     
     */
    public LnShdwGLBookAccrIntType getLnShdwGLBookAccrInt() {
        return lnShdwGLBookAccrInt;
    }

    /**
     * Sets the value of the lnShdwGLBookAccrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnShdwGLBookAccrIntType }
     *     
     */
    public void setLnShdwGLBookAccrInt(LnShdwGLBookAccrIntType value) {
        this.lnShdwGLBookAccrInt = value;
    }

    /**
     * Gets the value of the lnShdwIntPrin property.
     * 
     * @return
     *     possible object is
     *     {@link LnShdwIntPrinType }
     *     
     */
    public LnShdwIntPrinType getLnShdwIntPrin() {
        return lnShdwIntPrin;
    }

    /**
     * Sets the value of the lnShdwIntPrin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnShdwIntPrinType }
     *     
     */
    public void setLnShdwIntPrin(LnShdwIntPrinType value) {
        this.lnShdwIntPrin = value;
    }

    /**
     * Gets the value of the lnShdwCaplzeFee property.
     * 
     * @return
     *     possible object is
     *     {@link LnShdwCaplzeFeeType }
     *     
     */
    public LnShdwCaplzeFeeType getLnShdwCaplzeFee() {
        return lnShdwCaplzeFee;
    }

    /**
     * Sets the value of the lnShdwCaplzeFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnShdwCaplzeFeeType }
     *     
     */
    public void setLnShdwCaplzeFee(LnShdwCaplzeFeeType value) {
        this.lnShdwCaplzeFee = value;
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
