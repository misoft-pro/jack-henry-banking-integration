
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
 * <p>Java class for x_BusDetail_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_BusDetail_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusDetail" type="{http://jackhenry.com/jxchange/TPG/2008}BusDetail_CType" minOccurs="0"/&gt;
 *         &lt;element name="OffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CustDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="GroupDesc" type="{http://jackhenry.com/jxchange/TPG/2008}GroupDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="InsiderDesc" type="{http://jackhenry.com/jxchange/TPG/2008}InsiderDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustImporDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CustImporDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="LeaseSecDesc" type="{http://jackhenry.com/jxchange/TPG/2008}LeaseSecDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustCycleDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CustCycleDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="MailDirDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MailDirDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="FinStmtWavDesc" type="{http://jackhenry.com/jxchange/TPG/2008}FinStmtWavDesc_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="SalesPersonDesc" type="{http://jackhenry.com/jxchange/TPG/2008}SalesPersonDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_BusDetail_CType", propOrder = {
    "busDetail",
    "offDesc",
    "brDesc",
    "custDesc",
    "groupDesc",
    "insiderDesc",
    "custImporDesc",
    "leaseSecDesc",
    "custCycleDesc",
    "mailDirDesc",
    "finStmtWavDesc",
    "ver1",
    "salesPersonDesc",
    "ver2",
    "any"
})
public class XBusDetailCType {

    @XmlElement(name = "BusDetail")
    protected BusDetailCType busDetail;
    @XmlElement(name = "OffDesc")
    protected OffDescType offDesc;
    @XmlElement(name = "BrDesc")
    protected BrDescType brDesc;
    @XmlElement(name = "CustDesc")
    protected CustDescType custDesc;
    @XmlElement(name = "GroupDesc")
    protected GroupDescType groupDesc;
    @XmlElement(name = "InsiderDesc")
    protected InsiderDescType insiderDesc;
    @XmlElement(name = "CustImporDesc")
    protected CustImporDescType custImporDesc;
    @XmlElement(name = "LeaseSecDesc")
    protected LeaseSecDescType leaseSecDesc;
    @XmlElement(name = "CustCycleDesc")
    protected CustCycleDescType custCycleDesc;
    @XmlElement(name = "MailDirDesc")
    protected MailDirDescType mailDirDesc;
    @XmlElement(name = "FinStmtWavDesc")
    protected FinStmtWavDescType finStmtWavDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "SalesPersonDesc")
    protected SalesPersonDescType salesPersonDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the busDetail property.
     * 
     * @return
     *     possible object is
     *     {@link BusDetailCType }
     *     
     */
    public BusDetailCType getBusDetail() {
        return busDetail;
    }

    /**
     * Sets the value of the busDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusDetailCType }
     *     
     */
    public void setBusDetail(BusDetailCType value) {
        this.busDetail = value;
    }

    /**
     * Gets the value of the offDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OffDescType }
     *     
     */
    public OffDescType getOffDesc() {
        return offDesc;
    }

    /**
     * Sets the value of the offDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffDescType }
     *     
     */
    public void setOffDesc(OffDescType value) {
        this.offDesc = value;
    }

    /**
     * Gets the value of the brDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrDescType }
     *     
     */
    public BrDescType getBrDesc() {
        return brDesc;
    }

    /**
     * Sets the value of the brDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrDescType }
     *     
     */
    public void setBrDesc(BrDescType value) {
        this.brDesc = value;
    }

    /**
     * Gets the value of the custDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CustDescType }
     *     
     */
    public CustDescType getCustDesc() {
        return custDesc;
    }

    /**
     * Sets the value of the custDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustDescType }
     *     
     */
    public void setCustDesc(CustDescType value) {
        this.custDesc = value;
    }

    /**
     * Gets the value of the groupDesc property.
     * 
     * @return
     *     possible object is
     *     {@link GroupDescType }
     *     
     */
    public GroupDescType getGroupDesc() {
        return groupDesc;
    }

    /**
     * Sets the value of the groupDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupDescType }
     *     
     */
    public void setGroupDesc(GroupDescType value) {
        this.groupDesc = value;
    }

    /**
     * Gets the value of the insiderDesc property.
     * 
     * @return
     *     possible object is
     *     {@link InsiderDescType }
     *     
     */
    public InsiderDescType getInsiderDesc() {
        return insiderDesc;
    }

    /**
     * Sets the value of the insiderDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsiderDescType }
     *     
     */
    public void setInsiderDesc(InsiderDescType value) {
        this.insiderDesc = value;
    }

    /**
     * Gets the value of the custImporDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CustImporDescType }
     *     
     */
    public CustImporDescType getCustImporDesc() {
        return custImporDesc;
    }

    /**
     * Sets the value of the custImporDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustImporDescType }
     *     
     */
    public void setCustImporDesc(CustImporDescType value) {
        this.custImporDesc = value;
    }

    /**
     * Gets the value of the leaseSecDesc property.
     * 
     * @return
     *     possible object is
     *     {@link LeaseSecDescType }
     *     
     */
    public LeaseSecDescType getLeaseSecDesc() {
        return leaseSecDesc;
    }

    /**
     * Sets the value of the leaseSecDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaseSecDescType }
     *     
     */
    public void setLeaseSecDesc(LeaseSecDescType value) {
        this.leaseSecDesc = value;
    }

    /**
     * Gets the value of the custCycleDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CustCycleDescType }
     *     
     */
    public CustCycleDescType getCustCycleDesc() {
        return custCycleDesc;
    }

    /**
     * Sets the value of the custCycleDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustCycleDescType }
     *     
     */
    public void setCustCycleDesc(CustCycleDescType value) {
        this.custCycleDesc = value;
    }

    /**
     * Gets the value of the mailDirDesc property.
     * 
     * @return
     *     possible object is
     *     {@link MailDirDescType }
     *     
     */
    public MailDirDescType getMailDirDesc() {
        return mailDirDesc;
    }

    /**
     * Sets the value of the mailDirDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailDirDescType }
     *     
     */
    public void setMailDirDesc(MailDirDescType value) {
        this.mailDirDesc = value;
    }

    /**
     * Gets the value of the finStmtWavDesc property.
     * 
     * @return
     *     possible object is
     *     {@link FinStmtWavDescType }
     *     
     */
    public FinStmtWavDescType getFinStmtWavDesc() {
        return finStmtWavDesc;
    }

    /**
     * Sets the value of the finStmtWavDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinStmtWavDescType }
     *     
     */
    public void setFinStmtWavDesc(FinStmtWavDescType value) {
        this.finStmtWavDesc = value;
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
     * Gets the value of the salesPersonDesc property.
     * 
     * @return
     *     possible object is
     *     {@link SalesPersonDescType }
     *     
     */
    public SalesPersonDescType getSalesPersonDesc() {
        return salesPersonDesc;
    }

    /**
     * Sets the value of the salesPersonDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesPersonDescType }
     *     
     */
    public void setSalesPersonDesc(SalesPersonDescType value) {
        this.salesPersonDesc = value;
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
