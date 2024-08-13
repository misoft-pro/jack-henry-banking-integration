
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CrCardAutoPayInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardAutoPayInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrCardAutoPayType" type="{http://jackhenry.com/jxchange/TPG/2008}CrCardAutoPayType_Type"/&gt;
 *         &lt;element name="InstRtId" type="{http://jackhenry.com/jxchange/TPG/2008}InstRtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AutoPayStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AutoPayEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AutoPayEnrollDt" type="{http://jackhenry.com/jxchange/TPG/2008}EnrollDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AutoPayStat" type="{http://jackhenry.com/jxchange/TPG/2008}AutoPayStat_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CrCardAutoPayInqRec_CType", propOrder = {
    "acctId",
    "acctType",
    "amt",
    "crCardAutoPayType",
    "instRtId",
    "autoPayStartDt",
    "autoPayEndDt",
    "autoPayEnrollDt",
    "autoPayStat",
    "ver1",
    "any"
})
public class CrCardAutoPayInqRecCType {

    @XmlElement(name = "AcctId")
    protected AcctIdType acctId;
    @XmlElement(name = "AcctType")
    protected AcctTypeType acctType;
    @XmlElement(name = "Amt")
    protected AmtType amt;
    @XmlElement(name = "CrCardAutoPayType", required = true)
    protected CrCardAutoPayTypeType crCardAutoPayType;
    @XmlElement(name = "InstRtId")
    protected InstRtIdType instRtId;
    @XmlElement(name = "AutoPayStartDt")
    protected StartDtType autoPayStartDt;
    @XmlElement(name = "AutoPayEndDt")
    protected EndDtType autoPayEndDt;
    @XmlElement(name = "AutoPayEnrollDt")
    protected EnrollDtType autoPayEnrollDt;
    @XmlElement(name = "AutoPayStat")
    protected AutoPayStatType autoPayStat;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setAmt(AmtType value) {
        this.amt = value;
    }

    /**
     * Gets the value of the crCardAutoPayType property.
     * 
     * @return
     *     possible object is
     *     {@link CrCardAutoPayTypeType }
     *     
     */
    public CrCardAutoPayTypeType getCrCardAutoPayType() {
        return crCardAutoPayType;
    }

    /**
     * Sets the value of the crCardAutoPayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrCardAutoPayTypeType }
     *     
     */
    public void setCrCardAutoPayType(CrCardAutoPayTypeType value) {
        this.crCardAutoPayType = value;
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
     * Gets the value of the autoPayStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartDtType }
     *     
     */
    public StartDtType getAutoPayStartDt() {
        return autoPayStartDt;
    }

    /**
     * Sets the value of the autoPayStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDtType }
     *     
     */
    public void setAutoPayStartDt(StartDtType value) {
        this.autoPayStartDt = value;
    }

    /**
     * Gets the value of the autoPayEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link EndDtType }
     *     
     */
    public EndDtType getAutoPayEndDt() {
        return autoPayEndDt;
    }

    /**
     * Sets the value of the autoPayEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDtType }
     *     
     */
    public void setAutoPayEndDt(EndDtType value) {
        this.autoPayEndDt = value;
    }

    /**
     * Gets the value of the autoPayEnrollDt property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollDtType }
     *     
     */
    public EnrollDtType getAutoPayEnrollDt() {
        return autoPayEnrollDt;
    }

    /**
     * Sets the value of the autoPayEnrollDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollDtType }
     *     
     */
    public void setAutoPayEnrollDt(EnrollDtType value) {
        this.autoPayEnrollDt = value;
    }

    /**
     * Gets the value of the autoPayStat property.
     * 
     * @return
     *     possible object is
     *     {@link AutoPayStatType }
     *     
     */
    public AutoPayStatType getAutoPayStat() {
        return autoPayStat;
    }

    /**
     * Sets the value of the autoPayStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoPayStatType }
     *     
     */
    public void setAutoPayStat(AutoPayStatType value) {
        this.autoPayStat = value;
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
