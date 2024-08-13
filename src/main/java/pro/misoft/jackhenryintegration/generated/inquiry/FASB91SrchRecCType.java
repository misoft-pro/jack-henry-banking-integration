
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
 * <p>Java class for FASB91SrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FASB91SrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="FASB91AcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91AcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxId" type="{http://jackhenry.com/jxchange/TPG/2008}TaxId_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91InfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91InfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="FASB91TypeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91TypeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91AmrtzDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91AmrtzDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91AmrtzSoldDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91AmrtzSoldDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91OddDayDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91OddDayDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91GLProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91ProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FASB91GroupDesc" type="{http://jackhenry.com/jxchange/TPG/2008}GroupDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomFASB91SrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="FASB91Key" type="{http://jackhenry.com/jxchange/TPG/2008}FASB91Key_Type" minOccurs="0"/&gt;
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
@XmlType(name = "FASB91SrchRec_CType", propOrder = {
    "personName",
    "fasb91AcctId",
    "fasb91AcctType",
    "custId",
    "taxId",
    "fasb91InfoRec",
    "fasb91TypeDesc",
    "fasb91AmrtzDesc",
    "fasb91AmrtzSoldDesc",
    "fasb91OddDayDesc",
    "fasb91BrDesc",
    "fasb91GLProdDesc",
    "fasb91ProdDesc",
    "fasb91GroupDesc",
    "customFASB91SrchRec",
    "ver1",
    "fasb91Key",
    "ver2",
    "any"
})
public class FASB91SrchRecCType {

    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "FASB91AcctId")
    protected AcctIdType fasb91AcctId;
    @XmlElement(name = "FASB91AcctType")
    protected AcctTypeType fasb91AcctType;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "TaxId")
    protected TaxIdType taxId;
    @XmlElement(name = "FASB91InfoRec")
    protected FASB91InfoRecCType fasb91InfoRec;
    @XmlElement(name = "FASB91TypeDesc")
    protected FASB91TypeDescType fasb91TypeDesc;
    @XmlElement(name = "FASB91AmrtzDesc")
    protected FASB91AmrtzDescType fasb91AmrtzDesc;
    @XmlElement(name = "FASB91AmrtzSoldDesc")
    protected FASB91AmrtzSoldDescType fasb91AmrtzSoldDesc;
    @XmlElement(name = "FASB91OddDayDesc")
    protected FASB91OddDayDescType fasb91OddDayDesc;
    @XmlElement(name = "FASB91BrDesc")
    protected BrDescType fasb91BrDesc;
    @XmlElement(name = "FASB91GLProdDesc")
    protected GLProdDescType fasb91GLProdDesc;
    @XmlElement(name = "FASB91ProdDesc")
    protected ProdDescType fasb91ProdDesc;
    @XmlElement(name = "FASB91GroupDesc")
    protected GroupDescType fasb91GroupDesc;
    @XmlElement(name = "CustomFASB91SrchRec")
    protected CustomCType customFASB91SrchRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "FASB91Key")
    protected FASB91KeyType fasb91Key;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the fasb91AcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getFASB91AcctId() {
        return fasb91AcctId;
    }

    /**
     * Sets the value of the fasb91AcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setFASB91AcctId(AcctIdType value) {
        this.fasb91AcctId = value;
    }

    /**
     * Gets the value of the fasb91AcctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getFASB91AcctType() {
        return fasb91AcctType;
    }

    /**
     * Sets the value of the fasb91AcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setFASB91AcctType(AcctTypeType value) {
        this.fasb91AcctType = value;
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
     * Gets the value of the taxId property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdType }
     *     
     */
    public TaxIdType getTaxId() {
        return taxId;
    }

    /**
     * Sets the value of the taxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdType }
     *     
     */
    public void setTaxId(TaxIdType value) {
        this.taxId = value;
    }

    /**
     * Gets the value of the fasb91InfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link FASB91InfoRecCType }
     *     
     */
    public FASB91InfoRecCType getFASB91InfoRec() {
        return fasb91InfoRec;
    }

    /**
     * Sets the value of the fasb91InfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link FASB91InfoRecCType }
     *     
     */
    public void setFASB91InfoRec(FASB91InfoRecCType value) {
        this.fasb91InfoRec = value;
    }

    /**
     * Gets the value of the fasb91TypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FASB91TypeDescType }
     *     
     */
    public FASB91TypeDescType getFASB91TypeDesc() {
        return fasb91TypeDesc;
    }

    /**
     * Sets the value of the fasb91TypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FASB91TypeDescType }
     *     
     */
    public void setFASB91TypeDesc(FASB91TypeDescType value) {
        this.fasb91TypeDesc = value;
    }

    /**
     * Gets the value of the fasb91AmrtzDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FASB91AmrtzDescType }
     *     
     */
    public FASB91AmrtzDescType getFASB91AmrtzDesc() {
        return fasb91AmrtzDesc;
    }

    /**
     * Sets the value of the fasb91AmrtzDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FASB91AmrtzDescType }
     *     
     */
    public void setFASB91AmrtzDesc(FASB91AmrtzDescType value) {
        this.fasb91AmrtzDesc = value;
    }

    /**
     * Gets the value of the fasb91AmrtzSoldDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FASB91AmrtzSoldDescType }
     *     
     */
    public FASB91AmrtzSoldDescType getFASB91AmrtzSoldDesc() {
        return fasb91AmrtzSoldDesc;
    }

    /**
     * Sets the value of the fasb91AmrtzSoldDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FASB91AmrtzSoldDescType }
     *     
     */
    public void setFASB91AmrtzSoldDesc(FASB91AmrtzSoldDescType value) {
        this.fasb91AmrtzSoldDesc = value;
    }

    /**
     * Gets the value of the fasb91OddDayDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FASB91OddDayDescType }
     *     
     */
    public FASB91OddDayDescType getFASB91OddDayDesc() {
        return fasb91OddDayDesc;
    }

    /**
     * Sets the value of the fasb91OddDayDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FASB91OddDayDescType }
     *     
     */
    public void setFASB91OddDayDesc(FASB91OddDayDescType value) {
        this.fasb91OddDayDesc = value;
    }

    /**
     * Gets the value of the fasb91BrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrDescType }
     *     
     */
    public BrDescType getFASB91BrDesc() {
        return fasb91BrDesc;
    }

    /**
     * Sets the value of the fasb91BrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrDescType }
     *     
     */
    public void setFASB91BrDesc(BrDescType value) {
        this.fasb91BrDesc = value;
    }

    /**
     * Gets the value of the fasb91GLProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link GLProdDescType }
     *     
     */
    public GLProdDescType getFASB91GLProdDesc() {
        return fasb91GLProdDesc;
    }

    /**
     * Sets the value of the fasb91GLProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLProdDescType }
     *     
     */
    public void setFASB91GLProdDesc(GLProdDescType value) {
        this.fasb91GLProdDesc = value;
    }

    /**
     * Gets the value of the fasb91ProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ProdDescType }
     *     
     */
    public ProdDescType getFASB91ProdDesc() {
        return fasb91ProdDesc;
    }

    /**
     * Sets the value of the fasb91ProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdDescType }
     *     
     */
    public void setFASB91ProdDesc(ProdDescType value) {
        this.fasb91ProdDesc = value;
    }

    /**
     * Gets the value of the fasb91GroupDesc property.
     * 
     * @return
     *     possible object is
     *     {@link GroupDescType }
     *     
     */
    public GroupDescType getFASB91GroupDesc() {
        return fasb91GroupDesc;
    }

    /**
     * Sets the value of the fasb91GroupDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupDescType }
     *     
     */
    public void setFASB91GroupDesc(GroupDescType value) {
        this.fasb91GroupDesc = value;
    }

    /**
     * Gets the value of the customFASB91SrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomFASB91SrchRec() {
        return customFASB91SrchRec;
    }

    /**
     * Sets the value of the customFASB91SrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomFASB91SrchRec(CustomCType value) {
        this.customFASB91SrchRec = value;
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
     * Gets the value of the fasb91Key property.
     * 
     * @return
     *     possible object is
     *     {@link FASB91KeyType }
     *     
     */
    public FASB91KeyType getFASB91Key() {
        return fasb91Key;
    }

    /**
     * Sets the value of the fasb91Key property.
     * 
     * @param value
     *     allowed object is
     *     {@link FASB91KeyType }
     *     
     */
    public void setFASB91Key(FASB91KeyType value) {
        this.fasb91Key = value;
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
