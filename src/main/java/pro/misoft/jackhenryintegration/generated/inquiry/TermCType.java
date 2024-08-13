
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
 * <p>Java class for Term_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Term_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TermCnt" type="{http://jackhenry.com/jxchange/TPG/2008}TermCnt_Type"/&gt;
 *         &lt;element name="TermUnits" type="{http://jackhenry.com/jxchange/TPG/2008}TermUnits_Type"/&gt;
 *         &lt;element name="Desc" type="{http://jackhenry.com/jxchange/TPG/2008}Desc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DaysCall" type="{http://jackhenry.com/jxchange/TPG/2008}DaysCall_Type" minOccurs="0"/&gt;
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
@XmlType(name = "Term_CType", propOrder = {
    "termCnt",
    "termUnits",
    "desc",
    "daysCall",
    "ver1",
    "any"
})
public class TermCType {

    @XmlElement(name = "TermCnt", required = true)
    protected TermCntType termCnt;
    @XmlElement(name = "TermUnits", required = true)
    protected TermUnitsType termUnits;
    @XmlElement(name = "Desc")
    protected DescType desc;
    @XmlElement(name = "DaysCall")
    protected DaysCallType daysCall;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the termCnt property.
     * 
     * @return
     *     possible object is
     *     {@link TermCntType }
     *     
     */
    public TermCntType getTermCnt() {
        return termCnt;
    }

    /**
     * Sets the value of the termCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCntType }
     *     
     */
    public void setTermCnt(TermCntType value) {
        this.termCnt = value;
    }

    /**
     * Gets the value of the termUnits property.
     * 
     * @return
     *     possible object is
     *     {@link TermUnitsType }
     *     
     */
    public TermUnitsType getTermUnits() {
        return termUnits;
    }

    /**
     * Sets the value of the termUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermUnitsType }
     *     
     */
    public void setTermUnits(TermUnitsType value) {
        this.termUnits = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link DescType }
     *     
     */
    public DescType getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescType }
     *     
     */
    public void setDesc(DescType value) {
        this.desc = value;
    }

    /**
     * Gets the value of the daysCall property.
     * 
     * @return
     *     possible object is
     *     {@link DaysCallType }
     *     
     */
    public DaysCallType getDaysCall() {
        return daysCall;
    }

    /**
     * Sets the value of the daysCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaysCallType }
     *     
     */
    public void setDaysCall(DaysCallType value) {
        this.daysCall = value;
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
