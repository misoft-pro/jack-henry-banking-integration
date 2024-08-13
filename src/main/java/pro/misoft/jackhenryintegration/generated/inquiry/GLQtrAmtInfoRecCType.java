
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
 * <p>Java class for GLQtrAmtInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GLQtrAmtInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QtrBegDt" type="{http://jackhenry.com/jxchange/TPG/2008}QtrBegDt_Type"/&gt;
 *         &lt;element name="QtrEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}QtrEndDt_Type"/&gt;
 *         &lt;element name="QtrAvgBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}QtrAvgBalAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="QtrBalAmt" type="{http://jackhenry.com/jxchange/TPG/2008}QtrBalAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "GLQtrAmtInfoRec_CType", propOrder = {
    "qtrBegDt",
    "qtrEndDt",
    "qtrAvgBalAmt",
    "qtrBalAmt",
    "ver1",
    "any"
})
public class GLQtrAmtInfoRecCType {

    @XmlElement(name = "QtrBegDt", required = true)
    protected QtrBegDtType qtrBegDt;
    @XmlElement(name = "QtrEndDt", required = true)
    protected QtrEndDtType qtrEndDt;
    @XmlElement(name = "QtrAvgBalAmt")
    protected QtrAvgBalAmtType qtrAvgBalAmt;
    @XmlElement(name = "QtrBalAmt")
    protected QtrBalAmtType qtrBalAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the qtrBegDt property.
     * 
     * @return
     *     possible object is
     *     {@link QtrBegDtType }
     *     
     */
    public QtrBegDtType getQtrBegDt() {
        return qtrBegDt;
    }

    /**
     * Sets the value of the qtrBegDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link QtrBegDtType }
     *     
     */
    public void setQtrBegDt(QtrBegDtType value) {
        this.qtrBegDt = value;
    }

    /**
     * Gets the value of the qtrEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link QtrEndDtType }
     *     
     */
    public QtrEndDtType getQtrEndDt() {
        return qtrEndDt;
    }

    /**
     * Sets the value of the qtrEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link QtrEndDtType }
     *     
     */
    public void setQtrEndDt(QtrEndDtType value) {
        this.qtrEndDt = value;
    }

    /**
     * Gets the value of the qtrAvgBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link QtrAvgBalAmtType }
     *     
     */
    public QtrAvgBalAmtType getQtrAvgBalAmt() {
        return qtrAvgBalAmt;
    }

    /**
     * Sets the value of the qtrAvgBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link QtrAvgBalAmtType }
     *     
     */
    public void setQtrAvgBalAmt(QtrAvgBalAmtType value) {
        this.qtrAvgBalAmt = value;
    }

    /**
     * Gets the value of the qtrBalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link QtrBalAmtType }
     *     
     */
    public QtrBalAmtType getQtrBalAmt() {
        return qtrBalAmt;
    }

    /**
     * Sets the value of the qtrBalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link QtrBalAmtType }
     *     
     */
    public void setQtrBalAmt(QtrBalAmtType value) {
        this.qtrBalAmt = value;
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
