
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
 * <p>Java class for SweepAcctModInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SweepAcctModInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SweepToMasterLvl" type="{http://jackhenry.com/jxchange/TPG/2008}SweepToMasterLvl_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepFromMasterLvl" type="{http://jackhenry.com/jxchange/TPG/2008}SweepFromMasterLvl_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepCeilBal" type="{http://jackhenry.com/jxchange/TPG/2008}SweepCeilBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepFlrBal" type="{http://jackhenry.com/jxchange/TPG/2008}SweepFlrBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepFlrTgtBal" type="{http://jackhenry.com/jxchange/TPG/2008}SweepTgtBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepPartType" type="{http://jackhenry.com/jxchange/TPG/2008}SweepPartType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepBalType" type="{http://jackhenry.com/jxchange/TPG/2008}SweepBalType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepToMasterIncrBal" type="{http://jackhenry.com/jxchange/TPG/2008}SweepToMasterIncrBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepFromMasterIncrBal" type="{http://jackhenry.com/jxchange/TPG/2008}SweepFromMasterIncrBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepClassCode" type="{http://jackhenry.com/jxchange/TPG/2008}SweepClassCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SweepChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepChgCode" type="{http://jackhenry.com/jxchange/TPG/2008}SweepChgCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}SweepNotCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepRstrCode" type="{http://jackhenry.com/jxchange/TPG/2008}SweepRstrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepPayoffCode" type="{http://jackhenry.com/jxchange/TPG/2008}SweepPayoffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepFltXferCode" type="{http://jackhenry.com/jxchange/TPG/2008}SweepFltXferCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepResetCode" type="{http://jackhenry.com/jxchange/TPG/2008}SweepResetCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ApprvOffInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ApprvOffInfoArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "SweepAcctModInfo_CType", propOrder = {
    "sweepToMasterLvl",
    "sweepFromMasterLvl",
    "sweepCeilBal",
    "sweepFlrBal",
    "sweepFlrTgtBal",
    "sweepPartType",
    "sweepBalType",
    "sweepToMasterIncrBal",
    "sweepFromMasterIncrBal",
    "sweepClassCode",
    "sweepChgAmt",
    "sweepChgCode",
    "sweepNotCode",
    "sweepRstrCode",
    "sweepPayoffCode",
    "sweepFltXferCode",
    "sweepResetCode",
    "ver1",
    "apprvOffInfoArray",
    "ver2",
    "any"
})
public class SweepAcctModInfoCType {

    @XmlElementRef(name = "SweepToMasterLvl", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepToMasterLvlType> sweepToMasterLvl;
    @XmlElementRef(name = "SweepFromMasterLvl", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepFromMasterLvlType> sweepFromMasterLvl;
    @XmlElementRef(name = "SweepCeilBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepCeilBalType> sweepCeilBal;
    @XmlElementRef(name = "SweepFlrBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepFlrBalType> sweepFlrBal;
    @XmlElementRef(name = "SweepFlrTgtBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepTgtBalType> sweepFlrTgtBal;
    @XmlElementRef(name = "SweepPartType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepPartTypeType> sweepPartType;
    @XmlElementRef(name = "SweepBalType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepBalTypeType> sweepBalType;
    @XmlElementRef(name = "SweepToMasterIncrBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepToMasterIncrBalType> sweepToMasterIncrBal;
    @XmlElementRef(name = "SweepFromMasterIncrBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepFromMasterIncrBalType> sweepFromMasterIncrBal;
    @XmlElementRef(name = "SweepClassCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepClassCodeType> sweepClassCode;
    @XmlElementRef(name = "SweepChgAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepChgAmtType> sweepChgAmt;
    @XmlElementRef(name = "SweepChgCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepChgCodeType> sweepChgCode;
    @XmlElementRef(name = "SweepNotCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepNotCodeType> sweepNotCode;
    @XmlElementRef(name = "SweepRstrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepRstrCodeType> sweepRstrCode;
    @XmlElementRef(name = "SweepPayoffCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepPayoffCodeType> sweepPayoffCode;
    @XmlElementRef(name = "SweepFltXferCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepFltXferCodeType> sweepFltXferCode;
    @XmlElementRef(name = "SweepResetCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepResetCodeType> sweepResetCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ApprvOffInfoArray")
    protected ApprvOffInfoArrayAType apprvOffInfoArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the sweepToMasterLvl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepToMasterLvlType }{@code >}
     *     
     */
    public JAXBElement<SweepToMasterLvlType> getSweepToMasterLvl() {
        return sweepToMasterLvl;
    }

    /**
     * Sets the value of the sweepToMasterLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepToMasterLvlType }{@code >}
     *     
     */
    public void setSweepToMasterLvl(JAXBElement<SweepToMasterLvlType> value) {
        this.sweepToMasterLvl = value;
    }

    /**
     * Gets the value of the sweepFromMasterLvl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepFromMasterLvlType }{@code >}
     *     
     */
    public JAXBElement<SweepFromMasterLvlType> getSweepFromMasterLvl() {
        return sweepFromMasterLvl;
    }

    /**
     * Sets the value of the sweepFromMasterLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepFromMasterLvlType }{@code >}
     *     
     */
    public void setSweepFromMasterLvl(JAXBElement<SweepFromMasterLvlType> value) {
        this.sweepFromMasterLvl = value;
    }

    /**
     * Gets the value of the sweepCeilBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepCeilBalType }{@code >}
     *     
     */
    public JAXBElement<SweepCeilBalType> getSweepCeilBal() {
        return sweepCeilBal;
    }

    /**
     * Sets the value of the sweepCeilBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepCeilBalType }{@code >}
     *     
     */
    public void setSweepCeilBal(JAXBElement<SweepCeilBalType> value) {
        this.sweepCeilBal = value;
    }

    /**
     * Gets the value of the sweepFlrBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepFlrBalType }{@code >}
     *     
     */
    public JAXBElement<SweepFlrBalType> getSweepFlrBal() {
        return sweepFlrBal;
    }

    /**
     * Sets the value of the sweepFlrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepFlrBalType }{@code >}
     *     
     */
    public void setSweepFlrBal(JAXBElement<SweepFlrBalType> value) {
        this.sweepFlrBal = value;
    }

    /**
     * Gets the value of the sweepFlrTgtBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepTgtBalType }{@code >}
     *     
     */
    public JAXBElement<SweepTgtBalType> getSweepFlrTgtBal() {
        return sweepFlrTgtBal;
    }

    /**
     * Sets the value of the sweepFlrTgtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepTgtBalType }{@code >}
     *     
     */
    public void setSweepFlrTgtBal(JAXBElement<SweepTgtBalType> value) {
        this.sweepFlrTgtBal = value;
    }

    /**
     * Gets the value of the sweepPartType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepPartTypeType }{@code >}
     *     
     */
    public JAXBElement<SweepPartTypeType> getSweepPartType() {
        return sweepPartType;
    }

    /**
     * Sets the value of the sweepPartType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepPartTypeType }{@code >}
     *     
     */
    public void setSweepPartType(JAXBElement<SweepPartTypeType> value) {
        this.sweepPartType = value;
    }

    /**
     * Gets the value of the sweepBalType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepBalTypeType }{@code >}
     *     
     */
    public JAXBElement<SweepBalTypeType> getSweepBalType() {
        return sweepBalType;
    }

    /**
     * Sets the value of the sweepBalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepBalTypeType }{@code >}
     *     
     */
    public void setSweepBalType(JAXBElement<SweepBalTypeType> value) {
        this.sweepBalType = value;
    }

    /**
     * Gets the value of the sweepToMasterIncrBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepToMasterIncrBalType }{@code >}
     *     
     */
    public JAXBElement<SweepToMasterIncrBalType> getSweepToMasterIncrBal() {
        return sweepToMasterIncrBal;
    }

    /**
     * Sets the value of the sweepToMasterIncrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepToMasterIncrBalType }{@code >}
     *     
     */
    public void setSweepToMasterIncrBal(JAXBElement<SweepToMasterIncrBalType> value) {
        this.sweepToMasterIncrBal = value;
    }

    /**
     * Gets the value of the sweepFromMasterIncrBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepFromMasterIncrBalType }{@code >}
     *     
     */
    public JAXBElement<SweepFromMasterIncrBalType> getSweepFromMasterIncrBal() {
        return sweepFromMasterIncrBal;
    }

    /**
     * Sets the value of the sweepFromMasterIncrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepFromMasterIncrBalType }{@code >}
     *     
     */
    public void setSweepFromMasterIncrBal(JAXBElement<SweepFromMasterIncrBalType> value) {
        this.sweepFromMasterIncrBal = value;
    }

    /**
     * Gets the value of the sweepClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepClassCodeType }{@code >}
     *     
     */
    public JAXBElement<SweepClassCodeType> getSweepClassCode() {
        return sweepClassCode;
    }

    /**
     * Sets the value of the sweepClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepClassCodeType }{@code >}
     *     
     */
    public void setSweepClassCode(JAXBElement<SweepClassCodeType> value) {
        this.sweepClassCode = value;
    }

    /**
     * Gets the value of the sweepChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepChgAmtType }{@code >}
     *     
     */
    public JAXBElement<SweepChgAmtType> getSweepChgAmt() {
        return sweepChgAmt;
    }

    /**
     * Sets the value of the sweepChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepChgAmtType }{@code >}
     *     
     */
    public void setSweepChgAmt(JAXBElement<SweepChgAmtType> value) {
        this.sweepChgAmt = value;
    }

    /**
     * Gets the value of the sweepChgCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepChgCodeType }{@code >}
     *     
     */
    public JAXBElement<SweepChgCodeType> getSweepChgCode() {
        return sweepChgCode;
    }

    /**
     * Sets the value of the sweepChgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepChgCodeType }{@code >}
     *     
     */
    public void setSweepChgCode(JAXBElement<SweepChgCodeType> value) {
        this.sweepChgCode = value;
    }

    /**
     * Gets the value of the sweepNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepNotCodeType }{@code >}
     *     
     */
    public JAXBElement<SweepNotCodeType> getSweepNotCode() {
        return sweepNotCode;
    }

    /**
     * Sets the value of the sweepNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepNotCodeType }{@code >}
     *     
     */
    public void setSweepNotCode(JAXBElement<SweepNotCodeType> value) {
        this.sweepNotCode = value;
    }

    /**
     * Gets the value of the sweepRstrCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepRstrCodeType }{@code >}
     *     
     */
    public JAXBElement<SweepRstrCodeType> getSweepRstrCode() {
        return sweepRstrCode;
    }

    /**
     * Sets the value of the sweepRstrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepRstrCodeType }{@code >}
     *     
     */
    public void setSweepRstrCode(JAXBElement<SweepRstrCodeType> value) {
        this.sweepRstrCode = value;
    }

    /**
     * Gets the value of the sweepPayoffCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepPayoffCodeType }{@code >}
     *     
     */
    public JAXBElement<SweepPayoffCodeType> getSweepPayoffCode() {
        return sweepPayoffCode;
    }

    /**
     * Sets the value of the sweepPayoffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepPayoffCodeType }{@code >}
     *     
     */
    public void setSweepPayoffCode(JAXBElement<SweepPayoffCodeType> value) {
        this.sweepPayoffCode = value;
    }

    /**
     * Gets the value of the sweepFltXferCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepFltXferCodeType }{@code >}
     *     
     */
    public JAXBElement<SweepFltXferCodeType> getSweepFltXferCode() {
        return sweepFltXferCode;
    }

    /**
     * Sets the value of the sweepFltXferCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepFltXferCodeType }{@code >}
     *     
     */
    public void setSweepFltXferCode(JAXBElement<SweepFltXferCodeType> value) {
        this.sweepFltXferCode = value;
    }

    /**
     * Gets the value of the sweepResetCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepResetCodeType }{@code >}
     *     
     */
    public JAXBElement<SweepResetCodeType> getSweepResetCode() {
        return sweepResetCode;
    }

    /**
     * Sets the value of the sweepResetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepResetCodeType }{@code >}
     *     
     */
    public void setSweepResetCode(JAXBElement<SweepResetCodeType> value) {
        this.sweepResetCode = value;
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
     * Gets the value of the apprvOffInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link ApprvOffInfoArrayAType }
     *     
     */
    public ApprvOffInfoArrayAType getApprvOffInfoArray() {
        return apprvOffInfoArray;
    }

    /**
     * Sets the value of the apprvOffInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprvOffInfoArrayAType }
     *     
     */
    public void setApprvOffInfoArray(ApprvOffInfoArrayAType value) {
        this.apprvOffInfoArray = value;
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
