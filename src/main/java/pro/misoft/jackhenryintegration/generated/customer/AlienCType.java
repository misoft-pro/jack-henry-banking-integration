
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
 * <p>Java class for Alien_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Alien_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlienLastW8Dt" type="{http://jackhenry.com/jxchange/TPG/2008}AlienLastW8Dt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ResStrAddr1" type="{http://jackhenry.com/jxchange/TPG/2008}ResStrAddr1_Type" minOccurs="0"/&gt;
 *         &lt;element name="ResStrAddr2" type="{http://jackhenry.com/jxchange/TPG/2008}ResStrAddr2_Type" minOccurs="0"/&gt;
 *         &lt;element name="ResCity" type="{http://jackhenry.com/jxchange/TPG/2008}ResCity_Type" minOccurs="0"/&gt;
 *         &lt;element name="ResStateProv" type="{http://jackhenry.com/jxchange/TPG/2008}ResStateProv_Type" minOccurs="0"/&gt;
 *         &lt;element name="ResPostalCode" type="{http://jackhenry.com/jxchange/TPG/2008}ResPostalCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ResCntry" type="{http://jackhenry.com/jxchange/TPG/2008}ResCntry_Type" minOccurs="0"/&gt;
 *         &lt;element name="ResCntryType" type="{http://jackhenry.com/jxchange/TPG/2008}ResCntryType_Type" minOccurs="0"/&gt;
 *         &lt;element name="IRSExmpCode" type="{http://jackhenry.com/jxchange/TPG/2008}IRSExmpCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IRSExmpDesc" type="{http://jackhenry.com/jxchange/TPG/2008}IRSExmpDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="IRSRecipCode" type="{http://jackhenry.com/jxchange/TPG/2008}IRSRecipCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="IRSRecipDesc" type="{http://jackhenry.com/jxchange/TPG/2008}IRSRecipDesc_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AlienTypeCode" type="{http://jackhenry.com/jxchange/TPG/2008}AlienTypeCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="AlienTypeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AlienTypeDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="AlienW8Type" type="{http://jackhenry.com/jxchange/TPG/2008}AlienW8Type_Type" minOccurs="0"/&gt;
 *             &lt;element name="AlienW8Stat" type="{http://jackhenry.com/jxchange/TPG/2008}AlienW8Stat_Type" minOccurs="0"/&gt;
 *             &lt;element name="AlienW8StatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AlienW8StatDesc_Type" minOccurs="0"/&gt;
 *             &lt;element name="AlienW8ExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}AlienW8ExpDt_Type" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *             &lt;element name="FornTaxId" type="{http://jackhenry.com/jxchange/TPG/2008}FornTaxId_Type" minOccurs="0"/&gt;
 *             &lt;element name="CitzCntryType" type="{http://jackhenry.com/jxchange/TPG/2008}CitzCntryType_Type" minOccurs="0"/&gt;
 *             &lt;element name="GIINId" type="{http://jackhenry.com/jxchange/TPG/2008}GIINId_Type" minOccurs="0"/&gt;
 *             &lt;element name="GIINDt" type="{http://jackhenry.com/jxchange/TPG/2008}GIINDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="GIINCertDt" type="{http://jackhenry.com/jxchange/TPG/2008}GIINCertDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="RptChapArray" type="{http://jackhenry.com/jxchange/TPG/2008}RptChapArray_AType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *               &lt;element name="AlienIRSRptType" type="{http://jackhenry.com/jxchange/TPG/2008}AlienIRSRptType_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "Alien_CType", propOrder = {
    "alienLastW8Dt",
    "resStrAddr1",
    "resStrAddr2",
    "resCity",
    "resStateProv",
    "resPostalCode",
    "resCntry",
    "resCntryType",
    "irsExmpCode",
    "irsExmpDesc",
    "irsRecipCode",
    "irsRecipDesc",
    "ver1",
    "alienTypeCode",
    "alienTypeDesc",
    "ver2",
    "alienW8Type",
    "alienW8Stat",
    "alienW8StatDesc",
    "alienW8ExpDt",
    "ver3",
    "fornTaxId",
    "citzCntryType",
    "giinId",
    "giinDt",
    "giinCertDt",
    "rptChapArray",
    "ver4",
    "alienIRSRptType",
    "ver5",
    "any"
})
public class AlienCType {

    @XmlElementRef(name = "AlienLastW8Dt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AlienLastW8DtType> alienLastW8Dt;
    @XmlElementRef(name = "ResStrAddr1", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ResStrAddr1Type> resStrAddr1;
    @XmlElementRef(name = "ResStrAddr2", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ResStrAddr2Type> resStrAddr2;
    @XmlElementRef(name = "ResCity", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ResCityType> resCity;
    @XmlElementRef(name = "ResStateProv", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ResStateProvType> resStateProv;
    @XmlElementRef(name = "ResPostalCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ResPostalCodeType> resPostalCode;
    @XmlElementRef(name = "ResCntry", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ResCntryType> resCntry;
    @XmlElementRef(name = "ResCntryType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ResCntryTypeType> resCntryType;
    @XmlElementRef(name = "IRSExmpCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IRSExmpCodeType> irsExmpCode;
    @XmlElementRef(name = "IRSExmpDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IRSExmpDescType> irsExmpDesc;
    @XmlElementRef(name = "IRSRecipCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IRSRecipCodeType> irsRecipCode;
    @XmlElementRef(name = "IRSRecipDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IRSRecipDescType> irsRecipDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "AlienTypeCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AlienTypeCodeType> alienTypeCode;
    @XmlElement(name = "AlienTypeDesc")
    protected AlienTypeDescType alienTypeDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "AlienW8Type", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AlienW8TypeType> alienW8Type;
    @XmlElementRef(name = "AlienW8Stat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AlienW8StatType> alienW8Stat;
    @XmlElement(name = "AlienW8StatDesc")
    protected AlienW8StatDescType alienW8StatDesc;
    @XmlElementRef(name = "AlienW8ExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AlienW8ExpDtType> alienW8ExpDt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "FornTaxId")
    protected FornTaxIdType fornTaxId;
    @XmlElement(name = "CitzCntryType")
    protected CitzCntryTypeType citzCntryType;
    @XmlElement(name = "GIINId")
    protected GIINIdType giinId;
    @XmlElement(name = "GIINDt")
    protected GIINDtType giinDt;
    @XmlElement(name = "GIINCertDt")
    protected GIINCertDtType giinCertDt;
    @XmlElement(name = "RptChapArray")
    protected RptChapArrayAType rptChapArray;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "AlienIRSRptType")
    protected AlienIRSRptTypeType alienIRSRptType;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the alienLastW8Dt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlienLastW8DtType }{@code >}
     *     
     */
    public JAXBElement<AlienLastW8DtType> getAlienLastW8Dt() {
        return alienLastW8Dt;
    }

    /**
     * Sets the value of the alienLastW8Dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlienLastW8DtType }{@code >}
     *     
     */
    public void setAlienLastW8Dt(JAXBElement<AlienLastW8DtType> value) {
        this.alienLastW8Dt = value;
    }

    /**
     * Gets the value of the resStrAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResStrAddr1Type }{@code >}
     *     
     */
    public JAXBElement<ResStrAddr1Type> getResStrAddr1() {
        return resStrAddr1;
    }

    /**
     * Sets the value of the resStrAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResStrAddr1Type }{@code >}
     *     
     */
    public void setResStrAddr1(JAXBElement<ResStrAddr1Type> value) {
        this.resStrAddr1 = value;
    }

    /**
     * Gets the value of the resStrAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResStrAddr2Type }{@code >}
     *     
     */
    public JAXBElement<ResStrAddr2Type> getResStrAddr2() {
        return resStrAddr2;
    }

    /**
     * Sets the value of the resStrAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResStrAddr2Type }{@code >}
     *     
     */
    public void setResStrAddr2(JAXBElement<ResStrAddr2Type> value) {
        this.resStrAddr2 = value;
    }

    /**
     * Gets the value of the resCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResCityType }{@code >}
     *     
     */
    public JAXBElement<ResCityType> getResCity() {
        return resCity;
    }

    /**
     * Sets the value of the resCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResCityType }{@code >}
     *     
     */
    public void setResCity(JAXBElement<ResCityType> value) {
        this.resCity = value;
    }

    /**
     * Gets the value of the resStateProv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResStateProvType }{@code >}
     *     
     */
    public JAXBElement<ResStateProvType> getResStateProv() {
        return resStateProv;
    }

    /**
     * Sets the value of the resStateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResStateProvType }{@code >}
     *     
     */
    public void setResStateProv(JAXBElement<ResStateProvType> value) {
        this.resStateProv = value;
    }

    /**
     * Gets the value of the resPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResPostalCodeType }{@code >}
     *     
     */
    public JAXBElement<ResPostalCodeType> getResPostalCode() {
        return resPostalCode;
    }

    /**
     * Sets the value of the resPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResPostalCodeType }{@code >}
     *     
     */
    public void setResPostalCode(JAXBElement<ResPostalCodeType> value) {
        this.resPostalCode = value;
    }

    /**
     * Gets the value of the resCntry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResCntryType }{@code >}
     *     
     */
    public JAXBElement<ResCntryType> getResCntry() {
        return resCntry;
    }

    /**
     * Sets the value of the resCntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResCntryType }{@code >}
     *     
     */
    public void setResCntry(JAXBElement<ResCntryType> value) {
        this.resCntry = value;
    }

    /**
     * Gets the value of the resCntryType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResCntryTypeType }{@code >}
     *     
     */
    public JAXBElement<ResCntryTypeType> getResCntryType() {
        return resCntryType;
    }

    /**
     * Sets the value of the resCntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResCntryTypeType }{@code >}
     *     
     */
    public void setResCntryType(JAXBElement<ResCntryTypeType> value) {
        this.resCntryType = value;
    }

    /**
     * Gets the value of the irsExmpCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IRSExmpCodeType }{@code >}
     *     
     */
    public JAXBElement<IRSExmpCodeType> getIRSExmpCode() {
        return irsExmpCode;
    }

    /**
     * Sets the value of the irsExmpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IRSExmpCodeType }{@code >}
     *     
     */
    public void setIRSExmpCode(JAXBElement<IRSExmpCodeType> value) {
        this.irsExmpCode = value;
    }

    /**
     * Gets the value of the irsExmpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IRSExmpDescType }{@code >}
     *     
     */
    public JAXBElement<IRSExmpDescType> getIRSExmpDesc() {
        return irsExmpDesc;
    }

    /**
     * Sets the value of the irsExmpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IRSExmpDescType }{@code >}
     *     
     */
    public void setIRSExmpDesc(JAXBElement<IRSExmpDescType> value) {
        this.irsExmpDesc = value;
    }

    /**
     * Gets the value of the irsRecipCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IRSRecipCodeType }{@code >}
     *     
     */
    public JAXBElement<IRSRecipCodeType> getIRSRecipCode() {
        return irsRecipCode;
    }

    /**
     * Sets the value of the irsRecipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IRSRecipCodeType }{@code >}
     *     
     */
    public void setIRSRecipCode(JAXBElement<IRSRecipCodeType> value) {
        this.irsRecipCode = value;
    }

    /**
     * Gets the value of the irsRecipDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IRSRecipDescType }{@code >}
     *     
     */
    public JAXBElement<IRSRecipDescType> getIRSRecipDesc() {
        return irsRecipDesc;
    }

    /**
     * Sets the value of the irsRecipDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IRSRecipDescType }{@code >}
     *     
     */
    public void setIRSRecipDesc(JAXBElement<IRSRecipDescType> value) {
        this.irsRecipDesc = value;
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
     * Gets the value of the alienTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlienTypeCodeType }{@code >}
     *     
     */
    public JAXBElement<AlienTypeCodeType> getAlienTypeCode() {
        return alienTypeCode;
    }

    /**
     * Sets the value of the alienTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlienTypeCodeType }{@code >}
     *     
     */
    public void setAlienTypeCode(JAXBElement<AlienTypeCodeType> value) {
        this.alienTypeCode = value;
    }

    /**
     * Gets the value of the alienTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AlienTypeDescType }
     *     
     */
    public AlienTypeDescType getAlienTypeDesc() {
        return alienTypeDesc;
    }

    /**
     * Sets the value of the alienTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlienTypeDescType }
     *     
     */
    public void setAlienTypeDesc(AlienTypeDescType value) {
        this.alienTypeDesc = value;
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
     * Gets the value of the alienW8Type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlienW8TypeType }{@code >}
     *     
     */
    public JAXBElement<AlienW8TypeType> getAlienW8Type() {
        return alienW8Type;
    }

    /**
     * Sets the value of the alienW8Type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlienW8TypeType }{@code >}
     *     
     */
    public void setAlienW8Type(JAXBElement<AlienW8TypeType> value) {
        this.alienW8Type = value;
    }

    /**
     * Gets the value of the alienW8Stat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlienW8StatType }{@code >}
     *     
     */
    public JAXBElement<AlienW8StatType> getAlienW8Stat() {
        return alienW8Stat;
    }

    /**
     * Sets the value of the alienW8Stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlienW8StatType }{@code >}
     *     
     */
    public void setAlienW8Stat(JAXBElement<AlienW8StatType> value) {
        this.alienW8Stat = value;
    }

    /**
     * Gets the value of the alienW8StatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AlienW8StatDescType }
     *     
     */
    public AlienW8StatDescType getAlienW8StatDesc() {
        return alienW8StatDesc;
    }

    /**
     * Sets the value of the alienW8StatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlienW8StatDescType }
     *     
     */
    public void setAlienW8StatDesc(AlienW8StatDescType value) {
        this.alienW8StatDesc = value;
    }

    /**
     * Gets the value of the alienW8ExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlienW8ExpDtType }{@code >}
     *     
     */
    public JAXBElement<AlienW8ExpDtType> getAlienW8ExpDt() {
        return alienW8ExpDt;
    }

    /**
     * Sets the value of the alienW8ExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlienW8ExpDtType }{@code >}
     *     
     */
    public void setAlienW8ExpDt(JAXBElement<AlienW8ExpDtType> value) {
        this.alienW8ExpDt = value;
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
     * Gets the value of the fornTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link FornTaxIdType }
     *     
     */
    public FornTaxIdType getFornTaxId() {
        return fornTaxId;
    }

    /**
     * Sets the value of the fornTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FornTaxIdType }
     *     
     */
    public void setFornTaxId(FornTaxIdType value) {
        this.fornTaxId = value;
    }

    /**
     * Gets the value of the citzCntryType property.
     * 
     * @return
     *     possible object is
     *     {@link CitzCntryTypeType }
     *     
     */
    public CitzCntryTypeType getCitzCntryType() {
        return citzCntryType;
    }

    /**
     * Sets the value of the citzCntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitzCntryTypeType }
     *     
     */
    public void setCitzCntryType(CitzCntryTypeType value) {
        this.citzCntryType = value;
    }

    /**
     * Gets the value of the giinId property.
     * 
     * @return
     *     possible object is
     *     {@link GIINIdType }
     *     
     */
    public GIINIdType getGIINId() {
        return giinId;
    }

    /**
     * Sets the value of the giinId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GIINIdType }
     *     
     */
    public void setGIINId(GIINIdType value) {
        this.giinId = value;
    }

    /**
     * Gets the value of the giinDt property.
     * 
     * @return
     *     possible object is
     *     {@link GIINDtType }
     *     
     */
    public GIINDtType getGIINDt() {
        return giinDt;
    }

    /**
     * Sets the value of the giinDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GIINDtType }
     *     
     */
    public void setGIINDt(GIINDtType value) {
        this.giinDt = value;
    }

    /**
     * Gets the value of the giinCertDt property.
     * 
     * @return
     *     possible object is
     *     {@link GIINCertDtType }
     *     
     */
    public GIINCertDtType getGIINCertDt() {
        return giinCertDt;
    }

    /**
     * Sets the value of the giinCertDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GIINCertDtType }
     *     
     */
    public void setGIINCertDt(GIINCertDtType value) {
        this.giinCertDt = value;
    }

    /**
     * Gets the value of the rptChapArray property.
     * 
     * @return
     *     possible object is
     *     {@link RptChapArrayAType }
     *     
     */
    public RptChapArrayAType getRptChapArray() {
        return rptChapArray;
    }

    /**
     * Sets the value of the rptChapArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RptChapArrayAType }
     *     
     */
    public void setRptChapArray(RptChapArrayAType value) {
        this.rptChapArray = value;
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
     * Gets the value of the alienIRSRptType property.
     * 
     * @return
     *     possible object is
     *     {@link AlienIRSRptTypeType }
     *     
     */
    public AlienIRSRptTypeType getAlienIRSRptType() {
        return alienIRSRptType;
    }

    /**
     * Sets the value of the alienIRSRptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlienIRSRptTypeType }
     *     
     */
    public void setAlienIRSRptType(AlienIRSRptTypeType value) {
        this.alienIRSRptType = value;
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
