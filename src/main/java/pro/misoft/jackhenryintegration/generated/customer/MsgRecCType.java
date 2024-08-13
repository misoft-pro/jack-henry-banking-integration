
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
 * Message Record includes the Error responses - Usually
 *                 can occur multiple times
 * 
 * <p>Java class for MsgRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrCode" type="{http://jackhenry.com/jxchange/TPG/2008}ErrCode_Type"/&gt;
 *         &lt;element name="ErrCat" type="{http://jackhenry.com/jxchange/TPG/2008}ErrCat_Type"/&gt;
 *         &lt;element name="ErrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ErrDesc_Type"/&gt;
 *         &lt;element name="ErrElem" type="{http://jackhenry.com/jxchange/TPG/2008}ErrElem_Type" minOccurs="0"/&gt;
 *         &lt;element name="ErrElemVal" type="{http://jackhenry.com/jxchange/TPG/2008}ErrElemVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="ErrLoc" type="{http://jackhenry.com/jxchange/TPG/2008}ErrLoc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "MsgRec_CType", propOrder = {
    "errCode",
    "errCat",
    "errDesc",
    "errElem",
    "errElemVal",
    "errLoc",
    "ver1",
    "any"
})
public class MsgRecCType {

    @XmlElement(name = "ErrCode", required = true)
    protected ErrCodeType errCode;
    @XmlElement(name = "ErrCat", required = true)
    protected ErrCatType errCat;
    @XmlElement(name = "ErrDesc", required = true)
    protected ErrDescType errDesc;
    @XmlElement(name = "ErrElem")
    protected ErrElemType errElem;
    @XmlElement(name = "ErrElemVal")
    protected ErrElemValType errElemVal;
    @XmlElement(name = "ErrLoc")
    protected ErrLocType errLoc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the errCode property.
     * 
     * @return
     *     possible object is
     *     {@link ErrCodeType }
     *     
     */
    public ErrCodeType getErrCode() {
        return errCode;
    }

    /**
     * Sets the value of the errCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrCodeType }
     *     
     */
    public void setErrCode(ErrCodeType value) {
        this.errCode = value;
    }

    /**
     * Gets the value of the errCat property.
     * 
     * @return
     *     possible object is
     *     {@link ErrCatType }
     *     
     */
    public ErrCatType getErrCat() {
        return errCat;
    }

    /**
     * Sets the value of the errCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrCatType }
     *     
     */
    public void setErrCat(ErrCatType value) {
        this.errCat = value;
    }

    /**
     * Gets the value of the errDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ErrDescType }
     *     
     */
    public ErrDescType getErrDesc() {
        return errDesc;
    }

    /**
     * Sets the value of the errDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrDescType }
     *     
     */
    public void setErrDesc(ErrDescType value) {
        this.errDesc = value;
    }

    /**
     * Gets the value of the errElem property.
     * 
     * @return
     *     possible object is
     *     {@link ErrElemType }
     *     
     */
    public ErrElemType getErrElem() {
        return errElem;
    }

    /**
     * Sets the value of the errElem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrElemType }
     *     
     */
    public void setErrElem(ErrElemType value) {
        this.errElem = value;
    }

    /**
     * Gets the value of the errElemVal property.
     * 
     * @return
     *     possible object is
     *     {@link ErrElemValType }
     *     
     */
    public ErrElemValType getErrElemVal() {
        return errElemVal;
    }

    /**
     * Sets the value of the errElemVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrElemValType }
     *     
     */
    public void setErrElemVal(ErrElemValType value) {
        this.errElemVal = value;
    }

    /**
     * Gets the value of the errLoc property.
     * 
     * @return
     *     possible object is
     *     {@link ErrLocType }
     *     
     */
    public ErrLocType getErrLoc() {
        return errLoc;
    }

    /**
     * Sets the value of the errLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrLocType }
     *     
     */
    public void setErrLoc(ErrLocType value) {
        this.errLoc = value;
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
