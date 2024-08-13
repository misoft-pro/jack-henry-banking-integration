
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CrCustInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCustInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrCustName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="CrCustAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="CrCustBirthDt" type="{http://jackhenry.com/jxchange/TPG/2008}BirthDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCustBirthCity" type="{http://jackhenry.com/jxchange/TPG/2008}City_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCustBirthCntry" type="{http://jackhenry.com/jxchange/TPG/2008}Cntry_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CrCustInfoRec_CType", propOrder = {
    "crCustName",
    "crCustAddr",
    "crCustBirthDt",
    "crCustBirthCity",
    "crCustBirthCntry",
    "ver1",
    "any"
})
public class CrCustInfoRecCType {

    @XmlElement(name = "CrCustName")
    protected PersonNameCType crCustName;
    @XmlElement(name = "CrCustAddr")
    protected AddrCType crCustAddr;
    @XmlElement(name = "CrCustBirthDt")
    protected BirthDtType crCustBirthDt;
    @XmlElement(name = "CrCustBirthCity")
    protected CityType crCustBirthCity;
    @XmlElement(name = "CrCustBirthCntry")
    protected CntryType crCustBirthCntry;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the crCustName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getCrCustName() {
        return crCustName;
    }

    /**
     * Sets the value of the crCustName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setCrCustName(PersonNameCType value) {
        this.crCustName = value;
    }

    /**
     * Gets the value of the crCustAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getCrCustAddr() {
        return crCustAddr;
    }

    /**
     * Sets the value of the crCustAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setCrCustAddr(AddrCType value) {
        this.crCustAddr = value;
    }

    /**
     * Gets the value of the crCustBirthDt property.
     * 
     * @return
     *     possible object is
     *     {@link BirthDtType }
     *     
     */
    public BirthDtType getCrCustBirthDt() {
        return crCustBirthDt;
    }

    /**
     * Sets the value of the crCustBirthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthDtType }
     *     
     */
    public void setCrCustBirthDt(BirthDtType value) {
        this.crCustBirthDt = value;
    }

    /**
     * Gets the value of the crCustBirthCity property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getCrCustBirthCity() {
        return crCustBirthCity;
    }

    /**
     * Sets the value of the crCustBirthCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setCrCustBirthCity(CityType value) {
        this.crCustBirthCity = value;
    }

    /**
     * Gets the value of the crCustBirthCntry property.
     * 
     * @return
     *     possible object is
     *     {@link CntryType }
     *     
     */
    public CntryType getCrCustBirthCntry() {
        return crCustBirthCntry;
    }

    /**
     * Sets the value of the crCustBirthCntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CntryType }
     *     
     */
    public void setCrCustBirthCntry(CntryType value) {
        this.crCustBirthCntry = value;
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
     * {@link Element }
     * {@link Object }
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
