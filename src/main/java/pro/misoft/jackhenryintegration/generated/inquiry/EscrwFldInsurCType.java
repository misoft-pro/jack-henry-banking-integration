
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
 * <p>Java class for EscrwFldInsur_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EscrwFldInsur_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FldInsurInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}FldInsurInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="FldInsurDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FldInsurDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FldZoneDtrContractDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FldZoneDtrContractDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomEscrwFldInsur" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EscrwId" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EscrwFldInsur_CType", propOrder = {
    "fldInsurInfoRec",
    "fldInsurDesc",
    "fldZoneDtrContractDesc",
    "customEscrwFldInsur",
    "ver1",
    "escrwId",
    "ver2",
    "any"
})
public class EscrwFldInsurCType {

    @XmlElement(name = "FldInsurInfoRec")
    protected FldInsurInfoRecCType fldInsurInfoRec;
    @XmlElement(name = "FldInsurDesc")
    protected FldInsurDescType fldInsurDesc;
    @XmlElement(name = "FldZoneDtrContractDesc")
    protected FldZoneDtrContractDescType fldZoneDtrContractDesc;
    @XmlElement(name = "CustomEscrwFldInsur")
    protected CustomCType customEscrwFldInsur;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "EscrwId")
    protected EscrwIdType escrwId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the fldInsurInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link FldInsurInfoRecCType }
     *     
     */
    public FldInsurInfoRecCType getFldInsurInfoRec() {
        return fldInsurInfoRec;
    }

    /**
     * Sets the value of the fldInsurInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link FldInsurInfoRecCType }
     *     
     */
    public void setFldInsurInfoRec(FldInsurInfoRecCType value) {
        this.fldInsurInfoRec = value;
    }

    /**
     * Gets the value of the fldInsurDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FldInsurDescType }
     *     
     */
    public FldInsurDescType getFldInsurDesc() {
        return fldInsurDesc;
    }

    /**
     * Sets the value of the fldInsurDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FldInsurDescType }
     *     
     */
    public void setFldInsurDesc(FldInsurDescType value) {
        this.fldInsurDesc = value;
    }

    /**
     * Gets the value of the fldZoneDtrContractDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FldZoneDtrContractDescType }
     *     
     */
    public FldZoneDtrContractDescType getFldZoneDtrContractDesc() {
        return fldZoneDtrContractDesc;
    }

    /**
     * Sets the value of the fldZoneDtrContractDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FldZoneDtrContractDescType }
     *     
     */
    public void setFldZoneDtrContractDesc(FldZoneDtrContractDescType value) {
        this.fldZoneDtrContractDesc = value;
    }

    /**
     * Gets the value of the customEscrwFldInsur property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomEscrwFldInsur() {
        return customEscrwFldInsur;
    }

    /**
     * Sets the value of the customEscrwFldInsur property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomEscrwFldInsur(CustomCType value) {
        this.customEscrwFldInsur = value;
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
     * Gets the value of the escrwId property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwIdType }
     *     
     */
    public EscrwIdType getEscrwId() {
        return escrwId;
    }

    /**
     * Sets the value of the escrwId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwIdType }
     *     
     */
    public void setEscrwId(EscrwIdType value) {
        this.escrwId = value;
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
