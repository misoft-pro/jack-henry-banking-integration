
package pro.misoft.jackhenryintegration.generated.inquiry;

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
 * <p>Java class for AcctSweepInqInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctSweepInqInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MasterAccountId" type="{http://jackhenry.com/jxchange/TPG/2008}AccountId_CType"/&gt;
 *         &lt;element name="MasterAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}MasterAcctInfo_CType"/&gt;
 *         &lt;element name="SweepAcctInqArray" type="{http://jackhenry.com/jxchange/TPG/2008}SweepAcctInqArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "AcctSweepInqInfo_CType", propOrder = {
    "masterAccountId",
    "masterAcctInfo",
    "sweepAcctInqArray",
    "ver1",
    "any"
})
public class AcctSweepInqInfoCType {

    @XmlElement(name = "MasterAccountId", required = true)
    protected AccountIdCType masterAccountId;
    @XmlElement(name = "MasterAcctInfo", required = true)
    protected MasterAcctInfoCType masterAcctInfo;
    @XmlElementRef(name = "SweepAcctInqArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SweepAcctInqArrayAType> sweepAcctInqArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the masterAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdCType }
     *     
     */
    public AccountIdCType getMasterAccountId() {
        return masterAccountId;
    }

    /**
     * Sets the value of the masterAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdCType }
     *     
     */
    public void setMasterAccountId(AccountIdCType value) {
        this.masterAccountId = value;
    }

    /**
     * Gets the value of the masterAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAcctInfoCType }
     *     
     */
    public MasterAcctInfoCType getMasterAcctInfo() {
        return masterAcctInfo;
    }

    /**
     * Sets the value of the masterAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAcctInfoCType }
     *     
     */
    public void setMasterAcctInfo(MasterAcctInfoCType value) {
        this.masterAcctInfo = value;
    }

    /**
     * Gets the value of the sweepAcctInqArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SweepAcctInqArrayAType }{@code >}
     *     
     */
    public JAXBElement<SweepAcctInqArrayAType> getSweepAcctInqArray() {
        return sweepAcctInqArray;
    }

    /**
     * Sets the value of the sweepAcctInqArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SweepAcctInqArrayAType }{@code >}
     *     
     */
    public void setSweepAcctInqArray(JAXBElement<SweepAcctInqArrayAType> value) {
        this.sweepAcctInqArray = value;
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
