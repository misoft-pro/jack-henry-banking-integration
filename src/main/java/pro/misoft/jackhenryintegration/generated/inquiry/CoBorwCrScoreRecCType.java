
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
 * <p>Java class for CoBorwCrScoreRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoBorwCrScoreRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CoBorwCrScoreId" type="{http://jackhenry.com/jxchange/TPG/2008}CrScoreId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwCrScoreModelCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrScoreModelCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwCrScoreModelDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrScoreModelDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoBorwCrScoreModelVal" type="{http://jackhenry.com/jxchange/TPG/2008}CrScoreModelVal_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CoBorwCrScoreRec_CType", propOrder = {
    "coBorwCrScoreId",
    "coBorwCrScoreModelCode",
    "coBorwCrScoreModelDesc",
    "coBorwCrScoreModelVal",
    "ver1",
    "any"
})
public class CoBorwCrScoreRecCType {

    @XmlElement(name = "CoBorwCrScoreId")
    protected CrScoreIdType coBorwCrScoreId;
    @XmlElement(name = "CoBorwCrScoreModelCode")
    protected CrScoreModelCodeType coBorwCrScoreModelCode;
    @XmlElement(name = "CoBorwCrScoreModelDesc")
    protected CrScoreModelDescType coBorwCrScoreModelDesc;
    @XmlElement(name = "CoBorwCrScoreModelVal")
    protected CrScoreModelValType coBorwCrScoreModelVal;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the coBorwCrScoreId property.
     * 
     * @return
     *     possible object is
     *     {@link CrScoreIdType }
     *     
     */
    public CrScoreIdType getCoBorwCrScoreId() {
        return coBorwCrScoreId;
    }

    /**
     * Sets the value of the coBorwCrScoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrScoreIdType }
     *     
     */
    public void setCoBorwCrScoreId(CrScoreIdType value) {
        this.coBorwCrScoreId = value;
    }

    /**
     * Gets the value of the coBorwCrScoreModelCode property.
     * 
     * @return
     *     possible object is
     *     {@link CrScoreModelCodeType }
     *     
     */
    public CrScoreModelCodeType getCoBorwCrScoreModelCode() {
        return coBorwCrScoreModelCode;
    }

    /**
     * Sets the value of the coBorwCrScoreModelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrScoreModelCodeType }
     *     
     */
    public void setCoBorwCrScoreModelCode(CrScoreModelCodeType value) {
        this.coBorwCrScoreModelCode = value;
    }

    /**
     * Gets the value of the coBorwCrScoreModelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrScoreModelDescType }
     *     
     */
    public CrScoreModelDescType getCoBorwCrScoreModelDesc() {
        return coBorwCrScoreModelDesc;
    }

    /**
     * Sets the value of the coBorwCrScoreModelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrScoreModelDescType }
     *     
     */
    public void setCoBorwCrScoreModelDesc(CrScoreModelDescType value) {
        this.coBorwCrScoreModelDesc = value;
    }

    /**
     * Gets the value of the coBorwCrScoreModelVal property.
     * 
     * @return
     *     possible object is
     *     {@link CrScoreModelValType }
     *     
     */
    public CrScoreModelValType getCoBorwCrScoreModelVal() {
        return coBorwCrScoreModelVal;
    }

    /**
     * Sets the value of the coBorwCrScoreModelVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrScoreModelValType }
     *     
     */
    public void setCoBorwCrScoreModelVal(CrScoreModelValType value) {
        this.coBorwCrScoreModelVal = value;
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
