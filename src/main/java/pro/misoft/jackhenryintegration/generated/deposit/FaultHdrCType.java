
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Jxchange header for soap envelop
 * 
 * <p>Java class for FaultHdr_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultHdr_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JxVer" type="{http://jackhenry.com/jxchange/TPG/2008}FaultJxVer_Type" minOccurs="0"/&gt;
 *         &lt;element name="AuditUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}FaultAuditUsrId_Type"/&gt;
 *         &lt;element name="AuditWsId" type="{http://jackhenry.com/jxchange/TPG/2008}FaultAuditWsId_Type"/&gt;
 *         &lt;element name="AuthenUsrId" type="{http://jackhenry.com/jxchange/TPG/2008}FaultAuthenUsrId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerName" type="{http://jackhenry.com/jxchange/TPG/2008}FaultConsumerName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConsumerProd" type="{http://jackhenry.com/jxchange/TPG/2008}FaultConsumerProd_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}FaultVer_1_CType"/&gt;
 *           &lt;element name="jXLogTrackingId" type="{http://jackhenry.com/jxchange/TPG/2008}FaultjXLogTrackingId_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}FaultVer_2_CType"/&gt;
 *             &lt;element name="InstRtId" type="{http://jackhenry.com/jxchange/TPG/2008}InstRtId_Type" minOccurs="0"/&gt;
 *             &lt;element name="InstEnv" type="{http://jackhenry.com/jxchange/TPG/2008}InstEnv_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}FaultVer_3_CType"/&gt;
 *               &lt;element name="BusCorrelId" type="{http://jackhenry.com/jxchange/TPG/2008}BusCorrelId_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}FaultVer_4_CType"/&gt;
 *                 &lt;element name="WorkflowCorrelId" type="{http://jackhenry.com/jxchange/TPG/2008}WorkflowCorrelId_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}FaultVer_5_CType"/&gt;
 *                   &lt;element name="ValidConsmName" type="{http://jackhenry.com/jxchange/TPG/2008}ValidConsmName_Type" minOccurs="0"/&gt;
 *                   &lt;element name="ValidConsmProd" type="{http://jackhenry.com/jxchange/TPG/2008}ValidConsmProd_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}FaultVer_6_CType"/&gt;
 *                     &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/sequence&gt;
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
@XmlType(name = "FaultHdr_CType", propOrder = {
    "jxVer",
    "auditUsrId",
    "auditWsId",
    "authenUsrId",
    "consumerName",
    "consumerProd",
    "ver1",
    "jxLogTrackingId",
    "ver2",
    "instRtId",
    "instEnv",
    "ver3",
    "busCorrelId",
    "ver4",
    "workflowCorrelId",
    "ver5",
    "validConsmName",
    "validConsmProd",
    "ver6",
    "any"
})
public class FaultHdrCType {

    @XmlElement(name = "JxVer")
    protected FaultJxVerType jxVer;
    @XmlElement(name = "AuditUsrId", required = true)
    protected FaultAuditUsrIdType auditUsrId;
    @XmlElement(name = "AuditWsId", required = true)
    protected FaultAuditWsIdType auditWsId;
    @XmlElement(name = "AuthenUsrId")
    protected FaultAuthenUsrIdType authenUsrId;
    @XmlElement(name = "ConsumerName")
    protected FaultConsumerNameType consumerName;
    @XmlElement(name = "ConsumerProd")
    protected FaultConsumerProdType consumerProd;
    @XmlElement(name = "Ver_1")
    protected FaultVer1CType ver1;
    @XmlElement(name = "jXLogTrackingId")
    protected FaultjXLogTrackingIdType jxLogTrackingId;
    @XmlElement(name = "Ver_2")
    protected FaultVer2CType ver2;
    @XmlElement(name = "InstRtId")
    protected InstRtIdType instRtId;
    @XmlElement(name = "InstEnv")
    protected InstEnvType instEnv;
    @XmlElement(name = "Ver_3")
    protected FaultVer3CType ver3;
    @XmlElement(name = "BusCorrelId")
    protected BusCorrelIdType busCorrelId;
    @XmlElement(name = "Ver_4")
    protected FaultVer4CType ver4;
    @XmlElement(name = "WorkflowCorrelId")
    protected WorkflowCorrelIdType workflowCorrelId;
    @XmlElement(name = "Ver_5")
    protected FaultVer5CType ver5;
    @XmlElement(name = "ValidConsmName")
    protected ValidConsmNameType validConsmName;
    @XmlElement(name = "ValidConsmProd")
    protected ValidConsmProdType validConsmProd;
    @XmlElement(name = "Ver_6")
    protected FaultVer6CType ver6;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the jxVer property.
     * 
     * @return
     *     possible object is
     *     {@link FaultJxVerType }
     *     
     */
    public FaultJxVerType getJxVer() {
        return jxVer;
    }

    /**
     * Sets the value of the jxVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultJxVerType }
     *     
     */
    public void setJxVer(FaultJxVerType value) {
        this.jxVer = value;
    }

    /**
     * Gets the value of the auditUsrId property.
     * 
     * @return
     *     possible object is
     *     {@link FaultAuditUsrIdType }
     *     
     */
    public FaultAuditUsrIdType getAuditUsrId() {
        return auditUsrId;
    }

    /**
     * Sets the value of the auditUsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultAuditUsrIdType }
     *     
     */
    public void setAuditUsrId(FaultAuditUsrIdType value) {
        this.auditUsrId = value;
    }

    /**
     * Gets the value of the auditWsId property.
     * 
     * @return
     *     possible object is
     *     {@link FaultAuditWsIdType }
     *     
     */
    public FaultAuditWsIdType getAuditWsId() {
        return auditWsId;
    }

    /**
     * Sets the value of the auditWsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultAuditWsIdType }
     *     
     */
    public void setAuditWsId(FaultAuditWsIdType value) {
        this.auditWsId = value;
    }

    /**
     * Gets the value of the authenUsrId property.
     * 
     * @return
     *     possible object is
     *     {@link FaultAuthenUsrIdType }
     *     
     */
    public FaultAuthenUsrIdType getAuthenUsrId() {
        return authenUsrId;
    }

    /**
     * Sets the value of the authenUsrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultAuthenUsrIdType }
     *     
     */
    public void setAuthenUsrId(FaultAuthenUsrIdType value) {
        this.authenUsrId = value;
    }

    /**
     * Gets the value of the consumerName property.
     * 
     * @return
     *     possible object is
     *     {@link FaultConsumerNameType }
     *     
     */
    public FaultConsumerNameType getConsumerName() {
        return consumerName;
    }

    /**
     * Sets the value of the consumerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultConsumerNameType }
     *     
     */
    public void setConsumerName(FaultConsumerNameType value) {
        this.consumerName = value;
    }

    /**
     * Gets the value of the consumerProd property.
     * 
     * @return
     *     possible object is
     *     {@link FaultConsumerProdType }
     *     
     */
    public FaultConsumerProdType getConsumerProd() {
        return consumerProd;
    }

    /**
     * Sets the value of the consumerProd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultConsumerProdType }
     *     
     */
    public void setConsumerProd(FaultConsumerProdType value) {
        this.consumerProd = value;
    }

    /**
     * Gets the value of the ver1 property.
     * 
     * @return
     *     possible object is
     *     {@link FaultVer1CType }
     *     
     */
    public FaultVer1CType getVer1() {
        return ver1;
    }

    /**
     * Sets the value of the ver1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultVer1CType }
     *     
     */
    public void setVer1(FaultVer1CType value) {
        this.ver1 = value;
    }

    /**
     * Gets the value of the jxLogTrackingId property.
     * 
     * @return
     *     possible object is
     *     {@link FaultjXLogTrackingIdType }
     *     
     */
    public FaultjXLogTrackingIdType getJXLogTrackingId() {
        return jxLogTrackingId;
    }

    /**
     * Sets the value of the jxLogTrackingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultjXLogTrackingIdType }
     *     
     */
    public void setJXLogTrackingId(FaultjXLogTrackingIdType value) {
        this.jxLogTrackingId = value;
    }

    /**
     * Gets the value of the ver2 property.
     * 
     * @return
     *     possible object is
     *     {@link FaultVer2CType }
     *     
     */
    public FaultVer2CType getVer2() {
        return ver2;
    }

    /**
     * Sets the value of the ver2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultVer2CType }
     *     
     */
    public void setVer2(FaultVer2CType value) {
        this.ver2 = value;
    }

    /**
     * Gets the value of the instRtId property.
     * 
     * @return
     *     possible object is
     *     {@link InstRtIdType }
     *     
     */
    public InstRtIdType getInstRtId() {
        return instRtId;
    }

    /**
     * Sets the value of the instRtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstRtIdType }
     *     
     */
    public void setInstRtId(InstRtIdType value) {
        this.instRtId = value;
    }

    /**
     * Gets the value of the instEnv property.
     * 
     * @return
     *     possible object is
     *     {@link InstEnvType }
     *     
     */
    public InstEnvType getInstEnv() {
        return instEnv;
    }

    /**
     * Sets the value of the instEnv property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstEnvType }
     *     
     */
    public void setInstEnv(InstEnvType value) {
        this.instEnv = value;
    }

    /**
     * Gets the value of the ver3 property.
     * 
     * @return
     *     possible object is
     *     {@link FaultVer3CType }
     *     
     */
    public FaultVer3CType getVer3() {
        return ver3;
    }

    /**
     * Sets the value of the ver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultVer3CType }
     *     
     */
    public void setVer3(FaultVer3CType value) {
        this.ver3 = value;
    }

    /**
     * Gets the value of the busCorrelId property.
     * 
     * @return
     *     possible object is
     *     {@link BusCorrelIdType }
     *     
     */
    public BusCorrelIdType getBusCorrelId() {
        return busCorrelId;
    }

    /**
     * Sets the value of the busCorrelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusCorrelIdType }
     *     
     */
    public void setBusCorrelId(BusCorrelIdType value) {
        this.busCorrelId = value;
    }

    /**
     * Gets the value of the ver4 property.
     * 
     * @return
     *     possible object is
     *     {@link FaultVer4CType }
     *     
     */
    public FaultVer4CType getVer4() {
        return ver4;
    }

    /**
     * Sets the value of the ver4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultVer4CType }
     *     
     */
    public void setVer4(FaultVer4CType value) {
        this.ver4 = value;
    }

    /**
     * Gets the value of the workflowCorrelId property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowCorrelIdType }
     *     
     */
    public WorkflowCorrelIdType getWorkflowCorrelId() {
        return workflowCorrelId;
    }

    /**
     * Sets the value of the workflowCorrelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowCorrelIdType }
     *     
     */
    public void setWorkflowCorrelId(WorkflowCorrelIdType value) {
        this.workflowCorrelId = value;
    }

    /**
     * Gets the value of the ver5 property.
     * 
     * @return
     *     possible object is
     *     {@link FaultVer5CType }
     *     
     */
    public FaultVer5CType getVer5() {
        return ver5;
    }

    /**
     * Sets the value of the ver5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultVer5CType }
     *     
     */
    public void setVer5(FaultVer5CType value) {
        this.ver5 = value;
    }

    /**
     * Gets the value of the validConsmName property.
     * 
     * @return
     *     possible object is
     *     {@link ValidConsmNameType }
     *     
     */
    public ValidConsmNameType getValidConsmName() {
        return validConsmName;
    }

    /**
     * Sets the value of the validConsmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidConsmNameType }
     *     
     */
    public void setValidConsmName(ValidConsmNameType value) {
        this.validConsmName = value;
    }

    /**
     * Gets the value of the validConsmProd property.
     * 
     * @return
     *     possible object is
     *     {@link ValidConsmProdType }
     *     
     */
    public ValidConsmProdType getValidConsmProd() {
        return validConsmProd;
    }

    /**
     * Sets the value of the validConsmProd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidConsmProdType }
     *     
     */
    public void setValidConsmProd(ValidConsmProdType value) {
        this.validConsmProd = value;
    }

    /**
     * Gets the value of the ver6 property.
     * 
     * @return
     *     possible object is
     *     {@link FaultVer6CType }
     *     
     */
    public FaultVer6CType getVer6() {
        return ver6;
    }

    /**
     * Sets the value of the ver6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultVer6CType }
     *     
     */
    public void setVer6(FaultVer6CType value) {
        this.ver6 = value;
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
