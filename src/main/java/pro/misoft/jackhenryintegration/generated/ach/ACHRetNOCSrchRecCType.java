
package pro.misoft.jackhenryintegration.generated.ach;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for ACHRetNOCSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACHRetNOCSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHRecId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHRecId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHCompName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHCompName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHRetRecvDt" type="{http://jackhenry.com/jxchange/TPG/2008}ACHRetRecvDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHEffDt" type="{http://jackhenry.com/jxchange/TPG/2008}EffDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHTrnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHTrnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHAmt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigACHTraceId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHTraceId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHRetRsnCode" type="{http://jackhenry.com/jxchange/TPG/2008}ACHRetRsnCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHRetRsnDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ACHRetRsnDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ACHRetNOCType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHRetNOCType_Type" minOccurs="0"/&gt;
 *           &lt;element name="ACHIndvId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHIndvId_Type" minOccurs="0"/&gt;
 *           &lt;element name="ACHIndvName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHIndvName_Type" minOccurs="0"/&gt;
 *           &lt;element name="ACHRtId" type="{http://jackhenry.com/jxchange/TPG/2008}InstRtId_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="InitialACHTraceId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHTraceId_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
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
@XmlType(name = "ACHRetNOCSrchRec_CType", propOrder = {
    "achRecId",
    "acctId",
    "acctType",
    "achCompId",
    "achCompName",
    "achRetRecvDt",
    "achEffDt",
    "achTrnCode",
    "achAmt",
    "origACHTraceId",
    "achRetRsnCode",
    "achRetRsnDesc",
    "custom",
    "ver1",
    "achRetNOCType",
    "achIndvId",
    "achIndvName",
    "achRtId",
    "ver2",
    "initialACHTraceId",
    "ver3",
    "any"
})
public class ACHRetNOCSrchRecCType {

    @XmlElement(name = "ACHRecId")
    protected ACHRecIdType achRecId;
    @XmlElement(name = "AcctId")
    protected AcctIdType acctId;
    @XmlElement(name = "AcctType")
    protected AcctTypeType acctType;
    @XmlElement(name = "ACHCompId")
    protected ACHCompIdType achCompId;
    @XmlElement(name = "ACHCompName")
    protected ACHCompNameType achCompName;
    @XmlElement(name = "ACHRetRecvDt")
    protected ACHRetRecvDtType achRetRecvDt;
    @XmlElement(name = "ACHEffDt")
    protected EffDtType achEffDt;
    @XmlElement(name = "ACHTrnCode")
    protected ACHTrnCodeType achTrnCode;
    @XmlElement(name = "ACHAmt")
    protected AmtType achAmt;
    @XmlElement(name = "OrigACHTraceId")
    protected ACHTraceIdType origACHTraceId;
    @XmlElement(name = "ACHRetRsnCode")
    protected ACHRetRsnCodeType achRetRsnCode;
    @XmlElement(name = "ACHRetRsnDesc")
    protected ACHRetRsnDescType achRetRsnDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ACHRetNOCType")
    protected ACHRetNOCTypeType achRetNOCType;
    @XmlElement(name = "ACHIndvId")
    protected ACHIndvIdType achIndvId;
    @XmlElement(name = "ACHIndvName")
    protected ACHIndvNameType achIndvName;
    @XmlElement(name = "ACHRtId")
    protected InstRtIdType achRtId;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "InitialACHTraceId")
    protected ACHTraceIdType initialACHTraceId;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the achRecId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHRecIdType }
     *     
     */
    public ACHRecIdType getACHRecId() {
        return achRecId;
    }

    /**
     * Sets the value of the achRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHRecIdType }
     *     
     */
    public void setACHRecId(ACHRecIdType value) {
        this.achRecId = value;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setAcctId(AcctIdType value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setAcctType(AcctTypeType value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the achCompId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCompIdType }
     *     
     */
    public ACHCompIdType getACHCompId() {
        return achCompId;
    }

    /**
     * Sets the value of the achCompId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCompIdType }
     *     
     */
    public void setACHCompId(ACHCompIdType value) {
        this.achCompId = value;
    }

    /**
     * Gets the value of the achCompName property.
     * 
     * @return
     *     possible object is
     *     {@link ACHCompNameType }
     *     
     */
    public ACHCompNameType getACHCompName() {
        return achCompName;
    }

    /**
     * Sets the value of the achCompName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHCompNameType }
     *     
     */
    public void setACHCompName(ACHCompNameType value) {
        this.achCompName = value;
    }

    /**
     * Gets the value of the achRetRecvDt property.
     * 
     * @return
     *     possible object is
     *     {@link ACHRetRecvDtType }
     *     
     */
    public ACHRetRecvDtType getACHRetRecvDt() {
        return achRetRecvDt;
    }

    /**
     * Sets the value of the achRetRecvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHRetRecvDtType }
     *     
     */
    public void setACHRetRecvDt(ACHRetRecvDtType value) {
        this.achRetRecvDt = value;
    }

    /**
     * Gets the value of the achEffDt property.
     * 
     * @return
     *     possible object is
     *     {@link EffDtType }
     *     
     */
    public EffDtType getACHEffDt() {
        return achEffDt;
    }

    /**
     * Sets the value of the achEffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffDtType }
     *     
     */
    public void setACHEffDt(EffDtType value) {
        this.achEffDt = value;
    }

    /**
     * Gets the value of the achTrnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ACHTrnCodeType }
     *     
     */
    public ACHTrnCodeType getACHTrnCode() {
        return achTrnCode;
    }

    /**
     * Sets the value of the achTrnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHTrnCodeType }
     *     
     */
    public void setACHTrnCode(ACHTrnCodeType value) {
        this.achTrnCode = value;
    }

    /**
     * Gets the value of the achAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getACHAmt() {
        return achAmt;
    }

    /**
     * Sets the value of the achAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setACHAmt(AmtType value) {
        this.achAmt = value;
    }

    /**
     * Gets the value of the origACHTraceId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHTraceIdType }
     *     
     */
    public ACHTraceIdType getOrigACHTraceId() {
        return origACHTraceId;
    }

    /**
     * Sets the value of the origACHTraceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHTraceIdType }
     *     
     */
    public void setOrigACHTraceId(ACHTraceIdType value) {
        this.origACHTraceId = value;
    }

    /**
     * Gets the value of the achRetRsnCode property.
     * 
     * @return
     *     possible object is
     *     {@link ACHRetRsnCodeType }
     *     
     */
    public ACHRetRsnCodeType getACHRetRsnCode() {
        return achRetRsnCode;
    }

    /**
     * Sets the value of the achRetRsnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHRetRsnCodeType }
     *     
     */
    public void setACHRetRsnCode(ACHRetRsnCodeType value) {
        this.achRetRsnCode = value;
    }

    /**
     * Gets the value of the achRetRsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ACHRetRsnDescType }
     *     
     */
    public ACHRetRsnDescType getACHRetRsnDesc() {
        return achRetRsnDesc;
    }

    /**
     * Sets the value of the achRetRsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHRetRsnDescType }
     *     
     */
    public void setACHRetRsnDesc(ACHRetRsnDescType value) {
        this.achRetRsnDesc = value;
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
     * Gets the value of the achRetNOCType property.
     * 
     * @return
     *     possible object is
     *     {@link ACHRetNOCTypeType }
     *     
     */
    public ACHRetNOCTypeType getACHRetNOCType() {
        return achRetNOCType;
    }

    /**
     * Sets the value of the achRetNOCType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHRetNOCTypeType }
     *     
     */
    public void setACHRetNOCType(ACHRetNOCTypeType value) {
        this.achRetNOCType = value;
    }

    /**
     * Gets the value of the achIndvId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHIndvIdType }
     *     
     */
    public ACHIndvIdType getACHIndvId() {
        return achIndvId;
    }

    /**
     * Sets the value of the achIndvId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHIndvIdType }
     *     
     */
    public void setACHIndvId(ACHIndvIdType value) {
        this.achIndvId = value;
    }

    /**
     * Gets the value of the achIndvName property.
     * 
     * @return
     *     possible object is
     *     {@link ACHIndvNameType }
     *     
     */
    public ACHIndvNameType getACHIndvName() {
        return achIndvName;
    }

    /**
     * Sets the value of the achIndvName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHIndvNameType }
     *     
     */
    public void setACHIndvName(ACHIndvNameType value) {
        this.achIndvName = value;
    }

    /**
     * Gets the value of the achRtId property.
     * 
     * @return
     *     possible object is
     *     {@link InstRtIdType }
     *     
     */
    public InstRtIdType getACHRtId() {
        return achRtId;
    }

    /**
     * Sets the value of the achRtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstRtIdType }
     *     
     */
    public void setACHRtId(InstRtIdType value) {
        this.achRtId = value;
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
     * Gets the value of the initialACHTraceId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHTraceIdType }
     *     
     */
    public ACHTraceIdType getInitialACHTraceId() {
        return initialACHTraceId;
    }

    /**
     * Sets the value of the initialACHTraceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHTraceIdType }
     *     
     */
    public void setInitialACHTraceId(ACHTraceIdType value) {
        this.initialACHTraceId = value;
    }

    /**
     * Gets the value of the ver3 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver3CType }
     *     
     */
    public Ver3CType getVer3() {
        return ver3;
    }

    /**
     * Sets the value of the ver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver3CType }
     *     
     */
    public void setVer3(Ver3CType value) {
        this.ver3 = value;
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
