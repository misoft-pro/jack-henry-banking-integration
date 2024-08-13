
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
 * <p>Java class for LnDlrInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnDlrInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpfrntPct" type="{http://jackhenry.com/jxchange/TPG/2008}UpfrntPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="RemResrvPct" type="{http://jackhenry.com/jxchange/TPG/2008}RemResrvPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="RemResrvEarn" type="{http://jackhenry.com/jxchange/TPG/2008}RemResrvEarn_Type" minOccurs="0"/&gt;
 *         &lt;element name="RemResrvAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RemResrvAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RebateToBankDlr" type="{http://jackhenry.com/jxchange/TPG/2008}RebateToBankDlr_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtsToFrftOnChgoff" type="{http://jackhenry.com/jxchange/TPG/2008}PmtsToFrftOnChgoff_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtsToFrft" type="{http://jackhenry.com/jxchange/TPG/2008}PmtsToFrft_Type" minOccurs="0"/&gt;
 *         &lt;element name="PctRebateToChgoff" type="{http://jackhenry.com/jxchange/TPG/2008}PctRebateToChgoff_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntRebate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRebate_Type" minOccurs="0"/&gt;
 *         &lt;element name="FrftRebateOnPayoff" type="{http://jackhenry.com/jxchange/TPG/2008}FrftRebateOnPayoff_Type" minOccurs="0"/&gt;
 *         &lt;element name="FrftRebateIfChgoff" type="{http://jackhenry.com/jxchange/TPG/2008}FrftRebateIfChgoff_Type" minOccurs="0"/&gt;
 *         &lt;element name="FrftRebateAfterChgoff" type="{http://jackhenry.com/jxchange/TPG/2008}FrftRebateAfterChgoff_Type" minOccurs="0"/&gt;
 *         &lt;element name="FrftDiscAtPayoff" type="{http://jackhenry.com/jxchange/TPG/2008}FrftDiscAtPayoff_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlrUpfrntEarned" type="{http://jackhenry.com/jxchange/TPG/2008}DlrUpfrntEarned_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlrResrvAmt" type="{http://jackhenry.com/jxchange/TPG/2008}DlrResrvAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlrRebate" type="{http://jackhenry.com/jxchange/TPG/2008}DlrRebate_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlrRate" type="{http://jackhenry.com/jxchange/TPG/2008}DlrRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlrName" type="{http://jackhenry.com/jxchange/TPG/2008}DlrName_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlrLocId" type="{http://jackhenry.com/jxchange/TPG/2008}DlrLocId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlrId" type="{http://jackhenry.com/jxchange/TPG/2008}DlrId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlrEarnings" type="{http://jackhenry.com/jxchange/TPG/2008}DlrEarnings_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlrDisc" type="{http://jackhenry.com/jxchange/TPG/2008}DlrDisc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlrCode" type="{http://jackhenry.com/jxchange/TPG/2008}DlrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlrAccr" type="{http://jackhenry.com/jxchange/TPG/2008}DlrAccr_Type" minOccurs="0"/&gt;
 *         &lt;element name="DaysToFrftOnChgoff" type="{http://jackhenry.com/jxchange/TPG/2008}DaysToFrftOnChgoff_Type" minOccurs="0"/&gt;
 *         &lt;element name="DaysToFrft" type="{http://jackhenry.com/jxchange/TPG/2008}DaysToFrft_Type" minOccurs="0"/&gt;
 *         &lt;element name="BankIncmFrft" type="{http://jackhenry.com/jxchange/TPG/2008}BankIncmFrft_Type" minOccurs="0"/&gt;
 *         &lt;element name="BankDisc" type="{http://jackhenry.com/jxchange/TPG/2008}BankDisc_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="RecourseDay" type="{http://jackhenry.com/jxchange/TPG/2008}RecourseDay_Type" minOccurs="0"/&gt;
 *           &lt;element name="RecourseCode" type="{http://jackhenry.com/jxchange/TPG/2008}RecourseCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="RecoursePct" type="{http://jackhenry.com/jxchange/TPG/2008}RecoursePct_Type" minOccurs="0"/&gt;
 *           &lt;element name="RecourseTerm" type="{http://jackhenry.com/jxchange/TPG/2008}RecourseTerm_Type" minOccurs="0"/&gt;
 *           &lt;element name="RecourseTermUnit" type="{http://jackhenry.com/jxchange/TPG/2008}RecourseTermUnit_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LnDlrInfo_CType", propOrder = {
    "upfrntPct",
    "remResrvPct",
    "remResrvEarn",
    "remResrvAmt",
    "rebateToBankDlr",
    "pmtsToFrftOnChgoff",
    "pmtsToFrft",
    "pctRebateToChgoff",
    "intRebate",
    "frftRebateOnPayoff",
    "frftRebateIfChgoff",
    "frftRebateAfterChgoff",
    "frftDiscAtPayoff",
    "dlrUpfrntEarned",
    "dlrResrvAmt",
    "dlrRebate",
    "dlrRate",
    "dlrName",
    "dlrLocId",
    "dlrId",
    "dlrEarnings",
    "dlrDisc",
    "dlrCode",
    "dlrAccr",
    "daysToFrftOnChgoff",
    "daysToFrft",
    "bankIncmFrft",
    "bankDisc",
    "ver1",
    "recourseDay",
    "recourseCode",
    "recoursePct",
    "recourseTerm",
    "recourseTermUnit",
    "ver2",
    "any"
})
public class LnDlrInfoCType {

    @XmlElementRef(name = "UpfrntPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UpfrntPctType> upfrntPct;
    @XmlElementRef(name = "RemResrvPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RemResrvPctType> remResrvPct;
    @XmlElementRef(name = "RemResrvEarn", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RemResrvEarnType> remResrvEarn;
    @XmlElementRef(name = "RemResrvAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RemResrvAmtType> remResrvAmt;
    @XmlElementRef(name = "RebateToBankDlr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RebateToBankDlrType> rebateToBankDlr;
    @XmlElementRef(name = "PmtsToFrftOnChgoff", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtsToFrftOnChgoffType> pmtsToFrftOnChgoff;
    @XmlElementRef(name = "PmtsToFrft", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PmtsToFrftType> pmtsToFrft;
    @XmlElementRef(name = "PctRebateToChgoff", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PctRebateToChgoffType> pctRebateToChgoff;
    @XmlElementRef(name = "IntRebate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IntRebateType> intRebate;
    @XmlElementRef(name = "FrftRebateOnPayoff", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FrftRebateOnPayoffType> frftRebateOnPayoff;
    @XmlElementRef(name = "FrftRebateIfChgoff", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FrftRebateIfChgoffType> frftRebateIfChgoff;
    @XmlElementRef(name = "FrftRebateAfterChgoff", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FrftRebateAfterChgoffType> frftRebateAfterChgoff;
    @XmlElementRef(name = "FrftDiscAtPayoff", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FrftDiscAtPayoffType> frftDiscAtPayoff;
    @XmlElementRef(name = "DlrUpfrntEarned", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlrUpfrntEarnedType> dlrUpfrntEarned;
    @XmlElementRef(name = "DlrResrvAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlrResrvAmtType> dlrResrvAmt;
    @XmlElementRef(name = "DlrRebate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlrRebateType> dlrRebate;
    @XmlElementRef(name = "DlrRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlrRateType> dlrRate;
    @XmlElementRef(name = "DlrName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlrNameType> dlrName;
    @XmlElementRef(name = "DlrLocId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlrLocIdType> dlrLocId;
    @XmlElementRef(name = "DlrId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlrIdType> dlrId;
    @XmlElementRef(name = "DlrEarnings", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlrEarningsType> dlrEarnings;
    @XmlElementRef(name = "DlrDisc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlrDiscType> dlrDisc;
    @XmlElementRef(name = "DlrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlrCodeType> dlrCode;
    @XmlElementRef(name = "DlrAccr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlrAccrType> dlrAccr;
    @XmlElementRef(name = "DaysToFrftOnChgoff", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DaysToFrftOnChgoffType> daysToFrftOnChgoff;
    @XmlElementRef(name = "DaysToFrft", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DaysToFrftType> daysToFrft;
    @XmlElementRef(name = "BankIncmFrft", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BankIncmFrftType> bankIncmFrft;
    @XmlElementRef(name = "BankDisc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BankDiscType> bankDisc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "RecourseDay", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RecourseDayType> recourseDay;
    @XmlElementRef(name = "RecourseCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RecourseCodeType> recourseCode;
    @XmlElementRef(name = "RecoursePct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RecoursePctType> recoursePct;
    @XmlElementRef(name = "RecourseTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RecourseTermType> recourseTerm;
    @XmlElementRef(name = "RecourseTermUnit", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RecourseTermUnitType> recourseTermUnit;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the upfrntPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpfrntPctType }{@code >}
     *     
     */
    public JAXBElement<UpfrntPctType> getUpfrntPct() {
        return upfrntPct;
    }

    /**
     * Sets the value of the upfrntPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpfrntPctType }{@code >}
     *     
     */
    public void setUpfrntPct(JAXBElement<UpfrntPctType> value) {
        this.upfrntPct = value;
    }

    /**
     * Gets the value of the remResrvPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemResrvPctType }{@code >}
     *     
     */
    public JAXBElement<RemResrvPctType> getRemResrvPct() {
        return remResrvPct;
    }

    /**
     * Sets the value of the remResrvPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemResrvPctType }{@code >}
     *     
     */
    public void setRemResrvPct(JAXBElement<RemResrvPctType> value) {
        this.remResrvPct = value;
    }

    /**
     * Gets the value of the remResrvEarn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemResrvEarnType }{@code >}
     *     
     */
    public JAXBElement<RemResrvEarnType> getRemResrvEarn() {
        return remResrvEarn;
    }

    /**
     * Sets the value of the remResrvEarn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemResrvEarnType }{@code >}
     *     
     */
    public void setRemResrvEarn(JAXBElement<RemResrvEarnType> value) {
        this.remResrvEarn = value;
    }

    /**
     * Gets the value of the remResrvAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemResrvAmtType }{@code >}
     *     
     */
    public JAXBElement<RemResrvAmtType> getRemResrvAmt() {
        return remResrvAmt;
    }

    /**
     * Sets the value of the remResrvAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemResrvAmtType }{@code >}
     *     
     */
    public void setRemResrvAmt(JAXBElement<RemResrvAmtType> value) {
        this.remResrvAmt = value;
    }

    /**
     * Gets the value of the rebateToBankDlr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RebateToBankDlrType }{@code >}
     *     
     */
    public JAXBElement<RebateToBankDlrType> getRebateToBankDlr() {
        return rebateToBankDlr;
    }

    /**
     * Sets the value of the rebateToBankDlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RebateToBankDlrType }{@code >}
     *     
     */
    public void setRebateToBankDlr(JAXBElement<RebateToBankDlrType> value) {
        this.rebateToBankDlr = value;
    }

    /**
     * Gets the value of the pmtsToFrftOnChgoff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtsToFrftOnChgoffType }{@code >}
     *     
     */
    public JAXBElement<PmtsToFrftOnChgoffType> getPmtsToFrftOnChgoff() {
        return pmtsToFrftOnChgoff;
    }

    /**
     * Sets the value of the pmtsToFrftOnChgoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtsToFrftOnChgoffType }{@code >}
     *     
     */
    public void setPmtsToFrftOnChgoff(JAXBElement<PmtsToFrftOnChgoffType> value) {
        this.pmtsToFrftOnChgoff = value;
    }

    /**
     * Gets the value of the pmtsToFrft property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PmtsToFrftType }{@code >}
     *     
     */
    public JAXBElement<PmtsToFrftType> getPmtsToFrft() {
        return pmtsToFrft;
    }

    /**
     * Sets the value of the pmtsToFrft property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PmtsToFrftType }{@code >}
     *     
     */
    public void setPmtsToFrft(JAXBElement<PmtsToFrftType> value) {
        this.pmtsToFrft = value;
    }

    /**
     * Gets the value of the pctRebateToChgoff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PctRebateToChgoffType }{@code >}
     *     
     */
    public JAXBElement<PctRebateToChgoffType> getPctRebateToChgoff() {
        return pctRebateToChgoff;
    }

    /**
     * Sets the value of the pctRebateToChgoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PctRebateToChgoffType }{@code >}
     *     
     */
    public void setPctRebateToChgoff(JAXBElement<PctRebateToChgoffType> value) {
        this.pctRebateToChgoff = value;
    }

    /**
     * Gets the value of the intRebate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntRebateType }{@code >}
     *     
     */
    public JAXBElement<IntRebateType> getIntRebate() {
        return intRebate;
    }

    /**
     * Sets the value of the intRebate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntRebateType }{@code >}
     *     
     */
    public void setIntRebate(JAXBElement<IntRebateType> value) {
        this.intRebate = value;
    }

    /**
     * Gets the value of the frftRebateOnPayoff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FrftRebateOnPayoffType }{@code >}
     *     
     */
    public JAXBElement<FrftRebateOnPayoffType> getFrftRebateOnPayoff() {
        return frftRebateOnPayoff;
    }

    /**
     * Sets the value of the frftRebateOnPayoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FrftRebateOnPayoffType }{@code >}
     *     
     */
    public void setFrftRebateOnPayoff(JAXBElement<FrftRebateOnPayoffType> value) {
        this.frftRebateOnPayoff = value;
    }

    /**
     * Gets the value of the frftRebateIfChgoff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FrftRebateIfChgoffType }{@code >}
     *     
     */
    public JAXBElement<FrftRebateIfChgoffType> getFrftRebateIfChgoff() {
        return frftRebateIfChgoff;
    }

    /**
     * Sets the value of the frftRebateIfChgoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FrftRebateIfChgoffType }{@code >}
     *     
     */
    public void setFrftRebateIfChgoff(JAXBElement<FrftRebateIfChgoffType> value) {
        this.frftRebateIfChgoff = value;
    }

    /**
     * Gets the value of the frftRebateAfterChgoff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FrftRebateAfterChgoffType }{@code >}
     *     
     */
    public JAXBElement<FrftRebateAfterChgoffType> getFrftRebateAfterChgoff() {
        return frftRebateAfterChgoff;
    }

    /**
     * Sets the value of the frftRebateAfterChgoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FrftRebateAfterChgoffType }{@code >}
     *     
     */
    public void setFrftRebateAfterChgoff(JAXBElement<FrftRebateAfterChgoffType> value) {
        this.frftRebateAfterChgoff = value;
    }

    /**
     * Gets the value of the frftDiscAtPayoff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FrftDiscAtPayoffType }{@code >}
     *     
     */
    public JAXBElement<FrftDiscAtPayoffType> getFrftDiscAtPayoff() {
        return frftDiscAtPayoff;
    }

    /**
     * Sets the value of the frftDiscAtPayoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FrftDiscAtPayoffType }{@code >}
     *     
     */
    public void setFrftDiscAtPayoff(JAXBElement<FrftDiscAtPayoffType> value) {
        this.frftDiscAtPayoff = value;
    }

    /**
     * Gets the value of the dlrUpfrntEarned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlrUpfrntEarnedType }{@code >}
     *     
     */
    public JAXBElement<DlrUpfrntEarnedType> getDlrUpfrntEarned() {
        return dlrUpfrntEarned;
    }

    /**
     * Sets the value of the dlrUpfrntEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlrUpfrntEarnedType }{@code >}
     *     
     */
    public void setDlrUpfrntEarned(JAXBElement<DlrUpfrntEarnedType> value) {
        this.dlrUpfrntEarned = value;
    }

    /**
     * Gets the value of the dlrResrvAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlrResrvAmtType }{@code >}
     *     
     */
    public JAXBElement<DlrResrvAmtType> getDlrResrvAmt() {
        return dlrResrvAmt;
    }

    /**
     * Sets the value of the dlrResrvAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlrResrvAmtType }{@code >}
     *     
     */
    public void setDlrResrvAmt(JAXBElement<DlrResrvAmtType> value) {
        this.dlrResrvAmt = value;
    }

    /**
     * Gets the value of the dlrRebate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlrRebateType }{@code >}
     *     
     */
    public JAXBElement<DlrRebateType> getDlrRebate() {
        return dlrRebate;
    }

    /**
     * Sets the value of the dlrRebate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlrRebateType }{@code >}
     *     
     */
    public void setDlrRebate(JAXBElement<DlrRebateType> value) {
        this.dlrRebate = value;
    }

    /**
     * Gets the value of the dlrRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlrRateType }{@code >}
     *     
     */
    public JAXBElement<DlrRateType> getDlrRate() {
        return dlrRate;
    }

    /**
     * Sets the value of the dlrRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlrRateType }{@code >}
     *     
     */
    public void setDlrRate(JAXBElement<DlrRateType> value) {
        this.dlrRate = value;
    }

    /**
     * Gets the value of the dlrName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlrNameType }{@code >}
     *     
     */
    public JAXBElement<DlrNameType> getDlrName() {
        return dlrName;
    }

    /**
     * Sets the value of the dlrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlrNameType }{@code >}
     *     
     */
    public void setDlrName(JAXBElement<DlrNameType> value) {
        this.dlrName = value;
    }

    /**
     * Gets the value of the dlrLocId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlrLocIdType }{@code >}
     *     
     */
    public JAXBElement<DlrLocIdType> getDlrLocId() {
        return dlrLocId;
    }

    /**
     * Sets the value of the dlrLocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlrLocIdType }{@code >}
     *     
     */
    public void setDlrLocId(JAXBElement<DlrLocIdType> value) {
        this.dlrLocId = value;
    }

    /**
     * Gets the value of the dlrId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlrIdType }{@code >}
     *     
     */
    public JAXBElement<DlrIdType> getDlrId() {
        return dlrId;
    }

    /**
     * Sets the value of the dlrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlrIdType }{@code >}
     *     
     */
    public void setDlrId(JAXBElement<DlrIdType> value) {
        this.dlrId = value;
    }

    /**
     * Gets the value of the dlrEarnings property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlrEarningsType }{@code >}
     *     
     */
    public JAXBElement<DlrEarningsType> getDlrEarnings() {
        return dlrEarnings;
    }

    /**
     * Sets the value of the dlrEarnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlrEarningsType }{@code >}
     *     
     */
    public void setDlrEarnings(JAXBElement<DlrEarningsType> value) {
        this.dlrEarnings = value;
    }

    /**
     * Gets the value of the dlrDisc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlrDiscType }{@code >}
     *     
     */
    public JAXBElement<DlrDiscType> getDlrDisc() {
        return dlrDisc;
    }

    /**
     * Sets the value of the dlrDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlrDiscType }{@code >}
     *     
     */
    public void setDlrDisc(JAXBElement<DlrDiscType> value) {
        this.dlrDisc = value;
    }

    /**
     * Gets the value of the dlrCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlrCodeType }{@code >}
     *     
     */
    public JAXBElement<DlrCodeType> getDlrCode() {
        return dlrCode;
    }

    /**
     * Sets the value of the dlrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlrCodeType }{@code >}
     *     
     */
    public void setDlrCode(JAXBElement<DlrCodeType> value) {
        this.dlrCode = value;
    }

    /**
     * Gets the value of the dlrAccr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlrAccrType }{@code >}
     *     
     */
    public JAXBElement<DlrAccrType> getDlrAccr() {
        return dlrAccr;
    }

    /**
     * Sets the value of the dlrAccr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlrAccrType }{@code >}
     *     
     */
    public void setDlrAccr(JAXBElement<DlrAccrType> value) {
        this.dlrAccr = value;
    }

    /**
     * Gets the value of the daysToFrftOnChgoff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DaysToFrftOnChgoffType }{@code >}
     *     
     */
    public JAXBElement<DaysToFrftOnChgoffType> getDaysToFrftOnChgoff() {
        return daysToFrftOnChgoff;
    }

    /**
     * Sets the value of the daysToFrftOnChgoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DaysToFrftOnChgoffType }{@code >}
     *     
     */
    public void setDaysToFrftOnChgoff(JAXBElement<DaysToFrftOnChgoffType> value) {
        this.daysToFrftOnChgoff = value;
    }

    /**
     * Gets the value of the daysToFrft property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DaysToFrftType }{@code >}
     *     
     */
    public JAXBElement<DaysToFrftType> getDaysToFrft() {
        return daysToFrft;
    }

    /**
     * Sets the value of the daysToFrft property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DaysToFrftType }{@code >}
     *     
     */
    public void setDaysToFrft(JAXBElement<DaysToFrftType> value) {
        this.daysToFrft = value;
    }

    /**
     * Gets the value of the bankIncmFrft property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BankIncmFrftType }{@code >}
     *     
     */
    public JAXBElement<BankIncmFrftType> getBankIncmFrft() {
        return bankIncmFrft;
    }

    /**
     * Sets the value of the bankIncmFrft property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BankIncmFrftType }{@code >}
     *     
     */
    public void setBankIncmFrft(JAXBElement<BankIncmFrftType> value) {
        this.bankIncmFrft = value;
    }

    /**
     * Gets the value of the bankDisc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BankDiscType }{@code >}
     *     
     */
    public JAXBElement<BankDiscType> getBankDisc() {
        return bankDisc;
    }

    /**
     * Sets the value of the bankDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BankDiscType }{@code >}
     *     
     */
    public void setBankDisc(JAXBElement<BankDiscType> value) {
        this.bankDisc = value;
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
     * Gets the value of the recourseDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RecourseDayType }{@code >}
     *     
     */
    public JAXBElement<RecourseDayType> getRecourseDay() {
        return recourseDay;
    }

    /**
     * Sets the value of the recourseDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RecourseDayType }{@code >}
     *     
     */
    public void setRecourseDay(JAXBElement<RecourseDayType> value) {
        this.recourseDay = value;
    }

    /**
     * Gets the value of the recourseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RecourseCodeType }{@code >}
     *     
     */
    public JAXBElement<RecourseCodeType> getRecourseCode() {
        return recourseCode;
    }

    /**
     * Sets the value of the recourseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RecourseCodeType }{@code >}
     *     
     */
    public void setRecourseCode(JAXBElement<RecourseCodeType> value) {
        this.recourseCode = value;
    }

    /**
     * Gets the value of the recoursePct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RecoursePctType }{@code >}
     *     
     */
    public JAXBElement<RecoursePctType> getRecoursePct() {
        return recoursePct;
    }

    /**
     * Sets the value of the recoursePct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RecoursePctType }{@code >}
     *     
     */
    public void setRecoursePct(JAXBElement<RecoursePctType> value) {
        this.recoursePct = value;
    }

    /**
     * Gets the value of the recourseTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RecourseTermType }{@code >}
     *     
     */
    public JAXBElement<RecourseTermType> getRecourseTerm() {
        return recourseTerm;
    }

    /**
     * Sets the value of the recourseTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RecourseTermType }{@code >}
     *     
     */
    public void setRecourseTerm(JAXBElement<RecourseTermType> value) {
        this.recourseTerm = value;
    }

    /**
     * Gets the value of the recourseTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RecourseTermUnitType }{@code >}
     *     
     */
    public JAXBElement<RecourseTermUnitType> getRecourseTermUnit() {
        return recourseTermUnit;
    }

    /**
     * Sets the value of the recourseTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RecourseTermUnitType }{@code >}
     *     
     */
    public void setRecourseTermUnit(JAXBElement<RecourseTermUnitType> value) {
        this.recourseTermUnit = value;
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
