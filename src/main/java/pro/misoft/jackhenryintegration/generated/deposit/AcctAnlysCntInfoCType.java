
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
 * <p>Java class for AcctAnlysCntInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctAnlysCntInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvgColBal" type="{http://jackhenry.com/jxchange/TPG/2008}AvgColBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvgPosColBal" type="{http://jackhenry.com/jxchange/TPG/2008}AvgPosColBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvgNegColBal" type="{http://jackhenry.com/jxchange/TPG/2008}AvgNegColBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="SerChgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SerChgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AmtLastIntPd" type="{http://jackhenry.com/jxchange/TPG/2008}AmtLastIntPd_Type" minOccurs="0"/&gt;
 *         &lt;element name="NSFChgWavAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NSFChgWavAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODIntCycle" type="{http://jackhenry.com/jxchange/TPG/2008}ODIntCycle_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctAnlysCntArray" type="{http://jackhenry.com/jxchange/TPG/2008}AcctAnlysCntArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "AcctAnlysCntInfo_CType", propOrder = {
    "avgColBal",
    "avgPosColBal",
    "avgNegColBal",
    "serChgAmt",
    "amtLastIntPd",
    "nsfChgWavAmt",
    "odIntCycle",
    "acctAnlysCntArray",
    "ver1",
    "any"
})
public class AcctAnlysCntInfoCType {

    @XmlElement(name = "AvgColBal")
    protected AvgColBalType avgColBal;
    @XmlElement(name = "AvgPosColBal")
    protected AvgPosColBalType avgPosColBal;
    @XmlElement(name = "AvgNegColBal")
    protected AvgNegColBalType avgNegColBal;
    @XmlElement(name = "SerChgAmt")
    protected SerChgAmtType serChgAmt;
    @XmlElement(name = "AmtLastIntPd")
    protected AmtLastIntPdType amtLastIntPd;
    @XmlElement(name = "NSFChgWavAmt")
    protected NSFChgWavAmtType nsfChgWavAmt;
    @XmlElement(name = "ODIntCycle")
    protected ODIntCycleType odIntCycle;
    @XmlElement(name = "AcctAnlysCntArray")
    protected AcctAnlysCntArrayAType acctAnlysCntArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the avgColBal property.
     * 
     * @return
     *     possible object is
     *     {@link AvgColBalType }
     *     
     */
    public AvgColBalType getAvgColBal() {
        return avgColBal;
    }

    /**
     * Sets the value of the avgColBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvgColBalType }
     *     
     */
    public void setAvgColBal(AvgColBalType value) {
        this.avgColBal = value;
    }

    /**
     * Gets the value of the avgPosColBal property.
     * 
     * @return
     *     possible object is
     *     {@link AvgPosColBalType }
     *     
     */
    public AvgPosColBalType getAvgPosColBal() {
        return avgPosColBal;
    }

    /**
     * Sets the value of the avgPosColBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvgPosColBalType }
     *     
     */
    public void setAvgPosColBal(AvgPosColBalType value) {
        this.avgPosColBal = value;
    }

    /**
     * Gets the value of the avgNegColBal property.
     * 
     * @return
     *     possible object is
     *     {@link AvgNegColBalType }
     *     
     */
    public AvgNegColBalType getAvgNegColBal() {
        return avgNegColBal;
    }

    /**
     * Sets the value of the avgNegColBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvgNegColBalType }
     *     
     */
    public void setAvgNegColBal(AvgNegColBalType value) {
        this.avgNegColBal = value;
    }

    /**
     * Gets the value of the serChgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SerChgAmtType }
     *     
     */
    public SerChgAmtType getSerChgAmt() {
        return serChgAmt;
    }

    /**
     * Sets the value of the serChgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerChgAmtType }
     *     
     */
    public void setSerChgAmt(SerChgAmtType value) {
        this.serChgAmt = value;
    }

    /**
     * Gets the value of the amtLastIntPd property.
     * 
     * @return
     *     possible object is
     *     {@link AmtLastIntPdType }
     *     
     */
    public AmtLastIntPdType getAmtLastIntPd() {
        return amtLastIntPd;
    }

    /**
     * Sets the value of the amtLastIntPd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtLastIntPdType }
     *     
     */
    public void setAmtLastIntPd(AmtLastIntPdType value) {
        this.amtLastIntPd = value;
    }

    /**
     * Gets the value of the nsfChgWavAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NSFChgWavAmtType }
     *     
     */
    public NSFChgWavAmtType getNSFChgWavAmt() {
        return nsfChgWavAmt;
    }

    /**
     * Sets the value of the nsfChgWavAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NSFChgWavAmtType }
     *     
     */
    public void setNSFChgWavAmt(NSFChgWavAmtType value) {
        this.nsfChgWavAmt = value;
    }

    /**
     * Gets the value of the odIntCycle property.
     * 
     * @return
     *     possible object is
     *     {@link ODIntCycleType }
     *     
     */
    public ODIntCycleType getODIntCycle() {
        return odIntCycle;
    }

    /**
     * Sets the value of the odIntCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODIntCycleType }
     *     
     */
    public void setODIntCycle(ODIntCycleType value) {
        this.odIntCycle = value;
    }

    /**
     * Gets the value of the acctAnlysCntArray property.
     * 
     * @return
     *     possible object is
     *     {@link AcctAnlysCntArrayAType }
     *     
     */
    public AcctAnlysCntArrayAType getAcctAnlysCntArray() {
        return acctAnlysCntArray;
    }

    /**
     * Sets the value of the acctAnlysCntArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctAnlysCntArrayAType }
     *     
     */
    public void setAcctAnlysCntArray(AcctAnlysCntArrayAType value) {
        this.acctAnlysCntArray = value;
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
