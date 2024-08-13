
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
 * <p>Java class for TaxPlnDist_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxPlnDist_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoStartDistCode" type="{http://jackhenry.com/jxchange/TPG/2008}AutoStartDistCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlyFirstDistCode" type="{http://jackhenry.com/jxchange/TPG/2008}DlyFirstDistCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}DistAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}DistAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistAmtRem" type="{http://jackhenry.com/jxchange/TPG/2008}DistAmtRem_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistAmtRemCode" type="{http://jackhenry.com/jxchange/TPG/2008}DistAmtRemCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistCalcMthdCode" type="{http://jackhenry.com/jxchange/TPG/2008}DistCalcMthdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistDayofMonth" type="{http://jackhenry.com/jxchange/TPG/2008}DistDayofMonth_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistFrq" type="{http://jackhenry.com/jxchange/TPG/2008}DistFrq_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistFrqCode" type="{http://jackhenry.com/jxchange/TPG/2008}DistFrqCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistIncIntCode" type="{http://jackhenry.com/jxchange/TPG/2008}DistIncIntCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistAmt" type="{http://jackhenry.com/jxchange/TPG/2008}DistAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistSeqOrderCode" type="{http://jackhenry.com/jxchange/TPG/2008}DistSeqOrderCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistStatCode" type="{http://jackhenry.com/jxchange/TPG/2008}DistStatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistTrnCode" type="{http://jackhenry.com/jxchange/TPG/2008}DistTrnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecDistAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ElecDistAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastDistAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LastDistAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastDistDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastDistDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MndtryDistDt" type="{http://jackhenry.com/jxchange/TPG/2008}MndtryDistDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NxtDistDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtDistDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RecalcDistAmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}RecalcDistAmtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SoleSpousDistCode" type="{http://jackhenry.com/jxchange/TPG/2008}SoleSpousDistCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReqMinDistAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ReqMinDistAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StartDistDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDistDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CalcBenfAge" type="{http://jackhenry.com/jxchange/TPG/2008}CalcBenfAge_Type" minOccurs="0"/&gt;
 *         &lt;element name="WavMndtryDistCode" type="{http://jackhenry.com/jxchange/TPG/2008}WavMndtryDistCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinRDAAgeOvrrdCode" type="{http://jackhenry.com/jxchange/TPG/2008}MinRDAAgeOvrrdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RedLastAnnDistCode" type="{http://jackhenry.com/jxchange/TPG/2008}RedLastAnnDistCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OwnDistCalcMthdCode" type="{http://jackhenry.com/jxchange/TPG/2008}OwnDistCalcMthdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistFactor" type="{http://jackhenry.com/jxchange/TPG/2008}DistFactor_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHPmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}ACHPmtInfo_CType" minOccurs="0"/&gt;
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
@XmlType(name = "TaxPlnDist_CType", propOrder = {
    "autoStartDistCode",
    "dlyFirstDistCode",
    "distAcctId",
    "distAcctType",
    "distAmtRem",
    "distAmtRemCode",
    "distCalcMthdCode",
    "distDayofMonth",
    "distFrq",
    "distFrqCode",
    "distIncIntCode",
    "distAmt",
    "distSeqOrderCode",
    "distStatCode",
    "distTrnCode",
    "elecDistAmt",
    "lastDistAmt",
    "lastDistDt",
    "mndtryDistDt",
    "nxtDistDt",
    "recalcDistAmtCode",
    "soleSpousDistCode",
    "reqMinDistAmt",
    "startDistDt",
    "calcBenfAge",
    "wavMndtryDistCode",
    "minRDAAgeOvrrdCode",
    "redLastAnnDistCode",
    "ownDistCalcMthdCode",
    "distFactor",
    "achPmtInfo",
    "ver1",
    "any"
})
public class TaxPlnDistCType {

    @XmlElementRef(name = "AutoStartDistCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AutoStartDistCodeType> autoStartDistCode;
    @XmlElementRef(name = "DlyFirstDistCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlyFirstDistCodeType> dlyFirstDistCode;
    @XmlElementRef(name = "DistAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DistAcctIdType> distAcctId;
    @XmlElementRef(name = "DistAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DistAcctTypeType> distAcctType;
    @XmlElementRef(name = "DistAmtRem", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DistAmtRemType> distAmtRem;
    @XmlElementRef(name = "DistAmtRemCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DistAmtRemCodeType> distAmtRemCode;
    @XmlElementRef(name = "DistCalcMthdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DistCalcMthdCodeType> distCalcMthdCode;
    @XmlElementRef(name = "DistDayofMonth", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DistDayofMonthType> distDayofMonth;
    @XmlElementRef(name = "DistFrq", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DistFrqType> distFrq;
    @XmlElementRef(name = "DistFrqCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DistFrqCodeType> distFrqCode;
    @XmlElementRef(name = "DistIncIntCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DistIncIntCodeType> distIncIntCode;
    @XmlElementRef(name = "DistAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DistAmtType> distAmt;
    @XmlElementRef(name = "DistSeqOrderCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DistSeqOrderCodeType> distSeqOrderCode;
    @XmlElementRef(name = "DistStatCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DistStatCodeType> distStatCode;
    @XmlElementRef(name = "DistTrnCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DistTrnCodeType> distTrnCode;
    @XmlElementRef(name = "ElecDistAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ElecDistAmtType> elecDistAmt;
    @XmlElementRef(name = "LastDistAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastDistAmtType> lastDistAmt;
    @XmlElementRef(name = "LastDistDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastDistDtType> lastDistDt;
    @XmlElementRef(name = "MndtryDistDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MndtryDistDtType> mndtryDistDt;
    @XmlElementRef(name = "NxtDistDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NxtDistDtType> nxtDistDt;
    @XmlElementRef(name = "RecalcDistAmtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RecalcDistAmtCodeType> recalcDistAmtCode;
    @XmlElementRef(name = "SoleSpousDistCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SoleSpousDistCodeType> soleSpousDistCode;
    @XmlElementRef(name = "ReqMinDistAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ReqMinDistAmtType> reqMinDistAmt;
    @XmlElementRef(name = "StartDistDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StartDistDtType> startDistDt;
    @XmlElementRef(name = "CalcBenfAge", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CalcBenfAgeType> calcBenfAge;
    @XmlElementRef(name = "WavMndtryDistCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WavMndtryDistCodeType> wavMndtryDistCode;
    @XmlElementRef(name = "MinRDAAgeOvrrdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MinRDAAgeOvrrdCodeType> minRDAAgeOvrrdCode;
    @XmlElementRef(name = "RedLastAnnDistCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RedLastAnnDistCodeType> redLastAnnDistCode;
    @XmlElementRef(name = "OwnDistCalcMthdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OwnDistCalcMthdCodeType> ownDistCalcMthdCode;
    @XmlElementRef(name = "DistFactor", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DistFactorType> distFactor;
    @XmlElement(name = "ACHPmtInfo")
    protected ACHPmtInfoCType achPmtInfo;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the autoStartDistCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AutoStartDistCodeType }{@code >}
     *     
     */
    public JAXBElement<AutoStartDistCodeType> getAutoStartDistCode() {
        return autoStartDistCode;
    }

    /**
     * Sets the value of the autoStartDistCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AutoStartDistCodeType }{@code >}
     *     
     */
    public void setAutoStartDistCode(JAXBElement<AutoStartDistCodeType> value) {
        this.autoStartDistCode = value;
    }

    /**
     * Gets the value of the dlyFirstDistCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlyFirstDistCodeType }{@code >}
     *     
     */
    public JAXBElement<DlyFirstDistCodeType> getDlyFirstDistCode() {
        return dlyFirstDistCode;
    }

    /**
     * Sets the value of the dlyFirstDistCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlyFirstDistCodeType }{@code >}
     *     
     */
    public void setDlyFirstDistCode(JAXBElement<DlyFirstDistCodeType> value) {
        this.dlyFirstDistCode = value;
    }

    /**
     * Gets the value of the distAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistAcctIdType }{@code >}
     *     
     */
    public JAXBElement<DistAcctIdType> getDistAcctId() {
        return distAcctId;
    }

    /**
     * Sets the value of the distAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistAcctIdType }{@code >}
     *     
     */
    public void setDistAcctId(JAXBElement<DistAcctIdType> value) {
        this.distAcctId = value;
    }

    /**
     * Gets the value of the distAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<DistAcctTypeType> getDistAcctType() {
        return distAcctType;
    }

    /**
     * Sets the value of the distAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistAcctTypeType }{@code >}
     *     
     */
    public void setDistAcctType(JAXBElement<DistAcctTypeType> value) {
        this.distAcctType = value;
    }

    /**
     * Gets the value of the distAmtRem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistAmtRemType }{@code >}
     *     
     */
    public JAXBElement<DistAmtRemType> getDistAmtRem() {
        return distAmtRem;
    }

    /**
     * Sets the value of the distAmtRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistAmtRemType }{@code >}
     *     
     */
    public void setDistAmtRem(JAXBElement<DistAmtRemType> value) {
        this.distAmtRem = value;
    }

    /**
     * Gets the value of the distAmtRemCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistAmtRemCodeType }{@code >}
     *     
     */
    public JAXBElement<DistAmtRemCodeType> getDistAmtRemCode() {
        return distAmtRemCode;
    }

    /**
     * Sets the value of the distAmtRemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistAmtRemCodeType }{@code >}
     *     
     */
    public void setDistAmtRemCode(JAXBElement<DistAmtRemCodeType> value) {
        this.distAmtRemCode = value;
    }

    /**
     * Gets the value of the distCalcMthdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistCalcMthdCodeType }{@code >}
     *     
     */
    public JAXBElement<DistCalcMthdCodeType> getDistCalcMthdCode() {
        return distCalcMthdCode;
    }

    /**
     * Sets the value of the distCalcMthdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistCalcMthdCodeType }{@code >}
     *     
     */
    public void setDistCalcMthdCode(JAXBElement<DistCalcMthdCodeType> value) {
        this.distCalcMthdCode = value;
    }

    /**
     * Gets the value of the distDayofMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistDayofMonthType }{@code >}
     *     
     */
    public JAXBElement<DistDayofMonthType> getDistDayofMonth() {
        return distDayofMonth;
    }

    /**
     * Sets the value of the distDayofMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistDayofMonthType }{@code >}
     *     
     */
    public void setDistDayofMonth(JAXBElement<DistDayofMonthType> value) {
        this.distDayofMonth = value;
    }

    /**
     * Gets the value of the distFrq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistFrqType }{@code >}
     *     
     */
    public JAXBElement<DistFrqType> getDistFrq() {
        return distFrq;
    }

    /**
     * Sets the value of the distFrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistFrqType }{@code >}
     *     
     */
    public void setDistFrq(JAXBElement<DistFrqType> value) {
        this.distFrq = value;
    }

    /**
     * Gets the value of the distFrqCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistFrqCodeType }{@code >}
     *     
     */
    public JAXBElement<DistFrqCodeType> getDistFrqCode() {
        return distFrqCode;
    }

    /**
     * Sets the value of the distFrqCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistFrqCodeType }{@code >}
     *     
     */
    public void setDistFrqCode(JAXBElement<DistFrqCodeType> value) {
        this.distFrqCode = value;
    }

    /**
     * Gets the value of the distIncIntCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistIncIntCodeType }{@code >}
     *     
     */
    public JAXBElement<DistIncIntCodeType> getDistIncIntCode() {
        return distIncIntCode;
    }

    /**
     * Sets the value of the distIncIntCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistIncIntCodeType }{@code >}
     *     
     */
    public void setDistIncIntCode(JAXBElement<DistIncIntCodeType> value) {
        this.distIncIntCode = value;
    }

    /**
     * Gets the value of the distAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistAmtType }{@code >}
     *     
     */
    public JAXBElement<DistAmtType> getDistAmt() {
        return distAmt;
    }

    /**
     * Sets the value of the distAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistAmtType }{@code >}
     *     
     */
    public void setDistAmt(JAXBElement<DistAmtType> value) {
        this.distAmt = value;
    }

    /**
     * Gets the value of the distSeqOrderCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistSeqOrderCodeType }{@code >}
     *     
     */
    public JAXBElement<DistSeqOrderCodeType> getDistSeqOrderCode() {
        return distSeqOrderCode;
    }

    /**
     * Sets the value of the distSeqOrderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistSeqOrderCodeType }{@code >}
     *     
     */
    public void setDistSeqOrderCode(JAXBElement<DistSeqOrderCodeType> value) {
        this.distSeqOrderCode = value;
    }

    /**
     * Gets the value of the distStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistStatCodeType }{@code >}
     *     
     */
    public JAXBElement<DistStatCodeType> getDistStatCode() {
        return distStatCode;
    }

    /**
     * Sets the value of the distStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistStatCodeType }{@code >}
     *     
     */
    public void setDistStatCode(JAXBElement<DistStatCodeType> value) {
        this.distStatCode = value;
    }

    /**
     * Gets the value of the distTrnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistTrnCodeType }{@code >}
     *     
     */
    public JAXBElement<DistTrnCodeType> getDistTrnCode() {
        return distTrnCode;
    }

    /**
     * Sets the value of the distTrnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistTrnCodeType }{@code >}
     *     
     */
    public void setDistTrnCode(JAXBElement<DistTrnCodeType> value) {
        this.distTrnCode = value;
    }

    /**
     * Gets the value of the elecDistAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElecDistAmtType }{@code >}
     *     
     */
    public JAXBElement<ElecDistAmtType> getElecDistAmt() {
        return elecDistAmt;
    }

    /**
     * Sets the value of the elecDistAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElecDistAmtType }{@code >}
     *     
     */
    public void setElecDistAmt(JAXBElement<ElecDistAmtType> value) {
        this.elecDistAmt = value;
    }

    /**
     * Gets the value of the lastDistAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastDistAmtType }{@code >}
     *     
     */
    public JAXBElement<LastDistAmtType> getLastDistAmt() {
        return lastDistAmt;
    }

    /**
     * Sets the value of the lastDistAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastDistAmtType }{@code >}
     *     
     */
    public void setLastDistAmt(JAXBElement<LastDistAmtType> value) {
        this.lastDistAmt = value;
    }

    /**
     * Gets the value of the lastDistDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastDistDtType }{@code >}
     *     
     */
    public JAXBElement<LastDistDtType> getLastDistDt() {
        return lastDistDt;
    }

    /**
     * Sets the value of the lastDistDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastDistDtType }{@code >}
     *     
     */
    public void setLastDistDt(JAXBElement<LastDistDtType> value) {
        this.lastDistDt = value;
    }

    /**
     * Gets the value of the mndtryDistDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MndtryDistDtType }{@code >}
     *     
     */
    public JAXBElement<MndtryDistDtType> getMndtryDistDt() {
        return mndtryDistDt;
    }

    /**
     * Sets the value of the mndtryDistDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MndtryDistDtType }{@code >}
     *     
     */
    public void setMndtryDistDt(JAXBElement<MndtryDistDtType> value) {
        this.mndtryDistDt = value;
    }

    /**
     * Gets the value of the nxtDistDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NxtDistDtType }{@code >}
     *     
     */
    public JAXBElement<NxtDistDtType> getNxtDistDt() {
        return nxtDistDt;
    }

    /**
     * Sets the value of the nxtDistDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NxtDistDtType }{@code >}
     *     
     */
    public void setNxtDistDt(JAXBElement<NxtDistDtType> value) {
        this.nxtDistDt = value;
    }

    /**
     * Gets the value of the recalcDistAmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RecalcDistAmtCodeType }{@code >}
     *     
     */
    public JAXBElement<RecalcDistAmtCodeType> getRecalcDistAmtCode() {
        return recalcDistAmtCode;
    }

    /**
     * Sets the value of the recalcDistAmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RecalcDistAmtCodeType }{@code >}
     *     
     */
    public void setRecalcDistAmtCode(JAXBElement<RecalcDistAmtCodeType> value) {
        this.recalcDistAmtCode = value;
    }

    /**
     * Gets the value of the soleSpousDistCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SoleSpousDistCodeType }{@code >}
     *     
     */
    public JAXBElement<SoleSpousDistCodeType> getSoleSpousDistCode() {
        return soleSpousDistCode;
    }

    /**
     * Sets the value of the soleSpousDistCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SoleSpousDistCodeType }{@code >}
     *     
     */
    public void setSoleSpousDistCode(JAXBElement<SoleSpousDistCodeType> value) {
        this.soleSpousDistCode = value;
    }

    /**
     * Gets the value of the reqMinDistAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReqMinDistAmtType }{@code >}
     *     
     */
    public JAXBElement<ReqMinDistAmtType> getReqMinDistAmt() {
        return reqMinDistAmt;
    }

    /**
     * Sets the value of the reqMinDistAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReqMinDistAmtType }{@code >}
     *     
     */
    public void setReqMinDistAmt(JAXBElement<ReqMinDistAmtType> value) {
        this.reqMinDistAmt = value;
    }

    /**
     * Gets the value of the startDistDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StartDistDtType }{@code >}
     *     
     */
    public JAXBElement<StartDistDtType> getStartDistDt() {
        return startDistDt;
    }

    /**
     * Sets the value of the startDistDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StartDistDtType }{@code >}
     *     
     */
    public void setStartDistDt(JAXBElement<StartDistDtType> value) {
        this.startDistDt = value;
    }

    /**
     * Gets the value of the calcBenfAge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CalcBenfAgeType }{@code >}
     *     
     */
    public JAXBElement<CalcBenfAgeType> getCalcBenfAge() {
        return calcBenfAge;
    }

    /**
     * Sets the value of the calcBenfAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CalcBenfAgeType }{@code >}
     *     
     */
    public void setCalcBenfAge(JAXBElement<CalcBenfAgeType> value) {
        this.calcBenfAge = value;
    }

    /**
     * Gets the value of the wavMndtryDistCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WavMndtryDistCodeType }{@code >}
     *     
     */
    public JAXBElement<WavMndtryDistCodeType> getWavMndtryDistCode() {
        return wavMndtryDistCode;
    }

    /**
     * Sets the value of the wavMndtryDistCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WavMndtryDistCodeType }{@code >}
     *     
     */
    public void setWavMndtryDistCode(JAXBElement<WavMndtryDistCodeType> value) {
        this.wavMndtryDistCode = value;
    }

    /**
     * Gets the value of the minRDAAgeOvrrdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MinRDAAgeOvrrdCodeType }{@code >}
     *     
     */
    public JAXBElement<MinRDAAgeOvrrdCodeType> getMinRDAAgeOvrrdCode() {
        return minRDAAgeOvrrdCode;
    }

    /**
     * Sets the value of the minRDAAgeOvrrdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MinRDAAgeOvrrdCodeType }{@code >}
     *     
     */
    public void setMinRDAAgeOvrrdCode(JAXBElement<MinRDAAgeOvrrdCodeType> value) {
        this.minRDAAgeOvrrdCode = value;
    }

    /**
     * Gets the value of the redLastAnnDistCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RedLastAnnDistCodeType }{@code >}
     *     
     */
    public JAXBElement<RedLastAnnDistCodeType> getRedLastAnnDistCode() {
        return redLastAnnDistCode;
    }

    /**
     * Sets the value of the redLastAnnDistCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RedLastAnnDistCodeType }{@code >}
     *     
     */
    public void setRedLastAnnDistCode(JAXBElement<RedLastAnnDistCodeType> value) {
        this.redLastAnnDistCode = value;
    }

    /**
     * Gets the value of the ownDistCalcMthdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OwnDistCalcMthdCodeType }{@code >}
     *     
     */
    public JAXBElement<OwnDistCalcMthdCodeType> getOwnDistCalcMthdCode() {
        return ownDistCalcMthdCode;
    }

    /**
     * Sets the value of the ownDistCalcMthdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OwnDistCalcMthdCodeType }{@code >}
     *     
     */
    public void setOwnDistCalcMthdCode(JAXBElement<OwnDistCalcMthdCodeType> value) {
        this.ownDistCalcMthdCode = value;
    }

    /**
     * Gets the value of the distFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistFactorType }{@code >}
     *     
     */
    public JAXBElement<DistFactorType> getDistFactor() {
        return distFactor;
    }

    /**
     * Sets the value of the distFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistFactorType }{@code >}
     *     
     */
    public void setDistFactor(JAXBElement<DistFactorType> value) {
        this.distFactor = value;
    }

    /**
     * Gets the value of the achPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ACHPmtInfoCType }
     *     
     */
    public ACHPmtInfoCType getACHPmtInfo() {
        return achPmtInfo;
    }

    /**
     * Sets the value of the achPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHPmtInfoCType }
     *     
     */
    public void setACHPmtInfo(ACHPmtInfoCType value) {
        this.achPmtInfo = value;
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
