
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CrCardPaySchedRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardPaySchedRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoPayStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AutoPayEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="InfiniteSchedType" type="{http://jackhenry.com/jxchange/TPG/2008}InfiniteSchedType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CrCardPaySchedRec_CType", propOrder = {
    "autoPayStartDt",
    "autoPayEndDt",
    "infiniteSchedType",
    "ver1",
    "any"
})
public class CrCardPaySchedRecCType {

    @XmlElement(name = "AutoPayStartDt")
    protected StartDtType autoPayStartDt;
    @XmlElement(name = "AutoPayEndDt")
    protected EndDtType autoPayEndDt;
    @XmlElement(name = "InfiniteSchedType")
    protected InfiniteSchedTypeType infiniteSchedType;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the autoPayStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartDtType }
     *     
     */
    public StartDtType getAutoPayStartDt() {
        return autoPayStartDt;
    }

    /**
     * Sets the value of the autoPayStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDtType }
     *     
     */
    public void setAutoPayStartDt(StartDtType value) {
        this.autoPayStartDt = value;
    }

    /**
     * Gets the value of the autoPayEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link EndDtType }
     *     
     */
    public EndDtType getAutoPayEndDt() {
        return autoPayEndDt;
    }

    /**
     * Sets the value of the autoPayEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDtType }
     *     
     */
    public void setAutoPayEndDt(EndDtType value) {
        this.autoPayEndDt = value;
    }

    /**
     * Gets the value of the infiniteSchedType property.
     * 
     * @return
     *     possible object is
     *     {@link InfiniteSchedTypeType }
     *     
     */
    public InfiniteSchedTypeType getInfiniteSchedType() {
        return infiniteSchedType;
    }

    /**
     * Sets the value of the infiniteSchedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfiniteSchedTypeType }
     *     
     */
    public void setInfiniteSchedType(InfiniteSchedTypeType value) {
        this.infiniteSchedType = value;
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
     * {@link Element }
     * {@link Object }
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
