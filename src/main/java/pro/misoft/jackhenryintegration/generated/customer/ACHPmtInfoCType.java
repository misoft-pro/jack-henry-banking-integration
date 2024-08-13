
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
 * <p>Java class for ACHPmtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHPmtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHCompDiscrData" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompDiscrData_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompEntryDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompEntryDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCrAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCrName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCrName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCrRtNum" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCrRtNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHDrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHDrName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHDrRtNum" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrRtNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHSendPreNoteCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHSendPreNoteCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHStdEntryClass" type="{http://jackhenry.com/jxchange/TPG/2008}ACHStdEntryClass_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHTrnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHTrnCode_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ACHPmtInfo_CType", propOrder = {
    "achCompDiscrData",
    "achCompEntryDesc",
    "achCompId",
    "achCompName",
    "achCrAcctId",
    "achCrName",
    "achCrRtNum",
    "achDrAcctId",
    "achDrName",
    "achDrRtNum",
    "achSendPreNoteCode",
    "achStdEntryClass",
    "achTrnCode",
    "ver1",
    "any"
})
public class ACHPmtInfoCType {

    @XmlElementRef(name = "ACHCompDiscrData", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHCompDiscrDataType> achCompDiscrData;
    @XmlElementRef(name = "ACHCompEntryDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHCompEntryDescType> achCompEntryDesc;
    @XmlElementRef(name = "ACHCompId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHCompIdType> achCompId;
    @XmlElementRef(name = "ACHCompName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHCompNameType> achCompName;
    @XmlElementRef(name = "ACHCrAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHCrAcctIdType> achCrAcctId;
    @XmlElementRef(name = "ACHCrName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHCrNameType> achCrName;
    @XmlElementRef(name = "ACHCrRtNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHCrRtNumType> achCrRtNum;
    @XmlElementRef(name = "ACHDrAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHDrAcctIdType> achDrAcctId;
    @XmlElementRef(name = "ACHDrName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHDrNameType> achDrName;
    @XmlElementRef(name = "ACHDrRtNum", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHDrRtNumType> achDrRtNum;
    @XmlElementRef(name = "ACHSendPreNoteCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHSendPreNoteCodeType> achSendPreNoteCode;
    @XmlElementRef(name = "ACHStdEntryClass", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHStdEntryClassType> achStdEntryClass;
    @XmlElementRef(name = "ACHTrnCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ACHTrnCodeType> achTrnCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the achCompDiscrData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHCompDiscrDataType }{@code >}
     *     
     */
    public JAXBElement<ACHCompDiscrDataType> getACHCompDiscrData() {
        return achCompDiscrData;
    }

    /**
     * Sets the value of the achCompDiscrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHCompDiscrDataType }{@code >}
     *     
     */
    public void setACHCompDiscrData(JAXBElement<ACHCompDiscrDataType> value) {
        this.achCompDiscrData = value;
    }

    /**
     * Gets the value of the achCompEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHCompEntryDescType }{@code >}
     *     
     */
    public JAXBElement<ACHCompEntryDescType> getACHCompEntryDesc() {
        return achCompEntryDesc;
    }

    /**
     * Sets the value of the achCompEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHCompEntryDescType }{@code >}
     *     
     */
    public void setACHCompEntryDesc(JAXBElement<ACHCompEntryDescType> value) {
        this.achCompEntryDesc = value;
    }

    /**
     * Gets the value of the achCompId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHCompIdType }{@code >}
     *     
     */
    public JAXBElement<ACHCompIdType> getACHCompId() {
        return achCompId;
    }

    /**
     * Sets the value of the achCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHCompIdType }{@code >}
     *     
     */
    public void setACHCompId(JAXBElement<ACHCompIdType> value) {
        this.achCompId = value;
    }

    /**
     * Gets the value of the achCompName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHCompNameType }{@code >}
     *     
     */
    public JAXBElement<ACHCompNameType> getACHCompName() {
        return achCompName;
    }

    /**
     * Sets the value of the achCompName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHCompNameType }{@code >}
     *     
     */
    public void setACHCompName(JAXBElement<ACHCompNameType> value) {
        this.achCompName = value;
    }

    /**
     * Gets the value of the achCrAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHCrAcctIdType }{@code >}
     *     
     */
    public JAXBElement<ACHCrAcctIdType> getACHCrAcctId() {
        return achCrAcctId;
    }

    /**
     * Sets the value of the achCrAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHCrAcctIdType }{@code >}
     *     
     */
    public void setACHCrAcctId(JAXBElement<ACHCrAcctIdType> value) {
        this.achCrAcctId = value;
    }

    /**
     * Gets the value of the achCrName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHCrNameType }{@code >}
     *     
     */
    public JAXBElement<ACHCrNameType> getACHCrName() {
        return achCrName;
    }

    /**
     * Sets the value of the achCrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHCrNameType }{@code >}
     *     
     */
    public void setACHCrName(JAXBElement<ACHCrNameType> value) {
        this.achCrName = value;
    }

    /**
     * Gets the value of the achCrRtNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHCrRtNumType }{@code >}
     *     
     */
    public JAXBElement<ACHCrRtNumType> getACHCrRtNum() {
        return achCrRtNum;
    }

    /**
     * Sets the value of the achCrRtNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHCrRtNumType }{@code >}
     *     
     */
    public void setACHCrRtNum(JAXBElement<ACHCrRtNumType> value) {
        this.achCrRtNum = value;
    }

    /**
     * Gets the value of the achDrAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHDrAcctIdType }{@code >}
     *     
     */
    public JAXBElement<ACHDrAcctIdType> getACHDrAcctId() {
        return achDrAcctId;
    }

    /**
     * Sets the value of the achDrAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHDrAcctIdType }{@code >}
     *     
     */
    public void setACHDrAcctId(JAXBElement<ACHDrAcctIdType> value) {
        this.achDrAcctId = value;
    }

    /**
     * Gets the value of the achDrName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHDrNameType }{@code >}
     *     
     */
    public JAXBElement<ACHDrNameType> getACHDrName() {
        return achDrName;
    }

    /**
     * Sets the value of the achDrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHDrNameType }{@code >}
     *     
     */
    public void setACHDrName(JAXBElement<ACHDrNameType> value) {
        this.achDrName = value;
    }

    /**
     * Gets the value of the achDrRtNum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHDrRtNumType }{@code >}
     *     
     */
    public JAXBElement<ACHDrRtNumType> getACHDrRtNum() {
        return achDrRtNum;
    }

    /**
     * Sets the value of the achDrRtNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHDrRtNumType }{@code >}
     *     
     */
    public void setACHDrRtNum(JAXBElement<ACHDrRtNumType> value) {
        this.achDrRtNum = value;
    }

    /**
     * Gets the value of the achSendPreNoteCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHSendPreNoteCodeType }{@code >}
     *     
     */
    public JAXBElement<ACHSendPreNoteCodeType> getACHSendPreNoteCode() {
        return achSendPreNoteCode;
    }

    /**
     * Sets the value of the achSendPreNoteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHSendPreNoteCodeType }{@code >}
     *     
     */
    public void setACHSendPreNoteCode(JAXBElement<ACHSendPreNoteCodeType> value) {
        this.achSendPreNoteCode = value;
    }

    /**
     * Gets the value of the achStdEntryClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHStdEntryClassType }{@code >}
     *     
     */
    public JAXBElement<ACHStdEntryClassType> getACHStdEntryClass() {
        return achStdEntryClass;
    }

    /**
     * Sets the value of the achStdEntryClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHStdEntryClassType }{@code >}
     *     
     */
    public void setACHStdEntryClass(JAXBElement<ACHStdEntryClassType> value) {
        this.achStdEntryClass = value;
    }

    /**
     * Gets the value of the achTrnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACHTrnCodeType }{@code >}
     *     
     */
    public JAXBElement<ACHTrnCodeType> getACHTrnCode() {
        return achTrnCode;
    }

    /**
     * Sets the value of the achTrnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACHTrnCodeType }{@code >}
     *     
     */
    public void setACHTrnCode(JAXBElement<ACHTrnCodeType> value) {
        this.achTrnCode = value;
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
