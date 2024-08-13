
package pro.misoft.jackhenryintegration.generated.inquiry;

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
 * <p>Java class for ACHCompInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHCompInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHCompId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompEntryDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompEntryDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHStdEntryClass" type="{http://jackhenry.com/jxchange/TPG/2008}ACHStdEntryClass_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompDiscrData" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompDiscrData_Type" minOccurs="0"/&gt;
 *         &lt;element name="AlwACHOrgType" type="{http://jackhenry.com/jxchange/TPG/2008}AlwACHOrgType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SttlOrgEffDtType" type="{http://jackhenry.com/jxchange/TPG/2008}SttlOrgEffDtType_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntnetFinInstOffsetType" type="{http://jackhenry.com/jxchange/TPG/2008}IntnetFinInstOffsetType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHOrgDlyLmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHOrgDlyLmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHReqOnUsCnt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHReqOnUsCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHReqOnUsPct" type="{http://jackhenry.com/jxchange/TPG/2008}ACHReqOnUsPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AdvSttlDays" type="{http://jackhenry.com/jxchange/TPG/2008}AdvSttlDays_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *             &lt;element name="ACHTempExpsrArray" type="{http://jackhenry.com/jxchange/TPG/2008}ACHTempExpsrArray_AType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="AcctOffsetArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctOffsetArray_AType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="DrDlyLmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHOrgDlyLmtAmt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="CrDlyLmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHOrgDlyLmtAmt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="ACHExpsrArray" type="{http://jackhenry.com/jxchange/TPG/2008}ACHExpsrArray_AType" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/sequence&gt;
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
@XmlType(name = "ACHCompInfo_CType", propOrder = {
    "achCompId",
    "achCompEntryDesc",
    "achStdEntryClass",
    "achCompDiscrData",
    "alwACHOrgType",
    "sttlOrgEffDtType",
    "intnetFinInstOffsetType",
    "achOrgDlyLmtAmt",
    "achReqOnUsCnt",
    "achReqOnUsPct",
    "custom",
    "ver1",
    "advSttlDays",
    "ver2",
    "achTempExpsrArray",
    "ver3",
    "acctOffsetArray",
    "ver4",
    "drDlyLmtAmt",
    "crDlyLmtAmt",
    "achExpsrArray",
    "ver5",
    "any"
})
public class ACHCompInfoCType {

    @XmlElement(name = "ACHCompId")
    protected ACHCompIdType achCompId;
    @XmlElement(name = "ACHCompEntryDesc")
    protected ACHCompEntryDescType achCompEntryDesc;
    @XmlElement(name = "ACHStdEntryClass")
    protected ACHStdEntryClassType achStdEntryClass;
    @XmlElement(name = "ACHCompDiscrData")
    protected ACHCompDiscrDataType achCompDiscrData;
    @XmlElement(name = "AlwACHOrgType")
    protected AlwACHOrgTypeType alwACHOrgType;
    @XmlElement(name = "SttlOrgEffDtType")
    protected SttlOrgEffDtTypeType sttlOrgEffDtType;
    @XmlElement(name = "IntnetFinInstOffsetType")
    protected IntnetFinInstOffsetTypeType intnetFinInstOffsetType;
    @XmlElement(name = "ACHOrgDlyLmtAmt")
    protected ACHOrgDlyLmtAmtType achOrgDlyLmtAmt;
    @XmlElement(name = "ACHReqOnUsCnt")
    protected ACHReqOnUsCntType achReqOnUsCnt;
    @XmlElement(name = "ACHReqOnUsPct")
    protected ACHReqOnUsPctType achReqOnUsPct;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AdvSttlDays")
    protected AdvSttlDaysType advSttlDays;
    @XmlElement(name = "Ver_2")
    protected Ver1CType ver2;
    @XmlElement(name = "ACHTempExpsrArray")
    protected ACHTempExpsrArrayAType achTempExpsrArray;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "AcctOffsetArray")
    protected AcctOffsetArrayAType acctOffsetArray;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "DrDlyLmtAmt")
    protected ACHOrgDlyLmtAmtType drDlyLmtAmt;
    @XmlElement(name = "CrDlyLmtAmt")
    protected ACHOrgDlyLmtAmtType crDlyLmtAmt;
    @XmlElement(name = "ACHExpsrArray")
    protected ACHExpsrArrayAType achExpsrArray;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the achCompId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCompIdType }
     *     
     */
    public ACHCompIdType getACHCompId() {
        return achCompId;
    }

    /**
     * Sets the value of the achCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCompIdType }
     *     
     */
    public void setACHCompId(ACHCompIdType value) {
        this.achCompId = value;
    }

    /**
     * Gets the value of the achCompEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCompEntryDescType }
     *     
     */
    public ACHCompEntryDescType getACHCompEntryDesc() {
        return achCompEntryDesc;
    }

    /**
     * Sets the value of the achCompEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCompEntryDescType }
     *     
     */
    public void setACHCompEntryDesc(ACHCompEntryDescType value) {
        this.achCompEntryDesc = value;
    }

    /**
     * Gets the value of the achStdEntryClass property.
     * 
     * @return
     *     possible object is
     *     {@link ACHStdEntryClassType }
     *     
     */
    public ACHStdEntryClassType getACHStdEntryClass() {
        return achStdEntryClass;
    }

    /**
     * Sets the value of the achStdEntryClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHStdEntryClassType }
     *     
     */
    public void setACHStdEntryClass(ACHStdEntryClassType value) {
        this.achStdEntryClass = value;
    }

    /**
     * Gets the value of the achCompDiscrData property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCompDiscrDataType }
     *     
     */
    public ACHCompDiscrDataType getACHCompDiscrData() {
        return achCompDiscrData;
    }

    /**
     * Sets the value of the achCompDiscrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCompDiscrDataType }
     *     
     */
    public void setACHCompDiscrData(ACHCompDiscrDataType value) {
        this.achCompDiscrData = value;
    }

    /**
     * Gets the value of the alwACHOrgType property.
     * 
     * @return
     *     possible object is
     *     {@link AlwACHOrgTypeType }
     *     
     */
    public AlwACHOrgTypeType getAlwACHOrgType() {
        return alwACHOrgType;
    }

    /**
     * Sets the value of the alwACHOrgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlwACHOrgTypeType }
     *     
     */
    public void setAlwACHOrgType(AlwACHOrgTypeType value) {
        this.alwACHOrgType = value;
    }

    /**
     * Gets the value of the sttlOrgEffDtType property.
     * 
     * @return
     *     possible object is
     *     {@link SttlOrgEffDtTypeType }
     *     
     */
    public SttlOrgEffDtTypeType getSttlOrgEffDtType() {
        return sttlOrgEffDtType;
    }

    /**
     * Sets the value of the sttlOrgEffDtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SttlOrgEffDtTypeType }
     *     
     */
    public void setSttlOrgEffDtType(SttlOrgEffDtTypeType value) {
        this.sttlOrgEffDtType = value;
    }

    /**
     * Gets the value of the intnetFinInstOffsetType property.
     * 
     * @return
     *     possible object is
     *     {@link IntnetFinInstOffsetTypeType }
     *     
     */
    public IntnetFinInstOffsetTypeType getIntnetFinInstOffsetType() {
        return intnetFinInstOffsetType;
    }

    /**
     * Sets the value of the intnetFinInstOffsetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntnetFinInstOffsetTypeType }
     *     
     */
    public void setIntnetFinInstOffsetType(IntnetFinInstOffsetTypeType value) {
        this.intnetFinInstOffsetType = value;
    }

    /**
     * Gets the value of the achOrgDlyLmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ACHOrgDlyLmtAmtType }
     *     
     */
    public ACHOrgDlyLmtAmtType getACHOrgDlyLmtAmt() {
        return achOrgDlyLmtAmt;
    }

    /**
     * Sets the value of the achOrgDlyLmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHOrgDlyLmtAmtType }
     *     
     */
    public void setACHOrgDlyLmtAmt(ACHOrgDlyLmtAmtType value) {
        this.achOrgDlyLmtAmt = value;
    }

    /**
     * Gets the value of the achReqOnUsCnt property.
     * 
     * @return
     *     possible object is
     *     {@link ACHReqOnUsCntType }
     *     
     */
    public ACHReqOnUsCntType getACHReqOnUsCnt() {
        return achReqOnUsCnt;
    }

    /**
     * Sets the value of the achReqOnUsCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHReqOnUsCntType }
     *     
     */
    public void setACHReqOnUsCnt(ACHReqOnUsCntType value) {
        this.achReqOnUsCnt = value;
    }

    /**
     * Gets the value of the achReqOnUsPct property.
     * 
     * @return
     *     possible object is
     *     {@link ACHReqOnUsPctType }
     *     
     */
    public ACHReqOnUsPctType getACHReqOnUsPct() {
        return achReqOnUsPct;
    }

    /**
     * Sets the value of the achReqOnUsPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHReqOnUsPctType }
     *     
     */
    public void setACHReqOnUsPct(ACHReqOnUsPctType value) {
        this.achReqOnUsPct = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public JAXBElement<CustomCType> getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomCType }{@code >}
     *     
     */
    public void setCustom(JAXBElement<CustomCType> value) {
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
     * Gets the value of the advSttlDays property.
     * 
     * @return
     *     possible object is
     *     {@link AdvSttlDaysType }
     *     
     */
    public AdvSttlDaysType getAdvSttlDays() {
        return advSttlDays;
    }

    /**
     * Sets the value of the advSttlDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvSttlDaysType }
     *     
     */
    public void setAdvSttlDays(AdvSttlDaysType value) {
        this.advSttlDays = value;
    }

    /**
     * Gets the value of the ver2 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver1CType }
     *     
     */
    public Ver1CType getVer2() {
        return ver2;
    }

    /**
     * Sets the value of the ver2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver1CType }
     *     
     */
    public void setVer2(Ver1CType value) {
        this.ver2 = value;
    }

    /**
     * Gets the value of the achTempExpsrArray property.
     * 
     * @return
     *     possible object is
     *     {@link ACHTempExpsrArrayAType }
     *     
     */
    public ACHTempExpsrArrayAType getACHTempExpsrArray() {
        return achTempExpsrArray;
    }

    /**
     * Sets the value of the achTempExpsrArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHTempExpsrArrayAType }
     *     
     */
    public void setACHTempExpsrArray(ACHTempExpsrArrayAType value) {
        this.achTempExpsrArray = value;
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
     * Gets the value of the acctOffsetArray property.
     * 
     * @return
     *     possible object is
     *     {@link AcctOffsetArrayAType }
     *     
     */
    public AcctOffsetArrayAType getAcctOffsetArray() {
        return acctOffsetArray;
    }

    /**
     * Sets the value of the acctOffsetArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctOffsetArrayAType }
     *     
     */
    public void setAcctOffsetArray(AcctOffsetArrayAType value) {
        this.acctOffsetArray = value;
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
     * Gets the value of the drDlyLmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ACHOrgDlyLmtAmtType }
     *     
     */
    public ACHOrgDlyLmtAmtType getDrDlyLmtAmt() {
        return drDlyLmtAmt;
    }

    /**
     * Sets the value of the drDlyLmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHOrgDlyLmtAmtType }
     *     
     */
    public void setDrDlyLmtAmt(ACHOrgDlyLmtAmtType value) {
        this.drDlyLmtAmt = value;
    }

    /**
     * Gets the value of the crDlyLmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ACHOrgDlyLmtAmtType }
     *     
     */
    public ACHOrgDlyLmtAmtType getCrDlyLmtAmt() {
        return crDlyLmtAmt;
    }

    /**
     * Sets the value of the crDlyLmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHOrgDlyLmtAmtType }
     *     
     */
    public void setCrDlyLmtAmt(ACHOrgDlyLmtAmtType value) {
        this.crDlyLmtAmt = value;
    }

    /**
     * Gets the value of the achExpsrArray property.
     * 
     * @return
     *     possible object is
     *     {@link ACHExpsrArrayAType }
     *     
     */
    public ACHExpsrArrayAType getACHExpsrArray() {
        return achExpsrArray;
    }

    /**
     * Sets the value of the achExpsrArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHExpsrArrayAType }
     *     
     */
    public void setACHExpsrArray(ACHExpsrArrayAType value) {
        this.achExpsrArray = value;
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

}
