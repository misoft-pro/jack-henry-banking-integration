
package pro.misoft.jackhenryintegration.generated.customer;

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
 * <p>Java class for RedSerChgInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RedSerChgInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MinSerChgRedAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MinSerChgRedAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SerChgTolrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgTolrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SerChgWavTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgWavTrnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SerChgWavDrType" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgWavDrType_Type" minOccurs="0"/&gt;
 *         &lt;element name="RedSerChgMthdArray" type="{http://jackhenry.com/jxchange/TPG/2008}RedSerChgMthdArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "RedSerChgInfoRec_CType", propOrder = {
    "minSerChgRedAmt",
    "serChgTolrAmt",
    "serChgWavTrnType",
    "serChgWavDrType",
    "redSerChgMthdArray",
    "ver1",
    "any"
})
public class RedSerChgInfoRecCType {

    @XmlElementRef(name = "MinSerChgRedAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MinSerChgRedAmtType> minSerChgRedAmt;
    @XmlElementRef(name = "SerChgTolrAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SerChgTolrAmtType> serChgTolrAmt;
    @XmlElementRef(name = "SerChgWavTrnType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SerChgWavTrnTypeType> serChgWavTrnType;
    @XmlElementRef(name = "SerChgWavDrType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SerChgWavDrTypeType> serChgWavDrType;
    @XmlElement(name = "RedSerChgMthdArray")
    protected RedSerChgMthdArrayAType redSerChgMthdArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the minSerChgRedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MinSerChgRedAmtType }{@code >}
     *     
     */
    public JAXBElement<MinSerChgRedAmtType> getMinSerChgRedAmt() {
        return minSerChgRedAmt;
    }

    /**
     * Sets the value of the minSerChgRedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MinSerChgRedAmtType }{@code >}
     *     
     */
    public void setMinSerChgRedAmt(JAXBElement<MinSerChgRedAmtType> value) {
        this.minSerChgRedAmt = value;
    }

    /**
     * Gets the value of the serChgTolrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SerChgTolrAmtType }{@code >}
     *     
     */
    public JAXBElement<SerChgTolrAmtType> getSerChgTolrAmt() {
        return serChgTolrAmt;
    }

    /**
     * Sets the value of the serChgTolrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SerChgTolrAmtType }{@code >}
     *     
     */
    public void setSerChgTolrAmt(JAXBElement<SerChgTolrAmtType> value) {
        this.serChgTolrAmt = value;
    }

    /**
     * Gets the value of the serChgWavTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SerChgWavTrnTypeType }{@code >}
     *     
     */
    public JAXBElement<SerChgWavTrnTypeType> getSerChgWavTrnType() {
        return serChgWavTrnType;
    }

    /**
     * Sets the value of the serChgWavTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SerChgWavTrnTypeType }{@code >}
     *     
     */
    public void setSerChgWavTrnType(JAXBElement<SerChgWavTrnTypeType> value) {
        this.serChgWavTrnType = value;
    }

    /**
     * Gets the value of the serChgWavDrType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SerChgWavDrTypeType }{@code >}
     *     
     */
    public JAXBElement<SerChgWavDrTypeType> getSerChgWavDrType() {
        return serChgWavDrType;
    }

    /**
     * Sets the value of the serChgWavDrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SerChgWavDrTypeType }{@code >}
     *     
     */
    public void setSerChgWavDrType(JAXBElement<SerChgWavDrTypeType> value) {
        this.serChgWavDrType = value;
    }

    /**
     * Gets the value of the redSerChgMthdArray property.
     * 
     * @return
     *     possible object is
     *     {@link RedSerChgMthdArrayAType }
     *     
     */
    public RedSerChgMthdArrayAType getRedSerChgMthdArray() {
        return redSerChgMthdArray;
    }

    /**
     * Sets the value of the redSerChgMthdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedSerChgMthdArrayAType }
     *     
     */
    public void setRedSerChgMthdArray(RedSerChgMthdArrayAType value) {
        this.redSerChgMthdArray = value;
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
