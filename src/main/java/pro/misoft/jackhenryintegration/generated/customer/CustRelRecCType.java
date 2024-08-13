
package pro.misoft.jackhenryintegration.generated.customer;

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
 * <p>Java class for CustRelRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustRelRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctRelCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctRelCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CopyRelCustMail" type="{http://jackhenry.com/jxchange/TPG/2008}CopyRelCustMail_Type" minOccurs="0"/&gt;
 *         &lt;element name="PctOwned" type="{http://jackhenry.com/jxchange/TPG/2008}PctOwned_Type" minOccurs="0"/&gt;
 *         &lt;element name="AmtOwned" type="{http://jackhenry.com/jxchange/TPG/2008}AmtOwned_Type" minOccurs="0"/&gt;
 *         &lt;element name="FDICCat" type="{http://jackhenry.com/jxchange/TPG/2008}FDICCat_Type" minOccurs="0"/&gt;
 *         &lt;element name="OvrFDICInsurLmt" type="{http://jackhenry.com/jxchange/TPG/2008}OvrFDICInsurLmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FDICMrgAcct" type="{http://jackhenry.com/jxchange/TPG/2008}FDICMrgAcct_Type" minOccurs="0"/&gt;
 *         &lt;element name="FDICMrgDt" type="{http://jackhenry.com/jxchange/TPG/2008}FDICMrgDt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PrtPastDueNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtPastDueNotCode_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="StopACHItems" type="{http://jackhenry.com/jxchange/TPG/2008}StopACHItems_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="LegalEntityId" type="{http://jackhenry.com/jxchange/TPG/2008}LegalEntityId_Type" minOccurs="0"/&gt;
 *               &lt;element name="IdVerifyBy" type="{http://jackhenry.com/jxchange/TPG/2008}IdVerifyBy_Type" minOccurs="0"/&gt;
 *               &lt;element name="IdVerifyRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}IdVerifyRsnCode_Type" minOccurs="0"/&gt;
 *               &lt;element name="VerifyDt" type="{http://jackhenry.com/jxchange/TPG/2008}VerifyDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CustRelRec_CType", propOrder = {
    "acctRelCode",
    "copyRelCustMail",
    "pctOwned",
    "amtOwned",
    "fdicCat",
    "ovrFDICInsurLmt",
    "fdicMrgAcct",
    "fdicMrgDt",
    "ver1",
    "prtPastDueNotCode",
    "ver2",
    "stopACHItems",
    "ver3",
    "legalEntityId",
    "idVerifyBy",
    "idVerifyRsnCode",
    "verifyDt",
    "ver4",
    "any"
})
public class CustRelRecCType {

    @XmlElementRef(name = "AcctRelCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctRelCodeType> acctRelCode;
    @XmlElementRef(name = "CopyRelCustMail", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CopyRelCustMailType> copyRelCustMail;
    @XmlElementRef(name = "PctOwned", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PctOwnedType> pctOwned;
    @XmlElementRef(name = "AmtOwned", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AmtOwnedType> amtOwned;
    @XmlElementRef(name = "FDICCat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FDICCatType> fdicCat;
    @XmlElementRef(name = "OvrFDICInsurLmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OvrFDICInsurLmtType> ovrFDICInsurLmt;
    @XmlElementRef(name = "FDICMrgAcct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FDICMrgAcctType> fdicMrgAcct;
    @XmlElementRef(name = "FDICMrgDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FDICMrgDtType> fdicMrgDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PrtPastDueNotCode")
    protected PrtPastDueNotCodeType prtPastDueNotCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "StopACHItems")
    protected StopACHItemsType stopACHItems;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "LegalEntityId")
    protected LegalEntityIdType legalEntityId;
    @XmlElement(name = "IdVerifyBy")
    protected IdVerifyByType idVerifyBy;
    @XmlElement(name = "IdVerifyRsnCode")
    protected IdVerifyRsnCodeType idVerifyRsnCode;
    @XmlElement(name = "VerifyDt")
    protected VerifyDtType verifyDt;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the acctRelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctRelCodeType }{@code >}
     *     
     */
    public JAXBElement<AcctRelCodeType> getAcctRelCode() {
        return acctRelCode;
    }

    /**
     * Sets the value of the acctRelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctRelCodeType }{@code >}
     *     
     */
    public void setAcctRelCode(JAXBElement<AcctRelCodeType> value) {
        this.acctRelCode = value;
    }

    /**
     * Gets the value of the copyRelCustMail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CopyRelCustMailType }{@code >}
     *     
     */
    public JAXBElement<CopyRelCustMailType> getCopyRelCustMail() {
        return copyRelCustMail;
    }

    /**
     * Sets the value of the copyRelCustMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CopyRelCustMailType }{@code >}
     *     
     */
    public void setCopyRelCustMail(JAXBElement<CopyRelCustMailType> value) {
        this.copyRelCustMail = value;
    }

    /**
     * Gets the value of the pctOwned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PctOwnedType }{@code >}
     *     
     */
    public JAXBElement<PctOwnedType> getPctOwned() {
        return pctOwned;
    }

    /**
     * Sets the value of the pctOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PctOwnedType }{@code >}
     *     
     */
    public void setPctOwned(JAXBElement<PctOwnedType> value) {
        this.pctOwned = value;
    }

    /**
     * Gets the value of the amtOwned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmtOwnedType }{@code >}
     *     
     */
    public JAXBElement<AmtOwnedType> getAmtOwned() {
        return amtOwned;
    }

    /**
     * Sets the value of the amtOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmtOwnedType }{@code >}
     *     
     */
    public void setAmtOwned(JAXBElement<AmtOwnedType> value) {
        this.amtOwned = value;
    }

    /**
     * Gets the value of the fdicCat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FDICCatType }{@code >}
     *     
     */
    public JAXBElement<FDICCatType> getFDICCat() {
        return fdicCat;
    }

    /**
     * Sets the value of the fdicCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FDICCatType }{@code >}
     *     
     */
    public void setFDICCat(JAXBElement<FDICCatType> value) {
        this.fdicCat = value;
    }

    /**
     * Gets the value of the ovrFDICInsurLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OvrFDICInsurLmtType }{@code >}
     *     
     */
    public JAXBElement<OvrFDICInsurLmtType> getOvrFDICInsurLmt() {
        return ovrFDICInsurLmt;
    }

    /**
     * Sets the value of the ovrFDICInsurLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OvrFDICInsurLmtType }{@code >}
     *     
     */
    public void setOvrFDICInsurLmt(JAXBElement<OvrFDICInsurLmtType> value) {
        this.ovrFDICInsurLmt = value;
    }

    /**
     * Gets the value of the fdicMrgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FDICMrgAcctType }{@code >}
     *     
     */
    public JAXBElement<FDICMrgAcctType> getFDICMrgAcct() {
        return fdicMrgAcct;
    }

    /**
     * Sets the value of the fdicMrgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FDICMrgAcctType }{@code >}
     *     
     */
    public void setFDICMrgAcct(JAXBElement<FDICMrgAcctType> value) {
        this.fdicMrgAcct = value;
    }

    /**
     * Gets the value of the fdicMrgDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FDICMrgDtType }{@code >}
     *     
     */
    public JAXBElement<FDICMrgDtType> getFDICMrgDt() {
        return fdicMrgDt;
    }

    /**
     * Sets the value of the fdicMrgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FDICMrgDtType }{@code >}
     *     
     */
    public void setFDICMrgDt(JAXBElement<FDICMrgDtType> value) {
        this.fdicMrgDt = value;
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
     * Gets the value of the prtPastDueNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrtPastDueNotCodeType }
     *     
     */
    public PrtPastDueNotCodeType getPrtPastDueNotCode() {
        return prtPastDueNotCode;
    }

    /**
     * Sets the value of the prtPastDueNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtPastDueNotCodeType }
     *     
     */
    public void setPrtPastDueNotCode(PrtPastDueNotCodeType value) {
        this.prtPastDueNotCode = value;
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
     * Gets the value of the stopACHItems property.
     * 
     * @return
     *     possible object is
     *     {@link StopACHItemsType }
     *     
     */
    public StopACHItemsType getStopACHItems() {
        return stopACHItems;
    }

    /**
     * Sets the value of the stopACHItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link StopACHItemsType }
     *     
     */
    public void setStopACHItems(StopACHItemsType value) {
        this.stopACHItems = value;
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
     * Gets the value of the legalEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityIdType }
     *     
     */
    public LegalEntityIdType getLegalEntityId() {
        return legalEntityId;
    }

    /**
     * Sets the value of the legalEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityIdType }
     *     
     */
    public void setLegalEntityId(LegalEntityIdType value) {
        this.legalEntityId = value;
    }

    /**
     * Gets the value of the idVerifyBy property.
     * 
     * @return
     *     possible object is
     *     {@link IdVerifyByType }
     *     
     */
    public IdVerifyByType getIdVerifyBy() {
        return idVerifyBy;
    }

    /**
     * Sets the value of the idVerifyBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdVerifyByType }
     *     
     */
    public void setIdVerifyBy(IdVerifyByType value) {
        this.idVerifyBy = value;
    }

    /**
     * Gets the value of the idVerifyRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link IdVerifyRsnCodeType }
     *     
     */
    public IdVerifyRsnCodeType getIdVerifyRsnCode() {
        return idVerifyRsnCode;
    }

    /**
     * Sets the value of the idVerifyRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdVerifyRsnCodeType }
     *     
     */
    public void setIdVerifyRsnCode(IdVerifyRsnCodeType value) {
        this.idVerifyRsnCode = value;
    }

    /**
     * Gets the value of the verifyDt property.
     * 
     * @return
     *     possible object is
     *     {@link VerifyDtType }
     *     
     */
    public VerifyDtType getVerifyDt() {
        return verifyDt;
    }

    /**
     * Sets the value of the verifyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyDtType }
     *     
     */
    public void setVerifyDt(VerifyDtType value) {
        this.verifyDt = value;
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
