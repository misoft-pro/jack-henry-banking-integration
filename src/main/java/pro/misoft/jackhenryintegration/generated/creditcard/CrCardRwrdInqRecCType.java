
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CrCardRwrdInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardRwrdInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RwrdProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RwrdProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="RwrdPtRedeemLTD" type="{http://jackhenry.com/jxchange/TPG/2008}RwrdPtRedeemLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="RwrdPtExpAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RwrdPtExpAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RwrdPtAccrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RwrdPtAccrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RwrdPtExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}RwrdPtExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RedeemRwrdPtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RedeemRwrdPtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RwrdPtEarnLTD" type="{http://jackhenry.com/jxchange/TPG/2008}RwrdPtEarnLTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="RwrdPtExpArray" type="{http://jackhenry.com/jxchange/TPG/2008}RwrdPtExpArray_AType" minOccurs="0"/&gt;
 *           &lt;element name="RwrdPtCatArray" type="{http://jackhenry.com/jxchange/TPG/2008}RwrdPtCatArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "CrCardRwrdInqRec_CType", propOrder = {
    "rwrdProdDesc",
    "rwrdPtRedeemLTD",
    "rwrdPtExpAmt",
    "rwrdPtAccrAmt",
    "rwrdPtExpDt",
    "redeemRwrdPtAmt",
    "rwrdPtEarnLTD",
    "custom",
    "ver1",
    "rwrdPtExpArray",
    "rwrdPtCatArray",
    "ver2",
    "any"
})
public class CrCardRwrdInqRecCType {

    @XmlElement(name = "RwrdProdDesc")
    protected RwrdProdDescType rwrdProdDesc;
    @XmlElement(name = "RwrdPtRedeemLTD")
    protected RwrdPtRedeemLTDType rwrdPtRedeemLTD;
    @XmlElement(name = "RwrdPtExpAmt")
    protected RwrdPtExpAmtType rwrdPtExpAmt;
    @XmlElement(name = "RwrdPtAccrAmt")
    protected RwrdPtAccrAmtType rwrdPtAccrAmt;
    @XmlElement(name = "RwrdPtExpDt")
    protected RwrdPtExpDtType rwrdPtExpDt;
    @XmlElement(name = "RedeemRwrdPtAmt")
    protected RedeemRwrdPtAmtType redeemRwrdPtAmt;
    @XmlElement(name = "RwrdPtEarnLTD")
    protected RwrdPtEarnLTDType rwrdPtEarnLTD;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "RwrdPtExpArray")
    protected RwrdPtExpArrayAType rwrdPtExpArray;
    @XmlElement(name = "RwrdPtCatArray")
    protected RwrdPtCatArrayAType rwrdPtCatArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the rwrdProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RwrdProdDescType }
     *     
     */
    public RwrdProdDescType getRwrdProdDesc() {
        return rwrdProdDesc;
    }

    /**
     * Sets the value of the rwrdProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RwrdProdDescType }
     *     
     */
    public void setRwrdProdDesc(RwrdProdDescType value) {
        this.rwrdProdDesc = value;
    }

    /**
     * Gets the value of the rwrdPtRedeemLTD property.
     * 
     * @return
     *     possible object is
     *     {@link RwrdPtRedeemLTDType }
     *     
     */
    public RwrdPtRedeemLTDType getRwrdPtRedeemLTD() {
        return rwrdPtRedeemLTD;
    }

    /**
     * Sets the value of the rwrdPtRedeemLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link RwrdPtRedeemLTDType }
     *     
     */
    public void setRwrdPtRedeemLTD(RwrdPtRedeemLTDType value) {
        this.rwrdPtRedeemLTD = value;
    }

    /**
     * Gets the value of the rwrdPtExpAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RwrdPtExpAmtType }
     *     
     */
    public RwrdPtExpAmtType getRwrdPtExpAmt() {
        return rwrdPtExpAmt;
    }

    /**
     * Sets the value of the rwrdPtExpAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RwrdPtExpAmtType }
     *     
     */
    public void setRwrdPtExpAmt(RwrdPtExpAmtType value) {
        this.rwrdPtExpAmt = value;
    }

    /**
     * Gets the value of the rwrdPtAccrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RwrdPtAccrAmtType }
     *     
     */
    public RwrdPtAccrAmtType getRwrdPtAccrAmt() {
        return rwrdPtAccrAmt;
    }

    /**
     * Sets the value of the rwrdPtAccrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RwrdPtAccrAmtType }
     *     
     */
    public void setRwrdPtAccrAmt(RwrdPtAccrAmtType value) {
        this.rwrdPtAccrAmt = value;
    }

    /**
     * Gets the value of the rwrdPtExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link RwrdPtExpDtType }
     *     
     */
    public RwrdPtExpDtType getRwrdPtExpDt() {
        return rwrdPtExpDt;
    }

    /**
     * Sets the value of the rwrdPtExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RwrdPtExpDtType }
     *     
     */
    public void setRwrdPtExpDt(RwrdPtExpDtType value) {
        this.rwrdPtExpDt = value;
    }

    /**
     * Gets the value of the redeemRwrdPtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RedeemRwrdPtAmtType }
     *     
     */
    public RedeemRwrdPtAmtType getRedeemRwrdPtAmt() {
        return redeemRwrdPtAmt;
    }

    /**
     * Sets the value of the redeemRwrdPtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedeemRwrdPtAmtType }
     *     
     */
    public void setRedeemRwrdPtAmt(RedeemRwrdPtAmtType value) {
        this.redeemRwrdPtAmt = value;
    }

    /**
     * Gets the value of the rwrdPtEarnLTD property.
     * 
     * @return
     *     possible object is
     *     {@link RwrdPtEarnLTDType }
     *     
     */
    public RwrdPtEarnLTDType getRwrdPtEarnLTD() {
        return rwrdPtEarnLTD;
    }

    /**
     * Sets the value of the rwrdPtEarnLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link RwrdPtEarnLTDType }
     *     
     */
    public void setRwrdPtEarnLTD(RwrdPtEarnLTDType value) {
        this.rwrdPtEarnLTD = value;
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
     * Gets the value of the rwrdPtExpArray property.
     * 
     * @return
     *     possible object is
     *     {@link RwrdPtExpArrayAType }
     *     
     */
    public RwrdPtExpArrayAType getRwrdPtExpArray() {
        return rwrdPtExpArray;
    }

    /**
     * Sets the value of the rwrdPtExpArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RwrdPtExpArrayAType }
     *     
     */
    public void setRwrdPtExpArray(RwrdPtExpArrayAType value) {
        this.rwrdPtExpArray = value;
    }

    /**
     * Gets the value of the rwrdPtCatArray property.
     * 
     * @return
     *     possible object is
     *     {@link RwrdPtCatArrayAType }
     *     
     */
    public RwrdPtCatArrayAType getRwrdPtCatArray() {
        return rwrdPtCatArray;
    }

    /**
     * Sets the value of the rwrdPtCatArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RwrdPtCatArrayAType }
     *     
     */
    public void setRwrdPtCatArray(RwrdPtCatArrayAType value) {
        this.rwrdPtCatArray = value;
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
