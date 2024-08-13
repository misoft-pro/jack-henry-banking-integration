
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
 * <p>Java class for LnHistPmtInfoSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnHistPmtInfoSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type"/&gt;
 *         &lt;element name="TrnCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeDesc_Type"/&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type"/&gt;
 *         &lt;element name="TrnType" type="{http://jackhenry.com/jxchange/TPG/2008}TrnType_Type"/&gt;
 *         &lt;element name="AffCode" type="{http://jackhenry.com/jxchange/TPG/2008}AffCode_Type"/&gt;
 *         &lt;element name="SplitPostSeq" type="{http://jackhenry.com/jxchange/TPG/2008}SplitPostSeq_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtDueDt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtDueDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostSeq" type="{http://jackhenry.com/jxchange/TPG/2008}PostSeq_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnHistBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}TrnHistBalAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AffCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AffCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnStmtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TrnStmtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="HistRecId" type="{http://jackhenry.com/jxchange/TPG/2008}HistRecId_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "LnHistPmtInfoSrchRec_CType", propOrder = {
    "trnCodeCode",
    "trnCodeDesc",
    "amt",
    "trnType",
    "affCode",
    "splitPostSeq",
    "pmtDueDt",
    "postSeq",
    "trnHistBalAmt",
    "affCodeDesc",
    "trnStmtDesc",
    "histRecId",
    "custom",
    "ver1",
    "any"
})
public class LnHistPmtInfoSrchRecCType {

    @XmlElement(name = "TrnCodeCode", required = true)
    protected TrnCodeCodeType trnCodeCode;
    @XmlElement(name = "TrnCodeDesc", required = true)
    protected TrnCodeDescType trnCodeDesc;
    @XmlElement(name = "Amt", required = true)
    protected AmtType amt;
    @XmlElement(name = "TrnType", required = true)
    protected TrnTypeType trnType;
    @XmlElement(name = "AffCode", required = true)
    protected AffCodeType affCode;
    @XmlElement(name = "SplitPostSeq")
    protected SplitPostSeqType splitPostSeq;
    @XmlElement(name = "PmtDueDt")
    protected PmtDueDtType pmtDueDt;
    @XmlElement(name = "PostSeq")
    protected PostSeqType postSeq;
    @XmlElement(name = "TrnHistBalAmt")
    protected TrnHistBalAmtType trnHistBalAmt;
    @XmlElement(name = "AffCodeDesc")
    protected AffCodeDescType affCodeDesc;
    @XmlElement(name = "TrnStmtDesc")
    protected TrnStmtDescType trnStmtDesc;
    @XmlElement(name = "HistRecId")
    protected HistRecIdType histRecId;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the trnCodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TrnCodeCodeType }
     *     
     */
    public TrnCodeCodeType getTrnCodeCode() {
        return trnCodeCode;
    }

    /**
     * Sets the value of the trnCodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnCodeCodeType }
     *     
     */
    public void setTrnCodeCode(TrnCodeCodeType value) {
        this.trnCodeCode = value;
    }

    /**
     * Gets the value of the trnCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link TrnCodeDescType }
     *     
     */
    public TrnCodeDescType getTrnCodeDesc() {
        return trnCodeDesc;
    }

    /**
     * Sets the value of the trnCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnCodeDescType }
     *     
     */
    public void setTrnCodeDesc(TrnCodeDescType value) {
        this.trnCodeDesc = value;
    }

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
     * Gets the value of the trnType property.
     * 
     * @return
     *     possible object is
     *     {@link TrnTypeType }
     *     
     */
    public TrnTypeType getTrnType() {
        return trnType;
    }

    /**
     * Sets the value of the trnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnTypeType }
     *     
     */
    public void setTrnType(TrnTypeType value) {
        this.trnType = value;
    }

    /**
     * Gets the value of the affCode property.
     * 
     * @return
     *     possible object is
     *     {@link AffCodeType }
     *     
     */
    public AffCodeType getAffCode() {
        return affCode;
    }

    /**
     * Sets the value of the affCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffCodeType }
     *     
     */
    public void setAffCode(AffCodeType value) {
        this.affCode = value;
    }

    /**
     * Gets the value of the splitPostSeq property.
     * 
     * @return
     *     possible object is
     *     {@link SplitPostSeqType }
     *     
     */
    public SplitPostSeqType getSplitPostSeq() {
        return splitPostSeq;
    }

    /**
     * Sets the value of the splitPostSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitPostSeqType }
     *     
     */
    public void setSplitPostSeq(SplitPostSeqType value) {
        this.splitPostSeq = value;
    }

    /**
     * Gets the value of the pmtDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtDueDtType }
     *     
     */
    public PmtDueDtType getPmtDueDt() {
        return pmtDueDt;
    }

    /**
     * Sets the value of the pmtDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtDueDtType }
     *     
     */
    public void setPmtDueDt(PmtDueDtType value) {
        this.pmtDueDt = value;
    }

    /**
     * Gets the value of the postSeq property.
     * 
     * @return
     *     possible object is
     *     {@link PostSeqType }
     *     
     */
    public PostSeqType getPostSeq() {
        return postSeq;
    }

    /**
     * Sets the value of the postSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostSeqType }
     *     
     */
    public void setPostSeq(PostSeqType value) {
        this.postSeq = value;
    }

    /**
     * Gets the value of the trnHistBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TrnHistBalAmtType }
     *     
     */
    public TrnHistBalAmtType getTrnHistBalAmt() {
        return trnHistBalAmt;
    }

    /**
     * Sets the value of the trnHistBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnHistBalAmtType }
     *     
     */
    public void setTrnHistBalAmt(TrnHistBalAmtType value) {
        this.trnHistBalAmt = value;
    }

    /**
     * Gets the value of the affCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AffCodeDescType }
     *     
     */
    public AffCodeDescType getAffCodeDesc() {
        return affCodeDesc;
    }

    /**
     * Sets the value of the affCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffCodeDescType }
     *     
     */
    public void setAffCodeDesc(AffCodeDescType value) {
        this.affCodeDesc = value;
    }

    /**
     * Gets the value of the trnStmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link TrnStmtDescType }
     *     
     */
    public TrnStmtDescType getTrnStmtDesc() {
        return trnStmtDesc;
    }

    /**
     * Sets the value of the trnStmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnStmtDescType }
     *     
     */
    public void setTrnStmtDesc(TrnStmtDescType value) {
        this.trnStmtDesc = value;
    }

    /**
     * Gets the value of the histRecId property.
     * 
     * @return
     *     possible object is
     *     {@link HistRecIdType }
     *     
     */
    public HistRecIdType getHistRecId() {
        return histRecId;
    }

    /**
     * Sets the value of the histRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistRecIdType }
     *     
     */
    public void setHistRecId(HistRecIdType value) {
        this.histRecId = value;
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
