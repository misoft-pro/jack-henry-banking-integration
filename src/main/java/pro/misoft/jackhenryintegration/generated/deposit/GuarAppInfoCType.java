
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
 * The complex of guarantors for a commercial loan
 *                 application
 * 
 * <p>Java class for GuarAppInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuarAppInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GuarLegalName" type="{http://jackhenry.com/jxchange/TPG/2008}LegalName_Type" minOccurs="0"/&gt;
 *         &lt;element name="GuarAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="GuarPhone" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="GuarBnkRptcyYr" type="{http://jackhenry.com/jxchange/TPG/2008}GuarBnkRptcyYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="GuarFinStmtIncl" type="{http://jackhenry.com/jxchange/TPG/2008}GuarFinStmtIncl_Type" minOccurs="0"/&gt;
 *         &lt;element name="GuarCollatCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="GuarInsurPlcyCode" type="{http://jackhenry.com/jxchange/TPG/2008}InsurPlcyCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="GuarInsurPlcyDedctAmt" type="{http://jackhenry.com/jxchange/TPG/2008}InsurPlcyDedctAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="GuarInsurPlcyAmt" type="{http://jackhenry.com/jxchange/TPG/2008}InsurPlcyAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="GuarInsurPlcyTerm" type="{http://jackhenry.com/jxchange/TPG/2008}TermCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="GuarInsurPlcyTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}TermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="GuarCollatLienAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatLienAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="GuarCollatHolderName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="GuarCollatHolderAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="GuarCollatNonApplicant" type="{http://jackhenry.com/jxchange/TPG/2008}CollatNonApplicant_Type" minOccurs="0"/&gt;
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
@XmlType(name = "GuarAppInfo_CType", propOrder = {
    "guarLegalName",
    "guarAddr",
    "guarPhone",
    "guarBnkRptcyYr",
    "guarFinStmtIncl",
    "guarCollatCode",
    "guarInsurPlcyCode",
    "guarInsurPlcyDedctAmt",
    "guarInsurPlcyAmt",
    "guarInsurPlcyTerm",
    "guarInsurPlcyTermUnits",
    "guarCollatLienAmt",
    "guarCollatHolderName",
    "guarCollatHolderAddr",
    "guarCollatNonApplicant",
    "ver1",
    "any"
})
public class GuarAppInfoCType {

    @XmlElement(name = "GuarLegalName")
    protected LegalNameType guarLegalName;
    @XmlElement(name = "GuarAddr")
    protected AddrCType guarAddr;
    @XmlElement(name = "GuarPhone")
    protected PhoneInfoCType guarPhone;
    @XmlElement(name = "GuarBnkRptcyYr")
    protected GuarBnkRptcyYrType guarBnkRptcyYr;
    @XmlElement(name = "GuarFinStmtIncl")
    protected GuarFinStmtInclType guarFinStmtIncl;
    @XmlElement(name = "GuarCollatCode")
    protected CollatCodeType guarCollatCode;
    @XmlElement(name = "GuarInsurPlcyCode")
    protected InsurPlcyCodeType guarInsurPlcyCode;
    @XmlElement(name = "GuarInsurPlcyDedctAmt")
    protected InsurPlcyDedctAmtType guarInsurPlcyDedctAmt;
    @XmlElement(name = "GuarInsurPlcyAmt")
    protected InsurPlcyAmtType guarInsurPlcyAmt;
    @XmlElement(name = "GuarInsurPlcyTerm")
    protected TermCntType guarInsurPlcyTerm;
    @XmlElement(name = "GuarInsurPlcyTermUnits")
    protected TermUnitsType guarInsurPlcyTermUnits;
    @XmlElement(name = "GuarCollatLienAmt")
    protected CollatLienAmtType guarCollatLienAmt;
    @XmlElement(name = "GuarCollatHolderName")
    protected PersonNameCType guarCollatHolderName;
    @XmlElement(name = "GuarCollatHolderAddr")
    protected AddrCType guarCollatHolderAddr;
    @XmlElement(name = "GuarCollatNonApplicant")
    protected CollatNonApplicantType guarCollatNonApplicant;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the guarLegalName property.
     * 
     * @return
     *     possible object is
     *     {@link LegalNameType }
     *     
     */
    public LegalNameType getGuarLegalName() {
        return guarLegalName;
    }

    /**
     * Sets the value of the guarLegalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalNameType }
     *     
     */
    public void setGuarLegalName(LegalNameType value) {
        this.guarLegalName = value;
    }

    /**
     * Gets the value of the guarAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getGuarAddr() {
        return guarAddr;
    }

    /**
     * Sets the value of the guarAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setGuarAddr(AddrCType value) {
        this.guarAddr = value;
    }

    /**
     * Gets the value of the guarPhone property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneInfoCType }
     *     
     */
    public PhoneInfoCType getGuarPhone() {
        return guarPhone;
    }

    /**
     * Sets the value of the guarPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneInfoCType }
     *     
     */
    public void setGuarPhone(PhoneInfoCType value) {
        this.guarPhone = value;
    }

    /**
     * Gets the value of the guarBnkRptcyYr property.
     * 
     * @return
     *     possible object is
     *     {@link GuarBnkRptcyYrType }
     *     
     */
    public GuarBnkRptcyYrType getGuarBnkRptcyYr() {
        return guarBnkRptcyYr;
    }

    /**
     * Sets the value of the guarBnkRptcyYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuarBnkRptcyYrType }
     *     
     */
    public void setGuarBnkRptcyYr(GuarBnkRptcyYrType value) {
        this.guarBnkRptcyYr = value;
    }

    /**
     * Gets the value of the guarFinStmtIncl property.
     * 
     * @return
     *     possible object is
     *     {@link GuarFinStmtInclType }
     *     
     */
    public GuarFinStmtInclType getGuarFinStmtIncl() {
        return guarFinStmtIncl;
    }

    /**
     * Sets the value of the guarFinStmtIncl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuarFinStmtInclType }
     *     
     */
    public void setGuarFinStmtIncl(GuarFinStmtInclType value) {
        this.guarFinStmtIncl = value;
    }

    /**
     * Gets the value of the guarCollatCode property.
     * 
     * @return
     *     possible object is
     *     {@link CollatCodeType }
     *     
     */
    public CollatCodeType getGuarCollatCode() {
        return guarCollatCode;
    }

    /**
     * Sets the value of the guarCollatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatCodeType }
     *     
     */
    public void setGuarCollatCode(CollatCodeType value) {
        this.guarCollatCode = value;
    }

    /**
     * Gets the value of the guarInsurPlcyCode property.
     * 
     * @return
     *     possible object is
     *     {@link InsurPlcyCodeType }
     *     
     */
    public InsurPlcyCodeType getGuarInsurPlcyCode() {
        return guarInsurPlcyCode;
    }

    /**
     * Sets the value of the guarInsurPlcyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurPlcyCodeType }
     *     
     */
    public void setGuarInsurPlcyCode(InsurPlcyCodeType value) {
        this.guarInsurPlcyCode = value;
    }

    /**
     * Gets the value of the guarInsurPlcyDedctAmt property.
     * 
     * @return
     *     possible object is
     *     {@link InsurPlcyDedctAmtType }
     *     
     */
    public InsurPlcyDedctAmtType getGuarInsurPlcyDedctAmt() {
        return guarInsurPlcyDedctAmt;
    }

    /**
     * Sets the value of the guarInsurPlcyDedctAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurPlcyDedctAmtType }
     *     
     */
    public void setGuarInsurPlcyDedctAmt(InsurPlcyDedctAmtType value) {
        this.guarInsurPlcyDedctAmt = value;
    }

    /**
     * Gets the value of the guarInsurPlcyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link InsurPlcyAmtType }
     *     
     */
    public InsurPlcyAmtType getGuarInsurPlcyAmt() {
        return guarInsurPlcyAmt;
    }

    /**
     * Sets the value of the guarInsurPlcyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurPlcyAmtType }
     *     
     */
    public void setGuarInsurPlcyAmt(InsurPlcyAmtType value) {
        this.guarInsurPlcyAmt = value;
    }

    /**
     * Gets the value of the guarInsurPlcyTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TermCntType }
     *     
     */
    public TermCntType getGuarInsurPlcyTerm() {
        return guarInsurPlcyTerm;
    }

    /**
     * Sets the value of the guarInsurPlcyTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCntType }
     *     
     */
    public void setGuarInsurPlcyTerm(TermCntType value) {
        this.guarInsurPlcyTerm = value;
    }

    /**
     * Gets the value of the guarInsurPlcyTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TermUnitsType }
     *     
     */
    public TermUnitsType getGuarInsurPlcyTermUnits() {
        return guarInsurPlcyTermUnits;
    }

    /**
     * Sets the value of the guarInsurPlcyTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermUnitsType }
     *     
     */
    public void setGuarInsurPlcyTermUnits(TermUnitsType value) {
        this.guarInsurPlcyTermUnits = value;
    }

    /**
     * Gets the value of the guarCollatLienAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollatLienAmtType }
     *     
     */
    public CollatLienAmtType getGuarCollatLienAmt() {
        return guarCollatLienAmt;
    }

    /**
     * Sets the value of the guarCollatLienAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatLienAmtType }
     *     
     */
    public void setGuarCollatLienAmt(CollatLienAmtType value) {
        this.guarCollatLienAmt = value;
    }

    /**
     * Gets the value of the guarCollatHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getGuarCollatHolderName() {
        return guarCollatHolderName;
    }

    /**
     * Sets the value of the guarCollatHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setGuarCollatHolderName(PersonNameCType value) {
        this.guarCollatHolderName = value;
    }

    /**
     * Gets the value of the guarCollatHolderAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getGuarCollatHolderAddr() {
        return guarCollatHolderAddr;
    }

    /**
     * Sets the value of the guarCollatHolderAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setGuarCollatHolderAddr(AddrCType value) {
        this.guarCollatHolderAddr = value;
    }

    /**
     * Gets the value of the guarCollatNonApplicant property.
     * 
     * @return
     *     possible object is
     *     {@link CollatNonApplicantType }
     *     
     */
    public CollatNonApplicantType getGuarCollatNonApplicant() {
        return guarCollatNonApplicant;
    }

    /**
     * Sets the value of the guarCollatNonApplicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatNonApplicantType }
     *     
     */
    public void setGuarCollatNonApplicant(CollatNonApplicantType value) {
        this.guarCollatNonApplicant = value;
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
