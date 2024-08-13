
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
 * <p>Java class for ColInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ColRec" type="{http://jackhenry.com/jxchange/TPG/2008}ColRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="InstDefKey" type="{http://jackhenry.com/jxchange/TPG/2008}InstDefKey_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ManualAddType" type="{http://jackhenry.com/jxchange/TPG/2008}ManualAddType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColQueDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ColQueDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActnTakenDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ActnTakenDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConPartyDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ConPartyDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConRsltDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ConRsltDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColLtrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ColLtrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ColAcctStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ColAcctStatDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ColInqRec_CType", propOrder = {
    "colRec",
    "instDefKey",
    "custId",
    "manualAddType",
    "colQueDesc",
    "actnTakenDesc",
    "conPartyDesc",
    "conRsltDesc",
    "colLtrDesc",
    "colAcctStatDesc",
    "custom",
    "ver1",
    "any"
})
public class ColInqRecCType {

    @XmlElement(name = "ColRec")
    protected ColRecCType colRec;
    @XmlElement(name = "InstDefKey")
    protected InstDefKeyType instDefKey;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "ManualAddType")
    protected ManualAddTypeType manualAddType;
    @XmlElement(name = "ColQueDesc")
    protected ColQueDescType colQueDesc;
    @XmlElement(name = "ActnTakenDesc")
    protected ActnTakenDescType actnTakenDesc;
    @XmlElement(name = "ConPartyDesc")
    protected ConPartyDescType conPartyDesc;
    @XmlElement(name = "ConRsltDesc")
    protected ConRsltDescType conRsltDesc;
    @XmlElement(name = "ColLtrDesc")
    protected ColLtrDescType colLtrDesc;
    @XmlElement(name = "ColAcctStatDesc")
    protected ColAcctStatDescType colAcctStatDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the colRec property.
     * 
     * @return
     *     possible object is
     *     {@link ColRecCType }
     *     
     */
    public ColRecCType getColRec() {
        return colRec;
    }

    /**
     * Sets the value of the colRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColRecCType }
     *     
     */
    public void setColRec(ColRecCType value) {
        this.colRec = value;
    }

    /**
     * Gets the value of the instDefKey property.
     * 
     * @return
     *     possible object is
     *     {@link InstDefKeyType }
     *     
     */
    public InstDefKeyType getInstDefKey() {
        return instDefKey;
    }

    /**
     * Sets the value of the instDefKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstDefKeyType }
     *     
     */
    public void setInstDefKey(InstDefKeyType value) {
        this.instDefKey = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCustId(CustIdType value) {
        this.custId = value;
    }

    /**
     * Gets the value of the manualAddType property.
     * 
     * @return
     *     possible object is
     *     {@link ManualAddTypeType }
     *     
     */
    public ManualAddTypeType getManualAddType() {
        return manualAddType;
    }

    /**
     * Sets the value of the manualAddType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManualAddTypeType }
     *     
     */
    public void setManualAddType(ManualAddTypeType value) {
        this.manualAddType = value;
    }

    /**
     * Gets the value of the colQueDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ColQueDescType }
     *     
     */
    public ColQueDescType getColQueDesc() {
        return colQueDesc;
    }

    /**
     * Sets the value of the colQueDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColQueDescType }
     *     
     */
    public void setColQueDesc(ColQueDescType value) {
        this.colQueDesc = value;
    }

    /**
     * Gets the value of the actnTakenDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ActnTakenDescType }
     *     
     */
    public ActnTakenDescType getActnTakenDesc() {
        return actnTakenDesc;
    }

    /**
     * Sets the value of the actnTakenDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActnTakenDescType }
     *     
     */
    public void setActnTakenDesc(ActnTakenDescType value) {
        this.actnTakenDesc = value;
    }

    /**
     * Gets the value of the conPartyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ConPartyDescType }
     *     
     */
    public ConPartyDescType getConPartyDesc() {
        return conPartyDesc;
    }

    /**
     * Sets the value of the conPartyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConPartyDescType }
     *     
     */
    public void setConPartyDesc(ConPartyDescType value) {
        this.conPartyDesc = value;
    }

    /**
     * Gets the value of the conRsltDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ConRsltDescType }
     *     
     */
    public ConRsltDescType getConRsltDesc() {
        return conRsltDesc;
    }

    /**
     * Sets the value of the conRsltDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConRsltDescType }
     *     
     */
    public void setConRsltDesc(ConRsltDescType value) {
        this.conRsltDesc = value;
    }

    /**
     * Gets the value of the colLtrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ColLtrDescType }
     *     
     */
    public ColLtrDescType getColLtrDesc() {
        return colLtrDesc;
    }

    /**
     * Sets the value of the colLtrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColLtrDescType }
     *     
     */
    public void setColLtrDesc(ColLtrDescType value) {
        this.colLtrDesc = value;
    }

    /**
     * Gets the value of the colAcctStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ColAcctStatDescType }
     *     
     */
    public ColAcctStatDescType getColAcctStatDesc() {
        return colAcctStatDesc;
    }

    /**
     * Sets the value of the colAcctStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColAcctStatDescType }
     *     
     */
    public void setColAcctStatDesc(ColAcctStatDescType value) {
        this.colAcctStatDesc = value;
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
