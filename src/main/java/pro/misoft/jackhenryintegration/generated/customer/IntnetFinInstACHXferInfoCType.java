
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
 * <p>Java class for IntnetFinInstACHXferInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntnetFinInstACHXferInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACHDrName" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHDrRtNum" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrRtNum_Type" minOccurs="0"/&gt;
 *         &lt;element name="FinInstDrName" type="{http://jackhenry.com/jxchange/TPG/2008}FinInstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHDrAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrAcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="ACHDrAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}ACHDrAcctType_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AccessAlw" type="{http://jackhenry.com/jxchange/TPG/2008}AccessAlw_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="AliasAcctName" type="{http://jackhenry.com/jxchange/TPG/2008}AliasAcctName_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
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
@XmlType(name = "IntnetFinInstACHXferInfo_CType", propOrder = {
    "achDrName",
    "achDrRtNum",
    "finInstDrName",
    "achDrAcctId",
    "achDrAcctType",
    "ver1",
    "accessAlw",
    "ver2",
    "aliasAcctName",
    "ver3",
    "any"
})
public class IntnetFinInstACHXferInfoCType {

    @XmlElement(name = "ACHDrName")
    protected ACHDrNameType achDrName;
    @XmlElement(name = "ACHDrRtNum")
    protected ACHDrRtNumType achDrRtNum;
    @XmlElement(name = "FinInstDrName")
    protected FinInstNameType finInstDrName;
    @XmlElement(name = "ACHDrAcctId")
    protected ACHDrAcctIdType achDrAcctId;
    @XmlElement(name = "ACHDrAcctType")
    protected ACHDrAcctTypeType achDrAcctType;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AccessAlw")
    protected AccessAlwType accessAlw;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "AliasAcctName")
    protected AliasAcctNameType aliasAcctName;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the achDrName property.
     * 
     * @return
     *     possible object is
     *     {@link ACHDrNameType }
     *     
     */
    public ACHDrNameType getACHDrName() {
        return achDrName;
    }

    /**
     * Sets the value of the achDrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHDrNameType }
     *     
     */
    public void setACHDrName(ACHDrNameType value) {
        this.achDrName = value;
    }

    /**
     * Gets the value of the achDrRtNum property.
     * 
     * @return
     *     possible object is
     *     {@link ACHDrRtNumType }
     *     
     */
    public ACHDrRtNumType getACHDrRtNum() {
        return achDrRtNum;
    }

    /**
     * Sets the value of the achDrRtNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHDrRtNumType }
     *     
     */
    public void setACHDrRtNum(ACHDrRtNumType value) {
        this.achDrRtNum = value;
    }

    /**
     * Gets the value of the finInstDrName property.
     * 
     * @return
     *     possible object is
     *     {@link FinInstNameType }
     *     
     */
    public FinInstNameType getFinInstDrName() {
        return finInstDrName;
    }

    /**
     * Sets the value of the finInstDrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinInstNameType }
     *     
     */
    public void setFinInstDrName(FinInstNameType value) {
        this.finInstDrName = value;
    }

    /**
     * Gets the value of the achDrAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link ACHDrAcctIdType }
     *     
     */
    public ACHDrAcctIdType getACHDrAcctId() {
        return achDrAcctId;
    }

    /**
     * Sets the value of the achDrAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHDrAcctIdType }
     *     
     */
    public void setACHDrAcctId(ACHDrAcctIdType value) {
        this.achDrAcctId = value;
    }

    /**
     * Gets the value of the achDrAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link ACHDrAcctTypeType }
     *     
     */
    public ACHDrAcctTypeType getACHDrAcctType() {
        return achDrAcctType;
    }

    /**
     * Sets the value of the achDrAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACHDrAcctTypeType }
     *     
     */
    public void setACHDrAcctType(ACHDrAcctTypeType value) {
        this.achDrAcctType = value;
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
     * Gets the value of the accessAlw property.
     * 
     * @return
     *     possible object is
     *     {@link AccessAlwType }
     *     
     */
    public AccessAlwType getAccessAlw() {
        return accessAlw;
    }

    /**
     * Sets the value of the accessAlw property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessAlwType }
     *     
     */
    public void setAccessAlw(AccessAlwType value) {
        this.accessAlw = value;
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
     * Gets the value of the aliasAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link AliasAcctNameType }
     *     
     */
    public AliasAcctNameType getAliasAcctName() {
        return aliasAcctName;
    }

    /**
     * Sets the value of the aliasAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasAcctNameType }
     *     
     */
    public void setAliasAcctName(AliasAcctNameType value) {
        this.aliasAcctName = value;
    }

    /**
     * Gets the value of the ver3 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver3CType }
     *     
     */
    public Ver3CType getVer3() {
        return ver3;
    }

    /**
     * Sets the value of the ver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver3CType }
     *     
     */
    public void setVer3(Ver3CType value) {
        this.ver3 = value;
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
