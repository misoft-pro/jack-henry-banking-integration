
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * A package of data related to a electronic bill
 *     payment
 * 
 * <p>Java class for x_ElecBilPmtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_ElecBilPmtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}StmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtDueDt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtDueDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtBal" type="{http://jackhenry.com/jxchange/TPG/2008}StmtBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtAmtDue" type="{http://jackhenry.com/jxchange/TPG/2008}PmtAmtDue_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MinPmtAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ElecBilPmtAuto" type="{http://jackhenry.com/jxchange/TPG/2008}ElecBilPmtAuto_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_ElecBilPmtInfo_CType", propOrder = {
    "stmtDt",
    "pmtDueDt",
    "stmtBal",
    "curBal",
    "pmtAmtDue",
    "minPmtAmt",
    "elecBilPmtAuto",
    "custom",
    "ver1",
    "any"
})
public class XElecBilPmtInfoCType {

    @XmlElement(name = "StmtDt")
    protected StmtDtType stmtDt;
    @XmlElement(name = "PmtDueDt")
    protected PmtDueDtType pmtDueDt;
    @XmlElement(name = "StmtBal")
    protected StmtBalType stmtBal;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "PmtAmtDue")
    protected PmtAmtDueType pmtAmtDue;
    @XmlElement(name = "MinPmtAmt")
    protected MinPmtAmtType minPmtAmt;
    @XmlElement(name = "ElecBilPmtAuto")
    protected ElecBilPmtAutoType elecBilPmtAuto;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the stmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link StmtDtType }
     *     
     */
    public StmtDtType getStmtDt() {
        return stmtDt;
    }

    /**
     * Sets the value of the stmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtDtType }
     *     
     */
    public void setStmtDt(StmtDtType value) {
        this.stmtDt = value;
    }

    /**
     * Gets the value of the pmtDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtDueDtType }
     *     
     */
    public PmtDueDtType getPmtDueDt() {
        return pmtDueDt;
    }

    /**
     * Sets the value of the pmtDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtDueDtType }
     *     
     */
    public void setPmtDueDt(PmtDueDtType value) {
        this.pmtDueDt = value;
    }

    /**
     * Gets the value of the stmtBal property.
     * 
     * @return
     *     possible object is
     *     {@link StmtBalType }
     *     
     */
    public StmtBalType getStmtBal() {
        return stmtBal;
    }

    /**
     * Sets the value of the stmtBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtBalType }
     *     
     */
    public void setStmtBal(StmtBalType value) {
        this.stmtBal = value;
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
     * Gets the value of the pmtAmtDue property.
     * 
     * @return
     *     possible object is
     *     {@link PmtAmtDueType }
     *     
     */
    public PmtAmtDueType getPmtAmtDue() {
        return pmtAmtDue;
    }

    /**
     * Sets the value of the pmtAmtDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtAmtDueType }
     *     
     */
    public void setPmtAmtDue(PmtAmtDueType value) {
        this.pmtAmtDue = value;
    }

    /**
     * Gets the value of the minPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MinPmtAmtType }
     *     
     */
    public MinPmtAmtType getMinPmtAmt() {
        return minPmtAmt;
    }

    /**
     * Sets the value of the minPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinPmtAmtType }
     *     
     */
    public void setMinPmtAmt(MinPmtAmtType value) {
        this.minPmtAmt = value;
    }

    /**
     * Gets the value of the elecBilPmtAuto property.
     * 
     * @return
     *     possible object is
     *     {@link ElecBilPmtAutoType }
     *     
     */
    public ElecBilPmtAutoType getElecBilPmtAuto() {
        return elecBilPmtAuto;
    }

    /**
     * Sets the value of the elecBilPmtAuto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElecBilPmtAutoType }
     *     
     */
    public void setElecBilPmtAuto(ElecBilPmtAutoType value) {
        this.elecBilPmtAuto = value;
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
