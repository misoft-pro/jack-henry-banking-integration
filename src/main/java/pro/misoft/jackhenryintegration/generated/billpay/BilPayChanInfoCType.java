
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * A package of data related to a bill pay channel
 * 
 * <p>Java class for BilPayChanInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilPayChanInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FinInstName" type="{http://jackhenry.com/jxchange/TPG/2008}FinInstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtCutoffTime" type="{http://jackhenry.com/jxchange/TPG/2008}PmtCutoffTime_Type" minOccurs="0"/&gt;
 *         &lt;element name="StorMos" type="{http://jackhenry.com/jxchange/TPG/2008}StorMos_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkImgStorMos" type="{http://jackhenry.com/jxchange/TPG/2008}ChkImgStorMos_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChkFundModel" type="{http://jackhenry.com/jxchange/TPG/2008}ChkFundModel_Type" minOccurs="0"/&gt;
 *         &lt;element name="FundVerif" type="{http://jackhenry.com/jxchange/TPG/2008}FundVerif_Type" minOccurs="0"/&gt;
 *         &lt;element name="NonProcDtInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}NonProcDtInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="BilPayProdTypeInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}BilPayProdTypeInfoArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "BilPayChanInfo_CType", propOrder = {
    "finInstName",
    "pmtCutoffTime",
    "storMos",
    "chkImgStorMos",
    "chkFundModel",
    "fundVerif",
    "nonProcDtInfoArray",
    "bilPayProdTypeInfoArray",
    "custom",
    "ver1",
    "any"
})
public class BilPayChanInfoCType {

    @XmlElement(name = "FinInstName")
    protected FinInstNameType finInstName;
    @XmlElement(name = "PmtCutoffTime")
    protected PmtCutoffTimeType pmtCutoffTime;
    @XmlElement(name = "StorMos")
    protected StorMosType storMos;
    @XmlElement(name = "ChkImgStorMos")
    protected ChkImgStorMosType chkImgStorMos;
    @XmlElement(name = "ChkFundModel")
    protected ChkFundModelType chkFundModel;
    @XmlElement(name = "FundVerif")
    protected FundVerifType fundVerif;
    @XmlElement(name = "NonProcDtInfoArray")
    protected NonProcDtInfoArrayAType nonProcDtInfoArray;
    @XmlElement(name = "BilPayProdTypeInfoArray")
    protected BilPayProdTypeInfoArrayAType bilPayProdTypeInfoArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the finInstName property.
     * 
     * @return
     *     possible object is
     *     {@link FinInstNameType }
     *     
     */
    public FinInstNameType getFinInstName() {
        return finInstName;
    }

    /**
     * Sets the value of the finInstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinInstNameType }
     *     
     */
    public void setFinInstName(FinInstNameType value) {
        this.finInstName = value;
    }

    /**
     * Gets the value of the pmtCutoffTime property.
     * 
     * @return
     *     possible object is
     *     {@link PmtCutoffTimeType }
     *     
     */
    public PmtCutoffTimeType getPmtCutoffTime() {
        return pmtCutoffTime;
    }

    /**
     * Sets the value of the pmtCutoffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtCutoffTimeType }
     *     
     */
    public void setPmtCutoffTime(PmtCutoffTimeType value) {
        this.pmtCutoffTime = value;
    }

    /**
     * Gets the value of the storMos property.
     * 
     * @return
     *     possible object is
     *     {@link StorMosType }
     *     
     */
    public StorMosType getStorMos() {
        return storMos;
    }

    /**
     * Sets the value of the storMos property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorMosType }
     *     
     */
    public void setStorMos(StorMosType value) {
        this.storMos = value;
    }

    /**
     * Gets the value of the chkImgStorMos property.
     * 
     * @return
     *     possible object is
     *     {@link ChkImgStorMosType }
     *     
     */
    public ChkImgStorMosType getChkImgStorMos() {
        return chkImgStorMos;
    }

    /**
     * Sets the value of the chkImgStorMos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkImgStorMosType }
     *     
     */
    public void setChkImgStorMos(ChkImgStorMosType value) {
        this.chkImgStorMos = value;
    }

    /**
     * Gets the value of the chkFundModel property.
     * 
     * @return
     *     possible object is
     *     {@link ChkFundModelType }
     *     
     */
    public ChkFundModelType getChkFundModel() {
        return chkFundModel;
    }

    /**
     * Sets the value of the chkFundModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChkFundModelType }
     *     
     */
    public void setChkFundModel(ChkFundModelType value) {
        this.chkFundModel = value;
    }

    /**
     * Gets the value of the fundVerif property.
     * 
     * @return
     *     possible object is
     *     {@link FundVerifType }
     *     
     */
    public FundVerifType getFundVerif() {
        return fundVerif;
    }

    /**
     * Sets the value of the fundVerif property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundVerifType }
     *     
     */
    public void setFundVerif(FundVerifType value) {
        this.fundVerif = value;
    }

    /**
     * Gets the value of the nonProcDtInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link NonProcDtInfoArrayAType }
     *     
     */
    public NonProcDtInfoArrayAType getNonProcDtInfoArray() {
        return nonProcDtInfoArray;
    }

    /**
     * Sets the value of the nonProcDtInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonProcDtInfoArrayAType }
     *     
     */
    public void setNonProcDtInfoArray(NonProcDtInfoArrayAType value) {
        this.nonProcDtInfoArray = value;
    }

    /**
     * Gets the value of the bilPayProdTypeInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link BilPayProdTypeInfoArrayAType }
     *     
     */
    public BilPayProdTypeInfoArrayAType getBilPayProdTypeInfoArray() {
        return bilPayProdTypeInfoArray;
    }

    /**
     * Sets the value of the bilPayProdTypeInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilPayProdTypeInfoArrayAType }
     *     
     */
    public void setBilPayProdTypeInfoArray(BilPayProdTypeInfoArrayAType value) {
        this.bilPayProdTypeInfoArray = value;
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
     * {@link Element }
     * {@link Object }
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
