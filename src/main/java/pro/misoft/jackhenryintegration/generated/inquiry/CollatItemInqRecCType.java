
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CollatItemInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollatItemInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CollatItemRec" type="{http://jackhenry.com/jxchange/TPG/2008}CollatItemRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocLocDesc" type="{http://jackhenry.com/jxchange/TPG/2008}DocLocDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatToLnRelDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatToLnRelDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatPrvStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatPrvStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatRecDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatRecDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatRegstDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatRegstDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatSrcValDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatSrcValDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatCustRelDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctRelDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctCollatRecArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctCollatRecArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CustIdCollatRecArray" type="{http://jackhenry.com/jxchange/TPG/2008}CustIdCollatRecArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="CollatDocItemRecArray" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDocItemRecArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "CollatItemInqRec_CType", propOrder = {
    "collatItemRec",
    "brDesc",
    "collatDesc",
    "docLocDesc",
    "collatToLnRelDesc",
    "collatPrvStatDesc",
    "collatRecDesc",
    "collatRegstDesc",
    "collatStatDesc",
    "collatSrcValDesc",
    "collatOffDesc",
    "collatCustRelDesc",
    "acctCollatRecArray",
    "custIdCollatRecArray",
    "collatDocItemRecArray",
    "custom",
    "ver1",
    "any"
})
public class CollatItemInqRecCType {

    @XmlElement(name = "CollatItemRec")
    protected CollatItemRecCType collatItemRec;
    @XmlElement(name = "BrDesc")
    protected BrDescType brDesc;
    @XmlElement(name = "CollatDesc")
    protected CollatDescType collatDesc;
    @XmlElement(name = "DocLocDesc")
    protected DocLocDescType docLocDesc;
    @XmlElement(name = "CollatToLnRelDesc")
    protected CollatToLnRelDescType collatToLnRelDesc;
    @XmlElement(name = "CollatPrvStatDesc")
    protected CollatPrvStatDescType collatPrvStatDesc;
    @XmlElement(name = "CollatRecDesc")
    protected CollatRecDescType collatRecDesc;
    @XmlElement(name = "CollatRegstDesc")
    protected CollatRegstDescType collatRegstDesc;
    @XmlElement(name = "CollatStatDesc")
    protected CollatStatDescType collatStatDesc;
    @XmlElement(name = "CollatSrcValDesc")
    protected CollatSrcValDescType collatSrcValDesc;
    @XmlElement(name = "CollatOffDesc")
    protected OffDescType collatOffDesc;
    @XmlElement(name = "CollatCustRelDesc")
    protected AcctRelDescType collatCustRelDesc;
    @XmlElement(name = "AcctCollatRecArray")
    protected AcctCollatRecArrayAType acctCollatRecArray;
    @XmlElement(name = "CustIdCollatRecArray")
    protected CustIdCollatRecArrayAType custIdCollatRecArray;
    @XmlElement(name = "CollatDocItemRecArray")
    protected CollatDocItemRecArrayAType collatDocItemRecArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the collatItemRec property.
     * 
     * @return
     *     possible object is
     *     {@link CollatItemRecCType }
     *     
     */
    public CollatItemRecCType getCollatItemRec() {
        return collatItemRec;
    }

    /**
     * Sets the value of the collatItemRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatItemRecCType }
     *     
     */
    public void setCollatItemRec(CollatItemRecCType value) {
        this.collatItemRec = value;
    }

    /**
     * Gets the value of the brDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrDescType }
     *     
     */
    public BrDescType getBrDesc() {
        return brDesc;
    }

    /**
     * Sets the value of the brDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrDescType }
     *     
     */
    public void setBrDesc(BrDescType value) {
        this.brDesc = value;
    }

    /**
     * Gets the value of the collatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CollatDescType }
     *     
     */
    public CollatDescType getCollatDesc() {
        return collatDesc;
    }

    /**
     * Sets the value of the collatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatDescType }
     *     
     */
    public void setCollatDesc(CollatDescType value) {
        this.collatDesc = value;
    }

    /**
     * Gets the value of the docLocDesc property.
     * 
     * @return
     *     possible object is
     *     {@link DocLocDescType }
     *     
     */
    public DocLocDescType getDocLocDesc() {
        return docLocDesc;
    }

    /**
     * Sets the value of the docLocDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocLocDescType }
     *     
     */
    public void setDocLocDesc(DocLocDescType value) {
        this.docLocDesc = value;
    }

    /**
     * Gets the value of the collatToLnRelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CollatToLnRelDescType }
     *     
     */
    public CollatToLnRelDescType getCollatToLnRelDesc() {
        return collatToLnRelDesc;
    }

    /**
     * Sets the value of the collatToLnRelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatToLnRelDescType }
     *     
     */
    public void setCollatToLnRelDesc(CollatToLnRelDescType value) {
        this.collatToLnRelDesc = value;
    }

    /**
     * Gets the value of the collatPrvStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CollatPrvStatDescType }
     *     
     */
    public CollatPrvStatDescType getCollatPrvStatDesc() {
        return collatPrvStatDesc;
    }

    /**
     * Sets the value of the collatPrvStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatPrvStatDescType }
     *     
     */
    public void setCollatPrvStatDesc(CollatPrvStatDescType value) {
        this.collatPrvStatDesc = value;
    }

    /**
     * Gets the value of the collatRecDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CollatRecDescType }
     *     
     */
    public CollatRecDescType getCollatRecDesc() {
        return collatRecDesc;
    }

    /**
     * Sets the value of the collatRecDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatRecDescType }
     *     
     */
    public void setCollatRecDesc(CollatRecDescType value) {
        this.collatRecDesc = value;
    }

    /**
     * Gets the value of the collatRegstDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CollatRegstDescType }
     *     
     */
    public CollatRegstDescType getCollatRegstDesc() {
        return collatRegstDesc;
    }

    /**
     * Sets the value of the collatRegstDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatRegstDescType }
     *     
     */
    public void setCollatRegstDesc(CollatRegstDescType value) {
        this.collatRegstDesc = value;
    }

    /**
     * Gets the value of the collatStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CollatStatDescType }
     *     
     */
    public CollatStatDescType getCollatStatDesc() {
        return collatStatDesc;
    }

    /**
     * Sets the value of the collatStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatStatDescType }
     *     
     */
    public void setCollatStatDesc(CollatStatDescType value) {
        this.collatStatDesc = value;
    }

    /**
     * Gets the value of the collatSrcValDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CollatSrcValDescType }
     *     
     */
    public CollatSrcValDescType getCollatSrcValDesc() {
        return collatSrcValDesc;
    }

    /**
     * Sets the value of the collatSrcValDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatSrcValDescType }
     *     
     */
    public void setCollatSrcValDesc(CollatSrcValDescType value) {
        this.collatSrcValDesc = value;
    }

    /**
     * Gets the value of the collatOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OffDescType }
     *     
     */
    public OffDescType getCollatOffDesc() {
        return collatOffDesc;
    }

    /**
     * Sets the value of the collatOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffDescType }
     *     
     */
    public void setCollatOffDesc(OffDescType value) {
        this.collatOffDesc = value;
    }

    /**
     * Gets the value of the collatCustRelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRelDescType }
     *     
     */
    public AcctRelDescType getCollatCustRelDesc() {
        return collatCustRelDesc;
    }

    /**
     * Sets the value of the collatCustRelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRelDescType }
     *     
     */
    public void setCollatCustRelDesc(AcctRelDescType value) {
        this.collatCustRelDesc = value;
    }

    /**
     * Gets the value of the acctCollatRecArray property.
     * 
     * @return
     *     possible object is
     *     {@link AcctCollatRecArrayAType }
     *     
     */
    public AcctCollatRecArrayAType getAcctCollatRecArray() {
        return acctCollatRecArray;
    }

    /**
     * Sets the value of the acctCollatRecArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctCollatRecArrayAType }
     *     
     */
    public void setAcctCollatRecArray(AcctCollatRecArrayAType value) {
        this.acctCollatRecArray = value;
    }

    /**
     * Gets the value of the custIdCollatRecArray property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdCollatRecArrayAType }
     *     
     */
    public CustIdCollatRecArrayAType getCustIdCollatRecArray() {
        return custIdCollatRecArray;
    }

    /**
     * Sets the value of the custIdCollatRecArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdCollatRecArrayAType }
     *     
     */
    public void setCustIdCollatRecArray(CustIdCollatRecArrayAType value) {
        this.custIdCollatRecArray = value;
    }

    /**
     * Gets the value of the collatDocItemRecArray property.
     * 
     * @return
     *     possible object is
     *     {@link CollatDocItemRecArrayAType }
     *     
     */
    public CollatDocItemRecArrayAType getCollatDocItemRecArray() {
        return collatDocItemRecArray;
    }

    /**
     * Sets the value of the collatDocItemRecArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatDocItemRecArrayAType }
     *     
     */
    public void setCollatDocItemRecArray(CollatDocItemRecArrayAType value) {
        this.collatDocItemRecArray = value;
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
