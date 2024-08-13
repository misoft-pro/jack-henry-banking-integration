
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for EFTCardCntryInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardCntryInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardCntryExcType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardCntryExcType_Type"/&gt;
 *         &lt;element name="CntryType" type="{http://jackhenry.com/jxchange/TPG/2008}CntryType_Type"/&gt;
 *         &lt;element name="Cntry" type="{http://jackhenry.com/jxchange/TPG/2008}Cntry_Type" minOccurs="0"/&gt;
 *         &lt;element name="CntryExcStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="Dlt" type="{http://jackhenry.com/jxchange/TPG/2008}Dlt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EFTCardCntryInfo_CType", propOrder = {
    "eftCardCntryExcType",
    "cntryType",
    "cntry",
    "cntryExcStartDt",
    "expDt",
    "ver1",
    "dlt",
    "ver2",
    "any"
})
public class EFTCardCntryInfoCType {

    @XmlElement(name = "EFTCardCntryExcType", required = true)
    protected EFTCardCntryExcTypeType eftCardCntryExcType;
    @XmlElement(name = "CntryType", required = true)
    protected CntryTypeType cntryType;
    @XmlElement(name = "Cntry")
    protected CntryType cntry;
    @XmlElement(name = "CntryExcStartDt")
    protected StartDtType cntryExcStartDt;
    @XmlElement(name = "ExpDt")
    protected ExpDtType expDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "Dlt")
    protected DltType dlt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eftCardCntryExcType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardCntryExcTypeType }
     *     
     */
    public EFTCardCntryExcTypeType getEFTCardCntryExcType() {
        return eftCardCntryExcType;
    }

    /**
     * Sets the value of the eftCardCntryExcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardCntryExcTypeType }
     *     
     */
    public void setEFTCardCntryExcType(EFTCardCntryExcTypeType value) {
        this.eftCardCntryExcType = value;
    }

    /**
     * Gets the value of the cntryType property.
     * 
     * @return
     *     possible object is
     *     {@link CntryTypeType }
     *     
     */
    public CntryTypeType getCntryType() {
        return cntryType;
    }

    /**
     * Sets the value of the cntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntryTypeType }
     *     
     */
    public void setCntryType(CntryTypeType value) {
        this.cntryType = value;
    }

    /**
     * Gets the value of the cntry property.
     * 
     * @return
     *     possible object is
     *     {@link CntryType }
     *     
     */
    public CntryType getCntry() {
        return cntry;
    }

    /**
     * Sets the value of the cntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntryType }
     *     
     */
    public void setCntry(CntryType value) {
        this.cntry = value;
    }

    /**
     * Gets the value of the cntryExcStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartDtType }
     *     
     */
    public StartDtType getCntryExcStartDt() {
        return cntryExcStartDt;
    }

    /**
     * Sets the value of the cntryExcStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDtType }
     *     
     */
    public void setCntryExcStartDt(StartDtType value) {
        this.cntryExcStartDt = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setExpDt(ExpDtType value) {
        this.expDt = value;
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
     * Gets the value of the dlt property.
     * 
     * @return
     *     possible object is
     *     {@link DltType }
     *     
     */
    public DltType getDlt() {
        return dlt;
    }

    /**
     * Sets the value of the dlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DltType }
     *     
     */
    public void setDlt(DltType value) {
        this.dlt = value;
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
