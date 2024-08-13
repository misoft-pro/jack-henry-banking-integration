
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for DrCustInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DrCustInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="CustType" type="{http://jackhenry.com/jxchange/TPG/2008}PmtCustType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="CustBirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustBirthCity" type="{http://jackhenry.com/jxchange/TPG/2008}City_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustBirthCntry" type="{http://jackhenry.com/jxchange/TPG/2008}Cntry_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrAccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="UsrToken" type="{http://jackhenry.com/jxchange/TPG/2008}UsrToken_Type" minOccurs="0"/&gt;
 *         &lt;element name="UsrTokenType" type="{http://jackhenry.com/jxchange/TPG/2008}UsrTokenType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "DrCustInfoRec_CType", propOrder = {
    "custName",
    "custType",
    "custAddr",
    "custBirthDt",
    "custBirthCity",
    "custBirthCntry",
    "drAccountId",
    "usrToken",
    "usrTokenType",
    "ver1",
    "any"
})
public class DrCustInfoRecCType {

    @XmlElement(name = "CustName")
    protected PersonNameCType custName;
    @XmlElement(name = "CustType")
    protected PmtCustTypeType custType;
    @XmlElement(name = "CustAddr")
    protected AddrCType custAddr;
    @XmlElement(name = "CustBirthDt")
    protected BirthDtType custBirthDt;
    @XmlElement(name = "CustBirthCity")
    protected CityType custBirthCity;
    @XmlElement(name = "CustBirthCntry")
    protected CntryType custBirthCntry;
    @XmlElement(name = "DrAccountId")
    protected AccountIdCType drAccountId;
    @XmlElement(name = "UsrToken")
    protected UsrTokenType usrToken;
    @XmlElement(name = "UsrTokenType")
    protected UsrTokenTypeType usrTokenType;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setCustName(PersonNameCType value) {
        this.custName = value;
    }

    /**
     * Gets the value of the custType property.
     * 
     * @return
     *     possible object is
     *     {@link PmtCustTypeType }
     *     
     */
    public PmtCustTypeType getCustType() {
        return custType;
    }

    /**
     * Sets the value of the custType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtCustTypeType }
     *     
     */
    public void setCustType(PmtCustTypeType value) {
        this.custType = value;
    }

    /**
     * Gets the value of the custAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getCustAddr() {
        return custAddr;
    }

    /**
     * Sets the value of the custAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setCustAddr(AddrCType value) {
        this.custAddr = value;
    }

    /**
     * Gets the value of the custBirthDt property.
     * 
     * @return
     *     possible object is
     *     {@link BirthDtType }
     *     
     */
    public BirthDtType getCustBirthDt() {
        return custBirthDt;
    }

    /**
     * Sets the value of the custBirthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthDtType }
     *     
     */
    public void setCustBirthDt(BirthDtType value) {
        this.custBirthDt = value;
    }

    /**
     * Gets the value of the custBirthCity property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getCustBirthCity() {
        return custBirthCity;
    }

    /**
     * Sets the value of the custBirthCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setCustBirthCity(CityType value) {
        this.custBirthCity = value;
    }

    /**
     * Gets the value of the custBirthCntry property.
     * 
     * @return
     *     possible object is
     *     {@link CntryType }
     *     
     */
    public CntryType getCustBirthCntry() {
        return custBirthCntry;
    }

    /**
     * Sets the value of the custBirthCntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntryType }
     *     
     */
    public void setCustBirthCntry(CntryType value) {
        this.custBirthCntry = value;
    }

    /**
     * Gets the value of the drAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getDrAccountId() {
        return drAccountId;
    }

    /**
     * Sets the value of the drAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setDrAccountId(AccountIdCType value) {
        this.drAccountId = value;
    }

    /**
     * Gets the value of the usrToken property.
     * 
     * @return
     *     possible object is
     *     {@link UsrTokenType }
     *     
     */
    public UsrTokenType getUsrToken() {
        return usrToken;
    }

    /**
     * Sets the value of the usrToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsrTokenType }
     *     
     */
    public void setUsrToken(UsrTokenType value) {
        this.usrToken = value;
    }

    /**
     * Gets the value of the usrTokenType property.
     * 
     * @return
     *     possible object is
     *     {@link UsrTokenTypeType }
     *     
     */
    public UsrTokenTypeType getUsrTokenType() {
        return usrTokenType;
    }

    /**
     * Sets the value of the usrTokenType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsrTokenTypeType }
     *     
     */
    public void setUsrTokenType(UsrTokenTypeType value) {
        this.usrTokenType = value;
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
