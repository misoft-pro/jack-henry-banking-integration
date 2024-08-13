
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
 * <p>Java class for LnSvcTaxInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnSvcTaxInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcInv1099Rpt" type="{http://jackhenry.com/jxchange/TPG/2008}SvcInv1099Rpt_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvFedWithAmt" type="{http://jackhenry.com/jxchange/TPG/2008}InvFedWithAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvStateWithAmt" type="{http://jackhenry.com/jxchange/TPG/2008}InvStateWithAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvAltWithAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}InvAltWithAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvAltWithAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}InvAltWithAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvFedWithAltRate" type="{http://jackhenry.com/jxchange/TPG/2008}InvFedWithAltRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvStateWithAltRate" type="{http://jackhenry.com/jxchange/TPG/2008}InvStateWithAltRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvWithEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}InvWithEffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvFedWithLastYr" type="{http://jackhenry.com/jxchange/TPG/2008}InvFedWithLastYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvStateWithLastYr" type="{http://jackhenry.com/jxchange/TPG/2008}InvStateWithLastYr_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnSvcTaxInfo_CType", propOrder = {
    "svcInv1099Rpt",
    "invFedWithAmt",
    "invStateWithAmt",
    "invAltWithAcctId",
    "invAltWithAcctType",
    "invFedWithAltRate",
    "invStateWithAltRate",
    "invWithEffDt",
    "invFedWithLastYr",
    "invStateWithLastYr",
    "ver1",
    "any"
})
public class LnSvcTaxInfoCType {

    @XmlElement(name = "SvcInv1099Rpt")
    protected SvcInv1099RptType svcInv1099Rpt;
    @XmlElement(name = "InvFedWithAmt")
    protected InvFedWithAmtType invFedWithAmt;
    @XmlElement(name = "InvStateWithAmt")
    protected InvStateWithAmtType invStateWithAmt;
    @XmlElement(name = "InvAltWithAcctId")
    protected InvAltWithAcctIdType invAltWithAcctId;
    @XmlElement(name = "InvAltWithAcctType")
    protected InvAltWithAcctTypeType invAltWithAcctType;
    @XmlElement(name = "InvFedWithAltRate")
    protected InvFedWithAltRateType invFedWithAltRate;
    @XmlElement(name = "InvStateWithAltRate")
    protected InvStateWithAltRateType invStateWithAltRate;
    @XmlElement(name = "InvWithEffDt")
    protected InvWithEffDtType invWithEffDt;
    @XmlElement(name = "InvFedWithLastYr")
    protected InvFedWithLastYrType invFedWithLastYr;
    @XmlElement(name = "InvStateWithLastYr")
    protected InvStateWithLastYrType invStateWithLastYr;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the svcInv1099Rpt property.
     * 
     * @return
     *     possible object is
     *     {@link SvcInv1099RptType }
     *     
     */
    public SvcInv1099RptType getSvcInv1099Rpt() {
        return svcInv1099Rpt;
    }

    /**
     * Sets the value of the svcInv1099Rpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcInv1099RptType }
     *     
     */
    public void setSvcInv1099Rpt(SvcInv1099RptType value) {
        this.svcInv1099Rpt = value;
    }

    /**
     * Gets the value of the invFedWithAmt property.
     * 
     * @return
     *     possible object is
     *     {@link InvFedWithAmtType }
     *     
     */
    public InvFedWithAmtType getInvFedWithAmt() {
        return invFedWithAmt;
    }

    /**
     * Sets the value of the invFedWithAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvFedWithAmtType }
     *     
     */
    public void setInvFedWithAmt(InvFedWithAmtType value) {
        this.invFedWithAmt = value;
    }

    /**
     * Gets the value of the invStateWithAmt property.
     * 
     * @return
     *     possible object is
     *     {@link InvStateWithAmtType }
     *     
     */
    public InvStateWithAmtType getInvStateWithAmt() {
        return invStateWithAmt;
    }

    /**
     * Sets the value of the invStateWithAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvStateWithAmtType }
     *     
     */
    public void setInvStateWithAmt(InvStateWithAmtType value) {
        this.invStateWithAmt = value;
    }

    /**
     * Gets the value of the invAltWithAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link InvAltWithAcctIdType }
     *     
     */
    public InvAltWithAcctIdType getInvAltWithAcctId() {
        return invAltWithAcctId;
    }

    /**
     * Sets the value of the invAltWithAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvAltWithAcctIdType }
     *     
     */
    public void setInvAltWithAcctId(InvAltWithAcctIdType value) {
        this.invAltWithAcctId = value;
    }

    /**
     * Gets the value of the invAltWithAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link InvAltWithAcctTypeType }
     *     
     */
    public InvAltWithAcctTypeType getInvAltWithAcctType() {
        return invAltWithAcctType;
    }

    /**
     * Sets the value of the invAltWithAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvAltWithAcctTypeType }
     *     
     */
    public void setInvAltWithAcctType(InvAltWithAcctTypeType value) {
        this.invAltWithAcctType = value;
    }

    /**
     * Gets the value of the invFedWithAltRate property.
     * 
     * @return
     *     possible object is
     *     {@link InvFedWithAltRateType }
     *     
     */
    public InvFedWithAltRateType getInvFedWithAltRate() {
        return invFedWithAltRate;
    }

    /**
     * Sets the value of the invFedWithAltRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvFedWithAltRateType }
     *     
     */
    public void setInvFedWithAltRate(InvFedWithAltRateType value) {
        this.invFedWithAltRate = value;
    }

    /**
     * Gets the value of the invStateWithAltRate property.
     * 
     * @return
     *     possible object is
     *     {@link InvStateWithAltRateType }
     *     
     */
    public InvStateWithAltRateType getInvStateWithAltRate() {
        return invStateWithAltRate;
    }

    /**
     * Sets the value of the invStateWithAltRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvStateWithAltRateType }
     *     
     */
    public void setInvStateWithAltRate(InvStateWithAltRateType value) {
        this.invStateWithAltRate = value;
    }

    /**
     * Gets the value of the invWithEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link InvWithEffDtType }
     *     
     */
    public InvWithEffDtType getInvWithEffDt() {
        return invWithEffDt;
    }

    /**
     * Sets the value of the invWithEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvWithEffDtType }
     *     
     */
    public void setInvWithEffDt(InvWithEffDtType value) {
        this.invWithEffDt = value;
    }

    /**
     * Gets the value of the invFedWithLastYr property.
     * 
     * @return
     *     possible object is
     *     {@link InvFedWithLastYrType }
     *     
     */
    public InvFedWithLastYrType getInvFedWithLastYr() {
        return invFedWithLastYr;
    }

    /**
     * Sets the value of the invFedWithLastYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvFedWithLastYrType }
     *     
     */
    public void setInvFedWithLastYr(InvFedWithLastYrType value) {
        this.invFedWithLastYr = value;
    }

    /**
     * Gets the value of the invStateWithLastYr property.
     * 
     * @return
     *     possible object is
     *     {@link InvStateWithLastYrType }
     *     
     */
    public InvStateWithLastYrType getInvStateWithLastYr() {
        return invStateWithLastYr;
    }

    /**
     * Sets the value of the invStateWithLastYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvStateWithLastYrType }
     *     
     */
    public void setInvStateWithLastYr(InvStateWithLastYrType value) {
        this.invStateWithLastYr = value;
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
