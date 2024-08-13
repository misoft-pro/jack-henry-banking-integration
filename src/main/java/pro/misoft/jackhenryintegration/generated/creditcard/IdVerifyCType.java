
package pro.misoft.jackhenryintegration.generated.creditcard;

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
 * <p>Java class for IdVerify_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdVerify_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdVerifyDesc" type="{http://jackhenry.com/jxchange/TPG/2008}IdVerifyDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdVerifyCode" type="{http://jackhenry.com/jxchange/TPG/2008}IdVerifyCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdVerifyVal" type="{http://jackhenry.com/jxchange/TPG/2008}IdVerifyVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdVerifyBy" type="{http://jackhenry.com/jxchange/TPG/2008}IdVerifyBy_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdIssueBy" type="{http://jackhenry.com/jxchange/TPG/2008}IdIssueBy_Type" minOccurs="0"/&gt;
 *         &lt;element name="IdVerifyQueryArray" type="{http://jackhenry.com/jxchange/TPG/2008}IdVerifyQueryArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "IdVerify_CType", propOrder = {
    "idVerifyDesc",
    "idVerifyCode",
    "idVerifyVal",
    "idVerifyBy",
    "idIssueBy",
    "idVerifyQueryArray",
    "ver1",
    "any"
})
public class IdVerifyCType {

    @XmlElementRef(name = "IdVerifyDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IdVerifyDescType> idVerifyDesc;
    @XmlElementRef(name = "IdVerifyCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IdVerifyCodeType> idVerifyCode;
    @XmlElementRef(name = "IdVerifyVal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IdVerifyValType> idVerifyVal;
    @XmlElementRef(name = "IdVerifyBy", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IdVerifyByType> idVerifyBy;
    @XmlElementRef(name = "IdIssueBy", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IdIssueByType> idIssueBy;
    @XmlElement(name = "IdVerifyQueryArray")
    protected IdVerifyQueryArrayAType idVerifyQueryArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the idVerifyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdVerifyDescType }{@code >}
     *     
     */
    public JAXBElement<IdVerifyDescType> getIdVerifyDesc() {
        return idVerifyDesc;
    }

    /**
     * Sets the value of the idVerifyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdVerifyDescType }{@code >}
     *     
     */
    public void setIdVerifyDesc(JAXBElement<IdVerifyDescType> value) {
        this.idVerifyDesc = value;
    }

    /**
     * Gets the value of the idVerifyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdVerifyCodeType }{@code >}
     *     
     */
    public JAXBElement<IdVerifyCodeType> getIdVerifyCode() {
        return idVerifyCode;
    }

    /**
     * Sets the value of the idVerifyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdVerifyCodeType }{@code >}
     *     
     */
    public void setIdVerifyCode(JAXBElement<IdVerifyCodeType> value) {
        this.idVerifyCode = value;
    }

    /**
     * Gets the value of the idVerifyVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdVerifyValType }{@code >}
     *     
     */
    public JAXBElement<IdVerifyValType> getIdVerifyVal() {
        return idVerifyVal;
    }

    /**
     * Sets the value of the idVerifyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdVerifyValType }{@code >}
     *     
     */
    public void setIdVerifyVal(JAXBElement<IdVerifyValType> value) {
        this.idVerifyVal = value;
    }

    /**
     * Gets the value of the idVerifyBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdVerifyByType }{@code >}
     *     
     */
    public JAXBElement<IdVerifyByType> getIdVerifyBy() {
        return idVerifyBy;
    }

    /**
     * Sets the value of the idVerifyBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdVerifyByType }{@code >}
     *     
     */
    public void setIdVerifyBy(JAXBElement<IdVerifyByType> value) {
        this.idVerifyBy = value;
    }

    /**
     * Gets the value of the idIssueBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdIssueByType }{@code >}
     *     
     */
    public JAXBElement<IdIssueByType> getIdIssueBy() {
        return idIssueBy;
    }

    /**
     * Sets the value of the idIssueBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdIssueByType }{@code >}
     *     
     */
    public void setIdIssueBy(JAXBElement<IdIssueByType> value) {
        this.idIssueBy = value;
    }

    /**
     * Gets the value of the idVerifyQueryArray property.
     * 
     * @return
     *     possible object is
     *     {@link IdVerifyQueryArrayAType }
     *     
     */
    public IdVerifyQueryArrayAType getIdVerifyQueryArray() {
        return idVerifyQueryArray;
    }

    /**
     * Sets the value of the idVerifyQueryArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdVerifyQueryArrayAType }
     *     
     */
    public void setIdVerifyQueryArray(IdVerifyQueryArrayAType value) {
        this.idVerifyQueryArray = value;
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
