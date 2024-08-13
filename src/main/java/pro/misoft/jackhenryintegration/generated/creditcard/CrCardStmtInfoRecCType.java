
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CrCardStmtInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardStmtInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrCardStmtType" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardStmtType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmailArray" type="{http://jackhenry.com/jxchange/TPG/2008}EmailArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CrCardStmtStatType" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardStmtStatType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CrCardStmtInfoRec_CType", propOrder = {
    "crCardStmtType",
    "emailArray",
    "crCardStmtStatType",
    "custom",
    "ver1",
    "any"
})
public class CrCardStmtInfoRecCType {

    @XmlElement(name = "CrCardStmtType")
    protected CrCardStmtTypeType crCardStmtType;
    @XmlElement(name = "EmailArray")
    protected EmailArrayAType emailArray;
    @XmlElement(name = "CrCardStmtStatType")
    protected CrCardStmtStatTypeType crCardStmtStatType;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the crCardStmtType property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardStmtTypeType }
     *     
     */
    public CrCardStmtTypeType getCrCardStmtType() {
        return crCardStmtType;
    }

    /**
     * Sets the value of the crCardStmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardStmtTypeType }
     *     
     */
    public void setCrCardStmtType(CrCardStmtTypeType value) {
        this.crCardStmtType = value;
    }

    /**
     * Gets the value of the emailArray property.
     * 
     * @return
     *     possible object is
     *     {@link EmailArrayAType }
     *     
     */
    public EmailArrayAType getEmailArray() {
        return emailArray;
    }

    /**
     * Sets the value of the emailArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailArrayAType }
     *     
     */
    public void setEmailArray(EmailArrayAType value) {
        this.emailArray = value;
    }

    /**
     * Gets the value of the crCardStmtStatType property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardStmtStatTypeType }
     *     
     */
    public CrCardStmtStatTypeType getCrCardStmtStatType() {
        return crCardStmtStatType;
    }

    /**
     * Sets the value of the crCardStmtStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardStmtStatTypeType }
     *     
     */
    public void setCrCardStmtStatType(CrCardStmtStatTypeType value) {
        this.crCardStmtStatType = value;
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
     * {@link Element }
     * {@link Object }
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
