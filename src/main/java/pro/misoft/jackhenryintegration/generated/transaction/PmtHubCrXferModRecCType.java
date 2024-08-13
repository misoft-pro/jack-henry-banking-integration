
package pro.misoft.jackhenryintegration.generated.transaction;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for PmtHubCrXferModRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtHubCrXferModRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="XferAmt" type="{http://jackhenry.com/jxchange/TPG/2008}Amt_Type" minOccurs="0"/&gt;
 *         &lt;element name="CrXferFinInstId" type="{http://jackhenry.com/jxchange/TPG/2008}InstRtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtHubActStat" type="{http://jackhenry.com/jxchange/TPG/2008}PmtHubActStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="ImmedInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}ImmedInfoRec_CType" minOccurs="0"/&gt;
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
@XmlType(name = "PmtHubCrXferModRec_CType", propOrder = {
    "xferAmt",
    "crXferFinInstId",
    "pmtHubActStat",
    "immedInfoRec",
    "ver1",
    "any"
})
public class PmtHubCrXferModRecCType {

    @XmlElement(name = "XferAmt")
    protected AmtType xferAmt;
    @XmlElement(name = "CrXferFinInstId")
    protected InstRtIdType crXferFinInstId;
    @XmlElement(name = "PmtHubActStat")
    protected PmtHubActStatType pmtHubActStat;
    @XmlElement(name = "ImmedInfoRec")
    protected ImmedInfoRecCType immedInfoRec;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the xferAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmtType }
     *     
     */
    public AmtType getXferAmt() {
        return xferAmt;
    }

    /**
     * Sets the value of the xferAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtType }
     *     
     */
    public void setXferAmt(AmtType value) {
        this.xferAmt = value;
    }

    /**
     * Gets the value of the crXferFinInstId property.
     * 
     * @return
     *     possible object is
     *     {@link InstRtIdType }
     *     
     */
    public InstRtIdType getCrXferFinInstId() {
        return crXferFinInstId;
    }

    /**
     * Sets the value of the crXferFinInstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstRtIdType }
     *     
     */
    public void setCrXferFinInstId(InstRtIdType value) {
        this.crXferFinInstId = value;
    }

    /**
     * Gets the value of the pmtHubActStat property.
     * 
     * @return
     *     possible object is
     *     {@link PmtHubActStatType }
     *     
     */
    public PmtHubActStatType getPmtHubActStat() {
        return pmtHubActStat;
    }

    /**
     * Sets the value of the pmtHubActStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtHubActStatType }
     *     
     */
    public void setPmtHubActStat(PmtHubActStatType value) {
        this.pmtHubActStat = value;
    }

    /**
     * Gets the value of the immedInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link ImmedInfoRecCType }
     *     
     */
    public ImmedInfoRecCType getImmedInfoRec() {
        return immedInfoRec;
    }

    /**
     * Sets the value of the immedInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImmedInfoRecCType }
     *     
     */
    public void setImmedInfoRec(ImmedInfoRecCType value) {
        this.immedInfoRec = value;
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
     * {@link Element }
     * {@link Object }
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
