
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
 * <p>Java class for PlnCust_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlnCust_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BenfDistCode" type="{http://jackhenry.com/jxchange/TPG/2008}BenfDistCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DeathDistDt" type="{http://jackhenry.com/jxchange/TPG/2008}DeathDistDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DeathDist" type="{http://jackhenry.com/jxchange/TPG/2008}DeathDist_Type" minOccurs="0"/&gt;
 *         &lt;element name="FirstContrbDt" type="{http://jackhenry.com/jxchange/TPG/2008}FirstContrbDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigOwnCustId" type="{http://jackhenry.com/jxchange/TPG/2008}OrigOwnCustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigOwnBirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}OrigOwnBirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigOwnDeceaseDt" type="{http://jackhenry.com/jxchange/TPG/2008}OrigOwnDeceaseDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigOwnName" type="{http://jackhenry.com/jxchange/TPG/2008}OrigOwnName_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnEstbDt" type="{http://jackhenry.com/jxchange/TPG/2008}PlnEstbDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PlnFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnFeeCode" type="{http://jackhenry.com/jxchange/TPG/2008}PlnFeeCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="QRPCustId" type="{http://jackhenry.com/jxchange/TPG/2008}QRPCustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="QRPPlnId" type="{http://jackhenry.com/jxchange/TPG/2008}QRPPlnId_Type" minOccurs="0"/&gt;
 *         &lt;element name="SoleSpousBenf" type="{http://jackhenry.com/jxchange/TPG/2008}SoleSpousBenf_Type" minOccurs="0"/&gt;
 *         &lt;element name="SpousPlnCode" type="{http://jackhenry.com/jxchange/TPG/2008}SpousPlnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SpousSingleOwn" type="{http://jackhenry.com/jxchange/TPG/2008}SpousSingleOwn_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CntrbAmtPriorYTD" type="{http://jackhenry.com/jxchange/TPG/2008}CntrbAmtPriorYTD_Type" minOccurs="0"/&gt;
 *           &lt;element name="CntrbAmtYTD" type="{http://jackhenry.com/jxchange/TPG/2008}CntrbAmtYTD_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="PlanDistDeceasedDt" type="{http://jackhenry.com/jxchange/TPG/2008}DeceasedDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PlnCust_CType", propOrder = {
    "benfDistCode",
    "deathDistDt",
    "deathDist",
    "firstContrbDt",
    "origOwnCustId",
    "origOwnBirthDt",
    "origOwnDeceaseDt",
    "origOwnName",
    "plnEstbDt",
    "plnFeeAmt",
    "plnFeeCode",
    "qrpCustId",
    "qrpPlnId",
    "soleSpousBenf",
    "spousPlnCode",
    "spousSingleOwn",
    "ver1",
    "cntrbAmtPriorYTD",
    "cntrbAmtYTD",
    "ver2",
    "planDistDeceasedDt",
    "ver3",
    "any"
})
public class PlnCustCType {

    @XmlElementRef(name = "BenfDistCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfDistCodeType> benfDistCode;
    @XmlElementRef(name = "DeathDistDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DeathDistDtType> deathDistDt;
    @XmlElementRef(name = "DeathDist", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DeathDistType> deathDist;
    @XmlElementRef(name = "FirstContrbDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FirstContrbDtType> firstContrbDt;
    @XmlElementRef(name = "OrigOwnCustId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OrigOwnCustIdType> origOwnCustId;
    @XmlElementRef(name = "OrigOwnBirthDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OrigOwnBirthDtType> origOwnBirthDt;
    @XmlElementRef(name = "OrigOwnDeceaseDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OrigOwnDeceaseDtType> origOwnDeceaseDt;
    @XmlElementRef(name = "OrigOwnName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OrigOwnNameType> origOwnName;
    @XmlElementRef(name = "PlnEstbDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnEstbDtType> plnEstbDt;
    @XmlElementRef(name = "PlnFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnFeeAmtType> plnFeeAmt;
    @XmlElementRef(name = "PlnFeeCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PlnFeeCodeType> plnFeeCode;
    @XmlElementRef(name = "QRPCustId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<QRPCustIdType> qrpCustId;
    @XmlElementRef(name = "QRPPlnId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<QRPPlnIdType> qrpPlnId;
    @XmlElementRef(name = "SoleSpousBenf", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SoleSpousBenfType> soleSpousBenf;
    @XmlElementRef(name = "SpousPlnCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SpousPlnCodeType> spousPlnCode;
    @XmlElementRef(name = "SpousSingleOwn", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SpousSingleOwnType> spousSingleOwn;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "CntrbAmtPriorYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CntrbAmtPriorYTDType> cntrbAmtPriorYTD;
    @XmlElementRef(name = "CntrbAmtYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CntrbAmtYTDType> cntrbAmtYTD;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "PlanDistDeceasedDt")
    protected DeceasedDtType planDistDeceasedDt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the benfDistCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfDistCodeType }{@code >}
     *     
     */
    public JAXBElement<BenfDistCodeType> getBenfDistCode() {
        return benfDistCode;
    }

    /**
     * Sets the value of the benfDistCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfDistCodeType }{@code >}
     *     
     */
    public void setBenfDistCode(JAXBElement<BenfDistCodeType> value) {
        this.benfDistCode = value;
    }

    /**
     * Gets the value of the deathDistDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeathDistDtType }{@code >}
     *     
     */
    public JAXBElement<DeathDistDtType> getDeathDistDt() {
        return deathDistDt;
    }

    /**
     * Sets the value of the deathDistDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeathDistDtType }{@code >}
     *     
     */
    public void setDeathDistDt(JAXBElement<DeathDistDtType> value) {
        this.deathDistDt = value;
    }

    /**
     * Gets the value of the deathDist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DeathDistType }{@code >}
     *     
     */
    public JAXBElement<DeathDistType> getDeathDist() {
        return deathDist;
    }

    /**
     * Sets the value of the deathDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DeathDistType }{@code >}
     *     
     */
    public void setDeathDist(JAXBElement<DeathDistType> value) {
        this.deathDist = value;
    }

    /**
     * Gets the value of the firstContrbDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FirstContrbDtType }{@code >}
     *     
     */
    public JAXBElement<FirstContrbDtType> getFirstContrbDt() {
        return firstContrbDt;
    }

    /**
     * Sets the value of the firstContrbDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FirstContrbDtType }{@code >}
     *     
     */
    public void setFirstContrbDt(JAXBElement<FirstContrbDtType> value) {
        this.firstContrbDt = value;
    }

    /**
     * Gets the value of the origOwnCustId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrigOwnCustIdType }{@code >}
     *     
     */
    public JAXBElement<OrigOwnCustIdType> getOrigOwnCustId() {
        return origOwnCustId;
    }

    /**
     * Sets the value of the origOwnCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrigOwnCustIdType }{@code >}
     *     
     */
    public void setOrigOwnCustId(JAXBElement<OrigOwnCustIdType> value) {
        this.origOwnCustId = value;
    }

    /**
     * Gets the value of the origOwnBirthDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrigOwnBirthDtType }{@code >}
     *     
     */
    public JAXBElement<OrigOwnBirthDtType> getOrigOwnBirthDt() {
        return origOwnBirthDt;
    }

    /**
     * Sets the value of the origOwnBirthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrigOwnBirthDtType }{@code >}
     *     
     */
    public void setOrigOwnBirthDt(JAXBElement<OrigOwnBirthDtType> value) {
        this.origOwnBirthDt = value;
    }

    /**
     * Gets the value of the origOwnDeceaseDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrigOwnDeceaseDtType }{@code >}
     *     
     */
    public JAXBElement<OrigOwnDeceaseDtType> getOrigOwnDeceaseDt() {
        return origOwnDeceaseDt;
    }

    /**
     * Sets the value of the origOwnDeceaseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrigOwnDeceaseDtType }{@code >}
     *     
     */
    public void setOrigOwnDeceaseDt(JAXBElement<OrigOwnDeceaseDtType> value) {
        this.origOwnDeceaseDt = value;
    }

    /**
     * Gets the value of the origOwnName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OrigOwnNameType }{@code >}
     *     
     */
    public JAXBElement<OrigOwnNameType> getOrigOwnName() {
        return origOwnName;
    }

    /**
     * Sets the value of the origOwnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OrigOwnNameType }{@code >}
     *     
     */
    public void setOrigOwnName(JAXBElement<OrigOwnNameType> value) {
        this.origOwnName = value;
    }

    /**
     * Gets the value of the plnEstbDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnEstbDtType }{@code >}
     *     
     */
    public JAXBElement<PlnEstbDtType> getPlnEstbDt() {
        return plnEstbDt;
    }

    /**
     * Sets the value of the plnEstbDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnEstbDtType }{@code >}
     *     
     */
    public void setPlnEstbDt(JAXBElement<PlnEstbDtType> value) {
        this.plnEstbDt = value;
    }

    /**
     * Gets the value of the plnFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<PlnFeeAmtType> getPlnFeeAmt() {
        return plnFeeAmt;
    }

    /**
     * Sets the value of the plnFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnFeeAmtType }{@code >}
     *     
     */
    public void setPlnFeeAmt(JAXBElement<PlnFeeAmtType> value) {
        this.plnFeeAmt = value;
    }

    /**
     * Gets the value of the plnFeeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlnFeeCodeType }{@code >}
     *     
     */
    public JAXBElement<PlnFeeCodeType> getPlnFeeCode() {
        return plnFeeCode;
    }

    /**
     * Sets the value of the plnFeeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlnFeeCodeType }{@code >}
     *     
     */
    public void setPlnFeeCode(JAXBElement<PlnFeeCodeType> value) {
        this.plnFeeCode = value;
    }

    /**
     * Gets the value of the qrpCustId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QRPCustIdType }{@code >}
     *     
     */
    public JAXBElement<QRPCustIdType> getQRPCustId() {
        return qrpCustId;
    }

    /**
     * Sets the value of the qrpCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QRPCustIdType }{@code >}
     *     
     */
    public void setQRPCustId(JAXBElement<QRPCustIdType> value) {
        this.qrpCustId = value;
    }

    /**
     * Gets the value of the qrpPlnId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QRPPlnIdType }{@code >}
     *     
     */
    public JAXBElement<QRPPlnIdType> getQRPPlnId() {
        return qrpPlnId;
    }

    /**
     * Sets the value of the qrpPlnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QRPPlnIdType }{@code >}
     *     
     */
    public void setQRPPlnId(JAXBElement<QRPPlnIdType> value) {
        this.qrpPlnId = value;
    }

    /**
     * Gets the value of the soleSpousBenf property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SoleSpousBenfType }{@code >}
     *     
     */
    public JAXBElement<SoleSpousBenfType> getSoleSpousBenf() {
        return soleSpousBenf;
    }

    /**
     * Sets the value of the soleSpousBenf property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SoleSpousBenfType }{@code >}
     *     
     */
    public void setSoleSpousBenf(JAXBElement<SoleSpousBenfType> value) {
        this.soleSpousBenf = value;
    }

    /**
     * Gets the value of the spousPlnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SpousPlnCodeType }{@code >}
     *     
     */
    public JAXBElement<SpousPlnCodeType> getSpousPlnCode() {
        return spousPlnCode;
    }

    /**
     * Sets the value of the spousPlnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SpousPlnCodeType }{@code >}
     *     
     */
    public void setSpousPlnCode(JAXBElement<SpousPlnCodeType> value) {
        this.spousPlnCode = value;
    }

    /**
     * Gets the value of the spousSingleOwn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SpousSingleOwnType }{@code >}
     *     
     */
    public JAXBElement<SpousSingleOwnType> getSpousSingleOwn() {
        return spousSingleOwn;
    }

    /**
     * Sets the value of the spousSingleOwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SpousSingleOwnType }{@code >}
     *     
     */
    public void setSpousSingleOwn(JAXBElement<SpousSingleOwnType> value) {
        this.spousSingleOwn = value;
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
     * Gets the value of the cntrbAmtPriorYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CntrbAmtPriorYTDType }{@code >}
     *     
     */
    public JAXBElement<CntrbAmtPriorYTDType> getCntrbAmtPriorYTD() {
        return cntrbAmtPriorYTD;
    }

    /**
     * Sets the value of the cntrbAmtPriorYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CntrbAmtPriorYTDType }{@code >}
     *     
     */
    public void setCntrbAmtPriorYTD(JAXBElement<CntrbAmtPriorYTDType> value) {
        this.cntrbAmtPriorYTD = value;
    }

    /**
     * Gets the value of the cntrbAmtYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CntrbAmtYTDType }{@code >}
     *     
     */
    public JAXBElement<CntrbAmtYTDType> getCntrbAmtYTD() {
        return cntrbAmtYTD;
    }

    /**
     * Sets the value of the cntrbAmtYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CntrbAmtYTDType }{@code >}
     *     
     */
    public void setCntrbAmtYTD(JAXBElement<CntrbAmtYTDType> value) {
        this.cntrbAmtYTD = value;
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
     * Gets the value of the planDistDeceasedDt property.
     * 
     * @return
     *     possible object is
     *     {@link DeceasedDtType }
     *     
     */
    public DeceasedDtType getPlanDistDeceasedDt() {
        return planDistDeceasedDt;
    }

    /**
     * Sets the value of the planDistDeceasedDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeceasedDtType }
     *     
     */
    public void setPlanDistDeceasedDt(DeceasedDtType value) {
        this.planDistDeceasedDt = value;
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
