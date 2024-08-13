
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
 * <p>Java class for ConstInProcSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstInProcSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BdgCode" type="{http://jackhenry.com/jxchange/TPG/2008}BdgCode_Type"/&gt;
 *         &lt;element name="BdgDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BdgDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CurBdgAmt" type="{http://jackhenry.com/jxchange/TPG/2008}CurBdgAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="BdgDisbAmt" type="{http://jackhenry.com/jxchange/TPG/2008}BdgDisbAmt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ConstInProcSrchRec_CType", propOrder = {
    "bdgCode",
    "bdgDesc",
    "curBdgAmt",
    "bdgDisbAmt",
    "ver1",
    "any"
})
public class ConstInProcSrchRecCType {

    @XmlElement(name = "BdgCode", required = true)
    protected BdgCodeType bdgCode;
    @XmlElement(name = "BdgDesc")
    protected BdgDescType bdgDesc;
    @XmlElement(name = "CurBdgAmt")
    protected CurBdgAmtType curBdgAmt;
    @XmlElement(name = "BdgDisbAmt")
    protected BdgDisbAmtType bdgDisbAmt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the bdgCode property.
     * 
     * @return
     *     possible object is
     *     {@link BdgCodeType }
     *     
     */
    public BdgCodeType getBdgCode() {
        return bdgCode;
    }

    /**
     * Sets the value of the bdgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BdgCodeType }
     *     
     */
    public void setBdgCode(BdgCodeType value) {
        this.bdgCode = value;
    }

    /**
     * Gets the value of the bdgDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BdgDescType }
     *     
     */
    public BdgDescType getBdgDesc() {
        return bdgDesc;
    }

    /**
     * Sets the value of the bdgDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BdgDescType }
     *     
     */
    public void setBdgDesc(BdgDescType value) {
        this.bdgDesc = value;
    }

    /**
     * Gets the value of the curBdgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurBdgAmtType }
     *     
     */
    public CurBdgAmtType getCurBdgAmt() {
        return curBdgAmt;
    }

    /**
     * Sets the value of the curBdgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurBdgAmtType }
     *     
     */
    public void setCurBdgAmt(CurBdgAmtType value) {
        this.curBdgAmt = value;
    }

    /**
     * Gets the value of the bdgDisbAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BdgDisbAmtType }
     *     
     */
    public BdgDisbAmtType getBdgDisbAmt() {
        return bdgDisbAmt;
    }

    /**
     * Sets the value of the bdgDisbAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BdgDisbAmtType }
     *     
     */
    public void setBdgDisbAmt(BdgDisbAmtType value) {
        this.bdgDisbAmt = value;
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
