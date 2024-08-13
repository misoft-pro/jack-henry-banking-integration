
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
 * <p>Java class for OthInsurInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OthInsurInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OthInsurText" type="{http://jackhenry.com/jxchange/TPG/2008}OthInsurText_Type" minOccurs="0"/&gt;
 *         &lt;element name="OthInsurAccrBase" type="{http://jackhenry.com/jxchange/TPG/2008}OthInsurAccrBase_Type" minOccurs="0"/&gt;
 *         &lt;element name="OthInsurIdxNum" type="{http://jackhenry.com/jxchange/TPG/2008}OthInsurIdxNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="OthInsurStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}OthInsurStartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OthInsurTerm" type="{http://jackhenry.com/jxchange/TPG/2008}TermCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OthInsurTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}TermUnits_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="OthInsurCompCode" type="{http://jackhenry.com/jxchange/TPG/2008}OthInsurCompCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="OthInsurCompDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OthInsurCompDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "OthInsurInfoRec_CType", propOrder = {
    "othInsurText",
    "othInsurAccrBase",
    "othInsurIdxNum",
    "othInsurStartDt",
    "othInsurTerm",
    "othInsurTermUnits",
    "ver1",
    "othInsurCompCode",
    "othInsurCompDesc",
    "ver2",
    "any"
})
public class OthInsurInfoRecCType {

    @XmlElementRef(name = "OthInsurText", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OthInsurTextType> othInsurText;
    @XmlElementRef(name = "OthInsurAccrBase", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OthInsurAccrBaseType> othInsurAccrBase;
    @XmlElementRef(name = "OthInsurIdxNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OthInsurIdxNumType> othInsurIdxNum;
    @XmlElementRef(name = "OthInsurStartDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OthInsurStartDtType> othInsurStartDt;
    @XmlElementRef(name = "OthInsurTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermCntType> othInsurTerm;
    @XmlElementRef(name = "OthInsurTermUnits", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TermUnitsType> othInsurTermUnits;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "OthInsurCompCode")
    protected OthInsurCompCodeType othInsurCompCode;
    @XmlElement(name = "OthInsurCompDesc")
    protected OthInsurCompDescType othInsurCompDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the othInsurText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OthInsurTextType }{@code >}
     *     
     */
    public JAXBElement<OthInsurTextType> getOthInsurText() {
        return othInsurText;
    }

    /**
     * Sets the value of the othInsurText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OthInsurTextType }{@code >}
     *     
     */
    public void setOthInsurText(JAXBElement<OthInsurTextType> value) {
        this.othInsurText = value;
    }

    /**
     * Gets the value of the othInsurAccrBase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OthInsurAccrBaseType }{@code >}
     *     
     */
    public JAXBElement<OthInsurAccrBaseType> getOthInsurAccrBase() {
        return othInsurAccrBase;
    }

    /**
     * Sets the value of the othInsurAccrBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OthInsurAccrBaseType }{@code >}
     *     
     */
    public void setOthInsurAccrBase(JAXBElement<OthInsurAccrBaseType> value) {
        this.othInsurAccrBase = value;
    }

    /**
     * Gets the value of the othInsurIdxNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OthInsurIdxNumType }{@code >}
     *     
     */
    public JAXBElement<OthInsurIdxNumType> getOthInsurIdxNum() {
        return othInsurIdxNum;
    }

    /**
     * Sets the value of the othInsurIdxNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OthInsurIdxNumType }{@code >}
     *     
     */
    public void setOthInsurIdxNum(JAXBElement<OthInsurIdxNumType> value) {
        this.othInsurIdxNum = value;
    }

    /**
     * Gets the value of the othInsurStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OthInsurStartDtType }{@code >}
     *     
     */
    public JAXBElement<OthInsurStartDtType> getOthInsurStartDt() {
        return othInsurStartDt;
    }

    /**
     * Sets the value of the othInsurStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OthInsurStartDtType }{@code >}
     *     
     */
    public void setOthInsurStartDt(JAXBElement<OthInsurStartDtType> value) {
        this.othInsurStartDt = value;
    }

    /**
     * Gets the value of the othInsurTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public JAXBElement<TermCntType> getOthInsurTerm() {
        return othInsurTerm;
    }

    /**
     * Sets the value of the othInsurTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermCntType }{@code >}
     *     
     */
    public void setOthInsurTerm(JAXBElement<TermCntType> value) {
        this.othInsurTerm = value;
    }

    /**
     * Gets the value of the othInsurTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}
     *     
     */
    public JAXBElement<TermUnitsType> getOthInsurTermUnits() {
        return othInsurTermUnits;
    }

    /**
     * Sets the value of the othInsurTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TermUnitsType }{@code >}
     *     
     */
    public void setOthInsurTermUnits(JAXBElement<TermUnitsType> value) {
        this.othInsurTermUnits = value;
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
     * Gets the value of the othInsurCompCode property.
     * 
     * @return
     *     possible object is
     *     {@link OthInsurCompCodeType }
     *     
     */
    public OthInsurCompCodeType getOthInsurCompCode() {
        return othInsurCompCode;
    }

    /**
     * Sets the value of the othInsurCompCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OthInsurCompCodeType }
     *     
     */
    public void setOthInsurCompCode(OthInsurCompCodeType value) {
        this.othInsurCompCode = value;
    }

    /**
     * Gets the value of the othInsurCompDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OthInsurCompDescType }
     *     
     */
    public OthInsurCompDescType getOthInsurCompDesc() {
        return othInsurCompDesc;
    }

    /**
     * Sets the value of the othInsurCompDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OthInsurCompDescType }
     *     
     */
    public void setOthInsurCompDesc(OthInsurCompDescType value) {
        this.othInsurCompDesc = value;
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
