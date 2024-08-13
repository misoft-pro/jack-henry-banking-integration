
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
 * <p>Java class for x_LnSvcInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_LnSvcInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnSvcInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}LnSvcInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="InAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="SvcProcDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SvcProcDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcCommitDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SvcCommitDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SvcStatDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_LnSvcInfoRec_CType", propOrder = {
    "lnSvcInfoRec",
    "inAcctId",
    "custId",
    "personName",
    "addr",
    "svcProcDesc",
    "svcCommitDesc",
    "svcStatDesc",
    "custom",
    "ver1",
    "any"
})
public class XLnSvcInfoRecCType {

    @XmlElement(name = "LnSvcInfoRec")
    protected LnSvcInfoRecCType lnSvcInfoRec;
    @XmlElement(name = "InAcctId", required = true)
    protected AccountIdCType inAcctId;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "Addr")
    protected AddrCType addr;
    @XmlElement(name = "SvcProcDesc")
    protected SvcProcDescType svcProcDesc;
    @XmlElement(name = "SvcCommitDesc")
    protected SvcCommitDescType svcCommitDesc;
    @XmlElement(name = "SvcStatDesc")
    protected SvcStatDescType svcStatDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnSvcInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link LnSvcInfoRecCType }
     *     
     */
    public LnSvcInfoRecCType getLnSvcInfoRec() {
        return lnSvcInfoRec;
    }

    /**
     * Sets the value of the lnSvcInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnSvcInfoRecCType }
     *     
     */
    public void setLnSvcInfoRec(LnSvcInfoRecCType value) {
        this.lnSvcInfoRec = value;
    }

    /**
     * Gets the value of the inAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getInAcctId() {
        return inAcctId;
    }

    /**
     * Sets the value of the inAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setInAcctId(AccountIdCType value) {
        this.inAcctId = value;
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
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setAddr(AddrCType value) {
        this.addr = value;
    }

    /**
     * Gets the value of the svcProcDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SvcProcDescType }
     *     
     */
    public SvcProcDescType getSvcProcDesc() {
        return svcProcDesc;
    }

    /**
     * Sets the value of the svcProcDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcProcDescType }
     *     
     */
    public void setSvcProcDesc(SvcProcDescType value) {
        this.svcProcDesc = value;
    }

    /**
     * Gets the value of the svcCommitDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SvcCommitDescType }
     *     
     */
    public SvcCommitDescType getSvcCommitDesc() {
        return svcCommitDesc;
    }

    /**
     * Sets the value of the svcCommitDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcCommitDescType }
     *     
     */
    public void setSvcCommitDesc(SvcCommitDescType value) {
        this.svcCommitDesc = value;
    }

    /**
     * Gets the value of the svcStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SvcStatDescType }
     *     
     */
    public SvcStatDescType getSvcStatDesc() {
        return svcStatDesc;
    }

    /**
     * Sets the value of the svcStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcStatDescType }
     *     
     */
    public void setSvcStatDesc(SvcStatDescType value) {
        this.svcStatDesc = value;
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
