
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
 * <p>Java class for ODPrvlgCalInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODPrvlgCalInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CalMonth" type="{http://jackhenry.com/jxchange/TPG/2008}CalMonth_Type" minOccurs="0"/&gt;
 *         &lt;element name="CalYr" type="{http://jackhenry.com/jxchange/TPG/2008}CalYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODPrvlgOccurCnt" type="{http://jackhenry.com/jxchange/TPG/2008}ODPrvlgOccurCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODPrvlgLTDOccurCnt" type="{http://jackhenry.com/jxchange/TPG/2008}ODPrvlgLTDOccurCnt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ODPrvlgCalInfoRec_CType", propOrder = {
    "calMonth",
    "calYr",
    "odPrvlgOccurCnt",
    "odPrvlgLTDOccurCnt",
    "ver1",
    "any"
})
public class ODPrvlgCalInfoRecCType {

    @XmlElement(name = "CalMonth")
    protected CalMonthType calMonth;
    @XmlElement(name = "CalYr")
    protected CalYrType calYr;
    @XmlElement(name = "ODPrvlgOccurCnt")
    protected ODPrvlgOccurCntType odPrvlgOccurCnt;
    @XmlElement(name = "ODPrvlgLTDOccurCnt")
    protected ODPrvlgLTDOccurCntType odPrvlgLTDOccurCnt;
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
     * Gets the value of the odPrvlgOccurCnt property.
     * 
     * @return
     *     possible object is
     *     {@link ODPrvlgOccurCntType }
     *     
     */
    public ODPrvlgOccurCntType getODPrvlgOccurCnt() {
        return odPrvlgOccurCnt;
    }

    /**
     * Sets the value of the odPrvlgOccurCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODPrvlgOccurCntType }
     *     
     */
    public void setODPrvlgOccurCnt(ODPrvlgOccurCntType value) {
        this.odPrvlgOccurCnt = value;
    }

    /**
     * Gets the value of the odPrvlgLTDOccurCnt property.
     * 
     * @return
     *     possible object is
     *     {@link ODPrvlgLTDOccurCntType }
     *     
     */
    public ODPrvlgLTDOccurCntType getODPrvlgLTDOccurCnt() {
        return odPrvlgLTDOccurCnt;
    }

    /**
     * Sets the value of the odPrvlgLTDOccurCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODPrvlgLTDOccurCntType }
     *     
     */
    public void setODPrvlgLTDOccurCnt(ODPrvlgLTDOccurCntType value) {
        this.odPrvlgLTDOccurCnt = value;
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
