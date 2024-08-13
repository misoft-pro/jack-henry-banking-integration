
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
 * <p>Java class for DepMod_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepMod_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}DepInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="DepAcctInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepAcctInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="DepBalDtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepBalDtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="DepNSFODInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepNSFODInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="DepRateIntInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepRateIntInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="DepRegRptInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepRegRptInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="DepStmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepStmtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="DepTaxInfo" type="{http://jackhenry.com/jxchange/TPG/2008}DepTaxInfo_CType" minOccurs="0"/&gt;
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
@XmlType(name = "DepMod_CType", propOrder = {
    "depInfoRec",
    "depAcctInfo",
    "depBalDtInfo",
    "depNSFODInfo",
    "depRateIntInfo",
    "depRegRptInfo",
    "depStmtInfo",
    "depTaxInfo",
    "ver1",
    "any"
})
public class DepModCType {

    @XmlElement(name = "DepInfoRec")
    protected DepInfoRecCType depInfoRec;
    @XmlElement(name = "DepAcctInfo")
    protected DepAcctInfoCType depAcctInfo;
    @XmlElement(name = "DepBalDtInfo")
    protected DepBalDtInfoCType depBalDtInfo;
    @XmlElement(name = "DepNSFODInfo")
    protected DepNSFODInfoCType depNSFODInfo;
    @XmlElement(name = "DepRateIntInfo")
    protected DepRateIntInfoCType depRateIntInfo;
    @XmlElement(name = "DepRegRptInfo")
    protected DepRegRptInfoCType depRegRptInfo;
    @XmlElement(name = "DepStmtInfo")
    protected DepStmtInfoCType depStmtInfo;
    @XmlElement(name = "DepTaxInfo")
    protected DepTaxInfoCType depTaxInfo;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the depInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link DepInfoRecCType }
     *     
     */
    public DepInfoRecCType getDepInfoRec() {
        return depInfoRec;
    }

    /**
     * Sets the value of the depInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepInfoRecCType }
     *     
     */
    public void setDepInfoRec(DepInfoRecCType value) {
        this.depInfoRec = value;
    }

    /**
     * Gets the value of the depAcctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepAcctInfoCType }
     *     
     */
    public DepAcctInfoCType getDepAcctInfo() {
        return depAcctInfo;
    }

    /**
     * Sets the value of the depAcctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepAcctInfoCType }
     *     
     */
    public void setDepAcctInfo(DepAcctInfoCType value) {
        this.depAcctInfo = value;
    }

    /**
     * Gets the value of the depBalDtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepBalDtInfoCType }
     *     
     */
    public DepBalDtInfoCType getDepBalDtInfo() {
        return depBalDtInfo;
    }

    /**
     * Sets the value of the depBalDtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepBalDtInfoCType }
     *     
     */
    public void setDepBalDtInfo(DepBalDtInfoCType value) {
        this.depBalDtInfo = value;
    }

    /**
     * Gets the value of the depNSFODInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepNSFODInfoCType }
     *     
     */
    public DepNSFODInfoCType getDepNSFODInfo() {
        return depNSFODInfo;
    }

    /**
     * Sets the value of the depNSFODInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepNSFODInfoCType }
     *     
     */
    public void setDepNSFODInfo(DepNSFODInfoCType value) {
        this.depNSFODInfo = value;
    }

    /**
     * Gets the value of the depRateIntInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepRateIntInfoCType }
     *     
     */
    public DepRateIntInfoCType getDepRateIntInfo() {
        return depRateIntInfo;
    }

    /**
     * Sets the value of the depRateIntInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepRateIntInfoCType }
     *     
     */
    public void setDepRateIntInfo(DepRateIntInfoCType value) {
        this.depRateIntInfo = value;
    }

    /**
     * Gets the value of the depRegRptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepRegRptInfoCType }
     *     
     */
    public DepRegRptInfoCType getDepRegRptInfo() {
        return depRegRptInfo;
    }

    /**
     * Sets the value of the depRegRptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepRegRptInfoCType }
     *     
     */
    public void setDepRegRptInfo(DepRegRptInfoCType value) {
        this.depRegRptInfo = value;
    }

    /**
     * Gets the value of the depStmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepStmtInfoCType }
     *     
     */
    public DepStmtInfoCType getDepStmtInfo() {
        return depStmtInfo;
    }

    /**
     * Sets the value of the depStmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepStmtInfoCType }
     *     
     */
    public void setDepStmtInfo(DepStmtInfoCType value) {
        this.depStmtInfo = value;
    }

    /**
     * Gets the value of the depTaxInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DepTaxInfoCType }
     *     
     */
    public DepTaxInfoCType getDepTaxInfo() {
        return depTaxInfo;
    }

    /**
     * Sets the value of the depTaxInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepTaxInfoCType }
     *     
     */
    public void setDepTaxInfo(DepTaxInfoCType value) {
        this.depTaxInfo = value;
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
