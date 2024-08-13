
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
 * <p>Java class for CollatItemRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollatItemRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CusipId" type="{http://jackhenry.com/jxchange/TPG/2008}CusipId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CusipBankId" type="{http://jackhenry.com/jxchange/TPG/2008}CusipBankId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatValAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatValAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatItemDocDt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatItemDocDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatItemDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}CollatItemDescArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="DocLocCode" type="{http://jackhenry.com/jxchange/TPG/2008}DocLocCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatMatDt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatMatDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatOrigValAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatOrigValAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PriceDt" type="{http://jackhenry.com/jxchange/TPG/2008}PriceDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatToLnRelCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatToLnRelCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatPrvStat" type="{http://jackhenry.com/jxchange/TPG/2008}CollatPrvStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatRecDt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatRecDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatRecCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatRecCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatRecId" type="{http://jackhenry.com/jxchange/TPG/2008}CollatRecId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatRcptId" type="{http://jackhenry.com/jxchange/TPG/2008}CollatRcptId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatRcptDt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatRcptDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatRegstCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatRegstCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatStat" type="{http://jackhenry.com/jxchange/TPG/2008}CollatStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatStatDt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatStatDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatSrcValCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatSrcValCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatUnit" type="{http://jackhenry.com/jxchange/TPG/2008}CollatUnit_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatValDt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatValDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatToLnPct" type="{http://jackhenry.com/jxchange/TPG/2008}CollatToLnPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatWavDt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatWavDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatOffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="CollatOwnCustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *             &lt;element name="CollatShareType" type="{http://jackhenry.com/jxchange/TPG/2008}CollatShareType_Type" minOccurs="0"/&gt;
 *             &lt;element name="CollatCustRelCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctRelCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CollatItemRec_CType", propOrder = {
    "brCode",
    "collatCode",
    "cusipId",
    "cusipBankId",
    "collatValAmt",
    "collatItemDocDt",
    "collatItemDescArray",
    "docLocCode",
    "collatMatDt",
    "collatOrigValAmt",
    "priceDt",
    "collatToLnRelCode",
    "collatPrvStat",
    "collatRecDt",
    "collatRecCode",
    "collatRecId",
    "collatRcptId",
    "collatRcptDt",
    "collatRegstCode",
    "collatStat",
    "collatStatDt",
    "collatSrcValCode",
    "collatUnit",
    "collatValDt",
    "collatToLnPct",
    "collatWavDt",
    "collatOffCode",
    "ver1",
    "custom",
    "ver2",
    "collatOwnCustId",
    "collatShareType",
    "collatCustRelCode",
    "ver3",
    "any"
})
public class CollatItemRecCType {

    @XmlElementRef(name = "BrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BrCodeType> brCode;
    @XmlElementRef(name = "CollatCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatCodeType> collatCode;
    @XmlElementRef(name = "CusipId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CusipIdType> cusipId;
    @XmlElementRef(name = "CusipBankId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CusipBankIdType> cusipBankId;
    @XmlElementRef(name = "CollatValAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatValAmtType> collatValAmt;
    @XmlElementRef(name = "CollatItemDocDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatItemDocDtType> collatItemDocDt;
    @XmlElement(name = "CollatItemDescArray")
    protected CollatItemDescArrayAType collatItemDescArray;
    @XmlElementRef(name = "DocLocCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DocLocCodeType> docLocCode;
    @XmlElementRef(name = "CollatMatDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatMatDtType> collatMatDt;
    @XmlElement(name = "CollatOrigValAmt")
    protected CollatOrigValAmtType collatOrigValAmt;
    @XmlElementRef(name = "PriceDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PriceDtType> priceDt;
    @XmlElementRef(name = "CollatToLnRelCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatToLnRelCodeType> collatToLnRelCode;
    @XmlElementRef(name = "CollatPrvStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatPrvStatType> collatPrvStat;
    @XmlElementRef(name = "CollatRecDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatRecDtType> collatRecDt;
    @XmlElementRef(name = "CollatRecCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatRecCodeType> collatRecCode;
    @XmlElementRef(name = "CollatRecId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatRecIdType> collatRecId;
    @XmlElementRef(name = "CollatRcptId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatRcptIdType> collatRcptId;
    @XmlElementRef(name = "CollatRcptDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatRcptDtType> collatRcptDt;
    @XmlElementRef(name = "CollatRegstCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatRegstCodeType> collatRegstCode;
    @XmlElementRef(name = "CollatStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatStatType> collatStat;
    @XmlElementRef(name = "CollatStatDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatStatDtType> collatStatDt;
    @XmlElementRef(name = "CollatSrcValCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatSrcValCodeType> collatSrcValCode;
    @XmlElementRef(name = "CollatUnit", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatUnitType> collatUnit;
    @XmlElementRef(name = "CollatValDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatValDtType> collatValDt;
    @XmlElementRef(name = "CollatToLnPct", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatToLnPctType> collatToLnPct;
    @XmlElementRef(name = "CollatWavDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CollatWavDtType> collatWavDt;
    @XmlElementRef(name = "CollatOffCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OffCodeType> collatOffCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "CollatOwnCustId")
    protected CustIdType collatOwnCustId;
    @XmlElement(name = "CollatShareType")
    protected CollatShareTypeType collatShareType;
    @XmlElement(name = "CollatCustRelCode")
    protected AcctRelCodeType collatCustRelCode;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the collatCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatCodeType }{@code >}
     *     
     */
    public JAXBElement<CollatCodeType> getCollatCode() {
        return collatCode;
    }

    /**
     * Sets the value of the collatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatCodeType }{@code >}
     *     
     */
    public void setCollatCode(JAXBElement<CollatCodeType> value) {
        this.collatCode = value;
    }

    /**
     * Gets the value of the cusipId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CusipIdType }{@code >}
     *     
     */
    public JAXBElement<CusipIdType> getCusipId() {
        return cusipId;
    }

    /**
     * Sets the value of the cusipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CusipIdType }{@code >}
     *     
     */
    public void setCusipId(JAXBElement<CusipIdType> value) {
        this.cusipId = value;
    }

    /**
     * Gets the value of the cusipBankId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CusipBankIdType }{@code >}
     *     
     */
    public JAXBElement<CusipBankIdType> getCusipBankId() {
        return cusipBankId;
    }

    /**
     * Sets the value of the cusipBankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CusipBankIdType }{@code >}
     *     
     */
    public void setCusipBankId(JAXBElement<CusipBankIdType> value) {
        this.cusipBankId = value;
    }

    /**
     * Gets the value of the collatValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatValAmtType }{@code >}
     *     
     */
    public JAXBElement<CollatValAmtType> getCollatValAmt() {
        return collatValAmt;
    }

    /**
     * Sets the value of the collatValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatValAmtType }{@code >}
     *     
     */
    public void setCollatValAmt(JAXBElement<CollatValAmtType> value) {
        this.collatValAmt = value;
    }

    /**
     * Gets the value of the collatItemDocDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatItemDocDtType }{@code >}
     *     
     */
    public JAXBElement<CollatItemDocDtType> getCollatItemDocDt() {
        return collatItemDocDt;
    }

    /**
     * Sets the value of the collatItemDocDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatItemDocDtType }{@code >}
     *     
     */
    public void setCollatItemDocDt(JAXBElement<CollatItemDocDtType> value) {
        this.collatItemDocDt = value;
    }

    /**
     * Gets the value of the collatItemDescArray property.
     * 
     * @return
     *     possible object is
     *     {@link CollatItemDescArrayAType }
     *     
     */
    public CollatItemDescArrayAType getCollatItemDescArray() {
        return collatItemDescArray;
    }

    /**
     * Sets the value of the collatItemDescArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatItemDescArrayAType }
     *     
     */
    public void setCollatItemDescArray(CollatItemDescArrayAType value) {
        this.collatItemDescArray = value;
    }

    /**
     * Gets the value of the docLocCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocLocCodeType }{@code >}
     *     
     */
    public JAXBElement<DocLocCodeType> getDocLocCode() {
        return docLocCode;
    }

    /**
     * Sets the value of the docLocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocLocCodeType }{@code >}
     *     
     */
    public void setDocLocCode(JAXBElement<DocLocCodeType> value) {
        this.docLocCode = value;
    }

    /**
     * Gets the value of the collatMatDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatMatDtType }{@code >}
     *     
     */
    public JAXBElement<CollatMatDtType> getCollatMatDt() {
        return collatMatDt;
    }

    /**
     * Sets the value of the collatMatDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatMatDtType }{@code >}
     *     
     */
    public void setCollatMatDt(JAXBElement<CollatMatDtType> value) {
        this.collatMatDt = value;
    }

    /**
     * Gets the value of the collatOrigValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollatOrigValAmtType }
     *     
     */
    public CollatOrigValAmtType getCollatOrigValAmt() {
        return collatOrigValAmt;
    }

    /**
     * Sets the value of the collatOrigValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatOrigValAmtType }
     *     
     */
    public void setCollatOrigValAmt(CollatOrigValAmtType value) {
        this.collatOrigValAmt = value;
    }

    /**
     * Gets the value of the priceDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriceDtType }{@code >}
     *     
     */
    public JAXBElement<PriceDtType> getPriceDt() {
        return priceDt;
    }

    /**
     * Sets the value of the priceDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriceDtType }{@code >}
     *     
     */
    public void setPriceDt(JAXBElement<PriceDtType> value) {
        this.priceDt = value;
    }

    /**
     * Gets the value of the collatToLnRelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatToLnRelCodeType }{@code >}
     *     
     */
    public JAXBElement<CollatToLnRelCodeType> getCollatToLnRelCode() {
        return collatToLnRelCode;
    }

    /**
     * Sets the value of the collatToLnRelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatToLnRelCodeType }{@code >}
     *     
     */
    public void setCollatToLnRelCode(JAXBElement<CollatToLnRelCodeType> value) {
        this.collatToLnRelCode = value;
    }

    /**
     * Gets the value of the collatPrvStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatPrvStatType }{@code >}
     *     
     */
    public JAXBElement<CollatPrvStatType> getCollatPrvStat() {
        return collatPrvStat;
    }

    /**
     * Sets the value of the collatPrvStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatPrvStatType }{@code >}
     *     
     */
    public void setCollatPrvStat(JAXBElement<CollatPrvStatType> value) {
        this.collatPrvStat = value;
    }

    /**
     * Gets the value of the collatRecDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatRecDtType }{@code >}
     *     
     */
    public JAXBElement<CollatRecDtType> getCollatRecDt() {
        return collatRecDt;
    }

    /**
     * Sets the value of the collatRecDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatRecDtType }{@code >}
     *     
     */
    public void setCollatRecDt(JAXBElement<CollatRecDtType> value) {
        this.collatRecDt = value;
    }

    /**
     * Gets the value of the collatRecCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatRecCodeType }{@code >}
     *     
     */
    public JAXBElement<CollatRecCodeType> getCollatRecCode() {
        return collatRecCode;
    }

    /**
     * Sets the value of the collatRecCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatRecCodeType }{@code >}
     *     
     */
    public void setCollatRecCode(JAXBElement<CollatRecCodeType> value) {
        this.collatRecCode = value;
    }

    /**
     * Gets the value of the collatRecId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatRecIdType }{@code >}
     *     
     */
    public JAXBElement<CollatRecIdType> getCollatRecId() {
        return collatRecId;
    }

    /**
     * Sets the value of the collatRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatRecIdType }{@code >}
     *     
     */
    public void setCollatRecId(JAXBElement<CollatRecIdType> value) {
        this.collatRecId = value;
    }

    /**
     * Gets the value of the collatRcptId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatRcptIdType }{@code >}
     *     
     */
    public JAXBElement<CollatRcptIdType> getCollatRcptId() {
        return collatRcptId;
    }

    /**
     * Sets the value of the collatRcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatRcptIdType }{@code >}
     *     
     */
    public void setCollatRcptId(JAXBElement<CollatRcptIdType> value) {
        this.collatRcptId = value;
    }

    /**
     * Gets the value of the collatRcptDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatRcptDtType }{@code >}
     *     
     */
    public JAXBElement<CollatRcptDtType> getCollatRcptDt() {
        return collatRcptDt;
    }

    /**
     * Sets the value of the collatRcptDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatRcptDtType }{@code >}
     *     
     */
    public void setCollatRcptDt(JAXBElement<CollatRcptDtType> value) {
        this.collatRcptDt = value;
    }

    /**
     * Gets the value of the collatRegstCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatRegstCodeType }{@code >}
     *     
     */
    public JAXBElement<CollatRegstCodeType> getCollatRegstCode() {
        return collatRegstCode;
    }

    /**
     * Sets the value of the collatRegstCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatRegstCodeType }{@code >}
     *     
     */
    public void setCollatRegstCode(JAXBElement<CollatRegstCodeType> value) {
        this.collatRegstCode = value;
    }

    /**
     * Gets the value of the collatStat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatStatType }{@code >}
     *     
     */
    public JAXBElement<CollatStatType> getCollatStat() {
        return collatStat;
    }

    /**
     * Sets the value of the collatStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatStatType }{@code >}
     *     
     */
    public void setCollatStat(JAXBElement<CollatStatType> value) {
        this.collatStat = value;
    }

    /**
     * Gets the value of the collatStatDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatStatDtType }{@code >}
     *     
     */
    public JAXBElement<CollatStatDtType> getCollatStatDt() {
        return collatStatDt;
    }

    /**
     * Sets the value of the collatStatDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatStatDtType }{@code >}
     *     
     */
    public void setCollatStatDt(JAXBElement<CollatStatDtType> value) {
        this.collatStatDt = value;
    }

    /**
     * Gets the value of the collatSrcValCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatSrcValCodeType }{@code >}
     *     
     */
    public JAXBElement<CollatSrcValCodeType> getCollatSrcValCode() {
        return collatSrcValCode;
    }

    /**
     * Sets the value of the collatSrcValCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatSrcValCodeType }{@code >}
     *     
     */
    public void setCollatSrcValCode(JAXBElement<CollatSrcValCodeType> value) {
        this.collatSrcValCode = value;
    }

    /**
     * Gets the value of the collatUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatUnitType }{@code >}
     *     
     */
    public JAXBElement<CollatUnitType> getCollatUnit() {
        return collatUnit;
    }

    /**
     * Sets the value of the collatUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatUnitType }{@code >}
     *     
     */
    public void setCollatUnit(JAXBElement<CollatUnitType> value) {
        this.collatUnit = value;
    }

    /**
     * Gets the value of the collatValDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatValDtType }{@code >}
     *     
     */
    public JAXBElement<CollatValDtType> getCollatValDt() {
        return collatValDt;
    }

    /**
     * Sets the value of the collatValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatValDtType }{@code >}
     *     
     */
    public void setCollatValDt(JAXBElement<CollatValDtType> value) {
        this.collatValDt = value;
    }

    /**
     * Gets the value of the collatToLnPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatToLnPctType }{@code >}
     *     
     */
    public JAXBElement<CollatToLnPctType> getCollatToLnPct() {
        return collatToLnPct;
    }

    /**
     * Sets the value of the collatToLnPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatToLnPctType }{@code >}
     *     
     */
    public void setCollatToLnPct(JAXBElement<CollatToLnPctType> value) {
        this.collatToLnPct = value;
    }

    /**
     * Gets the value of the collatWavDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollatWavDtType }{@code >}
     *     
     */
    public JAXBElement<CollatWavDtType> getCollatWavDt() {
        return collatWavDt;
    }

    /**
     * Sets the value of the collatWavDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollatWavDtType }{@code >}
     *     
     */
    public void setCollatWavDt(JAXBElement<CollatWavDtType> value) {
        this.collatWavDt = value;
    }

    /**
     * Gets the value of the collatOffCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}
     *     
     */
    public JAXBElement<OffCodeType> getCollatOffCode() {
        return collatOffCode;
    }

    /**
     * Sets the value of the collatOffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OffCodeType }{@code >}
     *     
     */
    public void setCollatOffCode(JAXBElement<OffCodeType> value) {
        this.collatOffCode = value;
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
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustom(CustomCType value) {
        this.custom = value;
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
     * Gets the value of the collatOwnCustId property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCollatOwnCustId() {
        return collatOwnCustId;
    }

    /**
     * Sets the value of the collatOwnCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCollatOwnCustId(CustIdType value) {
        this.collatOwnCustId = value;
    }

    /**
     * Gets the value of the collatShareType property.
     * 
     * @return
     *     possible object is
     *     {@link CollatShareTypeType }
     *     
     */
    public CollatShareTypeType getCollatShareType() {
        return collatShareType;
    }

    /**
     * Sets the value of the collatShareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatShareTypeType }
     *     
     */
    public void setCollatShareType(CollatShareTypeType value) {
        this.collatShareType = value;
    }

    /**
     * Gets the value of the collatCustRelCode property.
     * 
     * @return
     *     possible object is
     *     {@link AcctRelCodeType }
     *     
     */
    public AcctRelCodeType getCollatCustRelCode() {
        return collatCustRelCode;
    }

    /**
     * Sets the value of the collatCustRelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctRelCodeType }
     *     
     */
    public void setCollatCustRelCode(AcctRelCodeType value) {
        this.collatCustRelCode = value;
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
