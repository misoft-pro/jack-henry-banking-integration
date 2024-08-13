
package pro.misoft.jackhenryintegration.generated.ach;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ACHRetNOCInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHRetNOCInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHBatchHdr" type="{http://jackhenry.com/jxchange/TPG/2008}ACHBatchHdr_Type"/&gt;
 *         &lt;element name="ACHDetInfo" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDetInfo_Type"/&gt;
 *         &lt;element name="ACHAddendaArray" type="{http://jackhenry.com/jxchange/TPG/2008}ACHAddendaArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="InitialACHTraceId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHTraceId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ACHRetNOCInqRec_CType", propOrder = {
    "achBatchHdr",
    "achDetInfo",
    "achAddendaArray",
    "custom",
    "ver1",
    "initialACHTraceId",
    "ver2",
    "any"
})
public class ACHRetNOCInqRecCType {

    @XmlElement(name = "ACHBatchHdr", required = true)
    protected ACHBatchHdrType achBatchHdr;
    @XmlElement(name = "ACHDetInfo", required = true)
    protected ACHDetInfoType achDetInfo;
    @XmlElement(name = "ACHAddendaArray")
    protected ACHAddendaArrayAType achAddendaArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "InitialACHTraceId")
    protected ACHTraceIdType initialACHTraceId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the achBatchHdr property.
     * 
     * @return
     *     possible object is
     *     {@link ACHBatchHdrType }
     *     
     */
    public ACHBatchHdrType getACHBatchHdr() {
        return achBatchHdr;
    }

    /**
     * Sets the value of the achBatchHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHBatchHdrType }
     *     
     */
    public void setACHBatchHdr(ACHBatchHdrType value) {
        this.achBatchHdr = value;
    }

    /**
     * Gets the value of the achDetInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ACHDetInfoType }
     *     
     */
    public ACHDetInfoType getACHDetInfo() {
        return achDetInfo;
    }

    /**
     * Sets the value of the achDetInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHDetInfoType }
     *     
     */
    public void setACHDetInfo(ACHDetInfoType value) {
        this.achDetInfo = value;
    }

    /**
     * Gets the value of the achAddendaArray property.
     * 
     * @return
     *     possible object is
     *     {@link ACHAddendaArrayAType }
     *     
     */
    public ACHAddendaArrayAType getACHAddendaArray() {
        return achAddendaArray;
    }

    /**
     * Sets the value of the achAddendaArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHAddendaArrayAType }
     *     
     */
    public void setACHAddendaArray(ACHAddendaArrayAType value) {
        this.achAddendaArray = value;
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
     * Gets the value of the initialACHTraceId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHTraceIdType }
     *     
     */
    public ACHTraceIdType getInitialACHTraceId() {
        return initialACHTraceId;
    }

    /**
     * Sets the value of the initialACHTraceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHTraceIdType }
     *     
     */
    public void setInitialACHTraceId(ACHTraceIdType value) {
        this.initialACHTraceId = value;
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
