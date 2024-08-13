
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
 * <p>Java class for CustBalInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustBalInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustRelType" type="{http://jackhenry.com/jxchange/TPG/2008}CustRelType_Type"/&gt;
 *         &lt;element name="DepAcctNum" type="{http://jackhenry.com/jxchange/TPG/2008}DepAcctNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="DepAcctBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}DepAcctBalAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DepAcctRate" type="{http://jackhenry.com/jxchange/TPG/2008}DepAcctRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnAcctNum" type="{http://jackhenry.com/jxchange/TPG/2008}LnAcctNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnAcctBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LnAcctBalAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnAcctRate" type="{http://jackhenry.com/jxchange/TPG/2008}LnAcctRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="LiabAcctNum" type="{http://jackhenry.com/jxchange/TPG/2008}LiabAcctNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="LiabAcctBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LiabAcctBalAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LiabAcctRate" type="{http://jackhenry.com/jxchange/TPG/2008}LiabAcctRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="OthAcctNum" type="{http://jackhenry.com/jxchange/TPG/2008}OthAcctNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomCustBalInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "CustBalInfoRec_CType", propOrder = {
    "custRelType",
    "depAcctNum",
    "depAcctBalAmt",
    "depAcctRate",
    "lnAcctNum",
    "lnAcctBalAmt",
    "lnAcctRate",
    "liabAcctNum",
    "liabAcctBalAmt",
    "liabAcctRate",
    "othAcctNum",
    "customCustBalInfoRec",
    "ver1",
    "any"
})
public class CustBalInfoRecCType {

    @XmlElement(name = "CustRelType", required = true)
    protected CustRelTypeType custRelType;
    @XmlElement(name = "DepAcctNum")
    protected DepAcctNumType depAcctNum;
    @XmlElement(name = "DepAcctBalAmt")
    protected DepAcctBalAmtType depAcctBalAmt;
    @XmlElement(name = "DepAcctRate")
    protected DepAcctRateType depAcctRate;
    @XmlElement(name = "LnAcctNum")
    protected LnAcctNumType lnAcctNum;
    @XmlElement(name = "LnAcctBalAmt")
    protected LnAcctBalAmtType lnAcctBalAmt;
    @XmlElement(name = "LnAcctRate")
    protected LnAcctRateType lnAcctRate;
    @XmlElement(name = "LiabAcctNum")
    protected LiabAcctNumType liabAcctNum;
    @XmlElement(name = "LiabAcctBalAmt")
    protected LiabAcctBalAmtType liabAcctBalAmt;
    @XmlElement(name = "LiabAcctRate")
    protected LiabAcctRateType liabAcctRate;
    @XmlElement(name = "OthAcctNum")
    protected OthAcctNumType othAcctNum;
    @XmlElement(name = "CustomCustBalInfoRec")
    protected CustomCType customCustBalInfoRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the custRelType property.
     * 
     * @return
     *     possible object is
     *     {@link CustRelTypeType }
     *     
     */
    public CustRelTypeType getCustRelType() {
        return custRelType;
    }

    /**
     * Sets the value of the custRelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustRelTypeType }
     *     
     */
    public void setCustRelType(CustRelTypeType value) {
        this.custRelType = value;
    }

    /**
     * Gets the value of the depAcctNum property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctNumType }
     *     
     */
    public DepAcctNumType getDepAcctNum() {
        return depAcctNum;
    }

    /**
     * Sets the value of the depAcctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctNumType }
     *     
     */
    public void setDepAcctNum(DepAcctNumType value) {
        this.depAcctNum = value;
    }

    /**
     * Gets the value of the depAcctBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctBalAmtType }
     *     
     */
    public DepAcctBalAmtType getDepAcctBalAmt() {
        return depAcctBalAmt;
    }

    /**
     * Sets the value of the depAcctBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctBalAmtType }
     *     
     */
    public void setDepAcctBalAmt(DepAcctBalAmtType value) {
        this.depAcctBalAmt = value;
    }

    /**
     * Gets the value of the depAcctRate property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctRateType }
     *     
     */
    public DepAcctRateType getDepAcctRate() {
        return depAcctRate;
    }

    /**
     * Sets the value of the depAcctRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctRateType }
     *     
     */
    public void setDepAcctRate(DepAcctRateType value) {
        this.depAcctRate = value;
    }

    /**
     * Gets the value of the lnAcctNum property.
     * 
     * @return
     *     possible object is
     *     {@link LnAcctNumType }
     *     
     */
    public LnAcctNumType getLnAcctNum() {
        return lnAcctNum;
    }

    /**
     * Sets the value of the lnAcctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnAcctNumType }
     *     
     */
    public void setLnAcctNum(LnAcctNumType value) {
        this.lnAcctNum = value;
    }

    /**
     * Gets the value of the lnAcctBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LnAcctBalAmtType }
     *     
     */
    public LnAcctBalAmtType getLnAcctBalAmt() {
        return lnAcctBalAmt;
    }

    /**
     * Sets the value of the lnAcctBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnAcctBalAmtType }
     *     
     */
    public void setLnAcctBalAmt(LnAcctBalAmtType value) {
        this.lnAcctBalAmt = value;
    }

    /**
     * Gets the value of the lnAcctRate property.
     * 
     * @return
     *     possible object is
     *     {@link LnAcctRateType }
     *     
     */
    public LnAcctRateType getLnAcctRate() {
        return lnAcctRate;
    }

    /**
     * Sets the value of the lnAcctRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnAcctRateType }
     *     
     */
    public void setLnAcctRate(LnAcctRateType value) {
        this.lnAcctRate = value;
    }

    /**
     * Gets the value of the liabAcctNum property.
     * 
     * @return
     *     possible object is
     *     {@link LiabAcctNumType }
     *     
     */
    public LiabAcctNumType getLiabAcctNum() {
        return liabAcctNum;
    }

    /**
     * Sets the value of the liabAcctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabAcctNumType }
     *     
     */
    public void setLiabAcctNum(LiabAcctNumType value) {
        this.liabAcctNum = value;
    }

    /**
     * Gets the value of the liabAcctBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LiabAcctBalAmtType }
     *     
     */
    public LiabAcctBalAmtType getLiabAcctBalAmt() {
        return liabAcctBalAmt;
    }

    /**
     * Sets the value of the liabAcctBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabAcctBalAmtType }
     *     
     */
    public void setLiabAcctBalAmt(LiabAcctBalAmtType value) {
        this.liabAcctBalAmt = value;
    }

    /**
     * Gets the value of the liabAcctRate property.
     * 
     * @return
     *     possible object is
     *     {@link LiabAcctRateType }
     *     
     */
    public LiabAcctRateType getLiabAcctRate() {
        return liabAcctRate;
    }

    /**
     * Sets the value of the liabAcctRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabAcctRateType }
     *     
     */
    public void setLiabAcctRate(LiabAcctRateType value) {
        this.liabAcctRate = value;
    }

    /**
     * Gets the value of the othAcctNum property.
     * 
     * @return
     *     possible object is
     *     {@link OthAcctNumType }
     *     
     */
    public OthAcctNumType getOthAcctNum() {
        return othAcctNum;
    }

    /**
     * Sets the value of the othAcctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link OthAcctNumType }
     *     
     */
    public void setOthAcctNum(OthAcctNumType value) {
        this.othAcctNum = value;
    }

    /**
     * Gets the value of the customCustBalInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomCustBalInfoRec() {
        return customCustBalInfoRec;
    }

    /**
     * Sets the value of the customCustBalInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomCustBalInfoRec(CustomCType value) {
        this.customCustBalInfoRec = value;
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
