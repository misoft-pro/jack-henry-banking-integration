
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
 * <p>Java class for EscrwAnlysInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EscrwAnlysInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EscrwAnlysArray" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwAnlysArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="EscrwARMNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwARMNotCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwChgPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwChgPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDefcGEPmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDefcGEPmtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDefcLTPmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDefcLTPmtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwBegStmtTerm" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwBegStmtTerm_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwBegStmtTermUnit" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwBegStmtTermUnit_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwPrtChkAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPrtChkAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwPrtChkPct" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPrtChkPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwRoundMthd" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwRoundMthd_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwShtGEPmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwShtGEPmtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwShtLTPmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwShtLTPmtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwNonAccrCode" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwNonAccrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwAnlysCusCode" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwAnlysCusCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwNxtAnlysDt" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwNxtAnlysDt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EscrwCushMos" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwCushMos_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EscrwAnlysInfoRec_CType", propOrder = {
    "escrwAnlysArray",
    "escrwARMNotCode",
    "escrwChgPmtAmt",
    "escrwDefcGEPmtCode",
    "escrwDefcLTPmtCode",
    "escrwBegStmtTerm",
    "escrwBegStmtTermUnit",
    "escrwPrtChkAmt",
    "escrwPrtChkPct",
    "escrwRoundMthd",
    "escrwShtGEPmtCode",
    "escrwShtLTPmtCode",
    "escrwNonAccrCode",
    "escrwAnlysCusCode",
    "escrwNxtAnlysDt",
    "ver1",
    "escrwCushMos",
    "ver2",
    "any"
})
public class EscrwAnlysInfoRecCType {

    @XmlElement(name = "EscrwAnlysArray")
    protected EscrwAnlysArrayAType escrwAnlysArray;
    @XmlElementRef(name = "EscrwARMNotCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwARMNotCodeType> escrwARMNotCode;
    @XmlElementRef(name = "EscrwChgPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwChgPmtAmtType> escrwChgPmtAmt;
    @XmlElementRef(name = "EscrwDefcGEPmtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwDefcGEPmtCodeType> escrwDefcGEPmtCode;
    @XmlElementRef(name = "EscrwDefcLTPmtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwDefcLTPmtCodeType> escrwDefcLTPmtCode;
    @XmlElementRef(name = "EscrwBegStmtTerm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwBegStmtTermType> escrwBegStmtTerm;
    @XmlElementRef(name = "EscrwBegStmtTermUnit", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwBegStmtTermUnitType> escrwBegStmtTermUnit;
    @XmlElementRef(name = "EscrwPrtChkAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwPrtChkAmtType> escrwPrtChkAmt;
    @XmlElementRef(name = "EscrwPrtChkPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwPrtChkPctType> escrwPrtChkPct;
    @XmlElementRef(name = "EscrwRoundMthd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwRoundMthdType> escrwRoundMthd;
    @XmlElementRef(name = "EscrwShtGEPmtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwShtGEPmtCodeType> escrwShtGEPmtCode;
    @XmlElementRef(name = "EscrwShtLTPmtCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwShtLTPmtCodeType> escrwShtLTPmtCode;
    @XmlElementRef(name = "EscrwNonAccrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwNonAccrCodeType> escrwNonAccrCode;
    @XmlElementRef(name = "EscrwAnlysCusCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwAnlysCusCodeType> escrwAnlysCusCode;
    @XmlElementRef(name = "EscrwNxtAnlysDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwNxtAnlysDtType> escrwNxtAnlysDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "EscrwCushMos", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<EscrwCushMosType> escrwCushMos;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the escrwAnlysArray property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwAnlysArrayAType }
     *     
     */
    public EscrwAnlysArrayAType getEscrwAnlysArray() {
        return escrwAnlysArray;
    }

    /**
     * Sets the value of the escrwAnlysArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwAnlysArrayAType }
     *     
     */
    public void setEscrwAnlysArray(EscrwAnlysArrayAType value) {
        this.escrwAnlysArray = value;
    }

    /**
     * Gets the value of the escrwARMNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwARMNotCodeType }{@code >}
     *     
     */
    public JAXBElement<EscrwARMNotCodeType> getEscrwARMNotCode() {
        return escrwARMNotCode;
    }

    /**
     * Sets the value of the escrwARMNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwARMNotCodeType }{@code >}
     *     
     */
    public void setEscrwARMNotCode(JAXBElement<EscrwARMNotCodeType> value) {
        this.escrwARMNotCode = value;
    }

    /**
     * Gets the value of the escrwChgPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwChgPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<EscrwChgPmtAmtType> getEscrwChgPmtAmt() {
        return escrwChgPmtAmt;
    }

    /**
     * Sets the value of the escrwChgPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwChgPmtAmtType }{@code >}
     *     
     */
    public void setEscrwChgPmtAmt(JAXBElement<EscrwChgPmtAmtType> value) {
        this.escrwChgPmtAmt = value;
    }

    /**
     * Gets the value of the escrwDefcGEPmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwDefcGEPmtCodeType }{@code >}
     *     
     */
    public JAXBElement<EscrwDefcGEPmtCodeType> getEscrwDefcGEPmtCode() {
        return escrwDefcGEPmtCode;
    }

    /**
     * Sets the value of the escrwDefcGEPmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwDefcGEPmtCodeType }{@code >}
     *     
     */
    public void setEscrwDefcGEPmtCode(JAXBElement<EscrwDefcGEPmtCodeType> value) {
        this.escrwDefcGEPmtCode = value;
    }

    /**
     * Gets the value of the escrwDefcLTPmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwDefcLTPmtCodeType }{@code >}
     *     
     */
    public JAXBElement<EscrwDefcLTPmtCodeType> getEscrwDefcLTPmtCode() {
        return escrwDefcLTPmtCode;
    }

    /**
     * Sets the value of the escrwDefcLTPmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwDefcLTPmtCodeType }{@code >}
     *     
     */
    public void setEscrwDefcLTPmtCode(JAXBElement<EscrwDefcLTPmtCodeType> value) {
        this.escrwDefcLTPmtCode = value;
    }

    /**
     * Gets the value of the escrwBegStmtTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwBegStmtTermType }{@code >}
     *     
     */
    public JAXBElement<EscrwBegStmtTermType> getEscrwBegStmtTerm() {
        return escrwBegStmtTerm;
    }

    /**
     * Sets the value of the escrwBegStmtTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwBegStmtTermType }{@code >}
     *     
     */
    public void setEscrwBegStmtTerm(JAXBElement<EscrwBegStmtTermType> value) {
        this.escrwBegStmtTerm = value;
    }

    /**
     * Gets the value of the escrwBegStmtTermUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwBegStmtTermUnitType }{@code >}
     *     
     */
    public JAXBElement<EscrwBegStmtTermUnitType> getEscrwBegStmtTermUnit() {
        return escrwBegStmtTermUnit;
    }

    /**
     * Sets the value of the escrwBegStmtTermUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwBegStmtTermUnitType }{@code >}
     *     
     */
    public void setEscrwBegStmtTermUnit(JAXBElement<EscrwBegStmtTermUnitType> value) {
        this.escrwBegStmtTermUnit = value;
    }

    /**
     * Gets the value of the escrwPrtChkAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwPrtChkAmtType }{@code >}
     *     
     */
    public JAXBElement<EscrwPrtChkAmtType> getEscrwPrtChkAmt() {
        return escrwPrtChkAmt;
    }

    /**
     * Sets the value of the escrwPrtChkAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwPrtChkAmtType }{@code >}
     *     
     */
    public void setEscrwPrtChkAmt(JAXBElement<EscrwPrtChkAmtType> value) {
        this.escrwPrtChkAmt = value;
    }

    /**
     * Gets the value of the escrwPrtChkPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwPrtChkPctType }{@code >}
     *     
     */
    public JAXBElement<EscrwPrtChkPctType> getEscrwPrtChkPct() {
        return escrwPrtChkPct;
    }

    /**
     * Sets the value of the escrwPrtChkPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwPrtChkPctType }{@code >}
     *     
     */
    public void setEscrwPrtChkPct(JAXBElement<EscrwPrtChkPctType> value) {
        this.escrwPrtChkPct = value;
    }

    /**
     * Gets the value of the escrwRoundMthd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwRoundMthdType }{@code >}
     *     
     */
    public JAXBElement<EscrwRoundMthdType> getEscrwRoundMthd() {
        return escrwRoundMthd;
    }

    /**
     * Sets the value of the escrwRoundMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwRoundMthdType }{@code >}
     *     
     */
    public void setEscrwRoundMthd(JAXBElement<EscrwRoundMthdType> value) {
        this.escrwRoundMthd = value;
    }

    /**
     * Gets the value of the escrwShtGEPmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwShtGEPmtCodeType }{@code >}
     *     
     */
    public JAXBElement<EscrwShtGEPmtCodeType> getEscrwShtGEPmtCode() {
        return escrwShtGEPmtCode;
    }

    /**
     * Sets the value of the escrwShtGEPmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwShtGEPmtCodeType }{@code >}
     *     
     */
    public void setEscrwShtGEPmtCode(JAXBElement<EscrwShtGEPmtCodeType> value) {
        this.escrwShtGEPmtCode = value;
    }

    /**
     * Gets the value of the escrwShtLTPmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwShtLTPmtCodeType }{@code >}
     *     
     */
    public JAXBElement<EscrwShtLTPmtCodeType> getEscrwShtLTPmtCode() {
        return escrwShtLTPmtCode;
    }

    /**
     * Sets the value of the escrwShtLTPmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwShtLTPmtCodeType }{@code >}
     *     
     */
    public void setEscrwShtLTPmtCode(JAXBElement<EscrwShtLTPmtCodeType> value) {
        this.escrwShtLTPmtCode = value;
    }

    /**
     * Gets the value of the escrwNonAccrCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwNonAccrCodeType }{@code >}
     *     
     */
    public JAXBElement<EscrwNonAccrCodeType> getEscrwNonAccrCode() {
        return escrwNonAccrCode;
    }

    /**
     * Sets the value of the escrwNonAccrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwNonAccrCodeType }{@code >}
     *     
     */
    public void setEscrwNonAccrCode(JAXBElement<EscrwNonAccrCodeType> value) {
        this.escrwNonAccrCode = value;
    }

    /**
     * Gets the value of the escrwAnlysCusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwAnlysCusCodeType }{@code >}
     *     
     */
    public JAXBElement<EscrwAnlysCusCodeType> getEscrwAnlysCusCode() {
        return escrwAnlysCusCode;
    }

    /**
     * Sets the value of the escrwAnlysCusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwAnlysCusCodeType }{@code >}
     *     
     */
    public void setEscrwAnlysCusCode(JAXBElement<EscrwAnlysCusCodeType> value) {
        this.escrwAnlysCusCode = value;
    }

    /**
     * Gets the value of the escrwNxtAnlysDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwNxtAnlysDtType }{@code >}
     *     
     */
    public JAXBElement<EscrwNxtAnlysDtType> getEscrwNxtAnlysDt() {
        return escrwNxtAnlysDt;
    }

    /**
     * Sets the value of the escrwNxtAnlysDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwNxtAnlysDtType }{@code >}
     *     
     */
    public void setEscrwNxtAnlysDt(JAXBElement<EscrwNxtAnlysDtType> value) {
        this.escrwNxtAnlysDt = value;
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
     * Gets the value of the escrwCushMos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EscrwCushMosType }{@code >}
     *     
     */
    public JAXBElement<EscrwCushMosType> getEscrwCushMos() {
        return escrwCushMos;
    }

    /**
     * Sets the value of the escrwCushMos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EscrwCushMosType }{@code >}
     *     
     */
    public void setEscrwCushMos(JAXBElement<EscrwCushMosType> value) {
        this.escrwCushMos = value;
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
