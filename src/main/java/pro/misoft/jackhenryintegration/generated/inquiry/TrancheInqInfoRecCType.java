
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
 * <p>Java class for TrancheInqInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrancheInqInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrancheInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}TrancheInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntBasisDesc" type="{http://jackhenry.com/jxchange/TPG/2008}IntBasisDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PmtCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStatDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TrancheInqInfoRec_CType", propOrder = {
    "trancheInfoRec",
    "personName",
    "curBal",
    "intBasisDesc",
    "pmtCodeDesc",
    "acctStatDesc",
    "custom",
    "ver1",
    "any"
})
public class TrancheInqInfoRecCType {

    @XmlElement(name = "TrancheInfoRec")
    protected TrancheInfoRecCType trancheInfoRec;
    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "IntBasisDesc")
    protected IntBasisDescType intBasisDesc;
    @XmlElement(name = "PmtCodeDesc")
    protected PmtCodeDescType pmtCodeDesc;
    @XmlElement(name = "AcctStatDesc")
    protected AcctStatDescType acctStatDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the trancheInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link TrancheInfoRecCType }
     *     
     */
    public TrancheInfoRecCType getTrancheInfoRec() {
        return trancheInfoRec;
    }

    /**
     * Sets the value of the trancheInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrancheInfoRecCType }
     *     
     */
    public void setTrancheInfoRec(TrancheInfoRecCType value) {
        this.trancheInfoRec = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setPersonName(PersonNameCType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the curBal property.
     * 
     * @return
     *     possible object is
     *     {@link CurBalType }
     *     
     */
    public CurBalType getCurBal() {
        return curBal;
    }

    /**
     * Sets the value of the curBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurBalType }
     *     
     */
    public void setCurBal(CurBalType value) {
        this.curBal = value;
    }

    /**
     * Gets the value of the intBasisDesc property.
     * 
     * @return
     *     possible object is
     *     {@link IntBasisDescType }
     *     
     */
    public IntBasisDescType getIntBasisDesc() {
        return intBasisDesc;
    }

    /**
     * Sets the value of the intBasisDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntBasisDescType }
     *     
     */
    public void setIntBasisDesc(IntBasisDescType value) {
        this.intBasisDesc = value;
    }

    /**
     * Gets the value of the pmtCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PmtCodeDescType }
     *     
     */
    public PmtCodeDescType getPmtCodeDesc() {
        return pmtCodeDesc;
    }

    /**
     * Sets the value of the pmtCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtCodeDescType }
     *     
     */
    public void setPmtCodeDesc(PmtCodeDescType value) {
        this.pmtCodeDesc = value;
    }

    /**
     * Gets the value of the acctStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStatDescType }
     *     
     */
    public AcctStatDescType getAcctStatDesc() {
        return acctStatDesc;
    }

    /**
     * Sets the value of the acctStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStatDescType }
     *     
     */
    public void setAcctStatDesc(AcctStatDescType value) {
        this.acctStatDesc = value;
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
