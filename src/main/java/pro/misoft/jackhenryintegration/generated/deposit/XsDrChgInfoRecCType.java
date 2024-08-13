
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
 * <p>Java class for XsDrChgInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XsDrChgInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XsDrTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}XsDrTrnType_Type"/&gt;
 *         &lt;element name="XsDrChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}XsDrChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XsDrChgMthd" type="{http://jackhenry.com/jxchange/TPG/2008}XsDrChgMthd_Type" minOccurs="0"/&gt;
 *         &lt;element name="XsDrWavTolrCnt" type="{http://jackhenry.com/jxchange/TPG/2008}XsDrWavTolrCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="XsDrChgWav" type="{http://jackhenry.com/jxchange/TPG/2008}XsDrChgWav_Type" minOccurs="0"/&gt;
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
@XmlType(name = "XsDrChgInfoRec_CType", propOrder = {
    "xsDrTrnType",
    "xsDrChgAmt",
    "xsDrChgMthd",
    "xsDrWavTolrCnt",
    "xsDrChgWav",
    "ver1",
    "any"
})
public class XsDrChgInfoRecCType {

    @XmlElement(name = "XsDrTrnType", required = true)
    protected XsDrTrnTypeType xsDrTrnType;
    @XmlElementRef(name = "XsDrChgAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XsDrChgAmtType> xsDrChgAmt;
    @XmlElementRef(name = "XsDrChgMthd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XsDrChgMthdType> xsDrChgMthd;
    @XmlElementRef(name = "XsDrWavTolrCnt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XsDrWavTolrCntType> xsDrWavTolrCnt;
    @XmlElementRef(name = "XsDrChgWav", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XsDrChgWavType> xsDrChgWav;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the xsDrTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link XsDrTrnTypeType }
     *     
     */
    public XsDrTrnTypeType getXsDrTrnType() {
        return xsDrTrnType;
    }

    /**
     * Sets the value of the xsDrTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XsDrTrnTypeType }
     *     
     */
    public void setXsDrTrnType(XsDrTrnTypeType value) {
        this.xsDrTrnType = value;
    }

    /**
     * Gets the value of the xsDrChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XsDrChgAmtType }{@code >}
     *     
     */
    public JAXBElement<XsDrChgAmtType> getXsDrChgAmt() {
        return xsDrChgAmt;
    }

    /**
     * Sets the value of the xsDrChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XsDrChgAmtType }{@code >}
     *     
     */
    public void setXsDrChgAmt(JAXBElement<XsDrChgAmtType> value) {
        this.xsDrChgAmt = value;
    }

    /**
     * Gets the value of the xsDrChgMthd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XsDrChgMthdType }{@code >}
     *     
     */
    public JAXBElement<XsDrChgMthdType> getXsDrChgMthd() {
        return xsDrChgMthd;
    }

    /**
     * Sets the value of the xsDrChgMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XsDrChgMthdType }{@code >}
     *     
     */
    public void setXsDrChgMthd(JAXBElement<XsDrChgMthdType> value) {
        this.xsDrChgMthd = value;
    }

    /**
     * Gets the value of the xsDrWavTolrCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XsDrWavTolrCntType }{@code >}
     *     
     */
    public JAXBElement<XsDrWavTolrCntType> getXsDrWavTolrCnt() {
        return xsDrWavTolrCnt;
    }

    /**
     * Sets the value of the xsDrWavTolrCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XsDrWavTolrCntType }{@code >}
     *     
     */
    public void setXsDrWavTolrCnt(JAXBElement<XsDrWavTolrCntType> value) {
        this.xsDrWavTolrCnt = value;
    }

    /**
     * Gets the value of the xsDrChgWav property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XsDrChgWavType }{@code >}
     *     
     */
    public JAXBElement<XsDrChgWavType> getXsDrChgWav() {
        return xsDrChgWav;
    }

    /**
     * Sets the value of the xsDrChgWav property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XsDrChgWavType }{@code >}
     *     
     */
    public void setXsDrChgWav(JAXBElement<XsDrChgWavType> value) {
        this.xsDrChgWav = value;
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
