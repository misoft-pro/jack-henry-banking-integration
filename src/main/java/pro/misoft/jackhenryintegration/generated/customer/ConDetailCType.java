
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
 * <p>Java class for ConDetail_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConDetail_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConText" type="{http://jackhenry.com/jxchange/TPG/2008}ConText_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConType" type="{http://jackhenry.com/jxchange/TPG/2008}RecipConType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConName" type="{http://jackhenry.com/jxchange/TPG/2008}Name_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConVal" type="{http://jackhenry.com/jxchange/TPG/2008}Val_Type" minOccurs="0"/&gt;
 *         &lt;element name="MobPrvdCode" type="{http://jackhenry.com/jxchange/TPG/2008}MobPrvdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PrioritySeq" type="{http://jackhenry.com/jxchange/TPG/2008}PrioritySeq_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ConDetail_CType", propOrder = {
    "conText",
    "conType",
    "conName",
    "conVal",
    "mobPrvdCode",
    "prioritySeq",
    "ver1",
    "any"
})
public class ConDetailCType {

    @XmlElement(name = "ConText")
    protected ConTextType conText;
    @XmlElement(name = "ConType")
    protected RecipConTypeType conType;
    @XmlElement(name = "ConName")
    protected NameType conName;
    @XmlElement(name = "ConVal")
    protected ValType conVal;
    @XmlElement(name = "MobPrvdCode")
    protected MobPrvdCodeType mobPrvdCode;
    @XmlElement(name = "PrioritySeq")
    protected PrioritySeqType prioritySeq;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the conText property.
     * 
     * @return
     *     possible object is
     *     {@link ConTextType }
     *     
     */
    public ConTextType getConText() {
        return conText;
    }

    /**
     * Sets the value of the conText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConTextType }
     *     
     */
    public void setConText(ConTextType value) {
        this.conText = value;
    }

    /**
     * Gets the value of the conType property.
     * 
     * @return
     *     possible object is
     *     {@link RecipConTypeType }
     *     
     */
    public RecipConTypeType getConType() {
        return conType;
    }

    /**
     * Sets the value of the conType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipConTypeType }
     *     
     */
    public void setConType(RecipConTypeType value) {
        this.conType = value;
    }

    /**
     * Gets the value of the conName property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getConName() {
        return conName;
    }

    /**
     * Sets the value of the conName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setConName(NameType value) {
        this.conName = value;
    }

    /**
     * Gets the value of the conVal property.
     * 
     * @return
     *     possible object is
     *     {@link ValType }
     *     
     */
    public ValType getConVal() {
        return conVal;
    }

    /**
     * Sets the value of the conVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValType }
     *     
     */
    public void setConVal(ValType value) {
        this.conVal = value;
    }

    /**
     * Gets the value of the mobPrvdCode property.
     * 
     * @return
     *     possible object is
     *     {@link MobPrvdCodeType }
     *     
     */
    public MobPrvdCodeType getMobPrvdCode() {
        return mobPrvdCode;
    }

    /**
     * Sets the value of the mobPrvdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobPrvdCodeType }
     *     
     */
    public void setMobPrvdCode(MobPrvdCodeType value) {
        this.mobPrvdCode = value;
    }

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
