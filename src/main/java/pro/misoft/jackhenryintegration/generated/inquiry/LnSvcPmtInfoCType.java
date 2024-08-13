
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
 * <p>Java class for LnSvcPmtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnSvcPmtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LastPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastPmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastPmtCutoffDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastPmtCutoffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurtCurPeriodAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CurtCurPeriodAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurtRvrCurPeriodAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CurtRvrCurPeriodAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurtRvrPrevPeriodAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CurtRvrPrevPeriodAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurtPrevPeriodAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CurtPrevPeriodAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwCurPeriodAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwCurPeriodAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwPrevPeriodAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPrevPeriodAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurtRetAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CurtRetAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurtPrevRetAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CurtPrevRetAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcOthFeeCurAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcOthFeeCurAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcOthFeePrevAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcOthFeePrevAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntDiffAmt" type="{http://jackhenry.com/jxchange/TPG/2008}IntDiffAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcIntPdYTDAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcIntPdYTDAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrePmtNum" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcInvFirstPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcInvFirstPmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcEscrwInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}SvcEscrwInfoArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "LnSvcPmtInfo_CType", propOrder = {
    "lastPmtDt",
    "lastPmtCutoffDt",
    "curtCurPeriodAmt",
    "curtRvrCurPeriodAmt",
    "curtRvrPrevPeriodAmt",
    "curtPrevPeriodAmt",
    "escrwCurPeriodAmt",
    "escrwPrevPeriodAmt",
    "curtRetAmt",
    "curtPrevRetAmt",
    "svcOthFeeCurAmt",
    "svcOthFeePrevAmt",
    "intDiffAmt",
    "svcIntPdYTDAmt",
    "prePmtNum",
    "svcInvFirstPmtDt",
    "svcEscrwInfoArray",
    "ver1",
    "any"
})
public class LnSvcPmtInfoCType {

    @XmlElement(name = "LastPmtDt")
    protected LastPmtDtType lastPmtDt;
    @XmlElement(name = "LastPmtCutoffDt")
    protected LastPmtCutoffDtType lastPmtCutoffDt;
    @XmlElement(name = "CurtCurPeriodAmt")
    protected CurtCurPeriodAmtType curtCurPeriodAmt;
    @XmlElement(name = "CurtRvrCurPeriodAmt")
    protected CurtRvrCurPeriodAmtType curtRvrCurPeriodAmt;
    @XmlElement(name = "CurtRvrPrevPeriodAmt")
    protected CurtRvrPrevPeriodAmtType curtRvrPrevPeriodAmt;
    @XmlElement(name = "CurtPrevPeriodAmt")
    protected CurtPrevPeriodAmtType curtPrevPeriodAmt;
    @XmlElement(name = "EscrwCurPeriodAmt")
    protected EscrwCurPeriodAmtType escrwCurPeriodAmt;
    @XmlElement(name = "EscrwPrevPeriodAmt")
    protected EscrwPrevPeriodAmtType escrwPrevPeriodAmt;
    @XmlElement(name = "CurtRetAmt")
    protected CurtRetAmtType curtRetAmt;
    @XmlElement(name = "CurtPrevRetAmt")
    protected CurtPrevRetAmtType curtPrevRetAmt;
    @XmlElement(name = "SvcOthFeeCurAmt")
    protected SvcOthFeeCurAmtType svcOthFeeCurAmt;
    @XmlElement(name = "SvcOthFeePrevAmt")
    protected SvcOthFeePrevAmtType svcOthFeePrevAmt;
    @XmlElement(name = "IntDiffAmt")
    protected IntDiffAmtType intDiffAmt;
    @XmlElement(name = "SvcIntPdYTDAmt")
    protected SvcIntPdYTDAmtType svcIntPdYTDAmt;
    @XmlElement(name = "PrePmtNum")
    protected PrePmtNumType prePmtNum;
    @XmlElement(name = "SvcInvFirstPmtDt")
    protected SvcInvFirstPmtDtType svcInvFirstPmtDt;
    @XmlElement(name = "SvcEscrwInfoArray")
    protected SvcEscrwInfoArrayAType svcEscrwInfoArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lastPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastPmtDtType }
     *     
     */
    public LastPmtDtType getLastPmtDt() {
        return lastPmtDt;
    }

    /**
     * Sets the value of the lastPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastPmtDtType }
     *     
     */
    public void setLastPmtDt(LastPmtDtType value) {
        this.lastPmtDt = value;
    }

    /**
     * Gets the value of the lastPmtCutoffDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastPmtCutoffDtType }
     *     
     */
    public LastPmtCutoffDtType getLastPmtCutoffDt() {
        return lastPmtCutoffDt;
    }

    /**
     * Sets the value of the lastPmtCutoffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastPmtCutoffDtType }
     *     
     */
    public void setLastPmtCutoffDt(LastPmtCutoffDtType value) {
        this.lastPmtCutoffDt = value;
    }

    /**
     * Gets the value of the curtCurPeriodAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurtCurPeriodAmtType }
     *     
     */
    public CurtCurPeriodAmtType getCurtCurPeriodAmt() {
        return curtCurPeriodAmt;
    }

    /**
     * Sets the value of the curtCurPeriodAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurtCurPeriodAmtType }
     *     
     */
    public void setCurtCurPeriodAmt(CurtCurPeriodAmtType value) {
        this.curtCurPeriodAmt = value;
    }

    /**
     * Gets the value of the curtRvrCurPeriodAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurtRvrCurPeriodAmtType }
     *     
     */
    public CurtRvrCurPeriodAmtType getCurtRvrCurPeriodAmt() {
        return curtRvrCurPeriodAmt;
    }

    /**
     * Sets the value of the curtRvrCurPeriodAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurtRvrCurPeriodAmtType }
     *     
     */
    public void setCurtRvrCurPeriodAmt(CurtRvrCurPeriodAmtType value) {
        this.curtRvrCurPeriodAmt = value;
    }

    /**
     * Gets the value of the curtRvrPrevPeriodAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurtRvrPrevPeriodAmtType }
     *     
     */
    public CurtRvrPrevPeriodAmtType getCurtRvrPrevPeriodAmt() {
        return curtRvrPrevPeriodAmt;
    }

    /**
     * Sets the value of the curtRvrPrevPeriodAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurtRvrPrevPeriodAmtType }
     *     
     */
    public void setCurtRvrPrevPeriodAmt(CurtRvrPrevPeriodAmtType value) {
        this.curtRvrPrevPeriodAmt = value;
    }

    /**
     * Gets the value of the curtPrevPeriodAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurtPrevPeriodAmtType }
     *     
     */
    public CurtPrevPeriodAmtType getCurtPrevPeriodAmt() {
        return curtPrevPeriodAmt;
    }

    /**
     * Sets the value of the curtPrevPeriodAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurtPrevPeriodAmtType }
     *     
     */
    public void setCurtPrevPeriodAmt(CurtPrevPeriodAmtType value) {
        this.curtPrevPeriodAmt = value;
    }

    /**
     * Gets the value of the escrwCurPeriodAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwCurPeriodAmtType }
     *     
     */
    public EscrwCurPeriodAmtType getEscrwCurPeriodAmt() {
        return escrwCurPeriodAmt;
    }

    /**
     * Sets the value of the escrwCurPeriodAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwCurPeriodAmtType }
     *     
     */
    public void setEscrwCurPeriodAmt(EscrwCurPeriodAmtType value) {
        this.escrwCurPeriodAmt = value;
    }

    /**
     * Gets the value of the escrwPrevPeriodAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwPrevPeriodAmtType }
     *     
     */
    public EscrwPrevPeriodAmtType getEscrwPrevPeriodAmt() {
        return escrwPrevPeriodAmt;
    }

    /**
     * Sets the value of the escrwPrevPeriodAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwPrevPeriodAmtType }
     *     
     */
    public void setEscrwPrevPeriodAmt(EscrwPrevPeriodAmtType value) {
        this.escrwPrevPeriodAmt = value;
    }

    /**
     * Gets the value of the curtRetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurtRetAmtType }
     *     
     */
    public CurtRetAmtType getCurtRetAmt() {
        return curtRetAmt;
    }

    /**
     * Sets the value of the curtRetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurtRetAmtType }
     *     
     */
    public void setCurtRetAmt(CurtRetAmtType value) {
        this.curtRetAmt = value;
    }

    /**
     * Gets the value of the curtPrevRetAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurtPrevRetAmtType }
     *     
     */
    public CurtPrevRetAmtType getCurtPrevRetAmt() {
        return curtPrevRetAmt;
    }

    /**
     * Sets the value of the curtPrevRetAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurtPrevRetAmtType }
     *     
     */
    public void setCurtPrevRetAmt(CurtPrevRetAmtType value) {
        this.curtPrevRetAmt = value;
    }

    /**
     * Gets the value of the svcOthFeeCurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcOthFeeCurAmtType }
     *     
     */
    public SvcOthFeeCurAmtType getSvcOthFeeCurAmt() {
        return svcOthFeeCurAmt;
    }

    /**
     * Sets the value of the svcOthFeeCurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcOthFeeCurAmtType }
     *     
     */
    public void setSvcOthFeeCurAmt(SvcOthFeeCurAmtType value) {
        this.svcOthFeeCurAmt = value;
    }

    /**
     * Gets the value of the svcOthFeePrevAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcOthFeePrevAmtType }
     *     
     */
    public SvcOthFeePrevAmtType getSvcOthFeePrevAmt() {
        return svcOthFeePrevAmt;
    }

    /**
     * Sets the value of the svcOthFeePrevAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcOthFeePrevAmtType }
     *     
     */
    public void setSvcOthFeePrevAmt(SvcOthFeePrevAmtType value) {
        this.svcOthFeePrevAmt = value;
    }

    /**
     * Gets the value of the intDiffAmt property.
     * 
     * @return
     *     possible object is
     *     {@link IntDiffAmtType }
     *     
     */
    public IntDiffAmtType getIntDiffAmt() {
        return intDiffAmt;
    }

    /**
     * Sets the value of the intDiffAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntDiffAmtType }
     *     
     */
    public void setIntDiffAmt(IntDiffAmtType value) {
        this.intDiffAmt = value;
    }

    /**
     * Gets the value of the svcIntPdYTDAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcIntPdYTDAmtType }
     *     
     */
    public SvcIntPdYTDAmtType getSvcIntPdYTDAmt() {
        return svcIntPdYTDAmt;
    }

    /**
     * Sets the value of the svcIntPdYTDAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcIntPdYTDAmtType }
     *     
     */
    public void setSvcIntPdYTDAmt(SvcIntPdYTDAmtType value) {
        this.svcIntPdYTDAmt = value;
    }

    /**
     * Gets the value of the prePmtNum property.
     * 
     * @return
     *     possible object is
     *     {@link PrePmtNumType }
     *     
     */
    public PrePmtNumType getPrePmtNum() {
        return prePmtNum;
    }

    /**
     * Sets the value of the prePmtNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePmtNumType }
     *     
     */
    public void setPrePmtNum(PrePmtNumType value) {
        this.prePmtNum = value;
    }

    /**
     * Gets the value of the svcInvFirstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcInvFirstPmtDtType }
     *     
     */
    public SvcInvFirstPmtDtType getSvcInvFirstPmtDt() {
        return svcInvFirstPmtDt;
    }

    /**
     * Sets the value of the svcInvFirstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcInvFirstPmtDtType }
     *     
     */
    public void setSvcInvFirstPmtDt(SvcInvFirstPmtDtType value) {
        this.svcInvFirstPmtDt = value;
    }

    /**
     * Gets the value of the svcEscrwInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link SvcEscrwInfoArrayAType }
     *     
     */
    public SvcEscrwInfoArrayAType getSvcEscrwInfoArray() {
        return svcEscrwInfoArray;
    }

    /**
     * Sets the value of the svcEscrwInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcEscrwInfoArrayAType }
     *     
     */
    public void setSvcEscrwInfoArray(SvcEscrwInfoArrayAType value) {
        this.svcEscrwInfoArray = value;
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
