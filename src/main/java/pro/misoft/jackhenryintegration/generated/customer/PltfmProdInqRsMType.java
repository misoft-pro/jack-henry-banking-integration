
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
 *  Platform Product Inquiry Response 
 * 
 * <p>Java class for PltfmProdInqRs_MType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmProdInqRs_MType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsHdr" type="{http://jackhenry.com/jxchange/TPG/2008}MsgRsHdr_CType"/&gt;
 *         &lt;element name="PltfmProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://jackhenry.com/jxchange/TPG/2008}RegionCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmClsfPrimType" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmClsfPrimType_Type" minOccurs="0"/&gt;
 *         &lt;element name="TaxFavProdType" type="{http://jackhenry.com/jxchange/TPG/2008}TaxFavProdType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrCode" type="{http://jackhenry.com/jxchange/TPG/2008}BrCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActIntent" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntent_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActIntentKey" type="{http://jackhenry.com/jxchange/TPG/2008}ActIntentKey_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmProdInqRec" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmProdInqRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="x_ListItemsArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_ListItemsArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="x_TextItemsArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_TextItemsArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="x_ImgItemsArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_ImgItemsArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="x_WebPgArray" type="{http://jackhenry.com/jxchange/TPG/2008}x_WebPgArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmProdInqRs_MType", propOrder = {
    "msgRsHdr",
    "pltfmProdCode",
    "regionCode",
    "pltfmClsfPrimType",
    "taxFavProdType",
    "brCode",
    "actIntent",
    "actIntentKey",
    "pltfmProdInqRec",
    "xListItemsArray",
    "xTextItemsArray",
    "xImgItemsArray",
    "xWebPgArray",
    "custom",
    "ver1",
    "any"
})
public class PltfmProdInqRsMType {

    @XmlElement(name = "MsgRsHdr", required = true)
    protected MsgRsHdrCType msgRsHdr;
    @XmlElementRef(name = "PltfmProdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ProdCodeType> pltfmProdCode;
    @XmlElementRef(name = "RegionCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionCodeType> regionCode;
    @XmlElementRef(name = "PltfmClsfPrimType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmClsfPrimTypeType> pltfmClsfPrimType;
    @XmlElementRef(name = "TaxFavProdType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxFavProdTypeType> taxFavProdType;
    @XmlElementRef(name = "BrCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BrCodeType> brCode;
    @XmlElementRef(name = "ActIntent", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentType> actIntent;
    @XmlElementRef(name = "ActIntentKey", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ActIntentKeyType> actIntentKey;
    @XmlElementRef(name = "PltfmProdInqRec", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PltfmProdInqRecCType> pltfmProdInqRec;
    @XmlElementRef(name = "x_ListItemsArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XListItemsArrayAType> xListItemsArray;
    @XmlElementRef(name = "x_TextItemsArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XTextItemsArrayAType> xTextItemsArray;
    @XmlElementRef(name = "x_ImgItemsArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XImgItemsArrayAType> xImgItemsArray;
    @XmlElementRef(name = "x_WebPgArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XWebPgArrayAType> xWebPgArray;
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
     * Gets the value of the pltfmProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProdCodeType }{@code >}
     *     
     */
    public JAXBElement<ProdCodeType> getPltfmProdCode() {
        return pltfmProdCode;
    }

    /**
     * Sets the value of the pltfmProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProdCodeType }{@code >}
     *     
     */
    public void setPltfmProdCode(JAXBElement<ProdCodeType> value) {
        this.pltfmProdCode = value;
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionCodeType }{@code >}
     *     
     */
    public JAXBElement<RegionCodeType> getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionCodeType }{@code >}
     *     
     */
    public void setRegionCode(JAXBElement<RegionCodeType> value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the pltfmClsfPrimType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmClsfPrimTypeType }{@code >}
     *     
     */
    public JAXBElement<PltfmClsfPrimTypeType> getPltfmClsfPrimType() {
        return pltfmClsfPrimType;
    }

    /**
     * Sets the value of the pltfmClsfPrimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmClsfPrimTypeType }{@code >}
     *     
     */
    public void setPltfmClsfPrimType(JAXBElement<PltfmClsfPrimTypeType> value) {
        this.pltfmClsfPrimType = value;
    }

    /**
     * Gets the value of the taxFavProdType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TaxFavProdTypeType }{@code >}
     *     
     */
    public JAXBElement<TaxFavProdTypeType> getTaxFavProdType() {
        return taxFavProdType;
    }

    /**
     * Sets the value of the taxFavProdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TaxFavProdTypeType }{@code >}
     *     
     */
    public void setTaxFavProdType(JAXBElement<TaxFavProdTypeType> value) {
        this.taxFavProdType = value;
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
     * Gets the value of the actIntent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}
     *     
     */
    public JAXBElement<ActIntentType> getActIntent() {
        return actIntent;
    }

    /**
     * Sets the value of the actIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActIntentType }{@code >}
     *     
     */
    public void setActIntent(JAXBElement<ActIntentType> value) {
        this.actIntent = value;
    }

    /**
     * Gets the value of the actIntentKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}
     *     
     */
    public JAXBElement<ActIntentKeyType> getActIntentKey() {
        return actIntentKey;
    }

    /**
     * Sets the value of the actIntentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActIntentKeyType }{@code >}
     *     
     */
    public void setActIntentKey(JAXBElement<ActIntentKeyType> value) {
        this.actIntentKey = value;
    }

    /**
     * Gets the value of the pltfmProdInqRec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PltfmProdInqRecCType }{@code >}
     *     
     */
    public JAXBElement<PltfmProdInqRecCType> getPltfmProdInqRec() {
        return pltfmProdInqRec;
    }

    /**
     * Sets the value of the pltfmProdInqRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PltfmProdInqRecCType }{@code >}
     *     
     */
    public void setPltfmProdInqRec(JAXBElement<PltfmProdInqRecCType> value) {
        this.pltfmProdInqRec = value;
    }

    /**
     * Gets the value of the xListItemsArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XListItemsArrayAType }{@code >}
     *     
     */
    public JAXBElement<XListItemsArrayAType> getXListItemsArray() {
        return xListItemsArray;
    }

    /**
     * Sets the value of the xListItemsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XListItemsArrayAType }{@code >}
     *     
     */
    public void setXListItemsArray(JAXBElement<XListItemsArrayAType> value) {
        this.xListItemsArray = value;
    }

    /**
     * Gets the value of the xTextItemsArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XTextItemsArrayAType }{@code >}
     *     
     */
    public JAXBElement<XTextItemsArrayAType> getXTextItemsArray() {
        return xTextItemsArray;
    }

    /**
     * Sets the value of the xTextItemsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XTextItemsArrayAType }{@code >}
     *     
     */
    public void setXTextItemsArray(JAXBElement<XTextItemsArrayAType> value) {
        this.xTextItemsArray = value;
    }

    /**
     * Gets the value of the xImgItemsArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XImgItemsArrayAType }{@code >}
     *     
     */
    public JAXBElement<XImgItemsArrayAType> getXImgItemsArray() {
        return xImgItemsArray;
    }

    /**
     * Sets the value of the xImgItemsArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XImgItemsArrayAType }{@code >}
     *     
     */
    public void setXImgItemsArray(JAXBElement<XImgItemsArrayAType> value) {
        this.xImgItemsArray = value;
    }

    /**
     * Gets the value of the xWebPgArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XWebPgArrayAType }{@code >}
     *     
     */
    public JAXBElement<XWebPgArrayAType> getXWebPgArray() {
        return xWebPgArray;
    }

    /**
     * Sets the value of the xWebPgArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XWebPgArrayAType }{@code >}
     *     
     */
    public void setXWebPgArray(JAXBElement<XWebPgArrayAType> value) {
        this.xWebPgArray = value;
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
