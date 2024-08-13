
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
 * <p>Java class for x_LnMtgInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_LnMtgInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnMtgInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnMtgInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="PredatoryLnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PredatoryLnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FHLBApprDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FHLBApprDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FHLBDocDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FHLBDocDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnFeatureDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LnFeatureDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FHAVADesc" type="{http://jackhenry.com/jxchange/TPG/2008}FHAVADesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="HOEPAStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}HOEPAStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnOrigSrcDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LnOrigSrcDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FHLBProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FHLBProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FHLBPurpDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FHLBPurpDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="MHOccupDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MHOccupDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="MtgInsurDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MtgInsurDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PledgeLnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PledgeLnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FHLBPropDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FHLBPropDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="RedDocDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RedDocDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvlSecdMktgDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AvlSecdMktgDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecdMtgDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SecdMtgDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubDebtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SubDebtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="QualMtgDesc" type="{http://jackhenry.com/jxchange/TPG/2008}QualMtgDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="QualResMtgDesc" type="{http://jackhenry.com/jxchange/TPG/2008}QualResMtgDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_LnMtgInfo_CType", propOrder = {
    "lnMtgInfo",
    "predatoryLnDesc",
    "fhlbApprDesc",
    "fhlbDocDesc",
    "lnFeatureDesc",
    "fhavaDesc",
    "hoepaStatDesc",
    "lnOrigSrcDesc",
    "fhlbProdDesc",
    "fhlbPurpDesc",
    "mhOccupDesc",
    "mtgInsurDesc",
    "pledgeLnDesc",
    "fhlbPropDesc",
    "redDocDesc",
    "avlSecdMktgDesc",
    "secdMtgDesc",
    "subDebtDesc",
    "custom",
    "ver1",
    "qualMtgDesc",
    "qualResMtgDesc",
    "ver2",
    "any"
})
public class XLnMtgInfoCType {

    @XmlElement(name = "LnMtgInfo")
    protected LnMtgInfoCType lnMtgInfo;
    @XmlElement(name = "PredatoryLnDesc")
    protected PredatoryLnDescType predatoryLnDesc;
    @XmlElement(name = "FHLBApprDesc")
    protected FHLBApprDescType fhlbApprDesc;
    @XmlElement(name = "FHLBDocDesc")
    protected FHLBDocDescType fhlbDocDesc;
    @XmlElement(name = "LnFeatureDesc")
    protected LnFeatureDescType lnFeatureDesc;
    @XmlElement(name = "FHAVADesc")
    protected FHAVADescType fhavaDesc;
    @XmlElement(name = "HOEPAStatDesc")
    protected HOEPAStatDescType hoepaStatDesc;
    @XmlElement(name = "LnOrigSrcDesc")
    protected LnOrigSrcDescType lnOrigSrcDesc;
    @XmlElement(name = "FHLBProdDesc")
    protected FHLBProdDescType fhlbProdDesc;
    @XmlElement(name = "FHLBPurpDesc")
    protected FHLBPurpDescType fhlbPurpDesc;
    @XmlElement(name = "MHOccupDesc")
    protected MHOccupDescType mhOccupDesc;
    @XmlElement(name = "MtgInsurDesc")
    protected MtgInsurDescType mtgInsurDesc;
    @XmlElement(name = "PledgeLnDesc")
    protected PledgeLnDescType pledgeLnDesc;
    @XmlElement(name = "FHLBPropDesc")
    protected FHLBPropDescType fhlbPropDesc;
    @XmlElement(name = "RedDocDesc")
    protected RedDocDescType redDocDesc;
    @XmlElement(name = "AvlSecdMktgDesc")
    protected AvlSecdMktgDescType avlSecdMktgDesc;
    @XmlElement(name = "SecdMtgDesc")
    protected SecdMtgDescType secdMtgDesc;
    @XmlElement(name = "SubDebtDesc")
    protected SubDebtDescType subDebtDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "QualMtgDesc")
    protected QualMtgDescType qualMtgDesc;
    @XmlElement(name = "QualResMtgDesc")
    protected QualResMtgDescType qualResMtgDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnMtgInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnMtgInfoCType }
     *     
     */
    public LnMtgInfoCType getLnMtgInfo() {
        return lnMtgInfo;
    }

    /**
     * Sets the value of the lnMtgInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnMtgInfoCType }
     *     
     */
    public void setLnMtgInfo(LnMtgInfoCType value) {
        this.lnMtgInfo = value;
    }

    /**
     * Gets the value of the predatoryLnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PredatoryLnDescType }
     *     
     */
    public PredatoryLnDescType getPredatoryLnDesc() {
        return predatoryLnDesc;
    }

    /**
     * Sets the value of the predatoryLnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredatoryLnDescType }
     *     
     */
    public void setPredatoryLnDesc(PredatoryLnDescType value) {
        this.predatoryLnDesc = value;
    }

    /**
     * Gets the value of the fhlbApprDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FHLBApprDescType }
     *     
     */
    public FHLBApprDescType getFHLBApprDesc() {
        return fhlbApprDesc;
    }

    /**
     * Sets the value of the fhlbApprDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FHLBApprDescType }
     *     
     */
    public void setFHLBApprDesc(FHLBApprDescType value) {
        this.fhlbApprDesc = value;
    }

    /**
     * Gets the value of the fhlbDocDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FHLBDocDescType }
     *     
     */
    public FHLBDocDescType getFHLBDocDesc() {
        return fhlbDocDesc;
    }

    /**
     * Sets the value of the fhlbDocDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FHLBDocDescType }
     *     
     */
    public void setFHLBDocDesc(FHLBDocDescType value) {
        this.fhlbDocDesc = value;
    }

    /**
     * Gets the value of the lnFeatureDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LnFeatureDescType }
     *     
     */
    public LnFeatureDescType getLnFeatureDesc() {
        return lnFeatureDesc;
    }

    /**
     * Sets the value of the lnFeatureDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnFeatureDescType }
     *     
     */
    public void setLnFeatureDesc(LnFeatureDescType value) {
        this.lnFeatureDesc = value;
    }

    /**
     * Gets the value of the fhavaDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FHAVADescType }
     *     
     */
    public FHAVADescType getFHAVADesc() {
        return fhavaDesc;
    }

    /**
     * Sets the value of the fhavaDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FHAVADescType }
     *     
     */
    public void setFHAVADesc(FHAVADescType value) {
        this.fhavaDesc = value;
    }

    /**
     * Gets the value of the hoepaStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link HOEPAStatDescType }
     *     
     */
    public HOEPAStatDescType getHOEPAStatDesc() {
        return hoepaStatDesc;
    }

    /**
     * Sets the value of the hoepaStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link HOEPAStatDescType }
     *     
     */
    public void setHOEPAStatDesc(HOEPAStatDescType value) {
        this.hoepaStatDesc = value;
    }

    /**
     * Gets the value of the lnOrigSrcDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LnOrigSrcDescType }
     *     
     */
    public LnOrigSrcDescType getLnOrigSrcDesc() {
        return lnOrigSrcDesc;
    }

    /**
     * Sets the value of the lnOrigSrcDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnOrigSrcDescType }
     *     
     */
    public void setLnOrigSrcDesc(LnOrigSrcDescType value) {
        this.lnOrigSrcDesc = value;
    }

    /**
     * Gets the value of the fhlbProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FHLBProdDescType }
     *     
     */
    public FHLBProdDescType getFHLBProdDesc() {
        return fhlbProdDesc;
    }

    /**
     * Sets the value of the fhlbProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FHLBProdDescType }
     *     
     */
    public void setFHLBProdDesc(FHLBProdDescType value) {
        this.fhlbProdDesc = value;
    }

    /**
     * Gets the value of the fhlbPurpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FHLBPurpDescType }
     *     
     */
    public FHLBPurpDescType getFHLBPurpDesc() {
        return fhlbPurpDesc;
    }

    /**
     * Sets the value of the fhlbPurpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FHLBPurpDescType }
     *     
     */
    public void setFHLBPurpDesc(FHLBPurpDescType value) {
        this.fhlbPurpDesc = value;
    }

    /**
     * Gets the value of the mhOccupDesc property.
     * 
     * @return
     *     possible object is
     *     {@link MHOccupDescType }
     *     
     */
    public MHOccupDescType getMHOccupDesc() {
        return mhOccupDesc;
    }

    /**
     * Sets the value of the mhOccupDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MHOccupDescType }
     *     
     */
    public void setMHOccupDesc(MHOccupDescType value) {
        this.mhOccupDesc = value;
    }

    /**
     * Gets the value of the mtgInsurDesc property.
     * 
     * @return
     *     possible object is
     *     {@link MtgInsurDescType }
     *     
     */
    public MtgInsurDescType getMtgInsurDesc() {
        return mtgInsurDesc;
    }

    /**
     * Sets the value of the mtgInsurDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MtgInsurDescType }
     *     
     */
    public void setMtgInsurDesc(MtgInsurDescType value) {
        this.mtgInsurDesc = value;
    }

    /**
     * Gets the value of the pledgeLnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeLnDescType }
     *     
     */
    public PledgeLnDescType getPledgeLnDesc() {
        return pledgeLnDesc;
    }

    /**
     * Sets the value of the pledgeLnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeLnDescType }
     *     
     */
    public void setPledgeLnDesc(PledgeLnDescType value) {
        this.pledgeLnDesc = value;
    }

    /**
     * Gets the value of the fhlbPropDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FHLBPropDescType }
     *     
     */
    public FHLBPropDescType getFHLBPropDesc() {
        return fhlbPropDesc;
    }

    /**
     * Sets the value of the fhlbPropDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FHLBPropDescType }
     *     
     */
    public void setFHLBPropDesc(FHLBPropDescType value) {
        this.fhlbPropDesc = value;
    }

    /**
     * Gets the value of the redDocDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RedDocDescType }
     *     
     */
    public RedDocDescType getRedDocDesc() {
        return redDocDesc;
    }

    /**
     * Sets the value of the redDocDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedDocDescType }
     *     
     */
    public void setRedDocDesc(RedDocDescType value) {
        this.redDocDesc = value;
    }

    /**
     * Gets the value of the avlSecdMktgDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AvlSecdMktgDescType }
     *     
     */
    public AvlSecdMktgDescType getAvlSecdMktgDesc() {
        return avlSecdMktgDesc;
    }

    /**
     * Sets the value of the avlSecdMktgDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvlSecdMktgDescType }
     *     
     */
    public void setAvlSecdMktgDesc(AvlSecdMktgDescType value) {
        this.avlSecdMktgDesc = value;
    }

    /**
     * Gets the value of the secdMtgDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SecdMtgDescType }
     *     
     */
    public SecdMtgDescType getSecdMtgDesc() {
        return secdMtgDesc;
    }

    /**
     * Sets the value of the secdMtgDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecdMtgDescType }
     *     
     */
    public void setSecdMtgDesc(SecdMtgDescType value) {
        this.secdMtgDesc = value;
    }

    /**
     * Gets the value of the subDebtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SubDebtDescType }
     *     
     */
    public SubDebtDescType getSubDebtDesc() {
        return subDebtDesc;
    }

    /**
     * Sets the value of the subDebtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubDebtDescType }
     *     
     */
    public void setSubDebtDesc(SubDebtDescType value) {
        this.subDebtDesc = value;
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
     * Gets the value of the qualMtgDesc property.
     * 
     * @return
     *     possible object is
     *     {@link QualMtgDescType }
     *     
     */
    public QualMtgDescType getQualMtgDesc() {
        return qualMtgDesc;
    }

    /**
     * Sets the value of the qualMtgDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualMtgDescType }
     *     
     */
    public void setQualMtgDesc(QualMtgDescType value) {
        this.qualMtgDesc = value;
    }

    /**
     * Gets the value of the qualResMtgDesc property.
     * 
     * @return
     *     possible object is
     *     {@link QualResMtgDescType }
     *     
     */
    public QualResMtgDescType getQualResMtgDesc() {
        return qualResMtgDesc;
    }

    /**
     * Sets the value of the qualResMtgDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualResMtgDescType }
     *     
     */
    public void setQualResMtgDesc(QualResMtgDescType value) {
        this.qualResMtgDesc = value;
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
