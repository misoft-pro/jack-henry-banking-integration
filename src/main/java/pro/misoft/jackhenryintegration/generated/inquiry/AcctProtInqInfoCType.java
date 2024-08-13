
package pro.misoft.jackhenryintegration.generated.inquiry;

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
 * <p>Java class for AcctProtInqInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctProtInqInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="ProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvlBal" type="{http://jackhenry.com/jxchange/TPG/2008}AvlBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCLmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCLmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctProtType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctProtType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctProtOrder" type="{http://jackhenry.com/jxchange/TPG/2008}AcctProtOrder_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomAcctProtInqRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Rstr" type="{http://jackhenry.com/jxchange/TPG/2008}Rstr_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctProtInqInfo_CType", propOrder = {
    "accountId",
    "prodCode",
    "prodDesc",
    "curBal",
    "avlBal",
    "locLmt",
    "acctProtType",
    "acctProtOrder",
    "customAcctProtInqRec",
    "ver1",
    "any"
})
public class AcctProtInqInfoCType {

    @XmlElementRef(name = "AccountId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AccountIdCType> accountId;
    @XmlElementRef(name = "ProdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProdCodeType> prodCode;
    @XmlElementRef(name = "ProdDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProdDescType> prodDesc;
    @XmlElementRef(name = "CurBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurBalType> curBal;
    @XmlElementRef(name = "AvlBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AvlBalType> avlBal;
    @XmlElementRef(name = "LOCLmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LOCLmtType> locLmt;
    @XmlElementRef(name = "AcctProtType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctProtTypeType> acctProtType;
    @XmlElementRef(name = "AcctProtOrder", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctProtOrderType> acctProtOrder;
    @XmlElement(name = "CustomAcctProtInqRec")
    protected CustomCType customAcctProtInqRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public JAXBElement<AccountIdCType> getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AccountIdCType }{@code >}
     *     
     */
    public void setAccountId(JAXBElement<AccountIdCType> value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the prodCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProdCodeType }{@code >}
     *     
     */
    public JAXBElement<ProdCodeType> getProdCode() {
        return prodCode;
    }

    /**
     * Sets the value of the prodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProdCodeType }{@code >}
     *     
     */
    public void setProdCode(JAXBElement<ProdCodeType> value) {
        this.prodCode = value;
    }

    /**
     * Gets the value of the prodDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProdDescType }{@code >}
     *     
     */
    public JAXBElement<ProdDescType> getProdDesc() {
        return prodDesc;
    }

    /**
     * Sets the value of the prodDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProdDescType }{@code >}
     *     
     */
    public void setProdDesc(JAXBElement<ProdDescType> value) {
        this.prodDesc = value;
    }

    /**
     * Gets the value of the curBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurBalType }{@code >}
     *     
     */
    public JAXBElement<CurBalType> getCurBal() {
        return curBal;
    }

    /**
     * Sets the value of the curBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurBalType }{@code >}
     *     
     */
    public void setCurBal(JAXBElement<CurBalType> value) {
        this.curBal = value;
    }

    /**
     * Gets the value of the avlBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AvlBalType }{@code >}
     *     
     */
    public JAXBElement<AvlBalType> getAvlBal() {
        return avlBal;
    }

    /**
     * Sets the value of the avlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AvlBalType }{@code >}
     *     
     */
    public void setAvlBal(JAXBElement<AvlBalType> value) {
        this.avlBal = value;
    }

    /**
     * Gets the value of the locLmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LOCLmtType }{@code >}
     *     
     */
    public JAXBElement<LOCLmtType> getLOCLmt() {
        return locLmt;
    }

    /**
     * Sets the value of the locLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LOCLmtType }{@code >}
     *     
     */
    public void setLOCLmt(JAXBElement<LOCLmtType> value) {
        this.locLmt = value;
    }

    /**
     * Gets the value of the acctProtType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctProtTypeType }{@code >}
     *     
     */
    public JAXBElement<AcctProtTypeType> getAcctProtType() {
        return acctProtType;
    }

    /**
     * Sets the value of the acctProtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctProtTypeType }{@code >}
     *     
     */
    public void setAcctProtType(JAXBElement<AcctProtTypeType> value) {
        this.acctProtType = value;
    }

    /**
     * Gets the value of the acctProtOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctProtOrderType }{@code >}
     *     
     */
    public JAXBElement<AcctProtOrderType> getAcctProtOrder() {
        return acctProtOrder;
    }

    /**
     * Sets the value of the acctProtOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctProtOrderType }{@code >}
     *     
     */
    public void setAcctProtOrder(JAXBElement<AcctProtOrderType> value) {
        this.acctProtOrder = value;
    }

    /**
     * Gets the value of the customAcctProtInqRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomAcctProtInqRec() {
        return customAcctProtInqRec;
    }

    /**
     * Sets the value of the customAcctProtInqRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomAcctProtInqRec(CustomCType value) {
        this.customAcctProtInqRec = value;
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

    /**
     * Gets the value of the rstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstr() {
        return rstr;
    }

    /**
     * Sets the value of the rstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstr(String value) {
        this.rstr = value;
    }

}
