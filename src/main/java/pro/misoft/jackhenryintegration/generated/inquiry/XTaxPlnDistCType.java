
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
 * <p>Java class for x_TaxPlnDist_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_TaxPlnDist_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxPlnDist" type="{http://jackhenry.com/jxchange/TPG/2008}TaxPlnDist_CType" minOccurs="0"/&gt;
 *         &lt;element name="AutoStartDistDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AutoStartDistDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlyFirstDistDesc" type="{http://jackhenry.com/jxchange/TPG/2008}DlyFirstDistDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistAmtRemDesc" type="{http://jackhenry.com/jxchange/TPG/2008}DistAmtRemDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistFrqDesc" type="{http://jackhenry.com/jxchange/TPG/2008}DistFrqDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistIncIntDesc" type="{http://jackhenry.com/jxchange/TPG/2008}DistIncIntDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistCalcMthdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}DistCalcMthdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistSeqOrderDesc" type="{http://jackhenry.com/jxchange/TPG/2008}DistSeqOrderDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistTrnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}DistTrnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="RecalcDistAmtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RecalcDistAmtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecDistAmtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ElecDistAmtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReqMinDistDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ReqMinDistDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SoleSpousDistDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SoleSpousDistDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="WavMndtryDistDesc" type="{http://jackhenry.com/jxchange/TPG/2008}WavMndtryDistDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinRDAAgeOvrrdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MinRDAAgeOvrrdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="RedLastAnnDistDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RedLastAnnDistDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="OwnDistCalcMthdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OwnDistCalcMthdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DistStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}DistStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHSendPreNoteDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHSendPreNoteDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHTrnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHTrnDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_TaxPlnDist_CType", propOrder = {
    "taxPlnDist",
    "autoStartDistDesc",
    "dlyFirstDistDesc",
    "distAmtRemDesc",
    "distFrqDesc",
    "distIncIntDesc",
    "distCalcMthdDesc",
    "distSeqOrderDesc",
    "distTrnDesc",
    "recalcDistAmtDesc",
    "elecDistAmtDesc",
    "reqMinDistDesc",
    "soleSpousDistDesc",
    "wavMndtryDistDesc",
    "minRDAAgeOvrrdDesc",
    "redLastAnnDistDesc",
    "ownDistCalcMthdDesc",
    "distStatDesc",
    "achSendPreNoteDesc",
    "achTrnDesc",
    "custom",
    "ver1",
    "any"
})
public class XTaxPlnDistCType {

    @XmlElement(name = "TaxPlnDist")
    protected TaxPlnDistCType taxPlnDist;
    @XmlElement(name = "AutoStartDistDesc")
    protected AutoStartDistDescType autoStartDistDesc;
    @XmlElement(name = "DlyFirstDistDesc")
    protected DlyFirstDistDescType dlyFirstDistDesc;
    @XmlElement(name = "DistAmtRemDesc")
    protected DistAmtRemDescType distAmtRemDesc;
    @XmlElement(name = "DistFrqDesc")
    protected DistFrqDescType distFrqDesc;
    @XmlElement(name = "DistIncIntDesc")
    protected DistIncIntDescType distIncIntDesc;
    @XmlElement(name = "DistCalcMthdDesc")
    protected DistCalcMthdDescType distCalcMthdDesc;
    @XmlElement(name = "DistSeqOrderDesc")
    protected DistSeqOrderDescType distSeqOrderDesc;
    @XmlElement(name = "DistTrnDesc")
    protected DistTrnDescType distTrnDesc;
    @XmlElement(name = "RecalcDistAmtDesc")
    protected RecalcDistAmtDescType recalcDistAmtDesc;
    @XmlElement(name = "ElecDistAmtDesc")
    protected ElecDistAmtDescType elecDistAmtDesc;
    @XmlElement(name = "ReqMinDistDesc")
    protected ReqMinDistDescType reqMinDistDesc;
    @XmlElement(name = "SoleSpousDistDesc")
    protected SoleSpousDistDescType soleSpousDistDesc;
    @XmlElement(name = "WavMndtryDistDesc")
    protected WavMndtryDistDescType wavMndtryDistDesc;
    @XmlElement(name = "MinRDAAgeOvrrdDesc")
    protected MinRDAAgeOvrrdDescType minRDAAgeOvrrdDesc;
    @XmlElement(name = "RedLastAnnDistDesc")
    protected RedLastAnnDistDescType redLastAnnDistDesc;
    @XmlElement(name = "OwnDistCalcMthdDesc")
    protected OwnDistCalcMthdDescType ownDistCalcMthdDesc;
    @XmlElement(name = "DistStatDesc")
    protected DistStatDescType distStatDesc;
    @XmlElement(name = "ACHSendPreNoteDesc")
    protected ACHSendPreNoteDescType achSendPreNoteDesc;
    @XmlElement(name = "ACHTrnDesc")
    protected ACHTrnDescType achTrnDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the taxPlnDist property.
     * 
     * @return
     *     possible object is
     *     {@link TaxPlnDistCType }
     *     
     */
    public TaxPlnDistCType getTaxPlnDist() {
        return taxPlnDist;
    }

    /**
     * Sets the value of the taxPlnDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPlnDistCType }
     *     
     */
    public void setTaxPlnDist(TaxPlnDistCType value) {
        this.taxPlnDist = value;
    }

    /**
     * Gets the value of the autoStartDistDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AutoStartDistDescType }
     *     
     */
    public AutoStartDistDescType getAutoStartDistDesc() {
        return autoStartDistDesc;
    }

    /**
     * Sets the value of the autoStartDistDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoStartDistDescType }
     *     
     */
    public void setAutoStartDistDesc(AutoStartDistDescType value) {
        this.autoStartDistDesc = value;
    }

    /**
     * Gets the value of the dlyFirstDistDesc property.
     * 
     * @return
     *     possible object is
     *     {@link DlyFirstDistDescType }
     *     
     */
    public DlyFirstDistDescType getDlyFirstDistDesc() {
        return dlyFirstDistDesc;
    }

    /**
     * Sets the value of the dlyFirstDistDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DlyFirstDistDescType }
     *     
     */
    public void setDlyFirstDistDesc(DlyFirstDistDescType value) {
        this.dlyFirstDistDesc = value;
    }

    /**
     * Gets the value of the distAmtRemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link DistAmtRemDescType }
     *     
     */
    public DistAmtRemDescType getDistAmtRemDesc() {
        return distAmtRemDesc;
    }

    /**
     * Sets the value of the distAmtRemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistAmtRemDescType }
     *     
     */
    public void setDistAmtRemDesc(DistAmtRemDescType value) {
        this.distAmtRemDesc = value;
    }

    /**
     * Gets the value of the distFrqDesc property.
     * 
     * @return
     *     possible object is
     *     {@link DistFrqDescType }
     *     
     */
    public DistFrqDescType getDistFrqDesc() {
        return distFrqDesc;
    }

    /**
     * Sets the value of the distFrqDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistFrqDescType }
     *     
     */
    public void setDistFrqDesc(DistFrqDescType value) {
        this.distFrqDesc = value;
    }

    /**
     * Gets the value of the distIncIntDesc property.
     * 
     * @return
     *     possible object is
     *     {@link DistIncIntDescType }
     *     
     */
    public DistIncIntDescType getDistIncIntDesc() {
        return distIncIntDesc;
    }

    /**
     * Sets the value of the distIncIntDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistIncIntDescType }
     *     
     */
    public void setDistIncIntDesc(DistIncIntDescType value) {
        this.distIncIntDesc = value;
    }

    /**
     * Gets the value of the distCalcMthdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link DistCalcMthdDescType }
     *     
     */
    public DistCalcMthdDescType getDistCalcMthdDesc() {
        return distCalcMthdDesc;
    }

    /**
     * Sets the value of the distCalcMthdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistCalcMthdDescType }
     *     
     */
    public void setDistCalcMthdDesc(DistCalcMthdDescType value) {
        this.distCalcMthdDesc = value;
    }

    /**
     * Gets the value of the distSeqOrderDesc property.
     * 
     * @return
     *     possible object is
     *     {@link DistSeqOrderDescType }
     *     
     */
    public DistSeqOrderDescType getDistSeqOrderDesc() {
        return distSeqOrderDesc;
    }

    /**
     * Sets the value of the distSeqOrderDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistSeqOrderDescType }
     *     
     */
    public void setDistSeqOrderDesc(DistSeqOrderDescType value) {
        this.distSeqOrderDesc = value;
    }

    /**
     * Gets the value of the distTrnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link DistTrnDescType }
     *     
     */
    public DistTrnDescType getDistTrnDesc() {
        return distTrnDesc;
    }

    /**
     * Sets the value of the distTrnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistTrnDescType }
     *     
     */
    public void setDistTrnDesc(DistTrnDescType value) {
        this.distTrnDesc = value;
    }

    /**
     * Gets the value of the recalcDistAmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RecalcDistAmtDescType }
     *     
     */
    public RecalcDistAmtDescType getRecalcDistAmtDesc() {
        return recalcDistAmtDesc;
    }

    /**
     * Sets the value of the recalcDistAmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecalcDistAmtDescType }
     *     
     */
    public void setRecalcDistAmtDesc(RecalcDistAmtDescType value) {
        this.recalcDistAmtDesc = value;
    }

    /**
     * Gets the value of the elecDistAmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ElecDistAmtDescType }
     *     
     */
    public ElecDistAmtDescType getElecDistAmtDesc() {
        return elecDistAmtDesc;
    }

    /**
     * Sets the value of the elecDistAmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecDistAmtDescType }
     *     
     */
    public void setElecDistAmtDesc(ElecDistAmtDescType value) {
        this.elecDistAmtDesc = value;
    }

    /**
     * Gets the value of the reqMinDistDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ReqMinDistDescType }
     *     
     */
    public ReqMinDistDescType getReqMinDistDesc() {
        return reqMinDistDesc;
    }

    /**
     * Sets the value of the reqMinDistDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqMinDistDescType }
     *     
     */
    public void setReqMinDistDesc(ReqMinDistDescType value) {
        this.reqMinDistDesc = value;
    }

    /**
     * Gets the value of the soleSpousDistDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SoleSpousDistDescType }
     *     
     */
    public SoleSpousDistDescType getSoleSpousDistDesc() {
        return soleSpousDistDesc;
    }

    /**
     * Sets the value of the soleSpousDistDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoleSpousDistDescType }
     *     
     */
    public void setSoleSpousDistDesc(SoleSpousDistDescType value) {
        this.soleSpousDistDesc = value;
    }

    /**
     * Gets the value of the wavMndtryDistDesc property.
     * 
     * @return
     *     possible object is
     *     {@link WavMndtryDistDescType }
     *     
     */
    public WavMndtryDistDescType getWavMndtryDistDesc() {
        return wavMndtryDistDesc;
    }

    /**
     * Sets the value of the wavMndtryDistDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link WavMndtryDistDescType }
     *     
     */
    public void setWavMndtryDistDesc(WavMndtryDistDescType value) {
        this.wavMndtryDistDesc = value;
    }

    /**
     * Gets the value of the minRDAAgeOvrrdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link MinRDAAgeOvrrdDescType }
     *     
     */
    public MinRDAAgeOvrrdDescType getMinRDAAgeOvrrdDesc() {
        return minRDAAgeOvrrdDesc;
    }

    /**
     * Sets the value of the minRDAAgeOvrrdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinRDAAgeOvrrdDescType }
     *     
     */
    public void setMinRDAAgeOvrrdDesc(MinRDAAgeOvrrdDescType value) {
        this.minRDAAgeOvrrdDesc = value;
    }

    /**
     * Gets the value of the redLastAnnDistDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RedLastAnnDistDescType }
     *     
     */
    public RedLastAnnDistDescType getRedLastAnnDistDesc() {
        return redLastAnnDistDesc;
    }

    /**
     * Sets the value of the redLastAnnDistDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedLastAnnDistDescType }
     *     
     */
    public void setRedLastAnnDistDesc(RedLastAnnDistDescType value) {
        this.redLastAnnDistDesc = value;
    }

    /**
     * Gets the value of the ownDistCalcMthdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OwnDistCalcMthdDescType }
     *     
     */
    public OwnDistCalcMthdDescType getOwnDistCalcMthdDesc() {
        return ownDistCalcMthdDesc;
    }

    /**
     * Sets the value of the ownDistCalcMthdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnDistCalcMthdDescType }
     *     
     */
    public void setOwnDistCalcMthdDesc(OwnDistCalcMthdDescType value) {
        this.ownDistCalcMthdDesc = value;
    }

    /**
     * Gets the value of the distStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link DistStatDescType }
     *     
     */
    public DistStatDescType getDistStatDesc() {
        return distStatDesc;
    }

    /**
     * Sets the value of the distStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistStatDescType }
     *     
     */
    public void setDistStatDesc(DistStatDescType value) {
        this.distStatDesc = value;
    }

    /**
     * Gets the value of the achSendPreNoteDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHSendPreNoteDescType }
     *     
     */
    public ACHSendPreNoteDescType getACHSendPreNoteDesc() {
        return achSendPreNoteDesc;
    }

    /**
     * Sets the value of the achSendPreNoteDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHSendPreNoteDescType }
     *     
     */
    public void setACHSendPreNoteDesc(ACHSendPreNoteDescType value) {
        this.achSendPreNoteDesc = value;
    }

    /**
     * Gets the value of the achTrnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHTrnDescType }
     *     
     */
    public ACHTrnDescType getACHTrnDesc() {
        return achTrnDesc;
    }

    /**
     * Sets the value of the achTrnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHTrnDescType }
     *     
     */
    public void setACHTrnDesc(ACHTrnDescType value) {
        this.achTrnDesc = value;
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
