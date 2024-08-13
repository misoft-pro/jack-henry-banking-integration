
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
 * <p>Java class for GLMonthAmtInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GLMonthAmtInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CalMonth" type="{http://jackhenry.com/jxchange/TPG/2008}CalMonth_Type"/&gt;
 *         &lt;element name="CalYr" type="{http://jackhenry.com/jxchange/TPG/2008}CalYr_Type"/&gt;
 *         &lt;element name="MonthBdgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MonthBdgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="WorkBdgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}WorkBdgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OrigBdgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}OrigBdgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MonthActAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MonthActAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MonthAvgBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MonthAvgBalAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MonthBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MonthBalAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "GLMonthAmtInfoRec_CType", propOrder = {
    "calMonth",
    "calYr",
    "monthBdgAmt",
    "workBdgAmt",
    "origBdgAmt",
    "monthActAmt",
    "monthAvgBalAmt",
    "monthBalAmt",
    "ver1",
    "any"
})
public class GLMonthAmtInfoRecCType {

    @XmlElement(name = "CalMonth", required = true)
    protected CalMonthType calMonth;
    @XmlElement(name = "CalYr", required = true)
    protected CalYrType calYr;
    @XmlElement(name = "MonthBdgAmt")
    protected MonthBdgAmtType monthBdgAmt;
    @XmlElement(name = "WorkBdgAmt")
    protected WorkBdgAmtType workBdgAmt;
    @XmlElement(name = "OrigBdgAmt")
    protected OrigBdgAmtType origBdgAmt;
    @XmlElement(name = "MonthActAmt")
    protected MonthActAmtType monthActAmt;
    @XmlElement(name = "MonthAvgBalAmt")
    protected MonthAvgBalAmtType monthAvgBalAmt;
    @XmlElement(name = "MonthBalAmt")
    protected MonthBalAmtType monthBalAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the calMonth property.
     * 
     * @return
     *     possible object is
     *     {@link CalMonthType }
     *     
     */
    public CalMonthType getCalMonth() {
        return calMonth;
    }

    /**
     * Sets the value of the calMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalMonthType }
     *     
     */
    public void setCalMonth(CalMonthType value) {
        this.calMonth = value;
    }

    /**
     * Gets the value of the calYr property.
     * 
     * @return
     *     possible object is
     *     {@link CalYrType }
     *     
     */
    public CalYrType getCalYr() {
        return calYr;
    }

    /**
     * Sets the value of the calYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalYrType }
     *     
     */
    public void setCalYr(CalYrType value) {
        this.calYr = value;
    }

    /**
     * Gets the value of the monthBdgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MonthBdgAmtType }
     *     
     */
    public MonthBdgAmtType getMonthBdgAmt() {
        return monthBdgAmt;
    }

    /**
     * Sets the value of the monthBdgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthBdgAmtType }
     *     
     */
    public void setMonthBdgAmt(MonthBdgAmtType value) {
        this.monthBdgAmt = value;
    }

    /**
     * Gets the value of the workBdgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link WorkBdgAmtType }
     *     
     */
    public WorkBdgAmtType getWorkBdgAmt() {
        return workBdgAmt;
    }

    /**
     * Sets the value of the workBdgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkBdgAmtType }
     *     
     */
    public void setWorkBdgAmt(WorkBdgAmtType value) {
        this.workBdgAmt = value;
    }

    /**
     * Gets the value of the origBdgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OrigBdgAmtType }
     *     
     */
    public OrigBdgAmtType getOrigBdgAmt() {
        return origBdgAmt;
    }

    /**
     * Sets the value of the origBdgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigBdgAmtType }
     *     
     */
    public void setOrigBdgAmt(OrigBdgAmtType value) {
        this.origBdgAmt = value;
    }

    /**
     * Gets the value of the monthActAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MonthActAmtType }
     *     
     */
    public MonthActAmtType getMonthActAmt() {
        return monthActAmt;
    }

    /**
     * Sets the value of the monthActAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthActAmtType }
     *     
     */
    public void setMonthActAmt(MonthActAmtType value) {
        this.monthActAmt = value;
    }

    /**
     * Gets the value of the monthAvgBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MonthAvgBalAmtType }
     *     
     */
    public MonthAvgBalAmtType getMonthAvgBalAmt() {
        return monthAvgBalAmt;
    }

    /**
     * Sets the value of the monthAvgBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthAvgBalAmtType }
     *     
     */
    public void setMonthAvgBalAmt(MonthAvgBalAmtType value) {
        this.monthAvgBalAmt = value;
    }

    /**
     * Gets the value of the monthBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MonthBalAmtType }
     *     
     */
    public MonthBalAmtType getMonthBalAmt() {
        return monthBalAmt;
    }

    /**
     * Sets the value of the monthBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthBalAmtType }
     *     
     */
    public void setMonthBalAmt(MonthBalAmtType value) {
        this.monthBalAmt = value;
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
