
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
 * <p>Java class for TranchePmtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranchePmtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SplitPmtAsBil" type="{http://jackhenry.com/jxchange/TPG/2008}SplitPmtAsBil_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinBilAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MinBilAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilLeadDays" type="{http://jackhenry.com/jxchange/TPG/2008}BilLeadDays_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrtBilDOM" type="{http://jackhenry.com/jxchange/TPG/2008}CrtBilDOM_Type" minOccurs="0"/&gt;
 *         &lt;element name="NegAmrtzCapPct" type="{http://jackhenry.com/jxchange/TPG/2008}NegAmrtzCapPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtReAmrtzCap" type="{http://jackhenry.com/jxchange/TPG/2008}PmtReAmrtzCap_Type" minOccurs="0"/&gt;
 *         &lt;element name="FundSeqId" type="{http://jackhenry.com/jxchange/TPG/2008}FundSeqId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TranchePmtInfo_CType", propOrder = {
    "splitPmtAsBil",
    "minBilAmt",
    "bilLeadDays",
    "crtBilDOM",
    "negAmrtzCapPct",
    "pmtReAmrtzCap",
    "fundSeqId",
    "custom",
    "ver1",
    "any"
})
public class TranchePmtInfoCType {

    @XmlElement(name = "SplitPmtAsBil")
    protected SplitPmtAsBilType splitPmtAsBil;
    @XmlElement(name = "MinBilAmt")
    protected MinBilAmtType minBilAmt;
    @XmlElement(name = "BilLeadDays")
    protected BilLeadDaysType bilLeadDays;
    @XmlElement(name = "CrtBilDOM")
    protected CrtBilDOMType crtBilDOM;
    @XmlElement(name = "NegAmrtzCapPct")
    protected NegAmrtzCapPctType negAmrtzCapPct;
    @XmlElement(name = "PmtReAmrtzCap")
    protected PmtReAmrtzCapType pmtReAmrtzCap;
    @XmlElement(name = "FundSeqId")
    protected FundSeqIdType fundSeqId;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the splitPmtAsBil property.
     * 
     * @return
     *     possible object is
     *     {@link SplitPmtAsBilType }
     *     
     */
    public SplitPmtAsBilType getSplitPmtAsBil() {
        return splitPmtAsBil;
    }

    /**
     * Sets the value of the splitPmtAsBil property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitPmtAsBilType }
     *     
     */
    public void setSplitPmtAsBil(SplitPmtAsBilType value) {
        this.splitPmtAsBil = value;
    }

    /**
     * Gets the value of the minBilAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MinBilAmtType }
     *     
     */
    public MinBilAmtType getMinBilAmt() {
        return minBilAmt;
    }

    /**
     * Sets the value of the minBilAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinBilAmtType }
     *     
     */
    public void setMinBilAmt(MinBilAmtType value) {
        this.minBilAmt = value;
    }

    /**
     * Gets the value of the bilLeadDays property.
     * 
     * @return
     *     possible object is
     *     {@link BilLeadDaysType }
     *     
     */
    public BilLeadDaysType getBilLeadDays() {
        return bilLeadDays;
    }

    /**
     * Sets the value of the bilLeadDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilLeadDaysType }
     *     
     */
    public void setBilLeadDays(BilLeadDaysType value) {
        this.bilLeadDays = value;
    }

    /**
     * Gets the value of the crtBilDOM property.
     * 
     * @return
     *     possible object is
     *     {@link CrtBilDOMType }
     *     
     */
    public CrtBilDOMType getCrtBilDOM() {
        return crtBilDOM;
    }

    /**
     * Sets the value of the crtBilDOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrtBilDOMType }
     *     
     */
    public void setCrtBilDOM(CrtBilDOMType value) {
        this.crtBilDOM = value;
    }

    /**
     * Gets the value of the negAmrtzCapPct property.
     * 
     * @return
     *     possible object is
     *     {@link NegAmrtzCapPctType }
     *     
     */
    public NegAmrtzCapPctType getNegAmrtzCapPct() {
        return negAmrtzCapPct;
    }

    /**
     * Sets the value of the negAmrtzCapPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link NegAmrtzCapPctType }
     *     
     */
    public void setNegAmrtzCapPct(NegAmrtzCapPctType value) {
        this.negAmrtzCapPct = value;
    }

    /**
     * Gets the value of the pmtReAmrtzCap property.
     * 
     * @return
     *     possible object is
     *     {@link PmtReAmrtzCapType }
     *     
     */
    public PmtReAmrtzCapType getPmtReAmrtzCap() {
        return pmtReAmrtzCap;
    }

    /**
     * Sets the value of the pmtReAmrtzCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtReAmrtzCapType }
     *     
     */
    public void setPmtReAmrtzCap(PmtReAmrtzCapType value) {
        this.pmtReAmrtzCap = value;
    }

    /**
     * Gets the value of the fundSeqId property.
     * 
     * @return
     *     possible object is
     *     {@link FundSeqIdType }
     *     
     */
    public FundSeqIdType getFundSeqId() {
        return fundSeqId;
    }

    /**
     * Sets the value of the fundSeqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundSeqIdType }
     *     
     */
    public void setFundSeqId(FundSeqIdType value) {
        this.fundSeqId = value;
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
