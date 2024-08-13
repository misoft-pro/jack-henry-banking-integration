
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for AcctProdOvrrdInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctProdOvrrdInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProdBaseInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}ProdBaseInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="ODInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}ODInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="FDICInsurInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}FDICInsurInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="XferInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}XferInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="RedSerChgInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}RedSerChgInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="EFTChgInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}EFTChgInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="XsDrChgInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}XsDrChgInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="SerChgTierInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgTierInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="TrnActTierInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}TrnActTierInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="SerChgRelInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgRelInfoRec_CType" minOccurs="0"/&gt;
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
@XmlType(name = "AcctProdOvrrdInfoRec_CType", propOrder = {
    "prodBaseInfoRec",
    "odInfoRec",
    "fdicInsurInfoRec",
    "xferInfoRec",
    "redSerChgInfoRec",
    "eftChgInfoArray",
    "xsDrChgInfoArray",
    "serChgTierInfoArray",
    "trnActTierInfoArray",
    "serChgRelInfoRec",
    "ver1",
    "any"
})
public class AcctProdOvrrdInfoRecCType {

    @XmlElement(name = "ProdBaseInfoRec")
    protected ProdBaseInfoRecCType prodBaseInfoRec;
    @XmlElement(name = "ODInfoRec")
    protected ODInfoRecCType odInfoRec;
    @XmlElement(name = "FDICInsurInfoRec")
    protected FDICInsurInfoRecCType fdicInsurInfoRec;
    @XmlElement(name = "XferInfoRec")
    protected XferInfoRecCType xferInfoRec;
    @XmlElement(name = "RedSerChgInfoRec")
    protected RedSerChgInfoRecCType redSerChgInfoRec;
    @XmlElement(name = "EFTChgInfoArray")
    protected EFTChgInfoArrayAType eftChgInfoArray;
    @XmlElement(name = "XsDrChgInfoArray")
    protected XsDrChgInfoArrayAType xsDrChgInfoArray;
    @XmlElement(name = "SerChgTierInfoArray")
    protected SerChgTierInfoArrayAType serChgTierInfoArray;
    @XmlElement(name = "TrnActTierInfoArray")
    protected TrnActTierInfoArrayAType trnActTierInfoArray;
    @XmlElement(name = "SerChgRelInfoRec")
    protected SerChgRelInfoRecCType serChgRelInfoRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the prodBaseInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link ProdBaseInfoRecCType }
     *     
     */
    public ProdBaseInfoRecCType getProdBaseInfoRec() {
        return prodBaseInfoRec;
    }

    /**
     * Sets the value of the prodBaseInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdBaseInfoRecCType }
     *     
     */
    public void setProdBaseInfoRec(ProdBaseInfoRecCType value) {
        this.prodBaseInfoRec = value;
    }

    /**
     * Gets the value of the odInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link ODInfoRecCType }
     *     
     */
    public ODInfoRecCType getODInfoRec() {
        return odInfoRec;
    }

    /**
     * Sets the value of the odInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODInfoRecCType }
     *     
     */
    public void setODInfoRec(ODInfoRecCType value) {
        this.odInfoRec = value;
    }

    /**
     * Gets the value of the fdicInsurInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link FDICInsurInfoRecCType }
     *     
     */
    public FDICInsurInfoRecCType getFDICInsurInfoRec() {
        return fdicInsurInfoRec;
    }

    /**
     * Sets the value of the fdicInsurInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link FDICInsurInfoRecCType }
     *     
     */
    public void setFDICInsurInfoRec(FDICInsurInfoRecCType value) {
        this.fdicInsurInfoRec = value;
    }

    /**
     * Gets the value of the xferInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link XferInfoRecCType }
     *     
     */
    public XferInfoRecCType getXferInfoRec() {
        return xferInfoRec;
    }

    /**
     * Sets the value of the xferInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link XferInfoRecCType }
     *     
     */
    public void setXferInfoRec(XferInfoRecCType value) {
        this.xferInfoRec = value;
    }

    /**
     * Gets the value of the redSerChgInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link RedSerChgInfoRecCType }
     *     
     */
    public RedSerChgInfoRecCType getRedSerChgInfoRec() {
        return redSerChgInfoRec;
    }

    /**
     * Sets the value of the redSerChgInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedSerChgInfoRecCType }
     *     
     */
    public void setRedSerChgInfoRec(RedSerChgInfoRecCType value) {
        this.redSerChgInfoRec = value;
    }

    /**
     * Gets the value of the eftChgInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link EFTChgInfoArrayAType }
     *     
     */
    public EFTChgInfoArrayAType getEFTChgInfoArray() {
        return eftChgInfoArray;
    }

    /**
     * Sets the value of the eftChgInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTChgInfoArrayAType }
     *     
     */
    public void setEFTChgInfoArray(EFTChgInfoArrayAType value) {
        this.eftChgInfoArray = value;
    }

    /**
     * Gets the value of the xsDrChgInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link XsDrChgInfoArrayAType }
     *     
     */
    public XsDrChgInfoArrayAType getXsDrChgInfoArray() {
        return xsDrChgInfoArray;
    }

    /**
     * Sets the value of the xsDrChgInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link XsDrChgInfoArrayAType }
     *     
     */
    public void setXsDrChgInfoArray(XsDrChgInfoArrayAType value) {
        this.xsDrChgInfoArray = value;
    }

    /**
     * Gets the value of the serChgTierInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link SerChgTierInfoArrayAType }
     *     
     */
    public SerChgTierInfoArrayAType getSerChgTierInfoArray() {
        return serChgTierInfoArray;
    }

    /**
     * Sets the value of the serChgTierInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerChgTierInfoArrayAType }
     *     
     */
    public void setSerChgTierInfoArray(SerChgTierInfoArrayAType value) {
        this.serChgTierInfoArray = value;
    }

    /**
     * Gets the value of the trnActTierInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link TrnActTierInfoArrayAType }
     *     
     */
    public TrnActTierInfoArrayAType getTrnActTierInfoArray() {
        return trnActTierInfoArray;
    }

    /**
     * Sets the value of the trnActTierInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnActTierInfoArrayAType }
     *     
     */
    public void setTrnActTierInfoArray(TrnActTierInfoArrayAType value) {
        this.trnActTierInfoArray = value;
    }

    /**
     * Gets the value of the serChgRelInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link SerChgRelInfoRecCType }
     *     
     */
    public SerChgRelInfoRecCType getSerChgRelInfoRec() {
        return serChgRelInfoRec;
    }

    /**
     * Sets the value of the serChgRelInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerChgRelInfoRecCType }
     *     
     */
    public void setSerChgRelInfoRec(SerChgRelInfoRecCType value) {
        this.serChgRelInfoRec = value;
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
