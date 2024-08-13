
package pro.misoft.jackhenryintegration.generated.customer;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * a package of data related to the address on a
 *                 Card
 * 
 * <p>Java class for EFTCardAddrInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EFTCardAddrInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EFTCardAddrType" type="{http://jackhenry.com/jxchange/TPG/2008}EFTCardAddrType_Type"/&gt;
 *         &lt;element name="Addr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="AddrKey" type="{http://jackhenry.com/jxchange/TPG/2008}AddrKey_Type" minOccurs="0"/&gt;
 *         &lt;element name="MailDirCode" type="{http://jackhenry.com/jxchange/TPG/2008}MailDirCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="MailDirDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MailDirDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}ExpDt_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EFTCardAddrInfo_CType", propOrder = {
    "eftCardAddrType",
    "addr",
    "addrKey",
    "mailDirCode",
    "mailDirDesc",
    "expDt"
})
public class EFTCardAddrInfoCType {

    @XmlElement(name = "EFTCardAddrType", required = true)
    protected EFTCardAddrTypeType eftCardAddrType;
    @XmlElement(name = "Addr")
    protected AddrCType addr;
    @XmlElement(name = "AddrKey")
    protected AddrKeyType addrKey;
    @XmlElement(name = "MailDirCode")
    protected MailDirCodeType mailDirCode;
    @XmlElement(name = "MailDirDesc")
    protected MailDirDescType mailDirDesc;
    @XmlElement(name = "ExpDt")
    protected ExpDtType expDt;

    /**
     * Gets the value of the eftCardAddrType property.
     * 
     * @return
     *     possible object is
     *     {@link EFTCardAddrTypeType }
     *     
     */
    public EFTCardAddrTypeType getEFTCardAddrType() {
        return eftCardAddrType;
    }

    /**
     * Sets the value of the eftCardAddrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFTCardAddrTypeType }
     *     
     */
    public void setEFTCardAddrType(EFTCardAddrTypeType value) {
        this.eftCardAddrType = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setAddr(AddrCType value) {
        this.addr = value;
    }

    /**
     * Gets the value of the addrKey property.
     * 
     * @return
     *     possible object is
     *     {@link AddrKeyType }
     *     
     */
    public AddrKeyType getAddrKey() {
        return addrKey;
    }

    /**
     * Sets the value of the addrKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrKeyType }
     *     
     */
    public void setAddrKey(AddrKeyType value) {
        this.addrKey = value;
    }

    /**
     * Gets the value of the mailDirCode property.
     * 
     * @return
     *     possible object is
     *     {@link MailDirCodeType }
     *     
     */
    public MailDirCodeType getMailDirCode() {
        return mailDirCode;
    }

    /**
     * Sets the value of the mailDirCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailDirCodeType }
     *     
     */
    public void setMailDirCode(MailDirCodeType value) {
        this.mailDirCode = value;
    }

    /**
     * Gets the value of the mailDirDesc property.
     * 
     * @return
     *     possible object is
     *     {@link MailDirDescType }
     *     
     */
    public MailDirDescType getMailDirDesc() {
        return mailDirDesc;
    }

    /**
     * Sets the value of the mailDirDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailDirDescType }
     *     
     */
    public void setMailDirDesc(MailDirDescType value) {
        this.mailDirDesc = value;
    }

    /**
     * Gets the value of the expDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpDtType }
     *     
     */
    public ExpDtType getExpDt() {
        return expDt;
    }

    /**
     * Sets the value of the expDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpDtType }
     *     
     */
    public void setExpDt(ExpDtType value) {
        this.expDt = value;
    }

}
