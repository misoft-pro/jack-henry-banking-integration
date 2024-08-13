
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
 * <p>Java class for CRMAuditHistRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMAuditHistRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChngDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ChngDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrevVal" type="{http://jackhenry.com/jxchange/TPG/2008}FieldOrigVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="NewVal" type="{http://jackhenry.com/jxchange/TPG/2008}FieldNewVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="ModOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ModOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ModTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}ModTimeDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CRMAuditHistRec_CType", propOrder = {
    "chngDesc",
    "prevVal",
    "newVal",
    "modOffCode",
    "modOffDesc",
    "modTimeDt",
    "custom",
    "ver1",
    "any"
})
public class CRMAuditHistRecCType {

    @XmlElement(name = "ChngDesc")
    protected ChngDescType chngDesc;
    @XmlElement(name = "PrevVal")
    protected FieldOrigValType prevVal;
    @XmlElement(name = "NewVal")
    protected FieldNewValType newVal;
    @XmlElement(name = "ModOffCode")
    protected CRMOffCodeType modOffCode;
    @XmlElement(name = "ModOffDesc")
    protected CRMOffDescType modOffDesc;
    @XmlElement(name = "ModTimeDt")
    protected ModTimeDtType modTimeDt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the chngDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ChngDescType }
     *     
     */
    public ChngDescType getChngDesc() {
        return chngDesc;
    }

    /**
     * Sets the value of the chngDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChngDescType }
     *     
     */
    public void setChngDesc(ChngDescType value) {
        this.chngDesc = value;
    }

    /**
     * Gets the value of the prevVal property.
     * 
     * @return
     *     possible object is
     *     {@link FieldOrigValType }
     *     
     */
    public FieldOrigValType getPrevVal() {
        return prevVal;
    }

    /**
     * Sets the value of the prevVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldOrigValType }
     *     
     */
    public void setPrevVal(FieldOrigValType value) {
        this.prevVal = value;
    }

    /**
     * Gets the value of the newVal property.
     * 
     * @return
     *     possible object is
     *     {@link FieldNewValType }
     *     
     */
    public FieldNewValType getNewVal() {
        return newVal;
    }

    /**
     * Sets the value of the newVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldNewValType }
     *     
     */
    public void setNewVal(FieldNewValType value) {
        this.newVal = value;
    }

    /**
     * Gets the value of the modOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffCodeType }
     *     
     */
    public CRMOffCodeType getModOffCode() {
        return modOffCode;
    }

    /**
     * Sets the value of the modOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffCodeType }
     *     
     */
    public void setModOffCode(CRMOffCodeType value) {
        this.modOffCode = value;
    }

    /**
     * Gets the value of the modOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffDescType }
     *     
     */
    public CRMOffDescType getModOffDesc() {
        return modOffDesc;
    }

    /**
     * Sets the value of the modOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffDescType }
     *     
     */
    public void setModOffDesc(CRMOffDescType value) {
        this.modOffDesc = value;
    }

    /**
     * Gets the value of the modTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link ModTimeDtType }
     *     
     */
    public ModTimeDtType getModTimeDt() {
        return modTimeDt;
    }

    /**
     * Sets the value of the modTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModTimeDtType }
     *     
     */
    public void setModTimeDt(ModTimeDtType value) {
        this.modTimeDt = value;
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
