
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
 * <p>Java class for AcctAnlysHistInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctAnlysHistInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctAnlysDt" type="{http://jackhenry.com/jxchange/TPG/2008}AcctAnlysDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvgLdgrBal" type="{http://jackhenry.com/jxchange/TPG/2008}AvgLdgrBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="AvgColBal" type="{http://jackhenry.com/jxchange/TPG/2008}AvgColBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="BalResrvAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BalResrvAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnlysCostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}AnlysCostAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EarnBal" type="{http://jackhenry.com/jxchange/TPG/2008}EarnBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="NetProfAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NetProfAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReqBal" type="{http://jackhenry.com/jxchange/TPG/2008}ReqBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnlysTotChg" type="{http://jackhenry.com/jxchange/TPG/2008}AnlysTotChg_Type" minOccurs="0"/&gt;
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
@XmlType(name = "AcctAnlysHistInfo_CType", propOrder = {
    "acctAnlysDt",
    "avgLdgrBal",
    "avgColBal",
    "balResrvAmt",
    "anlysCostAmt",
    "earnBal",
    "netProfAmt",
    "reqBal",
    "anlysTotChg",
    "ver1",
    "any"
})
public class AcctAnlysHistInfoCType {

    @XmlElement(name = "AcctAnlysDt")
    protected AcctAnlysDtType acctAnlysDt;
    @XmlElement(name = "AvgLdgrBal")
    protected AvgLdgrBalType avgLdgrBal;
    @XmlElement(name = "AvgColBal")
    protected AvgColBalType avgColBal;
    @XmlElement(name = "BalResrvAmt")
    protected BalResrvAmtType balResrvAmt;
    @XmlElement(name = "AnlysCostAmt")
    protected AnlysCostAmtType anlysCostAmt;
    @XmlElement(name = "EarnBal")
    protected EarnBalType earnBal;
    @XmlElement(name = "NetProfAmt")
    protected NetProfAmtType netProfAmt;
    @XmlElement(name = "ReqBal")
    protected ReqBalType reqBal;
    @XmlElement(name = "AnlysTotChg")
    protected AnlysTotChgType anlysTotChg;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the acctAnlysDt property.
     * 
     * @return
     *     possible object is
     *     {@link AcctAnlysDtType }
     *     
     */
    public AcctAnlysDtType getAcctAnlysDt() {
        return acctAnlysDt;
    }

    /**
     * Sets the value of the acctAnlysDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctAnlysDtType }
     *     
     */
    public void setAcctAnlysDt(AcctAnlysDtType value) {
        this.acctAnlysDt = value;
    }

    /**
     * Gets the value of the avgLdgrBal property.
     * 
     * @return
     *     possible object is
     *     {@link AvgLdgrBalType }
     *     
     */
    public AvgLdgrBalType getAvgLdgrBal() {
        return avgLdgrBal;
    }

    /**
     * Sets the value of the avgLdgrBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvgLdgrBalType }
     *     
     */
    public void setAvgLdgrBal(AvgLdgrBalType value) {
        this.avgLdgrBal = value;
    }

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
     * Gets the value of the balResrvAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BalResrvAmtType }
     *     
     */
    public BalResrvAmtType getBalResrvAmt() {
        return balResrvAmt;
    }

    /**
     * Sets the value of the balResrvAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalResrvAmtType }
     *     
     */
    public void setBalResrvAmt(BalResrvAmtType value) {
        this.balResrvAmt = value;
    }

    /**
     * Gets the value of the anlysCostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AnlysCostAmtType }
     *     
     */
    public AnlysCostAmtType getAnlysCostAmt() {
        return anlysCostAmt;
    }

    /**
     * Sets the value of the anlysCostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlysCostAmtType }
     *     
     */
    public void setAnlysCostAmt(AnlysCostAmtType value) {
        this.anlysCostAmt = value;
    }

    /**
     * Gets the value of the earnBal property.
     * 
     * @return
     *     possible object is
     *     {@link EarnBalType }
     *     
     */
    public EarnBalType getEarnBal() {
        return earnBal;
    }

    /**
     * Sets the value of the earnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EarnBalType }
     *     
     */
    public void setEarnBal(EarnBalType value) {
        this.earnBal = value;
    }

    /**
     * Gets the value of the netProfAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NetProfAmtType }
     *     
     */
    public NetProfAmtType getNetProfAmt() {
        return netProfAmt;
    }

    /**
     * Sets the value of the netProfAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetProfAmtType }
     *     
     */
    public void setNetProfAmt(NetProfAmtType value) {
        this.netProfAmt = value;
    }

    /**
     * Gets the value of the reqBal property.
     * 
     * @return
     *     possible object is
     *     {@link ReqBalType }
     *     
     */
    public ReqBalType getReqBal() {
        return reqBal;
    }

    /**
     * Sets the value of the reqBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqBalType }
     *     
     */
    public void setReqBal(ReqBalType value) {
        this.reqBal = value;
    }

    /**
     * Gets the value of the anlysTotChg property.
     * 
     * @return
     *     possible object is
     *     {@link AnlysTotChgType }
     *     
     */
    public AnlysTotChgType getAnlysTotChg() {
        return anlysTotChg;
    }

    /**
     * Sets the value of the anlysTotChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlysTotChgType }
     *     
     */
    public void setAnlysTotChg(AnlysTotChgType value) {
        this.anlysTotChg = value;
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
