
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
 * <p>Java class for PltfmCommCollatInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmCommCollatInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PurchCollatAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PurchCollatAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatValAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatValAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="NonPurchCollatAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NonPurchCollatAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NonPurchCollatCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsurPlcyCode" type="{http://jackhenry.com/jxchange/TPG/2008}InsurPlcyCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsurPlcyDedctAmt" type="{http://jackhenry.com/jxchange/TPG/2008}InsurPlcyDedctAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsurPlcyAmt" type="{http://jackhenry.com/jxchange/TPG/2008}InsurPlcyAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsurPlcyTerm" type="{http://jackhenry.com/jxchange/TPG/2008}TermCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsurPlcyTermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}TermUnits_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatLienAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatLienAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatHolderName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="CollatHolderAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="CollatNonApplicant" type="{http://jackhenry.com/jxchange/TPG/2008}CollatNonApplicant_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CollatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="LienClsf" type="{http://jackhenry.com/jxchange/TPG/2008}LienClsf_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "PltfmCommCollatInfo_CType", propOrder = {
    "purchCollatAmt",
    "collatValAmt",
    "collatCode",
    "nonPurchCollatAmt",
    "nonPurchCollatCode",
    "insurPlcyCode",
    "insurPlcyDedctAmt",
    "insurPlcyAmt",
    "insurPlcyTerm",
    "insurPlcyTermUnits",
    "collatLienAmt",
    "collatHolderName",
    "collatHolderAddr",
    "collatNonApplicant",
    "ver1",
    "collatDesc",
    "lienClsf",
    "ver2",
    "any"
})
public class PltfmCommCollatInfoCType {

    @XmlElement(name = "PurchCollatAmt")
    protected PurchCollatAmtType purchCollatAmt;
    @XmlElement(name = "CollatValAmt")
    protected CollatValAmtType collatValAmt;
    @XmlElement(name = "CollatCode")
    protected CollatCodeType collatCode;
    @XmlElement(name = "NonPurchCollatAmt")
    protected NonPurchCollatAmtType nonPurchCollatAmt;
    @XmlElement(name = "NonPurchCollatCode")
    protected CollatCodeType nonPurchCollatCode;
    @XmlElement(name = "InsurPlcyCode")
    protected InsurPlcyCodeType insurPlcyCode;
    @XmlElement(name = "InsurPlcyDedctAmt")
    protected InsurPlcyDedctAmtType insurPlcyDedctAmt;
    @XmlElement(name = "InsurPlcyAmt")
    protected InsurPlcyAmtType insurPlcyAmt;
    @XmlElement(name = "InsurPlcyTerm")
    protected TermCntType insurPlcyTerm;
    @XmlElement(name = "InsurPlcyTermUnits")
    protected TermUnitsType insurPlcyTermUnits;
    @XmlElement(name = "CollatLienAmt")
    protected CollatLienAmtType collatLienAmt;
    @XmlElement(name = "CollatHolderName")
    protected PersonNameCType collatHolderName;
    @XmlElement(name = "CollatHolderAddr")
    protected AddrCType collatHolderAddr;
    @XmlElement(name = "CollatNonApplicant")
    protected CollatNonApplicantType collatNonApplicant;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CollatDesc")
    protected CollatDescType collatDesc;
    @XmlElement(name = "LienClsf")
    protected LienClsfType lienClsf;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the purchCollatAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PurchCollatAmtType }
     *     
     */
    public PurchCollatAmtType getPurchCollatAmt() {
        return purchCollatAmt;
    }

    /**
     * Sets the value of the purchCollatAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchCollatAmtType }
     *     
     */
    public void setPurchCollatAmt(PurchCollatAmtType value) {
        this.purchCollatAmt = value;
    }

    /**
     * Gets the value of the collatValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollatValAmtType }
     *     
     */
    public CollatValAmtType getCollatValAmt() {
        return collatValAmt;
    }

    /**
     * Sets the value of the collatValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatValAmtType }
     *     
     */
    public void setCollatValAmt(CollatValAmtType value) {
        this.collatValAmt = value;
    }

    /**
     * Gets the value of the collatCode property.
     * 
     * @return
     *     possible object is
     *     {@link CollatCodeType }
     *     
     */
    public CollatCodeType getCollatCode() {
        return collatCode;
    }

    /**
     * Sets the value of the collatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatCodeType }
     *     
     */
    public void setCollatCode(CollatCodeType value) {
        this.collatCode = value;
    }

    /**
     * Gets the value of the nonPurchCollatAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NonPurchCollatAmtType }
     *     
     */
    public NonPurchCollatAmtType getNonPurchCollatAmt() {
        return nonPurchCollatAmt;
    }

    /**
     * Sets the value of the nonPurchCollatAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonPurchCollatAmtType }
     *     
     */
    public void setNonPurchCollatAmt(NonPurchCollatAmtType value) {
        this.nonPurchCollatAmt = value;
    }

    /**
     * Gets the value of the nonPurchCollatCode property.
     * 
     * @return
     *     possible object is
     *     {@link CollatCodeType }
     *     
     */
    public CollatCodeType getNonPurchCollatCode() {
        return nonPurchCollatCode;
    }

    /**
     * Sets the value of the nonPurchCollatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatCodeType }
     *     
     */
    public void setNonPurchCollatCode(CollatCodeType value) {
        this.nonPurchCollatCode = value;
    }

    /**
     * Gets the value of the insurPlcyCode property.
     * 
     * @return
     *     possible object is
     *     {@link InsurPlcyCodeType }
     *     
     */
    public InsurPlcyCodeType getInsurPlcyCode() {
        return insurPlcyCode;
    }

    /**
     * Sets the value of the insurPlcyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurPlcyCodeType }
     *     
     */
    public void setInsurPlcyCode(InsurPlcyCodeType value) {
        this.insurPlcyCode = value;
    }

    /**
     * Gets the value of the insurPlcyDedctAmt property.
     * 
     * @return
     *     possible object is
     *     {@link InsurPlcyDedctAmtType }
     *     
     */
    public InsurPlcyDedctAmtType getInsurPlcyDedctAmt() {
        return insurPlcyDedctAmt;
    }

    /**
     * Sets the value of the insurPlcyDedctAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurPlcyDedctAmtType }
     *     
     */
    public void setInsurPlcyDedctAmt(InsurPlcyDedctAmtType value) {
        this.insurPlcyDedctAmt = value;
    }

    /**
     * Gets the value of the insurPlcyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link InsurPlcyAmtType }
     *     
     */
    public InsurPlcyAmtType getInsurPlcyAmt() {
        return insurPlcyAmt;
    }

    /**
     * Sets the value of the insurPlcyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurPlcyAmtType }
     *     
     */
    public void setInsurPlcyAmt(InsurPlcyAmtType value) {
        this.insurPlcyAmt = value;
    }

    /**
     * Gets the value of the insurPlcyTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TermCntType }
     *     
     */
    public TermCntType getInsurPlcyTerm() {
        return insurPlcyTerm;
    }

    /**
     * Sets the value of the insurPlcyTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCntType }
     *     
     */
    public void setInsurPlcyTerm(TermCntType value) {
        this.insurPlcyTerm = value;
    }

    /**
     * Gets the value of the insurPlcyTermUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TermUnitsType }
     *     
     */
    public TermUnitsType getInsurPlcyTermUnits() {
        return insurPlcyTermUnits;
    }

    /**
     * Sets the value of the insurPlcyTermUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermUnitsType }
     *     
     */
    public void setInsurPlcyTermUnits(TermUnitsType value) {
        this.insurPlcyTermUnits = value;
    }

    /**
     * Gets the value of the collatLienAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollatLienAmtType }
     *     
     */
    public CollatLienAmtType getCollatLienAmt() {
        return collatLienAmt;
    }

    /**
     * Sets the value of the collatLienAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatLienAmtType }
     *     
     */
    public void setCollatLienAmt(CollatLienAmtType value) {
        this.collatLienAmt = value;
    }

    /**
     * Gets the value of the collatHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getCollatHolderName() {
        return collatHolderName;
    }

    /**
     * Sets the value of the collatHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setCollatHolderName(PersonNameCType value) {
        this.collatHolderName = value;
    }

    /**
     * Gets the value of the collatHolderAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getCollatHolderAddr() {
        return collatHolderAddr;
    }

    /**
     * Sets the value of the collatHolderAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setCollatHolderAddr(AddrCType value) {
        this.collatHolderAddr = value;
    }

    /**
     * Gets the value of the collatNonApplicant property.
     * 
     * @return
     *     possible object is
     *     {@link CollatNonApplicantType }
     *     
     */
    public CollatNonApplicantType getCollatNonApplicant() {
        return collatNonApplicant;
    }

    /**
     * Sets the value of the collatNonApplicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatNonApplicantType }
     *     
     */
    public void setCollatNonApplicant(CollatNonApplicantType value) {
        this.collatNonApplicant = value;
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
     * Gets the value of the lienClsf property.
     * 
     * @return
     *     possible object is
     *     {@link LienClsfType }
     *     
     */
    public LienClsfType getLienClsf() {
        return lienClsf;
    }

    /**
     * Sets the value of the lienClsf property.
     * 
     * @param value
     *     allowed object is
     *     {@link LienClsfType }
     *     
     */
    public void setLienClsf(LienClsfType value) {
        this.lienClsf = value;
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
