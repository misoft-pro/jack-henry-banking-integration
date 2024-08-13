
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
 * <p>Java class for LnSvcInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnSvcInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrigPartPct" type="{http://jackhenry.com/jxchange/TPG/2008}OrigPartPct_Type" minOccurs="0"/&gt;
 *         &lt;element name="PoolId" type="{http://jackhenry.com/jxchange/TPG/2008}PoolId_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcProcCode" type="{http://jackhenry.com/jxchange/TPG/2008}SvcProcCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcCommitCode" type="{http://jackhenry.com/jxchange/TPG/2008}SvcCommitCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="YieldDiffType" type="{http://jackhenry.com/jxchange/TPG/2008}YieldDiffType_Type" minOccurs="0"/&gt;
 *         &lt;element name="SvcStat" type="{http://jackhenry.com/jxchange/TPG/2008}SvcStat_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnSvcInfoRec_CType", propOrder = {
    "origPartPct",
    "poolId",
    "svcProcCode",
    "svcCommitCode",
    "yieldDiffType",
    "svcStat",
    "ver1",
    "any"
})
public class LnSvcInfoRecCType {

    @XmlElement(name = "OrigPartPct")
    protected OrigPartPctType origPartPct;
    @XmlElement(name = "PoolId")
    protected PoolIdType poolId;
    @XmlElement(name = "SvcProcCode")
    protected SvcProcCodeType svcProcCode;
    @XmlElement(name = "SvcCommitCode")
    protected SvcCommitCodeType svcCommitCode;
    @XmlElement(name = "YieldDiffType")
    protected YieldDiffTypeType yieldDiffType;
    @XmlElement(name = "SvcStat")
    protected SvcStatType svcStat;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the origPartPct property.
     * 
     * @return
     *     possible object is
     *     {@link OrigPartPctType }
     *     
     */
    public OrigPartPctType getOrigPartPct() {
        return origPartPct;
    }

    /**
     * Sets the value of the origPartPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigPartPctType }
     *     
     */
    public void setOrigPartPct(OrigPartPctType value) {
        this.origPartPct = value;
    }

    /**
     * Gets the value of the poolId property.
     * 
     * @return
     *     possible object is
     *     {@link PoolIdType }
     *     
     */
    public PoolIdType getPoolId() {
        return poolId;
    }

    /**
     * Sets the value of the poolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoolIdType }
     *     
     */
    public void setPoolId(PoolIdType value) {
        this.poolId = value;
    }

    /**
     * Gets the value of the svcProcCode property.
     * 
     * @return
     *     possible object is
     *     {@link SvcProcCodeType }
     *     
     */
    public SvcProcCodeType getSvcProcCode() {
        return svcProcCode;
    }

    /**
     * Sets the value of the svcProcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcProcCodeType }
     *     
     */
    public void setSvcProcCode(SvcProcCodeType value) {
        this.svcProcCode = value;
    }

    /**
     * Gets the value of the svcCommitCode property.
     * 
     * @return
     *     possible object is
     *     {@link SvcCommitCodeType }
     *     
     */
    public SvcCommitCodeType getSvcCommitCode() {
        return svcCommitCode;
    }

    /**
     * Sets the value of the svcCommitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcCommitCodeType }
     *     
     */
    public void setSvcCommitCode(SvcCommitCodeType value) {
        this.svcCommitCode = value;
    }

    /**
     * Gets the value of the yieldDiffType property.
     * 
     * @return
     *     possible object is
     *     {@link YieldDiffTypeType }
     *     
     */
    public YieldDiffTypeType getYieldDiffType() {
        return yieldDiffType;
    }

    /**
     * Sets the value of the yieldDiffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldDiffTypeType }
     *     
     */
    public void setYieldDiffType(YieldDiffTypeType value) {
        this.yieldDiffType = value;
    }

    /**
     * Gets the value of the svcStat property.
     * 
     * @return
     *     possible object is
     *     {@link SvcStatType }
     *     
     */
    public SvcStatType getSvcStat() {
        return svcStat;
    }

    /**
     * Sets the value of the svcStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcStatType }
     *     
     */
    public void setSvcStat(SvcStatType value) {
        this.svcStat = value;
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
