
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
 * <p>Java class for TrnAddQuoteRsInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrnAddQuoteRsInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type"/&gt;
 *         &lt;element name="AcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="TrnAddQuotePriorInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TrnAddQuotePriorInfo_CType"/&gt;
 *         &lt;element name="TrnAddQuotePostInfo" type="{http://jackhenry.com/jxchange/TPG/2008}TrnAddQuotePostInfo_CType"/&gt;
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
@XmlType(name = "TrnAddQuoteRsInfo_CType", propOrder = {
    "acctId",
    "acctType",
    "trnAddQuotePriorInfo",
    "trnAddQuotePostInfo",
    "ver1",
    "any"
})
public class TrnAddQuoteRsInfoCType {

    @XmlElement(name = "AcctId", required = true)
    protected AcctIdType acctId;
    @XmlElement(name = "AcctType")
    protected AcctTypeType acctType;
    @XmlElement(name = "TrnAddQuotePriorInfo", required = true)
    protected TrnAddQuotePriorInfoCType trnAddQuotePriorInfo;
    @XmlElement(name = "TrnAddQuotePostInfo", required = true)
    protected TrnAddQuotePostInfoCType trnAddQuotePostInfo;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setAcctId(AcctIdType value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getAcctType() {
        return acctType;
    }

    /**
     * Sets the value of the acctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setAcctType(AcctTypeType value) {
        this.acctType = value;
    }

    /**
     * Gets the value of the trnAddQuotePriorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrnAddQuotePriorInfoCType }
     *     
     */
    public TrnAddQuotePriorInfoCType getTrnAddQuotePriorInfo() {
        return trnAddQuotePriorInfo;
    }

    /**
     * Sets the value of the trnAddQuotePriorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnAddQuotePriorInfoCType }
     *     
     */
    public void setTrnAddQuotePriorInfo(TrnAddQuotePriorInfoCType value) {
        this.trnAddQuotePriorInfo = value;
    }

    /**
     * Gets the value of the trnAddQuotePostInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrnAddQuotePostInfoCType }
     *     
     */
    public TrnAddQuotePostInfoCType getTrnAddQuotePostInfo() {
        return trnAddQuotePostInfo;
    }

    /**
     * Sets the value of the trnAddQuotePostInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrnAddQuotePostInfoCType }
     *     
     */
    public void setTrnAddQuotePostInfo(TrnAddQuotePostInfoCType value) {
        this.trnAddQuotePostInfo = value;
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
