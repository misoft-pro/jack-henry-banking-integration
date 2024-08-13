
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
 * <p>Java class for EFTCardAwardsInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardAwardsInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardHouseHoldId" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardHouseHoldId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardAwardsEnrollDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAwardsEnrollDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardAwardsPrtcpType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAwardsPrtcpType_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardAwardsPrtcpFlgChngDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAwardsPrtcpFlgChngDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardAwardsLastEnrollDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAwardsLastEnrollDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardAwardsLastUnenrollDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAwardsLastUnenrollDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardAwardsProcDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAwardsProcDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardAwardsLastProcTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAwardsLastProcTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardAwardsCreatedTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAwardsCreatedTimeDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTCardAwardsChngTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAwardsChngTimeDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EFTCardAwardsInfoRec_CType", propOrder = {
    "eftCardHouseHoldId",
    "eftCardAwardsEnrollDt",
    "eftCardAwardsPrtcpType",
    "eftCardAwardsPrtcpFlgChngDt",
    "eftCardAwardsLastEnrollDt",
    "eftCardAwardsLastUnenrollDt",
    "eftCardAwardsProcDt",
    "eftCardAwardsLastProcTimeDt",
    "eftCardAwardsCreatedTimeDt",
    "eftCardAwardsChngTimeDt",
    "ver1",
    "any"
})
public class EFTCardAwardsInfoRecCType {

    @XmlElement(name = "EFTCardHouseHoldId")
    protected EFTCardHouseHoldIdType eftCardHouseHoldId;
    @XmlElement(name = "EFTCardAwardsEnrollDt")
    protected EFTCardAwardsEnrollDtType eftCardAwardsEnrollDt;
    @XmlElement(name = "EFTCardAwardsPrtcpType")
    protected EFTCardAwardsPrtcpTypeType eftCardAwardsPrtcpType;
    @XmlElement(name = "EFTCardAwardsPrtcpFlgChngDt")
    protected EFTCardAwardsPrtcpFlgChngDtType eftCardAwardsPrtcpFlgChngDt;
    @XmlElement(name = "EFTCardAwardsLastEnrollDt")
    protected EFTCardAwardsLastEnrollDtType eftCardAwardsLastEnrollDt;
    @XmlElement(name = "EFTCardAwardsLastUnenrollDt")
    protected EFTCardAwardsLastUnenrollDtType eftCardAwardsLastUnenrollDt;
    @XmlElement(name = "EFTCardAwardsProcDt")
    protected EFTCardAwardsProcDtType eftCardAwardsProcDt;
    @XmlElement(name = "EFTCardAwardsLastProcTimeDt")
    protected EFTCardAwardsLastProcTimeDtType eftCardAwardsLastProcTimeDt;
    @XmlElement(name = "EFTCardAwardsCreatedTimeDt")
    protected EFTCardAwardsCreatedTimeDtType eftCardAwardsCreatedTimeDt;
    @XmlElement(name = "EFTCardAwardsChngTimeDt")
    protected EFTCardAwardsChngTimeDtType eftCardAwardsChngTimeDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eftCardHouseHoldId property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardHouseHoldIdType }
     *     
     */
    public EFTCardHouseHoldIdType getEFTCardHouseHoldId() {
        return eftCardHouseHoldId;
    }

    /**
     * Sets the value of the eftCardHouseHoldId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardHouseHoldIdType }
     *     
     */
    public void setEFTCardHouseHoldId(EFTCardHouseHoldIdType value) {
        this.eftCardHouseHoldId = value;
    }

    /**
     * Gets the value of the eftCardAwardsEnrollDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardAwardsEnrollDtType }
     *     
     */
    public EFTCardAwardsEnrollDtType getEFTCardAwardsEnrollDt() {
        return eftCardAwardsEnrollDt;
    }

    /**
     * Sets the value of the eftCardAwardsEnrollDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardAwardsEnrollDtType }
     *     
     */
    public void setEFTCardAwardsEnrollDt(EFTCardAwardsEnrollDtType value) {
        this.eftCardAwardsEnrollDt = value;
    }

    /**
     * Gets the value of the eftCardAwardsPrtcpType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardAwardsPrtcpTypeType }
     *     
     */
    public EFTCardAwardsPrtcpTypeType getEFTCardAwardsPrtcpType() {
        return eftCardAwardsPrtcpType;
    }

    /**
     * Sets the value of the eftCardAwardsPrtcpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardAwardsPrtcpTypeType }
     *     
     */
    public void setEFTCardAwardsPrtcpType(EFTCardAwardsPrtcpTypeType value) {
        this.eftCardAwardsPrtcpType = value;
    }

    /**
     * Gets the value of the eftCardAwardsPrtcpFlgChngDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardAwardsPrtcpFlgChngDtType }
     *     
     */
    public EFTCardAwardsPrtcpFlgChngDtType getEFTCardAwardsPrtcpFlgChngDt() {
        return eftCardAwardsPrtcpFlgChngDt;
    }

    /**
     * Sets the value of the eftCardAwardsPrtcpFlgChngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardAwardsPrtcpFlgChngDtType }
     *     
     */
    public void setEFTCardAwardsPrtcpFlgChngDt(EFTCardAwardsPrtcpFlgChngDtType value) {
        this.eftCardAwardsPrtcpFlgChngDt = value;
    }

    /**
     * Gets the value of the eftCardAwardsLastEnrollDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardAwardsLastEnrollDtType }
     *     
     */
    public EFTCardAwardsLastEnrollDtType getEFTCardAwardsLastEnrollDt() {
        return eftCardAwardsLastEnrollDt;
    }

    /**
     * Sets the value of the eftCardAwardsLastEnrollDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardAwardsLastEnrollDtType }
     *     
     */
    public void setEFTCardAwardsLastEnrollDt(EFTCardAwardsLastEnrollDtType value) {
        this.eftCardAwardsLastEnrollDt = value;
    }

    /**
     * Gets the value of the eftCardAwardsLastUnenrollDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardAwardsLastUnenrollDtType }
     *     
     */
    public EFTCardAwardsLastUnenrollDtType getEFTCardAwardsLastUnenrollDt() {
        return eftCardAwardsLastUnenrollDt;
    }

    /**
     * Sets the value of the eftCardAwardsLastUnenrollDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardAwardsLastUnenrollDtType }
     *     
     */
    public void setEFTCardAwardsLastUnenrollDt(EFTCardAwardsLastUnenrollDtType value) {
        this.eftCardAwardsLastUnenrollDt = value;
    }

    /**
     * Gets the value of the eftCardAwardsProcDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardAwardsProcDtType }
     *     
     */
    public EFTCardAwardsProcDtType getEFTCardAwardsProcDt() {
        return eftCardAwardsProcDt;
    }

    /**
     * Sets the value of the eftCardAwardsProcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardAwardsProcDtType }
     *     
     */
    public void setEFTCardAwardsProcDt(EFTCardAwardsProcDtType value) {
        this.eftCardAwardsProcDt = value;
    }

    /**
     * Gets the value of the eftCardAwardsLastProcTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardAwardsLastProcTimeDtType }
     *     
     */
    public EFTCardAwardsLastProcTimeDtType getEFTCardAwardsLastProcTimeDt() {
        return eftCardAwardsLastProcTimeDt;
    }

    /**
     * Sets the value of the eftCardAwardsLastProcTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardAwardsLastProcTimeDtType }
     *     
     */
    public void setEFTCardAwardsLastProcTimeDt(EFTCardAwardsLastProcTimeDtType value) {
        this.eftCardAwardsLastProcTimeDt = value;
    }

    /**
     * Gets the value of the eftCardAwardsCreatedTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardAwardsCreatedTimeDtType }
     *     
     */
    public EFTCardAwardsCreatedTimeDtType getEFTCardAwardsCreatedTimeDt() {
        return eftCardAwardsCreatedTimeDt;
    }

    /**
     * Sets the value of the eftCardAwardsCreatedTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardAwardsCreatedTimeDtType }
     *     
     */
    public void setEFTCardAwardsCreatedTimeDt(EFTCardAwardsCreatedTimeDtType value) {
        this.eftCardAwardsCreatedTimeDt = value;
    }

    /**
     * Gets the value of the eftCardAwardsChngTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardAwardsChngTimeDtType }
     *     
     */
    public EFTCardAwardsChngTimeDtType getEFTCardAwardsChngTimeDt() {
        return eftCardAwardsChngTimeDt;
    }

    /**
     * Sets the value of the eftCardAwardsChngTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardAwardsChngTimeDtType }
     *     
     */
    public void setEFTCardAwardsChngTimeDt(EFTCardAwardsChngTimeDtType value) {
        this.eftCardAwardsChngTimeDt = value;
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
