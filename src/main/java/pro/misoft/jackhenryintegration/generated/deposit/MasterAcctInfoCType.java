
package pro.misoft.jackhenryintegration.generated.deposit;

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
 * <p>Java class for MasterAcctInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterAcctInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MasterProcLvl" type="{http://jackhenry.com/jxchange/TPG/2008}MasterProcLvl_Type" minOccurs="0"/&gt;
 *         &lt;element name="MasterCeilBal" type="{http://jackhenry.com/jxchange/TPG/2008}MasterCeilBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="MasterFlrBal" type="{http://jackhenry.com/jxchange/TPG/2008}MasterFlrBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="MasterFlrTgtBal" type="{http://jackhenry.com/jxchange/TPG/2008}MasterTgtBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="MasterInvAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}MasterInvAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="MasterInvAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}MasterInvAcctType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "MasterAcctInfo_CType", propOrder = {
    "masterProcLvl",
    "masterCeilBal",
    "masterFlrBal",
    "masterFlrTgtBal",
    "masterInvAcctId",
    "masterInvAcctType",
    "ver1",
    "any"
})
public class MasterAcctInfoCType {

    @XmlElementRef(name = "MasterProcLvl", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MasterProcLvlType> masterProcLvl;
    @XmlElementRef(name = "MasterCeilBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MasterCeilBalType> masterCeilBal;
    @XmlElementRef(name = "MasterFlrBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MasterFlrBalType> masterFlrBal;
    @XmlElementRef(name = "MasterFlrTgtBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MasterTgtBalType> masterFlrTgtBal;
    @XmlElementRef(name = "MasterInvAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MasterInvAcctIdType> masterInvAcctId;
    @XmlElementRef(name = "MasterInvAcctType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MasterInvAcctTypeType> masterInvAcctType;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the masterProcLvl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MasterProcLvlType }{@code >}
     *     
     */
    public JAXBElement<MasterProcLvlType> getMasterProcLvl() {
        return masterProcLvl;
    }

    /**
     * Sets the value of the masterProcLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MasterProcLvlType }{@code >}
     *     
     */
    public void setMasterProcLvl(JAXBElement<MasterProcLvlType> value) {
        this.masterProcLvl = value;
    }

    /**
     * Gets the value of the masterCeilBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MasterCeilBalType }{@code >}
     *     
     */
    public JAXBElement<MasterCeilBalType> getMasterCeilBal() {
        return masterCeilBal;
    }

    /**
     * Sets the value of the masterCeilBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MasterCeilBalType }{@code >}
     *     
     */
    public void setMasterCeilBal(JAXBElement<MasterCeilBalType> value) {
        this.masterCeilBal = value;
    }

    /**
     * Gets the value of the masterFlrBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MasterFlrBalType }{@code >}
     *     
     */
    public JAXBElement<MasterFlrBalType> getMasterFlrBal() {
        return masterFlrBal;
    }

    /**
     * Sets the value of the masterFlrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MasterFlrBalType }{@code >}
     *     
     */
    public void setMasterFlrBal(JAXBElement<MasterFlrBalType> value) {
        this.masterFlrBal = value;
    }

    /**
     * Gets the value of the masterFlrTgtBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MasterTgtBalType }{@code >}
     *     
     */
    public JAXBElement<MasterTgtBalType> getMasterFlrTgtBal() {
        return masterFlrTgtBal;
    }

    /**
     * Sets the value of the masterFlrTgtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MasterTgtBalType }{@code >}
     *     
     */
    public void setMasterFlrTgtBal(JAXBElement<MasterTgtBalType> value) {
        this.masterFlrTgtBal = value;
    }

    /**
     * Gets the value of the masterInvAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MasterInvAcctIdType }{@code >}
     *     
     */
    public JAXBElement<MasterInvAcctIdType> getMasterInvAcctId() {
        return masterInvAcctId;
    }

    /**
     * Sets the value of the masterInvAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MasterInvAcctIdType }{@code >}
     *     
     */
    public void setMasterInvAcctId(JAXBElement<MasterInvAcctIdType> value) {
        this.masterInvAcctId = value;
    }

    /**
     * Gets the value of the masterInvAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MasterInvAcctTypeType }{@code >}
     *     
     */
    public JAXBElement<MasterInvAcctTypeType> getMasterInvAcctType() {
        return masterInvAcctType;
    }

    /**
     * Sets the value of the masterInvAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MasterInvAcctTypeType }{@code >}
     *     
     */
    public void setMasterInvAcctType(JAXBElement<MasterInvAcctTypeType> value) {
        this.masterInvAcctType = value;
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
