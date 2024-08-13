
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
 * <p>Java class for LnUnitProtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnUnitProtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LastAdvaDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastAdvaDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}DrAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DrAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}DrAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastAdvaAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LastAdvaAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MinAdvaAmt" type="{http://jackhenry.com/jxchange/TPG/2008}MinAdvaAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnUnitProtInfo_CType", propOrder = {
    "lastAdvaDt",
    "drAcctId",
    "drAcctType",
    "lastAdvaAmt",
    "minAdvaAmt",
    "ver1",
    "any"
})
public class LnUnitProtInfoCType {

    @XmlElement(name = "LastAdvaDt")
    protected LastAdvaDtType lastAdvaDt;
    @XmlElement(name = "DrAcctId")
    protected DrAcctIdType drAcctId;
    @XmlElement(name = "DrAcctType")
    protected DrAcctTypeType drAcctType;
    @XmlElement(name = "LastAdvaAmt")
    protected LastAdvaAmtType lastAdvaAmt;
    @XmlElement(name = "MinAdvaAmt")
    protected MinAdvaAmtType minAdvaAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lastAdvaDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastAdvaDtType }
     *     
     */
    public LastAdvaDtType getLastAdvaDt() {
        return lastAdvaDt;
    }

    /**
     * Sets the value of the lastAdvaDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastAdvaDtType }
     *     
     */
    public void setLastAdvaDt(LastAdvaDtType value) {
        this.lastAdvaDt = value;
    }

    /**
     * Gets the value of the drAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link DrAcctIdType }
     *     
     */
    public DrAcctIdType getDrAcctId() {
        return drAcctId;
    }

    /**
     * Sets the value of the drAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrAcctIdType }
     *     
     */
    public void setDrAcctId(DrAcctIdType value) {
        this.drAcctId = value;
    }

    /**
     * Gets the value of the drAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link DrAcctTypeType }
     *     
     */
    public DrAcctTypeType getDrAcctType() {
        return drAcctType;
    }

    /**
     * Sets the value of the drAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrAcctTypeType }
     *     
     */
    public void setDrAcctType(DrAcctTypeType value) {
        this.drAcctType = value;
    }

    /**
     * Gets the value of the lastAdvaAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LastAdvaAmtType }
     *     
     */
    public LastAdvaAmtType getLastAdvaAmt() {
        return lastAdvaAmt;
    }

    /**
     * Sets the value of the lastAdvaAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastAdvaAmtType }
     *     
     */
    public void setLastAdvaAmt(LastAdvaAmtType value) {
        this.lastAdvaAmt = value;
    }

    /**
     * Gets the value of the minAdvaAmt property.
     * 
     * @return
     *     possible object is
     *     {@link MinAdvaAmtType }
     *     
     */
    public MinAdvaAmtType getMinAdvaAmt() {
        return minAdvaAmt;
    }

    /**
     * Sets the value of the minAdvaAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinAdvaAmtType }
     *     
     */
    public void setMinAdvaAmt(MinAdvaAmtType value) {
        this.minAdvaAmt = value;
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
