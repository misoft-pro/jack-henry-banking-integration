
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
 * A package of data related to credit scores
 * 
 * <p>Java class for CrScoreInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrScoreInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrScoreId" type="{http://jackhenry.com/jxchange/TPG/2008}CrScoreId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrScoreModelCode" type="{http://jackhenry.com/jxchange/TPG/2008}CrScoreModelCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrScoreCapDt" type="{http://jackhenry.com/jxchange/TPG/2008}CapDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CrScoreInfo_CType", propOrder = {
    "crScoreId",
    "crScoreModelCode",
    "crScoreCapDt",
    "ver1",
    "any"
})
public class CrScoreInfoCType {

    @XmlElement(name = "CrScoreId")
    protected CrScoreIdType crScoreId;
    @XmlElement(name = "CrScoreModelCode")
    protected CrScoreModelCodeType crScoreModelCode;
    @XmlElement(name = "CrScoreCapDt")
    protected CapDtType crScoreCapDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the crScoreId property.
     * 
     * @return
     *     possible object is
     *     {@link CrScoreIdType }
     *     
     */
    public CrScoreIdType getCrScoreId() {
        return crScoreId;
    }

    /**
     * Sets the value of the crScoreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrScoreIdType }
     *     
     */
    public void setCrScoreId(CrScoreIdType value) {
        this.crScoreId = value;
    }

    /**
     * Gets the value of the crScoreModelCode property.
     * 
     * @return
     *     possible object is
     *     {@link CrScoreModelCodeType }
     *     
     */
    public CrScoreModelCodeType getCrScoreModelCode() {
        return crScoreModelCode;
    }

    /**
     * Sets the value of the crScoreModelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrScoreModelCodeType }
     *     
     */
    public void setCrScoreModelCode(CrScoreModelCodeType value) {
        this.crScoreModelCode = value;
    }

    /**
     * Gets the value of the crScoreCapDt property.
     * 
     * @return
     *     possible object is
     *     {@link CapDtType }
     *     
     */
    public CapDtType getCrScoreCapDt() {
        return crScoreCapDt;
    }

    /**
     * Sets the value of the crScoreCapDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapDtType }
     *     
     */
    public void setCrScoreCapDt(CapDtType value) {
        this.crScoreCapDt = value;
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
