
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
 * <p>Java class for ODPrvlgAcctInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODPrvlgAcctInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ODExmpLdgrAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ODExmpLdgrAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODExmpColAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ODExmpColAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODExmpAvlAmt" type="{http://jackhenry.com/jxchange/TPG/2008}ODExmpAvlAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODExmpCurCnt" type="{http://jackhenry.com/jxchange/TPG/2008}ODExmpCurCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODExmpQTDCnt" type="{http://jackhenry.com/jxchange/TPG/2008}ODExmpQTDCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODExmpYTDCnt" type="{http://jackhenry.com/jxchange/TPG/2008}ODExmpYTDCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODExmpPYTDCnt" type="{http://jackhenry.com/jxchange/TPG/2008}ODExmpPYTDCnt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ODPrvlgAcctInfo_CType", propOrder = {
    "odExmpLdgrAmt",
    "odExmpColAmt",
    "odExmpAvlAmt",
    "odExmpCurCnt",
    "odExmpQTDCnt",
    "odExmpYTDCnt",
    "odExmpPYTDCnt",
    "ver1",
    "any"
})
public class ODPrvlgAcctInfoCType {

    @XmlElement(name = "ODExmpLdgrAmt")
    protected ODExmpLdgrAmtType odExmpLdgrAmt;
    @XmlElement(name = "ODExmpColAmt")
    protected ODExmpColAmtType odExmpColAmt;
    @XmlElement(name = "ODExmpAvlAmt")
    protected ODExmpAvlAmtType odExmpAvlAmt;
    @XmlElement(name = "ODExmpCurCnt")
    protected ODExmpCurCntType odExmpCurCnt;
    @XmlElement(name = "ODExmpQTDCnt")
    protected ODExmpQTDCntType odExmpQTDCnt;
    @XmlElement(name = "ODExmpYTDCnt")
    protected ODExmpYTDCntType odExmpYTDCnt;
    @XmlElement(name = "ODExmpPYTDCnt")
    protected ODExmpPYTDCntType odExmpPYTDCnt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the odExmpLdgrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ODExmpLdgrAmtType }
     *     
     */
    public ODExmpLdgrAmtType getODExmpLdgrAmt() {
        return odExmpLdgrAmt;
    }

    /**
     * Sets the value of the odExmpLdgrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODExmpLdgrAmtType }
     *     
     */
    public void setODExmpLdgrAmt(ODExmpLdgrAmtType value) {
        this.odExmpLdgrAmt = value;
    }

    /**
     * Gets the value of the odExmpColAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ODExmpColAmtType }
     *     
     */
    public ODExmpColAmtType getODExmpColAmt() {
        return odExmpColAmt;
    }

    /**
     * Sets the value of the odExmpColAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODExmpColAmtType }
     *     
     */
    public void setODExmpColAmt(ODExmpColAmtType value) {
        this.odExmpColAmt = value;
    }

    /**
     * Gets the value of the odExmpAvlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ODExmpAvlAmtType }
     *     
     */
    public ODExmpAvlAmtType getODExmpAvlAmt() {
        return odExmpAvlAmt;
    }

    /**
     * Sets the value of the odExmpAvlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODExmpAvlAmtType }
     *     
     */
    public void setODExmpAvlAmt(ODExmpAvlAmtType value) {
        this.odExmpAvlAmt = value;
    }

    /**
     * Gets the value of the odExmpCurCnt property.
     * 
     * @return
     *     possible object is
     *     {@link ODExmpCurCntType }
     *     
     */
    public ODExmpCurCntType getODExmpCurCnt() {
        return odExmpCurCnt;
    }

    /**
     * Sets the value of the odExmpCurCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODExmpCurCntType }
     *     
     */
    public void setODExmpCurCnt(ODExmpCurCntType value) {
        this.odExmpCurCnt = value;
    }

    /**
     * Gets the value of the odExmpQTDCnt property.
     * 
     * @return
     *     possible object is
     *     {@link ODExmpQTDCntType }
     *     
     */
    public ODExmpQTDCntType getODExmpQTDCnt() {
        return odExmpQTDCnt;
    }

    /**
     * Sets the value of the odExmpQTDCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODExmpQTDCntType }
     *     
     */
    public void setODExmpQTDCnt(ODExmpQTDCntType value) {
        this.odExmpQTDCnt = value;
    }

    /**
     * Gets the value of the odExmpYTDCnt property.
     * 
     * @return
     *     possible object is
     *     {@link ODExmpYTDCntType }
     *     
     */
    public ODExmpYTDCntType getODExmpYTDCnt() {
        return odExmpYTDCnt;
    }

    /**
     * Sets the value of the odExmpYTDCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODExmpYTDCntType }
     *     
     */
    public void setODExmpYTDCnt(ODExmpYTDCntType value) {
        this.odExmpYTDCnt = value;
    }

    /**
     * Gets the value of the odExmpPYTDCnt property.
     * 
     * @return
     *     possible object is
     *     {@link ODExmpPYTDCntType }
     *     
     */
    public ODExmpPYTDCntType getODExmpPYTDCnt() {
        return odExmpPYTDCnt;
    }

    /**
     * Sets the value of the odExmpPYTDCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODExmpPYTDCntType }
     *     
     */
    public void setODExmpPYTDCnt(ODExmpPYTDCntType value) {
        this.odExmpPYTDCnt = value;
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
