
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for RecurInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DlyRecurInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}DlyRecurInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="WeeklyRecurInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}WeeklyRecurInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="MthlyRecurInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}MthlyRecurInfoRec_CType" minOccurs="0"/&gt;
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
@XmlType(name = "RecurInfoRec_CType", propOrder = {
    "dlyRecurInfoRec",
    "weeklyRecurInfoRec",
    "mthlyRecurInfoRec",
    "ver1",
    "any"
})
public class RecurInfoRecCType {

    @XmlElement(name = "DlyRecurInfoRec")
    protected DlyRecurInfoRecCType dlyRecurInfoRec;
    @XmlElement(name = "WeeklyRecurInfoRec")
    protected WeeklyRecurInfoRecCType weeklyRecurInfoRec;
    @XmlElement(name = "MthlyRecurInfoRec")
    protected MthlyRecurInfoRecCType mthlyRecurInfoRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the dlyRecurInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link DlyRecurInfoRecCType }
     *     
     */
    public DlyRecurInfoRecCType getDlyRecurInfoRec() {
        return dlyRecurInfoRec;
    }

    /**
     * Sets the value of the dlyRecurInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link DlyRecurInfoRecCType }
     *     
     */
    public void setDlyRecurInfoRec(DlyRecurInfoRecCType value) {
        this.dlyRecurInfoRec = value;
    }

    /**
     * Gets the value of the weeklyRecurInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link WeeklyRecurInfoRecCType }
     *     
     */
    public WeeklyRecurInfoRecCType getWeeklyRecurInfoRec() {
        return weeklyRecurInfoRec;
    }

    /**
     * Sets the value of the weeklyRecurInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeeklyRecurInfoRecCType }
     *     
     */
    public void setWeeklyRecurInfoRec(WeeklyRecurInfoRecCType value) {
        this.weeklyRecurInfoRec = value;
    }

    /**
     * Gets the value of the mthlyRecurInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link MthlyRecurInfoRecCType }
     *     
     */
    public MthlyRecurInfoRecCType getMthlyRecurInfoRec() {
        return mthlyRecurInfoRec;
    }

    /**
     * Sets the value of the mthlyRecurInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link MthlyRecurInfoRecCType }
     *     
     */
    public void setMthlyRecurInfoRec(MthlyRecurInfoRecCType value) {
        this.mthlyRecurInfoRec = value;
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
