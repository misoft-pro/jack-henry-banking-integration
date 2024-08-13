
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
 * <p>Java class for PlnAcctSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlnAcctSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlnAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}PlnAcctid_Type" minOccurs="0"/&gt;
 *         &lt;element name="PlnAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}PlnAcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurBal_Type" minOccurs="0"/&gt;
 *         &lt;element name="AccrInt" type="{http://jackhenry.com/jxchange/TPG/2008}AccrInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="YTDInt" type="{http://jackhenry.com/jxchange/TPG/2008}YTDInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OpenDt" type="{http://jackhenry.com/jxchange/TPG/2008}OpenDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="MatDt" type="{http://jackhenry.com/jxchange/TPG/2008}MatDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IntRate" type="{http://jackhenry.com/jxchange/TPG/2008}IntRate_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomPlnAcctSrch" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "PlnAcctSrchRec_CType", propOrder = {
    "plnAcctId",
    "plnAcctType",
    "prodCode",
    "prodDesc",
    "curBal",
    "accrInt",
    "ytdInt",
    "openDt",
    "matDt",
    "intRate",
    "customPlnAcctSrch",
    "ver1",
    "any"
})
public class PlnAcctSrchRecCType {

    @XmlElement(name = "PlnAcctId")
    protected PlnAcctidType plnAcctId;
    @XmlElement(name = "PlnAcctType")
    protected PlnAcctTypeType plnAcctType;
    @XmlElement(name = "ProdCode")
    protected ProdCodeType prodCode;
    @XmlElement(name = "ProdDesc")
    protected ProdDescType prodDesc;
    @XmlElement(name = "CurBal")
    protected CurBalType curBal;
    @XmlElement(name = "AccrInt")
    protected AccrIntType accrInt;
    @XmlElement(name = "YTDInt")
    protected YTDIntType ytdInt;
    @XmlElement(name = "OpenDt")
    protected OpenDtType openDt;
    @XmlElement(name = "MatDt")
    protected MatDtType matDt;
    @XmlElement(name = "IntRate")
    protected IntRateType intRate;
    @XmlElement(name = "CustomPlnAcctSrch")
    protected CustomCType customPlnAcctSrch;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the plnAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link PlnAcctidType }
     *     
     */
    public PlnAcctidType getPlnAcctId() {
        return plnAcctId;
    }

    /**
     * Sets the value of the plnAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnAcctidType }
     *     
     */
    public void setPlnAcctId(PlnAcctidType value) {
        this.plnAcctId = value;
    }

    /**
     * Gets the value of the plnAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link PlnAcctTypeType }
     *     
     */
    public PlnAcctTypeType getPlnAcctType() {
        return plnAcctType;
    }

    /**
     * Sets the value of the plnAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlnAcctTypeType }
     *     
     */
    public void setPlnAcctType(PlnAcctTypeType value) {
        this.plnAcctType = value;
    }

    /**
     * Gets the value of the prodCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProdCodeType }
     *     
     */
    public ProdCodeType getProdCode() {
        return prodCode;
    }

    /**
     * Sets the value of the prodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdCodeType }
     *     
     */
    public void setProdCode(ProdCodeType value) {
        this.prodCode = value;
    }

    /**
     * Gets the value of the prodDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ProdDescType }
     *     
     */
    public ProdDescType getProdDesc() {
        return prodDesc;
    }

    /**
     * Sets the value of the prodDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdDescType }
     *     
     */
    public void setProdDesc(ProdDescType value) {
        this.prodDesc = value;
    }

    /**
     * Gets the value of the curBal property.
     * 
     * @return
     *     possible object is
     *     {@link CurBalType }
     *     
     */
    public CurBalType getCurBal() {
        return curBal;
    }

    /**
     * Sets the value of the curBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurBalType }
     *     
     */
    public void setCurBal(CurBalType value) {
        this.curBal = value;
    }

    /**
     * Gets the value of the accrInt property.
     * 
     * @return
     *     possible object is
     *     {@link AccrIntType }
     *     
     */
    public AccrIntType getAccrInt() {
        return accrInt;
    }

    /**
     * Sets the value of the accrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccrIntType }
     *     
     */
    public void setAccrInt(AccrIntType value) {
        this.accrInt = value;
    }

    /**
     * Gets the value of the ytdInt property.
     * 
     * @return
     *     possible object is
     *     {@link YTDIntType }
     *     
     */
    public YTDIntType getYTDInt() {
        return ytdInt;
    }

    /**
     * Sets the value of the ytdInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link YTDIntType }
     *     
     */
    public void setYTDInt(YTDIntType value) {
        this.ytdInt = value;
    }

    /**
     * Gets the value of the openDt property.
     * 
     * @return
     *     possible object is
     *     {@link OpenDtType }
     *     
     */
    public OpenDtType getOpenDt() {
        return openDt;
    }

    /**
     * Sets the value of the openDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenDtType }
     *     
     */
    public void setOpenDt(OpenDtType value) {
        this.openDt = value;
    }

    /**
     * Gets the value of the matDt property.
     * 
     * @return
     *     possible object is
     *     {@link MatDtType }
     *     
     */
    public MatDtType getMatDt() {
        return matDt;
    }

    /**
     * Sets the value of the matDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatDtType }
     *     
     */
    public void setMatDt(MatDtType value) {
        this.matDt = value;
    }

    /**
     * Gets the value of the intRate property.
     * 
     * @return
     *     possible object is
     *     {@link IntRateType }
     *     
     */
    public IntRateType getIntRate() {
        return intRate;
    }

    /**
     * Sets the value of the intRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntRateType }
     *     
     */
    public void setIntRate(IntRateType value) {
        this.intRate = value;
    }

    /**
     * Gets the value of the customPlnAcctSrch property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomPlnAcctSrch() {
        return customPlnAcctSrch;
    }

    /**
     * Sets the value of the customPlnAcctSrch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomPlnAcctSrch(CustomCType value) {
        this.customPlnAcctSrch = value;
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
