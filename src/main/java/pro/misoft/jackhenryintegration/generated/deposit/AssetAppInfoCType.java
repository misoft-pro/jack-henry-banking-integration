
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
 * <p>Java class for AssetAppInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetAppInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssetAppType" type="{http://jackhenry.com/jxchange/TPG/2008}AssetAppType_Type" minOccurs="0"/&gt;
 *         &lt;element name="AssetAcctName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="AssetInstName" type="{http://jackhenry.com/jxchange/TPG/2008}AssetInstName_Type" minOccurs="0"/&gt;
 *         &lt;element name="AssetInstAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="AssetAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AssetDefName" type="{http://jackhenry.com/jxchange/TPG/2008}AssetDefName_Type" minOccurs="0"/&gt;
 *         &lt;element name="AssetSubjDebt" type="{http://jackhenry.com/jxchange/TPG/2008}AssetSubjDebt_Type" minOccurs="0"/&gt;
 *         &lt;element name="AssetValAmt" type="{http://jackhenry.com/jxchange/TPG/2008}AssetValAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DownPmtSrcName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="REOAppInfo" type="{http://jackhenry.com/jxchange/TPG/2008}REOAppInfo_CType" minOccurs="0"/&gt;
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
@XmlType(name = "AssetAppInfo_CType", propOrder = {
    "assetAppType",
    "assetAcctName",
    "assetInstName",
    "assetInstAddr",
    "assetAcctId",
    "assetDefName",
    "assetSubjDebt",
    "assetValAmt",
    "downPmtSrcName",
    "reoAppInfo",
    "ver1",
    "any"
})
public class AssetAppInfoCType {

    @XmlElement(name = "AssetAppType")
    protected AssetAppTypeType assetAppType;
    @XmlElement(name = "AssetAcctName")
    protected PersonNameCType assetAcctName;
    @XmlElement(name = "AssetInstName")
    protected AssetInstNameType assetInstName;
    @XmlElement(name = "AssetInstAddr")
    protected AddrCType assetInstAddr;
    @XmlElement(name = "AssetAcctId")
    protected AcctIdType assetAcctId;
    @XmlElement(name = "AssetDefName")
    protected AssetDefNameType assetDefName;
    @XmlElement(name = "AssetSubjDebt")
    protected AssetSubjDebtType assetSubjDebt;
    @XmlElement(name = "AssetValAmt")
    protected AssetValAmtType assetValAmt;
    @XmlElement(name = "DownPmtSrcName")
    protected PersonNameCType downPmtSrcName;
    @XmlElement(name = "REOAppInfo")
    protected REOAppInfoCType reoAppInfo;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the assetAppType property.
     * 
     * @return
     *     possible object is
     *     {@link AssetAppTypeType }
     *     
     */
    public AssetAppTypeType getAssetAppType() {
        return assetAppType;
    }

    /**
     * Sets the value of the assetAppType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetAppTypeType }
     *     
     */
    public void setAssetAppType(AssetAppTypeType value) {
        this.assetAppType = value;
    }

    /**
     * Gets the value of the assetAcctName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getAssetAcctName() {
        return assetAcctName;
    }

    /**
     * Sets the value of the assetAcctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setAssetAcctName(PersonNameCType value) {
        this.assetAcctName = value;
    }

    /**
     * Gets the value of the assetInstName property.
     * 
     * @return
     *     possible object is
     *     {@link AssetInstNameType }
     *     
     */
    public AssetInstNameType getAssetInstName() {
        return assetInstName;
    }

    /**
     * Sets the value of the assetInstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetInstNameType }
     *     
     */
    public void setAssetInstName(AssetInstNameType value) {
        this.assetInstName = value;
    }

    /**
     * Gets the value of the assetInstAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getAssetInstAddr() {
        return assetInstAddr;
    }

    /**
     * Sets the value of the assetInstAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setAssetInstAddr(AddrCType value) {
        this.assetInstAddr = value;
    }

    /**
     * Gets the value of the assetAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getAssetAcctId() {
        return assetAcctId;
    }

    /**
     * Sets the value of the assetAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setAssetAcctId(AcctIdType value) {
        this.assetAcctId = value;
    }

    /**
     * Gets the value of the assetDefName property.
     * 
     * @return
     *     possible object is
     *     {@link AssetDefNameType }
     *     
     */
    public AssetDefNameType getAssetDefName() {
        return assetDefName;
    }

    /**
     * Sets the value of the assetDefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetDefNameType }
     *     
     */
    public void setAssetDefName(AssetDefNameType value) {
        this.assetDefName = value;
    }

    /**
     * Gets the value of the assetSubjDebt property.
     * 
     * @return
     *     possible object is
     *     {@link AssetSubjDebtType }
     *     
     */
    public AssetSubjDebtType getAssetSubjDebt() {
        return assetSubjDebt;
    }

    /**
     * Sets the value of the assetSubjDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetSubjDebtType }
     *     
     */
    public void setAssetSubjDebt(AssetSubjDebtType value) {
        this.assetSubjDebt = value;
    }

    /**
     * Gets the value of the assetValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AssetValAmtType }
     *     
     */
    public AssetValAmtType getAssetValAmt() {
        return assetValAmt;
    }

    /**
     * Sets the value of the assetValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetValAmtType }
     *     
     */
    public void setAssetValAmt(AssetValAmtType value) {
        this.assetValAmt = value;
    }

    /**
     * Gets the value of the downPmtSrcName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getDownPmtSrcName() {
        return downPmtSrcName;
    }

    /**
     * Sets the value of the downPmtSrcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setDownPmtSrcName(PersonNameCType value) {
        this.downPmtSrcName = value;
    }

    /**
     * Gets the value of the reoAppInfo property.
     * 
     * @return
     *     possible object is
     *     {@link REOAppInfoCType }
     *     
     */
    public REOAppInfoCType getREOAppInfo() {
        return reoAppInfo;
    }

    /**
     * Sets the value of the reoAppInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link REOAppInfoCType }
     *     
     */
    public void setREOAppInfo(REOAppInfoCType value) {
        this.reoAppInfo = value;
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
