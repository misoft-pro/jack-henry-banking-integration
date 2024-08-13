
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for OthIncmInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OthIncmInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OthIncmFreq" type="{http://jackhenry.com/jxchange/TPG/2008}TermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="OthIncmAmt" type="{http://jackhenry.com/jxchange/TPG/2008}OthIncmAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OthIncmCode" type="{http://jackhenry.com/jxchange/TPG/2008}OthIncmCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OthIncmSrcCode" type="{http://jackhenry.com/jxchange/TPG/2008}OthIncmSrcCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="NonTaxblIncmType" type="{http://jackhenry.com/jxchange/TPG/2008}NonTaxblIncmType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "OthIncmInfo_CType", propOrder = {
    "othIncmFreq",
    "othIncmAmt",
    "othIncmCode",
    "othIncmSrcCode",
    "ver1",
    "nonTaxblIncmType",
    "ver2",
    "any"
})
public class OthIncmInfoCType {

    @XmlElement(name = "OthIncmFreq")
    protected TermUnitsType othIncmFreq;
    @XmlElement(name = "OthIncmAmt")
    protected OthIncmAmtType othIncmAmt;
    @XmlElement(name = "OthIncmCode")
    protected OthIncmCodeType othIncmCode;
    @XmlElement(name = "OthIncmSrcCode")
    protected OthIncmSrcCodeType othIncmSrcCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "NonTaxblIncmType")
    protected NonTaxblIncmTypeType nonTaxblIncmType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the othIncmFreq property.
     * 
     * @return
     *     possible object is
     *     {@link TermUnitsType }
     *     
     */
    public TermUnitsType getOthIncmFreq() {
        return othIncmFreq;
    }

    /**
     * Sets the value of the othIncmFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermUnitsType }
     *     
     */
    public void setOthIncmFreq(TermUnitsType value) {
        this.othIncmFreq = value;
    }

    /**
     * Gets the value of the othIncmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OthIncmAmtType }
     *     
     */
    public OthIncmAmtType getOthIncmAmt() {
        return othIncmAmt;
    }

    /**
     * Sets the value of the othIncmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OthIncmAmtType }
     *     
     */
    public void setOthIncmAmt(OthIncmAmtType value) {
        this.othIncmAmt = value;
    }

    /**
     * Gets the value of the othIncmCode property.
     * 
     * @return
     *     possible object is
     *     {@link OthIncmCodeType }
     *     
     */
    public OthIncmCodeType getOthIncmCode() {
        return othIncmCode;
    }

    /**
     * Sets the value of the othIncmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OthIncmCodeType }
     *     
     */
    public void setOthIncmCode(OthIncmCodeType value) {
        this.othIncmCode = value;
    }

    /**
     * Gets the value of the othIncmSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link OthIncmSrcCodeType }
     *     
     */
    public OthIncmSrcCodeType getOthIncmSrcCode() {
        return othIncmSrcCode;
    }

    /**
     * Sets the value of the othIncmSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OthIncmSrcCodeType }
     *     
     */
    public void setOthIncmSrcCode(OthIncmSrcCodeType value) {
        this.othIncmSrcCode = value;
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
     * Gets the value of the nonTaxblIncmType property.
     * 
     * @return
     *     possible object is
     *     {@link NonTaxblIncmTypeType }
     *     
     */
    public NonTaxblIncmTypeType getNonTaxblIncmType() {
        return nonTaxblIncmType;
    }

    /**
     * Sets the value of the nonTaxblIncmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonTaxblIncmTypeType }
     *     
     */
    public void setNonTaxblIncmType(NonTaxblIncmTypeType value) {
        this.nonTaxblIncmType = value;
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
