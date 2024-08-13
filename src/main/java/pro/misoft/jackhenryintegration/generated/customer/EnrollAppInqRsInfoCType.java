
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
 * <p>Java class for EnrollAppInqRsInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnrollAppInqRsInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnrollAppType" type="{http://jackhenry.com/jxchange/TPG/2008}EnrollAppType_Type"/&gt;
 *         &lt;element name="EnrollUsr" type="{http://jackhenry.com/jxchange/TPG/2008}EnrollUsr_Type"/&gt;
 *         &lt;element name="PrvdFamName" type="{http://jackhenry.com/jxchange/TPG/2008}PrvdFamName_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrvdName" type="{http://jackhenry.com/jxchange/TPG/2008}PrvdName_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastActDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastActDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EnrollAppInqRsInfo_CType", propOrder = {
    "enrollAppType",
    "enrollUsr",
    "prvdFamName",
    "prvdName",
    "lastActDt",
    "ver1",
    "any"
})
public class EnrollAppInqRsInfoCType {

    @XmlElement(name = "EnrollAppType", required = true)
    protected EnrollAppTypeType enrollAppType;
    @XmlElement(name = "EnrollUsr", required = true)
    protected EnrollUsrType enrollUsr;
    @XmlElement(name = "PrvdFamName")
    protected PrvdFamNameType prvdFamName;
    @XmlElement(name = "PrvdName")
    protected PrvdNameType prvdName;
    @XmlElement(name = "LastActDt")
    protected LastActDtType lastActDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the enrollAppType property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollAppTypeType }
     *     
     */
    public EnrollAppTypeType getEnrollAppType() {
        return enrollAppType;
    }

    /**
     * Sets the value of the enrollAppType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollAppTypeType }
     *     
     */
    public void setEnrollAppType(EnrollAppTypeType value) {
        this.enrollAppType = value;
    }

    /**
     * Gets the value of the enrollUsr property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollUsrType }
     *     
     */
    public EnrollUsrType getEnrollUsr() {
        return enrollUsr;
    }

    /**
     * Sets the value of the enrollUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollUsrType }
     *     
     */
    public void setEnrollUsr(EnrollUsrType value) {
        this.enrollUsr = value;
    }

    /**
     * Gets the value of the prvdFamName property.
     * 
     * @return
     *     possible object is
     *     {@link PrvdFamNameType }
     *     
     */
    public PrvdFamNameType getPrvdFamName() {
        return prvdFamName;
    }

    /**
     * Sets the value of the prvdFamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrvdFamNameType }
     *     
     */
    public void setPrvdFamName(PrvdFamNameType value) {
        this.prvdFamName = value;
    }

    /**
     * Gets the value of the prvdName property.
     * 
     * @return
     *     possible object is
     *     {@link PrvdNameType }
     *     
     */
    public PrvdNameType getPrvdName() {
        return prvdName;
    }

    /**
     * Sets the value of the prvdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrvdNameType }
     *     
     */
    public void setPrvdName(PrvdNameType value) {
        this.prvdName = value;
    }

    /**
     * Gets the value of the lastActDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastActDtType }
     *     
     */
    public LastActDtType getLastActDt() {
        return lastActDt;
    }

    /**
     * Sets the value of the lastActDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastActDtType }
     *     
     */
    public void setLastActDt(LastActDtType value) {
        this.lastActDt = value;
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
