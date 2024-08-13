
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
 * <p>Java class for ACHFltrRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHFltrRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHAlwTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHAlwTrnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHStdEntryClass" type="{http://jackhenry.com/jxchange/TPG/2008}ACHStdEntryClass_Type" minOccurs="0"/&gt;
 *         &lt;element name="LowAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LowAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="HighAmt" type="{http://jackhenry.com/jxchange/TPG/2008}HighAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFltrStatType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFltrStatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompAlwType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompAlwType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ACHCompFltrId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompFltrId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ACHFltrRec_CType", propOrder = {
    "achAlwTrnType",
    "achCompId",
    "achCompName",
    "achStdEntryClass",
    "lowAmt",
    "highAmt",
    "expDt",
    "achFltrStatType",
    "achCompAlwType",
    "custom",
    "ver1",
    "achCompFltrId",
    "ver2",
    "any"
})
public class ACHFltrRecCType {

    @XmlElement(name = "ACHAlwTrnType")
    protected ACHAlwTrnTypeType achAlwTrnType;
    @XmlElement(name = "ACHCompId")
    protected ACHCompIdType achCompId;
    @XmlElement(name = "ACHCompName")
    protected ACHCompNameType achCompName;
    @XmlElement(name = "ACHStdEntryClass")
    protected ACHStdEntryClassType achStdEntryClass;
    @XmlElement(name = "LowAmt")
    protected LowAmtType lowAmt;
    @XmlElement(name = "HighAmt")
    protected HighAmtType highAmt;
    @XmlElement(name = "ExpDt")
    protected ExpDtType expDt;
    @XmlElement(name = "ACHFltrStatType")
    protected ACHFltrStatTypeType achFltrStatType;
    @XmlElement(name = "ACHCompAlwType")
    protected ACHCompAlwTypeType achCompAlwType;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ACHCompFltrId")
    protected ACHCompFltrIdType achCompFltrId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the achAlwTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link ACHAlwTrnTypeType }
     *     
     */
    public ACHAlwTrnTypeType getACHAlwTrnType() {
        return achAlwTrnType;
    }

    /**
     * Sets the value of the achAlwTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHAlwTrnTypeType }
     *     
     */
    public void setACHAlwTrnType(ACHAlwTrnTypeType value) {
        this.achAlwTrnType = value;
    }

    /**
     * Gets the value of the achCompId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCompIdType }
     *     
     */
    public ACHCompIdType getACHCompId() {
        return achCompId;
    }

    /**
     * Sets the value of the achCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCompIdType }
     *     
     */
    public void setACHCompId(ACHCompIdType value) {
        this.achCompId = value;
    }

    /**
     * Gets the value of the achCompName property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCompNameType }
     *     
     */
    public ACHCompNameType getACHCompName() {
        return achCompName;
    }

    /**
     * Sets the value of the achCompName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCompNameType }
     *     
     */
    public void setACHCompName(ACHCompNameType value) {
        this.achCompName = value;
    }

    /**
     * Gets the value of the achStdEntryClass property.
     * 
     * @return
     *     possible object is
     *     {@link ACHStdEntryClassType }
     *     
     */
    public ACHStdEntryClassType getACHStdEntryClass() {
        return achStdEntryClass;
    }

    /**
     * Sets the value of the achStdEntryClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHStdEntryClassType }
     *     
     */
    public void setACHStdEntryClass(ACHStdEntryClassType value) {
        this.achStdEntryClass = value;
    }

    /**
     * Gets the value of the lowAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LowAmtType }
     *     
     */
    public LowAmtType getLowAmt() {
        return lowAmt;
    }

    /**
     * Sets the value of the lowAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LowAmtType }
     *     
     */
    public void setLowAmt(LowAmtType value) {
        this.lowAmt = value;
    }

    /**
     * Gets the value of the highAmt property.
     * 
     * @return
     *     possible object is
     *     {@link HighAmtType }
     *     
     */
    public HighAmtType getHighAmt() {
        return highAmt;
    }

    /**
     * Sets the value of the highAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighAmtType }
     *     
     */
    public void setHighAmt(HighAmtType value) {
        this.highAmt = value;
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
     * Gets the value of the achFltrStatType property.
     * 
     * @return
     *     possible object is
     *     {@link ACHFltrStatTypeType }
     *     
     */
    public ACHFltrStatTypeType getACHFltrStatType() {
        return achFltrStatType;
    }

    /**
     * Sets the value of the achFltrStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHFltrStatTypeType }
     *     
     */
    public void setACHFltrStatType(ACHFltrStatTypeType value) {
        this.achFltrStatType = value;
    }

    /**
     * Gets the value of the achCompAlwType property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCompAlwTypeType }
     *     
     */
    public ACHCompAlwTypeType getACHCompAlwType() {
        return achCompAlwType;
    }

    /**
     * Sets the value of the achCompAlwType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCompAlwTypeType }
     *     
     */
    public void setACHCompAlwType(ACHCompAlwTypeType value) {
        this.achCompAlwType = value;
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
     * Gets the value of the achCompFltrId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCompFltrIdType }
     *     
     */
    public ACHCompFltrIdType getACHCompFltrId() {
        return achCompFltrId;
    }

    /**
     * Sets the value of the achCompFltrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCompFltrIdType }
     *     
     */
    public void setACHCompFltrId(ACHCompFltrIdType value) {
        this.achCompFltrId = value;
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
