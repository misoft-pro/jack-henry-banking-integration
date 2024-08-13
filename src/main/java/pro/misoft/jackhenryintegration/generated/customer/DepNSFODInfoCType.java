
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
 * <p>Java class for DepNSFODInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepNSFODInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ODLmt" type="{http://jackhenry.com/jxchange/TPG/2008}ODLmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODPrvlgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ODPrvlgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AutoNSFFee" type="{http://jackhenry.com/jxchange/TPG/2008}AutoNSFFee_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConsDaysNSF" type="{http://jackhenry.com/jxchange/TPG/2008}ConsDaysNSF_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConsDaysOD" type="{http://jackhenry.com/jxchange/TPG/2008}ConsDaysOD_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConsDaysRet" type="{http://jackhenry.com/jxchange/TPG/2008}ConsDaysRet_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastODDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastODDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODStat" type="{http://jackhenry.com/jxchange/TPG/2008}ODStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODItemsYTD" type="{http://jackhenry.com/jxchange/TPG/2008}ODItemsYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODTimesYTD" type="{http://jackhenry.com/jxchange/TPG/2008}ODTimesYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="NSFItemsYTD" type="{http://jackhenry.com/jxchange/TPG/2008}NSFItemsYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="NSFTimesYTD" type="{http://jackhenry.com/jxchange/TPG/2008}NSFTimesYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgODCode" type="{http://jackhenry.com/jxchange/TPG/2008}ChgODCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgODFeeMin" type="{http://jackhenry.com/jxchange/TPG/2008}ChgODFeeMin_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgODFeeMax" type="{http://jackhenry.com/jxchange/TPG/2008}ChgODFeeMax_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgODFeePct" type="{http://jackhenry.com/jxchange/TPG/2008}ChgODFeePct_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgODFeeDays" type="{http://jackhenry.com/jxchange/TPG/2008}ChgODFeeDays_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgODFeeBal" type="{http://jackhenry.com/jxchange/TPG/2008}ChgODFeeBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlyNSFMaxChg" type="{http://jackhenry.com/jxchange/TPG/2008}DlyNSFMaxChg_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlyODMaxChg" type="{http://jackhenry.com/jxchange/TPG/2008}DlyODMaxChg_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlyUCFMaxChg" type="{http://jackhenry.com/jxchange/TPG/2008}DlyUCFMaxChg_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostAFTNSFCode" type="{http://jackhenry.com/jxchange/TPG/2008}PostAFTNSFCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AllowReDepCode" type="{http://jackhenry.com/jxchange/TPG/2008}AllowReDepCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="NumAllowReDepItems" type="{http://jackhenry.com/jxchange/TPG/2008}NumAllowReDepItems_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReDepNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}ReDepNotCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODNot1Days" type="{http://jackhenry.com/jxchange/TPG/2008}ODNot1Days_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODNot2Days" type="{http://jackhenry.com/jxchange/TPG/2008}ODNot2Days_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODNot3Days" type="{http://jackhenry.com/jxchange/TPG/2008}ODNot3Days_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODNot4Days" type="{http://jackhenry.com/jxchange/TPG/2008}ODNot4Days_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODNot5Days" type="{http://jackhenry.com/jxchange/TPG/2008}ODNot5Days_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODNot6Days" type="{http://jackhenry.com/jxchange/TPG/2008}ODNot6Days_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ChgODFeeDaysType" type="{http://jackhenry.com/jxchange/TPG/2008}ChgODFeeDaysType_Type" minOccurs="0"/&gt;
 *           &lt;element name="ConsDaysCntType" type="{http://jackhenry.com/jxchange/TPG/2008}ConsDaysCntType_Type" minOccurs="0"/&gt;
 *           &lt;element name="ChgdOffAutoCode" type="{http://jackhenry.com/jxchange/TPG/2008}ChgdOffAutoCode_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="ODHighBal" type="{http://jackhenry.com/jxchange/TPG/2008}ODHighBal_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="LastNSFDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastNSFDt_Type" minOccurs="0"/&gt;
 *               &lt;element name="ODChgAccr" type="{http://jackhenry.com/jxchange/TPG/2008}ODChgAccr_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="ChgBackAcct" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DepNSFODInfo_CType", propOrder = {
    "odLmt",
    "odPrvlgAmt",
    "autoNSFFee",
    "consDaysNSF",
    "consDaysOD",
    "consDaysRet",
    "lastODDt",
    "odStat",
    "odItemsYTD",
    "odTimesYTD",
    "nsfItemsYTD",
    "nsfTimesYTD",
    "chgODCode",
    "chgODFeeMin",
    "chgODFeeMax",
    "chgODFeePct",
    "chgODFeeDays",
    "chgODFeeBal",
    "dlyNSFMaxChg",
    "dlyODMaxChg",
    "dlyUCFMaxChg",
    "postAFTNSFCode",
    "allowReDepCode",
    "numAllowReDepItems",
    "reDepNotCode",
    "odNot1Days",
    "odNot2Days",
    "odNot3Days",
    "odNot4Days",
    "odNot5Days",
    "odNot6Days",
    "ver1",
    "chgODFeeDaysType",
    "consDaysCntType",
    "chgdOffAutoCode",
    "ver2",
    "odHighBal",
    "ver3",
    "lastNSFDt",
    "odChgAccr",
    "ver4",
    "chgBackAcct",
    "ver5",
    "any"
})
public class DepNSFODInfoCType {

    @XmlElementRef(name = "ODLmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ODLmtType> odLmt;
    @XmlElementRef(name = "ODPrvlgAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ODPrvlgAmtType> odPrvlgAmt;
    @XmlElementRef(name = "AutoNSFFee", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AutoNSFFeeType> autoNSFFee;
    @XmlElementRef(name = "ConsDaysNSF", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ConsDaysNSFType> consDaysNSF;
    @XmlElementRef(name = "ConsDaysOD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ConsDaysODType> consDaysOD;
    @XmlElementRef(name = "ConsDaysRet", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ConsDaysRetType> consDaysRet;
    @XmlElementRef(name = "LastODDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastODDtType> lastODDt;
    @XmlElementRef(name = "ODStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ODStatType> odStat;
    @XmlElementRef(name = "ODItemsYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ODItemsYTDType> odItemsYTD;
    @XmlElementRef(name = "ODTimesYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ODTimesYTDType> odTimesYTD;
    @XmlElementRef(name = "NSFItemsYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NSFItemsYTDType> nsfItemsYTD;
    @XmlElementRef(name = "NSFTimesYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NSFTimesYTDType> nsfTimesYTD;
    @XmlElementRef(name = "ChgODCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChgODCodeType> chgODCode;
    @XmlElementRef(name = "ChgODFeeMin", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChgODFeeMinType> chgODFeeMin;
    @XmlElementRef(name = "ChgODFeeMax", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChgODFeeMaxType> chgODFeeMax;
    @XmlElementRef(name = "ChgODFeePct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChgODFeePctType> chgODFeePct;
    @XmlElementRef(name = "ChgODFeeDays", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChgODFeeDaysType> chgODFeeDays;
    @XmlElementRef(name = "ChgODFeeBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChgODFeeBalType> chgODFeeBal;
    @XmlElementRef(name = "DlyNSFMaxChg", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlyNSFMaxChgType> dlyNSFMaxChg;
    @XmlElementRef(name = "DlyODMaxChg", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlyODMaxChgType> dlyODMaxChg;
    @XmlElementRef(name = "DlyUCFMaxChg", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlyUCFMaxChgType> dlyUCFMaxChg;
    @XmlElementRef(name = "PostAFTNSFCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PostAFTNSFCodeType> postAFTNSFCode;
    @XmlElementRef(name = "AllowReDepCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AllowReDepCodeType> allowReDepCode;
    @XmlElementRef(name = "NumAllowReDepItems", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NumAllowReDepItemsType> numAllowReDepItems;
    @XmlElementRef(name = "ReDepNotCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ReDepNotCodeType> reDepNotCode;
    @XmlElementRef(name = "ODNot1Days", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ODNot1DaysType> odNot1Days;
    @XmlElementRef(name = "ODNot2Days", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ODNot2DaysType> odNot2Days;
    @XmlElementRef(name = "ODNot3Days", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ODNot3DaysType> odNot3Days;
    @XmlElementRef(name = "ODNot4Days", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ODNot4DaysType> odNot4Days;
    @XmlElementRef(name = "ODNot5Days", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ODNot5DaysType> odNot5Days;
    @XmlElementRef(name = "ODNot6Days", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ODNot6DaysType> odNot6Days;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ChgODFeeDaysType")
    protected ChgODFeeDaysTypeType chgODFeeDaysType;
    @XmlElement(name = "ConsDaysCntType")
    protected ConsDaysCntTypeType consDaysCntType;
    @XmlElement(name = "ChgdOffAutoCode")
    protected ChgdOffAutoCodeType chgdOffAutoCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "ODHighBal")
    protected ODHighBalType odHighBal;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "LastNSFDt")
    protected LastNSFDtType lastNSFDt;
    @XmlElement(name = "ODChgAccr")
    protected ODChgAccrType odChgAccr;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "ChgBackAcct")
    protected AccountIdCType chgBackAcct;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the odLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ODLmtType }{@code >}
     *     
     */
    public JAXBElement<ODLmtType> getODLmt() {
        return odLmt;
    }

    /**
     * Sets the value of the odLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ODLmtType }{@code >}
     *     
     */
    public void setODLmt(JAXBElement<ODLmtType> value) {
        this.odLmt = value;
    }

    /**
     * Gets the value of the odPrvlgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ODPrvlgAmtType }{@code >}
     *     
     */
    public JAXBElement<ODPrvlgAmtType> getODPrvlgAmt() {
        return odPrvlgAmt;
    }

    /**
     * Sets the value of the odPrvlgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ODPrvlgAmtType }{@code >}
     *     
     */
    public void setODPrvlgAmt(JAXBElement<ODPrvlgAmtType> value) {
        this.odPrvlgAmt = value;
    }

    /**
     * Gets the value of the autoNSFFee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AutoNSFFeeType }{@code >}
     *     
     */
    public JAXBElement<AutoNSFFeeType> getAutoNSFFee() {
        return autoNSFFee;
    }

    /**
     * Sets the value of the autoNSFFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AutoNSFFeeType }{@code >}
     *     
     */
    public void setAutoNSFFee(JAXBElement<AutoNSFFeeType> value) {
        this.autoNSFFee = value;
    }

    /**
     * Gets the value of the consDaysNSF property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConsDaysNSFType }{@code >}
     *     
     */
    public JAXBElement<ConsDaysNSFType> getConsDaysNSF() {
        return consDaysNSF;
    }

    /**
     * Sets the value of the consDaysNSF property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConsDaysNSFType }{@code >}
     *     
     */
    public void setConsDaysNSF(JAXBElement<ConsDaysNSFType> value) {
        this.consDaysNSF = value;
    }

    /**
     * Gets the value of the consDaysOD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConsDaysODType }{@code >}
     *     
     */
    public JAXBElement<ConsDaysODType> getConsDaysOD() {
        return consDaysOD;
    }

    /**
     * Sets the value of the consDaysOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConsDaysODType }{@code >}
     *     
     */
    public void setConsDaysOD(JAXBElement<ConsDaysODType> value) {
        this.consDaysOD = value;
    }

    /**
     * Gets the value of the consDaysRet property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConsDaysRetType }{@code >}
     *     
     */
    public JAXBElement<ConsDaysRetType> getConsDaysRet() {
        return consDaysRet;
    }

    /**
     * Sets the value of the consDaysRet property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConsDaysRetType }{@code >}
     *     
     */
    public void setConsDaysRet(JAXBElement<ConsDaysRetType> value) {
        this.consDaysRet = value;
    }

    /**
     * Gets the value of the lastODDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastODDtType }{@code >}
     *     
     */
    public JAXBElement<LastODDtType> getLastODDt() {
        return lastODDt;
    }

    /**
     * Sets the value of the lastODDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastODDtType }{@code >}
     *     
     */
    public void setLastODDt(JAXBElement<LastODDtType> value) {
        this.lastODDt = value;
    }

    /**
     * Gets the value of the odStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ODStatType }{@code >}
     *     
     */
    public JAXBElement<ODStatType> getODStat() {
        return odStat;
    }

    /**
     * Sets the value of the odStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ODStatType }{@code >}
     *     
     */
    public void setODStat(JAXBElement<ODStatType> value) {
        this.odStat = value;
    }

    /**
     * Gets the value of the odItemsYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ODItemsYTDType }{@code >}
     *     
     */
    public JAXBElement<ODItemsYTDType> getODItemsYTD() {
        return odItemsYTD;
    }

    /**
     * Sets the value of the odItemsYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ODItemsYTDType }{@code >}
     *     
     */
    public void setODItemsYTD(JAXBElement<ODItemsYTDType> value) {
        this.odItemsYTD = value;
    }

    /**
     * Gets the value of the odTimesYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ODTimesYTDType }{@code >}
     *     
     */
    public JAXBElement<ODTimesYTDType> getODTimesYTD() {
        return odTimesYTD;
    }

    /**
     * Sets the value of the odTimesYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ODTimesYTDType }{@code >}
     *     
     */
    public void setODTimesYTD(JAXBElement<ODTimesYTDType> value) {
        this.odTimesYTD = value;
    }

    /**
     * Gets the value of the nsfItemsYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NSFItemsYTDType }{@code >}
     *     
     */
    public JAXBElement<NSFItemsYTDType> getNSFItemsYTD() {
        return nsfItemsYTD;
    }

    /**
     * Sets the value of the nsfItemsYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NSFItemsYTDType }{@code >}
     *     
     */
    public void setNSFItemsYTD(JAXBElement<NSFItemsYTDType> value) {
        this.nsfItemsYTD = value;
    }

    /**
     * Gets the value of the nsfTimesYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NSFTimesYTDType }{@code >}
     *     
     */
    public JAXBElement<NSFTimesYTDType> getNSFTimesYTD() {
        return nsfTimesYTD;
    }

    /**
     * Sets the value of the nsfTimesYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NSFTimesYTDType }{@code >}
     *     
     */
    public void setNSFTimesYTD(JAXBElement<NSFTimesYTDType> value) {
        this.nsfTimesYTD = value;
    }

    /**
     * Gets the value of the chgODCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChgODCodeType }{@code >}
     *     
     */
    public JAXBElement<ChgODCodeType> getChgODCode() {
        return chgODCode;
    }

    /**
     * Sets the value of the chgODCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChgODCodeType }{@code >}
     *     
     */
    public void setChgODCode(JAXBElement<ChgODCodeType> value) {
        this.chgODCode = value;
    }

    /**
     * Gets the value of the chgODFeeMin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChgODFeeMinType }{@code >}
     *     
     */
    public JAXBElement<ChgODFeeMinType> getChgODFeeMin() {
        return chgODFeeMin;
    }

    /**
     * Sets the value of the chgODFeeMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChgODFeeMinType }{@code >}
     *     
     */
    public void setChgODFeeMin(JAXBElement<ChgODFeeMinType> value) {
        this.chgODFeeMin = value;
    }

    /**
     * Gets the value of the chgODFeeMax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChgODFeeMaxType }{@code >}
     *     
     */
    public JAXBElement<ChgODFeeMaxType> getChgODFeeMax() {
        return chgODFeeMax;
    }

    /**
     * Sets the value of the chgODFeeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChgODFeeMaxType }{@code >}
     *     
     */
    public void setChgODFeeMax(JAXBElement<ChgODFeeMaxType> value) {
        this.chgODFeeMax = value;
    }

    /**
     * Gets the value of the chgODFeePct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChgODFeePctType }{@code >}
     *     
     */
    public JAXBElement<ChgODFeePctType> getChgODFeePct() {
        return chgODFeePct;
    }

    /**
     * Sets the value of the chgODFeePct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChgODFeePctType }{@code >}
     *     
     */
    public void setChgODFeePct(JAXBElement<ChgODFeePctType> value) {
        this.chgODFeePct = value;
    }

    /**
     * Gets the value of the chgODFeeDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChgODFeeDaysType }{@code >}
     *     
     */
    public JAXBElement<ChgODFeeDaysType> getChgODFeeDays() {
        return chgODFeeDays;
    }

    /**
     * Sets the value of the chgODFeeDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChgODFeeDaysType }{@code >}
     *     
     */
    public void setChgODFeeDays(JAXBElement<ChgODFeeDaysType> value) {
        this.chgODFeeDays = value;
    }

    /**
     * Gets the value of the chgODFeeBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChgODFeeBalType }{@code >}
     *     
     */
    public JAXBElement<ChgODFeeBalType> getChgODFeeBal() {
        return chgODFeeBal;
    }

    /**
     * Sets the value of the chgODFeeBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChgODFeeBalType }{@code >}
     *     
     */
    public void setChgODFeeBal(JAXBElement<ChgODFeeBalType> value) {
        this.chgODFeeBal = value;
    }

    /**
     * Gets the value of the dlyNSFMaxChg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlyNSFMaxChgType }{@code >}
     *     
     */
    public JAXBElement<DlyNSFMaxChgType> getDlyNSFMaxChg() {
        return dlyNSFMaxChg;
    }

    /**
     * Sets the value of the dlyNSFMaxChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlyNSFMaxChgType }{@code >}
     *     
     */
    public void setDlyNSFMaxChg(JAXBElement<DlyNSFMaxChgType> value) {
        this.dlyNSFMaxChg = value;
    }

    /**
     * Gets the value of the dlyODMaxChg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlyODMaxChgType }{@code >}
     *     
     */
    public JAXBElement<DlyODMaxChgType> getDlyODMaxChg() {
        return dlyODMaxChg;
    }

    /**
     * Sets the value of the dlyODMaxChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlyODMaxChgType }{@code >}
     *     
     */
    public void setDlyODMaxChg(JAXBElement<DlyODMaxChgType> value) {
        this.dlyODMaxChg = value;
    }

    /**
     * Gets the value of the dlyUCFMaxChg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlyUCFMaxChgType }{@code >}
     *     
     */
    public JAXBElement<DlyUCFMaxChgType> getDlyUCFMaxChg() {
        return dlyUCFMaxChg;
    }

    /**
     * Sets the value of the dlyUCFMaxChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlyUCFMaxChgType }{@code >}
     *     
     */
    public void setDlyUCFMaxChg(JAXBElement<DlyUCFMaxChgType> value) {
        this.dlyUCFMaxChg = value;
    }

    /**
     * Gets the value of the postAFTNSFCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostAFTNSFCodeType }{@code >}
     *     
     */
    public JAXBElement<PostAFTNSFCodeType> getPostAFTNSFCode() {
        return postAFTNSFCode;
    }

    /**
     * Sets the value of the postAFTNSFCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostAFTNSFCodeType }{@code >}
     *     
     */
    public void setPostAFTNSFCode(JAXBElement<PostAFTNSFCodeType> value) {
        this.postAFTNSFCode = value;
    }

    /**
     * Gets the value of the allowReDepCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AllowReDepCodeType }{@code >}
     *     
     */
    public JAXBElement<AllowReDepCodeType> getAllowReDepCode() {
        return allowReDepCode;
    }

    /**
     * Sets the value of the allowReDepCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AllowReDepCodeType }{@code >}
     *     
     */
    public void setAllowReDepCode(JAXBElement<AllowReDepCodeType> value) {
        this.allowReDepCode = value;
    }

    /**
     * Gets the value of the numAllowReDepItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NumAllowReDepItemsType }{@code >}
     *     
     */
    public JAXBElement<NumAllowReDepItemsType> getNumAllowReDepItems() {
        return numAllowReDepItems;
    }

    /**
     * Sets the value of the numAllowReDepItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NumAllowReDepItemsType }{@code >}
     *     
     */
    public void setNumAllowReDepItems(JAXBElement<NumAllowReDepItemsType> value) {
        this.numAllowReDepItems = value;
    }

    /**
     * Gets the value of the reDepNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReDepNotCodeType }{@code >}
     *     
     */
    public JAXBElement<ReDepNotCodeType> getReDepNotCode() {
        return reDepNotCode;
    }

    /**
     * Sets the value of the reDepNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReDepNotCodeType }{@code >}
     *     
     */
    public void setReDepNotCode(JAXBElement<ReDepNotCodeType> value) {
        this.reDepNotCode = value;
    }

    /**
     * Gets the value of the odNot1Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ODNot1DaysType }{@code >}
     *     
     */
    public JAXBElement<ODNot1DaysType> getODNot1Days() {
        return odNot1Days;
    }

    /**
     * Sets the value of the odNot1Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ODNot1DaysType }{@code >}
     *     
     */
    public void setODNot1Days(JAXBElement<ODNot1DaysType> value) {
        this.odNot1Days = value;
    }

    /**
     * Gets the value of the odNot2Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ODNot2DaysType }{@code >}
     *     
     */
    public JAXBElement<ODNot2DaysType> getODNot2Days() {
        return odNot2Days;
    }

    /**
     * Sets the value of the odNot2Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ODNot2DaysType }{@code >}
     *     
     */
    public void setODNot2Days(JAXBElement<ODNot2DaysType> value) {
        this.odNot2Days = value;
    }

    /**
     * Gets the value of the odNot3Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ODNot3DaysType }{@code >}
     *     
     */
    public JAXBElement<ODNot3DaysType> getODNot3Days() {
        return odNot3Days;
    }

    /**
     * Sets the value of the odNot3Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ODNot3DaysType }{@code >}
     *     
     */
    public void setODNot3Days(JAXBElement<ODNot3DaysType> value) {
        this.odNot3Days = value;
    }

    /**
     * Gets the value of the odNot4Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ODNot4DaysType }{@code >}
     *     
     */
    public JAXBElement<ODNot4DaysType> getODNot4Days() {
        return odNot4Days;
    }

    /**
     * Sets the value of the odNot4Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ODNot4DaysType }{@code >}
     *     
     */
    public void setODNot4Days(JAXBElement<ODNot4DaysType> value) {
        this.odNot4Days = value;
    }

    /**
     * Gets the value of the odNot5Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ODNot5DaysType }{@code >}
     *     
     */
    public JAXBElement<ODNot5DaysType> getODNot5Days() {
        return odNot5Days;
    }

    /**
     * Sets the value of the odNot5Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ODNot5DaysType }{@code >}
     *     
     */
    public void setODNot5Days(JAXBElement<ODNot5DaysType> value) {
        this.odNot5Days = value;
    }

    /**
     * Gets the value of the odNot6Days property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ODNot6DaysType }{@code >}
     *     
     */
    public JAXBElement<ODNot6DaysType> getODNot6Days() {
        return odNot6Days;
    }

    /**
     * Sets the value of the odNot6Days property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ODNot6DaysType }{@code >}
     *     
     */
    public void setODNot6Days(JAXBElement<ODNot6DaysType> value) {
        this.odNot6Days = value;
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
     * Gets the value of the chgODFeeDaysType property.
     * 
     * @return
     *     possible object is
     *     {@link ChgODFeeDaysTypeType }
     *     
     */
    public ChgODFeeDaysTypeType getChgODFeeDaysType() {
        return chgODFeeDaysType;
    }

    /**
     * Sets the value of the chgODFeeDaysType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChgODFeeDaysTypeType }
     *     
     */
    public void setChgODFeeDaysType(ChgODFeeDaysTypeType value) {
        this.chgODFeeDaysType = value;
    }

    /**
     * Gets the value of the consDaysCntType property.
     * 
     * @return
     *     possible object is
     *     {@link ConsDaysCntTypeType }
     *     
     */
    public ConsDaysCntTypeType getConsDaysCntType() {
        return consDaysCntType;
    }

    /**
     * Sets the value of the consDaysCntType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsDaysCntTypeType }
     *     
     */
    public void setConsDaysCntType(ConsDaysCntTypeType value) {
        this.consDaysCntType = value;
    }

    /**
     * Gets the value of the chgdOffAutoCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChgdOffAutoCodeType }
     *     
     */
    public ChgdOffAutoCodeType getChgdOffAutoCode() {
        return chgdOffAutoCode;
    }

    /**
     * Sets the value of the chgdOffAutoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChgdOffAutoCodeType }
     *     
     */
    public void setChgdOffAutoCode(ChgdOffAutoCodeType value) {
        this.chgdOffAutoCode = value;
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
     * Gets the value of the odHighBal property.
     * 
     * @return
     *     possible object is
     *     {@link ODHighBalType }
     *     
     */
    public ODHighBalType getODHighBal() {
        return odHighBal;
    }

    /**
     * Sets the value of the odHighBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODHighBalType }
     *     
     */
    public void setODHighBal(ODHighBalType value) {
        this.odHighBal = value;
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
     * Gets the value of the lastNSFDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastNSFDtType }
     *     
     */
    public LastNSFDtType getLastNSFDt() {
        return lastNSFDt;
    }

    /**
     * Sets the value of the lastNSFDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastNSFDtType }
     *     
     */
    public void setLastNSFDt(LastNSFDtType value) {
        this.lastNSFDt = value;
    }

    /**
     * Gets the value of the odChgAccr property.
     * 
     * @return
     *     possible object is
     *     {@link ODChgAccrType }
     *     
     */
    public ODChgAccrType getODChgAccr() {
        return odChgAccr;
    }

    /**
     * Sets the value of the odChgAccr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODChgAccrType }
     *     
     */
    public void setODChgAccr(ODChgAccrType value) {
        this.odChgAccr = value;
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
     * Gets the value of the chgBackAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getChgBackAcct() {
        return chgBackAcct;
    }

    /**
     * Sets the value of the chgBackAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setChgBackAcct(AccountIdCType value) {
        this.chgBackAcct = value;
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
