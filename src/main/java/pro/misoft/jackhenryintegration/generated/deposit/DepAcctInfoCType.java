
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for DepAcctInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepAcctInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HldMailCode" type="{http://jackhenry.com/jxchange/TPG/2008}HldMailCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RelAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}RelAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="RelAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}RelAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClubPln" type="{http://jackhenry.com/jxchange/TPG/2008}ClubPln_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkGuar" type="{http://jackhenry.com/jxchange/TPG/2008}ChkGuar_Type" minOccurs="0"/&gt;
 *         &lt;element name="ATMCard" type="{http://jackhenry.com/jxchange/TPG/2008}ATMCard_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClsOnZeroBal" type="{http://jackhenry.com/jxchange/TPG/2008}ClsOnZeroBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="RepoBlkId" type="{http://jackhenry.com/jxchange/TPG/2008}RepoBlkId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctLvlSecCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctLvlSecCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="HighVolAcctCode" type="{http://jackhenry.com/jxchange/TPG/2008}HighVolAcctCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="LstPostAcctCode" type="{http://jackhenry.com/jxchange/TPG/2008}LstPostAcctCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ClubPlnAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}ClubPlnAcctId_Type" minOccurs="0"/&gt;
 *           &lt;element name="ClubPlnAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}ClubPlnAcctType_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrtACHNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtACHNotCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="AcctReOpenCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctReOpenCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="FltSchedCode" type="{http://jackhenry.com/jxchange/TPG/2008}FltSchedCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="EFTCardInfo" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardInfo_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="AllowTrnActArray" type="{http://jackhenry.com/jxchange/TPG/2008}AllowTrnActArray_AType" minOccurs="0"/&gt;
 *             &lt;element name="LangType" type="{http://jackhenry.com/jxchange/TPG/2008}LangType_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="CrBureauRptCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrBureauRptCode_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="EstbPersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *                 &lt;element name="EstbPersonTitle" type="{http://jackhenry.com/jxchange/TPG/2008}EmplTitle_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="PlnCvrgType" type="{http://jackhenry.com/jxchange/TPG/2008}PlnCvrgType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "DepAcctInfo_CType", propOrder = {
    "hldMailCode",
    "relAcctId",
    "relAcctType",
    "clubPln",
    "chkGuar",
    "atmCard",
    "clsOnZeroBal",
    "repoBlkId",
    "acctLvlSecCode",
    "highVolAcctCode",
    "lstPostAcctCode",
    "userDefInfoArray",
    "ver1",
    "clubPlnAcctId",
    "clubPlnAcctType",
    "prtACHNotCode",
    "acctReOpenCode",
    "fltSchedCode",
    "eftCardInfo",
    "ver2",
    "allowTrnActArray",
    "langType",
    "ver3",
    "crBureauRptCode",
    "ver4",
    "estbPersonName",
    "estbPersonTitle",
    "ver5",
    "plnCvrgType",
    "ver6",
    "any"
})
public class DepAcctInfoCType {

    @XmlElementRef(name = "HldMailCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HldMailCodeType> hldMailCode;
    @XmlElementRef(name = "RelAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RelAcctIdType> relAcctId;
    @XmlElementRef(name = "RelAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RelAcctTypeType> relAcctType;
    @XmlElementRef(name = "ClubPln", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ClubPlnType> clubPln;
    @XmlElementRef(name = "ChkGuar", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChkGuarType> chkGuar;
    @XmlElementRef(name = "ATMCard", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ATMCardType> atmCard;
    @XmlElementRef(name = "ClsOnZeroBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ClsOnZeroBalType> clsOnZeroBal;
    @XmlElementRef(name = "RepoBlkId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RepoBlkIdType> repoBlkId;
    @XmlElementRef(name = "AcctLvlSecCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctLvlSecCodeType> acctLvlSecCode;
    @XmlElementRef(name = "HighVolAcctCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HighVolAcctCodeType> highVolAcctCode;
    @XmlElementRef(name = "LstPostAcctCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LstPostAcctCodeType> lstPostAcctCode;
    @XmlElement(name = "UserDefInfoArray")
    protected UserDefInfoArrayAType userDefInfoArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "ClubPlnAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ClubPlnAcctIdType> clubPlnAcctId;
    @XmlElementRef(name = "ClubPlnAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ClubPlnAcctTypeType> clubPlnAcctType;
    @XmlElementRef(name = "PrtACHNotCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtACHNotCodeType> prtACHNotCode;
    @XmlElementRef(name = "AcctReOpenCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctReOpenCodeType> acctReOpenCode;
    @XmlElementRef(name = "FltSchedCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FltSchedCodeType> fltSchedCode;
    @XmlElementRef(name = "EFTCardInfo", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTCardInfoCType> eftCardInfo;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "AllowTrnActArray")
    protected AllowTrnActArrayAType allowTrnActArray;
    @XmlElementRef(name = "LangType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LangTypeType> langType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "CrBureauRptCode")
    protected CrBureauRptCodeType crBureauRptCode;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "EstbPersonName")
    protected PersonNameCType estbPersonName;
    @XmlElement(name = "EstbPersonTitle")
    protected EmplTitleType estbPersonTitle;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "PlnCvrgType")
    protected PlnCvrgTypeType plnCvrgType;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the hldMailCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HldMailCodeType }{@code >}
     *     
     */
    public JAXBElement<HldMailCodeType> getHldMailCode() {
        return hldMailCode;
    }

    /**
     * Sets the value of the hldMailCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HldMailCodeType }{@code >}
     *     
     */
    public void setHldMailCode(JAXBElement<HldMailCodeType> value) {
        this.hldMailCode = value;
    }

    /**
     * Gets the value of the relAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelAcctIdType }{@code >}
     *     
     */
    public JAXBElement<RelAcctIdType> getRelAcctId() {
        return relAcctId;
    }

    /**
     * Sets the value of the relAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelAcctIdType }{@code >}
     *     
     */
    public void setRelAcctId(JAXBElement<RelAcctIdType> value) {
        this.relAcctId = value;
    }

    /**
     * Gets the value of the relAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<RelAcctTypeType> getRelAcctType() {
        return relAcctType;
    }

    /**
     * Sets the value of the relAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelAcctTypeType }{@code >}
     *     
     */
    public void setRelAcctType(JAXBElement<RelAcctTypeType> value) {
        this.relAcctType = value;
    }

    /**
     * Gets the value of the clubPln property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClubPlnType }{@code >}
     *     
     */
    public JAXBElement<ClubPlnType> getClubPln() {
        return clubPln;
    }

    /**
     * Sets the value of the clubPln property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClubPlnType }{@code >}
     *     
     */
    public void setClubPln(JAXBElement<ClubPlnType> value) {
        this.clubPln = value;
    }

    /**
     * Gets the value of the chkGuar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChkGuarType }{@code >}
     *     
     */
    public JAXBElement<ChkGuarType> getChkGuar() {
        return chkGuar;
    }

    /**
     * Sets the value of the chkGuar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChkGuarType }{@code >}
     *     
     */
    public void setChkGuar(JAXBElement<ChkGuarType> value) {
        this.chkGuar = value;
    }

    /**
     * Gets the value of the atmCard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ATMCardType }{@code >}
     *     
     */
    public JAXBElement<ATMCardType> getATMCard() {
        return atmCard;
    }

    /**
     * Sets the value of the atmCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ATMCardType }{@code >}
     *     
     */
    public void setATMCard(JAXBElement<ATMCardType> value) {
        this.atmCard = value;
    }

    /**
     * Gets the value of the clsOnZeroBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClsOnZeroBalType }{@code >}
     *     
     */
    public JAXBElement<ClsOnZeroBalType> getClsOnZeroBal() {
        return clsOnZeroBal;
    }

    /**
     * Sets the value of the clsOnZeroBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClsOnZeroBalType }{@code >}
     *     
     */
    public void setClsOnZeroBal(JAXBElement<ClsOnZeroBalType> value) {
        this.clsOnZeroBal = value;
    }

    /**
     * Gets the value of the repoBlkId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RepoBlkIdType }{@code >}
     *     
     */
    public JAXBElement<RepoBlkIdType> getRepoBlkId() {
        return repoBlkId;
    }

    /**
     * Sets the value of the repoBlkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RepoBlkIdType }{@code >}
     *     
     */
    public void setRepoBlkId(JAXBElement<RepoBlkIdType> value) {
        this.repoBlkId = value;
    }

    /**
     * Gets the value of the acctLvlSecCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctLvlSecCodeType }{@code >}
     *     
     */
    public JAXBElement<AcctLvlSecCodeType> getAcctLvlSecCode() {
        return acctLvlSecCode;
    }

    /**
     * Sets the value of the acctLvlSecCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctLvlSecCodeType }{@code >}
     *     
     */
    public void setAcctLvlSecCode(JAXBElement<AcctLvlSecCodeType> value) {
        this.acctLvlSecCode = value;
    }

    /**
     * Gets the value of the highVolAcctCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HighVolAcctCodeType }{@code >}
     *     
     */
    public JAXBElement<HighVolAcctCodeType> getHighVolAcctCode() {
        return highVolAcctCode;
    }

    /**
     * Sets the value of the highVolAcctCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HighVolAcctCodeType }{@code >}
     *     
     */
    public void setHighVolAcctCode(JAXBElement<HighVolAcctCodeType> value) {
        this.highVolAcctCode = value;
    }

    /**
     * Gets the value of the lstPostAcctCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LstPostAcctCodeType }{@code >}
     *     
     */
    public JAXBElement<LstPostAcctCodeType> getLstPostAcctCode() {
        return lstPostAcctCode;
    }

    /**
     * Sets the value of the lstPostAcctCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LstPostAcctCodeType }{@code >}
     *     
     */
    public void setLstPostAcctCode(JAXBElement<LstPostAcctCodeType> value) {
        this.lstPostAcctCode = value;
    }

    /**
     * Gets the value of the userDefInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public UserDefInfoArrayAType getUserDefInfoArray() {
        return userDefInfoArray;
    }

    /**
     * Sets the value of the userDefInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public void setUserDefInfoArray(UserDefInfoArrayAType value) {
        this.userDefInfoArray = value;
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
     * Gets the value of the clubPlnAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClubPlnAcctIdType }{@code >}
     *     
     */
    public JAXBElement<ClubPlnAcctIdType> getClubPlnAcctId() {
        return clubPlnAcctId;
    }

    /**
     * Sets the value of the clubPlnAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClubPlnAcctIdType }{@code >}
     *     
     */
    public void setClubPlnAcctId(JAXBElement<ClubPlnAcctIdType> value) {
        this.clubPlnAcctId = value;
    }

    /**
     * Gets the value of the clubPlnAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClubPlnAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<ClubPlnAcctTypeType> getClubPlnAcctType() {
        return clubPlnAcctType;
    }

    /**
     * Sets the value of the clubPlnAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClubPlnAcctTypeType }{@code >}
     *     
     */
    public void setClubPlnAcctType(JAXBElement<ClubPlnAcctTypeType> value) {
        this.clubPlnAcctType = value;
    }

    /**
     * Gets the value of the prtACHNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtACHNotCodeType }{@code >}
     *     
     */
    public JAXBElement<PrtACHNotCodeType> getPrtACHNotCode() {
        return prtACHNotCode;
    }

    /**
     * Sets the value of the prtACHNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtACHNotCodeType }{@code >}
     *     
     */
    public void setPrtACHNotCode(JAXBElement<PrtACHNotCodeType> value) {
        this.prtACHNotCode = value;
    }

    /**
     * Gets the value of the acctReOpenCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctReOpenCodeType }{@code >}
     *     
     */
    public JAXBElement<AcctReOpenCodeType> getAcctReOpenCode() {
        return acctReOpenCode;
    }

    /**
     * Sets the value of the acctReOpenCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctReOpenCodeType }{@code >}
     *     
     */
    public void setAcctReOpenCode(JAXBElement<AcctReOpenCodeType> value) {
        this.acctReOpenCode = value;
    }

    /**
     * Gets the value of the fltSchedCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FltSchedCodeType }{@code >}
     *     
     */
    public JAXBElement<FltSchedCodeType> getFltSchedCode() {
        return fltSchedCode;
    }

    /**
     * Sets the value of the fltSchedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FltSchedCodeType }{@code >}
     *     
     */
    public void setFltSchedCode(JAXBElement<FltSchedCodeType> value) {
        this.fltSchedCode = value;
    }

    /**
     * Gets the value of the eftCardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTCardInfoCType }{@code >}
     *     
     */
    public JAXBElement<EFTCardInfoCType> getEFTCardInfo() {
        return eftCardInfo;
    }

    /**
     * Sets the value of the eftCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTCardInfoCType }{@code >}
     *     
     */
    public void setEFTCardInfo(JAXBElement<EFTCardInfoCType> value) {
        this.eftCardInfo = value;
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
     * Gets the value of the allowTrnActArray property.
     * 
     * @return
     *     possible object is
     *     {@link AllowTrnActArrayAType }
     *     
     */
    public AllowTrnActArrayAType getAllowTrnActArray() {
        return allowTrnActArray;
    }

    /**
     * Sets the value of the allowTrnActArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowTrnActArrayAType }
     *     
     */
    public void setAllowTrnActArray(AllowTrnActArrayAType value) {
        this.allowTrnActArray = value;
    }

    /**
     * Gets the value of the langType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LangTypeType }{@code >}
     *     
     */
    public JAXBElement<LangTypeType> getLangType() {
        return langType;
    }

    /**
     * Sets the value of the langType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LangTypeType }{@code >}
     *     
     */
    public void setLangType(JAXBElement<LangTypeType> value) {
        this.langType = value;
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
     * Gets the value of the crBureauRptCode property.
     * 
     * @return
     *     possible object is
     *     {@link CrBureauRptCodeType }
     *     
     */
    public CrBureauRptCodeType getCrBureauRptCode() {
        return crBureauRptCode;
    }

    /**
     * Sets the value of the crBureauRptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBureauRptCodeType }
     *     
     */
    public void setCrBureauRptCode(CrBureauRptCodeType value) {
        this.crBureauRptCode = value;
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
     * Gets the value of the estbPersonName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getEstbPersonName() {
        return estbPersonName;
    }

    /**
     * Sets the value of the estbPersonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setEstbPersonName(PersonNameCType value) {
        this.estbPersonName = value;
    }

    /**
     * Gets the value of the estbPersonTitle property.
     * 
     * @return
     *     possible object is
     *     {@link EmplTitleType }
     *     
     */
    public EmplTitleType getEstbPersonTitle() {
        return estbPersonTitle;
    }

    /**
     * Sets the value of the estbPersonTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplTitleType }
     *     
     */
    public void setEstbPersonTitle(EmplTitleType value) {
        this.estbPersonTitle = value;
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
     * Gets the value of the plnCvrgType property.
     * 
     * @return
     *     possible object is
     *     {@link PlnCvrgTypeType }
     *     
     */
    public PlnCvrgTypeType getPlnCvrgType() {
        return plnCvrgType;
    }

    /**
     * Sets the value of the plnCvrgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnCvrgTypeType }
     *     
     */
    public void setPlnCvrgType(PlnCvrgTypeType value) {
        this.plnCvrgType = value;
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
