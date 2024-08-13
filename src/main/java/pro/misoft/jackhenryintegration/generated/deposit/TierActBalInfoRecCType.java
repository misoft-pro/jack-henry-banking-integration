
package pro.misoft.jackhenryintegration.generated.deposit;

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
 * <p>Java class for TierActBalInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierActBalInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TierChgOrder" type="{http://jackhenry.com/jxchange/TPG/2008}TierChgOrder_Type"/&gt;
 *         &lt;element name="TierChgCalcType" type="{http://jackhenry.com/jxchange/TPG/2008}TierChgCalcType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SerChgLvlAlgSymb" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgLvlAlgSymb_Type" minOccurs="0"/&gt;
 *         &lt;element name="TierBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}TierBalAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TierActBalInfoRec_CType", propOrder = {
    "tierChgOrder",
    "tierChgCalcType",
    "serChgLvlAlgSymb",
    "tierBalAmt",
    "ver1",
    "any"
})
public class TierActBalInfoRecCType {

    @XmlElement(name = "TierChgOrder", required = true)
    protected TierChgOrderType tierChgOrder;
    @XmlElementRef(name = "TierChgCalcType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TierChgCalcTypeType> tierChgCalcType;
    @XmlElementRef(name = "SerChgLvlAlgSymb", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SerChgLvlAlgSymbType> serChgLvlAlgSymb;
    @XmlElementRef(name = "TierBalAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<TierBalAmtType> tierBalAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the tierChgOrder property.
     * 
     * @return
     *     possible object is
     *     {@link TierChgOrderType }
     *     
     */
    public TierChgOrderType getTierChgOrder() {
        return tierChgOrder;
    }

    /**
     * Sets the value of the tierChgOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierChgOrderType }
     *     
     */
    public void setTierChgOrder(TierChgOrderType value) {
        this.tierChgOrder = value;
    }

    /**
     * Gets the value of the tierChgCalcType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TierChgCalcTypeType }{@code >}
     *     
     */
    public JAXBElement<TierChgCalcTypeType> getTierChgCalcType() {
        return tierChgCalcType;
    }

    /**
     * Sets the value of the tierChgCalcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TierChgCalcTypeType }{@code >}
     *     
     */
    public void setTierChgCalcType(JAXBElement<TierChgCalcTypeType> value) {
        this.tierChgCalcType = value;
    }

    /**
     * Gets the value of the serChgLvlAlgSymb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SerChgLvlAlgSymbType }{@code >}
     *     
     */
    public JAXBElement<SerChgLvlAlgSymbType> getSerChgLvlAlgSymb() {
        return serChgLvlAlgSymb;
    }

    /**
     * Sets the value of the serChgLvlAlgSymb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SerChgLvlAlgSymbType }{@code >}
     *     
     */
    public void setSerChgLvlAlgSymb(JAXBElement<SerChgLvlAlgSymbType> value) {
        this.serChgLvlAlgSymb = value;
    }

    /**
     * Gets the value of the tierBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TierBalAmtType }{@code >}
     *     
     */
    public JAXBElement<TierBalAmtType> getTierBalAmt() {
        return tierBalAmt;
    }

    /**
     * Sets the value of the tierBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TierBalAmtType }{@code >}
     *     
     */
    public void setTierBalAmt(JAXBElement<TierBalAmtType> value) {
        this.tierBalAmt = value;
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
