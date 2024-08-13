
package pro.misoft.jackhenryintegration.generated.inquiry;

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
 * <p>Java class for ACHTempExpsrInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHTempExpsrInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHExpsrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHExpsrDesc_Type"/&gt;
 *         &lt;element name="ACHExpsrStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type"/&gt;
 *         &lt;element name="ACHExpsrExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type"/&gt;
 *         &lt;element name="ACHExpsrStatType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHExpsrStatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHTempExpsrRsn" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHTempExpsrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHExpsrAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ACHTempExpsrInfo_CType", propOrder = {
    "achExpsrDesc",
    "achExpsrStartDt",
    "achExpsrExpDt",
    "achExpsrStatType",
    "offCode",
    "offDesc",
    "achTempExpsrRsn",
    "achTempExpsrAmt",
    "custom",
    "ver1",
    "any"
})
public class ACHTempExpsrInfoCType {

    @XmlElement(name = "ACHExpsrDesc", required = true)
    protected ACHExpsrDescType achExpsrDesc;
    @XmlElement(name = "ACHExpsrStartDt", required = true)
    protected StartDtType achExpsrStartDt;
    @XmlElement(name = "ACHExpsrExpDt", required = true)
    protected ExpDtType achExpsrExpDt;
    @XmlElement(name = "ACHExpsrStatType")
    protected ACHExpsrStatTypeType achExpsrStatType;
    @XmlElement(name = "OffCode")
    protected OffCodeType offCode;
    @XmlElement(name = "OffDesc")
    protected OffDescType offDesc;
    @XmlElement(name = "ACHTempExpsrRsn")
    protected RmkType achTempExpsrRsn;
    @XmlElement(name = "ACHTempExpsrAmt")
    protected ACHExpsrAmtType achTempExpsrAmt;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the achExpsrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHExpsrDescType }
     *     
     */
    public ACHExpsrDescType getACHExpsrDesc() {
        return achExpsrDesc;
    }

    /**
     * Sets the value of the achExpsrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHExpsrDescType }
     *     
     */
    public void setACHExpsrDesc(ACHExpsrDescType value) {
        this.achExpsrDesc = value;
    }

    /**
     * Gets the value of the achExpsrStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartDtType }
     *     
     */
    public StartDtType getACHExpsrStartDt() {
        return achExpsrStartDt;
    }

    /**
     * Sets the value of the achExpsrStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDtType }
     *     
     */
    public void setACHExpsrStartDt(StartDtType value) {
        this.achExpsrStartDt = value;
    }

    /**
     * Gets the value of the achExpsrExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getACHExpsrExpDt() {
        return achExpsrExpDt;
    }

    /**
     * Sets the value of the achExpsrExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setACHExpsrExpDt(ExpDtType value) {
        this.achExpsrExpDt = value;
    }

    /**
     * Gets the value of the achExpsrStatType property.
     * 
     * @return
     *     possible object is
     *     {@link ACHExpsrStatTypeType }
     *     
     */
    public ACHExpsrStatTypeType getACHExpsrStatType() {
        return achExpsrStatType;
    }

    /**
     * Sets the value of the achExpsrStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHExpsrStatTypeType }
     *     
     */
    public void setACHExpsrStatType(ACHExpsrStatTypeType value) {
        this.achExpsrStatType = value;
    }

    /**
     * Gets the value of the offCode property.
     * 
     * @return
     *     possible object is
     *     {@link OffCodeType }
     *     
     */
    public OffCodeType getOffCode() {
        return offCode;
    }

    /**
     * Sets the value of the offCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffCodeType }
     *     
     */
    public void setOffCode(OffCodeType value) {
        this.offCode = value;
    }

    /**
     * Gets the value of the offDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OffDescType }
     *     
     */
    public OffDescType getOffDesc() {
        return offDesc;
    }

    /**
     * Sets the value of the offDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffDescType }
     *     
     */
    public void setOffDesc(OffDescType value) {
        this.offDesc = value;
    }

    /**
     * Gets the value of the achTempExpsrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getACHTempExpsrRsn() {
        return achTempExpsrRsn;
    }

    /**
     * Sets the value of the achTempExpsrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setACHTempExpsrRsn(RmkType value) {
        this.achTempExpsrRsn = value;
    }

    /**
     * Gets the value of the achTempExpsrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ACHExpsrAmtType }
     *     
     */
    public ACHExpsrAmtType getACHTempExpsrAmt() {
        return achTempExpsrAmt;
    }

    /**
     * Sets the value of the achTempExpsrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHExpsrAmtType }
     *     
     */
    public void setACHTempExpsrAmt(ACHExpsrAmtType value) {
        this.achTempExpsrAmt = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public JAXBElement<CustomCType> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public void setCustom(JAXBElement<CustomCType> value) {
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
