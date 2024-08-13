
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
 * <p>Java class for ProdBaseInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdBaseInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SerChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ZeroBalAllwDays" type="{http://jackhenry.com/jxchange/TPG/2008}ZeroBalAllwDays_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnHistRtnDays" type="{http://jackhenry.com/jxchange/TPG/2008}TrnHistRtnDays_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnHistRtnDaysType" type="{http://jackhenry.com/jxchange/TPG/2008}TrnHistRtnDaysType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PaperStmtFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PaperStmtFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PaperStmtAnlysId" type="{http://jackhenry.com/jxchange/TPG/2008}PaperStmtAnlysId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ProdBaseInfoRec_CType", propOrder = {
    "serChgAmt",
    "zeroBalAllwDays",
    "trnHistRtnDays",
    "trnHistRtnDaysType",
    "paperStmtFeeAmt",
    "paperStmtAnlysId",
    "ver1",
    "any"
})
public class ProdBaseInfoRecCType {

    @XmlElementRef(name = "SerChgAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SerChgAmtType> serChgAmt;
    @XmlElementRef(name = "ZeroBalAllwDays", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ZeroBalAllwDaysType> zeroBalAllwDays;
    @XmlElementRef(name = "TrnHistRtnDays", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnHistRtnDaysType> trnHistRtnDays;
    @XmlElementRef(name = "TrnHistRtnDaysType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnHistRtnDaysTypeType> trnHistRtnDaysType;
    @XmlElement(name = "PaperStmtFeeAmt")
    protected PaperStmtFeeAmtType paperStmtFeeAmt;
    @XmlElement(name = "PaperStmtAnlysId")
    protected PaperStmtAnlysIdType paperStmtAnlysId;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the serChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SerChgAmtType }{@code >}
     *     
     */
    public JAXBElement<SerChgAmtType> getSerChgAmt() {
        return serChgAmt;
    }

    /**
     * Sets the value of the serChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SerChgAmtType }{@code >}
     *     
     */
    public void setSerChgAmt(JAXBElement<SerChgAmtType> value) {
        this.serChgAmt = value;
    }

    /**
     * Gets the value of the zeroBalAllwDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ZeroBalAllwDaysType }{@code >}
     *     
     */
    public JAXBElement<ZeroBalAllwDaysType> getZeroBalAllwDays() {
        return zeroBalAllwDays;
    }

    /**
     * Sets the value of the zeroBalAllwDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ZeroBalAllwDaysType }{@code >}
     *     
     */
    public void setZeroBalAllwDays(JAXBElement<ZeroBalAllwDaysType> value) {
        this.zeroBalAllwDays = value;
    }

    /**
     * Gets the value of the trnHistRtnDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnHistRtnDaysType }{@code >}
     *     
     */
    public JAXBElement<TrnHistRtnDaysType> getTrnHistRtnDays() {
        return trnHistRtnDays;
    }

    /**
     * Sets the value of the trnHistRtnDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnHistRtnDaysType }{@code >}
     *     
     */
    public void setTrnHistRtnDays(JAXBElement<TrnHistRtnDaysType> value) {
        this.trnHistRtnDays = value;
    }

    /**
     * Gets the value of the trnHistRtnDaysType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnHistRtnDaysTypeType }{@code >}
     *     
     */
    public JAXBElement<TrnHistRtnDaysTypeType> getTrnHistRtnDaysType() {
        return trnHistRtnDaysType;
    }

    /**
     * Sets the value of the trnHistRtnDaysType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnHistRtnDaysTypeType }{@code >}
     *     
     */
    public void setTrnHistRtnDaysType(JAXBElement<TrnHistRtnDaysTypeType> value) {
        this.trnHistRtnDaysType = value;
    }

    /**
     * Gets the value of the paperStmtFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PaperStmtFeeAmtType }
     *     
     */
    public PaperStmtFeeAmtType getPaperStmtFeeAmt() {
        return paperStmtFeeAmt;
    }

    /**
     * Sets the value of the paperStmtFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperStmtFeeAmtType }
     *     
     */
    public void setPaperStmtFeeAmt(PaperStmtFeeAmtType value) {
        this.paperStmtFeeAmt = value;
    }

    /**
     * Gets the value of the paperStmtAnlysId property.
     * 
     * @return
     *     possible object is
     *     {@link PaperStmtAnlysIdType }
     *     
     */
    public PaperStmtAnlysIdType getPaperStmtAnlysId() {
        return paperStmtAnlysId;
    }

    /**
     * Sets the value of the paperStmtAnlysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperStmtAnlysIdType }
     *     
     */
    public void setPaperStmtAnlysId(PaperStmtAnlysIdType value) {
        this.paperStmtAnlysId = value;
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
