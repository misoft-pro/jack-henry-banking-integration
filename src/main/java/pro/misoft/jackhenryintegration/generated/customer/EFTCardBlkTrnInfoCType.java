
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
 * <p>Java class for EFTCardBlkTrnInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardBlkTrnInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTBlkTrnCode" type="{http://jackhenry.com/jxchange/TPG/2008}EFTBlkTrnCode_Type"/&gt;
 *         &lt;element name="EFTOvrrdBlkTrnStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}StartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EFTOvrrdBlkTrnEnd0Dt" type="{http://jackhenry.com/jxchange/TPG/2008}EndDt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="Dlt" type="{http://jackhenry.com/jxchange/TPG/2008}Dlt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EFTCardBlkTrnInfo_CType", propOrder = {
    "eftBlkTrnCode",
    "eftOvrrdBlkTrnStartDt",
    "eftOvrrdBlkTrnEnd0Dt",
    "ver1",
    "dlt",
    "ver2",
    "any"
})
public class EFTCardBlkTrnInfoCType {

    @XmlElement(name = "EFTBlkTrnCode", required = true)
    protected EFTBlkTrnCodeType eftBlkTrnCode;
    @XmlElement(name = "EFTOvrrdBlkTrnStartDt")
    protected StartDtType eftOvrrdBlkTrnStartDt;
    @XmlElement(name = "EFTOvrrdBlkTrnEnd0Dt")
    protected EndDtType eftOvrrdBlkTrnEnd0Dt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "Dlt")
    protected DltType dlt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eftBlkTrnCode property.
     * 
     * @return
     *     possible object is
     *     {@link EFTBlkTrnCodeType }
     *     
     */
    public EFTBlkTrnCodeType getEFTBlkTrnCode() {
        return eftBlkTrnCode;
    }

    /**
     * Sets the value of the eftBlkTrnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTBlkTrnCodeType }
     *     
     */
    public void setEFTBlkTrnCode(EFTBlkTrnCodeType value) {
        this.eftBlkTrnCode = value;
    }

    /**
     * Gets the value of the eftOvrrdBlkTrnStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link StartDtType }
     *     
     */
    public StartDtType getEFTOvrrdBlkTrnStartDt() {
        return eftOvrrdBlkTrnStartDt;
    }

    /**
     * Sets the value of the eftOvrrdBlkTrnStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDtType }
     *     
     */
    public void setEFTOvrrdBlkTrnStartDt(StartDtType value) {
        this.eftOvrrdBlkTrnStartDt = value;
    }

    /**
     * Gets the value of the eftOvrrdBlkTrnEnd0Dt property.
     * 
     * @return
     *     possible object is
     *     {@link EndDtType }
     *     
     */
    public EndDtType getEFTOvrrdBlkTrnEnd0Dt() {
        return eftOvrrdBlkTrnEnd0Dt;
    }

    /**
     * Sets the value of the eftOvrrdBlkTrnEnd0Dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndDtType }
     *     
     */
    public void setEFTOvrrdBlkTrnEnd0Dt(EndDtType value) {
        this.eftOvrrdBlkTrnEnd0Dt = value;
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
     * Gets the value of the dlt property.
     * 
     * @return
     *     possible object is
     *     {@link DltType }
     *     
     */
    public DltType getDlt() {
        return dlt;
    }

    /**
     * Sets the value of the dlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DltType }
     *     
     */
    public void setDlt(DltType value) {
        this.dlt = value;
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
