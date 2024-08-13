
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
 * The complex describes income for an individual.
 * 
 * <p>Java class for IncmInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncmInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SalaryMonthAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SalaryMonthAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SalaryNetMonthAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SalaryNetMonthAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SalaryOvertimeAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SalaryOvertimeAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SalaryBonusAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SalaryBonusAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="SalaryComsonAmt" type="{http://jackhenry.com/jxchange/TPG/2008}SalaryComsonAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DivdIntMonthAmt" type="{http://jackhenry.com/jxchange/TPG/2008}DivdIntMonthAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="RentMonthIncmAmt" type="{http://jackhenry.com/jxchange/TPG/2008}RentMonthIncmAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OthIncmArray" type="{http://jackhenry.com/jxchange/TPG/2008}OthIncmArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "IncmInfo_CType", propOrder = {
    "salaryMonthAmt",
    "salaryNetMonthAmt",
    "salaryOvertimeAmt",
    "salaryBonusAmt",
    "salaryComsonAmt",
    "divdIntMonthAmt",
    "rentMonthIncmAmt",
    "othIncmArray",
    "ver1",
    "any"
})
public class IncmInfoCType {

    @XmlElement(name = "SalaryMonthAmt")
    protected SalaryMonthAmtType salaryMonthAmt;
    @XmlElement(name = "SalaryNetMonthAmt")
    protected SalaryNetMonthAmtType salaryNetMonthAmt;
    @XmlElement(name = "SalaryOvertimeAmt")
    protected SalaryOvertimeAmtType salaryOvertimeAmt;
    @XmlElement(name = "SalaryBonusAmt")
    protected SalaryBonusAmtType salaryBonusAmt;
    @XmlElement(name = "SalaryComsonAmt")
    protected SalaryComsonAmtType salaryComsonAmt;
    @XmlElement(name = "DivdIntMonthAmt")
    protected DivdIntMonthAmtType divdIntMonthAmt;
    @XmlElement(name = "RentMonthIncmAmt")
    protected RentMonthIncmAmtType rentMonthIncmAmt;
    @XmlElement(name = "OthIncmArray")
    protected OthIncmArrayAType othIncmArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the salaryMonthAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SalaryMonthAmtType }
     *     
     */
    public SalaryMonthAmtType getSalaryMonthAmt() {
        return salaryMonthAmt;
    }

    /**
     * Sets the value of the salaryMonthAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryMonthAmtType }
     *     
     */
    public void setSalaryMonthAmt(SalaryMonthAmtType value) {
        this.salaryMonthAmt = value;
    }

    /**
     * Gets the value of the salaryNetMonthAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SalaryNetMonthAmtType }
     *     
     */
    public SalaryNetMonthAmtType getSalaryNetMonthAmt() {
        return salaryNetMonthAmt;
    }

    /**
     * Sets the value of the salaryNetMonthAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryNetMonthAmtType }
     *     
     */
    public void setSalaryNetMonthAmt(SalaryNetMonthAmtType value) {
        this.salaryNetMonthAmt = value;
    }

    /**
     * Gets the value of the salaryOvertimeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SalaryOvertimeAmtType }
     *     
     */
    public SalaryOvertimeAmtType getSalaryOvertimeAmt() {
        return salaryOvertimeAmt;
    }

    /**
     * Sets the value of the salaryOvertimeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryOvertimeAmtType }
     *     
     */
    public void setSalaryOvertimeAmt(SalaryOvertimeAmtType value) {
        this.salaryOvertimeAmt = value;
    }

    /**
     * Gets the value of the salaryBonusAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SalaryBonusAmtType }
     *     
     */
    public SalaryBonusAmtType getSalaryBonusAmt() {
        return salaryBonusAmt;
    }

    /**
     * Sets the value of the salaryBonusAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryBonusAmtType }
     *     
     */
    public void setSalaryBonusAmt(SalaryBonusAmtType value) {
        this.salaryBonusAmt = value;
    }

    /**
     * Gets the value of the salaryComsonAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SalaryComsonAmtType }
     *     
     */
    public SalaryComsonAmtType getSalaryComsonAmt() {
        return salaryComsonAmt;
    }

    /**
     * Sets the value of the salaryComsonAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalaryComsonAmtType }
     *     
     */
    public void setSalaryComsonAmt(SalaryComsonAmtType value) {
        this.salaryComsonAmt = value;
    }

    /**
     * Gets the value of the divdIntMonthAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DivdIntMonthAmtType }
     *     
     */
    public DivdIntMonthAmtType getDivdIntMonthAmt() {
        return divdIntMonthAmt;
    }

    /**
     * Sets the value of the divdIntMonthAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DivdIntMonthAmtType }
     *     
     */
    public void setDivdIntMonthAmt(DivdIntMonthAmtType value) {
        this.divdIntMonthAmt = value;
    }

    /**
     * Gets the value of the rentMonthIncmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RentMonthIncmAmtType }
     *     
     */
    public RentMonthIncmAmtType getRentMonthIncmAmt() {
        return rentMonthIncmAmt;
    }

    /**
     * Sets the value of the rentMonthIncmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentMonthIncmAmtType }
     *     
     */
    public void setRentMonthIncmAmt(RentMonthIncmAmtType value) {
        this.rentMonthIncmAmt = value;
    }

    /**
     * Gets the value of the othIncmArray property.
     * 
     * @return
     *     possible object is
     *     {@link OthIncmArrayAType }
     *     
     */
    public OthIncmArrayAType getOthIncmArray() {
        return othIncmArray;
    }

    /**
     * Sets the value of the othIncmArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link OthIncmArrayAType }
     *     
     */
    public void setOthIncmArray(OthIncmArrayAType value) {
        this.othIncmArray = value;
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
