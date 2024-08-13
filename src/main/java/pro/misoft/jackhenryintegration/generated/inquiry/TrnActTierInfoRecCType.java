
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
 * <p>Java class for TrnActTierInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnActTierInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TierTrnActType" type="{http://jackhenry.com/jxchange/TPG/2008}TierTrnActType_Type"/&gt;
 *         &lt;element name="TierTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}TierTrnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="TierChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}TierChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TierTolrXsCnt" type="{http://jackhenry.com/jxchange/TPG/2008}TierTolrXsCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TierActBalInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}TierActBalInfoArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "TrnActTierInfoRec_CType", propOrder = {
    "tierTrnActType",
    "tierTrnType",
    "tierChgAmt",
    "tierTolrXsCnt",
    "tierActBalInfoArray",
    "ver1",
    "any"
})
public class TrnActTierInfoRecCType {

    @XmlElement(name = "TierTrnActType", required = true)
    protected TierTrnActTypeType tierTrnActType;
    @XmlElementRef(name = "TierTrnType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TierTrnTypeType> tierTrnType;
    @XmlElementRef(name = "TierChgAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TierChgAmtType> tierChgAmt;
    @XmlElementRef(name = "TierTolrXsCnt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TierTolrXsCntType> tierTolrXsCnt;
    @XmlElement(name = "TierActBalInfoArray")
    protected TierActBalInfoArrayAType tierActBalInfoArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the tierTrnActType property.
     * 
     * @return
     *     possible object is
     *     {@link TierTrnActTypeType }
     *     
     */
    public TierTrnActTypeType getTierTrnActType() {
        return tierTrnActType;
    }

    /**
     * Sets the value of the tierTrnActType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierTrnActTypeType }
     *     
     */
    public void setTierTrnActType(TierTrnActTypeType value) {
        this.tierTrnActType = value;
    }

    /**
     * Gets the value of the tierTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TierTrnTypeType }{@code >}
     *     
     */
    public JAXBElement<TierTrnTypeType> getTierTrnType() {
        return tierTrnType;
    }

    /**
     * Sets the value of the tierTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TierTrnTypeType }{@code >}
     *     
     */
    public void setTierTrnType(JAXBElement<TierTrnTypeType> value) {
        this.tierTrnType = value;
    }

    /**
     * Gets the value of the tierChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TierChgAmtType }{@code >}
     *     
     */
    public JAXBElement<TierChgAmtType> getTierChgAmt() {
        return tierChgAmt;
    }

    /**
     * Sets the value of the tierChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TierChgAmtType }{@code >}
     *     
     */
    public void setTierChgAmt(JAXBElement<TierChgAmtType> value) {
        this.tierChgAmt = value;
    }

    /**
     * Gets the value of the tierTolrXsCnt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TierTolrXsCntType }{@code >}
     *     
     */
    public JAXBElement<TierTolrXsCntType> getTierTolrXsCnt() {
        return tierTolrXsCnt;
    }

    /**
     * Sets the value of the tierTolrXsCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TierTolrXsCntType }{@code >}
     *     
     */
    public void setTierTolrXsCnt(JAXBElement<TierTolrXsCntType> value) {
        this.tierTolrXsCnt = value;
    }

    /**
     * Gets the value of the tierActBalInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link TierActBalInfoArrayAType }
     *     
     */
    public TierActBalInfoArrayAType getTierActBalInfoArray() {
        return tierActBalInfoArray;
    }

    /**
     * Sets the value of the tierActBalInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierActBalInfoArrayAType }
     *     
     */
    public void setTierActBalInfoArray(TierActBalInfoArrayAType value) {
        this.tierActBalInfoArray = value;
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
