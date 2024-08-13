
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
 * <p>Java class for FldInsurInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FldInsurInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FldInsurCode" type="{http://jackhenry.com/jxchange/TPG/2008}FldInsurCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CoastalBaraDt" type="{http://jackhenry.com/jxchange/TPG/2008}CoastalBaraDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CmntyId" type="{http://jackhenry.com/jxchange/TPG/2008}CmntyId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CmntyPgmDt" type="{http://jackhenry.com/jxchange/TPG/2008}CmntyPgmDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CmntyName" type="{http://jackhenry.com/jxchange/TPG/2008}CmntyName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ComplCompId" type="{http://jackhenry.com/jxchange/TPG/2008}ComplCompId_Type" minOccurs="0"/&gt;
 *         &lt;element name="FldZoneDtrId" type="{http://jackhenry.com/jxchange/TPG/2008}FldZoneDtrId_Type" minOccurs="0"/&gt;
 *         &lt;element name="FldZoneDtrCompId" type="{http://jackhenry.com/jxchange/TPG/2008}FldZoneDtrCompId_Type" minOccurs="0"/&gt;
 *         &lt;element name="FldZoneDtrContractCode" type="{http://jackhenry.com/jxchange/TPG/2008}FldZoneDtrContractCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="FldZoneDtrDt" type="{http://jackhenry.com/jxchange/TPG/2008}FldZoneDtrDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FldZoneIdArray" type="{http://jackhenry.com/jxchange/TPG/2008}FldZoneIdArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="FldZoneMapRevDt" type="{http://jackhenry.com/jxchange/TPG/2008}FldZoneMapRevDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FldZoneMapId" type="{http://jackhenry.com/jxchange/TPG/2008}FldZoneMapId_Type" minOccurs="0"/&gt;
 *         &lt;element name="FldZoneMapDt" type="{http://jackhenry.com/jxchange/TPG/2008}FldZoneMapDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="FldZonePanelDt" type="{http://jackhenry.com/jxchange/TPG/2008}FldZonePanelDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "FldInsurInfoRec_CType", propOrder = {
    "fldInsurCode",
    "coastalBaraDt",
    "cmntyId",
    "cmntyPgmDt",
    "cmntyName",
    "complCompId",
    "fldZoneDtrId",
    "fldZoneDtrCompId",
    "fldZoneDtrContractCode",
    "fldZoneDtrDt",
    "fldZoneIdArray",
    "fldZoneMapRevDt",
    "fldZoneMapId",
    "fldZoneMapDt",
    "fldZonePanelDt",
    "ver1",
    "any"
})
public class FldInsurInfoRecCType {

    @XmlElementRef(name = "FldInsurCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FldInsurCodeType> fldInsurCode;
    @XmlElementRef(name = "CoastalBaraDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CoastalBaraDtType> coastalBaraDt;
    @XmlElementRef(name = "CmntyId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CmntyIdType> cmntyId;
    @XmlElementRef(name = "CmntyPgmDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CmntyPgmDtType> cmntyPgmDt;
    @XmlElementRef(name = "CmntyName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CmntyNameType> cmntyName;
    @XmlElementRef(name = "ComplCompId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ComplCompIdType> complCompId;
    @XmlElementRef(name = "FldZoneDtrId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FldZoneDtrIdType> fldZoneDtrId;
    @XmlElementRef(name = "FldZoneDtrCompId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FldZoneDtrCompIdType> fldZoneDtrCompId;
    @XmlElementRef(name = "FldZoneDtrContractCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FldZoneDtrContractCodeType> fldZoneDtrContractCode;
    @XmlElementRef(name = "FldZoneDtrDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FldZoneDtrDtType> fldZoneDtrDt;
    @XmlElement(name = "FldZoneIdArray")
    protected FldZoneIdArrayAType fldZoneIdArray;
    @XmlElementRef(name = "FldZoneMapRevDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FldZoneMapRevDtType> fldZoneMapRevDt;
    @XmlElementRef(name = "FldZoneMapId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FldZoneMapIdType> fldZoneMapId;
    @XmlElementRef(name = "FldZoneMapDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FldZoneMapDtType> fldZoneMapDt;
    @XmlElementRef(name = "FldZonePanelDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<FldZonePanelDtType> fldZonePanelDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the fldInsurCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FldInsurCodeType }{@code >}
     *     
     */
    public JAXBElement<FldInsurCodeType> getFldInsurCode() {
        return fldInsurCode;
    }

    /**
     * Sets the value of the fldInsurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FldInsurCodeType }{@code >}
     *     
     */
    public void setFldInsurCode(JAXBElement<FldInsurCodeType> value) {
        this.fldInsurCode = value;
    }

    /**
     * Gets the value of the coastalBaraDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CoastalBaraDtType }{@code >}
     *     
     */
    public JAXBElement<CoastalBaraDtType> getCoastalBaraDt() {
        return coastalBaraDt;
    }

    /**
     * Sets the value of the coastalBaraDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CoastalBaraDtType }{@code >}
     *     
     */
    public void setCoastalBaraDt(JAXBElement<CoastalBaraDtType> value) {
        this.coastalBaraDt = value;
    }

    /**
     * Gets the value of the cmntyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CmntyIdType }{@code >}
     *     
     */
    public JAXBElement<CmntyIdType> getCmntyId() {
        return cmntyId;
    }

    /**
     * Sets the value of the cmntyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CmntyIdType }{@code >}
     *     
     */
    public void setCmntyId(JAXBElement<CmntyIdType> value) {
        this.cmntyId = value;
    }

    /**
     * Gets the value of the cmntyPgmDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CmntyPgmDtType }{@code >}
     *     
     */
    public JAXBElement<CmntyPgmDtType> getCmntyPgmDt() {
        return cmntyPgmDt;
    }

    /**
     * Sets the value of the cmntyPgmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CmntyPgmDtType }{@code >}
     *     
     */
    public void setCmntyPgmDt(JAXBElement<CmntyPgmDtType> value) {
        this.cmntyPgmDt = value;
    }

    /**
     * Gets the value of the cmntyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CmntyNameType }{@code >}
     *     
     */
    public JAXBElement<CmntyNameType> getCmntyName() {
        return cmntyName;
    }

    /**
     * Sets the value of the cmntyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CmntyNameType }{@code >}
     *     
     */
    public void setCmntyName(JAXBElement<CmntyNameType> value) {
        this.cmntyName = value;
    }

    /**
     * Gets the value of the complCompId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ComplCompIdType }{@code >}
     *     
     */
    public JAXBElement<ComplCompIdType> getComplCompId() {
        return complCompId;
    }

    /**
     * Sets the value of the complCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ComplCompIdType }{@code >}
     *     
     */
    public void setComplCompId(JAXBElement<ComplCompIdType> value) {
        this.complCompId = value;
    }

    /**
     * Gets the value of the fldZoneDtrId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FldZoneDtrIdType }{@code >}
     *     
     */
    public JAXBElement<FldZoneDtrIdType> getFldZoneDtrId() {
        return fldZoneDtrId;
    }

    /**
     * Sets the value of the fldZoneDtrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FldZoneDtrIdType }{@code >}
     *     
     */
    public void setFldZoneDtrId(JAXBElement<FldZoneDtrIdType> value) {
        this.fldZoneDtrId = value;
    }

    /**
     * Gets the value of the fldZoneDtrCompId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FldZoneDtrCompIdType }{@code >}
     *     
     */
    public JAXBElement<FldZoneDtrCompIdType> getFldZoneDtrCompId() {
        return fldZoneDtrCompId;
    }

    /**
     * Sets the value of the fldZoneDtrCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FldZoneDtrCompIdType }{@code >}
     *     
     */
    public void setFldZoneDtrCompId(JAXBElement<FldZoneDtrCompIdType> value) {
        this.fldZoneDtrCompId = value;
    }

    /**
     * Gets the value of the fldZoneDtrContractCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FldZoneDtrContractCodeType }{@code >}
     *     
     */
    public JAXBElement<FldZoneDtrContractCodeType> getFldZoneDtrContractCode() {
        return fldZoneDtrContractCode;
    }

    /**
     * Sets the value of the fldZoneDtrContractCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FldZoneDtrContractCodeType }{@code >}
     *     
     */
    public void setFldZoneDtrContractCode(JAXBElement<FldZoneDtrContractCodeType> value) {
        this.fldZoneDtrContractCode = value;
    }

    /**
     * Gets the value of the fldZoneDtrDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FldZoneDtrDtType }{@code >}
     *     
     */
    public JAXBElement<FldZoneDtrDtType> getFldZoneDtrDt() {
        return fldZoneDtrDt;
    }

    /**
     * Sets the value of the fldZoneDtrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FldZoneDtrDtType }{@code >}
     *     
     */
    public void setFldZoneDtrDt(JAXBElement<FldZoneDtrDtType> value) {
        this.fldZoneDtrDt = value;
    }

    /**
     * Gets the value of the fldZoneIdArray property.
     * 
     * @return
     *     possible object is
     *     {@link FldZoneIdArrayAType }
     *     
     */
    public FldZoneIdArrayAType getFldZoneIdArray() {
        return fldZoneIdArray;
    }

    /**
     * Sets the value of the fldZoneIdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link FldZoneIdArrayAType }
     *     
     */
    public void setFldZoneIdArray(FldZoneIdArrayAType value) {
        this.fldZoneIdArray = value;
    }

    /**
     * Gets the value of the fldZoneMapRevDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FldZoneMapRevDtType }{@code >}
     *     
     */
    public JAXBElement<FldZoneMapRevDtType> getFldZoneMapRevDt() {
        return fldZoneMapRevDt;
    }

    /**
     * Sets the value of the fldZoneMapRevDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FldZoneMapRevDtType }{@code >}
     *     
     */
    public void setFldZoneMapRevDt(JAXBElement<FldZoneMapRevDtType> value) {
        this.fldZoneMapRevDt = value;
    }

    /**
     * Gets the value of the fldZoneMapId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FldZoneMapIdType }{@code >}
     *     
     */
    public JAXBElement<FldZoneMapIdType> getFldZoneMapId() {
        return fldZoneMapId;
    }

    /**
     * Sets the value of the fldZoneMapId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FldZoneMapIdType }{@code >}
     *     
     */
    public void setFldZoneMapId(JAXBElement<FldZoneMapIdType> value) {
        this.fldZoneMapId = value;
    }

    /**
     * Gets the value of the fldZoneMapDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FldZoneMapDtType }{@code >}
     *     
     */
    public JAXBElement<FldZoneMapDtType> getFldZoneMapDt() {
        return fldZoneMapDt;
    }

    /**
     * Sets the value of the fldZoneMapDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FldZoneMapDtType }{@code >}
     *     
     */
    public void setFldZoneMapDt(JAXBElement<FldZoneMapDtType> value) {
        this.fldZoneMapDt = value;
    }

    /**
     * Gets the value of the fldZonePanelDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FldZonePanelDtType }{@code >}
     *     
     */
    public JAXBElement<FldZonePanelDtType> getFldZonePanelDt() {
        return fldZonePanelDt;
    }

    /**
     * Sets the value of the fldZonePanelDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FldZonePanelDtType }{@code >}
     *     
     */
    public void setFldZonePanelDt(JAXBElement<FldZonePanelDtType> value) {
        this.fldZonePanelDt = value;
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
