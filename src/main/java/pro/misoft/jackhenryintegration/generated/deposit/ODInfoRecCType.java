
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
 * <p>Java class for ODInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ODIdxNum" type="{http://jackhenry.com/jxchange/TPG/2008}ODIdxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODChgCalcType" type="{http://jackhenry.com/jxchange/TPG/2008}ODChgCalcType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ChgODFeeBal" type="{http://jackhenry.com/jxchange/TPG/2008}ChgODFeeBal_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ODInfoRec_CType", propOrder = {
    "odIdxNum",
    "odChgCalcType",
    "chgODFeeBal",
    "ver1",
    "any"
})
public class ODInfoRecCType {

    @XmlElementRef(name = "ODIdxNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ODIdxNumType> odIdxNum;
    @XmlElementRef(name = "ODChgCalcType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ODChgCalcTypeType> odChgCalcType;
    @XmlElementRef(name = "ChgODFeeBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ChgODFeeBalType> chgODFeeBal;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the odIdxNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ODIdxNumType }{@code >}
     *     
     */
    public JAXBElement<ODIdxNumType> getODIdxNum() {
        return odIdxNum;
    }

    /**
     * Sets the value of the odIdxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ODIdxNumType }{@code >}
     *     
     */
    public void setODIdxNum(JAXBElement<ODIdxNumType> value) {
        this.odIdxNum = value;
    }

    /**
     * Gets the value of the odChgCalcType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ODChgCalcTypeType }{@code >}
     *     
     */
    public JAXBElement<ODChgCalcTypeType> getODChgCalcType() {
        return odChgCalcType;
    }

    /**
     * Sets the value of the odChgCalcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ODChgCalcTypeType }{@code >}
     *     
     */
    public void setODChgCalcType(JAXBElement<ODChgCalcTypeType> value) {
        this.odChgCalcType = value;
    }

    /**
     * Gets the value of the chgODFeeBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ChgODFeeBalType }{@code >}
     *     
     */
    public JAXBElement<ChgODFeeBalType> getChgODFeeBal() {
        return chgODFeeBal;
    }

    /**
     * Sets the value of the chgODFeeBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ChgODFeeBalType }{@code >}
     *     
     */
    public void setChgODFeeBal(JAXBElement<ChgODFeeBalType> value) {
        this.chgODFeeBal = value;
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
