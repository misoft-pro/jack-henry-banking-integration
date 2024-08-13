
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for BorwInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BorwInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BorwInfoTxt" type="{http://jackhenry.com/jxchange/TPG/2008}BorwInfoTxt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwAdviceCode" type="{http://jackhenry.com/jxchange/TPG/2008}BorwAdviceCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwAdviceDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BorwAdviceDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwAdviceFormatCode" type="{http://jackhenry.com/jxchange/TPG/2008}BorwAdviceFormatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwAdviceFormatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BorwAdviceFormatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwAge" type="{http://jackhenry.com/jxchange/TPG/2008}BorwAge_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwRaceCode" type="{http://jackhenry.com/jxchange/TPG/2008}BorwRaceCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwRaceDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BorwRaceDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwBirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BorwBirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwEthnicCode" type="{http://jackhenry.com/jxchange/TPG/2008}BorwEthnicCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwEthnicDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BorwEthnicDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwFICOId" type="{http://jackhenry.com/jxchange/TPG/2008}BorwFICOId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwIncmAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BorwIncmAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwSelfEmpl" type="{http://jackhenry.com/jxchange/TPG/2008}BorwSelfEmpl_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwGender" type="{http://jackhenry.com/jxchange/TPG/2008}BorwGender_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="BorwCrScoreId" type="{http://jackhenry.com/jxchange/TPG/2008}CrScoreId_Type" minOccurs="0"/&gt;
 *           &lt;element name="BorwCrScoreCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrScoreCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="BorwCrScoreDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrScoreDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="AddlBorwRaceArray" type="{http://jackhenry.com/jxchange/TPG/2008}BorwRaceArray_AType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
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
@XmlType(name = "BorwInfo_CType", propOrder = {
    "borwInfoTxt",
    "borwAdviceCode",
    "borwAdviceDesc",
    "borwAdviceFormatCode",
    "borwAdviceFormatDesc",
    "borwAge",
    "borwRaceCode",
    "borwRaceDesc",
    "borwBirthDt",
    "borwEthnicCode",
    "borwEthnicDesc",
    "borwFICOId",
    "borwIncmAmt",
    "borwSelfEmpl",
    "borwGender",
    "ver1",
    "borwCrScoreId",
    "borwCrScoreCode",
    "borwCrScoreDesc",
    "ver2",
    "addlBorwRaceArray",
    "ver3",
    "any"
})
public class BorwInfoCType {

    @XmlElementRef(name = "BorwInfoTxt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwInfoTxtType> borwInfoTxt;
    @XmlElementRef(name = "BorwAdviceCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwAdviceCodeType> borwAdviceCode;
    @XmlElementRef(name = "BorwAdviceDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwAdviceDescType> borwAdviceDesc;
    @XmlElementRef(name = "BorwAdviceFormatCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwAdviceFormatCodeType> borwAdviceFormatCode;
    @XmlElementRef(name = "BorwAdviceFormatDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwAdviceFormatDescType> borwAdviceFormatDesc;
    @XmlElementRef(name = "BorwAge", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwAgeType> borwAge;
    @XmlElementRef(name = "BorwRaceCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwRaceCodeType> borwRaceCode;
    @XmlElementRef(name = "BorwRaceDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwRaceDescType> borwRaceDesc;
    @XmlElementRef(name = "BorwBirthDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwBirthDtType> borwBirthDt;
    @XmlElementRef(name = "BorwEthnicCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwEthnicCodeType> borwEthnicCode;
    @XmlElementRef(name = "BorwEthnicDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwEthnicDescType> borwEthnicDesc;
    @XmlElementRef(name = "BorwFICOId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwFICOIdType> borwFICOId;
    @XmlElementRef(name = "BorwIncmAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwIncmAmtType> borwIncmAmt;
    @XmlElementRef(name = "BorwSelfEmpl", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwSelfEmplType> borwSelfEmpl;
    @XmlElementRef(name = "BorwGender", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BorwGenderType> borwGender;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "BorwCrScoreId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrScoreIdType> borwCrScoreId;
    @XmlElementRef(name = "BorwCrScoreCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrScoreCodeType> borwCrScoreCode;
    @XmlElementRef(name = "BorwCrScoreDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CrScoreDescType> borwCrScoreDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "AddlBorwRaceArray")
    protected BorwRaceArrayAType addlBorwRaceArray;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the borwInfoTxt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwInfoTxtType }{@code >}
     *     
     */
    public JAXBElement<BorwInfoTxtType> getBorwInfoTxt() {
        return borwInfoTxt;
    }

    /**
     * Sets the value of the borwInfoTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwInfoTxtType }{@code >}
     *     
     */
    public void setBorwInfoTxt(JAXBElement<BorwInfoTxtType> value) {
        this.borwInfoTxt = value;
    }

    /**
     * Gets the value of the borwAdviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwAdviceCodeType }{@code >}
     *     
     */
    public JAXBElement<BorwAdviceCodeType> getBorwAdviceCode() {
        return borwAdviceCode;
    }

    /**
     * Sets the value of the borwAdviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwAdviceCodeType }{@code >}
     *     
     */
    public void setBorwAdviceCode(JAXBElement<BorwAdviceCodeType> value) {
        this.borwAdviceCode = value;
    }

    /**
     * Gets the value of the borwAdviceDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwAdviceDescType }{@code >}
     *     
     */
    public JAXBElement<BorwAdviceDescType> getBorwAdviceDesc() {
        return borwAdviceDesc;
    }

    /**
     * Sets the value of the borwAdviceDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwAdviceDescType }{@code >}
     *     
     */
    public void setBorwAdviceDesc(JAXBElement<BorwAdviceDescType> value) {
        this.borwAdviceDesc = value;
    }

    /**
     * Gets the value of the borwAdviceFormatCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwAdviceFormatCodeType }{@code >}
     *     
     */
    public JAXBElement<BorwAdviceFormatCodeType> getBorwAdviceFormatCode() {
        return borwAdviceFormatCode;
    }

    /**
     * Sets the value of the borwAdviceFormatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwAdviceFormatCodeType }{@code >}
     *     
     */
    public void setBorwAdviceFormatCode(JAXBElement<BorwAdviceFormatCodeType> value) {
        this.borwAdviceFormatCode = value;
    }

    /**
     * Gets the value of the borwAdviceFormatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwAdviceFormatDescType }{@code >}
     *     
     */
    public JAXBElement<BorwAdviceFormatDescType> getBorwAdviceFormatDesc() {
        return borwAdviceFormatDesc;
    }

    /**
     * Sets the value of the borwAdviceFormatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwAdviceFormatDescType }{@code >}
     *     
     */
    public void setBorwAdviceFormatDesc(JAXBElement<BorwAdviceFormatDescType> value) {
        this.borwAdviceFormatDesc = value;
    }

    /**
     * Gets the value of the borwAge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwAgeType }{@code >}
     *     
     */
    public JAXBElement<BorwAgeType> getBorwAge() {
        return borwAge;
    }

    /**
     * Sets the value of the borwAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwAgeType }{@code >}
     *     
     */
    public void setBorwAge(JAXBElement<BorwAgeType> value) {
        this.borwAge = value;
    }

    /**
     * Gets the value of the borwRaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwRaceCodeType }{@code >}
     *     
     */
    public JAXBElement<BorwRaceCodeType> getBorwRaceCode() {
        return borwRaceCode;
    }

    /**
     * Sets the value of the borwRaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwRaceCodeType }{@code >}
     *     
     */
    public void setBorwRaceCode(JAXBElement<BorwRaceCodeType> value) {
        this.borwRaceCode = value;
    }

    /**
     * Gets the value of the borwRaceDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwRaceDescType }{@code >}
     *     
     */
    public JAXBElement<BorwRaceDescType> getBorwRaceDesc() {
        return borwRaceDesc;
    }

    /**
     * Sets the value of the borwRaceDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwRaceDescType }{@code >}
     *     
     */
    public void setBorwRaceDesc(JAXBElement<BorwRaceDescType> value) {
        this.borwRaceDesc = value;
    }

    /**
     * Gets the value of the borwBirthDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwBirthDtType }{@code >}
     *     
     */
    public JAXBElement<BorwBirthDtType> getBorwBirthDt() {
        return borwBirthDt;
    }

    /**
     * Sets the value of the borwBirthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwBirthDtType }{@code >}
     *     
     */
    public void setBorwBirthDt(JAXBElement<BorwBirthDtType> value) {
        this.borwBirthDt = value;
    }

    /**
     * Gets the value of the borwEthnicCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwEthnicCodeType }{@code >}
     *     
     */
    public JAXBElement<BorwEthnicCodeType> getBorwEthnicCode() {
        return borwEthnicCode;
    }

    /**
     * Sets the value of the borwEthnicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwEthnicCodeType }{@code >}
     *     
     */
    public void setBorwEthnicCode(JAXBElement<BorwEthnicCodeType> value) {
        this.borwEthnicCode = value;
    }

    /**
     * Gets the value of the borwEthnicDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwEthnicDescType }{@code >}
     *     
     */
    public JAXBElement<BorwEthnicDescType> getBorwEthnicDesc() {
        return borwEthnicDesc;
    }

    /**
     * Sets the value of the borwEthnicDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwEthnicDescType }{@code >}
     *     
     */
    public void setBorwEthnicDesc(JAXBElement<BorwEthnicDescType> value) {
        this.borwEthnicDesc = value;
    }

    /**
     * Gets the value of the borwFICOId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwFICOIdType }{@code >}
     *     
     */
    public JAXBElement<BorwFICOIdType> getBorwFICOId() {
        return borwFICOId;
    }

    /**
     * Sets the value of the borwFICOId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwFICOIdType }{@code >}
     *     
     */
    public void setBorwFICOId(JAXBElement<BorwFICOIdType> value) {
        this.borwFICOId = value;
    }

    /**
     * Gets the value of the borwIncmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwIncmAmtType }{@code >}
     *     
     */
    public JAXBElement<BorwIncmAmtType> getBorwIncmAmt() {
        return borwIncmAmt;
    }

    /**
     * Sets the value of the borwIncmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwIncmAmtType }{@code >}
     *     
     */
    public void setBorwIncmAmt(JAXBElement<BorwIncmAmtType> value) {
        this.borwIncmAmt = value;
    }

    /**
     * Gets the value of the borwSelfEmpl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwSelfEmplType }{@code >}
     *     
     */
    public JAXBElement<BorwSelfEmplType> getBorwSelfEmpl() {
        return borwSelfEmpl;
    }

    /**
     * Sets the value of the borwSelfEmpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwSelfEmplType }{@code >}
     *     
     */
    public void setBorwSelfEmpl(JAXBElement<BorwSelfEmplType> value) {
        this.borwSelfEmpl = value;
    }

    /**
     * Gets the value of the borwGender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BorwGenderType }{@code >}
     *     
     */
    public JAXBElement<BorwGenderType> getBorwGender() {
        return borwGender;
    }

    /**
     * Sets the value of the borwGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BorwGenderType }{@code >}
     *     
     */
    public void setBorwGender(JAXBElement<BorwGenderType> value) {
        this.borwGender = value;
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
     * Gets the value of the borwCrScoreId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrScoreIdType }{@code >}
     *     
     */
    public JAXBElement<CrScoreIdType> getBorwCrScoreId() {
        return borwCrScoreId;
    }

    /**
     * Sets the value of the borwCrScoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrScoreIdType }{@code >}
     *     
     */
    public void setBorwCrScoreId(JAXBElement<CrScoreIdType> value) {
        this.borwCrScoreId = value;
    }

    /**
     * Gets the value of the borwCrScoreCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrScoreCodeType }{@code >}
     *     
     */
    public JAXBElement<CrScoreCodeType> getBorwCrScoreCode() {
        return borwCrScoreCode;
    }

    /**
     * Sets the value of the borwCrScoreCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrScoreCodeType }{@code >}
     *     
     */
    public void setBorwCrScoreCode(JAXBElement<CrScoreCodeType> value) {
        this.borwCrScoreCode = value;
    }

    /**
     * Gets the value of the borwCrScoreDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CrScoreDescType }{@code >}
     *     
     */
    public JAXBElement<CrScoreDescType> getBorwCrScoreDesc() {
        return borwCrScoreDesc;
    }

    /**
     * Sets the value of the borwCrScoreDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CrScoreDescType }{@code >}
     *     
     */
    public void setBorwCrScoreDesc(JAXBElement<CrScoreDescType> value) {
        this.borwCrScoreDesc = value;
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
     * Gets the value of the addlBorwRaceArray property.
     * 
     * @return
     *     possible object is
     *     {@link BorwRaceArrayAType }
     *     
     */
    public BorwRaceArrayAType getAddlBorwRaceArray() {
        return addlBorwRaceArray;
    }

    /**
     * Sets the value of the addlBorwRaceArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwRaceArrayAType }
     *     
     */
    public void setAddlBorwRaceArray(BorwRaceArrayAType value) {
        this.addlBorwRaceArray = value;
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
