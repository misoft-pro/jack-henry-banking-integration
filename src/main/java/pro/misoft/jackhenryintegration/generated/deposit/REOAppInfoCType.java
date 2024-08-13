
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
 * <p>Java class for REOAppInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REOAppInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REOType" type="{http://jackhenry.com/jxchange/TPG/2008}REOType_Type" minOccurs="0"/&gt;
 *         &lt;element name="REOAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="REORentAmt" type="{http://jackhenry.com/jxchange/TPG/2008}REORentAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="REOPIAmt" type="{http://jackhenry.com/jxchange/TPG/2008}REOPIAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="REOEscrwPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}REOEscrwPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="REOClassType" type="{http://jackhenry.com/jxchange/TPG/2008}REOClassType_Type" minOccurs="0"/&gt;
 *         &lt;element name="REOLienAmt" type="{http://jackhenry.com/jxchange/TPG/2008}REOLienAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "REOAppInfo_CType", propOrder = {
    "reoType",
    "reoAddr",
    "reoRentAmt",
    "reopiAmt",
    "reoEscrwPmtAmt",
    "reoClassType",
    "reoLienAmt",
    "ver1",
    "any"
})
public class REOAppInfoCType {

    @XmlElement(name = "REOType")
    protected REOTypeType reoType;
    @XmlElement(name = "REOAddr")
    protected AddrCType reoAddr;
    @XmlElement(name = "REORentAmt")
    protected REORentAmtType reoRentAmt;
    @XmlElement(name = "REOPIAmt")
    protected REOPIAmtType reopiAmt;
    @XmlElement(name = "REOEscrwPmtAmt")
    protected REOEscrwPmtAmtType reoEscrwPmtAmt;
    @XmlElement(name = "REOClassType")
    protected REOClassTypeType reoClassType;
    @XmlElement(name = "REOLienAmt")
    protected REOLienAmtType reoLienAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the reoType property.
     * 
     * @return
     *     possible object is
     *     {@link REOTypeType }
     *     
     */
    public REOTypeType getREOType() {
        return reoType;
    }

    /**
     * Sets the value of the reoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link REOTypeType }
     *     
     */
    public void setREOType(REOTypeType value) {
        this.reoType = value;
    }

    /**
     * Gets the value of the reoAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getREOAddr() {
        return reoAddr;
    }

    /**
     * Sets the value of the reoAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setREOAddr(AddrCType value) {
        this.reoAddr = value;
    }

    /**
     * Gets the value of the reoRentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link REORentAmtType }
     *     
     */
    public REORentAmtType getREORentAmt() {
        return reoRentAmt;
    }

    /**
     * Sets the value of the reoRentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link REORentAmtType }
     *     
     */
    public void setREORentAmt(REORentAmtType value) {
        this.reoRentAmt = value;
    }

    /**
     * Gets the value of the reopiAmt property.
     * 
     * @return
     *     possible object is
     *     {@link REOPIAmtType }
     *     
     */
    public REOPIAmtType getREOPIAmt() {
        return reopiAmt;
    }

    /**
     * Sets the value of the reopiAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link REOPIAmtType }
     *     
     */
    public void setREOPIAmt(REOPIAmtType value) {
        this.reopiAmt = value;
    }

    /**
     * Gets the value of the reoEscrwPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link REOEscrwPmtAmtType }
     *     
     */
    public REOEscrwPmtAmtType getREOEscrwPmtAmt() {
        return reoEscrwPmtAmt;
    }

    /**
     * Sets the value of the reoEscrwPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link REOEscrwPmtAmtType }
     *     
     */
    public void setREOEscrwPmtAmt(REOEscrwPmtAmtType value) {
        this.reoEscrwPmtAmt = value;
    }

    /**
     * Gets the value of the reoClassType property.
     * 
     * @return
     *     possible object is
     *     {@link REOClassTypeType }
     *     
     */
    public REOClassTypeType getREOClassType() {
        return reoClassType;
    }

    /**
     * Sets the value of the reoClassType property.
     * 
     * @param value
     *     allowed object is
     *     {@link REOClassTypeType }
     *     
     */
    public void setREOClassType(REOClassTypeType value) {
        this.reoClassType = value;
    }

    /**
     * Gets the value of the reoLienAmt property.
     * 
     * @return
     *     possible object is
     *     {@link REOLienAmtType }
     *     
     */
    public REOLienAmtType getREOLienAmt() {
        return reoLienAmt;
    }

    /**
     * Sets the value of the reoLienAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link REOLienAmtType }
     *     
     */
    public void setREOLienAmt(REOLienAmtType value) {
        this.reoLienAmt = value;
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
