
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
 * <p>Java class for EFTChgInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTChgInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTTrnActType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnActType_Type"/&gt;
 *         &lt;element name="EFTTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTWavTolrCnt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTWavTolrCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTChgPctRed" type="{http://jackhenry.com/jxchange/TPG/2008}EFTChgPctRed_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EFTChgInfoRec_CType", propOrder = {
    "eftTrnActType",
    "eftTrnType",
    "eftChgAmt",
    "eftWavTolrCnt",
    "eftChgPctRed",
    "ver1",
    "any"
})
public class EFTChgInfoRecCType {

    @XmlElement(name = "EFTTrnActType", required = true)
    protected EFTTrnActTypeType eftTrnActType;
    @XmlElementRef(name = "EFTTrnType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTTrnTypeType> eftTrnType;
    @XmlElementRef(name = "EFTChgAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTChgAmtType> eftChgAmt;
    @XmlElementRef(name = "EFTWavTolrCnt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTWavTolrCntType> eftWavTolrCnt;
    @XmlElementRef(name = "EFTChgPctRed", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EFTChgPctRedType> eftChgPctRed;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eftTrnActType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnActTypeType }
     *     
     */
    public EFTTrnActTypeType getEFTTrnActType() {
        return eftTrnActType;
    }

    /**
     * Sets the value of the eftTrnActType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnActTypeType }
     *     
     */
    public void setEFTTrnActType(EFTTrnActTypeType value) {
        this.eftTrnActType = value;
    }

    /**
     * Gets the value of the eftTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTTrnTypeType }{@code >}
     *     
     */
    public JAXBElement<EFTTrnTypeType> getEFTTrnType() {
        return eftTrnType;
    }

    /**
     * Sets the value of the eftTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTTrnTypeType }{@code >}
     *     
     */
    public void setEFTTrnType(JAXBElement<EFTTrnTypeType> value) {
        this.eftTrnType = value;
    }

    /**
     * Gets the value of the eftChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTChgAmtType }{@code >}
     *     
     */
    public JAXBElement<EFTChgAmtType> getEFTChgAmt() {
        return eftChgAmt;
    }

    /**
     * Sets the value of the eftChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTChgAmtType }{@code >}
     *     
     */
    public void setEFTChgAmt(JAXBElement<EFTChgAmtType> value) {
        this.eftChgAmt = value;
    }

    /**
     * Gets the value of the eftWavTolrCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTWavTolrCntType }{@code >}
     *     
     */
    public JAXBElement<EFTWavTolrCntType> getEFTWavTolrCnt() {
        return eftWavTolrCnt;
    }

    /**
     * Sets the value of the eftWavTolrCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTWavTolrCntType }{@code >}
     *     
     */
    public void setEFTWavTolrCnt(JAXBElement<EFTWavTolrCntType> value) {
        this.eftWavTolrCnt = value;
    }

    /**
     * Gets the value of the eftChgPctRed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EFTChgPctRedType }{@code >}
     *     
     */
    public JAXBElement<EFTChgPctRedType> getEFTChgPctRed() {
        return eftChgPctRed;
    }

    /**
     * Sets the value of the eftChgPctRed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EFTChgPctRedType }{@code >}
     *     
     */
    public void setEFTChgPctRed(JAXBElement<EFTChgPctRedType> value) {
        this.eftChgPctRed = value;
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
