
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for UserDefInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDefInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserDefTxt" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefTxt_Type" minOccurs="0"/&gt;
 *         &lt;element name="UserDefCode" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="UserDefDesc" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="UserDefDt" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="UserDefInfo1" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfo_Type" minOccurs="0"/&gt;
 *         &lt;element name="UserDefInfo2" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfo_Type" minOccurs="0"/&gt;
 *         &lt;element name="UserDefInfo3" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfo_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OvrrdInstRtId" type="{http://jackhenry.com/jxchange/TPG/2008}OvrrdInstRtId_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDefInfo_CType", propOrder = {
    "userDefTxt",
    "userDefCode",
    "userDefDesc",
    "userDefDt",
    "userDefInfo1",
    "userDefInfo2",
    "userDefInfo3",
    "ver1",
    "any"
})
public class UserDefInfoCType {

    @XmlElementRef(name = "UserDefTxt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UserDefTxtType> userDefTxt;
    @XmlElementRef(name = "UserDefCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UserDefCodeType> userDefCode;
    @XmlElementRef(name = "UserDefDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UserDefDescType> userDefDesc;
    @XmlElementRef(name = "UserDefDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UserDefDtType> userDefDt;
    @XmlElementRef(name = "UserDefInfo1", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UserDefInfoType> userDefInfo1;
    @XmlElementRef(name = "UserDefInfo2", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UserDefInfoType> userDefInfo2;
    @XmlElementRef(name = "UserDefInfo3", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UserDefInfoType> userDefInfo3;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "OvrrdInstRtId")
    protected String ovrrdInstRtId;

    /**
     * Gets the value of the userDefTxt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserDefTxtType }{@code >}
     *     
     */
    public JAXBElement<UserDefTxtType> getUserDefTxt() {
        return userDefTxt;
    }

    /**
     * Sets the value of the userDefTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserDefTxtType }{@code >}
     *     
     */
    public void setUserDefTxt(JAXBElement<UserDefTxtType> value) {
        this.userDefTxt = value;
    }

    /**
     * Gets the value of the userDefCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserDefCodeType }{@code >}
     *     
     */
    public JAXBElement<UserDefCodeType> getUserDefCode() {
        return userDefCode;
    }

    /**
     * Sets the value of the userDefCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserDefCodeType }{@code >}
     *     
     */
    public void setUserDefCode(JAXBElement<UserDefCodeType> value) {
        this.userDefCode = value;
    }

    /**
     * Gets the value of the userDefDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserDefDescType }{@code >}
     *     
     */
    public JAXBElement<UserDefDescType> getUserDefDesc() {
        return userDefDesc;
    }

    /**
     * Sets the value of the userDefDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserDefDescType }{@code >}
     *     
     */
    public void setUserDefDesc(JAXBElement<UserDefDescType> value) {
        this.userDefDesc = value;
    }

    /**
     * Gets the value of the userDefDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserDefDtType }{@code >}
     *     
     */
    public JAXBElement<UserDefDtType> getUserDefDt() {
        return userDefDt;
    }

    /**
     * Sets the value of the userDefDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserDefDtType }{@code >}
     *     
     */
    public void setUserDefDt(JAXBElement<UserDefDtType> value) {
        this.userDefDt = value;
    }

    /**
     * Gets the value of the userDefInfo1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserDefInfoType }{@code >}
     *     
     */
    public JAXBElement<UserDefInfoType> getUserDefInfo1() {
        return userDefInfo1;
    }

    /**
     * Sets the value of the userDefInfo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserDefInfoType }{@code >}
     *     
     */
    public void setUserDefInfo1(JAXBElement<UserDefInfoType> value) {
        this.userDefInfo1 = value;
    }

    /**
     * Gets the value of the userDefInfo2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserDefInfoType }{@code >}
     *     
     */
    public JAXBElement<UserDefInfoType> getUserDefInfo2() {
        return userDefInfo2;
    }

    /**
     * Sets the value of the userDefInfo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserDefInfoType }{@code >}
     *     
     */
    public void setUserDefInfo2(JAXBElement<UserDefInfoType> value) {
        this.userDefInfo2 = value;
    }

    /**
     * Gets the value of the userDefInfo3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserDefInfoType }{@code >}
     *     
     */
    public JAXBElement<UserDefInfoType> getUserDefInfo3() {
        return userDefInfo3;
    }

    /**
     * Sets the value of the userDefInfo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserDefInfoType }{@code >}
     *     
     */
    public void setUserDefInfo3(JAXBElement<UserDefInfoType> value) {
        this.userDefInfo3 = value;
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

    /**
     * Gets the value of the ovrrdInstRtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOvrrdInstRtId() {
        return ovrrdInstRtId;
    }

    /**
     * Sets the value of the ovrrdInstRtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOvrrdInstRtId(String value) {
        this.ovrrdInstRtId = value;
    }

}
