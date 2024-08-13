
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CustRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustDetail" type="{http://jackhenry.com/jxchange/TPG/2008}CustDetail_CType" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType" minOccurs="0"/&gt;
 *         &lt;element name="NAICSDesc" type="{http://jackhenry.com/jxchange/TPG/2008}NAICSDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="StdIndustDesc" type="{http://jackhenry.com/jxchange/TPG/2008}StdIndustDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CondNotfArray" type="{http://jackhenry.com/jxchange/TPG/2008}CondNotfArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="IntnetFinInstIdArray" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstIdArray_AType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="CustCrtRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CustCrtRsnDesc_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="CustBenflOwnType" type="{http://jackhenry.com/jxchange/TPG/2008}CustBenflOwnType_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="CustBrandArray" type="{http://jackhenry.com/jxchange/TPG/2008}CustBrandArray_AType" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/sequence&gt;
 *             &lt;/sequence&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "CustRec_CType", propOrder = {
    "custDetail",
    "custId",
    "accountId",
    "naicsDesc",
    "stdIndustDesc",
    "condNotfArray",
    "ver1",
    "intnetFinInstIdArray",
    "ver2",
    "custCrtRsnDesc",
    "ver3",
    "custBenflOwnType",
    "ver4",
    "custBrandArray",
    "ver5",
    "any"
})
public class CustRecCType {

    @XmlElement(name = "CustDetail")
    protected CustDetailCType custDetail;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "AccountId")
    protected AccountIdCType accountId;
    @XmlElement(name = "NAICSDesc")
    protected NAICSDescType naicsDesc;
    @XmlElement(name = "StdIndustDesc")
    protected StdIndustDescType stdIndustDesc;
    @XmlElement(name = "CondNotfArray")
    protected CondNotfArrayAType condNotfArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "IntnetFinInstIdArray")
    protected IntnetFinInstIdArrayAType intnetFinInstIdArray;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "CustCrtRsnDesc")
    protected CustCrtRsnDescType custCrtRsnDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "CustBenflOwnType")
    protected CustBenflOwnTypeType custBenflOwnType;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "CustBrandArray")
    protected CustBrandArrayAType custBrandArray;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the custDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CustDetailCType }
     *     
     */
    public CustDetailCType getCustDetail() {
        return custDetail;
    }

    /**
     * Sets the value of the custDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustDetailCType }
     *     
     */
    public void setCustDetail(CustDetailCType value) {
        this.custDetail = value;
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
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setAccountId(AccountIdCType value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the naicsDesc property.
     * 
     * @return
     *     possible object is
     *     {@link NAICSDescType }
     *     
     */
    public NAICSDescType getNAICSDesc() {
        return naicsDesc;
    }

    /**
     * Sets the value of the naicsDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAICSDescType }
     *     
     */
    public void setNAICSDesc(NAICSDescType value) {
        this.naicsDesc = value;
    }

    /**
     * Gets the value of the stdIndustDesc property.
     * 
     * @return
     *     possible object is
     *     {@link StdIndustDescType }
     *     
     */
    public StdIndustDescType getStdIndustDesc() {
        return stdIndustDesc;
    }

    /**
     * Sets the value of the stdIndustDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdIndustDescType }
     *     
     */
    public void setStdIndustDesc(StdIndustDescType value) {
        this.stdIndustDesc = value;
    }

    /**
     * Gets the value of the condNotfArray property.
     * 
     * @return
     *     possible object is
     *     {@link CondNotfArrayAType }
     *     
     */
    public CondNotfArrayAType getCondNotfArray() {
        return condNotfArray;
    }

    /**
     * Sets the value of the condNotfArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CondNotfArrayAType }
     *     
     */
    public void setCondNotfArray(CondNotfArrayAType value) {
        this.condNotfArray = value;
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
     * Gets the value of the intnetFinInstIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetFinInstIdArrayAType }
     *     
     */
    public IntnetFinInstIdArrayAType getIntnetFinInstIdArray() {
        return intnetFinInstIdArray;
    }

    /**
     * Sets the value of the intnetFinInstIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetFinInstIdArrayAType }
     *     
     */
    public void setIntnetFinInstIdArray(IntnetFinInstIdArrayAType value) {
        this.intnetFinInstIdArray = value;
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
     * Gets the value of the custCrtRsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CustCrtRsnDescType }
     *     
     */
    public CustCrtRsnDescType getCustCrtRsnDesc() {
        return custCrtRsnDesc;
    }

    /**
     * Sets the value of the custCrtRsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustCrtRsnDescType }
     *     
     */
    public void setCustCrtRsnDesc(CustCrtRsnDescType value) {
        this.custCrtRsnDesc = value;
    }

    /**
     * Gets the value of the ver3 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver3CType }
     *     
     */
    public Ver3CType getVer3() {
        return ver3;
    }

    /**
     * Sets the value of the ver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver3CType }
     *     
     */
    public void setVer3(Ver3CType value) {
        this.ver3 = value;
    }

    /**
     * Gets the value of the custBenflOwnType property.
     * 
     * @return
     *     possible object is
     *     {@link CustBenflOwnTypeType }
     *     
     */
    public CustBenflOwnTypeType getCustBenflOwnType() {
        return custBenflOwnType;
    }

    /**
     * Sets the value of the custBenflOwnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustBenflOwnTypeType }
     *     
     */
    public void setCustBenflOwnType(CustBenflOwnTypeType value) {
        this.custBenflOwnType = value;
    }

    /**
     * Gets the value of the ver4 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver4CType }
     *     
     */
    public Ver4CType getVer4() {
        return ver4;
    }

    /**
     * Sets the value of the ver4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver4CType }
     *     
     */
    public void setVer4(Ver4CType value) {
        this.ver4 = value;
    }

    /**
     * Gets the value of the custBrandArray property.
     * 
     * @return
     *     possible object is
     *     {@link CustBrandArrayAType }
     *     
     */
    public CustBrandArrayAType getCustBrandArray() {
        return custBrandArray;
    }

    /**
     * Sets the value of the custBrandArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustBrandArrayAType }
     *     
     */
    public void setCustBrandArray(CustBrandArrayAType value) {
        this.custBrandArray = value;
    }

    /**
     * Gets the value of the ver5 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver5CType }
     *     
     */
    public Ver5CType getVer5() {
        return ver5;
    }

    /**
     * Sets the value of the ver5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver5CType }
     *     
     */
    public void setVer5(Ver5CType value) {
        this.ver5 = value;
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
