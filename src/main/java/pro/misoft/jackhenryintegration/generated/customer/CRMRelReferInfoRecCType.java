
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
 * <p>Java class for CRMRelReferInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMRelReferInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferId" type="{http://jackhenry.com/jxchange/TPG/2008}ReferId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReferDt" type="{http://jackhenry.com/jxchange/TPG/2008}ReferDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReferCrtOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReferStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ReferStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ReferRmk" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="ReferTime" type="{http://jackhenry.com/jxchange/TPG/2008}ReferTime_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "CRMRelReferInfoRec_CType", propOrder = {
    "referId",
    "referDt",
    "referCrtOffDesc",
    "referStatDesc",
    "referRmk",
    "ver1",
    "referTime",
    "ver2",
    "any"
})
public class CRMRelReferInfoRecCType {

    @XmlElement(name = "ReferId")
    protected ReferIdType referId;
    @XmlElement(name = "ReferDt")
    protected ReferDtType referDt;
    @XmlElement(name = "ReferCrtOffDesc")
    protected CRMOffDescType referCrtOffDesc;
    @XmlElement(name = "ReferStatDesc")
    protected ReferStatDescType referStatDesc;
    @XmlElement(name = "ReferRmk")
    protected RmkType referRmk;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "ReferTime")
    protected ReferTimeType referTime;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the referId property.
     * 
     * @return
     *     possible object is
     *     {@link ReferIdType }
     *     
     */
    public ReferIdType getReferId() {
        return referId;
    }

    /**
     * Sets the value of the referId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferIdType }
     *     
     */
    public void setReferId(ReferIdType value) {
        this.referId = value;
    }

    /**
     * Gets the value of the referDt property.
     * 
     * @return
     *     possible object is
     *     {@link ReferDtType }
     *     
     */
    public ReferDtType getReferDt() {
        return referDt;
    }

    /**
     * Sets the value of the referDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferDtType }
     *     
     */
    public void setReferDt(ReferDtType value) {
        this.referDt = value;
    }

    /**
     * Gets the value of the referCrtOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffDescType }
     *     
     */
    public CRMOffDescType getReferCrtOffDesc() {
        return referCrtOffDesc;
    }

    /**
     * Sets the value of the referCrtOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffDescType }
     *     
     */
    public void setReferCrtOffDesc(CRMOffDescType value) {
        this.referCrtOffDesc = value;
    }

    /**
     * Gets the value of the referStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ReferStatDescType }
     *     
     */
    public ReferStatDescType getReferStatDesc() {
        return referStatDesc;
    }

    /**
     * Sets the value of the referStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferStatDescType }
     *     
     */
    public void setReferStatDesc(ReferStatDescType value) {
        this.referStatDesc = value;
    }

    /**
     * Gets the value of the referRmk property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getReferRmk() {
        return referRmk;
    }

    /**
     * Sets the value of the referRmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setReferRmk(RmkType value) {
        this.referRmk = value;
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
     * Gets the value of the referTime property.
     * 
     * @return
     *     possible object is
     *     {@link ReferTimeType }
     *     
     */
    public ReferTimeType getReferTime() {
        return referTime;
    }

    /**
     * Sets the value of the referTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferTimeType }
     *     
     */
    public void setReferTime(ReferTimeType value) {
        this.referTime = value;
    }

    /**
     * Gets the value of the ver2 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver2CType }
     *     
     */
    public Ver2CType getVer2() {
        return ver2;
    }

    /**
     * Sets the value of the ver2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver2CType }
     *     
     */
    public void setVer2(Ver2CType value) {
        this.ver2 = value;
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
