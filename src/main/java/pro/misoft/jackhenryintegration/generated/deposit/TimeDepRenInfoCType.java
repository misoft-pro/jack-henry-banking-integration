
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
 * <p>Java class for TimeDepRenInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeDepRenInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LastRenDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastRenDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RenCode" type="{http://jackhenry.com/jxchange/TPG/2008}RenCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OvrrdRenCode" type="{http://jackhenry.com/jxchange/TPG/2008}OvrrdRenCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OvrrdRenRate" type="{http://jackhenry.com/jxchange/TPG/2008}OvrrdRenRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="OvrrdRenRateNum" type="{http://jackhenry.com/jxchange/TPG/2008}OvrrdRenRateNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="RenToProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}RenToProdCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="RenTermFreq" type="{http://jackhenry.com/jxchange/TPG/2008}TermCnt_Type" minOccurs="0"/&gt;
 *           &lt;element name="RenTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}TermUnits_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TimeDepRenInfo_CType", propOrder = {
    "lastRenDt",
    "renCode",
    "ovrrdRenCode",
    "ovrrdRenRate",
    "ovrrdRenRateNum",
    "renToProdCode",
    "ver1",
    "renTermFreq",
    "renTermUnits",
    "ver2",
    "any"
})
public class TimeDepRenInfoCType {

    @XmlElementRef(name = "LastRenDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastRenDtType> lastRenDt;
    @XmlElementRef(name = "RenCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RenCodeType> renCode;
    @XmlElementRef(name = "OvrrdRenCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OvrrdRenCodeType> ovrrdRenCode;
    @XmlElementRef(name = "OvrrdRenRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OvrrdRenRateType> ovrrdRenRate;
    @XmlElementRef(name = "OvrrdRenRateNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OvrrdRenRateNumType> ovrrdRenRateNum;
    @XmlElementRef(name = "RenToProdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RenToProdCodeType> renToProdCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "RenTermFreq", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermCntType> renTermFreq;
    @XmlElementRef(name = "RenTermUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermUnitsType> renTermUnits;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lastRenDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastRenDtType }{@code >}
     *     
     */
    public JAXBElement<LastRenDtType> getLastRenDt() {
        return lastRenDt;
    }

    /**
     * Sets the value of the lastRenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastRenDtType }{@code >}
     *     
     */
    public void setLastRenDt(JAXBElement<LastRenDtType> value) {
        this.lastRenDt = value;
    }

    /**
     * Gets the value of the renCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RenCodeType }{@code >}
     *     
     */
    public JAXBElement<RenCodeType> getRenCode() {
        return renCode;
    }

    /**
     * Sets the value of the renCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RenCodeType }{@code >}
     *     
     */
    public void setRenCode(JAXBElement<RenCodeType> value) {
        this.renCode = value;
    }

    /**
     * Gets the value of the ovrrdRenCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OvrrdRenCodeType }{@code >}
     *     
     */
    public JAXBElement<OvrrdRenCodeType> getOvrrdRenCode() {
        return ovrrdRenCode;
    }

    /**
     * Sets the value of the ovrrdRenCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OvrrdRenCodeType }{@code >}
     *     
     */
    public void setOvrrdRenCode(JAXBElement<OvrrdRenCodeType> value) {
        this.ovrrdRenCode = value;
    }

    /**
     * Gets the value of the ovrrdRenRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OvrrdRenRateType }{@code >}
     *     
     */
    public JAXBElement<OvrrdRenRateType> getOvrrdRenRate() {
        return ovrrdRenRate;
    }

    /**
     * Sets the value of the ovrrdRenRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OvrrdRenRateType }{@code >}
     *     
     */
    public void setOvrrdRenRate(JAXBElement<OvrrdRenRateType> value) {
        this.ovrrdRenRate = value;
    }

    /**
     * Gets the value of the ovrrdRenRateNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OvrrdRenRateNumType }{@code >}
     *     
     */
    public JAXBElement<OvrrdRenRateNumType> getOvrrdRenRateNum() {
        return ovrrdRenRateNum;
    }

    /**
     * Sets the value of the ovrrdRenRateNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OvrrdRenRateNumType }{@code >}
     *     
     */
    public void setOvrrdRenRateNum(JAXBElement<OvrrdRenRateNumType> value) {
        this.ovrrdRenRateNum = value;
    }

    /**
     * Gets the value of the renToProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RenToProdCodeType }{@code >}
     *     
     */
    public JAXBElement<RenToProdCodeType> getRenToProdCode() {
        return renToProdCode;
    }

    /**
     * Sets the value of the renToProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RenToProdCodeType }{@code >}
     *     
     */
    public void setRenToProdCode(JAXBElement<RenToProdCodeType> value) {
        this.renToProdCode = value;
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
     * Gets the value of the renTermFreq property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public JAXBElement<TermCntType> getRenTermFreq() {
        return renTermFreq;
    }

    /**
     * Sets the value of the renTermFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public void setRenTermFreq(JAXBElement<TermCntType> value) {
        this.renTermFreq = value;
    }

    /**
     * Gets the value of the renTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}
     *     
     */
    public JAXBElement<TermUnitsType> getRenTermUnits() {
        return renTermUnits;
    }

    /**
     * Sets the value of the renTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}
     *     
     */
    public void setRenTermUnits(JAXBElement<TermUnitsType> value) {
        this.renTermUnits = value;
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
