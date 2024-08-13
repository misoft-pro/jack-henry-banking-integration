
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for TrnRiskStatRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnRiskStatRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrnRiskStatType" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRiskStatType_Type"/&gt;
 *         &lt;element name="TrnRiskStatCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRiskStatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnRiskStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRiskStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnRiskColStat" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRiskColStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnRiskStatPrevCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRiskStatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnRiskStatRsnArray" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRiskStatRsnArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="TrnRiskSrcDesc" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRiskSrcDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TrnRiskStatRec_CType", propOrder = {
    "trnRiskStatType",
    "trnRiskStatCode",
    "trnRiskStatDesc",
    "trnRiskColStat",
    "trnRiskStatPrevCode",
    "trnRiskStatRsnArray",
    "ver1",
    "trnRiskSrcDesc",
    "ver2",
    "any"
})
public class TrnRiskStatRecCType {

    @XmlElement(name = "TrnRiskStatType", required = true)
    protected TrnRiskStatTypeType trnRiskStatType;
    @XmlElement(name = "TrnRiskStatCode")
    protected TrnRiskStatCodeType trnRiskStatCode;
    @XmlElement(name = "TrnRiskStatDesc")
    protected TrnRiskStatDescType trnRiskStatDesc;
    @XmlElement(name = "TrnRiskColStat")
    protected TrnRiskColStatType trnRiskColStat;
    @XmlElement(name = "TrnRiskStatPrevCode")
    protected TrnRiskStatCodeType trnRiskStatPrevCode;
    @XmlElement(name = "TrnRiskStatRsnArray")
    protected TrnRiskStatRsnArrayAType trnRiskStatRsnArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "TrnRiskSrcDesc")
    protected TrnRiskSrcDescType trnRiskSrcDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the trnRiskStatType property.
     * 
     * @return
     *     possible object is
     *     {@link TrnRiskStatTypeType }
     *     
     */
    public TrnRiskStatTypeType getTrnRiskStatType() {
        return trnRiskStatType;
    }

    /**
     * Sets the value of the trnRiskStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnRiskStatTypeType }
     *     
     */
    public void setTrnRiskStatType(TrnRiskStatTypeType value) {
        this.trnRiskStatType = value;
    }

    /**
     * Gets the value of the trnRiskStatCode property.
     * 
     * @return
     *     possible object is
     *     {@link TrnRiskStatCodeType }
     *     
     */
    public TrnRiskStatCodeType getTrnRiskStatCode() {
        return trnRiskStatCode;
    }

    /**
     * Sets the value of the trnRiskStatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnRiskStatCodeType }
     *     
     */
    public void setTrnRiskStatCode(TrnRiskStatCodeType value) {
        this.trnRiskStatCode = value;
    }

    /**
     * Gets the value of the trnRiskStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link TrnRiskStatDescType }
     *     
     */
    public TrnRiskStatDescType getTrnRiskStatDesc() {
        return trnRiskStatDesc;
    }

    /**
     * Sets the value of the trnRiskStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnRiskStatDescType }
     *     
     */
    public void setTrnRiskStatDesc(TrnRiskStatDescType value) {
        this.trnRiskStatDesc = value;
    }

    /**
     * Gets the value of the trnRiskColStat property.
     * 
     * @return
     *     possible object is
     *     {@link TrnRiskColStatType }
     *     
     */
    public TrnRiskColStatType getTrnRiskColStat() {
        return trnRiskColStat;
    }

    /**
     * Sets the value of the trnRiskColStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnRiskColStatType }
     *     
     */
    public void setTrnRiskColStat(TrnRiskColStatType value) {
        this.trnRiskColStat = value;
    }

    /**
     * Gets the value of the trnRiskStatPrevCode property.
     * 
     * @return
     *     possible object is
     *     {@link TrnRiskStatCodeType }
     *     
     */
    public TrnRiskStatCodeType getTrnRiskStatPrevCode() {
        return trnRiskStatPrevCode;
    }

    /**
     * Sets the value of the trnRiskStatPrevCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnRiskStatCodeType }
     *     
     */
    public void setTrnRiskStatPrevCode(TrnRiskStatCodeType value) {
        this.trnRiskStatPrevCode = value;
    }

    /**
     * Gets the value of the trnRiskStatRsnArray property.
     * 
     * @return
     *     possible object is
     *     {@link TrnRiskStatRsnArrayAType }
     *     
     */
    public TrnRiskStatRsnArrayAType getTrnRiskStatRsnArray() {
        return trnRiskStatRsnArray;
    }

    /**
     * Sets the value of the trnRiskStatRsnArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnRiskStatRsnArrayAType }
     *     
     */
    public void setTrnRiskStatRsnArray(TrnRiskStatRsnArrayAType value) {
        this.trnRiskStatRsnArray = value;
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
     * Gets the value of the trnRiskSrcDesc property.
     * 
     * @return
     *     possible object is
     *     {@link TrnRiskSrcDescType }
     *     
     */
    public TrnRiskSrcDescType getTrnRiskSrcDesc() {
        return trnRiskSrcDesc;
    }

    /**
     * Sets the value of the trnRiskSrcDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnRiskSrcDescType }
     *     
     */
    public void setTrnRiskSrcDesc(TrnRiskSrcDescType value) {
        this.trnRiskSrcDesc = value;
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
