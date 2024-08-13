
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for LnBilRsInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnBilRsInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BilDueDt" type="{http://jackhenry.com/jxchange/TPG/2008}BilDueDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilCrtDt" type="{http://jackhenry.com/jxchange/TPG/2008}BilCrtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtBilNotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrtBilNotDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LnBilInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}LnBilInfoRec_CType"/&gt;
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
@XmlType(name = "LnBilRsInfoRec_CType", propOrder = {
    "bilDueDt",
    "bilCrtDt",
    "prtBilNotDesc",
    "lnBilInfoRec",
    "custom",
    "ver1",
    "any"
})
public class LnBilRsInfoRecCType {

    @XmlElement(name = "BilDueDt")
    protected BilDueDtType bilDueDt;
    @XmlElement(name = "BilCrtDt")
    protected BilCrtDtType bilCrtDt;
    @XmlElement(name = "PrtBilNotDesc")
    protected PrtBilNotDescType prtBilNotDesc;
    @XmlElement(name = "LnBilInfoRec", required = true)
    protected LnBilInfoRecCType lnBilInfoRec;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the bilDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link BilDueDtType }
     *     
     */
    public BilDueDtType getBilDueDt() {
        return bilDueDt;
    }

    /**
     * Sets the value of the bilDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilDueDtType }
     *     
     */
    public void setBilDueDt(BilDueDtType value) {
        this.bilDueDt = value;
    }

    /**
     * Gets the value of the bilCrtDt property.
     * 
     * @return
     *     possible object is
     *     {@link BilCrtDtType }
     *     
     */
    public BilCrtDtType getBilCrtDt() {
        return bilCrtDt;
    }

    /**
     * Sets the value of the bilCrtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilCrtDtType }
     *     
     */
    public void setBilCrtDt(BilCrtDtType value) {
        this.bilCrtDt = value;
    }

    /**
     * Gets the value of the prtBilNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrtBilNotDescType }
     *     
     */
    public PrtBilNotDescType getPrtBilNotDesc() {
        return prtBilNotDesc;
    }

    /**
     * Sets the value of the prtBilNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtBilNotDescType }
     *     
     */
    public void setPrtBilNotDesc(PrtBilNotDescType value) {
        this.prtBilNotDesc = value;
    }

    /**
     * Gets the value of the lnBilInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link LnBilInfoRecCType }
     *     
     */
    public LnBilInfoRecCType getLnBilInfoRec() {
        return lnBilInfoRec;
    }

    /**
     * Sets the value of the lnBilInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnBilInfoRecCType }
     *     
     */
    public void setLnBilInfoRec(LnBilInfoRecCType value) {
        this.lnBilInfoRec = value;
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
