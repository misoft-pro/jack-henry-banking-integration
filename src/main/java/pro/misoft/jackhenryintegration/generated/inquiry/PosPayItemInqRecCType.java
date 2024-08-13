
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
 * <p>Java class for PosPayItemInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PosPayItemInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PosPayItemInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}PosPayItemInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="ChkNum" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnAmt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IssAmt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeName" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeName_Type" minOccurs="0"/&gt;
 *         &lt;element name="BatchNum" type="{http://jackhenry.com/jxchange/TPG/2008}BatchNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="SeqNum" type="{http://jackhenry.com/jxchange/TPG/2008}SeqNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkDt" type="{http://jackhenry.com/jxchange/TPG/2008}ChkDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SrcCode" type="{http://jackhenry.com/jxchange/TPG/2008}SrcCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SrcCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SrcCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnWsId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnWsId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnUsrId_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ImgNum" type="{http://jackhenry.com/jxchange/TPG/2008}ImgNum_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="RetRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RetRsnDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PosPayItemInqRec_CType", propOrder = {
    "posPayItemInfoRec",
    "chkNum",
    "trnAmt",
    "issAmt",
    "payeeName",
    "batchNum",
    "seqNum",
    "chkDt",
    "srcCode",
    "srcCodeDesc",
    "trnWsId",
    "trnUsrId",
    "custom",
    "ver1",
    "imgNum",
    "ver2",
    "retRsnDesc",
    "ver3",
    "any"
})
public class PosPayItemInqRecCType {

    @XmlElement(name = "PosPayItemInfoRec")
    protected PosPayItemInfoRecCType posPayItemInfoRec;
    @XmlElement(name = "ChkNum")
    protected ChkNumType chkNum;
    @XmlElement(name = "TrnAmt")
    protected AmtType trnAmt;
    @XmlElement(name = "IssAmt")
    protected AmtType issAmt;
    @XmlElement(name = "PayeeName")
    protected PayeeNameType payeeName;
    @XmlElement(name = "BatchNum")
    protected BatchNumType batchNum;
    @XmlElement(name = "SeqNum")
    protected SeqNumType seqNum;
    @XmlElement(name = "ChkDt")
    protected ChkDtType chkDt;
    @XmlElement(name = "SrcCode")
    protected SrcCodeType srcCode;
    @XmlElement(name = "SrcCodeDesc")
    protected SrcCodeDescType srcCodeDesc;
    @XmlElement(name = "TrnWsId")
    protected TrnWsIdType trnWsId;
    @XmlElement(name = "TrnUsrId")
    protected TrnUsrIdType trnUsrId;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ImgNum")
    protected ImgNumType imgNum;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "RetRsnDesc")
    protected RetRsnDescType retRsnDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the posPayItemInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link PosPayItemInfoRecCType }
     *     
     */
    public PosPayItemInfoRecCType getPosPayItemInfoRec() {
        return posPayItemInfoRec;
    }

    /**
     * Sets the value of the posPayItemInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PosPayItemInfoRecCType }
     *     
     */
    public void setPosPayItemInfoRec(PosPayItemInfoRecCType value) {
        this.posPayItemInfoRec = value;
    }

    /**
     * Gets the value of the chkNum property.
     * 
     * @return
     *     possible object is
     *     {@link ChkNumType }
     *     
     */
    public ChkNumType getChkNum() {
        return chkNum;
    }

    /**
     * Sets the value of the chkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkNumType }
     *     
     */
    public void setChkNum(ChkNumType value) {
        this.chkNum = value;
    }

    /**
     * Gets the value of the trnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getTrnAmt() {
        return trnAmt;
    }

    /**
     * Sets the value of the trnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setTrnAmt(AmtType value) {
        this.trnAmt = value;
    }

    /**
     * Gets the value of the issAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getIssAmt() {
        return issAmt;
    }

    /**
     * Sets the value of the issAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setIssAmt(AmtType value) {
        this.issAmt = value;
    }

    /**
     * Gets the value of the payeeName property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeNameType }
     *     
     */
    public PayeeNameType getPayeeName() {
        return payeeName;
    }

    /**
     * Sets the value of the payeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeNameType }
     *     
     */
    public void setPayeeName(PayeeNameType value) {
        this.payeeName = value;
    }

    /**
     * Gets the value of the batchNum property.
     * 
     * @return
     *     possible object is
     *     {@link BatchNumType }
     *     
     */
    public BatchNumType getBatchNum() {
        return batchNum;
    }

    /**
     * Sets the value of the batchNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchNumType }
     *     
     */
    public void setBatchNum(BatchNumType value) {
        this.batchNum = value;
    }

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link SeqNumType }
     *     
     */
    public SeqNumType getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeqNumType }
     *     
     */
    public void setSeqNum(SeqNumType value) {
        this.seqNum = value;
    }

    /**
     * Gets the value of the chkDt property.
     * 
     * @return
     *     possible object is
     *     {@link ChkDtType }
     *     
     */
    public ChkDtType getChkDt() {
        return chkDt;
    }

    /**
     * Sets the value of the chkDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkDtType }
     *     
     */
    public void setChkDt(ChkDtType value) {
        this.chkDt = value;
    }

    /**
     * Gets the value of the srcCode property.
     * 
     * @return
     *     possible object is
     *     {@link SrcCodeType }
     *     
     */
    public SrcCodeType getSrcCode() {
        return srcCode;
    }

    /**
     * Sets the value of the srcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrcCodeType }
     *     
     */
    public void setSrcCode(SrcCodeType value) {
        this.srcCode = value;
    }

    /**
     * Gets the value of the srcCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SrcCodeDescType }
     *     
     */
    public SrcCodeDescType getSrcCodeDesc() {
        return srcCodeDesc;
    }

    /**
     * Sets the value of the srcCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrcCodeDescType }
     *     
     */
    public void setSrcCodeDesc(SrcCodeDescType value) {
        this.srcCodeDesc = value;
    }

    /**
     * Gets the value of the trnWsId property.
     * 
     * @return
     *     possible object is
     *     {@link TrnWsIdType }
     *     
     */
    public TrnWsIdType getTrnWsId() {
        return trnWsId;
    }

    /**
     * Sets the value of the trnWsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnWsIdType }
     *     
     */
    public void setTrnWsId(TrnWsIdType value) {
        this.trnWsId = value;
    }

    /**
     * Gets the value of the trnUsrId property.
     * 
     * @return
     *     possible object is
     *     {@link TrnUsrIdType }
     *     
     */
    public TrnUsrIdType getTrnUsrId() {
        return trnUsrId;
    }

    /**
     * Sets the value of the trnUsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnUsrIdType }
     *     
     */
    public void setTrnUsrId(TrnUsrIdType value) {
        this.trnUsrId = value;
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
     * Gets the value of the imgNum property.
     * 
     * @return
     *     possible object is
     *     {@link ImgNumType }
     *     
     */
    public ImgNumType getImgNum() {
        return imgNum;
    }

    /**
     * Sets the value of the imgNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImgNumType }
     *     
     */
    public void setImgNum(ImgNumType value) {
        this.imgNum = value;
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
     * Gets the value of the retRsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RetRsnDescType }
     *     
     */
    public RetRsnDescType getRetRsnDesc() {
        return retRsnDesc;
    }

    /**
     * Sets the value of the retRsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetRsnDescType }
     *     
     */
    public void setRetRsnDesc(RetRsnDescType value) {
        this.retRsnDesc = value;
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
