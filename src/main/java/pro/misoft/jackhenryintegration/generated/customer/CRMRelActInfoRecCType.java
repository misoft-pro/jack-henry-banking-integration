
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
 * <p>Java class for CRMRelActInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRMRelActInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRMActType" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMActId" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMActDt" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ActCrtOffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMOffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMActStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRMActRmk" type="{http://jackhenry.com/jxchange/TPG/2008}Rmk_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="CRMActTime" type="{http://jackhenry.com/jxchange/TPG/2008}CRMActTime_Type" minOccurs="0"/&gt;
 *           &lt;element name="ActCrtTimeDt" type="{http://jackhenry.com/jxchange/TPG/2008}ActCrtTimeDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "CRMRelActInfoRec_CType", propOrder = {
    "crmActType",
    "crmActId",
    "crmActDt",
    "actCrtOffDesc",
    "crmActStatDesc",
    "crmActRmk",
    "ver1",
    "crmActTime",
    "actCrtTimeDt",
    "ver2",
    "any"
})
public class CRMRelActInfoRecCType {

    @XmlElement(name = "CRMActType")
    protected CRMActTypeType crmActType;
    @XmlElement(name = "CRMActId")
    protected CRMActIdType crmActId;
    @XmlElement(name = "CRMActDt")
    protected CRMActDtType crmActDt;
    @XmlElement(name = "ActCrtOffDesc")
    protected CRMOffDescType actCrtOffDesc;
    @XmlElement(name = "CRMActStatDesc")
    protected CRMActStatDescType crmActStatDesc;
    @XmlElement(name = "CRMActRmk")
    protected RmkType crmActRmk;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "CRMActTime")
    protected CRMActTimeType crmActTime;
    @XmlElement(name = "ActCrtTimeDt")
    protected ActCrtTimeDtType actCrtTimeDt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the crmActType property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActTypeType }
     *     
     */
    public CRMActTypeType getCRMActType() {
        return crmActType;
    }

    /**
     * Sets the value of the crmActType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActTypeType }
     *     
     */
    public void setCRMActType(CRMActTypeType value) {
        this.crmActType = value;
    }

    /**
     * Gets the value of the crmActId property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActIdType }
     *     
     */
    public CRMActIdType getCRMActId() {
        return crmActId;
    }

    /**
     * Sets the value of the crmActId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActIdType }
     *     
     */
    public void setCRMActId(CRMActIdType value) {
        this.crmActId = value;
    }

    /**
     * Gets the value of the crmActDt property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActDtType }
     *     
     */
    public CRMActDtType getCRMActDt() {
        return crmActDt;
    }

    /**
     * Sets the value of the crmActDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActDtType }
     *     
     */
    public void setCRMActDt(CRMActDtType value) {
        this.crmActDt = value;
    }

    /**
     * Gets the value of the actCrtOffDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMOffDescType }
     *     
     */
    public CRMOffDescType getActCrtOffDesc() {
        return actCrtOffDesc;
    }

    /**
     * Sets the value of the actCrtOffDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMOffDescType }
     *     
     */
    public void setActCrtOffDesc(CRMOffDescType value) {
        this.actCrtOffDesc = value;
    }

    /**
     * Gets the value of the crmActStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActStatDescType }
     *     
     */
    public CRMActStatDescType getCRMActStatDesc() {
        return crmActStatDesc;
    }

    /**
     * Sets the value of the crmActStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActStatDescType }
     *     
     */
    public void setCRMActStatDesc(CRMActStatDescType value) {
        this.crmActStatDesc = value;
    }

    /**
     * Gets the value of the crmActRmk property.
     * 
     * @return
     *     possible object is
     *     {@link RmkType }
     *     
     */
    public RmkType getCRMActRmk() {
        return crmActRmk;
    }

    /**
     * Sets the value of the crmActRmk property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkType }
     *     
     */
    public void setCRMActRmk(RmkType value) {
        this.crmActRmk = value;
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
     * Gets the value of the crmActTime property.
     * 
     * @return
     *     possible object is
     *     {@link CRMActTimeType }
     *     
     */
    public CRMActTimeType getCRMActTime() {
        return crmActTime;
    }

    /**
     * Sets the value of the crmActTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRMActTimeType }
     *     
     */
    public void setCRMActTime(CRMActTimeType value) {
        this.crmActTime = value;
    }

    /**
     * Gets the value of the actCrtTimeDt property.
     * 
     * @return
     *     possible object is
     *     {@link ActCrtTimeDtType }
     *     
     */
    public ActCrtTimeDtType getActCrtTimeDt() {
        return actCrtTimeDt;
    }

    /**
     * Sets the value of the actCrtTimeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActCrtTimeDtType }
     *     
     */
    public void setActCrtTimeDt(ActCrtTimeDtType value) {
        this.actCrtTimeDt = value;
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
