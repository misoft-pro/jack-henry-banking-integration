
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
 * <p>Java class for SvcPrvdErrInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SvcPrvdErrInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcPrvdErrCode" type="{http://jackhenry.com/jxchange/TPG/2008}ErrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcPrvdRegEx" type="{http://jackhenry.com/jxchange/TPG/2008}SvcPrvdRegEx_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcPrvdErrCat" type="{http://jackhenry.com/jxchange/TPG/2008}ErrCat_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcPrvdErrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ErrDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "SvcPrvdErrInfo_CType", propOrder = {
    "svcPrvdErrCode",
    "svcPrvdRegEx",
    "svcPrvdErrCat",
    "svcPrvdErrDesc",
    "ver1",
    "any"
})
public class SvcPrvdErrInfoCType {

    @XmlElement(name = "SvcPrvdErrCode")
    protected ErrCodeType svcPrvdErrCode;
    @XmlElement(name = "SvcPrvdRegEx")
    protected SvcPrvdRegExType svcPrvdRegEx;
    @XmlElement(name = "SvcPrvdErrCat")
    protected ErrCatType svcPrvdErrCat;
    @XmlElement(name = "SvcPrvdErrDesc")
    protected ErrDescType svcPrvdErrDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the svcPrvdErrCode property.
     * 
     * @return
     *     possible object is
     *     {@link ErrCodeType }
     *     
     */
    public ErrCodeType getSvcPrvdErrCode() {
        return svcPrvdErrCode;
    }

    /**
     * Sets the value of the svcPrvdErrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrCodeType }
     *     
     */
    public void setSvcPrvdErrCode(ErrCodeType value) {
        this.svcPrvdErrCode = value;
    }

    /**
     * Gets the value of the svcPrvdRegEx property.
     * 
     * @return
     *     possible object is
     *     {@link SvcPrvdRegExType }
     *     
     */
    public SvcPrvdRegExType getSvcPrvdRegEx() {
        return svcPrvdRegEx;
    }

    /**
     * Sets the value of the svcPrvdRegEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcPrvdRegExType }
     *     
     */
    public void setSvcPrvdRegEx(SvcPrvdRegExType value) {
        this.svcPrvdRegEx = value;
    }

    /**
     * Gets the value of the svcPrvdErrCat property.
     * 
     * @return
     *     possible object is
     *     {@link ErrCatType }
     *     
     */
    public ErrCatType getSvcPrvdErrCat() {
        return svcPrvdErrCat;
    }

    /**
     * Sets the value of the svcPrvdErrCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrCatType }
     *     
     */
    public void setSvcPrvdErrCat(ErrCatType value) {
        this.svcPrvdErrCat = value;
    }

    /**
     * Gets the value of the svcPrvdErrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ErrDescType }
     *     
     */
    public ErrDescType getSvcPrvdErrDesc() {
        return svcPrvdErrDesc;
    }

    /**
     * Sets the value of the svcPrvdErrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrDescType }
     *     
     */
    public void setSvcPrvdErrDesc(ErrDescType value) {
        this.svcPrvdErrDesc = value;
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
