
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
 * <p>Java class for LnClsInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnClsInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnClsInfoTxt" type="{http://jackhenry.com/jxchange/TPG/2008}LnClsInfoTxt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClsCost" type="{http://jackhenry.com/jxchange/TPG/2008}ClsCost_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClsCostSrcCode" type="{http://jackhenry.com/jxchange/TPG/2008}ClsCostSrcCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClsCostSrcDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ClsCostSrcDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DownPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}DownPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DownPmtSrcCode" type="{http://jackhenry.com/jxchange/TPG/2008}DownPmtSrcCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DownPmtSrcDesc" type="{http://jackhenry.com/jxchange/TPG/2008}DownPmtSrcDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecdLnAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SecdLnAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecdLnCode" type="{http://jackhenry.com/jxchange/TPG/2008}SecdLnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecdLnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SecdLnDesc_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="LnClsPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LnClsPmtAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnClsInfo_CType", propOrder = {
    "lnClsInfoTxt",
    "clsCost",
    "clsCostSrcCode",
    "clsCostSrcDesc",
    "downPmtAmt",
    "downPmtSrcCode",
    "downPmtSrcDesc",
    "secdLnAmt",
    "secdLnCode",
    "secdLnDesc",
    "ver1",
    "lnClsPmtAmt",
    "ver2",
    "any"
})
public class LnClsInfoCType {

    @XmlElementRef(name = "LnClsInfoTxt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnClsInfoTxtType> lnClsInfoTxt;
    @XmlElementRef(name = "ClsCost", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ClsCostType> clsCost;
    @XmlElementRef(name = "ClsCostSrcCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ClsCostSrcCodeType> clsCostSrcCode;
    @XmlElementRef(name = "ClsCostSrcDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ClsCostSrcDescType> clsCostSrcDesc;
    @XmlElementRef(name = "DownPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DownPmtAmtType> downPmtAmt;
    @XmlElementRef(name = "DownPmtSrcCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DownPmtSrcCodeType> downPmtSrcCode;
    @XmlElementRef(name = "DownPmtSrcDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DownPmtSrcDescType> downPmtSrcDesc;
    @XmlElementRef(name = "SecdLnAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SecdLnAmtType> secdLnAmt;
    @XmlElementRef(name = "SecdLnCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SecdLnCodeType> secdLnCode;
    @XmlElementRef(name = "SecdLnDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SecdLnDescType> secdLnDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "LnClsPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LnClsPmtAmtType> lnClsPmtAmt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnClsInfoTxt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnClsInfoTxtType }{@code >}
     *     
     */
    public JAXBElement<LnClsInfoTxtType> getLnClsInfoTxt() {
        return lnClsInfoTxt;
    }

    /**
     * Sets the value of the lnClsInfoTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnClsInfoTxtType }{@code >}
     *     
     */
    public void setLnClsInfoTxt(JAXBElement<LnClsInfoTxtType> value) {
        this.lnClsInfoTxt = value;
    }

    /**
     * Gets the value of the clsCost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClsCostType }{@code >}
     *     
     */
    public JAXBElement<ClsCostType> getClsCost() {
        return clsCost;
    }

    /**
     * Sets the value of the clsCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClsCostType }{@code >}
     *     
     */
    public void setClsCost(JAXBElement<ClsCostType> value) {
        this.clsCost = value;
    }

    /**
     * Gets the value of the clsCostSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClsCostSrcCodeType }{@code >}
     *     
     */
    public JAXBElement<ClsCostSrcCodeType> getClsCostSrcCode() {
        return clsCostSrcCode;
    }

    /**
     * Sets the value of the clsCostSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClsCostSrcCodeType }{@code >}
     *     
     */
    public void setClsCostSrcCode(JAXBElement<ClsCostSrcCodeType> value) {
        this.clsCostSrcCode = value;
    }

    /**
     * Gets the value of the clsCostSrcDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClsCostSrcDescType }{@code >}
     *     
     */
    public JAXBElement<ClsCostSrcDescType> getClsCostSrcDesc() {
        return clsCostSrcDesc;
    }

    /**
     * Sets the value of the clsCostSrcDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClsCostSrcDescType }{@code >}
     *     
     */
    public void setClsCostSrcDesc(JAXBElement<ClsCostSrcDescType> value) {
        this.clsCostSrcDesc = value;
    }

    /**
     * Gets the value of the downPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DownPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<DownPmtAmtType> getDownPmtAmt() {
        return downPmtAmt;
    }

    /**
     * Sets the value of the downPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DownPmtAmtType }{@code >}
     *     
     */
    public void setDownPmtAmt(JAXBElement<DownPmtAmtType> value) {
        this.downPmtAmt = value;
    }

    /**
     * Gets the value of the downPmtSrcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DownPmtSrcCodeType }{@code >}
     *     
     */
    public JAXBElement<DownPmtSrcCodeType> getDownPmtSrcCode() {
        return downPmtSrcCode;
    }

    /**
     * Sets the value of the downPmtSrcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DownPmtSrcCodeType }{@code >}
     *     
     */
    public void setDownPmtSrcCode(JAXBElement<DownPmtSrcCodeType> value) {
        this.downPmtSrcCode = value;
    }

    /**
     * Gets the value of the downPmtSrcDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DownPmtSrcDescType }{@code >}
     *     
     */
    public JAXBElement<DownPmtSrcDescType> getDownPmtSrcDesc() {
        return downPmtSrcDesc;
    }

    /**
     * Sets the value of the downPmtSrcDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DownPmtSrcDescType }{@code >}
     *     
     */
    public void setDownPmtSrcDesc(JAXBElement<DownPmtSrcDescType> value) {
        this.downPmtSrcDesc = value;
    }

    /**
     * Gets the value of the secdLnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecdLnAmtType }{@code >}
     *     
     */
    public JAXBElement<SecdLnAmtType> getSecdLnAmt() {
        return secdLnAmt;
    }

    /**
     * Sets the value of the secdLnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecdLnAmtType }{@code >}
     *     
     */
    public void setSecdLnAmt(JAXBElement<SecdLnAmtType> value) {
        this.secdLnAmt = value;
    }

    /**
     * Gets the value of the secdLnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecdLnCodeType }{@code >}
     *     
     */
    public JAXBElement<SecdLnCodeType> getSecdLnCode() {
        return secdLnCode;
    }

    /**
     * Sets the value of the secdLnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecdLnCodeType }{@code >}
     *     
     */
    public void setSecdLnCode(JAXBElement<SecdLnCodeType> value) {
        this.secdLnCode = value;
    }

    /**
     * Gets the value of the secdLnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecdLnDescType }{@code >}
     *     
     */
    public JAXBElement<SecdLnDescType> getSecdLnDesc() {
        return secdLnDesc;
    }

    /**
     * Sets the value of the secdLnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecdLnDescType }{@code >}
     *     
     */
    public void setSecdLnDesc(JAXBElement<SecdLnDescType> value) {
        this.secdLnDesc = value;
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
     * Gets the value of the lnClsPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LnClsPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<LnClsPmtAmtType> getLnClsPmtAmt() {
        return lnClsPmtAmt;
    }

    /**
     * Sets the value of the lnClsPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LnClsPmtAmtType }{@code >}
     *     
     */
    public void setLnClsPmtAmt(JAXBElement<LnClsPmtAmtType> value) {
        this.lnClsPmtAmt = value;
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
