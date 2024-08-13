
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
 * <p>Java class for ResolvingPartyInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResolvingPartyInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResolvingPartyName" type="{http://jackhenry.com/jxchange/TPG/2008}ComName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ResolvingPartyTitle" type="{http://jackhenry.com/jxchange/TPG/2008}EmplTitle_Type" minOccurs="0"/&gt;
 *         &lt;element name="GenLmt" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *         &lt;element name="CommAuthArray" type="{http://jackhenry.com/jxchange/TPG/2008}CommAuthArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "ResolvingPartyInfo_CType", propOrder = {
    "resolvingPartyName",
    "resolvingPartyTitle",
    "genLmt",
    "commAuthArray",
    "ver1",
    "any"
})
public class ResolvingPartyInfoCType {

    @XmlElement(name = "ResolvingPartyName")
    protected ComNameType resolvingPartyName;
    @XmlElement(name = "ResolvingPartyTitle")
    protected EmplTitleType resolvingPartyTitle;
    @XmlElement(name = "GenLmt")
    protected RmkType genLmt;
    @XmlElement(name = "CommAuthArray")
    protected CommAuthArrayAType commAuthArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the resolvingPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link ComNameType }
     *     
     */
    public ComNameType getResolvingPartyName() {
        return resolvingPartyName;
    }

    /**
     * Sets the value of the resolvingPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComNameType }
     *     
     */
    public void setResolvingPartyName(ComNameType value) {
        this.resolvingPartyName = value;
    }

    /**
     * Gets the value of the resolvingPartyTitle property.
     * 
     * @return
     *     possible object is
     *     {@link EmplTitleType }
     *     
     */
    public EmplTitleType getResolvingPartyTitle() {
        return resolvingPartyTitle;
    }

    /**
     * Sets the value of the resolvingPartyTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplTitleType }
     *     
     */
    public void setResolvingPartyTitle(EmplTitleType value) {
        this.resolvingPartyTitle = value;
    }

    /**
     * Gets the value of the genLmt property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getGenLmt() {
        return genLmt;
    }

    /**
     * Sets the value of the genLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setGenLmt(RmkType value) {
        this.genLmt = value;
    }

    /**
     * Gets the value of the commAuthArray property.
     * 
     * @return
     *     possible object is
     *     {@link CommAuthArrayAType }
     *     
     */
    public CommAuthArrayAType getCommAuthArray() {
        return commAuthArray;
    }

    /**
     * Sets the value of the commAuthArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommAuthArrayAType }
     *     
     */
    public void setCommAuthArray(CommAuthArrayAType value) {
        this.commAuthArray = value;
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
