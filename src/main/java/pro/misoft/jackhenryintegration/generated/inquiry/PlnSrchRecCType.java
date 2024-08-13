
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
 * <p>Java class for PlnSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlnSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="PlnCode" type="{http://jackhenry.com/jxchange/TPG/2008}PlnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PlnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomPlnSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "PlnSrchRec_CType", propOrder = {
    "custId",
    "personName",
    "plnCode",
    "plnDesc",
    "customPlnSrchRec",
    "ver1",
    "any"
})
public class PlnSrchRecCType {

    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "PlnCode")
    protected PlnCodeType plnCode;
    @XmlElement(name = "PlnDesc")
    protected PlnDescType plnDesc;
    @XmlElement(name = "CustomPlnSrchRec")
    protected CustomCType customPlnSrchRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCustId(CustIdType value) {
        this.custId = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setPersonName(PersonNameCType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the plnCode property.
     * 
     * @return
     *     possible object is
     *     {@link PlnCodeType }
     *     
     */
    public PlnCodeType getPlnCode() {
        return plnCode;
    }

    /**
     * Sets the value of the plnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnCodeType }
     *     
     */
    public void setPlnCode(PlnCodeType value) {
        this.plnCode = value;
    }

    /**
     * Gets the value of the plnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PlnDescType }
     *     
     */
    public PlnDescType getPlnDesc() {
        return plnDesc;
    }

    /**
     * Sets the value of the plnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnDescType }
     *     
     */
    public void setPlnDesc(PlnDescType value) {
        this.plnDesc = value;
    }

    /**
     * Gets the value of the customPlnSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomPlnSrchRec() {
        return customPlnSrchRec;
    }

    /**
     * Sets the value of the customPlnSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomPlnSrchRec(CustomCType value) {
        this.customPlnSrchRec = value;
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
