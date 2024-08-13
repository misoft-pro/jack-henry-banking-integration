
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
 * <p>Java class for RedSerChgMthdInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RedSerChgMthdInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RedSerChgMthdType" type="{http://jackhenry.com/jxchange/TPG/2008}RedSerChgMthdType_Type"/&gt;
 *         &lt;element name="RedSerChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RedSerChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RedSerChgIdxNum" type="{http://jackhenry.com/jxchange/TPG/2008}RedSerChgIdxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="RedSerChgCalcType" type="{http://jackhenry.com/jxchange/TPG/2008}RedSerChgCalcType_Type" minOccurs="0"/&gt;
 *         &lt;element name="RedSerChgIncrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RedSerChgIncrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RedSerChgMinBal" type="{http://jackhenry.com/jxchange/TPG/2008}RedSerChgMinBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="RedSerChgResrvPct" type="{http://jackhenry.com/jxchange/TPG/2008}RedSerChgResrvPct_Type" minOccurs="0"/&gt;
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
@XmlType(name = "RedSerChgMthdInfoRec_CType", propOrder = {
    "redSerChgMthdType",
    "redSerChgAmt",
    "redSerChgIdxNum",
    "redSerChgCalcType",
    "redSerChgIncrAmt",
    "redSerChgMinBal",
    "redSerChgResrvPct",
    "ver1",
    "any"
})
public class RedSerChgMthdInfoRecCType {

    @XmlElement(name = "RedSerChgMthdType", required = true)
    protected RedSerChgMthdTypeType redSerChgMthdType;
    @XmlElementRef(name = "RedSerChgAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RedSerChgAmtType> redSerChgAmt;
    @XmlElementRef(name = "RedSerChgIdxNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RedSerChgIdxNumType> redSerChgIdxNum;
    @XmlElementRef(name = "RedSerChgCalcType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RedSerChgCalcTypeType> redSerChgCalcType;
    @XmlElementRef(name = "RedSerChgIncrAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RedSerChgIncrAmtType> redSerChgIncrAmt;
    @XmlElementRef(name = "RedSerChgMinBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RedSerChgMinBalType> redSerChgMinBal;
    @XmlElement(name = "RedSerChgResrvPct")
    protected RedSerChgResrvPctType redSerChgResrvPct;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the redSerChgMthdType property.
     * 
     * @return
     *     possible object is
     *     {@link RedSerChgMthdTypeType }
     *     
     */
    public RedSerChgMthdTypeType getRedSerChgMthdType() {
        return redSerChgMthdType;
    }

    /**
     * Sets the value of the redSerChgMthdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedSerChgMthdTypeType }
     *     
     */
    public void setRedSerChgMthdType(RedSerChgMthdTypeType value) {
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
     * Gets the value of the redSerChgIdxNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RedSerChgIdxNumType }{@code >}
     *     
     */
    public JAXBElement<RedSerChgIdxNumType> getRedSerChgIdxNum() {
        return redSerChgIdxNum;
    }

    /**
     * Sets the value of the redSerChgIdxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RedSerChgIdxNumType }{@code >}
     *     
     */
    public void setRedSerChgIdxNum(JAXBElement<RedSerChgIdxNumType> value) {
        this.redSerChgIdxNum = value;
    }

    /**
     * Gets the value of the redSerChgCalcType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RedSerChgCalcTypeType }{@code >}
     *     
     */
    public JAXBElement<RedSerChgCalcTypeType> getRedSerChgCalcType() {
        return redSerChgCalcType;
    }

    /**
     * Sets the value of the redSerChgCalcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RedSerChgCalcTypeType }{@code >}
     *     
     */
    public void setRedSerChgCalcType(JAXBElement<RedSerChgCalcTypeType> value) {
        this.redSerChgCalcType = value;
    }

    /**
     * Gets the value of the redSerChgIncrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RedSerChgIncrAmtType }{@code >}
     *     
     */
    public JAXBElement<RedSerChgIncrAmtType> getRedSerChgIncrAmt() {
        return redSerChgIncrAmt;
    }

    /**
     * Sets the value of the redSerChgIncrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RedSerChgIncrAmtType }{@code >}
     *     
     */
    public void setRedSerChgIncrAmt(JAXBElement<RedSerChgIncrAmtType> value) {
        this.redSerChgIncrAmt = value;
    }

    /**
     * Gets the value of the redSerChgMinBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RedSerChgMinBalType }{@code >}
     *     
     */
    public JAXBElement<RedSerChgMinBalType> getRedSerChgMinBal() {
        return redSerChgMinBal;
    }

    /**
     * Sets the value of the redSerChgMinBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RedSerChgMinBalType }{@code >}
     *     
     */
    public void setRedSerChgMinBal(JAXBElement<RedSerChgMinBalType> value) {
        this.redSerChgMinBal = value;
    }

    /**
     * Gets the value of the redSerChgResrvPct property.
     * 
     * @return
     *     possible object is
     *     {@link RedSerChgResrvPctType }
     *     
     */
    public RedSerChgResrvPctType getRedSerChgResrvPct() {
        return redSerChgResrvPct;
    }

    /**
     * Sets the value of the redSerChgResrvPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedSerChgResrvPctType }
     *     
     */
    public void setRedSerChgResrvPct(RedSerChgResrvPctType value) {
        this.redSerChgResrvPct = value;
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
