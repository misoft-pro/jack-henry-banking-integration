
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
 * <p>Java class for LnBilInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnBilInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BilPaidDt" type="{http://jackhenry.com/jxchange/TPG/2008}BilPaidDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilPrincAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilPrincAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilIntAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilIntAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilEscrwAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilEscrwAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilLateChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilLateChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilOtherChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilOtherChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilCrLifeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilCrLifeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilAHAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilAHAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilUEInsurAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BilUEInsurAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RemBilPrincAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RemBilPrincAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RemBilIntAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RemBilIntAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RemBilEscrwAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RemBilEscrwAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RemBilLateChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RemBilLateChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RemBilOtherChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RemBilOtherChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RemBilCrLifeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RemBilCrLifeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RemBilAHAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RemBilAHAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RemUEInsurAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RemUEInsurAmt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PrtBilNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtBilNotCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnBilInfoRec_CType", propOrder = {
    "bilPaidDt",
    "bilPrincAmt",
    "bilIntAmt",
    "bilEscrwAmt",
    "bilLateChgAmt",
    "bilOtherChgAmt",
    "bilCrLifeAmt",
    "bilAHAmt",
    "bilUEInsurAmt",
    "remBilPrincAmt",
    "remBilIntAmt",
    "remBilEscrwAmt",
    "remBilLateChgAmt",
    "remBilOtherChgAmt",
    "remBilCrLifeAmt",
    "remBilAHAmt",
    "remUEInsurAmt",
    "ver1",
    "prtBilNotCode",
    "ver2",
    "any"
})
public class LnBilInfoRecCType {

    @XmlElement(name = "BilPaidDt")
    protected BilPaidDtType bilPaidDt;
    @XmlElement(name = "BilPrincAmt")
    protected BilPrincAmtType bilPrincAmt;
    @XmlElement(name = "BilIntAmt")
    protected BilIntAmtType bilIntAmt;
    @XmlElement(name = "BilEscrwAmt")
    protected BilEscrwAmtType bilEscrwAmt;
    @XmlElement(name = "BilLateChgAmt")
    protected BilLateChgAmtType bilLateChgAmt;
    @XmlElement(name = "BilOtherChgAmt")
    protected BilOtherChgAmtType bilOtherChgAmt;
    @XmlElement(name = "BilCrLifeAmt")
    protected BilCrLifeAmtType bilCrLifeAmt;
    @XmlElement(name = "BilAHAmt")
    protected BilAHAmtType bilAHAmt;
    @XmlElement(name = "BilUEInsurAmt")
    protected BilUEInsurAmtType bilUEInsurAmt;
    @XmlElement(name = "RemBilPrincAmt")
    protected RemBilPrincAmtType remBilPrincAmt;
    @XmlElement(name = "RemBilIntAmt")
    protected RemBilIntAmtType remBilIntAmt;
    @XmlElement(name = "RemBilEscrwAmt")
    protected RemBilEscrwAmtType remBilEscrwAmt;
    @XmlElement(name = "RemBilLateChgAmt")
    protected RemBilLateChgAmtType remBilLateChgAmt;
    @XmlElement(name = "RemBilOtherChgAmt")
    protected RemBilOtherChgAmtType remBilOtherChgAmt;
    @XmlElement(name = "RemBilCrLifeAmt")
    protected RemBilCrLifeAmtType remBilCrLifeAmt;
    @XmlElement(name = "RemBilAHAmt")
    protected RemBilAHAmtType remBilAHAmt;
    @XmlElement(name = "RemUEInsurAmt")
    protected RemUEInsurAmtType remUEInsurAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PrtBilNotCode")
    protected PrtBilNotCodeType prtBilNotCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the bilPaidDt property.
     * 
     * @return
     *     possible object is
     *     {@link BilPaidDtType }
     *     
     */
    public BilPaidDtType getBilPaidDt() {
        return bilPaidDt;
    }

    /**
     * Sets the value of the bilPaidDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilPaidDtType }
     *     
     */
    public void setBilPaidDt(BilPaidDtType value) {
        this.bilPaidDt = value;
    }

    /**
     * Gets the value of the bilPrincAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BilPrincAmtType }
     *     
     */
    public BilPrincAmtType getBilPrincAmt() {
        return bilPrincAmt;
    }

    /**
     * Sets the value of the bilPrincAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilPrincAmtType }
     *     
     */
    public void setBilPrincAmt(BilPrincAmtType value) {
        this.bilPrincAmt = value;
    }

    /**
     * Gets the value of the bilIntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BilIntAmtType }
     *     
     */
    public BilIntAmtType getBilIntAmt() {
        return bilIntAmt;
    }

    /**
     * Sets the value of the bilIntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilIntAmtType }
     *     
     */
    public void setBilIntAmt(BilIntAmtType value) {
        this.bilIntAmt = value;
    }

    /**
     * Gets the value of the bilEscrwAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BilEscrwAmtType }
     *     
     */
    public BilEscrwAmtType getBilEscrwAmt() {
        return bilEscrwAmt;
    }

    /**
     * Sets the value of the bilEscrwAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilEscrwAmtType }
     *     
     */
    public void setBilEscrwAmt(BilEscrwAmtType value) {
        this.bilEscrwAmt = value;
    }

    /**
     * Gets the value of the bilLateChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BilLateChgAmtType }
     *     
     */
    public BilLateChgAmtType getBilLateChgAmt() {
        return bilLateChgAmt;
    }

    /**
     * Sets the value of the bilLateChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilLateChgAmtType }
     *     
     */
    public void setBilLateChgAmt(BilLateChgAmtType value) {
        this.bilLateChgAmt = value;
    }

    /**
     * Gets the value of the bilOtherChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BilOtherChgAmtType }
     *     
     */
    public BilOtherChgAmtType getBilOtherChgAmt() {
        return bilOtherChgAmt;
    }

    /**
     * Sets the value of the bilOtherChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilOtherChgAmtType }
     *     
     */
    public void setBilOtherChgAmt(BilOtherChgAmtType value) {
        this.bilOtherChgAmt = value;
    }

    /**
     * Gets the value of the bilCrLifeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BilCrLifeAmtType }
     *     
     */
    public BilCrLifeAmtType getBilCrLifeAmt() {
        return bilCrLifeAmt;
    }

    /**
     * Sets the value of the bilCrLifeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilCrLifeAmtType }
     *     
     */
    public void setBilCrLifeAmt(BilCrLifeAmtType value) {
        this.bilCrLifeAmt = value;
    }

    /**
     * Gets the value of the bilAHAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BilAHAmtType }
     *     
     */
    public BilAHAmtType getBilAHAmt() {
        return bilAHAmt;
    }

    /**
     * Sets the value of the bilAHAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilAHAmtType }
     *     
     */
    public void setBilAHAmt(BilAHAmtType value) {
        this.bilAHAmt = value;
    }

    /**
     * Gets the value of the bilUEInsurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BilUEInsurAmtType }
     *     
     */
    public BilUEInsurAmtType getBilUEInsurAmt() {
        return bilUEInsurAmt;
    }

    /**
     * Sets the value of the bilUEInsurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilUEInsurAmtType }
     *     
     */
    public void setBilUEInsurAmt(BilUEInsurAmtType value) {
        this.bilUEInsurAmt = value;
    }

    /**
     * Gets the value of the remBilPrincAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RemBilPrincAmtType }
     *     
     */
    public RemBilPrincAmtType getRemBilPrincAmt() {
        return remBilPrincAmt;
    }

    /**
     * Sets the value of the remBilPrincAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemBilPrincAmtType }
     *     
     */
    public void setRemBilPrincAmt(RemBilPrincAmtType value) {
        this.remBilPrincAmt = value;
    }

    /**
     * Gets the value of the remBilIntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RemBilIntAmtType }
     *     
     */
    public RemBilIntAmtType getRemBilIntAmt() {
        return remBilIntAmt;
    }

    /**
     * Sets the value of the remBilIntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemBilIntAmtType }
     *     
     */
    public void setRemBilIntAmt(RemBilIntAmtType value) {
        this.remBilIntAmt = value;
    }

    /**
     * Gets the value of the remBilEscrwAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RemBilEscrwAmtType }
     *     
     */
    public RemBilEscrwAmtType getRemBilEscrwAmt() {
        return remBilEscrwAmt;
    }

    /**
     * Sets the value of the remBilEscrwAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemBilEscrwAmtType }
     *     
     */
    public void setRemBilEscrwAmt(RemBilEscrwAmtType value) {
        this.remBilEscrwAmt = value;
    }

    /**
     * Gets the value of the remBilLateChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RemBilLateChgAmtType }
     *     
     */
    public RemBilLateChgAmtType getRemBilLateChgAmt() {
        return remBilLateChgAmt;
    }

    /**
     * Sets the value of the remBilLateChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemBilLateChgAmtType }
     *     
     */
    public void setRemBilLateChgAmt(RemBilLateChgAmtType value) {
        this.remBilLateChgAmt = value;
    }

    /**
     * Gets the value of the remBilOtherChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RemBilOtherChgAmtType }
     *     
     */
    public RemBilOtherChgAmtType getRemBilOtherChgAmt() {
        return remBilOtherChgAmt;
    }

    /**
     * Sets the value of the remBilOtherChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemBilOtherChgAmtType }
     *     
     */
    public void setRemBilOtherChgAmt(RemBilOtherChgAmtType value) {
        this.remBilOtherChgAmt = value;
    }

    /**
     * Gets the value of the remBilCrLifeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RemBilCrLifeAmtType }
     *     
     */
    public RemBilCrLifeAmtType getRemBilCrLifeAmt() {
        return remBilCrLifeAmt;
    }

    /**
     * Sets the value of the remBilCrLifeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemBilCrLifeAmtType }
     *     
     */
    public void setRemBilCrLifeAmt(RemBilCrLifeAmtType value) {
        this.remBilCrLifeAmt = value;
    }

    /**
     * Gets the value of the remBilAHAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RemBilAHAmtType }
     *     
     */
    public RemBilAHAmtType getRemBilAHAmt() {
        return remBilAHAmt;
    }

    /**
     * Sets the value of the remBilAHAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemBilAHAmtType }
     *     
     */
    public void setRemBilAHAmt(RemBilAHAmtType value) {
        this.remBilAHAmt = value;
    }

    /**
     * Gets the value of the remUEInsurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RemUEInsurAmtType }
     *     
     */
    public RemUEInsurAmtType getRemUEInsurAmt() {
        return remUEInsurAmt;
    }

    /**
     * Sets the value of the remUEInsurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemUEInsurAmtType }
     *     
     */
    public void setRemUEInsurAmt(RemUEInsurAmtType value) {
        this.remUEInsurAmt = value;
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
     * Gets the value of the prtBilNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrtBilNotCodeType }
     *     
     */
    public PrtBilNotCodeType getPrtBilNotCode() {
        return prtBilNotCode;
    }

    /**
     * Sets the value of the prtBilNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtBilNotCodeType }
     *     
     */
    public void setPrtBilNotCode(PrtBilNotCodeType value) {
        this.prtBilNotCode = value;
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
