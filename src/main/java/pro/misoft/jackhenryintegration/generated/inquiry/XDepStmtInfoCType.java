
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
 * <p>Java class for x_DepStmtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_DepStmtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepStmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepStmtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="StmtBal" type="{http://jackhenry.com/jxchange/TPG/2008}StmtBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImgPrtChkOrderDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ImgPrtChkOrderDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImgItemsPerPgDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ImgItemsPerPgDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImgItemsFrntBackDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ImgItemsFrntBackDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImgIncCrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ImgIncCrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtCycResetFreqDesc" type="{http://jackhenry.com/jxchange/TPG/2008}StmtCycResetFreqDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtFormatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}StmtFormatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtPrtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}StmtPrtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtFreqDesc" type="{http://jackhenry.com/jxchange/TPG/2008}StmtFreqDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ElecStmtSvcFeeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ElecStmtSvcFeeDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_DepStmtInfo_CType", propOrder = {
    "depStmtInfo",
    "stmtBal",
    "imgPrtChkOrderDesc",
    "imgItemsPerPgDesc",
    "imgItemsFrntBackDesc",
    "imgIncCrDesc",
    "stmtCycResetFreqDesc",
    "stmtFormatDesc",
    "stmtPrtDesc",
    "stmtFreqDesc",
    "custom",
    "ver1",
    "elecStmtSvcFeeDesc",
    "ver2",
    "any"
})
public class XDepStmtInfoCType {

    @XmlElement(name = "DepStmtInfo")
    protected DepStmtInfoCType depStmtInfo;
    @XmlElement(name = "StmtBal")
    protected StmtBalType stmtBal;
    @XmlElement(name = "ImgPrtChkOrderDesc")
    protected ImgPrtChkOrderDescType imgPrtChkOrderDesc;
    @XmlElement(name = "ImgItemsPerPgDesc")
    protected ImgItemsPerPgDescType imgItemsPerPgDesc;
    @XmlElement(name = "ImgItemsFrntBackDesc")
    protected ImgItemsFrntBackDescType imgItemsFrntBackDesc;
    @XmlElement(name = "ImgIncCrDesc")
    protected ImgIncCrDescType imgIncCrDesc;
    @XmlElement(name = "StmtCycResetFreqDesc")
    protected StmtCycResetFreqDescType stmtCycResetFreqDesc;
    @XmlElement(name = "StmtFormatDesc")
    protected StmtFormatDescType stmtFormatDesc;
    @XmlElement(name = "StmtPrtDesc")
    protected StmtPrtDescType stmtPrtDesc;
    @XmlElement(name = "StmtFreqDesc")
    protected StmtFreqDescType stmtFreqDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ElecStmtSvcFeeDesc")
    protected ElecStmtSvcFeeDescType elecStmtSvcFeeDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the depStmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepStmtInfoCType }
     *     
     */
    public DepStmtInfoCType getDepStmtInfo() {
        return depStmtInfo;
    }

    /**
     * Sets the value of the depStmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepStmtInfoCType }
     *     
     */
    public void setDepStmtInfo(DepStmtInfoCType value) {
        this.depStmtInfo = value;
    }

    /**
     * Gets the value of the stmtBal property.
     * 
     * @return
     *     possible object is
     *     {@link StmtBalType }
     *     
     */
    public StmtBalType getStmtBal() {
        return stmtBal;
    }

    /**
     * Sets the value of the stmtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtBalType }
     *     
     */
    public void setStmtBal(StmtBalType value) {
        this.stmtBal = value;
    }

    /**
     * Gets the value of the imgPrtChkOrderDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ImgPrtChkOrderDescType }
     *     
     */
    public ImgPrtChkOrderDescType getImgPrtChkOrderDesc() {
        return imgPrtChkOrderDesc;
    }

    /**
     * Sets the value of the imgPrtChkOrderDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImgPrtChkOrderDescType }
     *     
     */
    public void setImgPrtChkOrderDesc(ImgPrtChkOrderDescType value) {
        this.imgPrtChkOrderDesc = value;
    }

    /**
     * Gets the value of the imgItemsPerPgDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ImgItemsPerPgDescType }
     *     
     */
    public ImgItemsPerPgDescType getImgItemsPerPgDesc() {
        return imgItemsPerPgDesc;
    }

    /**
     * Sets the value of the imgItemsPerPgDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImgItemsPerPgDescType }
     *     
     */
    public void setImgItemsPerPgDesc(ImgItemsPerPgDescType value) {
        this.imgItemsPerPgDesc = value;
    }

    /**
     * Gets the value of the imgItemsFrntBackDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ImgItemsFrntBackDescType }
     *     
     */
    public ImgItemsFrntBackDescType getImgItemsFrntBackDesc() {
        return imgItemsFrntBackDesc;
    }

    /**
     * Sets the value of the imgItemsFrntBackDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImgItemsFrntBackDescType }
     *     
     */
    public void setImgItemsFrntBackDesc(ImgItemsFrntBackDescType value) {
        this.imgItemsFrntBackDesc = value;
    }

    /**
     * Gets the value of the imgIncCrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ImgIncCrDescType }
     *     
     */
    public ImgIncCrDescType getImgIncCrDesc() {
        return imgIncCrDesc;
    }

    /**
     * Sets the value of the imgIncCrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImgIncCrDescType }
     *     
     */
    public void setImgIncCrDesc(ImgIncCrDescType value) {
        this.imgIncCrDesc = value;
    }

    /**
     * Gets the value of the stmtCycResetFreqDesc property.
     * 
     * @return
     *     possible object is
     *     {@link StmtCycResetFreqDescType }
     *     
     */
    public StmtCycResetFreqDescType getStmtCycResetFreqDesc() {
        return stmtCycResetFreqDesc;
    }

    /**
     * Sets the value of the stmtCycResetFreqDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtCycResetFreqDescType }
     *     
     */
    public void setStmtCycResetFreqDesc(StmtCycResetFreqDescType value) {
        this.stmtCycResetFreqDesc = value;
    }

    /**
     * Gets the value of the stmtFormatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link StmtFormatDescType }
     *     
     */
    public StmtFormatDescType getStmtFormatDesc() {
        return stmtFormatDesc;
    }

    /**
     * Sets the value of the stmtFormatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtFormatDescType }
     *     
     */
    public void setStmtFormatDesc(StmtFormatDescType value) {
        this.stmtFormatDesc = value;
    }

    /**
     * Gets the value of the stmtPrtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link StmtPrtDescType }
     *     
     */
    public StmtPrtDescType getStmtPrtDesc() {
        return stmtPrtDesc;
    }

    /**
     * Sets the value of the stmtPrtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtPrtDescType }
     *     
     */
    public void setStmtPrtDesc(StmtPrtDescType value) {
        this.stmtPrtDesc = value;
    }

    /**
     * Gets the value of the stmtFreqDesc property.
     * 
     * @return
     *     possible object is
     *     {@link StmtFreqDescType }
     *     
     */
    public StmtFreqDescType getStmtFreqDesc() {
        return stmtFreqDesc;
    }

    /**
     * Sets the value of the stmtFreqDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtFreqDescType }
     *     
     */
    public void setStmtFreqDesc(StmtFreqDescType value) {
        this.stmtFreqDesc = value;
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
     * Gets the value of the elecStmtSvcFeeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ElecStmtSvcFeeDescType }
     *     
     */
    public ElecStmtSvcFeeDescType getElecStmtSvcFeeDesc() {
        return elecStmtSvcFeeDesc;
    }

    /**
     * Sets the value of the elecStmtSvcFeeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecStmtSvcFeeDescType }
     *     
     */
    public void setElecStmtSvcFeeDesc(ElecStmtSvcFeeDescType value) {
        this.elecStmtSvcFeeDesc = value;
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
