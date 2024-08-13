
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
 * <p>Java class for x_EscrwAnlys_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_EscrwAnlys_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EscrwAnlysInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwAnlysInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="EscrwARMNotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwARMNotDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDefcGEPmtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDefcGEPmtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwDefcLTPmtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwDefcLTPmtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwShtGEPmtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwShtGEPmtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwShtLTPmtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwShtLTPmtDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwNonAccrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwNonAccrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwAnlysCusDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwAnlysCusDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_EscrwAnlys_CType", propOrder = {
    "escrwAnlysInfoRec",
    "escrwARMNotDesc",
    "escrwDefcGEPmtDesc",
    "escrwDefcLTPmtDesc",
    "escrwShtGEPmtDesc",
    "escrwShtLTPmtDesc",
    "escrwNonAccrDesc",
    "escrwAnlysCusDesc",
    "custom",
    "ver1",
    "any"
})
public class XEscrwAnlysCType {

    @XmlElement(name = "EscrwAnlysInfoRec")
    protected EscrwAnlysInfoRecCType escrwAnlysInfoRec;
    @XmlElement(name = "EscrwARMNotDesc")
    protected EscrwARMNotDescType escrwARMNotDesc;
    @XmlElement(name = "EscrwDefcGEPmtDesc")
    protected EscrwDefcGEPmtDescType escrwDefcGEPmtDesc;
    @XmlElement(name = "EscrwDefcLTPmtDesc")
    protected EscrwDefcLTPmtDescType escrwDefcLTPmtDesc;
    @XmlElement(name = "EscrwShtGEPmtDesc")
    protected EscrwShtGEPmtDescType escrwShtGEPmtDesc;
    @XmlElement(name = "EscrwShtLTPmtDesc")
    protected EscrwShtLTPmtDescType escrwShtLTPmtDesc;
    @XmlElement(name = "EscrwNonAccrDesc")
    protected EscrwNonAccrDescType escrwNonAccrDesc;
    @XmlElement(name = "EscrwAnlysCusDesc")
    protected EscrwAnlysCusDescType escrwAnlysCusDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the escrwAnlysInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwAnlysInfoRecCType }
     *     
     */
    public EscrwAnlysInfoRecCType getEscrwAnlysInfoRec() {
        return escrwAnlysInfoRec;
    }

    /**
     * Sets the value of the escrwAnlysInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwAnlysInfoRecCType }
     *     
     */
    public void setEscrwAnlysInfoRec(EscrwAnlysInfoRecCType value) {
        this.escrwAnlysInfoRec = value;
    }

    /**
     * Gets the value of the escrwARMNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwARMNotDescType }
     *     
     */
    public EscrwARMNotDescType getEscrwARMNotDesc() {
        return escrwARMNotDesc;
    }

    /**
     * Sets the value of the escrwARMNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwARMNotDescType }
     *     
     */
    public void setEscrwARMNotDesc(EscrwARMNotDescType value) {
        this.escrwARMNotDesc = value;
    }

    /**
     * Gets the value of the escrwDefcGEPmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwDefcGEPmtDescType }
     *     
     */
    public EscrwDefcGEPmtDescType getEscrwDefcGEPmtDesc() {
        return escrwDefcGEPmtDesc;
    }

    /**
     * Sets the value of the escrwDefcGEPmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwDefcGEPmtDescType }
     *     
     */
    public void setEscrwDefcGEPmtDesc(EscrwDefcGEPmtDescType value) {
        this.escrwDefcGEPmtDesc = value;
    }

    /**
     * Gets the value of the escrwDefcLTPmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwDefcLTPmtDescType }
     *     
     */
    public EscrwDefcLTPmtDescType getEscrwDefcLTPmtDesc() {
        return escrwDefcLTPmtDesc;
    }

    /**
     * Sets the value of the escrwDefcLTPmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwDefcLTPmtDescType }
     *     
     */
    public void setEscrwDefcLTPmtDesc(EscrwDefcLTPmtDescType value) {
        this.escrwDefcLTPmtDesc = value;
    }

    /**
     * Gets the value of the escrwShtGEPmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwShtGEPmtDescType }
     *     
     */
    public EscrwShtGEPmtDescType getEscrwShtGEPmtDesc() {
        return escrwShtGEPmtDesc;
    }

    /**
     * Sets the value of the escrwShtGEPmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwShtGEPmtDescType }
     *     
     */
    public void setEscrwShtGEPmtDesc(EscrwShtGEPmtDescType value) {
        this.escrwShtGEPmtDesc = value;
    }

    /**
     * Gets the value of the escrwShtLTPmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwShtLTPmtDescType }
     *     
     */
    public EscrwShtLTPmtDescType getEscrwShtLTPmtDesc() {
        return escrwShtLTPmtDesc;
    }

    /**
     * Sets the value of the escrwShtLTPmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwShtLTPmtDescType }
     *     
     */
    public void setEscrwShtLTPmtDesc(EscrwShtLTPmtDescType value) {
        this.escrwShtLTPmtDesc = value;
    }

    /**
     * Gets the value of the escrwNonAccrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwNonAccrDescType }
     *     
     */
    public EscrwNonAccrDescType getEscrwNonAccrDesc() {
        return escrwNonAccrDesc;
    }

    /**
     * Sets the value of the escrwNonAccrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwNonAccrDescType }
     *     
     */
    public void setEscrwNonAccrDesc(EscrwNonAccrDescType value) {
        this.escrwNonAccrDesc = value;
    }

    /**
     * Gets the value of the escrwAnlysCusDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwAnlysCusDescType }
     *     
     */
    public EscrwAnlysCusDescType getEscrwAnlysCusDesc() {
        return escrwAnlysCusDesc;
    }

    /**
     * Sets the value of the escrwAnlysCusDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwAnlysCusDescType }
     *     
     */
    public void setEscrwAnlysCusDesc(EscrwAnlysCusDescType value) {
        this.escrwAnlysCusDesc = value;
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
