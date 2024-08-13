
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
 * <p>Java class for BenfSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BenfSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Benf" type="{http://jackhenry.com/jxchange/TPG/2008}Benf_CType" minOccurs="0"/&gt;
 *         &lt;element name="BenfKey" type="{http://jackhenry.com/jxchange/TPG/2008}BenfKey_Type" minOccurs="0"/&gt;
 *         &lt;element name="BenfSpousDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BenfSpousDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnCode" type="{http://jackhenry.com/jxchange/TPG/2008}PlnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomBenfSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="BenfStat" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStat_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "BenfSrchRec_CType", propOrder = {
    "benf",
    "benfKey",
    "benfSpousDesc",
    "plnCode",
    "customBenfSrchRec",
    "ver1",
    "benfStat",
    "ver2",
    "any"
})
public class BenfSrchRecCType {

    @XmlElement(name = "Benf")
    protected BenfCType benf;
    @XmlElement(name = "BenfKey")
    protected BenfKeyType benfKey;
    @XmlElement(name = "BenfSpousDesc")
    protected BenfSpousDescType benfSpousDesc;
    @XmlElement(name = "PlnCode")
    protected PlnCodeType plnCode;
    @XmlElement(name = "CustomBenfSrchRec")
    protected CustomCType customBenfSrchRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "BenfStat")
    protected AcctStatType benfStat;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the benf property.
     * 
     * @return
     *     possible object is
     *     {@link BenfCType }
     *     
     */
    public BenfCType getBenf() {
        return benf;
    }

    /**
     * Sets the value of the benf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenfCType }
     *     
     */
    public void setBenf(BenfCType value) {
        this.benf = value;
    }

    /**
     * Gets the value of the benfKey property.
     * 
     * @return
     *     possible object is
     *     {@link BenfKeyType }
     *     
     */
    public BenfKeyType getBenfKey() {
        return benfKey;
    }

    /**
     * Sets the value of the benfKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenfKeyType }
     *     
     */
    public void setBenfKey(BenfKeyType value) {
        this.benfKey = value;
    }

    /**
     * Gets the value of the benfSpousDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BenfSpousDescType }
     *     
     */
    public BenfSpousDescType getBenfSpousDesc() {
        return benfSpousDesc;
    }

    /**
     * Sets the value of the benfSpousDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BenfSpousDescType }
     *     
     */
    public void setBenfSpousDesc(BenfSpousDescType value) {
        this.benfSpousDesc = value;
    }

    /**
     * Gets the value of the plnCode property.
     * 
     * @return
     *     possible object is
     *     {@link PlnCodeType }
     *     
     */
    public PlnCodeType getPlnCode() {
        return plnCode;
    }

    /**
     * Sets the value of the plnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnCodeType }
     *     
     */
    public void setPlnCode(PlnCodeType value) {
        this.plnCode = value;
    }

    /**
     * Gets the value of the customBenfSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomBenfSrchRec() {
        return customBenfSrchRec;
    }

    /**
     * Sets the value of the customBenfSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomBenfSrchRec(CustomCType value) {
        this.customBenfSrchRec = value;
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
     * Gets the value of the benfStat property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStatType }
     *     
     */
    public AcctStatType getBenfStat() {
        return benfStat;
    }

    /**
     * Sets the value of the benfStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStatType }
     *     
     */
    public void setBenfStat(AcctStatType value) {
        this.benfStat = value;
    }

    /**
     * Gets the value of the ver2 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver2CType }
     *     
     */
    public Ver2CType getVer2() {
        return ver2;
    }

    /**
     * Sets the value of the ver2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver2CType }
     *     
     */
    public void setVer2(Ver2CType value) {
        this.ver2 = value;
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
