
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
 * <p>Java class for BorwEthnicRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BorwEthnicRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrioritySeq" type="{http://jackhenry.com/jxchange/TPG/2008}PrioritySeq_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwEthnicType" type="{http://jackhenry.com/jxchange/TPG/2008}EthnicType_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwEthnicVal" type="{http://jackhenry.com/jxchange/TPG/2008}EthnicVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="BorwEthnicColType" type="{http://jackhenry.com/jxchange/TPG/2008}EthnicColType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "BorwEthnicRec_CType", propOrder = {
    "prioritySeq",
    "borwEthnicType",
    "borwEthnicVal",
    "borwEthnicColType",
    "ver1",
    "any"
})
public class BorwEthnicRecCType {

    @XmlElement(name = "PrioritySeq")
    protected PrioritySeqType prioritySeq;
    @XmlElement(name = "BorwEthnicType")
    protected EthnicTypeType borwEthnicType;
    @XmlElement(name = "BorwEthnicVal")
    protected EthnicValType borwEthnicVal;
    @XmlElement(name = "BorwEthnicColType")
    protected EthnicColTypeType borwEthnicColType;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the prioritySeq property.
     * 
     * @return
     *     possible object is
     *     {@link PrioritySeqType }
     *     
     */
    public PrioritySeqType getPrioritySeq() {
        return prioritySeq;
    }

    /**
     * Sets the value of the prioritySeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrioritySeqType }
     *     
     */
    public void setPrioritySeq(PrioritySeqType value) {
        this.prioritySeq = value;
    }

    /**
     * Gets the value of the borwEthnicType property.
     * 
     * @return
     *     possible object is
     *     {@link EthnicTypeType }
     *     
     */
    public EthnicTypeType getBorwEthnicType() {
        return borwEthnicType;
    }

    /**
     * Sets the value of the borwEthnicType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EthnicTypeType }
     *     
     */
    public void setBorwEthnicType(EthnicTypeType value) {
        this.borwEthnicType = value;
    }

    /**
     * Gets the value of the borwEthnicVal property.
     * 
     * @return
     *     possible object is
     *     {@link EthnicValType }
     *     
     */
    public EthnicValType getBorwEthnicVal() {
        return borwEthnicVal;
    }

    /**
     * Sets the value of the borwEthnicVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EthnicValType }
     *     
     */
    public void setBorwEthnicVal(EthnicValType value) {
        this.borwEthnicVal = value;
    }

    /**
     * Gets the value of the borwEthnicColType property.
     * 
     * @return
     *     possible object is
     *     {@link EthnicColTypeType }
     *     
     */
    public EthnicColTypeType getBorwEthnicColType() {
        return borwEthnicColType;
    }

    /**
     * Sets the value of the borwEthnicColType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EthnicColTypeType }
     *     
     */
    public void setBorwEthnicColType(EthnicColTypeType value) {
        this.borwEthnicColType = value;
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
