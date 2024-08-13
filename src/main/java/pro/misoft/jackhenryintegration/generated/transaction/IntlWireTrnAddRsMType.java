
package pro.misoft.jackhenryintegration.generated.transaction;

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
 * <p>Java class for IntlWireTrnAddRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntlWireTrnAddRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="TrnRcptId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRcptId_Type" minOccurs="0"/&gt;
 *         &lt;element name="FornCurrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}FornCurrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBankFeeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireBankFeeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireBankTaxAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WireBankTaxAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SttlCostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SttlCostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurrExchRate" type="{http://jackhenry.com/jxchange/TPG/2008}CurrExchRate_Type" minOccurs="0"/&gt;
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
@XmlType(name = "IntlWireTrnAddRs_MType", propOrder = {
    "msgRsHdr",
    "trnRcptId",
    "fornCurrAmt",
    "wireBankFeeAmt",
    "wireBankTaxAmt",
    "sttlCostAmt",
    "currExchRate",
    "rsStat",
    "custom",
    "ver1",
    "any"
})
public class IntlWireTrnAddRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "TrnRcptId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnRcptIdType> trnRcptId;
    @XmlElementRef(name = "FornCurrAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FornCurrAmtType> fornCurrAmt;
    @XmlElementRef(name = "WireBankFeeAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireBankFeeAmtType> wireBankFeeAmt;
    @XmlElementRef(name = "WireBankTaxAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<WireBankTaxAmtType> wireBankTaxAmt;
    @XmlElementRef(name = "SttlCostAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SttlCostAmtType> sttlCostAmt;
    @XmlElementRef(name = "CurrExchRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CurrExchRateType> currExchRate;
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
     * Gets the value of the trnRcptId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnRcptIdType }{@code >}
     *     
     */
    public JAXBElement<TrnRcptIdType> getTrnRcptId() {
        return trnRcptId;
    }

    /**
     * Sets the value of the trnRcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnRcptIdType }{@code >}
     *     
     */
    public void setTrnRcptId(JAXBElement<TrnRcptIdType> value) {
        this.trnRcptId = value;
    }

    /**
     * Gets the value of the fornCurrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FornCurrAmtType }{@code >}
     *     
     */
    public JAXBElement<FornCurrAmtType> getFornCurrAmt() {
        return fornCurrAmt;
    }

    /**
     * Sets the value of the fornCurrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FornCurrAmtType }{@code >}
     *     
     */
    public void setFornCurrAmt(JAXBElement<FornCurrAmtType> value) {
        this.fornCurrAmt = value;
    }

    /**
     * Gets the value of the wireBankFeeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireBankFeeAmtType }{@code >}
     *     
     */
    public JAXBElement<WireBankFeeAmtType> getWireBankFeeAmt() {
        return wireBankFeeAmt;
    }

    /**
     * Sets the value of the wireBankFeeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireBankFeeAmtType }{@code >}
     *     
     */
    public void setWireBankFeeAmt(JAXBElement<WireBankFeeAmtType> value) {
        this.wireBankFeeAmt = value;
    }

    /**
     * Gets the value of the wireBankTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WireBankTaxAmtType }{@code >}
     *     
     */
    public JAXBElement<WireBankTaxAmtType> getWireBankTaxAmt() {
        return wireBankTaxAmt;
    }

    /**
     * Sets the value of the wireBankTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WireBankTaxAmtType }{@code >}
     *     
     */
    public void setWireBankTaxAmt(JAXBElement<WireBankTaxAmtType> value) {
        this.wireBankTaxAmt = value;
    }

    /**
     * Gets the value of the sttlCostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SttlCostAmtType }{@code >}
     *     
     */
    public JAXBElement<SttlCostAmtType> getSttlCostAmt() {
        return sttlCostAmt;
    }

    /**
     * Sets the value of the sttlCostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SttlCostAmtType }{@code >}
     *     
     */
    public void setSttlCostAmt(JAXBElement<SttlCostAmtType> value) {
        this.sttlCostAmt = value;
    }

    /**
     * Gets the value of the currExchRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurrExchRateType }{@code >}
     *     
     */
    public JAXBElement<CurrExchRateType> getCurrExchRate() {
        return currExchRate;
    }

    /**
     * Sets the value of the currExchRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurrExchRateType }{@code >}
     *     
     */
    public void setCurrExchRate(JAXBElement<CurrExchRateType> value) {
        this.currExchRate = value;
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
     * {@link Element }
     * {@link Object }
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
