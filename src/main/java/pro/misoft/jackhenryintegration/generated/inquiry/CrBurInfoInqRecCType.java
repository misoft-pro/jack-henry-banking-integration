
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
 * <p>Java class for CrBurInfoInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrBurInfoInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrBurInfo" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="ECOADesc" type="{http://jackhenry.com/jxchange/TPG/2008}ECOADesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BnkRptcyFileDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BnkRptcyFileDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurAddrRptDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurAddrRptDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurOccupDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OccupDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurTranDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurTranDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurCplDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurCplDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurAcctClsfDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurAcctClsfDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrClsfDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrClsfDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurActnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurActnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurSpecCmntDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurSpecCmntDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurPrtcpDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpDesc_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CrBurPmtRateDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurPmtRateDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="PmtExcpDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PmtExcpDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="CrBurFileMainDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurFileMainDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="OvrrdCrBurStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurStatDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CrBurInfoInqRec_CType", propOrder = {
    "crBurInfo",
    "accountId",
    "custId",
    "custName",
    "ecoaDesc",
    "bnkRptcyFileDesc",
    "crBurAddrRptDesc",
    "crBurOccupDesc",
    "crBurTranDesc",
    "crBurCplDesc",
    "crBurStatDesc",
    "crBurAcctClsfDesc",
    "crClsfDesc",
    "crBurActnDesc",
    "crBurSpecCmntDesc",
    "crBurPrtcpDesc",
    "ver1",
    "crBurPmtRateDesc",
    "pmtExcpDesc",
    "crBurFileMainDesc",
    "ver2",
    "ovrrdCrBurStatDesc",
    "ver3",
    "any"
})
public class CrBurInfoInqRecCType {

    @XmlElement(name = "CrBurInfo")
    protected CrBurInfoCType crBurInfo;
    @XmlElement(name = "AccountId", required = true)
    protected AccountIdCType accountId;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "CustName")
    protected PersonNameCType custName;
    @XmlElement(name = "ECOADesc")
    protected ECOADescType ecoaDesc;
    @XmlElement(name = "BnkRptcyFileDesc")
    protected BnkRptcyFileDescType bnkRptcyFileDesc;
    @XmlElement(name = "CrBurAddrRptDesc")
    protected CrBurAddrRptDescType crBurAddrRptDesc;
    @XmlElement(name = "CrBurOccupDesc")
    protected OccupDescType crBurOccupDesc;
    @XmlElement(name = "CrBurTranDesc")
    protected CrBurTranDescType crBurTranDesc;
    @XmlElement(name = "CrBurCplDesc")
    protected CrBurCplDescType crBurCplDesc;
    @XmlElement(name = "CrBurStatDesc")
    protected CrBurStatDescType crBurStatDesc;
    @XmlElement(name = "CrBurAcctClsfDesc")
    protected CrBurAcctClsfDescType crBurAcctClsfDesc;
    @XmlElement(name = "CrClsfDesc")
    protected CrClsfDescType crClsfDesc;
    @XmlElement(name = "CrBurActnDesc")
    protected CrBurActnDescType crBurActnDesc;
    @XmlElement(name = "CrBurSpecCmntDesc")
    protected CrBurSpecCmntDescType crBurSpecCmntDesc;
    @XmlElement(name = "CrBurPrtcpDesc")
    protected PrtcpDescType crBurPrtcpDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CrBurPmtRateDesc")
    protected CrBurPmtRateDescType crBurPmtRateDesc;
    @XmlElement(name = "PmtExcpDesc")
    protected PmtExcpDescType pmtExcpDesc;
    @XmlElement(name = "CrBurFileMainDesc")
    protected CrBurFileMainDescType crBurFileMainDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "OvrrdCrBurStatDesc")
    protected CrBurStatDescType ovrrdCrBurStatDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the crBurInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurInfoCType }
     *     
     */
    public CrBurInfoCType getCrBurInfo() {
        return crBurInfo;
    }

    /**
     * Sets the value of the crBurInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurInfoCType }
     *     
     */
    public void setCrBurInfo(CrBurInfoCType value) {
        this.crBurInfo = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setAccountId(AccountIdCType value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCustId(CustIdType value) {
        this.custId = value;
    }

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setCustName(PersonNameCType value) {
        this.custName = value;
    }

    /**
     * Gets the value of the ecoaDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ECOADescType }
     *     
     */
    public ECOADescType getECOADesc() {
        return ecoaDesc;
    }

    /**
     * Sets the value of the ecoaDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECOADescType }
     *     
     */
    public void setECOADesc(ECOADescType value) {
        this.ecoaDesc = value;
    }

    /**
     * Gets the value of the bnkRptcyFileDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BnkRptcyFileDescType }
     *     
     */
    public BnkRptcyFileDescType getBnkRptcyFileDesc() {
        return bnkRptcyFileDesc;
    }

    /**
     * Sets the value of the bnkRptcyFileDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BnkRptcyFileDescType }
     *     
     */
    public void setBnkRptcyFileDesc(BnkRptcyFileDescType value) {
        this.bnkRptcyFileDesc = value;
    }

    /**
     * Gets the value of the crBurAddrRptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurAddrRptDescType }
     *     
     */
    public CrBurAddrRptDescType getCrBurAddrRptDesc() {
        return crBurAddrRptDesc;
    }

    /**
     * Sets the value of the crBurAddrRptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurAddrRptDescType }
     *     
     */
    public void setCrBurAddrRptDesc(CrBurAddrRptDescType value) {
        this.crBurAddrRptDesc = value;
    }

    /**
     * Gets the value of the crBurOccupDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OccupDescType }
     *     
     */
    public OccupDescType getCrBurOccupDesc() {
        return crBurOccupDesc;
    }

    /**
     * Sets the value of the crBurOccupDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupDescType }
     *     
     */
    public void setCrBurOccupDesc(OccupDescType value) {
        this.crBurOccupDesc = value;
    }

    /**
     * Gets the value of the crBurTranDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurTranDescType }
     *     
     */
    public CrBurTranDescType getCrBurTranDesc() {
        return crBurTranDesc;
    }

    /**
     * Sets the value of the crBurTranDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurTranDescType }
     *     
     */
    public void setCrBurTranDesc(CrBurTranDescType value) {
        this.crBurTranDesc = value;
    }

    /**
     * Gets the value of the crBurCplDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurCplDescType }
     *     
     */
    public CrBurCplDescType getCrBurCplDesc() {
        return crBurCplDesc;
    }

    /**
     * Sets the value of the crBurCplDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurCplDescType }
     *     
     */
    public void setCrBurCplDesc(CrBurCplDescType value) {
        this.crBurCplDesc = value;
    }

    /**
     * Gets the value of the crBurStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurStatDescType }
     *     
     */
    public CrBurStatDescType getCrBurStatDesc() {
        return crBurStatDesc;
    }

    /**
     * Sets the value of the crBurStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurStatDescType }
     *     
     */
    public void setCrBurStatDesc(CrBurStatDescType value) {
        this.crBurStatDesc = value;
    }

    /**
     * Gets the value of the crBurAcctClsfDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurAcctClsfDescType }
     *     
     */
    public CrBurAcctClsfDescType getCrBurAcctClsfDesc() {
        return crBurAcctClsfDesc;
    }

    /**
     * Sets the value of the crBurAcctClsfDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurAcctClsfDescType }
     *     
     */
    public void setCrBurAcctClsfDesc(CrBurAcctClsfDescType value) {
        this.crBurAcctClsfDesc = value;
    }

    /**
     * Gets the value of the crClsfDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrClsfDescType }
     *     
     */
    public CrClsfDescType getCrClsfDesc() {
        return crClsfDesc;
    }

    /**
     * Sets the value of the crClsfDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrClsfDescType }
     *     
     */
    public void setCrClsfDesc(CrClsfDescType value) {
        this.crClsfDesc = value;
    }

    /**
     * Gets the value of the crBurActnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurActnDescType }
     *     
     */
    public CrBurActnDescType getCrBurActnDesc() {
        return crBurActnDesc;
    }

    /**
     * Sets the value of the crBurActnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurActnDescType }
     *     
     */
    public void setCrBurActnDesc(CrBurActnDescType value) {
        this.crBurActnDesc = value;
    }

    /**
     * Gets the value of the crBurSpecCmntDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurSpecCmntDescType }
     *     
     */
    public CrBurSpecCmntDescType getCrBurSpecCmntDesc() {
        return crBurSpecCmntDesc;
    }

    /**
     * Sets the value of the crBurSpecCmntDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurSpecCmntDescType }
     *     
     */
    public void setCrBurSpecCmntDesc(CrBurSpecCmntDescType value) {
        this.crBurSpecCmntDesc = value;
    }

    /**
     * Gets the value of the crBurPrtcpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrtcpDescType }
     *     
     */
    public PrtcpDescType getCrBurPrtcpDesc() {
        return crBurPrtcpDesc;
    }

    /**
     * Sets the value of the crBurPrtcpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtcpDescType }
     *     
     */
    public void setCrBurPrtcpDesc(PrtcpDescType value) {
        this.crBurPrtcpDesc = value;
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
     * Gets the value of the crBurPmtRateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurPmtRateDescType }
     *     
     */
    public CrBurPmtRateDescType getCrBurPmtRateDesc() {
        return crBurPmtRateDesc;
    }

    /**
     * Sets the value of the crBurPmtRateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurPmtRateDescType }
     *     
     */
    public void setCrBurPmtRateDesc(CrBurPmtRateDescType value) {
        this.crBurPmtRateDesc = value;
    }

    /**
     * Gets the value of the pmtExcpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PmtExcpDescType }
     *     
     */
    public PmtExcpDescType getPmtExcpDesc() {
        return pmtExcpDesc;
    }

    /**
     * Sets the value of the pmtExcpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtExcpDescType }
     *     
     */
    public void setPmtExcpDesc(PmtExcpDescType value) {
        this.pmtExcpDesc = value;
    }

    /**
     * Gets the value of the crBurFileMainDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurFileMainDescType }
     *     
     */
    public CrBurFileMainDescType getCrBurFileMainDesc() {
        return crBurFileMainDesc;
    }

    /**
     * Sets the value of the crBurFileMainDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurFileMainDescType }
     *     
     */
    public void setCrBurFileMainDesc(CrBurFileMainDescType value) {
        this.crBurFileMainDesc = value;
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
     * Gets the value of the ovrrdCrBurStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurStatDescType }
     *     
     */
    public CrBurStatDescType getOvrrdCrBurStatDesc() {
        return ovrrdCrBurStatDesc;
    }

    /**
     * Sets the value of the ovrrdCrBurStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurStatDescType }
     *     
     */
    public void setOvrrdCrBurStatDesc(CrBurStatDescType value) {
        this.ovrrdCrBurStatDesc = value;
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
