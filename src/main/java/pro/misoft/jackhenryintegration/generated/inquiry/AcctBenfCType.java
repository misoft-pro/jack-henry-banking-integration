
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
 * <p>Java class for AcctBenf_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctBenf_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BenfName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="BenfDesigId" type="{http://jackhenry.com/jxchange/TPG/2008}BenfDesigId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfPctDist" type="{http://jackhenry.com/jxchange/TPG/2008}BenfPctDist_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfRel" type="{http://jackhenry.com/jxchange/TPG/2008}BenfRel_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfId" type="{http://jackhenry.com/jxchange/TPG/2008}BenfId_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="BenfAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
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
@XmlType(name = "AcctBenf_CType", propOrder = {
    "benfName",
    "benfDesigId",
    "benfPctDist",
    "benfRel",
    "benfId",
    "ver1",
    "benfAddr",
    "ver2",
    "any"
})
public class AcctBenfCType {

    @XmlElement(name = "BenfName")
    protected PersonNameCType benfName;
    @XmlElementRef(name = "BenfDesigId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfDesigIdType> benfDesigId;
    @XmlElementRef(name = "BenfPctDist", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfPctDistType> benfPctDist;
    @XmlElementRef(name = "BenfRel", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfRelType> benfRel;
    @XmlElementRef(name = "BenfId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BenfIdType> benfId;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "BenfAddr")
    protected AddrCType benfAddr;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the benfName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getBenfName() {
        return benfName;
    }

    /**
     * Sets the value of the benfName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setBenfName(PersonNameCType value) {
        this.benfName = value;
    }

    /**
     * Gets the value of the benfDesigId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfDesigIdType }{@code >}
     *     
     */
    public JAXBElement<BenfDesigIdType> getBenfDesigId() {
        return benfDesigId;
    }

    /**
     * Sets the value of the benfDesigId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfDesigIdType }{@code >}
     *     
     */
    public void setBenfDesigId(JAXBElement<BenfDesigIdType> value) {
        this.benfDesigId = value;
    }

    /**
     * Gets the value of the benfPctDist property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfPctDistType }{@code >}
     *     
     */
    public JAXBElement<BenfPctDistType> getBenfPctDist() {
        return benfPctDist;
    }

    /**
     * Sets the value of the benfPctDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfPctDistType }{@code >}
     *     
     */
    public void setBenfPctDist(JAXBElement<BenfPctDistType> value) {
        this.benfPctDist = value;
    }

    /**
     * Gets the value of the benfRel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfRelType }{@code >}
     *     
     */
    public JAXBElement<BenfRelType> getBenfRel() {
        return benfRel;
    }

    /**
     * Sets the value of the benfRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfRelType }{@code >}
     *     
     */
    public void setBenfRel(JAXBElement<BenfRelType> value) {
        this.benfRel = value;
    }

    /**
     * Gets the value of the benfId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BenfIdType }{@code >}
     *     
     */
    public JAXBElement<BenfIdType> getBenfId() {
        return benfId;
    }

    /**
     * Sets the value of the benfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BenfIdType }{@code >}
     *     
     */
    public void setBenfId(JAXBElement<BenfIdType> value) {
        this.benfId = value;
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
     * Gets the value of the benfAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getBenfAddr() {
        return benfAddr;
    }

    /**
     * Sets the value of the benfAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setBenfAddr(AddrCType value) {
        this.benfAddr = value;
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
