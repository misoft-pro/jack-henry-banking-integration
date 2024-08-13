
package pro.misoft.jackhenryintegration.generated.billpay;

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
 * <p>Java class for ElecMerAcctIdInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElecMerAcctIdInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElecMerAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type"/&gt;
 *         &lt;element name="SubMerAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}SubMerAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecMerAcctAliasName" type="{http://jackhenry.com/jxchange/TPG/2008}AliasAcctName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecMerAcctBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ElecMerAcctIdInfoRec_CType", propOrder = {
    "elecMerAcctId",
    "subMerAcctId",
    "elecMerAcctAliasName",
    "elecMerAcctBal",
    "custom",
    "ver1",
    "any"
})
public class ElecMerAcctIdInfoRecCType {

    @XmlElement(name = "ElecMerAcctId", required = true)
    protected AcctIdType elecMerAcctId;
    @XmlElement(name = "SubMerAcctId")
    protected SubMerAcctIdType subMerAcctId;
    @XmlElement(name = "ElecMerAcctAliasName")
    protected AliasAcctNameType elecMerAcctAliasName;
    @XmlElementRef(name = "ElecMerAcctBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurBalType> elecMerAcctBal;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the elecMerAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getElecMerAcctId() {
        return elecMerAcctId;
    }

    /**
     * Sets the value of the elecMerAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setElecMerAcctId(AcctIdType value) {
        this.elecMerAcctId = value;
    }

    /**
     * Gets the value of the subMerAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link SubMerAcctIdType }
     *     
     */
    public SubMerAcctIdType getSubMerAcctId() {
        return subMerAcctId;
    }

    /**
     * Sets the value of the subMerAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubMerAcctIdType }
     *     
     */
    public void setSubMerAcctId(SubMerAcctIdType value) {
        this.subMerAcctId = value;
    }

    /**
     * Gets the value of the elecMerAcctAliasName property.
     * 
     * @return
     *     possible object is
     *     {@link AliasAcctNameType }
     *     
     */
    public AliasAcctNameType getElecMerAcctAliasName() {
        return elecMerAcctAliasName;
    }

    /**
     * Sets the value of the elecMerAcctAliasName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasAcctNameType }
     *     
     */
    public void setElecMerAcctAliasName(AliasAcctNameType value) {
        this.elecMerAcctAliasName = value;
    }

    /**
     * Gets the value of the elecMerAcctBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurBalType }{@code >}
     *     
     */
    public JAXBElement<CurBalType> getElecMerAcctBal() {
        return elecMerAcctBal;
    }

    /**
     * Sets the value of the elecMerAcctBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurBalType }{@code >}
     *     
     */
    public void setElecMerAcctBal(JAXBElement<CurBalType> value) {
        this.elecMerAcctBal = value;
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
