
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
 * <p>Java class for OperFilterInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperFilterInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperFilterType" type="{http://jackhenry.com/jxchange/TPG/2008}OperFilterType_Type" minOccurs="0"/&gt;
 *         &lt;element name="OperFilterVal" type="{http://jackhenry.com/jxchange/TPG/2008}OperFilterVal_Type" minOccurs="0"/&gt;
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
@XmlType(name = "OperFilterInfo_CType", propOrder = {
    "operFilterType",
    "operFilterVal",
    "ver1",
    "any"
})
public class OperFilterInfoCType {

    @XmlElement(name = "OperFilterType")
    protected OperFilterTypeType operFilterType;
    @XmlElement(name = "OperFilterVal")
    protected OperFilterValType operFilterVal;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the operFilterType property.
     * 
     * @return
     *     possible object is
     *     {@link OperFilterTypeType }
     *     
     */
    public OperFilterTypeType getOperFilterType() {
        return operFilterType;
    }

    /**
     * Sets the value of the operFilterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperFilterTypeType }
     *     
     */
    public void setOperFilterType(OperFilterTypeType value) {
        this.operFilterType = value;
    }

    /**
     * Gets the value of the operFilterVal property.
     * 
     * @return
     *     possible object is
     *     {@link OperFilterValType }
     *     
     */
    public OperFilterValType getOperFilterVal() {
        return operFilterVal;
    }

    /**
     * Sets the value of the operFilterVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperFilterValType }
     *     
     */
    public void setOperFilterVal(OperFilterValType value) {
        this.operFilterVal = value;
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
