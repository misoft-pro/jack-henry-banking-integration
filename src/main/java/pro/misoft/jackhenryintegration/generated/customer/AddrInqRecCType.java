
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
 * <p>Java class for AddrInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddrInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}AddrInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="AddrCat2Use" type="{http://jackhenry.com/jxchange/TPG/2008}AddrCat2Use_Type" minOccurs="0"/&gt;
 *         &lt;element name="DupAddrCat2Use" type="{http://jackhenry.com/jxchange/TPG/2008}DupAddrCat2Use_Type" minOccurs="0"/&gt;
 *         &lt;element name="WithNot" type="{http://jackhenry.com/jxchange/TPG/2008}WithNot_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtAddrInfo" type="{http://jackhenry.com/jxchange/TPG/2008}StmtAddrInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="MailDirDesc" type="{http://jackhenry.com/jxchange/TPG/2008}MailDirDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="DupMailIncImgDesc" type="{http://jackhenry.com/jxchange/TPG/2008}DupMailIncImgDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "AddrInqRec_CType", propOrder = {
    "addrInfo",
    "addrCat2Use",
    "dupAddrCat2Use",
    "withNot",
    "stmtAddrInfo",
    "mailDirDesc",
    "dupMailIncImgDesc",
    "ver1",
    "any"
})
public class AddrInqRecCType {

    @XmlElement(name = "AddrInfo")
    protected AddrInfoCType addrInfo;
    @XmlElement(name = "AddrCat2Use")
    protected AddrCat2UseType addrCat2Use;
    @XmlElement(name = "DupAddrCat2Use")
    protected DupAddrCat2UseType dupAddrCat2Use;
    @XmlElement(name = "WithNot")
    protected WithNotType withNot;
    @XmlElement(name = "StmtAddrInfo")
    protected StmtAddrInfoCType stmtAddrInfo;
    @XmlElement(name = "MailDirDesc")
    protected MailDirDescType mailDirDesc;
    @XmlElement(name = "DupMailIncImgDesc")
    protected DupMailIncImgDescType dupMailIncImgDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the addrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AddrInfoCType }
     *     
     */
    public AddrInfoCType getAddrInfo() {
        return addrInfo;
    }

    /**
     * Sets the value of the addrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrInfoCType }
     *     
     */
    public void setAddrInfo(AddrInfoCType value) {
        this.addrInfo = value;
    }

    /**
     * Gets the value of the addrCat2Use property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCat2UseType }
     *     
     */
    public AddrCat2UseType getAddrCat2Use() {
        return addrCat2Use;
    }

    /**
     * Sets the value of the addrCat2Use property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCat2UseType }
     *     
     */
    public void setAddrCat2Use(AddrCat2UseType value) {
        this.addrCat2Use = value;
    }

    /**
     * Gets the value of the dupAddrCat2Use property.
     * 
     * @return
     *     possible object is
     *     {@link DupAddrCat2UseType }
     *     
     */
    public DupAddrCat2UseType getDupAddrCat2Use() {
        return dupAddrCat2Use;
    }

    /**
     * Sets the value of the dupAddrCat2Use property.
     * 
     * @param value
     *     allowed object is
     *     {@link DupAddrCat2UseType }
     *     
     */
    public void setDupAddrCat2Use(DupAddrCat2UseType value) {
        this.dupAddrCat2Use = value;
    }

    /**
     * Gets the value of the withNot property.
     * 
     * @return
     *     possible object is
     *     {@link WithNotType }
     *     
     */
    public WithNotType getWithNot() {
        return withNot;
    }

    /**
     * Sets the value of the withNot property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithNotType }
     *     
     */
    public void setWithNot(WithNotType value) {
        this.withNot = value;
    }

    /**
     * Gets the value of the stmtAddrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StmtAddrInfoCType }
     *     
     */
    public StmtAddrInfoCType getStmtAddrInfo() {
        return stmtAddrInfo;
    }

    /**
     * Sets the value of the stmtAddrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtAddrInfoCType }
     *     
     */
    public void setStmtAddrInfo(StmtAddrInfoCType value) {
        this.stmtAddrInfo = value;
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
     * Gets the value of the dupMailIncImgDesc property.
     * 
     * @return
     *     possible object is
     *     {@link DupMailIncImgDescType }
     *     
     */
    public DupMailIncImgDescType getDupMailIncImgDesc() {
        return dupMailIncImgDesc;
    }

    /**
     * Sets the value of the dupMailIncImgDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DupMailIncImgDescType }
     *     
     */
    public void setDupMailIncImgDesc(DupMailIncImgDescType value) {
        this.dupMailIncImgDesc = value;
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
