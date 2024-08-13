
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
 * <p>Java class for MasterInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MasterRec" type="{http://jackhenry.com/jxchange/TPG/2008}MasterRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="PersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="MultiLvlLndType" type="{http://jackhenry.com/jxchange/TPG/2008}MultiLvlLndType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="MatDt" type="{http://jackhenry.com/jxchange/TPG/2008}MatDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtcpCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtcpDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PartIdNum" type="{http://jackhenry.com/jxchange/TPG/2008}PartIdNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCExpDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCAvlBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCAvlBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LOCCurBal" type="{http://jackhenry.com/jxchange/TPG/2008}LOCCurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "MasterInqRec_CType", propOrder = {
    "masterRec",
    "personName",
    "custId",
    "multiLvlLndType",
    "curBal",
    "matDt",
    "prtcpCode",
    "prtcpDesc",
    "partIdNum",
    "locAcctId",
    "locExpDt",
    "locAmt",
    "locAvlBal",
    "locCurBal",
    "custom",
    "ver1",
    "any"
})
public class MasterInqRecCType {

    @XmlElement(name = "MasterRec")
    protected MasterRecCType masterRec;
    @XmlElement(name = "PersonName")
    protected PersonNameCType personName;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "MultiLvlLndType")
    protected MultiLvlLndTypeType multiLvlLndType;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "MatDt")
    protected MatDtType matDt;
    @XmlElement(name = "PrtcpCode")
    protected PrtcpCodeType prtcpCode;
    @XmlElement(name = "PrtcpDesc")
    protected PrtcpDescType prtcpDesc;
    @XmlElement(name = "PartIdNum")
    protected PartIdNumType partIdNum;
    @XmlElement(name = "LOCAcctId")
    protected LOCAcctIdType locAcctId;
    @XmlElement(name = "LOCExpDt")
    protected LOCExpDtType locExpDt;
    @XmlElement(name = "LOCAmt")
    protected LOCAmtType locAmt;
    @XmlElement(name = "LOCAvlBal")
    protected LOCAvlBalType locAvlBal;
    @XmlElement(name = "LOCCurBal")
    protected LOCCurBalType locCurBal;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the masterRec property.
     * 
     * @return
     *     possible object is
     *     {@link MasterRecCType }
     *     
     */
    public MasterRecCType getMasterRec() {
        return masterRec;
    }

    /**
     * Sets the value of the masterRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterRecCType }
     *     
     */
    public void setMasterRec(MasterRecCType value) {
        this.masterRec = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setPersonName(PersonNameCType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCustId(CustIdType value) {
        this.custId = value;
    }

    /**
     * Gets the value of the multiLvlLndType property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLvlLndTypeType }
     *     
     */
    public MultiLvlLndTypeType getMultiLvlLndType() {
        return multiLvlLndType;
    }

    /**
     * Sets the value of the multiLvlLndType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLvlLndTypeType }
     *     
     */
    public void setMultiLvlLndType(MultiLvlLndTypeType value) {
        this.multiLvlLndType = value;
    }

    /**
     * Gets the value of the curBal property.
     * 
     * @return
     *     possible object is
     *     {@link CurBalType }
     *     
     */
    public CurBalType getCurBal() {
        return curBal;
    }

    /**
     * Sets the value of the curBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurBalType }
     *     
     */
    public void setCurBal(CurBalType value) {
        this.curBal = value;
    }

    /**
     * Gets the value of the matDt property.
     * 
     * @return
     *     possible object is
     *     {@link MatDtType }
     *     
     */
    public MatDtType getMatDt() {
        return matDt;
    }

    /**
     * Sets the value of the matDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatDtType }
     *     
     */
    public void setMatDt(MatDtType value) {
        this.matDt = value;
    }

    /**
     * Gets the value of the prtcpCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrtcpCodeType }
     *     
     */
    public PrtcpCodeType getPrtcpCode() {
        return prtcpCode;
    }

    /**
     * Sets the value of the prtcpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtcpCodeType }
     *     
     */
    public void setPrtcpCode(PrtcpCodeType value) {
        this.prtcpCode = value;
    }

    /**
     * Gets the value of the prtcpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrtcpDescType }
     *     
     */
    public PrtcpDescType getPrtcpDesc() {
        return prtcpDesc;
    }

    /**
     * Sets the value of the prtcpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtcpDescType }
     *     
     */
    public void setPrtcpDesc(PrtcpDescType value) {
        this.prtcpDesc = value;
    }

    /**
     * Gets the value of the partIdNum property.
     * 
     * @return
     *     possible object is
     *     {@link PartIdNumType }
     *     
     */
    public PartIdNumType getPartIdNum() {
        return partIdNum;
    }

    /**
     * Sets the value of the partIdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartIdNumType }
     *     
     */
    public void setPartIdNum(PartIdNumType value) {
        this.partIdNum = value;
    }

    /**
     * Gets the value of the locAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link LOCAcctIdType }
     *     
     */
    public LOCAcctIdType getLOCAcctId() {
        return locAcctId;
    }

    /**
     * Sets the value of the locAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCAcctIdType }
     *     
     */
    public void setLOCAcctId(LOCAcctIdType value) {
        this.locAcctId = value;
    }

    /**
     * Gets the value of the locExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCExpDtType }
     *     
     */
    public LOCExpDtType getLOCExpDt() {
        return locExpDt;
    }

    /**
     * Sets the value of the locExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCExpDtType }
     *     
     */
    public void setLOCExpDt(LOCExpDtType value) {
        this.locExpDt = value;
    }

    /**
     * Gets the value of the locAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LOCAmtType }
     *     
     */
    public LOCAmtType getLOCAmt() {
        return locAmt;
    }

    /**
     * Sets the value of the locAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCAmtType }
     *     
     */
    public void setLOCAmt(LOCAmtType value) {
        this.locAmt = value;
    }

    /**
     * Gets the value of the locAvlBal property.
     * 
     * @return
     *     possible object is
     *     {@link LOCAvlBalType }
     *     
     */
    public LOCAvlBalType getLOCAvlBal() {
        return locAvlBal;
    }

    /**
     * Sets the value of the locAvlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCAvlBalType }
     *     
     */
    public void setLOCAvlBal(LOCAvlBalType value) {
        this.locAvlBal = value;
    }

    /**
     * Gets the value of the locCurBal property.
     * 
     * @return
     *     possible object is
     *     {@link LOCCurBalType }
     *     
     */
    public LOCCurBalType getLOCCurBal() {
        return locCurBal;
    }

    /**
     * Sets the value of the locCurBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCCurBalType }
     *     
     */
    public void setLOCCurBal(LOCCurBalType value) {
        this.locCurBal = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustom(CustomCType value) {
        this.custom = value;
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
