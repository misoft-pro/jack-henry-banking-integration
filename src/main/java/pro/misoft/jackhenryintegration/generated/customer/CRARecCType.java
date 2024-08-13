
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
 * <p>Java class for CRARec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRARec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRAStateCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRAStateCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRAStateDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRAStateDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRACountyCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRACountyCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRACountyDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRACountyDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRACenTract" type="{http://jackhenry.com/jxchange/TPG/2008}CRACenTract_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRASMSACode" type="{http://jackhenry.com/jxchange/TPG/2008}CRASMSACode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRASMSADesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRASMSADesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRALoc" type="{http://jackhenry.com/jxchange/TPG/2008}CRALoc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRAIncmLvl" type="{http://jackhenry.com/jxchange/TPG/2008}CRAIncmLvl_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRAMilitaryCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRAMilitaryCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRAMilitaryDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRAMilitaryDesc_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CRACode" type="{http://jackhenry.com/jxchange/TPG/2008}CRACode_Type" minOccurs="0"/&gt;
 *           &lt;element name="CRADesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRADesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="CRAAnnIncmAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CRAAnnIncmAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="CRAOrigLocCode" type="{http://jackhenry.com/jxchange/TPG/2008}CRAOrigLocCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="CRAOrigLocDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRAOrigLocDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="CRAOrigBal" type="{http://jackhenry.com/jxchange/TPG/2008}CRAOrigBal_Type" minOccurs="0"/&gt;
 *           &lt;element name="CRAAnnIncmAboveMil" type="{http://jackhenry.com/jxchange/TPG/2008}CRAAnnIncmAboveMil_Type" minOccurs="0"/&gt;
 *           &lt;element name="CRAPurchaseLn" type="{http://jackhenry.com/jxchange/TPG/2008}CRAPurchaseLn_Type" minOccurs="0"/&gt;
 *           &lt;element name="CRAId" type="{http://jackhenry.com/jxchange/TPG/2008}CRAId_Type" minOccurs="0"/&gt;
 *           &lt;element name="CRAOrigRenDt" type="{http://jackhenry.com/jxchange/TPG/2008}CRAOrigRenDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CRARec_CType", propOrder = {
    "craStateCode",
    "craStateDesc",
    "craCountyCode",
    "craCountyDesc",
    "craCenTract",
    "crasmsaCode",
    "crasmsaDesc",
    "craLoc",
    "craIncmLvl",
    "craMilitaryCode",
    "craMilitaryDesc",
    "ver1",
    "craCode",
    "craDesc",
    "craAnnIncmAmt",
    "craOrigLocCode",
    "craOrigLocDesc",
    "craOrigBal",
    "craAnnIncmAboveMil",
    "craPurchaseLn",
    "craId",
    "craOrigRenDt",
    "ver2",
    "any"
})
public class CRARecCType {

    @XmlElementRef(name = "CRAStateCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRAStateCodeType> craStateCode;
    @XmlElementRef(name = "CRAStateDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRAStateDescType> craStateDesc;
    @XmlElementRef(name = "CRACountyCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRACountyCodeType> craCountyCode;
    @XmlElementRef(name = "CRACountyDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRACountyDescType> craCountyDesc;
    @XmlElementRef(name = "CRACenTract", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRACenTractType> craCenTract;
    @XmlElementRef(name = "CRASMSACode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRASMSACodeType> crasmsaCode;
    @XmlElementRef(name = "CRASMSADesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRASMSADescType> crasmsaDesc;
    @XmlElementRef(name = "CRALoc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRALocType> craLoc;
    @XmlElementRef(name = "CRAIncmLvl", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRAIncmLvlType> craIncmLvl;
    @XmlElementRef(name = "CRAMilitaryCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRAMilitaryCodeType> craMilitaryCode;
    @XmlElementRef(name = "CRAMilitaryDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRAMilitaryDescType> craMilitaryDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "CRACode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRACodeType> craCode;
    @XmlElementRef(name = "CRADesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRADescType> craDesc;
    @XmlElementRef(name = "CRAAnnIncmAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRAAnnIncmAmtType> craAnnIncmAmt;
    @XmlElementRef(name = "CRAOrigLocCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRAOrigLocCodeType> craOrigLocCode;
    @XmlElementRef(name = "CRAOrigLocDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRAOrigLocDescType> craOrigLocDesc;
    @XmlElementRef(name = "CRAOrigBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRAOrigBalType> craOrigBal;
    @XmlElementRef(name = "CRAAnnIncmAboveMil", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRAAnnIncmAboveMilType> craAnnIncmAboveMil;
    @XmlElementRef(name = "CRAPurchaseLn", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRAPurchaseLnType> craPurchaseLn;
    @XmlElementRef(name = "CRAId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRAIdType> craId;
    @XmlElementRef(name = "CRAOrigRenDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CRAOrigRenDtType> craOrigRenDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the craStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRAStateCodeType }{@code >}
     *     
     */
    public JAXBElement<CRAStateCodeType> getCRAStateCode() {
        return craStateCode;
    }

    /**
     * Sets the value of the craStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRAStateCodeType }{@code >}
     *     
     */
    public void setCRAStateCode(JAXBElement<CRAStateCodeType> value) {
        this.craStateCode = value;
    }

    /**
     * Gets the value of the craStateDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRAStateDescType }{@code >}
     *     
     */
    public JAXBElement<CRAStateDescType> getCRAStateDesc() {
        return craStateDesc;
    }

    /**
     * Sets the value of the craStateDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRAStateDescType }{@code >}
     *     
     */
    public void setCRAStateDesc(JAXBElement<CRAStateDescType> value) {
        this.craStateDesc = value;
    }

    /**
     * Gets the value of the craCountyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRACountyCodeType }{@code >}
     *     
     */
    public JAXBElement<CRACountyCodeType> getCRACountyCode() {
        return craCountyCode;
    }

    /**
     * Sets the value of the craCountyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRACountyCodeType }{@code >}
     *     
     */
    public void setCRACountyCode(JAXBElement<CRACountyCodeType> value) {
        this.craCountyCode = value;
    }

    /**
     * Gets the value of the craCountyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRACountyDescType }{@code >}
     *     
     */
    public JAXBElement<CRACountyDescType> getCRACountyDesc() {
        return craCountyDesc;
    }

    /**
     * Sets the value of the craCountyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRACountyDescType }{@code >}
     *     
     */
    public void setCRACountyDesc(JAXBElement<CRACountyDescType> value) {
        this.craCountyDesc = value;
    }

    /**
     * Gets the value of the craCenTract property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRACenTractType }{@code >}
     *     
     */
    public JAXBElement<CRACenTractType> getCRACenTract() {
        return craCenTract;
    }

    /**
     * Sets the value of the craCenTract property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRACenTractType }{@code >}
     *     
     */
    public void setCRACenTract(JAXBElement<CRACenTractType> value) {
        this.craCenTract = value;
    }

    /**
     * Gets the value of the crasmsaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRASMSACodeType }{@code >}
     *     
     */
    public JAXBElement<CRASMSACodeType> getCRASMSACode() {
        return crasmsaCode;
    }

    /**
     * Sets the value of the crasmsaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRASMSACodeType }{@code >}
     *     
     */
    public void setCRASMSACode(JAXBElement<CRASMSACodeType> value) {
        this.crasmsaCode = value;
    }

    /**
     * Gets the value of the crasmsaDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRASMSADescType }{@code >}
     *     
     */
    public JAXBElement<CRASMSADescType> getCRASMSADesc() {
        return crasmsaDesc;
    }

    /**
     * Sets the value of the crasmsaDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRASMSADescType }{@code >}
     *     
     */
    public void setCRASMSADesc(JAXBElement<CRASMSADescType> value) {
        this.crasmsaDesc = value;
    }

    /**
     * Gets the value of the craLoc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRALocType }{@code >}
     *     
     */
    public JAXBElement<CRALocType> getCRALoc() {
        return craLoc;
    }

    /**
     * Sets the value of the craLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRALocType }{@code >}
     *     
     */
    public void setCRALoc(JAXBElement<CRALocType> value) {
        this.craLoc = value;
    }

    /**
     * Gets the value of the craIncmLvl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRAIncmLvlType }{@code >}
     *     
     */
    public JAXBElement<CRAIncmLvlType> getCRAIncmLvl() {
        return craIncmLvl;
    }

    /**
     * Sets the value of the craIncmLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRAIncmLvlType }{@code >}
     *     
     */
    public void setCRAIncmLvl(JAXBElement<CRAIncmLvlType> value) {
        this.craIncmLvl = value;
    }

    /**
     * Gets the value of the craMilitaryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRAMilitaryCodeType }{@code >}
     *     
     */
    public JAXBElement<CRAMilitaryCodeType> getCRAMilitaryCode() {
        return craMilitaryCode;
    }

    /**
     * Sets the value of the craMilitaryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRAMilitaryCodeType }{@code >}
     *     
     */
    public void setCRAMilitaryCode(JAXBElement<CRAMilitaryCodeType> value) {
        this.craMilitaryCode = value;
    }

    /**
     * Gets the value of the craMilitaryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRAMilitaryDescType }{@code >}
     *     
     */
    public JAXBElement<CRAMilitaryDescType> getCRAMilitaryDesc() {
        return craMilitaryDesc;
    }

    /**
     * Sets the value of the craMilitaryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRAMilitaryDescType }{@code >}
     *     
     */
    public void setCRAMilitaryDesc(JAXBElement<CRAMilitaryDescType> value) {
        this.craMilitaryDesc = value;
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
     * Gets the value of the craCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRACodeType }{@code >}
     *     
     */
    public JAXBElement<CRACodeType> getCRACode() {
        return craCode;
    }

    /**
     * Sets the value of the craCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRACodeType }{@code >}
     *     
     */
    public void setCRACode(JAXBElement<CRACodeType> value) {
        this.craCode = value;
    }

    /**
     * Gets the value of the craDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRADescType }{@code >}
     *     
     */
    public JAXBElement<CRADescType> getCRADesc() {
        return craDesc;
    }

    /**
     * Sets the value of the craDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRADescType }{@code >}
     *     
     */
    public void setCRADesc(JAXBElement<CRADescType> value) {
        this.craDesc = value;
    }

    /**
     * Gets the value of the craAnnIncmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRAAnnIncmAmtType }{@code >}
     *     
     */
    public JAXBElement<CRAAnnIncmAmtType> getCRAAnnIncmAmt() {
        return craAnnIncmAmt;
    }

    /**
     * Sets the value of the craAnnIncmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRAAnnIncmAmtType }{@code >}
     *     
     */
    public void setCRAAnnIncmAmt(JAXBElement<CRAAnnIncmAmtType> value) {
        this.craAnnIncmAmt = value;
    }

    /**
     * Gets the value of the craOrigLocCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRAOrigLocCodeType }{@code >}
     *     
     */
    public JAXBElement<CRAOrigLocCodeType> getCRAOrigLocCode() {
        return craOrigLocCode;
    }

    /**
     * Sets the value of the craOrigLocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRAOrigLocCodeType }{@code >}
     *     
     */
    public void setCRAOrigLocCode(JAXBElement<CRAOrigLocCodeType> value) {
        this.craOrigLocCode = value;
    }

    /**
     * Gets the value of the craOrigLocDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRAOrigLocDescType }{@code >}
     *     
     */
    public JAXBElement<CRAOrigLocDescType> getCRAOrigLocDesc() {
        return craOrigLocDesc;
    }

    /**
     * Sets the value of the craOrigLocDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRAOrigLocDescType }{@code >}
     *     
     */
    public void setCRAOrigLocDesc(JAXBElement<CRAOrigLocDescType> value) {
        this.craOrigLocDesc = value;
    }

    /**
     * Gets the value of the craOrigBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRAOrigBalType }{@code >}
     *     
     */
    public JAXBElement<CRAOrigBalType> getCRAOrigBal() {
        return craOrigBal;
    }

    /**
     * Sets the value of the craOrigBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRAOrigBalType }{@code >}
     *     
     */
    public void setCRAOrigBal(JAXBElement<CRAOrigBalType> value) {
        this.craOrigBal = value;
    }

    /**
     * Gets the value of the craAnnIncmAboveMil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRAAnnIncmAboveMilType }{@code >}
     *     
     */
    public JAXBElement<CRAAnnIncmAboveMilType> getCRAAnnIncmAboveMil() {
        return craAnnIncmAboveMil;
    }

    /**
     * Sets the value of the craAnnIncmAboveMil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRAAnnIncmAboveMilType }{@code >}
     *     
     */
    public void setCRAAnnIncmAboveMil(JAXBElement<CRAAnnIncmAboveMilType> value) {
        this.craAnnIncmAboveMil = value;
    }

    /**
     * Gets the value of the craPurchaseLn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRAPurchaseLnType }{@code >}
     *     
     */
    public JAXBElement<CRAPurchaseLnType> getCRAPurchaseLn() {
        return craPurchaseLn;
    }

    /**
     * Sets the value of the craPurchaseLn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRAPurchaseLnType }{@code >}
     *     
     */
    public void setCRAPurchaseLn(JAXBElement<CRAPurchaseLnType> value) {
        this.craPurchaseLn = value;
    }

    /**
     * Gets the value of the craId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRAIdType }{@code >}
     *     
     */
    public JAXBElement<CRAIdType> getCRAId() {
        return craId;
    }

    /**
     * Sets the value of the craId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRAIdType }{@code >}
     *     
     */
    public void setCRAId(JAXBElement<CRAIdType> value) {
        this.craId = value;
    }

    /**
     * Gets the value of the craOrigRenDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CRAOrigRenDtType }{@code >}
     *     
     */
    public JAXBElement<CRAOrigRenDtType> getCRAOrigRenDt() {
        return craOrigRenDt;
    }

    /**
     * Sets the value of the craOrigRenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CRAOrigRenDtType }{@code >}
     *     
     */
    public void setCRAOrigRenDt(JAXBElement<CRAOrigRenDtType> value) {
        this.craOrigRenDt = value;
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
