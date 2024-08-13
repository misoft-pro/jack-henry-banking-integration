
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
 * <p>Java class for XferRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XferRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EftDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}EftDesc_AType" minOccurs="0"/&gt;
 *         &lt;element name="PrtRcpt" type="{http://jackhenry.com/jxchange/TPG/2008}PrtRcpt_Type" minOccurs="0"/&gt;
 *         &lt;element name="Fee" type="{http://jackhenry.com/jxchange/TPG/2008}Fee_Type" minOccurs="0"/&gt;
 *         &lt;element name="RedPrinc" type="{http://jackhenry.com/jxchange/TPG/2008}RedPrinc_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffCode" type="{http://jackhenry.com/jxchange/TPG/2008}OffCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="TrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="AvlBalCalcCode" type="{http://jackhenry.com/jxchange/TPG/2008}AvlBalCalcCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="XferSrcType" type="{http://jackhenry.com/jxchange/TPG/2008}XferSrcType_Type" minOccurs="0"/&gt;
 *             &lt;element name="DrTrnCodeCode" type="{http://jackhenry.com/jxchange/TPG/2008}TrnCodeCode_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="XferSrcDestRstrArray" type="{http://jackhenry.com/jxchange/TPG/2008}XferSrcDestRstrArray_AType" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="CrEftDescArray" type="{http://jackhenry.com/jxchange/TPG/2008}EftDesc_AType" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="EFTTrnId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTTrnId_Type" minOccurs="0"/&gt;
 *                   &lt;element name="TrnAcptTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}TrnAcptTimeDt_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;element name="ApprvOffInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}ApprvOffInfoArray_AType" minOccurs="0"/&gt;
 *                     &lt;sequence minOccurs="0"&gt;
 *                       &lt;element name="Ver_7" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_7_CType"/&gt;
 *                       &lt;element name="LnUnitId" type="{http://jackhenry.com/jxchange/TPG/2008}LnUnitId_Type" minOccurs="0"/&gt;
 *                       &lt;sequence minOccurs="0"&gt;
 *                         &lt;element name="Ver_8" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_8_CType"/&gt;
 *                         &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                       &lt;/sequence&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/sequence&gt;
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
@XmlType(name = "XferRec_CType", propOrder = {
    "amt",
    "eftDescArray",
    "prtRcpt",
    "fee",
    "redPrinc",
    "offCode",
    "ver1",
    "trnCodeCode",
    "ver2",
    "avlBalCalcCode",
    "xferSrcType",
    "drTrnCodeCode",
    "ver3",
    "xferSrcDestRstrArray",
    "ver4",
    "crEftDescArray",
    "ver5",
    "eftTrnId",
    "trnAcptTimeDt",
    "ver6",
    "apprvOffInfoArray",
    "ver7",
    "lnUnitId",
    "ver8",
    "any"
})
public class XferRecCType {

    @XmlElementRef(name = "Amt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AmtType> amt;
    @XmlElement(name = "EftDescArray")
    protected EftDescAType eftDescArray;
    @XmlElementRef(name = "PrtRcpt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtRcptType> prtRcpt;
    @XmlElementRef(name = "Fee", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FeeType> fee;
    @XmlElementRef(name = "RedPrinc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RedPrincType> redPrinc;
    @XmlElementRef(name = "OffCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<OffCodeType> offCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "TrnCodeCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnCodeCodeType> trnCodeCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "AvlBalCalcCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AvlBalCalcCodeType> avlBalCalcCode;
    @XmlElementRef(name = "XferSrcType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XferSrcTypeType> xferSrcType;
    @XmlElementRef(name = "DrTrnCodeCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TrnCodeCodeType> drTrnCodeCode;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "XferSrcDestRstrArray")
    protected XferSrcDestRstrArrayAType xferSrcDestRstrArray;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "CrEftDescArray")
    protected EftDescAType crEftDescArray;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "EFTTrnId")
    protected EFTTrnIdType eftTrnId;
    @XmlElement(name = "TrnAcptTimeDt")
    protected TrnAcptTimeDtType trnAcptTimeDt;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlElement(name = "ApprvOffInfoArray")
    protected ApprvOffInfoArrayAType apprvOffInfoArray;
    @XmlElement(name = "Ver_7")
    protected Ver7CType ver7;
    @XmlElement(name = "LnUnitId")
    protected LnUnitIdType lnUnitId;
    @XmlElement(name = "Ver_8")
    protected Ver8CType ver8;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmtType }{@code >}
     *     
     */
    public JAXBElement<AmtType> getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmtType }{@code >}
     *     
     */
    public void setAmt(JAXBElement<AmtType> value) {
        this.amt = value;
    }

    /**
     * Gets the value of the eftDescArray property.
     * 
     * @return
     *     possible object is
     *     {@link EftDescAType }
     *     
     */
    public EftDescAType getEftDescArray() {
        return eftDescArray;
    }

    /**
     * Sets the value of the eftDescArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EftDescAType }
     *     
     */
    public void setEftDescArray(EftDescAType value) {
        this.eftDescArray = value;
    }

    /**
     * Gets the value of the prtRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtRcptType }{@code >}
     *     
     */
    public JAXBElement<PrtRcptType> getPrtRcpt() {
        return prtRcpt;
    }

    /**
     * Sets the value of the prtRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtRcptType }{@code >}
     *     
     */
    public void setPrtRcpt(JAXBElement<PrtRcptType> value) {
        this.prtRcpt = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FeeType }{@code >}
     *     
     */
    public JAXBElement<FeeType> getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FeeType }{@code >}
     *     
     */
    public void setFee(JAXBElement<FeeType> value) {
        this.fee = value;
    }

    /**
     * Gets the value of the redPrinc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RedPrincType }{@code >}
     *     
     */
    public JAXBElement<RedPrincType> getRedPrinc() {
        return redPrinc;
    }

    /**
     * Sets the value of the redPrinc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RedPrincType }{@code >}
     *     
     */
    public void setRedPrinc(JAXBElement<RedPrincType> value) {
        this.redPrinc = value;
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
     * Gets the value of the trnCodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnCodeCodeType }{@code >}
     *     
     */
    public JAXBElement<TrnCodeCodeType> getTrnCodeCode() {
        return trnCodeCode;
    }

    /**
     * Sets the value of the trnCodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnCodeCodeType }{@code >}
     *     
     */
    public void setTrnCodeCode(JAXBElement<TrnCodeCodeType> value) {
        this.trnCodeCode = value;
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
     * Gets the value of the avlBalCalcCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AvlBalCalcCodeType }{@code >}
     *     
     */
    public JAXBElement<AvlBalCalcCodeType> getAvlBalCalcCode() {
        return avlBalCalcCode;
    }

    /**
     * Sets the value of the avlBalCalcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AvlBalCalcCodeType }{@code >}
     *     
     */
    public void setAvlBalCalcCode(JAXBElement<AvlBalCalcCodeType> value) {
        this.avlBalCalcCode = value;
    }

    /**
     * Gets the value of the xferSrcType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XferSrcTypeType }{@code >}
     *     
     */
    public JAXBElement<XferSrcTypeType> getXferSrcType() {
        return xferSrcType;
    }

    /**
     * Sets the value of the xferSrcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XferSrcTypeType }{@code >}
     *     
     */
    public void setXferSrcType(JAXBElement<XferSrcTypeType> value) {
        this.xferSrcType = value;
    }

    /**
     * Gets the value of the drTrnCodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrnCodeCodeType }{@code >}
     *     
     */
    public JAXBElement<TrnCodeCodeType> getDrTrnCodeCode() {
        return drTrnCodeCode;
    }

    /**
     * Sets the value of the drTrnCodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrnCodeCodeType }{@code >}
     *     
     */
    public void setDrTrnCodeCode(JAXBElement<TrnCodeCodeType> value) {
        this.drTrnCodeCode = value;
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
     * Gets the value of the xferSrcDestRstrArray property.
     * 
     * @return
     *     possible object is
     *     {@link XferSrcDestRstrArrayAType }
     *     
     */
    public XferSrcDestRstrArrayAType getXferSrcDestRstrArray() {
        return xferSrcDestRstrArray;
    }

    /**
     * Sets the value of the xferSrcDestRstrArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferSrcDestRstrArrayAType }
     *     
     */
    public void setXferSrcDestRstrArray(XferSrcDestRstrArrayAType value) {
        this.xferSrcDestRstrArray = value;
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
     * Gets the value of the crEftDescArray property.
     * 
     * @return
     *     possible object is
     *     {@link EftDescAType }
     *     
     */
    public EftDescAType getCrEftDescArray() {
        return crEftDescArray;
    }

    /**
     * Sets the value of the crEftDescArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EftDescAType }
     *     
     */
    public void setCrEftDescArray(EftDescAType value) {
        this.crEftDescArray = value;
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
     * Gets the value of the eftTrnId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTTrnIdType }
     *     
     */
    public EFTTrnIdType getEFTTrnId() {
        return eftTrnId;
    }

    /**
     * Sets the value of the eftTrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTTrnIdType }
     *     
     */
    public void setEFTTrnId(EFTTrnIdType value) {
        this.eftTrnId = value;
    }

    /**
     * Gets the value of the trnAcptTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link TrnAcptTimeDtType }
     *     
     */
    public TrnAcptTimeDtType getTrnAcptTimeDt() {
        return trnAcptTimeDt;
    }

    /**
     * Sets the value of the trnAcptTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnAcptTimeDtType }
     *     
     */
    public void setTrnAcptTimeDt(TrnAcptTimeDtType value) {
        this.trnAcptTimeDt = value;
    }

    /**
     * Gets the value of the ver6 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver6CType }
     *     
     */
    public Ver6CType getVer6() {
        return ver6;
    }

    /**
     * Sets the value of the ver6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver6CType }
     *     
     */
    public void setVer6(Ver6CType value) {
        this.ver6 = value;
    }

    /**
     * Gets the value of the apprvOffInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link ApprvOffInfoArrayAType }
     *     
     */
    public ApprvOffInfoArrayAType getApprvOffInfoArray() {
        return apprvOffInfoArray;
    }

    /**
     * Sets the value of the apprvOffInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprvOffInfoArrayAType }
     *     
     */
    public void setApprvOffInfoArray(ApprvOffInfoArrayAType value) {
        this.apprvOffInfoArray = value;
    }

    /**
     * Gets the value of the ver7 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver7CType }
     *     
     */
    public Ver7CType getVer7() {
        return ver7;
    }

    /**
     * Sets the value of the ver7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver7CType }
     *     
     */
    public void setVer7(Ver7CType value) {
        this.ver7 = value;
    }

    /**
     * Gets the value of the lnUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link LnUnitIdType }
     *     
     */
    public LnUnitIdType getLnUnitId() {
        return lnUnitId;
    }

    /**
     * Sets the value of the lnUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnUnitIdType }
     *     
     */
    public void setLnUnitId(LnUnitIdType value) {
        this.lnUnitId = value;
    }

    /**
     * Gets the value of the ver8 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver8CType }
     *     
     */
    public Ver8CType getVer8() {
        return ver8;
    }

    /**
     * Sets the value of the ver8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver8CType }
     *     
     */
    public void setVer8(Ver8CType value) {
        this.ver8 = value;
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
