
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
 * <p>Java class for FDICInsurInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FDICInsurInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FDICInsurChgRate" type="{http://jackhenry.com/jxchange/TPG/2008}FDICInsurChgRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="FDICInsurChgCalcType" type="{http://jackhenry.com/jxchange/TPG/2008}FDICInsurChgCalcType_Type" minOccurs="0"/&gt;
 *         &lt;element name="FDICInsurTolrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}FDICInsurTolrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FinInstAdminFeePct" type="{http://jackhenry.com/jxchange/TPG/2008}FinInstAdminFeePct_Type" minOccurs="0"/&gt;
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
@XmlType(name = "FDICInsurInfoRec_CType", propOrder = {
    "fdicInsurChgRate",
    "fdicInsurChgCalcType",
    "fdicInsurTolrAmt",
    "finInstAdminFeePct",
    "ver1",
    "any"
})
public class FDICInsurInfoRecCType {

    @XmlElementRef(name = "FDICInsurChgRate", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FDICInsurChgRateType> fdicInsurChgRate;
    @XmlElementRef(name = "FDICInsurChgCalcType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FDICInsurChgCalcTypeType> fdicInsurChgCalcType;
    @XmlElement(name = "FDICInsurTolrAmt")
    protected FDICInsurTolrAmtType fdicInsurTolrAmt;
    @XmlElement(name = "FinInstAdminFeePct")
    protected FinInstAdminFeePctType finInstAdminFeePct;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the fdicInsurChgRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FDICInsurChgRateType }{@code >}
     *     
     */
    public JAXBElement<FDICInsurChgRateType> getFDICInsurChgRate() {
        return fdicInsurChgRate;
    }

    /**
     * Sets the value of the fdicInsurChgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FDICInsurChgRateType }{@code >}
     *     
     */
    public void setFDICInsurChgRate(JAXBElement<FDICInsurChgRateType> value) {
        this.fdicInsurChgRate = value;
    }

    /**
     * Gets the value of the fdicInsurChgCalcType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FDICInsurChgCalcTypeType }{@code >}
     *     
     */
    public JAXBElement<FDICInsurChgCalcTypeType> getFDICInsurChgCalcType() {
        return fdicInsurChgCalcType;
    }

    /**
     * Sets the value of the fdicInsurChgCalcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FDICInsurChgCalcTypeType }{@code >}
     *     
     */
    public void setFDICInsurChgCalcType(JAXBElement<FDICInsurChgCalcTypeType> value) {
        this.fdicInsurChgCalcType = value;
    }

    /**
     * Gets the value of the fdicInsurTolrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FDICInsurTolrAmtType }
     *     
     */
    public FDICInsurTolrAmtType getFDICInsurTolrAmt() {
        return fdicInsurTolrAmt;
    }

    /**
     * Sets the value of the fdicInsurTolrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FDICInsurTolrAmtType }
     *     
     */
    public void setFDICInsurTolrAmt(FDICInsurTolrAmtType value) {
        this.fdicInsurTolrAmt = value;
    }

    /**
     * Gets the value of the finInstAdminFeePct property.
     * 
     * @return
     *     possible object is
     *     {@link FinInstAdminFeePctType }
     *     
     */
    public FinInstAdminFeePctType getFinInstAdminFeePct() {
        return finInstAdminFeePct;
    }

    /**
     * Sets the value of the finInstAdminFeePct property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinInstAdminFeePctType }
     *     
     */
    public void setFinInstAdminFeePct(FinInstAdminFeePctType value) {
        this.finInstAdminFeePct = value;
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
