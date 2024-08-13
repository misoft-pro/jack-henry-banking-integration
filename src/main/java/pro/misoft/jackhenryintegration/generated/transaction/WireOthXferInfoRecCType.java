
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for WireOthXferInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireOthXferInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireDetOfChg" type="{http://jackhenry.com/jxchange/TPG/2008}DetOfChgType_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireSndrChgArray" type="{http://jackhenry.com/jxchange/TPG/2008}WireSndChgArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="WireCurrencyCode" type="{http://jackhenry.com/jxchange/TPG/2008}CurrencyCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireInstrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireExchRate" type="{http://jackhenry.com/jxchange/TPG/2008}CurrExchRate_Type" minOccurs="0"/&gt;
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
@XmlType(name = "WireOthXferInfoRec_CType", propOrder = {
    "wireDetOfChg",
    "wireSndrChgArray",
    "wireCurrencyCode",
    "wireInstrAmt",
    "wireExchRate",
    "ver1",
    "any"
})
public class WireOthXferInfoRecCType {

    @XmlElement(name = "WireDetOfChg")
    protected DetOfChgTypeType wireDetOfChg;
    @XmlElement(name = "WireSndrChgArray")
    protected WireSndChgArrayAType wireSndrChgArray;
    @XmlElement(name = "WireCurrencyCode")
    protected CurrencyCodeType wireCurrencyCode;
    @XmlElement(name = "WireInstrAmt")
    protected WireAmtType wireInstrAmt;
    @XmlElement(name = "WireExchRate")
    protected CurrExchRateType wireExchRate;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the wireDetOfChg property.
     * 
     * @return
     *     possible object is
     *     {@link DetOfChgTypeType }
     *     
     */
    public DetOfChgTypeType getWireDetOfChg() {
        return wireDetOfChg;
    }

    /**
     * Sets the value of the wireDetOfChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetOfChgTypeType }
     *     
     */
    public void setWireDetOfChg(DetOfChgTypeType value) {
        this.wireDetOfChg = value;
    }

    /**
     * Gets the value of the wireSndrChgArray property.
     * 
     * @return
     *     possible object is
     *     {@link WireSndChgArrayAType }
     *     
     */
    public WireSndChgArrayAType getWireSndrChgArray() {
        return wireSndrChgArray;
    }

    /**
     * Sets the value of the wireSndrChgArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireSndChgArrayAType }
     *     
     */
    public void setWireSndrChgArray(WireSndChgArrayAType value) {
        this.wireSndrChgArray = value;
    }

    /**
     * Gets the value of the wireCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getWireCurrencyCode() {
        return wireCurrencyCode;
    }

    /**
     * Sets the value of the wireCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setWireCurrencyCode(CurrencyCodeType value) {
        this.wireCurrencyCode = value;
    }

    /**
     * Gets the value of the wireInstrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link WireAmtType }
     *     
     */
    public WireAmtType getWireInstrAmt() {
        return wireInstrAmt;
    }

    /**
     * Sets the value of the wireInstrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireAmtType }
     *     
     */
    public void setWireInstrAmt(WireAmtType value) {
        this.wireInstrAmt = value;
    }

    /**
     * Gets the value of the wireExchRate property.
     * 
     * @return
     *     possible object is
     *     {@link CurrExchRateType }
     *     
     */
    public CurrExchRateType getWireExchRate() {
        return wireExchRate;
    }

    /**
     * Sets the value of the wireExchRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrExchRateType }
     *     
     */
    public void setWireExchRate(CurrExchRateType value) {
        this.wireExchRate = value;
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
     * {@link Element }
     * {@link Object }
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
