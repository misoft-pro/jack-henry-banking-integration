
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
 * <p>Java class for HouseHoldDebtorInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseHoldDebtorInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DebtorName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="DebtorBirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DebtorTaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ECOACode" type="{http://jackhenry.com/jxchange/TPG/2008}ECOACode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BnkRptcyFileCode" type="{http://jackhenry.com/jxchange/TPG/2008}BnkRptcyFileCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurTranCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurTranCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrBurTranDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrBurTranDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "HouseHoldDebtorInfo_CType", propOrder = {
    "debtorName",
    "debtorBirthDt",
    "debtorTaxId",
    "ecoaCode",
    "bnkRptcyFileCode",
    "crBurTranCode",
    "crBurTranDesc",
    "ver1",
    "any"
})
public class HouseHoldDebtorInfoCType {

    @XmlElement(name = "DebtorName")
    protected PersonNameCType debtorName;
    @XmlElement(name = "DebtorBirthDt")
    protected BirthDtType debtorBirthDt;
    @XmlElement(name = "DebtorTaxId")
    protected TaxIdType debtorTaxId;
    @XmlElement(name = "ECOACode")
    protected ECOACodeType ecoaCode;
    @XmlElement(name = "BnkRptcyFileCode")
    protected BnkRptcyFileCodeType bnkRptcyFileCode;
    @XmlElement(name = "CrBurTranCode")
    protected CrBurTranCodeType crBurTranCode;
    @XmlElement(name = "CrBurTranDesc")
    protected CrBurTranDescType crBurTranDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the debtorName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getDebtorName() {
        return debtorName;
    }

    /**
     * Sets the value of the debtorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setDebtorName(PersonNameCType value) {
        this.debtorName = value;
    }

    /**
     * Gets the value of the debtorBirthDt property.
     * 
     * @return
     *     possible object is
     *     {@link BirthDtType }
     *     
     */
    public BirthDtType getDebtorBirthDt() {
        return debtorBirthDt;
    }

    /**
     * Sets the value of the debtorBirthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthDtType }
     *     
     */
    public void setDebtorBirthDt(BirthDtType value) {
        this.debtorBirthDt = value;
    }

    /**
     * Gets the value of the debtorTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdType }
     *     
     */
    public TaxIdType getDebtorTaxId() {
        return debtorTaxId;
    }

    /**
     * Sets the value of the debtorTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdType }
     *     
     */
    public void setDebtorTaxId(TaxIdType value) {
        this.debtorTaxId = value;
    }

    /**
     * Gets the value of the ecoaCode property.
     * 
     * @return
     *     possible object is
     *     {@link ECOACodeType }
     *     
     */
    public ECOACodeType getECOACode() {
        return ecoaCode;
    }

    /**
     * Sets the value of the ecoaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECOACodeType }
     *     
     */
    public void setECOACode(ECOACodeType value) {
        this.ecoaCode = value;
    }

    /**
     * Gets the value of the bnkRptcyFileCode property.
     * 
     * @return
     *     possible object is
     *     {@link BnkRptcyFileCodeType }
     *     
     */
    public BnkRptcyFileCodeType getBnkRptcyFileCode() {
        return bnkRptcyFileCode;
    }

    /**
     * Sets the value of the bnkRptcyFileCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BnkRptcyFileCodeType }
     *     
     */
    public void setBnkRptcyFileCode(BnkRptcyFileCodeType value) {
        this.bnkRptcyFileCode = value;
    }

    /**
     * Gets the value of the crBurTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurTranCodeType }
     *     
     */
    public CrBurTranCodeType getCrBurTranCode() {
        return crBurTranCode;
    }

    /**
     * Sets the value of the crBurTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurTranCodeType }
     *     
     */
    public void setCrBurTranCode(CrBurTranCodeType value) {
        this.crBurTranCode = value;
    }

    /**
     * Gets the value of the crBurTranDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrBurTranDescType }
     *     
     */
    public CrBurTranDescType getCrBurTranDesc() {
        return crBurTranDesc;
    }

    /**
     * Sets the value of the crBurTranDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrBurTranDescType }
     *     
     */
    public void setCrBurTranDesc(CrBurTranDescType value) {
        this.crBurTranDesc = value;
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
