
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for SvcFeeTrnInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcFeeTrnInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcFeeCode" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ApprvOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="OrigChgDt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcFeeChgDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="OrigTrnCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="RefBalAffType" type="{http://jackhenry.com/jxchange/TPG/2008}RefBalAffType_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="SvcFeeWavAmt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
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
@XmlType(name = "SvcFeeTrnInfo_CType", propOrder = {
    "amt",
    "svcFeeCode",
    "trnDescArray",
    "ver1",
    "apprvOffCode",
    "ver2",
    "origChgDt",
    "origTrnCode",
    "refBalAffType",
    "ver3",
    "svcFeeWavAmt",
    "ver4",
    "any"
})
public class SvcFeeTrnInfoCType {

    @XmlElement(name = "Amt")
    protected AmtType amt;
    @XmlElement(name = "SvcFeeCode")
    protected SvcFeeCodeType svcFeeCode;
    @XmlElement(name = "TrnDescArray")
    protected RmkAType trnDescArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ApprvOffCode")
    protected OffCodeType apprvOffCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "OrigChgDt")
    protected SvcFeeChgDtType origChgDt;
    @XmlElement(name = "OrigTrnCode")
    protected TrnCodeCodeType origTrnCode;
    @XmlElement(name = "RefBalAffType")
    protected RefBalAffTypeType refBalAffType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "SvcFeeWavAmt")
    protected AmtType svcFeeWavAmt;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
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
     * Gets the value of the svcFeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeCodeType }
     *     
     */
    public SvcFeeCodeType getSvcFeeCode() {
        return svcFeeCode;
    }

    /**
     * Sets the value of the svcFeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeCodeType }
     *     
     */
    public void setSvcFeeCode(SvcFeeCodeType value) {
        this.svcFeeCode = value;
    }

    /**
     * Gets the value of the trnDescArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getTrnDescArray() {
        return trnDescArray;
    }

    /**
     * Sets the value of the trnDescArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setTrnDescArray(RmkAType value) {
        this.trnDescArray = value;
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
     * Gets the value of the apprvOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link OffCodeType }
     *     
     */
    public OffCodeType getApprvOffCode() {
        return apprvOffCode;
    }

    /**
     * Sets the value of the apprvOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffCodeType }
     *     
     */
    public void setApprvOffCode(OffCodeType value) {
        this.apprvOffCode = value;
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
     * Gets the value of the origChgDt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcFeeChgDtType }
     *     
     */
    public SvcFeeChgDtType getOrigChgDt() {
        return origChgDt;
    }

    /**
     * Sets the value of the origChgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcFeeChgDtType }
     *     
     */
    public void setOrigChgDt(SvcFeeChgDtType value) {
        this.origChgDt = value;
    }

    /**
     * Gets the value of the origTrnCode property.
     * 
     * @return
     *     possible object is
     *     {@link TrnCodeCodeType }
     *     
     */
    public TrnCodeCodeType getOrigTrnCode() {
        return origTrnCode;
    }

    /**
     * Sets the value of the origTrnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnCodeCodeType }
     *     
     */
    public void setOrigTrnCode(TrnCodeCodeType value) {
        this.origTrnCode = value;
    }

    /**
     * Gets the value of the refBalAffType property.
     * 
     * @return
     *     possible object is
     *     {@link RefBalAffTypeType }
     *     
     */
    public RefBalAffTypeType getRefBalAffType() {
        return refBalAffType;
    }

    /**
     * Sets the value of the refBalAffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefBalAffTypeType }
     *     
     */
    public void setRefBalAffType(RefBalAffTypeType value) {
        this.refBalAffType = value;
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
     * Gets the value of the svcFeeWavAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getSvcFeeWavAmt() {
        return svcFeeWavAmt;
    }

    /**
     * Sets the value of the svcFeeWavAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setSvcFeeWavAmt(AmtType value) {
        this.svcFeeWavAmt = value;
    }

    /**
     * Gets the value of the ver4 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver4CType }
     *     
     */
    public Ver4CType getVer4() {
        return ver4;
    }

    /**
     * Sets the value of the ver4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver4CType }
     *     
     */
    public void setVer4(Ver4CType value) {
        this.ver4 = value;
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
