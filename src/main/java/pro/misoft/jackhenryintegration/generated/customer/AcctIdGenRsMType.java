
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
 * <p>Java class for AcctIdGenRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctIdGenRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="AcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubCatType" type="{http://jackhenry.com/jxchange/TPG/2008}SubCatType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="QtyNeeded" type="{http://jackhenry.com/jxchange/TPG/2008}QtyNeeded_Type" minOccurs="0"/&gt;
 *         &lt;element name="GenAcctExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}GenAcctExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ModulusCode" type="{http://jackhenry.com/jxchange/TPG/2008}ModulusCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="GenAcctIdArray" type="{http://jackhenry.com/jxchange/TPG/2008}GenAcctIdArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="RsStat" type="{http://jackhenry.com/jxchange/TPG/2008}RsStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "AcctIdGenRs_MType", propOrder = {
    "msgRsHdr",
    "acctType",
    "subCatType",
    "brCode",
    "prodCode",
    "offCode",
    "qtyNeeded",
    "genAcctExpDt",
    "modulusCode",
    "genAcctIdArray",
    "rsStat",
    "custom",
    "ver1",
    "any"
})
public class AcctIdGenRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "AcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctTypeType> acctType;
    @XmlElementRef(name = "SubCatType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SubCatTypeType> subCatType;
    @XmlElementRef(name = "BrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BrCodeType> brCode;
    @XmlElementRef(name = "ProdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProdCodeType> prodCode;
    @XmlElementRef(name = "OffCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OffCodeType> offCode;
    @XmlElementRef(name = "QtyNeeded", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<QtyNeededType> qtyNeeded;
    @XmlElementRef(name = "GenAcctExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<GenAcctExpDtType> genAcctExpDt;
    @XmlElementRef(name = "ModulusCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ModulusCodeType> modulusCode;
    @XmlElementRef(name = "GenAcctIdArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<GenAcctIdArrayAType> genAcctIdArray;
    @XmlElementRef(name = "RsStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RsStatType> rsStat;
    @XmlElementRef(name = "Custom", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomCType> custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the msgRsHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MsgRsHdrCType }
     *     
     */
    public MsgRsHdrCType getMsgRsHdr() {
        return msgRsHdr;
    }

    /**
     * Sets the value of the msgRsHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgRsHdrCType }
     *     
     */
    public void setMsgRsHdr(MsgRsHdrCType value) {
        this.msgRsHdr = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctTypeType }{@code >}
     *     
     */
    public JAXBElement<AcctTypeType> getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctTypeType }{@code >}
     *     
     */
    public void setAcctType(JAXBElement<AcctTypeType> value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the subCatType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubCatTypeType }{@code >}
     *     
     */
    public JAXBElement<SubCatTypeType> getSubCatType() {
        return subCatType;
    }

    /**
     * Sets the value of the subCatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubCatTypeType }{@code >}
     *     
     */
    public void setSubCatType(JAXBElement<SubCatTypeType> value) {
        this.subCatType = value;
    }

    /**
     * Gets the value of the brCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BrCodeType }{@code >}
     *     
     */
    public JAXBElement<BrCodeType> getBrCode() {
        return brCode;
    }

    /**
     * Sets the value of the brCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BrCodeType }{@code >}
     *     
     */
    public void setBrCode(JAXBElement<BrCodeType> value) {
        this.brCode = value;
    }

    /**
     * Gets the value of the prodCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProdCodeType }{@code >}
     *     
     */
    public JAXBElement<ProdCodeType> getProdCode() {
        return prodCode;
    }

    /**
     * Sets the value of the prodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProdCodeType }{@code >}
     *     
     */
    public void setProdCode(JAXBElement<ProdCodeType> value) {
        this.prodCode = value;
    }

    /**
     * Gets the value of the offCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}
     *     
     */
    public JAXBElement<OffCodeType> getOffCode() {
        return offCode;
    }

    /**
     * Sets the value of the offCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}
     *     
     */
    public void setOffCode(JAXBElement<OffCodeType> value) {
        this.offCode = value;
    }

    /**
     * Gets the value of the qtyNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QtyNeededType }{@code >}
     *     
     */
    public JAXBElement<QtyNeededType> getQtyNeeded() {
        return qtyNeeded;
    }

    /**
     * Sets the value of the qtyNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QtyNeededType }{@code >}
     *     
     */
    public void setQtyNeeded(JAXBElement<QtyNeededType> value) {
        this.qtyNeeded = value;
    }

    /**
     * Gets the value of the genAcctExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GenAcctExpDtType }{@code >}
     *     
     */
    public JAXBElement<GenAcctExpDtType> getGenAcctExpDt() {
        return genAcctExpDt;
    }

    /**
     * Sets the value of the genAcctExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GenAcctExpDtType }{@code >}
     *     
     */
    public void setGenAcctExpDt(JAXBElement<GenAcctExpDtType> value) {
        this.genAcctExpDt = value;
    }

    /**
     * Gets the value of the modulusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ModulusCodeType }{@code >}
     *     
     */
    public JAXBElement<ModulusCodeType> getModulusCode() {
        return modulusCode;
    }

    /**
     * Sets the value of the modulusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ModulusCodeType }{@code >}
     *     
     */
    public void setModulusCode(JAXBElement<ModulusCodeType> value) {
        this.modulusCode = value;
    }

    /**
     * Gets the value of the genAcctIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GenAcctIdArrayAType }{@code >}
     *     
     */
    public JAXBElement<GenAcctIdArrayAType> getGenAcctIdArray() {
        return genAcctIdArray;
    }

    /**
     * Sets the value of the genAcctIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GenAcctIdArrayAType }{@code >}
     *     
     */
    public void setGenAcctIdArray(JAXBElement<GenAcctIdArrayAType> value) {
        this.genAcctIdArray = value;
    }

    /**
     * Gets the value of the rsStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RsStatType }{@code >}
     *     
     */
    public JAXBElement<RsStatType> getRsStat() {
        return rsStat;
    }

    /**
     * Sets the value of the rsStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RsStatType }{@code >}
     *     
     */
    public void setRsStat(JAXBElement<RsStatType> value) {
        this.rsStat = value;
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
