
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
 * <p>Java class for StopChkInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopChkInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LowAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LowAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="HighAmt" type="{http://jackhenry.com/jxchange/TPG/2008}HighAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkDt" type="{http://jackhenry.com/jxchange/TPG/2008}ChkDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkNumStart" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNumStart_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkNumEnd" type="{http://jackhenry.com/jxchange/TPG/2008}ChkNumEnd_Type" minOccurs="0"/&gt;
 *         &lt;element name="StopChg" type="{http://jackhenry.com/jxchange/TPG/2008}StopChg_Type" minOccurs="0"/&gt;
 *         &lt;element name="PayeeName" type="{http://jackhenry.com/jxchange/TPG/2008}PayeeName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHStdEntryClass" type="{http://jackhenry.com/jxchange/TPG/2008}ACHStdEntryClass_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHDrCRAll" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrCRAll_Type" minOccurs="0"/&gt;
 *         &lt;element name="RmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="HldEntireBal" type="{http://jackhenry.com/jxchange/TPG/2008}HldEntireBal_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="StopNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}StopNotCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="EffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EffDt_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="RelAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}RelAcctId_Type" minOccurs="0"/&gt;
 *               &lt;element name="RelAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}RelAcctType_Type" minOccurs="0"/&gt;
 *               &lt;element name="PostAdvCode" type="{http://jackhenry.com/jxchange/TPG/2008}PostAdvCode_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="AvlBalEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}AvlBalEffDt_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="ApprvOffInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ApprvOffInfoArray_AType" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "StopChkInfo_CType", propOrder = {
    "offCode",
    "expDt",
    "lowAmt",
    "highAmt",
    "chkDt",
    "chkNumStart",
    "chkNumEnd",
    "stopChg",
    "payeeName",
    "achCompId",
    "achStdEntryClass",
    "achDrCRAll",
    "rmkArray",
    "ver1",
    "hldEntireBal",
    "ver2",
    "stopNotCode",
    "effDt",
    "ver3",
    "relAcctId",
    "relAcctType",
    "postAdvCode",
    "ver4",
    "avlBalEffDt",
    "ver5",
    "apprvOffInfoArray",
    "ver6",
    "any"
})
public class StopChkInfoCType {

    @XmlElement(name = "OffCode")
    protected OffCodeType offCode;
    @XmlElement(name = "ExpDt")
    protected ExpDtType expDt;
    @XmlElement(name = "LowAmt")
    protected LowAmtType lowAmt;
    @XmlElement(name = "HighAmt")
    protected HighAmtType highAmt;
    @XmlElement(name = "ChkDt")
    protected ChkDtType chkDt;
    @XmlElement(name = "ChkNumStart")
    protected ChkNumStartType chkNumStart;
    @XmlElement(name = "ChkNumEnd")
    protected ChkNumEndType chkNumEnd;
    @XmlElement(name = "StopChg")
    protected StopChgType stopChg;
    @XmlElement(name = "PayeeName")
    protected PayeeNameType payeeName;
    @XmlElement(name = "ACHCompId")
    protected ACHCompIdType achCompId;
    @XmlElement(name = "ACHStdEntryClass")
    protected ACHStdEntryClassType achStdEntryClass;
    @XmlElement(name = "ACHDrCRAll")
    protected ACHDrCRAllType achDrCRAll;
    @XmlElement(name = "RmkArray")
    protected RmkAType rmkArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "HldEntireBal")
    protected HldEntireBalType hldEntireBal;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "StopNotCode")
    protected StopNotCodeType stopNotCode;
    @XmlElement(name = "EffDt")
    protected EffDtType effDt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "RelAcctId")
    protected RelAcctIdType relAcctId;
    @XmlElement(name = "RelAcctType")
    protected RelAcctTypeType relAcctType;
    @XmlElement(name = "PostAdvCode")
    protected PostAdvCodeType postAdvCode;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "AvlBalEffDt")
    protected AvlBalEffDtType avlBalEffDt;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "ApprvOffInfoArray")
    protected ApprvOffInfoArrayAType apprvOffInfoArray;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the offCode property.
     * 
     * @return
     *     possible object is
     *     {@link OffCodeType }
     *     
     */
    public OffCodeType getOffCode() {
        return offCode;
    }

    /**
     * Sets the value of the offCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffCodeType }
     *     
     */
    public void setOffCode(OffCodeType value) {
        this.offCode = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setExpDt(ExpDtType value) {
        this.expDt = value;
    }

    /**
     * Gets the value of the lowAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LowAmtType }
     *     
     */
    public LowAmtType getLowAmt() {
        return lowAmt;
    }

    /**
     * Sets the value of the lowAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LowAmtType }
     *     
     */
    public void setLowAmt(LowAmtType value) {
        this.lowAmt = value;
    }

    /**
     * Gets the value of the highAmt property.
     * 
     * @return
     *     possible object is
     *     {@link HighAmtType }
     *     
     */
    public HighAmtType getHighAmt() {
        return highAmt;
    }

    /**
     * Sets the value of the highAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighAmtType }
     *     
     */
    public void setHighAmt(HighAmtType value) {
        this.highAmt = value;
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
     * Gets the value of the chkNumStart property.
     * 
     * @return
     *     possible object is
     *     {@link ChkNumStartType }
     *     
     */
    public ChkNumStartType getChkNumStart() {
        return chkNumStart;
    }

    /**
     * Sets the value of the chkNumStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkNumStartType }
     *     
     */
    public void setChkNumStart(ChkNumStartType value) {
        this.chkNumStart = value;
    }

    /**
     * Gets the value of the chkNumEnd property.
     * 
     * @return
     *     possible object is
     *     {@link ChkNumEndType }
     *     
     */
    public ChkNumEndType getChkNumEnd() {
        return chkNumEnd;
    }

    /**
     * Sets the value of the chkNumEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkNumEndType }
     *     
     */
    public void setChkNumEnd(ChkNumEndType value) {
        this.chkNumEnd = value;
    }

    /**
     * Gets the value of the stopChg property.
     * 
     * @return
     *     possible object is
     *     {@link StopChgType }
     *     
     */
    public StopChgType getStopChg() {
        return stopChg;
    }

    /**
     * Sets the value of the stopChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopChgType }
     *     
     */
    public void setStopChg(StopChgType value) {
        this.stopChg = value;
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
     * Gets the value of the achCompId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCompIdType }
     *     
     */
    public ACHCompIdType getACHCompId() {
        return achCompId;
    }

    /**
     * Sets the value of the achCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCompIdType }
     *     
     */
    public void setACHCompId(ACHCompIdType value) {
        this.achCompId = value;
    }

    /**
     * Gets the value of the achStdEntryClass property.
     * 
     * @return
     *     possible object is
     *     {@link ACHStdEntryClassType }
     *     
     */
    public ACHStdEntryClassType getACHStdEntryClass() {
        return achStdEntryClass;
    }

    /**
     * Sets the value of the achStdEntryClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHStdEntryClassType }
     *     
     */
    public void setACHStdEntryClass(ACHStdEntryClassType value) {
        this.achStdEntryClass = value;
    }

    /**
     * Gets the value of the achDrCRAll property.
     * 
     * @return
     *     possible object is
     *     {@link ACHDrCRAllType }
     *     
     */
    public ACHDrCRAllType getACHDrCRAll() {
        return achDrCRAll;
    }

    /**
     * Sets the value of the achDrCRAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHDrCRAllType }
     *     
     */
    public void setACHDrCRAll(ACHDrCRAllType value) {
        this.achDrCRAll = value;
    }

    /**
     * Gets the value of the rmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getRmkArray() {
        return rmkArray;
    }

    /**
     * Sets the value of the rmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setRmkArray(RmkAType value) {
        this.rmkArray = value;
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
     * Gets the value of the hldEntireBal property.
     * 
     * @return
     *     possible object is
     *     {@link HldEntireBalType }
     *     
     */
    public HldEntireBalType getHldEntireBal() {
        return hldEntireBal;
    }

    /**
     * Sets the value of the hldEntireBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link HldEntireBalType }
     *     
     */
    public void setHldEntireBal(HldEntireBalType value) {
        this.hldEntireBal = value;
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
     * Gets the value of the stopNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link StopNotCodeType }
     *     
     */
    public StopNotCodeType getStopNotCode() {
        return stopNotCode;
    }

    /**
     * Sets the value of the stopNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopNotCodeType }
     *     
     */
    public void setStopNotCode(StopNotCodeType value) {
        this.stopNotCode = value;
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
     * Gets the value of the relAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link RelAcctIdType }
     *     
     */
    public RelAcctIdType getRelAcctId() {
        return relAcctId;
    }

    /**
     * Sets the value of the relAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelAcctIdType }
     *     
     */
    public void setRelAcctId(RelAcctIdType value) {
        this.relAcctId = value;
    }

    /**
     * Gets the value of the relAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link RelAcctTypeType }
     *     
     */
    public RelAcctTypeType getRelAcctType() {
        return relAcctType;
    }

    /**
     * Sets the value of the relAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelAcctTypeType }
     *     
     */
    public void setRelAcctType(RelAcctTypeType value) {
        this.relAcctType = value;
    }

    /**
     * Gets the value of the postAdvCode property.
     * 
     * @return
     *     possible object is
     *     {@link PostAdvCodeType }
     *     
     */
    public PostAdvCodeType getPostAdvCode() {
        return postAdvCode;
    }

    /**
     * Sets the value of the postAdvCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostAdvCodeType }
     *     
     */
    public void setPostAdvCode(PostAdvCodeType value) {
        this.postAdvCode = value;
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
     * Gets the value of the avlBalEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link AvlBalEffDtType }
     *     
     */
    public AvlBalEffDtType getAvlBalEffDt() {
        return avlBalEffDt;
    }

    /**
     * Sets the value of the avlBalEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvlBalEffDtType }
     *     
     */
    public void setAvlBalEffDt(AvlBalEffDtType value) {
        this.avlBalEffDt = value;
    }

    /**
     * Gets the value of the ver5 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver5CType }
     *     
     */
    public Ver5CType getVer5() {
        return ver5;
    }

    /**
     * Sets the value of the ver5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver5CType }
     *     
     */
    public void setVer5(Ver5CType value) {
        this.ver5 = value;
    }

    /**
     * Gets the value of the apprvOffInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link ApprvOffInfoArrayAType }
     *     
     */
    public ApprvOffInfoArrayAType getApprvOffInfoArray() {
        return apprvOffInfoArray;
    }

    /**
     * Sets the value of the apprvOffInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprvOffInfoArrayAType }
     *     
     */
    public void setApprvOffInfoArray(ApprvOffInfoArrayAType value) {
        this.apprvOffInfoArray = value;
    }

    /**
     * Gets the value of the ver6 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver6CType }
     *     
     */
    public Ver6CType getVer6() {
        return ver6;
    }

    /**
     * Sets the value of the ver6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver6CType }
     *     
     */
    public void setVer6(Ver6CType value) {
        this.ver6 = value;
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
