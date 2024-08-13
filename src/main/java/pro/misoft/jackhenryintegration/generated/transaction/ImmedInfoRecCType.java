
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ImmedInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImmedInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtRailType" type="{http://jackhenry.com/jxchange/TPG/2008}PmtRailType_Type"/&gt;
 *         &lt;element name="UsrIPAddr" type="{http://jackhenry.com/jxchange/TPG/2008}UsrIPAddr_Type" minOccurs="0"/&gt;
 *         &lt;element name="MobDevId" type="{http://jackhenry.com/jxchange/TPG/2008}MobDevId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrCustInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}DrCustInfoRec_CType"/&gt;
 *         &lt;element name="CrCustInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}CrCustInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="RemitPmtArray" type="{http://jackhenry.com/jxchange/TPG/2008}RemitPmtArray_AType" minOccurs="0"/&gt;
 *         &lt;element name="PmtRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="OrigTrnRcptId" type="{http://jackhenry.com/jxchange/TPG/2008}TrnRcptId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ImmedInfoRec_CType", propOrder = {
    "pmtRailType",
    "usrIPAddr",
    "mobDevId",
    "drCustInfoRec",
    "crCustInfoRec",
    "remitPmtArray",
    "pmtRmkArray",
    "ver1",
    "origTrnRcptId",
    "ver2",
    "any"
})
public class ImmedInfoRecCType {

    @XmlElement(name = "PmtRailType", required = true)
    protected PmtRailTypeType pmtRailType;
    @XmlElement(name = "UsrIPAddr")
    protected UsrIPAddrType usrIPAddr;
    @XmlElement(name = "MobDevId")
    protected MobDevIdType mobDevId;
    @XmlElement(name = "DrCustInfoRec", required = true)
    protected DrCustInfoRecCType drCustInfoRec;
    @XmlElement(name = "CrCustInfoRec")
    protected CrCustInfoRecCType crCustInfoRec;
    @XmlElement(name = "RemitPmtArray")
    protected RemitPmtArrayAType remitPmtArray;
    @XmlElement(name = "PmtRmkArray")
    protected RmkAType pmtRmkArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "OrigTrnRcptId")
    protected TrnRcptIdType origTrnRcptId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pmtRailType property.
     * 
     * @return
     *     possible object is
     *     {@link PmtRailTypeType }
     *     
     */
    public PmtRailTypeType getPmtRailType() {
        return pmtRailType;
    }

    /**
     * Sets the value of the pmtRailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtRailTypeType }
     *     
     */
    public void setPmtRailType(PmtRailTypeType value) {
        this.pmtRailType = value;
    }

    /**
     * Gets the value of the usrIPAddr property.
     * 
     * @return
     *     possible object is
     *     {@link UsrIPAddrType }
     *     
     */
    public UsrIPAddrType getUsrIPAddr() {
        return usrIPAddr;
    }

    /**
     * Sets the value of the usrIPAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsrIPAddrType }
     *     
     */
    public void setUsrIPAddr(UsrIPAddrType value) {
        this.usrIPAddr = value;
    }

    /**
     * Gets the value of the mobDevId property.
     * 
     * @return
     *     possible object is
     *     {@link MobDevIdType }
     *     
     */
    public MobDevIdType getMobDevId() {
        return mobDevId;
    }

    /**
     * Sets the value of the mobDevId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobDevIdType }
     *     
     */
    public void setMobDevId(MobDevIdType value) {
        this.mobDevId = value;
    }

    /**
     * Gets the value of the drCustInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link DrCustInfoRecCType }
     *     
     */
    public DrCustInfoRecCType getDrCustInfoRec() {
        return drCustInfoRec;
    }

    /**
     * Sets the value of the drCustInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrCustInfoRecCType }
     *     
     */
    public void setDrCustInfoRec(DrCustInfoRecCType value) {
        this.drCustInfoRec = value;
    }

    /**
     * Gets the value of the crCustInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link CrCustInfoRecCType }
     *     
     */
    public CrCustInfoRecCType getCrCustInfoRec() {
        return crCustInfoRec;
    }

    /**
     * Sets the value of the crCustInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCustInfoRecCType }
     *     
     */
    public void setCrCustInfoRec(CrCustInfoRecCType value) {
        this.crCustInfoRec = value;
    }

    /**
     * Gets the value of the remitPmtArray property.
     * 
     * @return
     *     possible object is
     *     {@link RemitPmtArrayAType }
     *     
     */
    public RemitPmtArrayAType getRemitPmtArray() {
        return remitPmtArray;
    }

    /**
     * Sets the value of the remitPmtArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemitPmtArrayAType }
     *     
     */
    public void setRemitPmtArray(RemitPmtArrayAType value) {
        this.remitPmtArray = value;
    }

    /**
     * Gets the value of the pmtRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAType }
     *     
     */
    public RmkAType getPmtRmkArray() {
        return pmtRmkArray;
    }

    /**
     * Sets the value of the pmtRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAType }
     *     
     */
    public void setPmtRmkArray(RmkAType value) {
        this.pmtRmkArray = value;
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
     * Gets the value of the origTrnRcptId property.
     * 
     * @return
     *     possible object is
     *     {@link TrnRcptIdType }
     *     
     */
    public TrnRcptIdType getOrigTrnRcptId() {
        return origTrnRcptId;
    }

    /**
     * Sets the value of the origTrnRcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnRcptIdType }
     *     
     */
    public void setOrigTrnRcptId(TrnRcptIdType value) {
        this.origTrnRcptId = value;
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
