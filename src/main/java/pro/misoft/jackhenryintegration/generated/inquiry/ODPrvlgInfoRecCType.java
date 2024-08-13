
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
 * <p>Java class for ODPrvlgInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODPrvlgInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ODPrvlgLmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}ODPrvlgLmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODPrvlgResetCnt" type="{http://jackhenry.com/jxchange/TPG/2008}ODPrvlgResetCnt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExclODPrvlgRpt" type="{http://jackhenry.com/jxchange/TPG/2008}ExclODPrvlgRpt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODPrvlgCntReset" type="{http://jackhenry.com/jxchange/TPG/2008}ODPrvlgCntReset_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODPrvlgCntRevo" type="{http://jackhenry.com/jxchange/TPG/2008}ODPrvlgCntRevo_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODPrvlgGraceDt" type="{http://jackhenry.com/jxchange/TPG/2008}ODPrvlgGraceDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODPrvlgHistDt" type="{http://jackhenry.com/jxchange/TPG/2008}ODPrvlgHistDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODPrvlgActnDt" type="{http://jackhenry.com/jxchange/TPG/2008}ODPrvlgActnDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODPrvlgLastCntDt" type="{http://jackhenry.com/jxchange/TPG/2008}ODPrvlgLastCntDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODPrvlgConCode" type="{http://jackhenry.com/jxchange/TPG/2008}ODPrvlgConCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODPrvlgConDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ODPrvlgConDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODPrvlgCalArray" type="{http://jackhenry.com/jxchange/TPG/2008}ODPrvlgCalArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "ODPrvlgInfoRec_CType", propOrder = {
    "odPrvlgLmtDt",
    "odPrvlgResetCnt",
    "exclODPrvlgRpt",
    "odPrvlgCntReset",
    "odPrvlgCntRevo",
    "odPrvlgGraceDt",
    "odPrvlgHistDt",
    "odPrvlgActnDt",
    "odPrvlgLastCntDt",
    "odPrvlgConCode",
    "odPrvlgConDesc",
    "odPrvlgCalArray",
    "ver1",
    "any"
})
public class ODPrvlgInfoRecCType {

    @XmlElement(name = "ODPrvlgLmtDt")
    protected ODPrvlgLmtDtType odPrvlgLmtDt;
    @XmlElement(name = "ODPrvlgResetCnt")
    protected ODPrvlgResetCntType odPrvlgResetCnt;
    @XmlElement(name = "ExclODPrvlgRpt")
    protected ExclODPrvlgRptType exclODPrvlgRpt;
    @XmlElement(name = "ODPrvlgCntReset")
    protected ODPrvlgCntResetType odPrvlgCntReset;
    @XmlElement(name = "ODPrvlgCntRevo")
    protected ODPrvlgCntRevoType odPrvlgCntRevo;
    @XmlElement(name = "ODPrvlgGraceDt")
    protected ODPrvlgGraceDtType odPrvlgGraceDt;
    @XmlElement(name = "ODPrvlgHistDt")
    protected ODPrvlgHistDtType odPrvlgHistDt;
    @XmlElement(name = "ODPrvlgActnDt")
    protected ODPrvlgActnDtType odPrvlgActnDt;
    @XmlElement(name = "ODPrvlgLastCntDt")
    protected ODPrvlgLastCntDtType odPrvlgLastCntDt;
    @XmlElement(name = "ODPrvlgConCode")
    protected ODPrvlgConCodeType odPrvlgConCode;
    @XmlElement(name = "ODPrvlgConDesc")
    protected ODPrvlgConDescType odPrvlgConDesc;
    @XmlElement(name = "ODPrvlgCalArray")
    protected ODPrvlgCalArrayAType odPrvlgCalArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the odPrvlgLmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link ODPrvlgLmtDtType }
     *     
     */
    public ODPrvlgLmtDtType getODPrvlgLmtDt() {
        return odPrvlgLmtDt;
    }

    /**
     * Sets the value of the odPrvlgLmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODPrvlgLmtDtType }
     *     
     */
    public void setODPrvlgLmtDt(ODPrvlgLmtDtType value) {
        this.odPrvlgLmtDt = value;
    }

    /**
     * Gets the value of the odPrvlgResetCnt property.
     * 
     * @return
     *     possible object is
     *     {@link ODPrvlgResetCntType }
     *     
     */
    public ODPrvlgResetCntType getODPrvlgResetCnt() {
        return odPrvlgResetCnt;
    }

    /**
     * Sets the value of the odPrvlgResetCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODPrvlgResetCntType }
     *     
     */
    public void setODPrvlgResetCnt(ODPrvlgResetCntType value) {
        this.odPrvlgResetCnt = value;
    }

    /**
     * Gets the value of the exclODPrvlgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link ExclODPrvlgRptType }
     *     
     */
    public ExclODPrvlgRptType getExclODPrvlgRpt() {
        return exclODPrvlgRpt;
    }

    /**
     * Sets the value of the exclODPrvlgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclODPrvlgRptType }
     *     
     */
    public void setExclODPrvlgRpt(ExclODPrvlgRptType value) {
        this.exclODPrvlgRpt = value;
    }

    /**
     * Gets the value of the odPrvlgCntReset property.
     * 
     * @return
     *     possible object is
     *     {@link ODPrvlgCntResetType }
     *     
     */
    public ODPrvlgCntResetType getODPrvlgCntReset() {
        return odPrvlgCntReset;
    }

    /**
     * Sets the value of the odPrvlgCntReset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODPrvlgCntResetType }
     *     
     */
    public void setODPrvlgCntReset(ODPrvlgCntResetType value) {
        this.odPrvlgCntReset = value;
    }

    /**
     * Gets the value of the odPrvlgCntRevo property.
     * 
     * @return
     *     possible object is
     *     {@link ODPrvlgCntRevoType }
     *     
     */
    public ODPrvlgCntRevoType getODPrvlgCntRevo() {
        return odPrvlgCntRevo;
    }

    /**
     * Sets the value of the odPrvlgCntRevo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODPrvlgCntRevoType }
     *     
     */
    public void setODPrvlgCntRevo(ODPrvlgCntRevoType value) {
        this.odPrvlgCntRevo = value;
    }

    /**
     * Gets the value of the odPrvlgGraceDt property.
     * 
     * @return
     *     possible object is
     *     {@link ODPrvlgGraceDtType }
     *     
     */
    public ODPrvlgGraceDtType getODPrvlgGraceDt() {
        return odPrvlgGraceDt;
    }

    /**
     * Sets the value of the odPrvlgGraceDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODPrvlgGraceDtType }
     *     
     */
    public void setODPrvlgGraceDt(ODPrvlgGraceDtType value) {
        this.odPrvlgGraceDt = value;
    }

    /**
     * Gets the value of the odPrvlgHistDt property.
     * 
     * @return
     *     possible object is
     *     {@link ODPrvlgHistDtType }
     *     
     */
    public ODPrvlgHistDtType getODPrvlgHistDt() {
        return odPrvlgHistDt;
    }

    /**
     * Sets the value of the odPrvlgHistDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODPrvlgHistDtType }
     *     
     */
    public void setODPrvlgHistDt(ODPrvlgHistDtType value) {
        this.odPrvlgHistDt = value;
    }

    /**
     * Gets the value of the odPrvlgActnDt property.
     * 
     * @return
     *     possible object is
     *     {@link ODPrvlgActnDtType }
     *     
     */
    public ODPrvlgActnDtType getODPrvlgActnDt() {
        return odPrvlgActnDt;
    }

    /**
     * Sets the value of the odPrvlgActnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODPrvlgActnDtType }
     *     
     */
    public void setODPrvlgActnDt(ODPrvlgActnDtType value) {
        this.odPrvlgActnDt = value;
    }

    /**
     * Gets the value of the odPrvlgLastCntDt property.
     * 
     * @return
     *     possible object is
     *     {@link ODPrvlgLastCntDtType }
     *     
     */
    public ODPrvlgLastCntDtType getODPrvlgLastCntDt() {
        return odPrvlgLastCntDt;
    }

    /**
     * Sets the value of the odPrvlgLastCntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODPrvlgLastCntDtType }
     *     
     */
    public void setODPrvlgLastCntDt(ODPrvlgLastCntDtType value) {
        this.odPrvlgLastCntDt = value;
    }

    /**
     * Gets the value of the odPrvlgConCode property.
     * 
     * @return
     *     possible object is
     *     {@link ODPrvlgConCodeType }
     *     
     */
    public ODPrvlgConCodeType getODPrvlgConCode() {
        return odPrvlgConCode;
    }

    /**
     * Sets the value of the odPrvlgConCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODPrvlgConCodeType }
     *     
     */
    public void setODPrvlgConCode(ODPrvlgConCodeType value) {
        this.odPrvlgConCode = value;
    }

    /**
     * Gets the value of the odPrvlgConDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ODPrvlgConDescType }
     *     
     */
    public ODPrvlgConDescType getODPrvlgConDesc() {
        return odPrvlgConDesc;
    }

    /**
     * Sets the value of the odPrvlgConDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODPrvlgConDescType }
     *     
     */
    public void setODPrvlgConDesc(ODPrvlgConDescType value) {
        this.odPrvlgConDesc = value;
    }

    /**
     * Gets the value of the odPrvlgCalArray property.
     * 
     * @return
     *     possible object is
     *     {@link ODPrvlgCalArrayAType }
     *     
     */
    public ODPrvlgCalArrayAType getODPrvlgCalArray() {
        return odPrvlgCalArray;
    }

    /**
     * Sets the value of the odPrvlgCalArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link ODPrvlgCalArrayAType }
     *     
     */
    public void setODPrvlgCalArray(ODPrvlgCalArrayAType value) {
        this.odPrvlgCalArray = value;
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
