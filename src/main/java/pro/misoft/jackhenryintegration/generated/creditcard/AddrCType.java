
package pro.misoft.jackhenryintegration.generated.creditcard;

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
 * <p>Java class for Addr_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Addr_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FreeFormAddrArray" type="{http://jackhenry.com/jxchange/TPG/2008}FreeFormAddr_AType" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddr1" type="{http://jackhenry.com/jxchange/TPG/2008}StreetAddr1_Type" minOccurs="0"/&gt;
 *         &lt;element name="StreetAddr2" type="{http://jackhenry.com/jxchange/TPG/2008}StreetAddr2_Type" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://jackhenry.com/jxchange/TPG/2008}City_Type" minOccurs="0"/&gt;
 *         &lt;element name="StateProv" type="{http://jackhenry.com/jxchange/TPG/2008}StateProv_Type" minOccurs="0"/&gt;
 *         &lt;element name="StateCode" type="{http://jackhenry.com/jxchange/TPG/2008}StateCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://jackhenry.com/jxchange/TPG/2008}PostalCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="DlvryPt" type="{http://jackhenry.com/jxchange/TPG/2008}DlvryPt_Type" minOccurs="0"/&gt;
 *         &lt;element name="County" type="{http://jackhenry.com/jxchange/TPG/2008}County_Type" minOccurs="0"/&gt;
 *         &lt;element name="Cntry" type="{http://jackhenry.com/jxchange/TPG/2008}Cntry_Type" minOccurs="0"/&gt;
 *         &lt;element name="CntryType" type="{http://jackhenry.com/jxchange/TPG/2008}CntryType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BusAddr" type="{http://jackhenry.com/jxchange/TPG/2008}BusAddr_Type" minOccurs="0"/&gt;
 *         &lt;element name="FornAddr" type="{http://jackhenry.com/jxchange/TPG/2008}FornAddr_Type" minOccurs="0"/&gt;
 *         &lt;element name="InvAddr" type="{http://jackhenry.com/jxchange/TPG/2008}InvAddr_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="StreetAddr3" type="{http://jackhenry.com/jxchange/TPG/2008}StreetAddr3_Type" minOccurs="0"/&gt;
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
@XmlType(name = "Addr_CType", propOrder = {
    "freeFormAddrArray",
    "streetAddr1",
    "streetAddr2",
    "city",
    "stateProv",
    "stateCode",
    "postalCode",
    "dlvryPt",
    "county",
    "cntry",
    "cntryType",
    "busAddr",
    "fornAddr",
    "invAddr",
    "ver1",
    "streetAddr3",
    "ver2",
    "any"
})
public class AddrCType {

    @XmlElement(name = "FreeFormAddrArray")
    protected FreeFormAddrAType freeFormAddrArray;
    @XmlElementRef(name = "StreetAddr1", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StreetAddr1Type> streetAddr1;
    @XmlElementRef(name = "StreetAddr2", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StreetAddr2Type> streetAddr2;
    @XmlElementRef(name = "City", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CityType> city;
    @XmlElementRef(name = "StateProv", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateProvType> stateProv;
    @XmlElementRef(name = "StateCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StateCodeType> stateCode;
    @XmlElementRef(name = "PostalCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PostalCodeType> postalCode;
    @XmlElementRef(name = "DlvryPt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<DlvryPtType> dlvryPt;
    @XmlElementRef(name = "County", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CountyType> county;
    @XmlElementRef(name = "Cntry", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CntryType> cntry;
    @XmlElementRef(name = "CntryType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CntryTypeType> cntryType;
    @XmlElementRef(name = "BusAddr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<BusAddrType> busAddr;
    @XmlElementRef(name = "FornAddr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FornAddrType> fornAddr;
    @XmlElementRef(name = "InvAddr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<InvAddrType> invAddr;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "StreetAddr3", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StreetAddr3Type> streetAddr3;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the freeFormAddrArray property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormAddrAType }
     *     
     */
    public FreeFormAddrAType getFreeFormAddrArray() {
        return freeFormAddrArray;
    }

    /**
     * Sets the value of the freeFormAddrArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormAddrAType }
     *     
     */
    public void setFreeFormAddrArray(FreeFormAddrAType value) {
        this.freeFormAddrArray = value;
    }

    /**
     * Gets the value of the streetAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StreetAddr1Type }{@code >}
     *     
     */
    public JAXBElement<StreetAddr1Type> getStreetAddr1() {
        return streetAddr1;
    }

    /**
     * Sets the value of the streetAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StreetAddr1Type }{@code >}
     *     
     */
    public void setStreetAddr1(JAXBElement<StreetAddr1Type> value) {
        this.streetAddr1 = value;
    }

    /**
     * Gets the value of the streetAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StreetAddr2Type }{@code >}
     *     
     */
    public JAXBElement<StreetAddr2Type> getStreetAddr2() {
        return streetAddr2;
    }

    /**
     * Sets the value of the streetAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StreetAddr2Type }{@code >}
     *     
     */
    public void setStreetAddr2(JAXBElement<StreetAddr2Type> value) {
        this.streetAddr2 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CityType }{@code >}
     *     
     */
    public JAXBElement<CityType> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CityType }{@code >}
     *     
     */
    public void setCity(JAXBElement<CityType> value) {
        this.city = value;
    }

    /**
     * Gets the value of the stateProv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateProvType }{@code >}
     *     
     */
    public JAXBElement<StateProvType> getStateProv() {
        return stateProv;
    }

    /**
     * Sets the value of the stateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateProvType }{@code >}
     *     
     */
    public void setStateProv(JAXBElement<StateProvType> value) {
        this.stateProv = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateCodeType }{@code >}
     *     
     */
    public JAXBElement<StateCodeType> getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateCodeType }{@code >}
     *     
     */
    public void setStateCode(JAXBElement<StateCodeType> value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PostalCodeType }{@code >}
     *     
     */
    public JAXBElement<PostalCodeType> getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PostalCodeType }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<PostalCodeType> value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the dlvryPt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DlvryPtType }{@code >}
     *     
     */
    public JAXBElement<DlvryPtType> getDlvryPt() {
        return dlvryPt;
    }

    /**
     * Sets the value of the dlvryPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DlvryPtType }{@code >}
     *     
     */
    public void setDlvryPt(JAXBElement<DlvryPtType> value) {
        this.dlvryPt = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CountyType }{@code >}
     *     
     */
    public JAXBElement<CountyType> getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CountyType }{@code >}
     *     
     */
    public void setCounty(JAXBElement<CountyType> value) {
        this.county = value;
    }

    /**
     * Gets the value of the cntry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CntryType }{@code >}
     *     
     */
    public JAXBElement<CntryType> getCntry() {
        return cntry;
    }

    /**
     * Sets the value of the cntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CntryType }{@code >}
     *     
     */
    public void setCntry(JAXBElement<CntryType> value) {
        this.cntry = value;
    }

    /**
     * Gets the value of the cntryType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CntryTypeType }{@code >}
     *     
     */
    public JAXBElement<CntryTypeType> getCntryType() {
        return cntryType;
    }

    /**
     * Sets the value of the cntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CntryTypeType }{@code >}
     *     
     */
    public void setCntryType(JAXBElement<CntryTypeType> value) {
        this.cntryType = value;
    }

    /**
     * Gets the value of the busAddr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BusAddrType }{@code >}
     *     
     */
    public JAXBElement<BusAddrType> getBusAddr() {
        return busAddr;
    }

    /**
     * Sets the value of the busAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BusAddrType }{@code >}
     *     
     */
    public void setBusAddr(JAXBElement<BusAddrType> value) {
        this.busAddr = value;
    }

    /**
     * Gets the value of the fornAddr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FornAddrType }{@code >}
     *     
     */
    public JAXBElement<FornAddrType> getFornAddr() {
        return fornAddr;
    }

    /**
     * Sets the value of the fornAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FornAddrType }{@code >}
     *     
     */
    public void setFornAddr(JAXBElement<FornAddrType> value) {
        this.fornAddr = value;
    }

    /**
     * Gets the value of the invAddr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvAddrType }{@code >}
     *     
     */
    public JAXBElement<InvAddrType> getInvAddr() {
        return invAddr;
    }

    /**
     * Sets the value of the invAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvAddrType }{@code >}
     *     
     */
    public void setInvAddr(JAXBElement<InvAddrType> value) {
        this.invAddr = value;
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
     * Gets the value of the streetAddr3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StreetAddr3Type }{@code >}
     *     
     */
    public JAXBElement<StreetAddr3Type> getStreetAddr3() {
        return streetAddr3;
    }

    /**
     * Sets the value of the streetAddr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StreetAddr3Type }{@code >}
     *     
     */
    public void setStreetAddr3(JAXBElement<StreetAddr3Type> value) {
        this.streetAddr3 = value;
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
