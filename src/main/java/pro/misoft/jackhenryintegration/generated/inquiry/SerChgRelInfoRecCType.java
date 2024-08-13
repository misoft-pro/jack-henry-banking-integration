
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
 * <p>Java class for SerChgRelInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerChgRelInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SerChgLvlIncClub" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvlIncClub_Type" minOccurs="0"/&gt;
 *         &lt;element name="RedSerChgMthdType" type="{http://jackhenry.com/jxchange/TPG/2008}RedSerChgMthdType_Type" minOccurs="0"/&gt;
 *         &lt;element name="RedSerChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RedSerChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RedSerChgPct" type="{http://jackhenry.com/jxchange/TPG/2008}RedSerChgPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="WavSerChgType" type="{http://jackhenry.com/jxchange/TPG/2008}WavSerChgType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SerChgLvlLgclOprnd" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvlLgclOprnd_Type" minOccurs="0"/&gt;
 *         &lt;element name="SerChgLvlRelArray" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvlRelArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="SerChgLvlArray" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvlArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "SerChgRelInfoRec_CType", propOrder = {
    "serChgLvlIncClub",
    "redSerChgMthdType",
    "redSerChgAmt",
    "redSerChgPct",
    "wavSerChgType",
    "serChgLvlLgclOprnd",
    "serChgLvlRelArray",
    "serChgLvlArray",
    "ver1",
    "any"
})
public class SerChgRelInfoRecCType {

    @XmlElementRef(name = "SerChgLvlIncClub", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SerChgLvlIncClubType> serChgLvlIncClub;
    @XmlElementRef(name = "RedSerChgMthdType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RedSerChgMthdTypeType> redSerChgMthdType;
    @XmlElementRef(name = "RedSerChgAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RedSerChgAmtType> redSerChgAmt;
    @XmlElementRef(name = "RedSerChgPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RedSerChgPctType> redSerChgPct;
    @XmlElementRef(name = "WavSerChgType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WavSerChgTypeType> wavSerChgType;
    @XmlElementRef(name = "SerChgLvlLgclOprnd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SerChgLvlLgclOprndType> serChgLvlLgclOprnd;
    @XmlElement(name = "SerChgLvlRelArray")
    protected SerChgLvlRelArrayAType serChgLvlRelArray;
    @XmlElement(name = "SerChgLvlArray")
    protected SerChgLvlArrayAType serChgLvlArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the serChgLvlIncClub property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SerChgLvlIncClubType }{@code >}
     *     
     */
    public JAXBElement<SerChgLvlIncClubType> getSerChgLvlIncClub() {
        return serChgLvlIncClub;
    }

    /**
     * Sets the value of the serChgLvlIncClub property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SerChgLvlIncClubType }{@code >}
     *     
     */
    public void setSerChgLvlIncClub(JAXBElement<SerChgLvlIncClubType> value) {
        this.serChgLvlIncClub = value;
    }

    /**
     * Gets the value of the redSerChgMthdType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RedSerChgMthdTypeType }{@code >}
     *     
     */
    public JAXBElement<RedSerChgMthdTypeType> getRedSerChgMthdType() {
        return redSerChgMthdType;
    }

    /**
     * Sets the value of the redSerChgMthdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RedSerChgMthdTypeType }{@code >}
     *     
     */
    public void setRedSerChgMthdType(JAXBElement<RedSerChgMthdTypeType> value) {
        this.redSerChgMthdType = value;
    }

    /**
     * Gets the value of the redSerChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RedSerChgAmtType }{@code >}
     *     
     */
    public JAXBElement<RedSerChgAmtType> getRedSerChgAmt() {
        return redSerChgAmt;
    }

    /**
     * Sets the value of the redSerChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RedSerChgAmtType }{@code >}
     *     
     */
    public void setRedSerChgAmt(JAXBElement<RedSerChgAmtType> value) {
        this.redSerChgAmt = value;
    }

    /**
     * Gets the value of the redSerChgPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RedSerChgPctType }{@code >}
     *     
     */
    public JAXBElement<RedSerChgPctType> getRedSerChgPct() {
        return redSerChgPct;
    }

    /**
     * Sets the value of the redSerChgPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RedSerChgPctType }{@code >}
     *     
     */
    public void setRedSerChgPct(JAXBElement<RedSerChgPctType> value) {
        this.redSerChgPct = value;
    }

    /**
     * Gets the value of the wavSerChgType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WavSerChgTypeType }{@code >}
     *     
     */
    public JAXBElement<WavSerChgTypeType> getWavSerChgType() {
        return wavSerChgType;
    }

    /**
     * Sets the value of the wavSerChgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WavSerChgTypeType }{@code >}
     *     
     */
    public void setWavSerChgType(JAXBElement<WavSerChgTypeType> value) {
        this.wavSerChgType = value;
    }

    /**
     * Gets the value of the serChgLvlLgclOprnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SerChgLvlLgclOprndType }{@code >}
     *     
     */
    public JAXBElement<SerChgLvlLgclOprndType> getSerChgLvlLgclOprnd() {
        return serChgLvlLgclOprnd;
    }

    /**
     * Sets the value of the serChgLvlLgclOprnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SerChgLvlLgclOprndType }{@code >}
     *     
     */
    public void setSerChgLvlLgclOprnd(JAXBElement<SerChgLvlLgclOprndType> value) {
        this.serChgLvlLgclOprnd = value;
    }

    /**
     * Gets the value of the serChgLvlRelArray property.
     * 
     * @return
     *     possible object is
     *     {@link SerChgLvlRelArrayAType }
     *     
     */
    public SerChgLvlRelArrayAType getSerChgLvlRelArray() {
        return serChgLvlRelArray;
    }

    /**
     * Sets the value of the serChgLvlRelArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerChgLvlRelArrayAType }
     *     
     */
    public void setSerChgLvlRelArray(SerChgLvlRelArrayAType value) {
        this.serChgLvlRelArray = value;
    }

    /**
     * Gets the value of the serChgLvlArray property.
     * 
     * @return
     *     possible object is
     *     {@link SerChgLvlArrayAType }
     *     
     */
    public SerChgLvlArrayAType getSerChgLvlArray() {
        return serChgLvlArray;
    }

    /**
     * Sets the value of the serChgLvlArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerChgLvlArrayAType }
     *     
     */
    public void setSerChgLvlArray(SerChgLvlArrayAType value) {
        this.serChgLvlArray = value;
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
