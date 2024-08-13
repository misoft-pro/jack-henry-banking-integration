
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
 * <p>Java class for StateWith_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StateWith_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StateWithCode" type="{http://jackhenry.com/jxchange/TPG/2008}StateWithCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="StateWithDesc" type="{http://jackhenry.com/jxchange/TPG/2008}StateWithDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="StateWithEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}StateWithEffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StateWithAltAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}StateWithAltAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="StateWithAltAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}StateWithAltAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="StateWithAltRate" type="{http://jackhenry.com/jxchange/TPG/2008}StateWithAltRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="StateWithFixAmt" type="{http://jackhenry.com/jxchange/TPG/2008}StateWithFixAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StateWithMTD" type="{http://jackhenry.com/jxchange/TPG/2008}StateWithMTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="StateWithQTD" type="{http://jackhenry.com/jxchange/TPG/2008}StateWithQTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="StateWithYTD" type="{http://jackhenry.com/jxchange/TPG/2008}StateWithYTD_Type" minOccurs="0"/&gt;
 *         &lt;element name="StateWithLastYR" type="{http://jackhenry.com/jxchange/TPG/2008}StateWithLastYR_Type" minOccurs="0"/&gt;
 *         &lt;element name="StateWithStateCode" type="{http://jackhenry.com/jxchange/TPG/2008}StateWithStateCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="StateWithStateDesc" type="{http://jackhenry.com/jxchange/TPG/2008}StateWithStateDesc_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="StateWithCycleAmt" type="{http://jackhenry.com/jxchange/TPG/2008}StateWithCycleAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "StateWith_CType", propOrder = {
    "stateWithCode",
    "stateWithDesc",
    "stateWithEffDt",
    "stateWithAltAcctId",
    "stateWithAltAcctType",
    "stateWithAltRate",
    "stateWithFixAmt",
    "stateWithMTD",
    "stateWithQTD",
    "stateWithYTD",
    "stateWithLastYR",
    "stateWithStateCode",
    "stateWithStateDesc",
    "ver1",
    "stateWithCycleAmt",
    "ver2",
    "any"
})
public class StateWithCType {

    @XmlElementRef(name = "StateWithCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateWithCodeType> stateWithCode;
    @XmlElementRef(name = "StateWithDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateWithDescType> stateWithDesc;
    @XmlElementRef(name = "StateWithEffDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateWithEffDtType> stateWithEffDt;
    @XmlElementRef(name = "StateWithAltAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateWithAltAcctIdType> stateWithAltAcctId;
    @XmlElementRef(name = "StateWithAltAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateWithAltAcctTypeType> stateWithAltAcctType;
    @XmlElementRef(name = "StateWithAltRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateWithAltRateType> stateWithAltRate;
    @XmlElementRef(name = "StateWithFixAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateWithFixAmtType> stateWithFixAmt;
    @XmlElementRef(name = "StateWithMTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateWithMTDType> stateWithMTD;
    @XmlElementRef(name = "StateWithQTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateWithQTDType> stateWithQTD;
    @XmlElementRef(name = "StateWithYTD", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateWithYTDType> stateWithYTD;
    @XmlElementRef(name = "StateWithLastYR", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateWithLastYRType> stateWithLastYR;
    @XmlElementRef(name = "StateWithStateCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateWithStateCodeType> stateWithStateCode;
    @XmlElementRef(name = "StateWithStateDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateWithStateDescType> stateWithStateDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "StateWithCycleAmt")
    protected StateWithCycleAmtType stateWithCycleAmt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the stateWithCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateWithCodeType }{@code >}
     *     
     */
    public JAXBElement<StateWithCodeType> getStateWithCode() {
        return stateWithCode;
    }

    /**
     * Sets the value of the stateWithCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateWithCodeType }{@code >}
     *     
     */
    public void setStateWithCode(JAXBElement<StateWithCodeType> value) {
        this.stateWithCode = value;
    }

    /**
     * Gets the value of the stateWithDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateWithDescType }{@code >}
     *     
     */
    public JAXBElement<StateWithDescType> getStateWithDesc() {
        return stateWithDesc;
    }

    /**
     * Sets the value of the stateWithDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateWithDescType }{@code >}
     *     
     */
    public void setStateWithDesc(JAXBElement<StateWithDescType> value) {
        this.stateWithDesc = value;
    }

    /**
     * Gets the value of the stateWithEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateWithEffDtType }{@code >}
     *     
     */
    public JAXBElement<StateWithEffDtType> getStateWithEffDt() {
        return stateWithEffDt;
    }

    /**
     * Sets the value of the stateWithEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateWithEffDtType }{@code >}
     *     
     */
    public void setStateWithEffDt(JAXBElement<StateWithEffDtType> value) {
        this.stateWithEffDt = value;
    }

    /**
     * Gets the value of the stateWithAltAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateWithAltAcctIdType }{@code >}
     *     
     */
    public JAXBElement<StateWithAltAcctIdType> getStateWithAltAcctId() {
        return stateWithAltAcctId;
    }

    /**
     * Sets the value of the stateWithAltAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateWithAltAcctIdType }{@code >}
     *     
     */
    public void setStateWithAltAcctId(JAXBElement<StateWithAltAcctIdType> value) {
        this.stateWithAltAcctId = value;
    }

    /**
     * Gets the value of the stateWithAltAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateWithAltAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<StateWithAltAcctTypeType> getStateWithAltAcctType() {
        return stateWithAltAcctType;
    }

    /**
     * Sets the value of the stateWithAltAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateWithAltAcctTypeType }{@code >}
     *     
     */
    public void setStateWithAltAcctType(JAXBElement<StateWithAltAcctTypeType> value) {
        this.stateWithAltAcctType = value;
    }

    /**
     * Gets the value of the stateWithAltRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateWithAltRateType }{@code >}
     *     
     */
    public JAXBElement<StateWithAltRateType> getStateWithAltRate() {
        return stateWithAltRate;
    }

    /**
     * Sets the value of the stateWithAltRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateWithAltRateType }{@code >}
     *     
     */
    public void setStateWithAltRate(JAXBElement<StateWithAltRateType> value) {
        this.stateWithAltRate = value;
    }

    /**
     * Gets the value of the stateWithFixAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateWithFixAmtType }{@code >}
     *     
     */
    public JAXBElement<StateWithFixAmtType> getStateWithFixAmt() {
        return stateWithFixAmt;
    }

    /**
     * Sets the value of the stateWithFixAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateWithFixAmtType }{@code >}
     *     
     */
    public void setStateWithFixAmt(JAXBElement<StateWithFixAmtType> value) {
        this.stateWithFixAmt = value;
    }

    /**
     * Gets the value of the stateWithMTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateWithMTDType }{@code >}
     *     
     */
    public JAXBElement<StateWithMTDType> getStateWithMTD() {
        return stateWithMTD;
    }

    /**
     * Sets the value of the stateWithMTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateWithMTDType }{@code >}
     *     
     */
    public void setStateWithMTD(JAXBElement<StateWithMTDType> value) {
        this.stateWithMTD = value;
    }

    /**
     * Gets the value of the stateWithQTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateWithQTDType }{@code >}
     *     
     */
    public JAXBElement<StateWithQTDType> getStateWithQTD() {
        return stateWithQTD;
    }

    /**
     * Sets the value of the stateWithQTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateWithQTDType }{@code >}
     *     
     */
    public void setStateWithQTD(JAXBElement<StateWithQTDType> value) {
        this.stateWithQTD = value;
    }

    /**
     * Gets the value of the stateWithYTD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateWithYTDType }{@code >}
     *     
     */
    public JAXBElement<StateWithYTDType> getStateWithYTD() {
        return stateWithYTD;
    }

    /**
     * Sets the value of the stateWithYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateWithYTDType }{@code >}
     *     
     */
    public void setStateWithYTD(JAXBElement<StateWithYTDType> value) {
        this.stateWithYTD = value;
    }

    /**
     * Gets the value of the stateWithLastYR property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateWithLastYRType }{@code >}
     *     
     */
    public JAXBElement<StateWithLastYRType> getStateWithLastYR() {
        return stateWithLastYR;
    }

    /**
     * Sets the value of the stateWithLastYR property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateWithLastYRType }{@code >}
     *     
     */
    public void setStateWithLastYR(JAXBElement<StateWithLastYRType> value) {
        this.stateWithLastYR = value;
    }

    /**
     * Gets the value of the stateWithStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateWithStateCodeType }{@code >}
     *     
     */
    public JAXBElement<StateWithStateCodeType> getStateWithStateCode() {
        return stateWithStateCode;
    }

    /**
     * Sets the value of the stateWithStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateWithStateCodeType }{@code >}
     *     
     */
    public void setStateWithStateCode(JAXBElement<StateWithStateCodeType> value) {
        this.stateWithStateCode = value;
    }

    /**
     * Gets the value of the stateWithStateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateWithStateDescType }{@code >}
     *     
     */
    public JAXBElement<StateWithStateDescType> getStateWithStateDesc() {
        return stateWithStateDesc;
    }

    /**
     * Sets the value of the stateWithStateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateWithStateDescType }{@code >}
     *     
     */
    public void setStateWithStateDesc(JAXBElement<StateWithStateDescType> value) {
        this.stateWithStateDesc = value;
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
     * Gets the value of the stateWithCycleAmt property.
     * 
     * @return
     *     possible object is
     *     {@link StateWithCycleAmtType }
     *     
     */
    public StateWithCycleAmtType getStateWithCycleAmt() {
        return stateWithCycleAmt;
    }

    /**
     * Sets the value of the stateWithCycleAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateWithCycleAmtType }
     *     
     */
    public void setStateWithCycleAmt(StateWithCycleAmtType value) {
        this.stateWithCycleAmt = value;
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
