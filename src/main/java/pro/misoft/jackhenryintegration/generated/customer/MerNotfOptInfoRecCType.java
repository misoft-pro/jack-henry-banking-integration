
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
 * <p>Java class for MerNotfOptInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MerNotfOptInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTMerId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTMerId_Type" minOccurs="0"/&gt;
 *         &lt;element name="MerNotfOptCode" type="{http://jackhenry.com/jxchange/TPG/2008}MerNotfOptCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="MerNotfOptDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MerNotfOptDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "MerNotfOptInfoRec_CType", propOrder = {
    "eftMerId",
    "merNotfOptCode",
    "merNotfOptDesc",
    "ver1",
    "any"
})
public class MerNotfOptInfoRecCType {

    @XmlElement(name = "EFTMerId")
    protected EFTMerIdType eftMerId;
    @XmlElement(name = "MerNotfOptCode")
    protected MerNotfOptCodeType merNotfOptCode;
    @XmlElement(name = "MerNotfOptDesc")
    protected MerNotfOptDescType merNotfOptDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eftMerId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTMerIdType }
     *     
     */
    public EFTMerIdType getEFTMerId() {
        return eftMerId;
    }

    /**
     * Sets the value of the eftMerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTMerIdType }
     *     
     */
    public void setEFTMerId(EFTMerIdType value) {
        this.eftMerId = value;
    }

    /**
     * Gets the value of the merNotfOptCode property.
     * 
     * @return
     *     possible object is
     *     {@link MerNotfOptCodeType }
     *     
     */
    public MerNotfOptCodeType getMerNotfOptCode() {
        return merNotfOptCode;
    }

    /**
     * Sets the value of the merNotfOptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerNotfOptCodeType }
     *     
     */
    public void setMerNotfOptCode(MerNotfOptCodeType value) {
        this.merNotfOptCode = value;
    }

    /**
     * Gets the value of the merNotfOptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link MerNotfOptDescType }
     *     
     */
    public MerNotfOptDescType getMerNotfOptDesc() {
        return merNotfOptDesc;
    }

    /**
     * Sets the value of the merNotfOptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerNotfOptDescType }
     *     
     */
    public void setMerNotfOptDesc(MerNotfOptDescType value) {
        this.merNotfOptDesc = value;
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
