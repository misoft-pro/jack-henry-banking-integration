
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
 * The complex for gathering the necessary information for a document
 *                 signing ceremony. 
 * 
 * <p>Java class for PltfmAppSigInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAppSigInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SigNumCnt" type="{http://jackhenry.com/jxchange/TPG/2008}SigNumCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="TempSigCardType" type="{http://jackhenry.com/jxchange/TPG/2008}TempSigCardType_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocStateCode" type="{http://jackhenry.com/jxchange/TPG/2008}StateCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmAppSigInfo_CType", propOrder = {
    "sigNumCnt",
    "tempSigCardType",
    "docStateCode",
    "custom",
    "ver1",
    "any"
})
public class PltfmAppSigInfoCType {

    @XmlElement(name = "SigNumCnt")
    protected SigNumCntType sigNumCnt;
    @XmlElement(name = "TempSigCardType")
    protected TempSigCardTypeType tempSigCardType;
    @XmlElement(name = "DocStateCode")
    protected StateCodeType docStateCode;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the tempSigCardType property.
     * 
     * @return
     *     possible object is
     *     {@link TempSigCardTypeType }
     *     
     */
    public TempSigCardTypeType getTempSigCardType() {
        return tempSigCardType;
    }

    /**
     * Sets the value of the tempSigCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TempSigCardTypeType }
     *     
     */
    public void setTempSigCardType(TempSigCardTypeType value) {
        this.tempSigCardType = value;
    }

    /**
     * Gets the value of the docStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link StateCodeType }
     *     
     */
    public StateCodeType getDocStateCode() {
        return docStateCode;
    }

    /**
     * Sets the value of the docStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateCodeType }
     *     
     */
    public void setDocStateCode(StateCodeType value) {
        this.docStateCode = value;
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
