
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
 * <p>Java class for PmtRqRsInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PmtRqRsInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtRqId" type="{http://jackhenry.com/jxchange/TPG/2008}PmtId_Type"/&gt;
 *         &lt;element name="PmtRqAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PmtRqAmt_Type"/&gt;
 *         &lt;element name="PmtRqRespUsrToken" type="{http://jackhenry.com/jxchange/TPG/2008}UsrToken_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtRqRespUsrTokenType" type="{http://jackhenry.com/jxchange/TPG/2008}UsrTokenType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtRqRespStatType" type="{http://jackhenry.com/jxchange/TPG/2008}PmtRqRespStatType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "PmtRqRsInfo_CType", propOrder = {
    "pmtRqId",
    "pmtRqAmt",
    "pmtRqRespUsrToken",
    "pmtRqRespUsrTokenType",
    "pmtRqRespStatType",
    "ver1",
    "any"
})
public class PmtRqRsInfoCType {

    @XmlElement(name = "PmtRqId", required = true)
    protected PmtIdType pmtRqId;
    @XmlElement(name = "PmtRqAmt", required = true)
    protected PmtRqAmtType pmtRqAmt;
    @XmlElement(name = "PmtRqRespUsrToken")
    protected UsrTokenType pmtRqRespUsrToken;
    @XmlElement(name = "PmtRqRespUsrTokenType")
    protected UsrTokenTypeType pmtRqRespUsrTokenType;
    @XmlElement(name = "PmtRqRespStatType")
    protected PmtRqRespStatTypeType pmtRqRespStatType;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pmtRqId property.
     * 
     * @return
     *     possible object is
     *     {@link PmtIdType }
     *     
     */
    public PmtIdType getPmtRqId() {
        return pmtRqId;
    }

    /**
     * Sets the value of the pmtRqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtIdType }
     *     
     */
    public void setPmtRqId(PmtIdType value) {
        this.pmtRqId = value;
    }

    /**
     * Gets the value of the pmtRqAmt property.
     * 
     * @return
     *     possible object is
     *     {@link PmtRqAmtType }
     *     
     */
    public PmtRqAmtType getPmtRqAmt() {
        return pmtRqAmt;
    }

    /**
     * Sets the value of the pmtRqAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtRqAmtType }
     *     
     */
    public void setPmtRqAmt(PmtRqAmtType value) {
        this.pmtRqAmt = value;
    }

    /**
     * Gets the value of the pmtRqRespUsrToken property.
     * 
     * @return
     *     possible object is
     *     {@link UsrTokenType }
     *     
     */
    public UsrTokenType getPmtRqRespUsrToken() {
        return pmtRqRespUsrToken;
    }

    /**
     * Sets the value of the pmtRqRespUsrToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsrTokenType }
     *     
     */
    public void setPmtRqRespUsrToken(UsrTokenType value) {
        this.pmtRqRespUsrToken = value;
    }

    /**
     * Gets the value of the pmtRqRespUsrTokenType property.
     * 
     * @return
     *     possible object is
     *     {@link UsrTokenTypeType }
     *     
     */
    public UsrTokenTypeType getPmtRqRespUsrTokenType() {
        return pmtRqRespUsrTokenType;
    }

    /**
     * Sets the value of the pmtRqRespUsrTokenType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsrTokenTypeType }
     *     
     */
    public void setPmtRqRespUsrTokenType(UsrTokenTypeType value) {
        this.pmtRqRespUsrTokenType = value;
    }

    /**
     * Gets the value of the pmtRqRespStatType property.
     * 
     * @return
     *     possible object is
     *     {@link PmtRqRespStatTypeType }
     *     
     */
    public PmtRqRespStatTypeType getPmtRqRespStatType() {
        return pmtRqRespStatType;
    }

    /**
     * Sets the value of the pmtRqRespStatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtRqRespStatTypeType }
     *     
     */
    public void setPmtRqRespStatType(PmtRqRespStatTypeType value) {
        this.pmtRqRespStatType = value;
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
