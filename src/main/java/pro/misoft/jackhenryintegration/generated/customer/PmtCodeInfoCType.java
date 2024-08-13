
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
 * <p>Java class for PmtCodeInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtCodeInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}PmtCode_Type"/&gt;
 *         &lt;element name="PmtCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PmtCodeDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PmtCodeInfo_CType", propOrder = {
    "pmtCode",
    "pmtCodeDesc",
    "ver1",
    "any"
})
public class PmtCodeInfoCType {

    @XmlElement(name = "PmtCode", required = true)
    protected PmtCodeType pmtCode;
    @XmlElement(name = "PmtCodeDesc")
    protected PmtCodeDescType pmtCodeDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link PmtCodeType }
     *     
     */
    public PmtCodeType getPmtCode() {
        return pmtCode;
    }

    /**
     * Sets the value of the pmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtCodeType }
     *     
     */
    public void setPmtCode(PmtCodeType value) {
        this.pmtCode = value;
    }

    /**
     * Gets the value of the pmtCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PmtCodeDescType }
     *     
     */
    public PmtCodeDescType getPmtCodeDesc() {
        return pmtCodeDesc;
    }

    /**
     * Sets the value of the pmtCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtCodeDescType }
     *     
     */
    public void setPmtCodeDesc(PmtCodeDescType value) {
        this.pmtCodeDesc = value;
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
