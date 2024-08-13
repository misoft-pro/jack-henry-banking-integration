
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
 * <p>Java class for BnkRptcyInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BnkRptcyInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BnkRptcyFileCode" type="{http://jackhenry.com/jxchange/TPG/2008}BnkRptcyFileCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BnkRptcyFileDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BnkRptcyFileDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BnkRptcyChapCode" type="{http://jackhenry.com/jxchange/TPG/2008}BnkRptcyChapCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BnkRptcyChapDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BnkRptcyChapDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BnkRptcyDt" type="{http://jackhenry.com/jxchange/TPG/2008}BnkRptcyDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BnkRptcyCaseId" type="{http://jackhenry.com/jxchange/TPG/2008}BnkRptcyCaseId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BnkRptcyDisChgDt" type="{http://jackhenry.com/jxchange/TPG/2008}BnkRptcyDisChgDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "BnkRptcyInfoRec_CType", propOrder = {
    "bnkRptcyFileCode",
    "bnkRptcyFileDesc",
    "bnkRptcyChapCode",
    "bnkRptcyChapDesc",
    "bnkRptcyDt",
    "bnkRptcyCaseId",
    "bnkRptcyDisChgDt",
    "ver1",
    "any"
})
public class BnkRptcyInfoRecCType {

    @XmlElementRef(name = "BnkRptcyFileCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BnkRptcyFileCodeType> bnkRptcyFileCode;
    @XmlElementRef(name = "BnkRptcyFileDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BnkRptcyFileDescType> bnkRptcyFileDesc;
    @XmlElementRef(name = "BnkRptcyChapCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BnkRptcyChapCodeType> bnkRptcyChapCode;
    @XmlElementRef(name = "BnkRptcyChapDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BnkRptcyChapDescType> bnkRptcyChapDesc;
    @XmlElementRef(name = "BnkRptcyDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BnkRptcyDtType> bnkRptcyDt;
    @XmlElementRef(name = "BnkRptcyCaseId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BnkRptcyCaseIdType> bnkRptcyCaseId;
    @XmlElementRef(name = "BnkRptcyDisChgDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BnkRptcyDisChgDtType> bnkRptcyDisChgDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the bnkRptcyFileCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BnkRptcyFileCodeType }{@code >}
     *     
     */
    public JAXBElement<BnkRptcyFileCodeType> getBnkRptcyFileCode() {
        return bnkRptcyFileCode;
    }

    /**
     * Sets the value of the bnkRptcyFileCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BnkRptcyFileCodeType }{@code >}
     *     
     */
    public void setBnkRptcyFileCode(JAXBElement<BnkRptcyFileCodeType> value) {
        this.bnkRptcyFileCode = value;
    }

    /**
     * Gets the value of the bnkRptcyFileDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BnkRptcyFileDescType }{@code >}
     *     
     */
    public JAXBElement<BnkRptcyFileDescType> getBnkRptcyFileDesc() {
        return bnkRptcyFileDesc;
    }

    /**
     * Sets the value of the bnkRptcyFileDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BnkRptcyFileDescType }{@code >}
     *     
     */
    public void setBnkRptcyFileDesc(JAXBElement<BnkRptcyFileDescType> value) {
        this.bnkRptcyFileDesc = value;
    }

    /**
     * Gets the value of the bnkRptcyChapCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BnkRptcyChapCodeType }{@code >}
     *     
     */
    public JAXBElement<BnkRptcyChapCodeType> getBnkRptcyChapCode() {
        return bnkRptcyChapCode;
    }

    /**
     * Sets the value of the bnkRptcyChapCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BnkRptcyChapCodeType }{@code >}
     *     
     */
    public void setBnkRptcyChapCode(JAXBElement<BnkRptcyChapCodeType> value) {
        this.bnkRptcyChapCode = value;
    }

    /**
     * Gets the value of the bnkRptcyChapDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BnkRptcyChapDescType }{@code >}
     *     
     */
    public JAXBElement<BnkRptcyChapDescType> getBnkRptcyChapDesc() {
        return bnkRptcyChapDesc;
    }

    /**
     * Sets the value of the bnkRptcyChapDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BnkRptcyChapDescType }{@code >}
     *     
     */
    public void setBnkRptcyChapDesc(JAXBElement<BnkRptcyChapDescType> value) {
        this.bnkRptcyChapDesc = value;
    }

    /**
     * Gets the value of the bnkRptcyDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BnkRptcyDtType }{@code >}
     *     
     */
    public JAXBElement<BnkRptcyDtType> getBnkRptcyDt() {
        return bnkRptcyDt;
    }

    /**
     * Sets the value of the bnkRptcyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BnkRptcyDtType }{@code >}
     *     
     */
    public void setBnkRptcyDt(JAXBElement<BnkRptcyDtType> value) {
        this.bnkRptcyDt = value;
    }

    /**
     * Gets the value of the bnkRptcyCaseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BnkRptcyCaseIdType }{@code >}
     *     
     */
    public JAXBElement<BnkRptcyCaseIdType> getBnkRptcyCaseId() {
        return bnkRptcyCaseId;
    }

    /**
     * Sets the value of the bnkRptcyCaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BnkRptcyCaseIdType }{@code >}
     *     
     */
    public void setBnkRptcyCaseId(JAXBElement<BnkRptcyCaseIdType> value) {
        this.bnkRptcyCaseId = value;
    }

    /**
     * Gets the value of the bnkRptcyDisChgDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BnkRptcyDisChgDtType }{@code >}
     *     
     */
    public JAXBElement<BnkRptcyDisChgDtType> getBnkRptcyDisChgDt() {
        return bnkRptcyDisChgDt;
    }

    /**
     * Sets the value of the bnkRptcyDisChgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BnkRptcyDisChgDtType }{@code >}
     *     
     */
    public void setBnkRptcyDisChgDt(JAXBElement<BnkRptcyDisChgDtType> value) {
        this.bnkRptcyDisChgDt = value;
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
