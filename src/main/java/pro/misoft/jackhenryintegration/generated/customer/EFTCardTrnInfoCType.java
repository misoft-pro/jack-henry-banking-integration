
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
 * <p>Java class for EFTCardTrnInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardTrnInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardTrnType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardTrnType_Type"/&gt;
 *         &lt;element name="EFTCardTrnLocType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardTrnLocType_Type"/&gt;
 *         &lt;element name="EFTCardTrnCnt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardTrnCnt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EFTCardLTDTrnCnt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardLTDTrnCnt_Type" minOccurs="0"/&gt;
 *           &lt;element name="EFTCardLTDTrnAmt" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardLTDTrnAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EFTCardTrnInfo_CType", propOrder = {
    "eftCardTrnType",
    "eftCardTrnLocType",
    "eftCardTrnCnt",
    "ver1",
    "eftCardLTDTrnCnt",
    "eftCardLTDTrnAmt",
    "ver2",
    "any"
})
public class EFTCardTrnInfoCType {

    @XmlElement(name = "EFTCardTrnType", required = true)
    protected EFTCardTrnTypeType eftCardTrnType;
    @XmlElement(name = "EFTCardTrnLocType", required = true)
    protected EFTCardTrnLocTypeType eftCardTrnLocType;
    @XmlElement(name = "EFTCardTrnCnt")
    protected EFTCardTrnCntType eftCardTrnCnt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "EFTCardLTDTrnCnt")
    protected EFTCardLTDTrnCntType eftCardLTDTrnCnt;
    @XmlElement(name = "EFTCardLTDTrnAmt")
    protected EFTCardLTDTrnAmtType eftCardLTDTrnAmt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the eftCardTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardTrnTypeType }
     *     
     */
    public EFTCardTrnTypeType getEFTCardTrnType() {
        return eftCardTrnType;
    }

    /**
     * Sets the value of the eftCardTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardTrnTypeType }
     *     
     */
    public void setEFTCardTrnType(EFTCardTrnTypeType value) {
        this.eftCardTrnType = value;
    }

    /**
     * Gets the value of the eftCardTrnLocType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardTrnLocTypeType }
     *     
     */
    public EFTCardTrnLocTypeType getEFTCardTrnLocType() {
        return eftCardTrnLocType;
    }

    /**
     * Sets the value of the eftCardTrnLocType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardTrnLocTypeType }
     *     
     */
    public void setEFTCardTrnLocType(EFTCardTrnLocTypeType value) {
        this.eftCardTrnLocType = value;
    }

    /**
     * Gets the value of the eftCardTrnCnt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardTrnCntType }
     *     
     */
    public EFTCardTrnCntType getEFTCardTrnCnt() {
        return eftCardTrnCnt;
    }

    /**
     * Sets the value of the eftCardTrnCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardTrnCntType }
     *     
     */
    public void setEFTCardTrnCnt(EFTCardTrnCntType value) {
        this.eftCardTrnCnt = value;
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
     * Gets the value of the eftCardLTDTrnCnt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardLTDTrnCntType }
     *     
     */
    public EFTCardLTDTrnCntType getEFTCardLTDTrnCnt() {
        return eftCardLTDTrnCnt;
    }

    /**
     * Sets the value of the eftCardLTDTrnCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardLTDTrnCntType }
     *     
     */
    public void setEFTCardLTDTrnCnt(EFTCardLTDTrnCntType value) {
        this.eftCardLTDTrnCnt = value;
    }

    /**
     * Gets the value of the eftCardLTDTrnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardLTDTrnAmtType }
     *     
     */
    public EFTCardLTDTrnAmtType getEFTCardLTDTrnAmt() {
        return eftCardLTDTrnAmt;
    }

    /**
     * Sets the value of the eftCardLTDTrnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardLTDTrnAmtType }
     *     
     */
    public void setEFTCardLTDTrnAmt(EFTCardLTDTrnAmtType value) {
        this.eftCardLTDTrnAmt = value;
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
