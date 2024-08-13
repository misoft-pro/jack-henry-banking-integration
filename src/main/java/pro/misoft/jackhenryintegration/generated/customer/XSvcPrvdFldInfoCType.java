
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for x_SvcPrvdFldInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_SvcPrvdFldInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcPrvdFldName" type="{http://jackhenry.com/jxchange/TPG/2008}SvcPrvdFldName_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcPrvdTblName" type="{http://jackhenry.com/jxchange/TPG/2008}SvcPrvdTblName_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcPrvdFldDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SvcPrvdFldDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcPrvdFldType" type="{http://jackhenry.com/jxchange/TPG/2008}SvcPrvdFldType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcPrvdFldLen" type="{http://jackhenry.com/jxchange/TPG/2008}SvcPrvdFldLen_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcPrvdFldDecPosit" type="{http://jackhenry.com/jxchange/TPG/2008}SvcPrvdFldDecPosit_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_SvcPrvdFldInfo_CType", propOrder = {
    "svcPrvdFldName",
    "svcPrvdTblName",
    "svcPrvdFldDesc",
    "svcPrvdFldType",
    "svcPrvdFldLen",
    "svcPrvdFldDecPosit",
    "ver1",
    "any"
})
public class XSvcPrvdFldInfoCType {

    @XmlElement(name = "SvcPrvdFldName")
    protected SvcPrvdFldNameType svcPrvdFldName;
    @XmlElement(name = "SvcPrvdTblName")
    protected SvcPrvdTblNameType svcPrvdTblName;
    @XmlElement(name = "SvcPrvdFldDesc")
    protected SvcPrvdFldDescType svcPrvdFldDesc;
    @XmlElement(name = "SvcPrvdFldType")
    protected SvcPrvdFldTypeType svcPrvdFldType;
    @XmlElement(name = "SvcPrvdFldLen")
    protected SvcPrvdFldLenType svcPrvdFldLen;
    @XmlElement(name = "SvcPrvdFldDecPosit")
    protected SvcPrvdFldDecPositType svcPrvdFldDecPosit;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the svcPrvdFldName property.
     * 
     * @return
     *     possible object is
     *     {@link SvcPrvdFldNameType }
     *     
     */
    public SvcPrvdFldNameType getSvcPrvdFldName() {
        return svcPrvdFldName;
    }

    /**
     * Sets the value of the svcPrvdFldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcPrvdFldNameType }
     *     
     */
    public void setSvcPrvdFldName(SvcPrvdFldNameType value) {
        this.svcPrvdFldName = value;
    }

    /**
     * Gets the value of the svcPrvdTblName property.
     * 
     * @return
     *     possible object is
     *     {@link SvcPrvdTblNameType }
     *     
     */
    public SvcPrvdTblNameType getSvcPrvdTblName() {
        return svcPrvdTblName;
    }

    /**
     * Sets the value of the svcPrvdTblName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcPrvdTblNameType }
     *     
     */
    public void setSvcPrvdTblName(SvcPrvdTblNameType value) {
        this.svcPrvdTblName = value;
    }

    /**
     * Gets the value of the svcPrvdFldDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SvcPrvdFldDescType }
     *     
     */
    public SvcPrvdFldDescType getSvcPrvdFldDesc() {
        return svcPrvdFldDesc;
    }

    /**
     * Sets the value of the svcPrvdFldDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcPrvdFldDescType }
     *     
     */
    public void setSvcPrvdFldDesc(SvcPrvdFldDescType value) {
        this.svcPrvdFldDesc = value;
    }

    /**
     * Gets the value of the svcPrvdFldType property.
     * 
     * @return
     *     possible object is
     *     {@link SvcPrvdFldTypeType }
     *     
     */
    public SvcPrvdFldTypeType getSvcPrvdFldType() {
        return svcPrvdFldType;
    }

    /**
     * Sets the value of the svcPrvdFldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcPrvdFldTypeType }
     *     
     */
    public void setSvcPrvdFldType(SvcPrvdFldTypeType value) {
        this.svcPrvdFldType = value;
    }

    /**
     * Gets the value of the svcPrvdFldLen property.
     * 
     * @return
     *     possible object is
     *     {@link SvcPrvdFldLenType }
     *     
     */
    public SvcPrvdFldLenType getSvcPrvdFldLen() {
        return svcPrvdFldLen;
    }

    /**
     * Sets the value of the svcPrvdFldLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcPrvdFldLenType }
     *     
     */
    public void setSvcPrvdFldLen(SvcPrvdFldLenType value) {
        this.svcPrvdFldLen = value;
    }

    /**
     * Gets the value of the svcPrvdFldDecPosit property.
     * 
     * @return
     *     possible object is
     *     {@link SvcPrvdFldDecPositType }
     *     
     */
    public SvcPrvdFldDecPositType getSvcPrvdFldDecPosit() {
        return svcPrvdFldDecPosit;
    }

    /**
     * Sets the value of the svcPrvdFldDecPosit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcPrvdFldDecPositType }
     *     
     */
    public void setSvcPrvdFldDecPosit(SvcPrvdFldDecPositType value) {
        this.svcPrvdFldDecPosit = value;
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
