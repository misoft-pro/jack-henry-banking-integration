
package pro.misoft.jackhenryintegration.generated.ach;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ACHFltrInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHFltrInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHAlwTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHAlwTrnType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AlwPosPayType" type="{http://jackhenry.com/jxchange/TPG/2008}AlwPosPayType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHFltrCompInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}ACHFltrCompInfoRec_CType" minOccurs="0"/&gt;
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
@XmlType(name = "ACHFltrInfo_CType", propOrder = {
    "achAlwTrnType",
    "alwPosPayType",
    "achFltrCompInfoRec",
    "custom",
    "ver1",
    "any"
})
public class ACHFltrInfoCType {

    @XmlElement(name = "ACHAlwTrnType")
    protected ACHAlwTrnTypeType achAlwTrnType;
    @XmlElement(name = "AlwPosPayType")
    protected AlwPosPayTypeType alwPosPayType;
    @XmlElement(name = "ACHFltrCompInfoRec")
    protected ACHFltrCompInfoRecCType achFltrCompInfoRec;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the achAlwTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link ACHAlwTrnTypeType }
     *     
     */
    public ACHAlwTrnTypeType getACHAlwTrnType() {
        return achAlwTrnType;
    }

    /**
     * Sets the value of the achAlwTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHAlwTrnTypeType }
     *     
     */
    public void setACHAlwTrnType(ACHAlwTrnTypeType value) {
        this.achAlwTrnType = value;
    }

    /**
     * Gets the value of the alwPosPayType property.
     * 
     * @return
     *     possible object is
     *     {@link AlwPosPayTypeType }
     *     
     */
    public AlwPosPayTypeType getAlwPosPayType() {
        return alwPosPayType;
    }

    /**
     * Sets the value of the alwPosPayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlwPosPayTypeType }
     *     
     */
    public void setAlwPosPayType(AlwPosPayTypeType value) {
        this.alwPosPayType = value;
    }

    /**
     * Gets the value of the achFltrCompInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link ACHFltrCompInfoRecCType }
     *     
     */
    public ACHFltrCompInfoRecCType getACHFltrCompInfoRec() {
        return achFltrCompInfoRec;
    }

    /**
     * Sets the value of the achFltrCompInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHFltrCompInfoRecCType }
     *     
     */
    public void setACHFltrCompInfoRec(ACHFltrCompInfoRecCType value) {
        this.achFltrCompInfoRec = value;
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
