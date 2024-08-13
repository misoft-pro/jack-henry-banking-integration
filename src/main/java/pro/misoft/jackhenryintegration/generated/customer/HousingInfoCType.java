
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for HousingInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HousingInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HousingInfoTxt" type="{http://jackhenry.com/jxchange/TPG/2008}HousingInfoTxt_Type" minOccurs="0"/&gt;
 *         &lt;element name="NumBdrm" type="{http://jackhenry.com/jxchange/TPG/2008}NumBdrm_Type" minOccurs="0"/&gt;
 *         &lt;element name="NumRentalUnit" type="{http://jackhenry.com/jxchange/TPG/2008}NumRentalUnit_Type" minOccurs="0"/&gt;
 *         &lt;element name="RentUtlAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RentUtlAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="UnitOwnerCode" type="{http://jackhenry.com/jxchange/TPG/2008}UnitOwnerCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="UnitOwnerDesc" type="{http://jackhenry.com/jxchange/TPG/2008}UnitOwnerDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "HousingInfo_CType", propOrder = {
    "housingInfoTxt",
    "numBdrm",
    "numRentalUnit",
    "rentUtlAmt",
    "unitOwnerCode",
    "unitOwnerDesc",
    "ver1",
    "any"
})
public class HousingInfoCType {

    @XmlElementRef(name = "HousingInfoTxt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HousingInfoTxtType> housingInfoTxt;
    @XmlElementRef(name = "NumBdrm", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NumBdrmType> numBdrm;
    @XmlElementRef(name = "NumRentalUnit", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<NumRentalUnitType> numRentalUnit;
    @XmlElementRef(name = "RentUtlAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RentUtlAmtType> rentUtlAmt;
    @XmlElementRef(name = "UnitOwnerCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UnitOwnerCodeType> unitOwnerCode;
    @XmlElementRef(name = "UnitOwnerDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<UnitOwnerDescType> unitOwnerDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the housingInfoTxt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HousingInfoTxtType }{@code >}
     *     
     */
    public JAXBElement<HousingInfoTxtType> getHousingInfoTxt() {
        return housingInfoTxt;
    }

    /**
     * Sets the value of the housingInfoTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HousingInfoTxtType }{@code >}
     *     
     */
    public void setHousingInfoTxt(JAXBElement<HousingInfoTxtType> value) {
        this.housingInfoTxt = value;
    }

    /**
     * Gets the value of the numBdrm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NumBdrmType }{@code >}
     *     
     */
    public JAXBElement<NumBdrmType> getNumBdrm() {
        return numBdrm;
    }

    /**
     * Sets the value of the numBdrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NumBdrmType }{@code >}
     *     
     */
    public void setNumBdrm(JAXBElement<NumBdrmType> value) {
        this.numBdrm = value;
    }

    /**
     * Gets the value of the numRentalUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NumRentalUnitType }{@code >}
     *     
     */
    public JAXBElement<NumRentalUnitType> getNumRentalUnit() {
        return numRentalUnit;
    }

    /**
     * Sets the value of the numRentalUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NumRentalUnitType }{@code >}
     *     
     */
    public void setNumRentalUnit(JAXBElement<NumRentalUnitType> value) {
        this.numRentalUnit = value;
    }

    /**
     * Gets the value of the rentUtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RentUtlAmtType }{@code >}
     *     
     */
    public JAXBElement<RentUtlAmtType> getRentUtlAmt() {
        return rentUtlAmt;
    }

    /**
     * Sets the value of the rentUtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RentUtlAmtType }{@code >}
     *     
     */
    public void setRentUtlAmt(JAXBElement<RentUtlAmtType> value) {
        this.rentUtlAmt = value;
    }

    /**
     * Gets the value of the unitOwnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnitOwnerCodeType }{@code >}
     *     
     */
    public JAXBElement<UnitOwnerCodeType> getUnitOwnerCode() {
        return unitOwnerCode;
    }

    /**
     * Sets the value of the unitOwnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnitOwnerCodeType }{@code >}
     *     
     */
    public void setUnitOwnerCode(JAXBElement<UnitOwnerCodeType> value) {
        this.unitOwnerCode = value;
    }

    /**
     * Gets the value of the unitOwnerDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnitOwnerDescType }{@code >}
     *     
     */
    public JAXBElement<UnitOwnerDescType> getUnitOwnerDesc() {
        return unitOwnerDesc;
    }

    /**
     * Sets the value of the unitOwnerDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnitOwnerDescType }{@code >}
     *     
     */
    public void setUnitOwnerDesc(JAXBElement<UnitOwnerDescType> value) {
        this.unitOwnerDesc = value;
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
