
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
 * <p>Java class for CrCardPmtInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardPmtInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type"/&gt;
 *         &lt;element name="DrRtNum" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrRtNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="TrnRcptId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRcptId_Type" minOccurs="0"/&gt;
 *           &lt;element name="LdgrBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LdgrBalAmt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="FinInstRtId" type="{http://jackhenry.com/jxchange/TPG/2008}FinInstRtId_Type" minOccurs="0"/&gt;
 *             &lt;element name="EffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EffDt_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
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
@XmlType(name = "CrCardPmtInfoRec_CType", propOrder = {
    "amt",
    "drRtNum",
    "drAcctId",
    "drAcctType",
    "custom",
    "ver1",
    "trnRcptId",
    "ldgrBalAmt",
    "ver2",
    "finInstRtId",
    "effDt",
    "ver3",
    "any"
})
public class CrCardPmtInfoRecCType {

    @XmlElement(name = "Amt", required = true)
    protected AmtType amt;
    @XmlElement(name = "DrRtNum")
    protected ACHDrRtNumType drRtNum;
    @XmlElement(name = "DrAcctId")
    protected ACHDrAcctIdType drAcctId;
    @XmlElement(name = "DrAcctType")
    protected ACHDrAcctTypeType drAcctType;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "TrnRcptId")
    protected TrnRcptIdType trnRcptId;
    @XmlElement(name = "LdgrBalAmt")
    protected LdgrBalAmtType ldgrBalAmt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "FinInstRtId")
    protected FinInstRtIdType finInstRtId;
    @XmlElement(name = "EffDt")
    protected EffDtType effDt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setAmt(AmtType value) {
        this.amt = value;
    }

    /**
     * Gets the value of the drRtNum property.
     * 
     * @return
     *     possible object is
     *     {@link ACHDrRtNumType }
     *     
     */
    public ACHDrRtNumType getDrRtNum() {
        return drRtNum;
    }

    /**
     * Sets the value of the drRtNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHDrRtNumType }
     *     
     */
    public void setDrRtNum(ACHDrRtNumType value) {
        this.drRtNum = value;
    }

    /**
     * Gets the value of the drAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHDrAcctIdType }
     *     
     */
    public ACHDrAcctIdType getDrAcctId() {
        return drAcctId;
    }

    /**
     * Sets the value of the drAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHDrAcctIdType }
     *     
     */
    public void setDrAcctId(ACHDrAcctIdType value) {
        this.drAcctId = value;
    }

    /**
     * Gets the value of the drAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link ACHDrAcctTypeType }
     *     
     */
    public ACHDrAcctTypeType getDrAcctType() {
        return drAcctType;
    }

    /**
     * Sets the value of the drAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHDrAcctTypeType }
     *     
     */
    public void setDrAcctType(ACHDrAcctTypeType value) {
        this.drAcctType = value;
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
     * Gets the value of the trnRcptId property.
     * 
     * @return
     *     possible object is
     *     {@link TrnRcptIdType }
     *     
     */
    public TrnRcptIdType getTrnRcptId() {
        return trnRcptId;
    }

    /**
     * Sets the value of the trnRcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnRcptIdType }
     *     
     */
    public void setTrnRcptId(TrnRcptIdType value) {
        this.trnRcptId = value;
    }

    /**
     * Gets the value of the ldgrBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LdgrBalAmtType }
     *     
     */
    public LdgrBalAmtType getLdgrBalAmt() {
        return ldgrBalAmt;
    }

    /**
     * Sets the value of the ldgrBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdgrBalAmtType }
     *     
     */
    public void setLdgrBalAmt(LdgrBalAmtType value) {
        this.ldgrBalAmt = value;
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
     * Gets the value of the finInstRtId property.
     * 
     * @return
     *     possible object is
     *     {@link FinInstRtIdType }
     *     
     */
    public FinInstRtIdType getFinInstRtId() {
        return finInstRtId;
    }

    /**
     * Sets the value of the finInstRtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinInstRtIdType }
     *     
     */
    public void setFinInstRtId(FinInstRtIdType value) {
        this.finInstRtId = value;
    }

    /**
     * Gets the value of the effDt property.
     * 
     * @return
     *     possible object is
     *     {@link EffDtType }
     *     
     */
    public EffDtType getEffDt() {
        return effDt;
    }

    /**
     * Sets the value of the effDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffDtType }
     *     
     */
    public void setEffDt(EffDtType value) {
        this.effDt = value;
    }

    /**
     * Gets the value of the ver3 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver3CType }
     *     
     */
    public Ver3CType getVer3() {
        return ver3;
    }

    /**
     * Sets the value of the ver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver3CType }
     *     
     */
    public void setVer3(Ver3CType value) {
        this.ver3 = value;
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
