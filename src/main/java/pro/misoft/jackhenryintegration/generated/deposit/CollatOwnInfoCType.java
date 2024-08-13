
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
 * <p>Java class for CollatOwnInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollatOwnInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CollatOwnCustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatOwnCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatOwnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatTitleCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatTitleCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatPctOwned" type="{http://jackhenry.com/jxchange/TPG/2008}PctOwned_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatOwnName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="CollatOwnAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "CollatOwnInfo_CType", propOrder = {
    "collatOwnCustId",
    "collatOwnCode",
    "collatTitleCode",
    "collatPctOwned",
    "collatOwnName",
    "collatOwnAddr",
    "custom",
    "ver1",
    "any"
})
public class CollatOwnInfoCType {

    @XmlElement(name = "CollatOwnCustId")
    protected CustIdType collatOwnCustId;
    @XmlElement(name = "CollatOwnCode")
    protected CollatOwnCodeType collatOwnCode;
    @XmlElement(name = "CollatTitleCode")
    protected CollatTitleCodeType collatTitleCode;
    @XmlElement(name = "CollatPctOwned")
    protected PctOwnedType collatPctOwned;
    @XmlElement(name = "CollatOwnName")
    protected PersonNameCType collatOwnName;
    @XmlElement(name = "CollatOwnAddr")
    protected AddrCType collatOwnAddr;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the collatOwnCustId property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCollatOwnCustId() {
        return collatOwnCustId;
    }

    /**
     * Sets the value of the collatOwnCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCollatOwnCustId(CustIdType value) {
        this.collatOwnCustId = value;
    }

    /**
     * Gets the value of the collatOwnCode property.
     * 
     * @return
     *     possible object is
     *     {@link CollatOwnCodeType }
     *     
     */
    public CollatOwnCodeType getCollatOwnCode() {
        return collatOwnCode;
    }

    /**
     * Sets the value of the collatOwnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatOwnCodeType }
     *     
     */
    public void setCollatOwnCode(CollatOwnCodeType value) {
        this.collatOwnCode = value;
    }

    /**
     * Gets the value of the collatTitleCode property.
     * 
     * @return
     *     possible object is
     *     {@link CollatTitleCodeType }
     *     
     */
    public CollatTitleCodeType getCollatTitleCode() {
        return collatTitleCode;
    }

    /**
     * Sets the value of the collatTitleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatTitleCodeType }
     *     
     */
    public void setCollatTitleCode(CollatTitleCodeType value) {
        this.collatTitleCode = value;
    }

    /**
     * Gets the value of the collatPctOwned property.
     * 
     * @return
     *     possible object is
     *     {@link PctOwnedType }
     *     
     */
    public PctOwnedType getCollatPctOwned() {
        return collatPctOwned;
    }

    /**
     * Sets the value of the collatPctOwned property.
     * 
     * @param value
     *     allowed object is
     *     {@link PctOwnedType }
     *     
     */
    public void setCollatPctOwned(PctOwnedType value) {
        this.collatPctOwned = value;
    }

    /**
     * Gets the value of the collatOwnName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getCollatOwnName() {
        return collatOwnName;
    }

    /**
     * Sets the value of the collatOwnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setCollatOwnName(PersonNameCType value) {
        this.collatOwnName = value;
    }

    /**
     * Gets the value of the collatOwnAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getCollatOwnAddr() {
        return collatOwnAddr;
    }

    /**
     * Sets the value of the collatOwnAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setCollatOwnAddr(AddrCType value) {
        this.collatOwnAddr = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustom(CustomCType value) {
        this.custom = value;
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
