
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
 * The complex of corporate/business statements
 * 
 * <p>Java class for CorpStmtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorpStmtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CorpStmtType" type="{http://jackhenry.com/jxchange/TPG/2008}CorpStmtType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CorpStmtYr" type="{http://jackhenry.com/jxchange/TPG/2008}CorpStmtYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="CorpStmtFiscalYr" type="{http://jackhenry.com/jxchange/TPG/2008}CorpStmtFiscalYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="CorpStmtBegDt" type="{http://jackhenry.com/jxchange/TPG/2008}CorpStmtBegDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CorpStmtEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}CorpStmtEndDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CorpStmtAuxDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CorpStmtAuxDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CorpStmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}CorpStmtDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CorpStmtInfo_CType", propOrder = {
    "corpStmtType",
    "corpStmtYr",
    "corpStmtFiscalYr",
    "corpStmtBegDt",
    "corpStmtEndDt",
    "corpStmtAuxDesc",
    "corpStmtDt",
    "ver1",
    "any"
})
public class CorpStmtInfoCType {

    @XmlElement(name = "CorpStmtType")
    protected CorpStmtTypeType corpStmtType;
    @XmlElement(name = "CorpStmtYr")
    protected CorpStmtYrType corpStmtYr;
    @XmlElement(name = "CorpStmtFiscalYr")
    protected CorpStmtFiscalYrType corpStmtFiscalYr;
    @XmlElement(name = "CorpStmtBegDt")
    protected CorpStmtBegDtType corpStmtBegDt;
    @XmlElement(name = "CorpStmtEndDt")
    protected CorpStmtEndDtType corpStmtEndDt;
    @XmlElement(name = "CorpStmtAuxDesc")
    protected CorpStmtAuxDescType corpStmtAuxDesc;
    @XmlElement(name = "CorpStmtDt")
    protected CorpStmtDtType corpStmtDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the corpStmtType property.
     * 
     * @return
     *     possible object is
     *     {@link CorpStmtTypeType }
     *     
     */
    public CorpStmtTypeType getCorpStmtType() {
        return corpStmtType;
    }

    /**
     * Sets the value of the corpStmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorpStmtTypeType }
     *     
     */
    public void setCorpStmtType(CorpStmtTypeType value) {
        this.corpStmtType = value;
    }

    /**
     * Gets the value of the corpStmtYr property.
     * 
     * @return
     *     possible object is
     *     {@link CorpStmtYrType }
     *     
     */
    public CorpStmtYrType getCorpStmtYr() {
        return corpStmtYr;
    }

    /**
     * Sets the value of the corpStmtYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorpStmtYrType }
     *     
     */
    public void setCorpStmtYr(CorpStmtYrType value) {
        this.corpStmtYr = value;
    }

    /**
     * Gets the value of the corpStmtFiscalYr property.
     * 
     * @return
     *     possible object is
     *     {@link CorpStmtFiscalYrType }
     *     
     */
    public CorpStmtFiscalYrType getCorpStmtFiscalYr() {
        return corpStmtFiscalYr;
    }

    /**
     * Sets the value of the corpStmtFiscalYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorpStmtFiscalYrType }
     *     
     */
    public void setCorpStmtFiscalYr(CorpStmtFiscalYrType value) {
        this.corpStmtFiscalYr = value;
    }

    /**
     * Gets the value of the corpStmtBegDt property.
     * 
     * @return
     *     possible object is
     *     {@link CorpStmtBegDtType }
     *     
     */
    public CorpStmtBegDtType getCorpStmtBegDt() {
        return corpStmtBegDt;
    }

    /**
     * Sets the value of the corpStmtBegDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorpStmtBegDtType }
     *     
     */
    public void setCorpStmtBegDt(CorpStmtBegDtType value) {
        this.corpStmtBegDt = value;
    }

    /**
     * Gets the value of the corpStmtEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link CorpStmtEndDtType }
     *     
     */
    public CorpStmtEndDtType getCorpStmtEndDt() {
        return corpStmtEndDt;
    }

    /**
     * Sets the value of the corpStmtEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorpStmtEndDtType }
     *     
     */
    public void setCorpStmtEndDt(CorpStmtEndDtType value) {
        this.corpStmtEndDt = value;
    }

    /**
     * Gets the value of the corpStmtAuxDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CorpStmtAuxDescType }
     *     
     */
    public CorpStmtAuxDescType getCorpStmtAuxDesc() {
        return corpStmtAuxDesc;
    }

    /**
     * Sets the value of the corpStmtAuxDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorpStmtAuxDescType }
     *     
     */
    public void setCorpStmtAuxDesc(CorpStmtAuxDescType value) {
        this.corpStmtAuxDesc = value;
    }

    /**
     * Gets the value of the corpStmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link CorpStmtDtType }
     *     
     */
    public CorpStmtDtType getCorpStmtDt() {
        return corpStmtDt;
    }

    /**
     * Sets the value of the corpStmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorpStmtDtType }
     *     
     */
    public void setCorpStmtDt(CorpStmtDtType value) {
        this.corpStmtDt = value;
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
