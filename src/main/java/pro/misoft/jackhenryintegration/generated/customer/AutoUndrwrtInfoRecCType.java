
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
 * <p>Java class for AutoUndrwrtInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoUndrwrtInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrioritySeq" type="{http://jackhenry.com/jxchange/TPG/2008}PrioritySeq_Type" minOccurs="0"/&gt;
 *         &lt;element name="AutoUndrwrtSysCode" type="{http://jackhenry.com/jxchange/TPG/2008}AutoUndrwrtSysCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AutoUndrwrtSysDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AutoUndrwrtSysDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AutoUndrwrtSysVal" type="{http://jackhenry.com/jxchange/TPG/2008}AutoUndrwrtSysVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="AutoUndrwrtRsltCode" type="{http://jackhenry.com/jxchange/TPG/2008}AutoUndrwrtRsltCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="AutoUndrwrtRsltDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AutoUndrwrtRsltDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AutoUndrwrtRsltVal" type="{http://jackhenry.com/jxchange/TPG/2008}AutoUndrwrtRsltVal_Type" minOccurs="0"/&gt;
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
@XmlType(name = "AutoUndrwrtInfoRec_CType", propOrder = {
    "prioritySeq",
    "autoUndrwrtSysCode",
    "autoUndrwrtSysDesc",
    "autoUndrwrtSysVal",
    "autoUndrwrtRsltCode",
    "autoUndrwrtRsltDesc",
    "autoUndrwrtRsltVal",
    "ver1",
    "any"
})
public class AutoUndrwrtInfoRecCType {

    @XmlElement(name = "PrioritySeq")
    protected PrioritySeqType prioritySeq;
    @XmlElement(name = "AutoUndrwrtSysCode")
    protected AutoUndrwrtSysCodeType autoUndrwrtSysCode;
    @XmlElement(name = "AutoUndrwrtSysDesc")
    protected AutoUndrwrtSysDescType autoUndrwrtSysDesc;
    @XmlElement(name = "AutoUndrwrtSysVal")
    protected AutoUndrwrtSysValType autoUndrwrtSysVal;
    @XmlElement(name = "AutoUndrwrtRsltCode")
    protected AutoUndrwrtRsltCodeType autoUndrwrtRsltCode;
    @XmlElement(name = "AutoUndrwrtRsltDesc")
    protected AutoUndrwrtRsltDescType autoUndrwrtRsltDesc;
    @XmlElement(name = "AutoUndrwrtRsltVal")
    protected AutoUndrwrtRsltValType autoUndrwrtRsltVal;
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
     * Gets the value of the autoUndrwrtSysCode property.
     * 
     * @return
     *     possible object is
     *     {@link AutoUndrwrtSysCodeType }
     *     
     */
    public AutoUndrwrtSysCodeType getAutoUndrwrtSysCode() {
        return autoUndrwrtSysCode;
    }

    /**
     * Sets the value of the autoUndrwrtSysCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoUndrwrtSysCodeType }
     *     
     */
    public void setAutoUndrwrtSysCode(AutoUndrwrtSysCodeType value) {
        this.autoUndrwrtSysCode = value;
    }

    /**
     * Gets the value of the autoUndrwrtSysDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AutoUndrwrtSysDescType }
     *     
     */
    public AutoUndrwrtSysDescType getAutoUndrwrtSysDesc() {
        return autoUndrwrtSysDesc;
    }

    /**
     * Sets the value of the autoUndrwrtSysDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoUndrwrtSysDescType }
     *     
     */
    public void setAutoUndrwrtSysDesc(AutoUndrwrtSysDescType value) {
        this.autoUndrwrtSysDesc = value;
    }

    /**
     * Gets the value of the autoUndrwrtSysVal property.
     * 
     * @return
     *     possible object is
     *     {@link AutoUndrwrtSysValType }
     *     
     */
    public AutoUndrwrtSysValType getAutoUndrwrtSysVal() {
        return autoUndrwrtSysVal;
    }

    /**
     * Sets the value of the autoUndrwrtSysVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoUndrwrtSysValType }
     *     
     */
    public void setAutoUndrwrtSysVal(AutoUndrwrtSysValType value) {
        this.autoUndrwrtSysVal = value;
    }

    /**
     * Gets the value of the autoUndrwrtRsltCode property.
     * 
     * @return
     *     possible object is
     *     {@link AutoUndrwrtRsltCodeType }
     *     
     */
    public AutoUndrwrtRsltCodeType getAutoUndrwrtRsltCode() {
        return autoUndrwrtRsltCode;
    }

    /**
     * Sets the value of the autoUndrwrtRsltCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoUndrwrtRsltCodeType }
     *     
     */
    public void setAutoUndrwrtRsltCode(AutoUndrwrtRsltCodeType value) {
        this.autoUndrwrtRsltCode = value;
    }

    /**
     * Gets the value of the autoUndrwrtRsltDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AutoUndrwrtRsltDescType }
     *     
     */
    public AutoUndrwrtRsltDescType getAutoUndrwrtRsltDesc() {
        return autoUndrwrtRsltDesc;
    }

    /**
     * Sets the value of the autoUndrwrtRsltDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoUndrwrtRsltDescType }
     *     
     */
    public void setAutoUndrwrtRsltDesc(AutoUndrwrtRsltDescType value) {
        this.autoUndrwrtRsltDesc = value;
    }

    /**
     * Gets the value of the autoUndrwrtRsltVal property.
     * 
     * @return
     *     possible object is
     *     {@link AutoUndrwrtRsltValType }
     *     
     */
    public AutoUndrwrtRsltValType getAutoUndrwrtRsltVal() {
        return autoUndrwrtRsltVal;
    }

    /**
     * Sets the value of the autoUndrwrtRsltVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoUndrwrtRsltValType }
     *     
     */
    public void setAutoUndrwrtRsltVal(AutoUndrwrtRsltValType value) {
        this.autoUndrwrtRsltVal = value;
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
