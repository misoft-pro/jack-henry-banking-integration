
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
 * <p>Java class for BorwCrScoreRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BorwCrScoreRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BorwCrScoreId" type="{http://jackhenry.com/jxchange/TPG/2008}CrScoreId_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwCrScoreModelCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrScoreModelCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwCrScoreModelDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrScoreModelDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwCrScoreModelVal" type="{http://jackhenry.com/jxchange/TPG/2008}CrScoreModelVal_Type" minOccurs="0"/&gt;
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
@XmlType(name = "BorwCrScoreRec_CType", propOrder = {
    "borwCrScoreId",
    "borwCrScoreModelCode",
    "borwCrScoreModelDesc",
    "borwCrScoreModelVal",
    "ver1",
    "any"
})
public class BorwCrScoreRecCType {

    @XmlElement(name = "BorwCrScoreId")
    protected CrScoreIdType borwCrScoreId;
    @XmlElement(name = "BorwCrScoreModelCode")
    protected CrScoreModelCodeType borwCrScoreModelCode;
    @XmlElement(name = "BorwCrScoreModelDesc")
    protected CrScoreModelDescType borwCrScoreModelDesc;
    @XmlElement(name = "BorwCrScoreModelVal")
    protected CrScoreModelValType borwCrScoreModelVal;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the borwCrScoreId property.
     * 
     * @return
     *     possible object is
     *     {@link CrScoreIdType }
     *     
     */
    public CrScoreIdType getBorwCrScoreId() {
        return borwCrScoreId;
    }

    /**
     * Sets the value of the borwCrScoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrScoreIdType }
     *     
     */
    public void setBorwCrScoreId(CrScoreIdType value) {
        this.borwCrScoreId = value;
    }

    /**
     * Gets the value of the borwCrScoreModelCode property.
     * 
     * @return
     *     possible object is
     *     {@link CrScoreModelCodeType }
     *     
     */
    public CrScoreModelCodeType getBorwCrScoreModelCode() {
        return borwCrScoreModelCode;
    }

    /**
     * Sets the value of the borwCrScoreModelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrScoreModelCodeType }
     *     
     */
    public void setBorwCrScoreModelCode(CrScoreModelCodeType value) {
        this.borwCrScoreModelCode = value;
    }

    /**
     * Gets the value of the borwCrScoreModelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrScoreModelDescType }
     *     
     */
    public CrScoreModelDescType getBorwCrScoreModelDesc() {
        return borwCrScoreModelDesc;
    }

    /**
     * Sets the value of the borwCrScoreModelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrScoreModelDescType }
     *     
     */
    public void setBorwCrScoreModelDesc(CrScoreModelDescType value) {
        this.borwCrScoreModelDesc = value;
    }

    /**
     * Gets the value of the borwCrScoreModelVal property.
     * 
     * @return
     *     possible object is
     *     {@link CrScoreModelValType }
     *     
     */
    public CrScoreModelValType getBorwCrScoreModelVal() {
        return borwCrScoreModelVal;
    }

    /**
     * Sets the value of the borwCrScoreModelVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrScoreModelValType }
     *     
     */
    public void setBorwCrScoreModelVal(CrScoreModelValType value) {
        this.borwCrScoreModelVal = value;
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
