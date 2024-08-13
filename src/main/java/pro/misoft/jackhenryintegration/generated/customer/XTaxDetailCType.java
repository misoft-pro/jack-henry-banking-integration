
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for x_TaxDetail_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_TaxDetail_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxDetail" type="{http://jackhenry.com/jxchange/TPG/2008}TaxDetail_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="FedWithDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FedWithDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="StateWithDesc" type="{http://jackhenry.com/jxchange/TPG/2008}StateWithDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_TaxDetail_CType", propOrder = {
    "taxDetail",
    "ver1",
    "fedWithDesc",
    "stateWithDesc",
    "ver2",
    "any"
})
public class XTaxDetailCType {

    @XmlElement(name = "TaxDetail")
    protected TaxDetailCType taxDetail;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "FedWithDesc")
    protected FedWithDescType fedWithDesc;
    @XmlElement(name = "StateWithDesc")
    protected StateWithDescType stateWithDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the taxDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailCType }
     *     
     */
    public TaxDetailCType getTaxDetail() {
        return taxDetail;
    }

    /**
     * Sets the value of the taxDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailCType }
     *     
     */
    public void setTaxDetail(TaxDetailCType value) {
        this.taxDetail = value;
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
     * Gets the value of the fedWithDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FedWithDescType }
     *     
     */
    public FedWithDescType getFedWithDesc() {
        return fedWithDesc;
    }

    /**
     * Sets the value of the fedWithDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FedWithDescType }
     *     
     */
    public void setFedWithDesc(FedWithDescType value) {
        this.fedWithDesc = value;
    }

    /**
     * Gets the value of the stateWithDesc property.
     * 
     * @return
     *     possible object is
     *     {@link StateWithDescType }
     *     
     */
    public StateWithDescType getStateWithDesc() {
        return stateWithDesc;
    }

    /**
     * Sets the value of the stateWithDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateWithDescType }
     *     
     */
    public void setStateWithDesc(StateWithDescType value) {
        this.stateWithDesc = value;
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
