
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
 * <p>Java class for ACHIntlInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHIntlInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHIntlType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHIntlType_Type" minOccurs="0"/&gt;
 *         &lt;element name="FornExchType" type="{http://jackhenry.com/jxchange/TPG/2008}FornExchType_Type" minOccurs="0"/&gt;
 *         &lt;element name="FornExchRefType" type="{http://jackhenry.com/jxchange/TPG/2008}FornExchRefType_Type" minOccurs="0"/&gt;
 *         &lt;element name="FornExchRef" type="{http://jackhenry.com/jxchange/TPG/2008}FornExchRef_Type" minOccurs="0"/&gt;
 *         &lt;element name="ISODestCntry" type="{http://jackhenry.com/jxchange/TPG/2008}ISODestCntry_Type" minOccurs="0"/&gt;
 *         &lt;element name="ISOOrigCur" type="{http://jackhenry.com/jxchange/TPG/2008}ISOOrigCurr_Type" minOccurs="0"/&gt;
 *         &lt;element name="ISODestCur" type="{http://jackhenry.com/jxchange/TPG/2008}ISODestCurr_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ACHStdEntryClass" type="{http://jackhenry.com/jxchange/TPG/2008}ACHStdEntryClass_Type" minOccurs="0"/&gt;
 *           &lt;element name="FornPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}FornPmtAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="ACHRecvId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHRecvId_Type" minOccurs="0"/&gt;
 *           &lt;element name="ACHIntlAddendaArray" type="{http://jackhenry.com/jxchange/TPG/2008}ACHIntlAddendaArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "ACHIntlInfoRec_CType", propOrder = {
    "achIntlType",
    "fornExchType",
    "fornExchRefType",
    "fornExchRef",
    "isoDestCntry",
    "isoOrigCur",
    "isoDestCur",
    "ver1",
    "achStdEntryClass",
    "fornPmtAmt",
    "achRecvId",
    "achIntlAddendaArray",
    "ver2",
    "any"
})
public class ACHIntlInfoRecCType {

    @XmlElementRef(name = "ACHIntlType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHIntlTypeType> achIntlType;
    @XmlElementRef(name = "FornExchType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FornExchTypeType> fornExchType;
    @XmlElementRef(name = "FornExchRefType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FornExchRefTypeType> fornExchRefType;
    @XmlElementRef(name = "FornExchRef", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FornExchRefType> fornExchRef;
    @XmlElementRef(name = "ISODestCntry", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ISODestCntryType> isoDestCntry;
    @XmlElementRef(name = "ISOOrigCur", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ISOOrigCurrType> isoOrigCur;
    @XmlElementRef(name = "ISODestCur", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ISODestCurrType> isoDestCur;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "ACHStdEntryClass", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHStdEntryClassType> achStdEntryClass;
    @XmlElementRef(name = "FornPmtAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FornPmtAmtType> fornPmtAmt;
    @XmlElementRef(name = "ACHRecvId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHRecvIdType> achRecvId;
    @XmlElement(name = "ACHIntlAddendaArray")
    protected ACHIntlAddendaArrayAType achIntlAddendaArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the achIntlType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHIntlTypeType }{@code >}
     *     
     */
    public JAXBElement<ACHIntlTypeType> getACHIntlType() {
        return achIntlType;
    }

    /**
     * Sets the value of the achIntlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHIntlTypeType }{@code >}
     *     
     */
    public void setACHIntlType(JAXBElement<ACHIntlTypeType> value) {
        this.achIntlType = value;
    }

    /**
     * Gets the value of the fornExchType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FornExchTypeType }{@code >}
     *     
     */
    public JAXBElement<FornExchTypeType> getFornExchType() {
        return fornExchType;
    }

    /**
     * Sets the value of the fornExchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FornExchTypeType }{@code >}
     *     
     */
    public void setFornExchType(JAXBElement<FornExchTypeType> value) {
        this.fornExchType = value;
    }

    /**
     * Gets the value of the fornExchRefType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FornExchRefTypeType }{@code >}
     *     
     */
    public JAXBElement<FornExchRefTypeType> getFornExchRefType() {
        return fornExchRefType;
    }

    /**
     * Sets the value of the fornExchRefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FornExchRefTypeType }{@code >}
     *     
     */
    public void setFornExchRefType(JAXBElement<FornExchRefTypeType> value) {
        this.fornExchRefType = value;
    }

    /**
     * Gets the value of the fornExchRef property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FornExchRefType }{@code >}
     *     
     */
    public JAXBElement<FornExchRefType> getFornExchRef() {
        return fornExchRef;
    }

    /**
     * Sets the value of the fornExchRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FornExchRefType }{@code >}
     *     
     */
    public void setFornExchRef(JAXBElement<FornExchRefType> value) {
        this.fornExchRef = value;
    }

    /**
     * Gets the value of the isoDestCntry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ISODestCntryType }{@code >}
     *     
     */
    public JAXBElement<ISODestCntryType> getISODestCntry() {
        return isoDestCntry;
    }

    /**
     * Sets the value of the isoDestCntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ISODestCntryType }{@code >}
     *     
     */
    public void setISODestCntry(JAXBElement<ISODestCntryType> value) {
        this.isoDestCntry = value;
    }

    /**
     * Gets the value of the isoOrigCur property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ISOOrigCurrType }{@code >}
     *     
     */
    public JAXBElement<ISOOrigCurrType> getISOOrigCur() {
        return isoOrigCur;
    }

    /**
     * Sets the value of the isoOrigCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ISOOrigCurrType }{@code >}
     *     
     */
    public void setISOOrigCur(JAXBElement<ISOOrigCurrType> value) {
        this.isoOrigCur = value;
    }

    /**
     * Gets the value of the isoDestCur property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ISODestCurrType }{@code >}
     *     
     */
    public JAXBElement<ISODestCurrType> getISODestCur() {
        return isoDestCur;
    }

    /**
     * Sets the value of the isoDestCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ISODestCurrType }{@code >}
     *     
     */
    public void setISODestCur(JAXBElement<ISODestCurrType> value) {
        this.isoDestCur = value;
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
     * Gets the value of the achStdEntryClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHStdEntryClassType }{@code >}
     *     
     */
    public JAXBElement<ACHStdEntryClassType> getACHStdEntryClass() {
        return achStdEntryClass;
    }

    /**
     * Sets the value of the achStdEntryClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHStdEntryClassType }{@code >}
     *     
     */
    public void setACHStdEntryClass(JAXBElement<ACHStdEntryClassType> value) {
        this.achStdEntryClass = value;
    }

    /**
     * Gets the value of the fornPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FornPmtAmtType }{@code >}
     *     
     */
    public JAXBElement<FornPmtAmtType> getFornPmtAmt() {
        return fornPmtAmt;
    }

    /**
     * Sets the value of the fornPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FornPmtAmtType }{@code >}
     *     
     */
    public void setFornPmtAmt(JAXBElement<FornPmtAmtType> value) {
        this.fornPmtAmt = value;
    }

    /**
     * Gets the value of the achRecvId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHRecvIdType }{@code >}
     *     
     */
    public JAXBElement<ACHRecvIdType> getACHRecvId() {
        return achRecvId;
    }

    /**
     * Sets the value of the achRecvId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHRecvIdType }{@code >}
     *     
     */
    public void setACHRecvId(JAXBElement<ACHRecvIdType> value) {
        this.achRecvId = value;
    }

    /**
     * Gets the value of the achIntlAddendaArray property.
     * 
     * @return
     *     possible object is
     *     {@link ACHIntlAddendaArrayAType }
     *     
     */
    public ACHIntlAddendaArrayAType getACHIntlAddendaArray() {
        return achIntlAddendaArray;
    }

    /**
     * Sets the value of the achIntlAddendaArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHIntlAddendaArrayAType }
     *     
     */
    public void setACHIntlAddendaArray(ACHIntlAddendaArrayAType value) {
        this.achIntlAddendaArray = value;
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
