
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of additional information specific to each client by Category.
 * 
 * <p>Java class for XtendInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XtendInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XtendInfo" type="{http://jackhenry.com/jxchange/TPG/2008}XtendInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Rstr" type="{http://jackhenry.com/jxchange/TPG/2008}Rstr_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XtendInfoArray_AType", propOrder = {
    "xtendInfo"
})
public class XtendInfoArrayAType {

    @XmlElement(name = "XtendInfo")
    protected List<XtendInfoRecCType> xtendInfo;
    @XmlAttribute(name = "Rstr")
    protected String rstr;

    /**
     * Gets the value of the xtendInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtendInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtendInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XtendInfoRecCType }
     * 
     * 
     */
    public List<XtendInfoRecCType> getXtendInfo() {
        if (xtendInfo == null) {
            xtendInfo = new ArrayList<XtendInfoRecCType>();
        }
        return this.xtendInfo;
    }

    /**
     * Gets the value of the rstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstr() {
        return rstr;
    }

    /**
     * Sets the value of the rstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstr(String value) {
        this.rstr = value;
    }

}
