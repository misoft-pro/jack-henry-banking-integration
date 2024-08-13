
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
 * <p>Java class for AcctAnlysInqInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctAnlysInqInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctAnlysInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}AcctAnlysInfoRec_CType"/&gt;
 *         &lt;element name="AnlysCodeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AnlysCodeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrtBilNotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrtBilNotDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AnlysStmtDlvryDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AnlysStmtDlvryDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "AcctAnlysInqInfo_CType", propOrder = {
    "acctAnlysInfoRec",
    "anlysCodeDesc",
    "brDesc",
    "prtBilNotDesc",
    "acctStatDesc",
    "offDesc",
    "anlysStmtDlvryDesc",
    "ver1",
    "any"
})
public class AcctAnlysInqInfoCType {

    @XmlElement(name = "AcctAnlysInfoRec", required = true)
    protected AcctAnlysInfoRecCType acctAnlysInfoRec;
    @XmlElement(name = "AnlysCodeDesc")
    protected AnlysCodeDescType anlysCodeDesc;
    @XmlElement(name = "BrDesc")
    protected BrDescType brDesc;
    @XmlElement(name = "PrtBilNotDesc")
    protected PrtBilNotDescType prtBilNotDesc;
    @XmlElement(name = "AcctStatDesc")
    protected AcctStatDescType acctStatDesc;
    @XmlElement(name = "OffDesc")
    protected OffDescType offDesc;
    @XmlElement(name = "AnlysStmtDlvryDesc")
    protected AnlysStmtDlvryDescType anlysStmtDlvryDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the acctAnlysInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link AcctAnlysInfoRecCType }
     *     
     */
    public AcctAnlysInfoRecCType getAcctAnlysInfoRec() {
        return acctAnlysInfoRec;
    }

    /**
     * Sets the value of the acctAnlysInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctAnlysInfoRecCType }
     *     
     */
    public void setAcctAnlysInfoRec(AcctAnlysInfoRecCType value) {
        this.acctAnlysInfoRec = value;
    }

    /**
     * Gets the value of the anlysCodeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AnlysCodeDescType }
     *     
     */
    public AnlysCodeDescType getAnlysCodeDesc() {
        return anlysCodeDesc;
    }

    /**
     * Sets the value of the anlysCodeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlysCodeDescType }
     *     
     */
    public void setAnlysCodeDesc(AnlysCodeDescType value) {
        this.anlysCodeDesc = value;
    }

    /**
     * Gets the value of the brDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrDescType }
     *     
     */
    public BrDescType getBrDesc() {
        return brDesc;
    }

    /**
     * Sets the value of the brDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrDescType }
     *     
     */
    public void setBrDesc(BrDescType value) {
        this.brDesc = value;
    }

    /**
     * Gets the value of the prtBilNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrtBilNotDescType }
     *     
     */
    public PrtBilNotDescType getPrtBilNotDesc() {
        return prtBilNotDesc;
    }

    /**
     * Sets the value of the prtBilNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtBilNotDescType }
     *     
     */
    public void setPrtBilNotDesc(PrtBilNotDescType value) {
        this.prtBilNotDesc = value;
    }

    /**
     * Gets the value of the acctStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctStatDescType }
     *     
     */
    public AcctStatDescType getAcctStatDesc() {
        return acctStatDesc;
    }

    /**
     * Sets the value of the acctStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctStatDescType }
     *     
     */
    public void setAcctStatDesc(AcctStatDescType value) {
        this.acctStatDesc = value;
    }

    /**
     * Gets the value of the offDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OffDescType }
     *     
     */
    public OffDescType getOffDesc() {
        return offDesc;
    }

    /**
     * Sets the value of the offDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffDescType }
     *     
     */
    public void setOffDesc(OffDescType value) {
        this.offDesc = value;
    }

    /**
     * Gets the value of the anlysStmtDlvryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AnlysStmtDlvryDescType }
     *     
     */
    public AnlysStmtDlvryDescType getAnlysStmtDlvryDesc() {
        return anlysStmtDlvryDesc;
    }

    /**
     * Sets the value of the anlysStmtDlvryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnlysStmtDlvryDescType }
     *     
     */
    public void setAnlysStmtDlvryDesc(AnlysStmtDlvryDescType value) {
        this.anlysStmtDlvryDesc = value;
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
