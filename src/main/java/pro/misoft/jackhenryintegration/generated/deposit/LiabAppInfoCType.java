
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for LiabAppInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiabAppInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LiabAppType" type="{http://jackhenry.com/jxchange/TPG/2008}LiabAppType_Type" minOccurs="0"/&gt;
 *         &lt;element name="LiabDefName" type="{http://jackhenry.com/jxchange/TPG/2008}LiabDefName_Type" minOccurs="0"/&gt;
 *         &lt;element name="LiabInstName" type="{http://jackhenry.com/jxchange/TPG/2008}LiabInstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="LiabInstAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="LiabAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="LiabAcctName" type="{http://jackhenry.com/jxchange/TPG/2008}LiabAcctName_Type" minOccurs="0"/&gt;
 *         &lt;element name="LiabOrigAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LiabOrigAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LiabCurBal" type="{http://jackhenry.com/jxchange/TPG/2008}LiabCurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="LiabMonthPmtAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LiabMonthPmtAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LiabAppInfo_CType", propOrder = {
    "liabAppType",
    "liabDefName",
    "liabInstName",
    "liabInstAddr",
    "liabAcctId",
    "liabAcctName",
    "liabOrigAmt",
    "liabCurBal",
    "liabMonthPmtAmt",
    "ver1",
    "any"
})
public class LiabAppInfoCType {

    @XmlElement(name = "LiabAppType")
    protected LiabAppTypeType liabAppType;
    @XmlElement(name = "LiabDefName")
    protected LiabDefNameType liabDefName;
    @XmlElement(name = "LiabInstName")
    protected LiabInstNameType liabInstName;
    @XmlElement(name = "LiabInstAddr")
    protected AddrCType liabInstAddr;
    @XmlElement(name = "LiabAcctId")
    protected AcctIdType liabAcctId;
    @XmlElement(name = "LiabAcctName")
    protected LiabAcctNameType liabAcctName;
    @XmlElement(name = "LiabOrigAmt")
    protected LiabOrigAmtType liabOrigAmt;
    @XmlElement(name = "LiabCurBal")
    protected LiabCurBalType liabCurBal;
    @XmlElement(name = "LiabMonthPmtAmt")
    protected LiabMonthPmtAmtType liabMonthPmtAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the liabAppType property.
     * 
     * @return
     *     possible object is
     *     {@link LiabAppTypeType }
     *     
     */
    public LiabAppTypeType getLiabAppType() {
        return liabAppType;
    }

    /**
     * Sets the value of the liabAppType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabAppTypeType }
     *     
     */
    public void setLiabAppType(LiabAppTypeType value) {
        this.liabAppType = value;
    }

    /**
     * Gets the value of the liabDefName property.
     * 
     * @return
     *     possible object is
     *     {@link LiabDefNameType }
     *     
     */
    public LiabDefNameType getLiabDefName() {
        return liabDefName;
    }

    /**
     * Sets the value of the liabDefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabDefNameType }
     *     
     */
    public void setLiabDefName(LiabDefNameType value) {
        this.liabDefName = value;
    }

    /**
     * Gets the value of the liabInstName property.
     * 
     * @return
     *     possible object is
     *     {@link LiabInstNameType }
     *     
     */
    public LiabInstNameType getLiabInstName() {
        return liabInstName;
    }

    /**
     * Sets the value of the liabInstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabInstNameType }
     *     
     */
    public void setLiabInstName(LiabInstNameType value) {
        this.liabInstName = value;
    }

    /**
     * Gets the value of the liabInstAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getLiabInstAddr() {
        return liabInstAddr;
    }

    /**
     * Sets the value of the liabInstAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setLiabInstAddr(AddrCType value) {
        this.liabInstAddr = value;
    }

    /**
     * Gets the value of the liabAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getLiabAcctId() {
        return liabAcctId;
    }

    /**
     * Sets the value of the liabAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setLiabAcctId(AcctIdType value) {
        this.liabAcctId = value;
    }

    /**
     * Gets the value of the liabAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link LiabAcctNameType }
     *     
     */
    public LiabAcctNameType getLiabAcctName() {
        return liabAcctName;
    }

    /**
     * Sets the value of the liabAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabAcctNameType }
     *     
     */
    public void setLiabAcctName(LiabAcctNameType value) {
        this.liabAcctName = value;
    }

    /**
     * Gets the value of the liabOrigAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LiabOrigAmtType }
     *     
     */
    public LiabOrigAmtType getLiabOrigAmt() {
        return liabOrigAmt;
    }

    /**
     * Sets the value of the liabOrigAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabOrigAmtType }
     *     
     */
    public void setLiabOrigAmt(LiabOrigAmtType value) {
        this.liabOrigAmt = value;
    }

    /**
     * Gets the value of the liabCurBal property.
     * 
     * @return
     *     possible object is
     *     {@link LiabCurBalType }
     *     
     */
    public LiabCurBalType getLiabCurBal() {
        return liabCurBal;
    }

    /**
     * Sets the value of the liabCurBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabCurBalType }
     *     
     */
    public void setLiabCurBal(LiabCurBalType value) {
        this.liabCurBal = value;
    }

    /**
     * Gets the value of the liabMonthPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link LiabMonthPmtAmtType }
     *     
     */
    public LiabMonthPmtAmtType getLiabMonthPmtAmt() {
        return liabMonthPmtAmt;
    }

    /**
     * Sets the value of the liabMonthPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiabMonthPmtAmtType }
     *     
     */
    public void setLiabMonthPmtAmt(LiabMonthPmtAmtType value) {
        this.liabMonthPmtAmt = value;
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
