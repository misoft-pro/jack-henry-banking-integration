
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
 * <p>Java class for CommAuthRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommAuthRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommAuthType" type="{http://jackhenry.com/jxchange/TPG/2008}EntityAuthType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CommAuthCode" type="{http://jackhenry.com/jxchange/TPG/2008}EntityAuthCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SigNumCnt" type="{http://jackhenry.com/jxchange/TPG/2008}SigNumCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ResAuthType" type="{http://jackhenry.com/jxchange/TPG/2008}ResAuthType_Type" minOccurs="0"/&gt;
 *           &lt;element name="SpecificLmt" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CommAuthRec_CType", propOrder = {
    "commAuthType",
    "commAuthCode",
    "sigNumCnt",
    "custom",
    "ver1",
    "resAuthType",
    "specificLmt",
    "ver2",
    "any"
})
public class CommAuthRecCType {

    @XmlElement(name = "CommAuthType")
    protected EntityAuthTypeType commAuthType;
    @XmlElement(name = "CommAuthCode")
    protected EntityAuthCodeType commAuthCode;
    @XmlElement(name = "SigNumCnt")
    protected SigNumCntType sigNumCnt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ResAuthType")
    protected ResAuthTypeType resAuthType;
    @XmlElement(name = "SpecificLmt")
    protected RmkType specificLmt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the commAuthType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityAuthTypeType }
     *     
     */
    public EntityAuthTypeType getCommAuthType() {
        return commAuthType;
    }

    /**
     * Sets the value of the commAuthType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityAuthTypeType }
     *     
     */
    public void setCommAuthType(EntityAuthTypeType value) {
        this.commAuthType = value;
    }

    /**
     * Gets the value of the commAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityAuthCodeType }
     *     
     */
    public EntityAuthCodeType getCommAuthCode() {
        return commAuthCode;
    }

    /**
     * Sets the value of the commAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityAuthCodeType }
     *     
     */
    public void setCommAuthCode(EntityAuthCodeType value) {
        this.commAuthCode = value;
    }

    /**
     * Gets the value of the sigNumCnt property.
     * 
     * @return
     *     possible object is
     *     {@link SigNumCntType }
     *     
     */
    public SigNumCntType getSigNumCnt() {
        return sigNumCnt;
    }

    /**
     * Sets the value of the sigNumCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigNumCntType }
     *     
     */
    public void setSigNumCnt(SigNumCntType value) {
        this.sigNumCnt = value;
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
     * Gets the value of the resAuthType property.
     * 
     * @return
     *     possible object is
     *     {@link ResAuthTypeType }
     *     
     */
    public ResAuthTypeType getResAuthType() {
        return resAuthType;
    }

    /**
     * Sets the value of the resAuthType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResAuthTypeType }
     *     
     */
    public void setResAuthType(ResAuthTypeType value) {
        this.resAuthType = value;
    }

    /**
     * Gets the value of the specificLmt property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getSpecificLmt() {
        return specificLmt;
    }

    /**
     * Sets the value of the specificLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setSpecificLmt(RmkType value) {
        this.specificLmt = value;
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
