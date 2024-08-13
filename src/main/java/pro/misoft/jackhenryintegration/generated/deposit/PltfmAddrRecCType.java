
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
 * <p>Java class for PltfmAddrRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAddrRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AddrInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="AddrCatUse" type="{http://jackhenry.com/jxchange/TPG/2008}AddrCatUse_Type" minOccurs="0"/&gt;
 *         &lt;element name="AddrCat2Use" type="{http://jackhenry.com/jxchange/TPG/2008}AddrCat2Use_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmAddrRec_CType", propOrder = {
    "addrInfo",
    "addrCatUse",
    "addrCat2Use",
    "custom",
    "ver1",
    "any"
})
public class PltfmAddrRecCType {

    @XmlElement(name = "AddrInfo")
    protected AddrInfoCType addrInfo;
    @XmlElement(name = "AddrCatUse")
    protected AddrCatUseType addrCatUse;
    @XmlElement(name = "AddrCat2Use")
    protected AddrCat2UseType addrCat2Use;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the addrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AddrInfoCType }
     *     
     */
    public AddrInfoCType getAddrInfo() {
        return addrInfo;
    }

    /**
     * Sets the value of the addrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrInfoCType }
     *     
     */
    public void setAddrInfo(AddrInfoCType value) {
        this.addrInfo = value;
    }

    /**
     * Gets the value of the addrCatUse property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCatUseType }
     *     
     */
    public AddrCatUseType getAddrCatUse() {
        return addrCatUse;
    }

    /**
     * Sets the value of the addrCatUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCatUseType }
     *     
     */
    public void setAddrCatUse(AddrCatUseType value) {
        this.addrCatUse = value;
    }

    /**
     * Gets the value of the addrCat2Use property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCat2UseType }
     *     
     */
    public AddrCat2UseType getAddrCat2Use() {
        return addrCat2Use;
    }

    /**
     * Sets the value of the addrCat2Use property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCat2UseType }
     *     
     */
    public void setAddrCat2Use(AddrCat2UseType value) {
        this.addrCat2Use = value;
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
