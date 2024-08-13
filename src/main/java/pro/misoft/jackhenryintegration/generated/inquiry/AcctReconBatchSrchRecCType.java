
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
 * <p>Java class for AcctReconBatchSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctReconBatchSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctReconBatchId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctReconBatchId_Type"/&gt;
 *         &lt;element name="AcctReconBatchDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AcctReconBatchDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctReconBatchDt" type="{http://jackhenry.com/jxchange/TPG/2008}AcctReconBatchDt_Type"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "AcctReconBatchSrchRec_CType", propOrder = {
    "acctReconBatchId",
    "acctReconBatchDesc",
    "acctReconBatchDt",
    "custom",
    "ver1",
    "any"
})
public class AcctReconBatchSrchRecCType {

    @XmlElement(name = "AcctReconBatchId", required = true)
    protected AcctReconBatchIdType acctReconBatchId;
    @XmlElement(name = "AcctReconBatchDesc")
    protected AcctReconBatchDescType acctReconBatchDesc;
    @XmlElement(name = "AcctReconBatchDt", required = true)
    protected AcctReconBatchDtType acctReconBatchDt;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the acctReconBatchId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctReconBatchIdType }
     *     
     */
    public AcctReconBatchIdType getAcctReconBatchId() {
        return acctReconBatchId;
    }

    /**
     * Sets the value of the acctReconBatchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctReconBatchIdType }
     *     
     */
    public void setAcctReconBatchId(AcctReconBatchIdType value) {
        this.acctReconBatchId = value;
    }

    /**
     * Gets the value of the acctReconBatchDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AcctReconBatchDescType }
     *     
     */
    public AcctReconBatchDescType getAcctReconBatchDesc() {
        return acctReconBatchDesc;
    }

    /**
     * Sets the value of the acctReconBatchDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctReconBatchDescType }
     *     
     */
    public void setAcctReconBatchDesc(AcctReconBatchDescType value) {
        this.acctReconBatchDesc = value;
    }

    /**
     * Gets the value of the acctReconBatchDt property.
     * 
     * @return
     *     possible object is
     *     {@link AcctReconBatchDtType }
     *     
     */
    public AcctReconBatchDtType getAcctReconBatchDt() {
        return acctReconBatchDt;
    }

    /**
     * Sets the value of the acctReconBatchDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctReconBatchDtType }
     *     
     */
    public void setAcctReconBatchDt(AcctReconBatchDtType value) {
        this.acctReconBatchDt = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustom(CustomCType value) {
        this.custom = value;
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
