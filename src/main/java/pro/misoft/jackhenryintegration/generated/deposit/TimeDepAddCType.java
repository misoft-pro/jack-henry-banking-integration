
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
 * <p>Java class for TimeDepAdd_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeDepAdd_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeDepInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepInfoRec_CType"/&gt;
 *         &lt;element name="TimeDepAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="TimeDepBalDtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepBalDtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="TimeDepRenInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepRenInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="TimeDepRateIntInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepRateIntInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="TimeDepRegRptInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepRegRptInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="TimeDepStmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepStmtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="TimeDepTaxInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TimeDepTaxInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="ACHPmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}ACHPmtInfo_CType" minOccurs="0"/&gt;
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
@XmlType(name = "TimeDepAdd_CType", propOrder = {
    "timeDepInfoRec",
    "timeDepAcctInfo",
    "timeDepBalDtInfo",
    "timeDepRenInfo",
    "timeDepRateIntInfo",
    "timeDepRegRptInfo",
    "timeDepStmtInfo",
    "timeDepTaxInfo",
    "achPmtInfo",
    "ver1",
    "any"
})
public class TimeDepAddCType {

    @XmlElement(name = "TimeDepInfoRec", required = true)
    protected TimeDepInfoRecCType timeDepInfoRec;
    @XmlElement(name = "TimeDepAcctInfo")
    protected TimeDepAcctInfoCType timeDepAcctInfo;
    @XmlElement(name = "TimeDepBalDtInfo")
    protected TimeDepBalDtInfoCType timeDepBalDtInfo;
    @XmlElement(name = "TimeDepRenInfo")
    protected TimeDepRenInfoCType timeDepRenInfo;
    @XmlElement(name = "TimeDepRateIntInfo")
    protected TimeDepRateIntInfoCType timeDepRateIntInfo;
    @XmlElement(name = "TimeDepRegRptInfo")
    protected TimeDepRegRptInfoCType timeDepRegRptInfo;
    @XmlElement(name = "TimeDepStmtInfo")
    protected TimeDepStmtInfoCType timeDepStmtInfo;
    @XmlElement(name = "TimeDepTaxInfo")
    protected TimeDepTaxInfoCType timeDepTaxInfo;
    @XmlElement(name = "ACHPmtInfo")
    protected ACHPmtInfoCType achPmtInfo;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the timeDepInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDepInfoRecCType }
     *     
     */
    public TimeDepInfoRecCType getTimeDepInfoRec() {
        return timeDepInfoRec;
    }

    /**
     * Sets the value of the timeDepInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDepInfoRecCType }
     *     
     */
    public void setTimeDepInfoRec(TimeDepInfoRecCType value) {
        this.timeDepInfoRec = value;
    }

    /**
     * Gets the value of the timeDepAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDepAcctInfoCType }
     *     
     */
    public TimeDepAcctInfoCType getTimeDepAcctInfo() {
        return timeDepAcctInfo;
    }

    /**
     * Sets the value of the timeDepAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDepAcctInfoCType }
     *     
     */
    public void setTimeDepAcctInfo(TimeDepAcctInfoCType value) {
        this.timeDepAcctInfo = value;
    }

    /**
     * Gets the value of the timeDepBalDtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDepBalDtInfoCType }
     *     
     */
    public TimeDepBalDtInfoCType getTimeDepBalDtInfo() {
        return timeDepBalDtInfo;
    }

    /**
     * Sets the value of the timeDepBalDtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDepBalDtInfoCType }
     *     
     */
    public void setTimeDepBalDtInfo(TimeDepBalDtInfoCType value) {
        this.timeDepBalDtInfo = value;
    }

    /**
     * Gets the value of the timeDepRenInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDepRenInfoCType }
     *     
     */
    public TimeDepRenInfoCType getTimeDepRenInfo() {
        return timeDepRenInfo;
    }

    /**
     * Sets the value of the timeDepRenInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDepRenInfoCType }
     *     
     */
    public void setTimeDepRenInfo(TimeDepRenInfoCType value) {
        this.timeDepRenInfo = value;
    }

    /**
     * Gets the value of the timeDepRateIntInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDepRateIntInfoCType }
     *     
     */
    public TimeDepRateIntInfoCType getTimeDepRateIntInfo() {
        return timeDepRateIntInfo;
    }

    /**
     * Sets the value of the timeDepRateIntInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDepRateIntInfoCType }
     *     
     */
    public void setTimeDepRateIntInfo(TimeDepRateIntInfoCType value) {
        this.timeDepRateIntInfo = value;
    }

    /**
     * Gets the value of the timeDepRegRptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDepRegRptInfoCType }
     *     
     */
    public TimeDepRegRptInfoCType getTimeDepRegRptInfo() {
        return timeDepRegRptInfo;
    }

    /**
     * Sets the value of the timeDepRegRptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDepRegRptInfoCType }
     *     
     */
    public void setTimeDepRegRptInfo(TimeDepRegRptInfoCType value) {
        this.timeDepRegRptInfo = value;
    }

    /**
     * Gets the value of the timeDepStmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDepStmtInfoCType }
     *     
     */
    public TimeDepStmtInfoCType getTimeDepStmtInfo() {
        return timeDepStmtInfo;
    }

    /**
     * Sets the value of the timeDepStmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDepStmtInfoCType }
     *     
     */
    public void setTimeDepStmtInfo(TimeDepStmtInfoCType value) {
        this.timeDepStmtInfo = value;
    }

    /**
     * Gets the value of the timeDepTaxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDepTaxInfoCType }
     *     
     */
    public TimeDepTaxInfoCType getTimeDepTaxInfo() {
        return timeDepTaxInfo;
    }

    /**
     * Sets the value of the timeDepTaxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDepTaxInfoCType }
     *     
     */
    public void setTimeDepTaxInfo(TimeDepTaxInfoCType value) {
        this.timeDepTaxInfo = value;
    }

    /**
     * Gets the value of the achPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ACHPmtInfoCType }
     *     
     */
    public ACHPmtInfoCType getACHPmtInfo() {
        return achPmtInfo;
    }

    /**
     * Sets the value of the achPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHPmtInfoCType }
     *     
     */
    public void setACHPmtInfo(ACHPmtInfoCType value) {
        this.achPmtInfo = value;
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
