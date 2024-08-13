
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
 * <p>Java class for CustBenfInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustBenfInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BenfDesigId" type="{http://jackhenry.com/jxchange/TPG/2008}BenfDesigId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfPctDist" type="{http://jackhenry.com/jxchange/TPG/2008}BenfPctDist_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfRel" type="{http://jackhenry.com/jxchange/TPG/2008}BenfRel_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfId" type="{http://jackhenry.com/jxchange/TPG/2008}BenfId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CustBenfInfo_CType", propOrder = {
    "benfDesigId",
    "benfPctDist",
    "benfRel",
    "benfId",
    "ver1",
    "any"
})
public class CustBenfInfoCType {

    @XmlElement(name = "BenfDesigId")
    protected BenfDesigIdType benfDesigId;
    @XmlElement(name = "BenfPctDist")
    protected BenfPctDistType benfPctDist;
    @XmlElement(name = "BenfRel")
    protected BenfRelType benfRel;
    @XmlElement(name = "BenfId")
    protected BenfIdType benfId;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the benfDesigId property.
     * 
     * @return
     *     possible object is
     *     {@link BenfDesigIdType }
     *     
     */
    public BenfDesigIdType getBenfDesigId() {
        return benfDesigId;
    }

    /**
     * Sets the value of the benfDesigId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenfDesigIdType }
     *     
     */
    public void setBenfDesigId(BenfDesigIdType value) {
        this.benfDesigId = value;
    }

    /**
     * Gets the value of the benfPctDist property.
     * 
     * @return
     *     possible object is
     *     {@link BenfPctDistType }
     *     
     */
    public BenfPctDistType getBenfPctDist() {
        return benfPctDist;
    }

    /**
     * Sets the value of the benfPctDist property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenfPctDistType }
     *     
     */
    public void setBenfPctDist(BenfPctDistType value) {
        this.benfPctDist = value;
    }

    /**
     * Gets the value of the benfRel property.
     * 
     * @return
     *     possible object is
     *     {@link BenfRelType }
     *     
     */
    public BenfRelType getBenfRel() {
        return benfRel;
    }

    /**
     * Sets the value of the benfRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenfRelType }
     *     
     */
    public void setBenfRel(BenfRelType value) {
        this.benfRel = value;
    }

    /**
     * Gets the value of the benfId property.
     * 
     * @return
     *     possible object is
     *     {@link BenfIdType }
     *     
     */
    public BenfIdType getBenfId() {
        return benfId;
    }

    /**
     * Sets the value of the benfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenfIdType }
     *     
     */
    public void setBenfId(BenfIdType value) {
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
