
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
 * The complex of present monthly housing expenses for a loan
 *                 applicant
 * 
 * <p>Java class for PltfmAppHousingInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmAppHousingInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RentAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RentAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PIAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PIAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SecdPIAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SecdPIAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="HazInsurAmt" type="{http://jackhenry.com/jxchange/TPG/2008}HazInsurAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RealEstateTaxAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RealEstateTaxAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MtgInsurAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MtgInsurAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="HomeOwnerAssnAmt" type="{http://jackhenry.com/jxchange/TPG/2008}HomeOwnerAssnAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmAppHousingInfo_CType", propOrder = {
    "rentAmt",
    "piAmt",
    "secdPIAmt",
    "hazInsurAmt",
    "realEstateTaxAmt",
    "mtgInsurAmt",
    "homeOwnerAssnAmt",
    "ver1",
    "any"
})
public class PltfmAppHousingInfoCType {

    @XmlElement(name = "RentAmt")
    protected RentAmtType rentAmt;
    @XmlElement(name = "PIAmt")
    protected PIAmtType piAmt;
    @XmlElement(name = "SecdPIAmt")
    protected SecdPIAmtType secdPIAmt;
    @XmlElement(name = "HazInsurAmt")
    protected HazInsurAmtType hazInsurAmt;
    @XmlElement(name = "RealEstateTaxAmt")
    protected RealEstateTaxAmtType realEstateTaxAmt;
    @XmlElement(name = "MtgInsurAmt")
    protected MtgInsurAmtType mtgInsurAmt;
    @XmlElement(name = "HomeOwnerAssnAmt")
    protected HomeOwnerAssnAmtType homeOwnerAssnAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the rentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RentAmtType }
     *     
     */
    public RentAmtType getRentAmt() {
        return rentAmt;
    }

    /**
     * Sets the value of the rentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentAmtType }
     *     
     */
    public void setRentAmt(RentAmtType value) {
        this.rentAmt = value;
    }

    /**
     * Gets the value of the piAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PIAmtType }
     *     
     */
    public PIAmtType getPIAmt() {
        return piAmt;
    }

    /**
     * Sets the value of the piAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIAmtType }
     *     
     */
    public void setPIAmt(PIAmtType value) {
        this.piAmt = value;
    }

    /**
     * Gets the value of the secdPIAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SecdPIAmtType }
     *     
     */
    public SecdPIAmtType getSecdPIAmt() {
        return secdPIAmt;
    }

    /**
     * Sets the value of the secdPIAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecdPIAmtType }
     *     
     */
    public void setSecdPIAmt(SecdPIAmtType value) {
        this.secdPIAmt = value;
    }

    /**
     * Gets the value of the hazInsurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link HazInsurAmtType }
     *     
     */
    public HazInsurAmtType getHazInsurAmt() {
        return hazInsurAmt;
    }

    /**
     * Sets the value of the hazInsurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazInsurAmtType }
     *     
     */
    public void setHazInsurAmt(HazInsurAmtType value) {
        this.hazInsurAmt = value;
    }

    /**
     * Gets the value of the realEstateTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateTaxAmtType }
     *     
     */
    public RealEstateTaxAmtType getRealEstateTaxAmt() {
        return realEstateTaxAmt;
    }

    /**
     * Sets the value of the realEstateTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateTaxAmtType }
     *     
     */
    public void setRealEstateTaxAmt(RealEstateTaxAmtType value) {
        this.realEstateTaxAmt = value;
    }

    /**
     * Gets the value of the mtgInsurAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MtgInsurAmtType }
     *     
     */
    public MtgInsurAmtType getMtgInsurAmt() {
        return mtgInsurAmt;
    }

    /**
     * Sets the value of the mtgInsurAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MtgInsurAmtType }
     *     
     */
    public void setMtgInsurAmt(MtgInsurAmtType value) {
        this.mtgInsurAmt = value;
    }

    /**
     * Gets the value of the homeOwnerAssnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link HomeOwnerAssnAmtType }
     *     
     */
    public HomeOwnerAssnAmtType getHomeOwnerAssnAmt() {
        return homeOwnerAssnAmt;
    }

    /**
     * Sets the value of the homeOwnerAssnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link HomeOwnerAssnAmtType }
     *     
     */
    public void setHomeOwnerAssnAmt(HomeOwnerAssnAmtType value) {
        this.homeOwnerAssnAmt = value;
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
