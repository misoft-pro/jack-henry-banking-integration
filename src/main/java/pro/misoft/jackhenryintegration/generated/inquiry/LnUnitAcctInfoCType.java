
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for LnUnitAcctInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnUnitAcctInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClsOnZeroBal" type="{http://jackhenry.com/jxchange/TPG/2008}ClsOnZeroBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtBilNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtBilNotCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrePmtPenCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrePmtPenCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinBilAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MinBilAmt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="VehicleId" type="{http://jackhenry.com/jxchange/TPG/2008}VehicleId_Type" minOccurs="0"/&gt;
 *           &lt;element name="UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfoArray_AType" minOccurs="0"/&gt;
 *           &lt;element name="State" type="{http://jackhenry.com/jxchange/TPG/2008}State_Type" minOccurs="0"/&gt;
 *           &lt;element name="CollatCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="PurpCode" type="{http://jackhenry.com/jxchange/TPG/2008}PurpCode_Type" minOccurs="0"/&gt;
 *           &lt;element name="TitleNeeded" type="{http://jackhenry.com/jxchange/TPG/2008}TitleNeeded_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnUnitAcctInfo_CType", propOrder = {
    "clsOnZeroBal",
    "prtBilNotCode",
    "prePmtPenCode",
    "minBilAmt",
    "ver1",
    "vehicleId",
    "userDefInfoArray",
    "state",
    "collatCode",
    "purpCode",
    "titleNeeded",
    "ver2",
    "any"
})
public class LnUnitAcctInfoCType {

    @XmlElement(name = "ClsOnZeroBal")
    protected ClsOnZeroBalType clsOnZeroBal;
    @XmlElement(name = "PrtBilNotCode")
    protected PrtBilNotCodeType prtBilNotCode;
    @XmlElement(name = "PrePmtPenCode")
    protected PrePmtPenCodeType prePmtPenCode;
    @XmlElement(name = "MinBilAmt")
    protected MinBilAmtType minBilAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "VehicleId")
    protected VehicleIdType vehicleId;
    @XmlElement(name = "UserDefInfoArray")
    protected UserDefInfoArrayAType userDefInfoArray;
    @XmlElement(name = "State")
    protected StateType state;
    @XmlElement(name = "CollatCode")
    protected CollatCodeType collatCode;
    @XmlElement(name = "PurpCode")
    protected PurpCodeType purpCode;
    @XmlElement(name = "TitleNeeded")
    protected TitleNeededType titleNeeded;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the clsOnZeroBal property.
     * 
     * @return
     *     possible object is
     *     {@link ClsOnZeroBalType }
     *     
     */
    public ClsOnZeroBalType getClsOnZeroBal() {
        return clsOnZeroBal;
    }

    /**
     * Sets the value of the clsOnZeroBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsOnZeroBalType }
     *     
     */
    public void setClsOnZeroBal(ClsOnZeroBalType value) {
        this.clsOnZeroBal = value;
    }

    /**
     * Gets the value of the prtBilNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrtBilNotCodeType }
     *     
     */
    public PrtBilNotCodeType getPrtBilNotCode() {
        return prtBilNotCode;
    }

    /**
     * Sets the value of the prtBilNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtBilNotCodeType }
     *     
     */
    public void setPrtBilNotCode(PrtBilNotCodeType value) {
        this.prtBilNotCode = value;
    }

    /**
     * Gets the value of the prePmtPenCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrePmtPenCodeType }
     *     
     */
    public PrePmtPenCodeType getPrePmtPenCode() {
        return prePmtPenCode;
    }

    /**
     * Sets the value of the prePmtPenCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePmtPenCodeType }
     *     
     */
    public void setPrePmtPenCode(PrePmtPenCodeType value) {
        this.prePmtPenCode = value;
    }

    /**
     * Gets the value of the minBilAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MinBilAmtType }
     *     
     */
    public MinBilAmtType getMinBilAmt() {
        return minBilAmt;
    }

    /**
     * Sets the value of the minBilAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinBilAmtType }
     *     
     */
    public void setMinBilAmt(MinBilAmtType value) {
        this.minBilAmt = value;
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
     * Gets the value of the vehicleId property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleIdType }
     *     
     */
    public VehicleIdType getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleIdType }
     *     
     */
    public void setVehicleId(VehicleIdType value) {
        this.vehicleId = value;
    }

    /**
     * Gets the value of the userDefInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public UserDefInfoArrayAType getUserDefInfoArray() {
        return userDefInfoArray;
    }

    /**
     * Sets the value of the userDefInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public void setUserDefInfoArray(UserDefInfoArrayAType value) {
        this.userDefInfoArray = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setState(StateType value) {
        this.state = value;
    }

    /**
     * Gets the value of the collatCode property.
     * 
     * @return
     *     possible object is
     *     {@link CollatCodeType }
     *     
     */
    public CollatCodeType getCollatCode() {
        return collatCode;
    }

    /**
     * Sets the value of the collatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatCodeType }
     *     
     */
    public void setCollatCode(CollatCodeType value) {
        this.collatCode = value;
    }

    /**
     * Gets the value of the purpCode property.
     * 
     * @return
     *     possible object is
     *     {@link PurpCodeType }
     *     
     */
    public PurpCodeType getPurpCode() {
        return purpCode;
    }

    /**
     * Sets the value of the purpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurpCodeType }
     *     
     */
    public void setPurpCode(PurpCodeType value) {
        this.purpCode = value;
    }

    /**
     * Gets the value of the titleNeeded property.
     * 
     * @return
     *     possible object is
     *     {@link TitleNeededType }
     *     
     */
    public TitleNeededType getTitleNeeded() {
        return titleNeeded;
    }

    /**
     * Sets the value of the titleNeeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleNeededType }
     *     
     */
    public void setTitleNeeded(TitleNeededType value) {
        this.titleNeeded = value;
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
