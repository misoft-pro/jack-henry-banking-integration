
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
 * <p>Java class for SweepAcctInqInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SweepAcctInqInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SweepAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}SweepAcctInfo_CType"/&gt;
 *         &lt;element name="SweepClassDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SweepClassDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepChgDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SweepChgDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepNotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SweepNotDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepRstrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SweepRstrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepPayoffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SweepPayoffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepFltXferDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SweepFltXferDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SweepResetDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SweepResetDesc_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ActIntenKey" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntentKey_Type" minOccurs="0"/&gt;
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
@XmlType(name = "SweepAcctInqInfo_CType", propOrder = {
    "sweepAcctInfo",
    "sweepClassDesc",
    "sweepChgDesc",
    "sweepNotDesc",
    "sweepRstrDesc",
    "sweepPayoffDesc",
    "sweepFltXferDesc",
    "sweepResetDesc",
    "ver1",
    "actIntenKey",
    "ver2",
    "any"
})
public class SweepAcctInqInfoCType {

    @XmlElement(name = "SweepAcctInfo", required = true)
    protected SweepAcctInfoCType sweepAcctInfo;
    @XmlElementRef(name = "SweepClassDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepClassDescType> sweepClassDesc;
    @XmlElementRef(name = "SweepChgDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepChgDescType> sweepChgDesc;
    @XmlElementRef(name = "SweepNotDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepNotDescType> sweepNotDesc;
    @XmlElementRef(name = "SweepRstrDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepRstrDescType> sweepRstrDesc;
    @XmlElementRef(name = "SweepPayoffDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepPayoffDescType> sweepPayoffDesc;
    @XmlElementRef(name = "SweepFltXferDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepFltXferDescType> sweepFltXferDesc;
    @XmlElementRef(name = "SweepResetDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepResetDescType> sweepResetDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "ActIntenKey", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentKeyType> actIntenKey;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the sweepAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SweepAcctInfoCType }
     *     
     */
    public SweepAcctInfoCType getSweepAcctInfo() {
        return sweepAcctInfo;
    }

    /**
     * Sets the value of the sweepAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SweepAcctInfoCType }
     *     
     */
    public void setSweepAcctInfo(SweepAcctInfoCType value) {
        this.sweepAcctInfo = value;
    }

    /**
     * Gets the value of the sweepClassDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepClassDescType }{@code >}
     *     
     */
    public JAXBElement<SweepClassDescType> getSweepClassDesc() {
        return sweepClassDesc;
    }

    /**
     * Sets the value of the sweepClassDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepClassDescType }{@code >}
     *     
     */
    public void setSweepClassDesc(JAXBElement<SweepClassDescType> value) {
        this.sweepClassDesc = value;
    }

    /**
     * Gets the value of the sweepChgDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepChgDescType }{@code >}
     *     
     */
    public JAXBElement<SweepChgDescType> getSweepChgDesc() {
        return sweepChgDesc;
    }

    /**
     * Sets the value of the sweepChgDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepChgDescType }{@code >}
     *     
     */
    public void setSweepChgDesc(JAXBElement<SweepChgDescType> value) {
        this.sweepChgDesc = value;
    }

    /**
     * Gets the value of the sweepNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepNotDescType }{@code >}
     *     
     */
    public JAXBElement<SweepNotDescType> getSweepNotDesc() {
        return sweepNotDesc;
    }

    /**
     * Sets the value of the sweepNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepNotDescType }{@code >}
     *     
     */
    public void setSweepNotDesc(JAXBElement<SweepNotDescType> value) {
        this.sweepNotDesc = value;
    }

    /**
     * Gets the value of the sweepRstrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepRstrDescType }{@code >}
     *     
     */
    public JAXBElement<SweepRstrDescType> getSweepRstrDesc() {
        return sweepRstrDesc;
    }

    /**
     * Sets the value of the sweepRstrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepRstrDescType }{@code >}
     *     
     */
    public void setSweepRstrDesc(JAXBElement<SweepRstrDescType> value) {
        this.sweepRstrDesc = value;
    }

    /**
     * Gets the value of the sweepPayoffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepPayoffDescType }{@code >}
     *     
     */
    public JAXBElement<SweepPayoffDescType> getSweepPayoffDesc() {
        return sweepPayoffDesc;
    }

    /**
     * Sets the value of the sweepPayoffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepPayoffDescType }{@code >}
     *     
     */
    public void setSweepPayoffDesc(JAXBElement<SweepPayoffDescType> value) {
        this.sweepPayoffDesc = value;
    }

    /**
     * Gets the value of the sweepFltXferDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepFltXferDescType }{@code >}
     *     
     */
    public JAXBElement<SweepFltXferDescType> getSweepFltXferDesc() {
        return sweepFltXferDesc;
    }

    /**
     * Sets the value of the sweepFltXferDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepFltXferDescType }{@code >}
     *     
     */
    public void setSweepFltXferDesc(JAXBElement<SweepFltXferDescType> value) {
        this.sweepFltXferDesc = value;
    }

    /**
     * Gets the value of the sweepResetDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepResetDescType }{@code >}
     *     
     */
    public JAXBElement<SweepResetDescType> getSweepResetDesc() {
        return sweepResetDesc;
    }

    /**
     * Sets the value of the sweepResetDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepResetDescType }{@code >}
     *     
     */
    public void setSweepResetDesc(JAXBElement<SweepResetDescType> value) {
        this.sweepResetDesc = value;
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
     * Gets the value of the actIntenKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}
     *     
     */
    public JAXBElement<ActIntentKeyType> getActIntenKey() {
        return actIntenKey;
    }

    /**
     * Sets the value of the actIntenKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}
     *     
     */
    public void setActIntenKey(JAXBElement<ActIntentKeyType> value) {
        this.actIntenKey = value;
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
