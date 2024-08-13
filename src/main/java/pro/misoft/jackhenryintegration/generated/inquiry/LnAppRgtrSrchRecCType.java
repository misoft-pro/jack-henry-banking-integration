
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
 * <p>Java class for LnAppRgtrSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnAppRgtrSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResLnAppRgtrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}ResLnAppRgtrInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnAppBorwInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnAppBorwInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="LnAppCoBorwArray" type="{http://jackhenry.com/jxchange/TPG/2008}LnAppCoBorwArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="LnAppId" type="{http://jackhenry.com/jxchange/TPG/2008}LnAppId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrAppDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrAppDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PurpDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PurpDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PropDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PropDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="OccupDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OccupDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AppStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AppStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRASMSADesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRASMSADesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRACountyDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRACountyDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecdMtgDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SecdMtgDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="HOEPAStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}HOEPAStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LienStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LienStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRADelinDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRADelinDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FHLBPropDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FHLBPropDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PreApprvAppDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PreApprvAppDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnPurpDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PurpDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomLnAppRgtrSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="MHSecuredPropDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MHSecuredPropDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="MHLandPropIntDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MHLandPropIntDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnAppRgtrSrchRec_CType", propOrder = {
    "resLnAppRgtrInfo",
    "lnAppBorwInfo",
    "lnAppCoBorwArray",
    "lnAppId",
    "crAppDesc",
    "purpDesc",
    "propDesc",
    "occupDesc",
    "appStatDesc",
    "crasmsaDesc",
    "craCountyDesc",
    "secdMtgDesc",
    "hoepaStatDesc",
    "lienStatDesc",
    "craDelinDesc",
    "fhlbPropDesc",
    "preApprvAppDesc",
    "lnPurpDesc",
    "customLnAppRgtrSrchRec",
    "ver1",
    "mhSecuredPropDesc",
    "mhLandPropIntDesc",
    "ver2",
    "any"
})
public class LnAppRgtrSrchRecCType {

    @XmlElement(name = "ResLnAppRgtrInfo")
    protected ResLnAppRgtrInfoCType resLnAppRgtrInfo;
    @XmlElement(name = "LnAppBorwInfo")
    protected LnAppBorwInfoCType lnAppBorwInfo;
    @XmlElement(name = "LnAppCoBorwArray")
    protected LnAppCoBorwArrayAType lnAppCoBorwArray;
    @XmlElement(name = "LnAppId")
    protected LnAppIdType lnAppId;
    @XmlElement(name = "CrAppDesc")
    protected CrAppDescType crAppDesc;
    @XmlElement(name = "PurpDesc")
    protected PurpDescType purpDesc;
    @XmlElement(name = "PropDesc")
    protected PropDescType propDesc;
    @XmlElement(name = "OccupDesc")
    protected OccupDescType occupDesc;
    @XmlElement(name = "AppStatDesc")
    protected AppStatDescType appStatDesc;
    @XmlElement(name = "CRASMSADesc")
    protected CRASMSADescType crasmsaDesc;
    @XmlElement(name = "CRACountyDesc")
    protected CRACountyDescType craCountyDesc;
    @XmlElement(name = "SecdMtgDesc")
    protected SecdMtgDescType secdMtgDesc;
    @XmlElement(name = "HOEPAStatDesc")
    protected HOEPAStatDescType hoepaStatDesc;
    @XmlElement(name = "LienStatDesc")
    protected LienStatDescType lienStatDesc;
    @XmlElement(name = "CRADelinDesc")
    protected CRADelinDescType craDelinDesc;
    @XmlElement(name = "FHLBPropDesc")
    protected FHLBPropDescType fhlbPropDesc;
    @XmlElement(name = "PreApprvAppDesc")
    protected PreApprvAppDescType preApprvAppDesc;
    @XmlElement(name = "LnPurpDesc")
    protected PurpDescType lnPurpDesc;
    @XmlElement(name = "CustomLnAppRgtrSrchRec")
    protected CustomCType customLnAppRgtrSrchRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "MHSecuredPropDesc")
    protected MHSecuredPropDescType mhSecuredPropDesc;
    @XmlElement(name = "MHLandPropIntDesc")
    protected MHLandPropIntDescType mhLandPropIntDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the resLnAppRgtrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ResLnAppRgtrInfoCType }
     *     
     */
    public ResLnAppRgtrInfoCType getResLnAppRgtrInfo() {
        return resLnAppRgtrInfo;
    }

    /**
     * Sets the value of the resLnAppRgtrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResLnAppRgtrInfoCType }
     *     
     */
    public void setResLnAppRgtrInfo(ResLnAppRgtrInfoCType value) {
        this.resLnAppRgtrInfo = value;
    }

    /**
     * Gets the value of the lnAppBorwInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnAppBorwInfoCType }
     *     
     */
    public LnAppBorwInfoCType getLnAppBorwInfo() {
        return lnAppBorwInfo;
    }

    /**
     * Sets the value of the lnAppBorwInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnAppBorwInfoCType }
     *     
     */
    public void setLnAppBorwInfo(LnAppBorwInfoCType value) {
        this.lnAppBorwInfo = value;
    }

    /**
     * Gets the value of the lnAppCoBorwArray property.
     * 
     * @return
     *     possible object is
     *     {@link LnAppCoBorwArrayAType }
     *     
     */
    public LnAppCoBorwArrayAType getLnAppCoBorwArray() {
        return lnAppCoBorwArray;
    }

    /**
     * Sets the value of the lnAppCoBorwArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnAppCoBorwArrayAType }
     *     
     */
    public void setLnAppCoBorwArray(LnAppCoBorwArrayAType value) {
        this.lnAppCoBorwArray = value;
    }

    /**
     * Gets the value of the lnAppId property.
     * 
     * @return
     *     possible object is
     *     {@link LnAppIdType }
     *     
     */
    public LnAppIdType getLnAppId() {
        return lnAppId;
    }

    /**
     * Sets the value of the lnAppId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnAppIdType }
     *     
     */
    public void setLnAppId(LnAppIdType value) {
        this.lnAppId = value;
    }

    /**
     * Gets the value of the crAppDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrAppDescType }
     *     
     */
    public CrAppDescType getCrAppDesc() {
        return crAppDesc;
    }

    /**
     * Sets the value of the crAppDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrAppDescType }
     *     
     */
    public void setCrAppDesc(CrAppDescType value) {
        this.crAppDesc = value;
    }

    /**
     * Gets the value of the purpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PurpDescType }
     *     
     */
    public PurpDescType getPurpDesc() {
        return purpDesc;
    }

    /**
     * Sets the value of the purpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurpDescType }
     *     
     */
    public void setPurpDesc(PurpDescType value) {
        this.purpDesc = value;
    }

    /**
     * Gets the value of the propDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PropDescType }
     *     
     */
    public PropDescType getPropDesc() {
        return propDesc;
    }

    /**
     * Sets the value of the propDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropDescType }
     *     
     */
    public void setPropDesc(PropDescType value) {
        this.propDesc = value;
    }

    /**
     * Gets the value of the occupDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OccupDescType }
     *     
     */
    public OccupDescType getOccupDesc() {
        return occupDesc;
    }

    /**
     * Sets the value of the occupDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupDescType }
     *     
     */
    public void setOccupDesc(OccupDescType value) {
        this.occupDesc = value;
    }

    /**
     * Gets the value of the appStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AppStatDescType }
     *     
     */
    public AppStatDescType getAppStatDesc() {
        return appStatDesc;
    }

    /**
     * Sets the value of the appStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppStatDescType }
     *     
     */
    public void setAppStatDesc(AppStatDescType value) {
        this.appStatDesc = value;
    }

    /**
     * Gets the value of the crasmsaDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRASMSADescType }
     *     
     */
    public CRASMSADescType getCRASMSADesc() {
        return crasmsaDesc;
    }

    /**
     * Sets the value of the crasmsaDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRASMSADescType }
     *     
     */
    public void setCRASMSADesc(CRASMSADescType value) {
        this.crasmsaDesc = value;
    }

    /**
     * Gets the value of the craCountyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRACountyDescType }
     *     
     */
    public CRACountyDescType getCRACountyDesc() {
        return craCountyDesc;
    }

    /**
     * Sets the value of the craCountyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRACountyDescType }
     *     
     */
    public void setCRACountyDesc(CRACountyDescType value) {
        this.craCountyDesc = value;
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
     * Gets the value of the lienStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LienStatDescType }
     *     
     */
    public LienStatDescType getLienStatDesc() {
        return lienStatDesc;
    }

    /**
     * Sets the value of the lienStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LienStatDescType }
     *     
     */
    public void setLienStatDesc(LienStatDescType value) {
        this.lienStatDesc = value;
    }

    /**
     * Gets the value of the craDelinDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRADelinDescType }
     *     
     */
    public CRADelinDescType getCRADelinDesc() {
        return craDelinDesc;
    }

    /**
     * Sets the value of the craDelinDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRADelinDescType }
     *     
     */
    public void setCRADelinDesc(CRADelinDescType value) {
        this.craDelinDesc = value;
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
     * Gets the value of the preApprvAppDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PreApprvAppDescType }
     *     
     */
    public PreApprvAppDescType getPreApprvAppDesc() {
        return preApprvAppDesc;
    }

    /**
     * Sets the value of the preApprvAppDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreApprvAppDescType }
     *     
     */
    public void setPreApprvAppDesc(PreApprvAppDescType value) {
        this.preApprvAppDesc = value;
    }

    /**
     * Gets the value of the lnPurpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PurpDescType }
     *     
     */
    public PurpDescType getLnPurpDesc() {
        return lnPurpDesc;
    }

    /**
     * Sets the value of the lnPurpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurpDescType }
     *     
     */
    public void setLnPurpDesc(PurpDescType value) {
        this.lnPurpDesc = value;
    }

    /**
     * Gets the value of the customLnAppRgtrSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomLnAppRgtrSrchRec() {
        return customLnAppRgtrSrchRec;
    }

    /**
     * Sets the value of the customLnAppRgtrSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomLnAppRgtrSrchRec(CustomCType value) {
        this.customLnAppRgtrSrchRec = value;
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
     * Gets the value of the mhSecuredPropDesc property.
     * 
     * @return
     *     possible object is
     *     {@link MHSecuredPropDescType }
     *     
     */
    public MHSecuredPropDescType getMHSecuredPropDesc() {
        return mhSecuredPropDesc;
    }

    /**
     * Sets the value of the mhSecuredPropDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MHSecuredPropDescType }
     *     
     */
    public void setMHSecuredPropDesc(MHSecuredPropDescType value) {
        this.mhSecuredPropDesc = value;
    }

    /**
     * Gets the value of the mhLandPropIntDesc property.
     * 
     * @return
     *     possible object is
     *     {@link MHLandPropIntDescType }
     *     
     */
    public MHLandPropIntDescType getMHLandPropIntDesc() {
        return mhLandPropIntDesc;
    }

    /**
     * Sets the value of the mhLandPropIntDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MHLandPropIntDescType }
     *     
     */
    public void setMHLandPropIntDesc(MHLandPropIntDescType value) {
        this.mhLandPropIntDesc = value;
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
