
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
 * <p>Java class for WireTmpltInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireTmpltInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WireTrnInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}WireTrnInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://jackhenry.com/jxchange/TPG/2008}CustId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireAcctType" type="{http://jackhenry.com/jxchange/TPG/2008}AcctType_Type" minOccurs="0"/&gt;
 *         &lt;element name="OffDesc" type="{http://jackhenry.com/jxchange/TPG/2008}OffDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireAnlysDesc" type="{http://jackhenry.com/jxchange/TPG/2008}WireAnlysDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}WireStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="WireXferTypeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}WireXferTypeDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "WireTmpltInqRec_CType", propOrder = {
    "wireTrnInfoRec",
    "custId",
    "wireAcctId",
    "wireAcctType",
    "offDesc",
    "wireAnlysDesc",
    "wireStatDesc",
    "brDesc",
    "glProdDesc",
    "wireXferTypeDesc",
    "ver1",
    "any"
})
public class WireTmpltInqRecCType {

    @XmlElement(name = "WireTrnInfoRec")
    protected WireTrnInfoRecCType wireTrnInfoRec;
    @XmlElement(name = "CustId")
    protected CustIdType custId;
    @XmlElement(name = "WireAcctId")
    protected AcctIdType wireAcctId;
    @XmlElement(name = "WireAcctType")
    protected AcctTypeType wireAcctType;
    @XmlElement(name = "OffDesc")
    protected OffDescType offDesc;
    @XmlElement(name = "WireAnlysDesc")
    protected WireAnlysDescType wireAnlysDesc;
    @XmlElement(name = "WireStatDesc")
    protected WireStatDescType wireStatDesc;
    @XmlElement(name = "BrDesc")
    protected BrDescType brDesc;
    @XmlElement(name = "GLProdDesc")
    protected GLProdDescType glProdDesc;
    @XmlElement(name = "WireXferTypeDesc")
    protected WireXferTypeDescType wireXferTypeDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the wireTrnInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link WireTrnInfoRecCType }
     *     
     */
    public WireTrnInfoRecCType getWireTrnInfoRec() {
        return wireTrnInfoRec;
    }

    /**
     * Sets the value of the wireTrnInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireTrnInfoRecCType }
     *     
     */
    public void setWireTrnInfoRec(WireTrnInfoRecCType value) {
        this.wireTrnInfoRec = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link CustIdType }
     *     
     */
    public CustIdType getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustIdType }
     *     
     */
    public void setCustId(CustIdType value) {
        this.custId = value;
    }

    /**
     * Gets the value of the wireAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AcctIdType }
     *     
     */
    public AcctIdType getWireAcctId() {
        return wireAcctId;
    }

    /**
     * Sets the value of the wireAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctIdType }
     *     
     */
    public void setWireAcctId(AcctIdType value) {
        this.wireAcctId = value;
    }

    /**
     * Gets the value of the wireAcctType property.
     * 
     * @return
     *     possible object is
     *     {@link AcctTypeType }
     *     
     */
    public AcctTypeType getWireAcctType() {
        return wireAcctType;
    }

    /**
     * Sets the value of the wireAcctType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctTypeType }
     *     
     */
    public void setWireAcctType(AcctTypeType value) {
        this.wireAcctType = value;
    }

    /**
     * Gets the value of the offDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OffDescType }
     *     
     */
    public OffDescType getOffDesc() {
        return offDesc;
    }

    /**
     * Sets the value of the offDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffDescType }
     *     
     */
    public void setOffDesc(OffDescType value) {
        this.offDesc = value;
    }

    /**
     * Gets the value of the wireAnlysDesc property.
     * 
     * @return
     *     possible object is
     *     {@link WireAnlysDescType }
     *     
     */
    public WireAnlysDescType getWireAnlysDesc() {
        return wireAnlysDesc;
    }

    /**
     * Sets the value of the wireAnlysDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireAnlysDescType }
     *     
     */
    public void setWireAnlysDesc(WireAnlysDescType value) {
        this.wireAnlysDesc = value;
    }

    /**
     * Gets the value of the wireStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link WireStatDescType }
     *     
     */
    public WireStatDescType getWireStatDesc() {
        return wireStatDesc;
    }

    /**
     * Sets the value of the wireStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireStatDescType }
     *     
     */
    public void setWireStatDesc(WireStatDescType value) {
        this.wireStatDesc = value;
    }

    /**
     * Gets the value of the brDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrDescType }
     *     
     */
    public BrDescType getBrDesc() {
        return brDesc;
    }

    /**
     * Sets the value of the brDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrDescType }
     *     
     */
    public void setBrDesc(BrDescType value) {
        this.brDesc = value;
    }

    /**
     * Gets the value of the glProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link GLProdDescType }
     *     
     */
    public GLProdDescType getGLProdDesc() {
        return glProdDesc;
    }

    /**
     * Sets the value of the glProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLProdDescType }
     *     
     */
    public void setGLProdDesc(GLProdDescType value) {
        this.glProdDesc = value;
    }

    /**
     * Gets the value of the wireXferTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link WireXferTypeDescType }
     *     
     */
    public WireXferTypeDescType getWireXferTypeDesc() {
        return wireXferTypeDesc;
    }

    /**
     * Sets the value of the wireXferTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireXferTypeDescType }
     *     
     */
    public void setWireXferTypeDesc(WireXferTypeDescType value) {
        this.wireXferTypeDesc = value;
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
