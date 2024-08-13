
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
 * <p>Java class for PltfmAppTaskRoleInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAppTaskRoleInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PltfmAppTaskRoleCode" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppTaskRoleCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmAppTaskArray" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmAppTaskArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmAppTaskRoleInfo_CType", propOrder = {
    "pltfmAppTaskRoleCode",
    "pltfmAppTaskArray",
    "ver1",
    "any"
})
public class PltfmAppTaskRoleInfoCType {

    @XmlElement(name = "PltfmAppTaskRoleCode")
    protected PltfmAppTaskRoleCodeType pltfmAppTaskRoleCode;
    @XmlElement(name = "PltfmAppTaskArray")
    protected PltfmAppTaskArrayAType pltfmAppTaskArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pltfmAppTaskRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAppTaskRoleCodeType }
     *     
     */
    public PltfmAppTaskRoleCodeType getPltfmAppTaskRoleCode() {
        return pltfmAppTaskRoleCode;
    }

    /**
     * Sets the value of the pltfmAppTaskRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAppTaskRoleCodeType }
     *     
     */
    public void setPltfmAppTaskRoleCode(PltfmAppTaskRoleCodeType value) {
        this.pltfmAppTaskRoleCode = value;
    }

    /**
     * Gets the value of the pltfmAppTaskArray property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmAppTaskArrayAType }
     *     
     */
    public PltfmAppTaskArrayAType getPltfmAppTaskArray() {
        return pltfmAppTaskArray;
    }

    /**
     * Sets the value of the pltfmAppTaskArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmAppTaskArrayAType }
     *     
     */
    public void setPltfmAppTaskArray(PltfmAppTaskArrayAType value) {
        this.pltfmAppTaskArray = value;
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
