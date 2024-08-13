
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
 * The complex describes current and previous employment
 *                 history.
 * 
 * <p>Java class for EmplInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmplInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmplName" type="{http://jackhenry.com/jxchange/TPG/2008}EmplName_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmplAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="BorwSelfEmpl" type="{http://jackhenry.com/jxchange/TPG/2008}BorwSelfEmpl_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmplTerm" type="{http://jackhenry.com/jxchange/TPG/2008}Term_CType" minOccurs="0"/&gt;
 *         &lt;element name="ProfesEmplTerm" type="{http://jackhenry.com/jxchange/TPG/2008}Term_CType" minOccurs="0"/&gt;
 *         &lt;element name="EmplTitle" type="{http://jackhenry.com/jxchange/TPG/2008}EmplTitle_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmplPhone" type="{http://jackhenry.com/jxchange/TPG/2008}PhoneInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="EmplStartDt" type="{http://jackhenry.com/jxchange/TPG/2008}EmplStartDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="EmplEndDt" type="{http://jackhenry.com/jxchange/TPG/2008}EmplEndDt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EmplPrimType" type="{http://jackhenry.com/jxchange/TPG/2008}EmplPrimType_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "EmplInfo_CType", propOrder = {
    "emplName",
    "emplAddr",
    "borwSelfEmpl",
    "emplTerm",
    "profesEmplTerm",
    "emplTitle",
    "emplPhone",
    "emplStartDt",
    "emplEndDt",
    "ver1",
    "emplPrimType",
    "ver2",
    "any"
})
public class EmplInfoCType {

    @XmlElement(name = "EmplName")
    protected EmplNameType emplName;
    @XmlElement(name = "EmplAddr")
    protected AddrCType emplAddr;
    @XmlElement(name = "BorwSelfEmpl")
    protected BorwSelfEmplType borwSelfEmpl;
    @XmlElement(name = "EmplTerm")
    protected TermCType emplTerm;
    @XmlElement(name = "ProfesEmplTerm")
    protected TermCType profesEmplTerm;
    @XmlElement(name = "EmplTitle")
    protected EmplTitleType emplTitle;
    @XmlElement(name = "EmplPhone")
    protected PhoneInfoCType emplPhone;
    @XmlElement(name = "EmplStartDt")
    protected EmplStartDtType emplStartDt;
    @XmlElement(name = "EmplEndDt")
    protected EmplEndDtType emplEndDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "EmplPrimType")
    protected EmplPrimTypeType emplPrimType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the emplName property.
     * 
     * @return
     *     possible object is
     *     {@link EmplNameType }
     *     
     */
    public EmplNameType getEmplName() {
        return emplName;
    }

    /**
     * Sets the value of the emplName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplNameType }
     *     
     */
    public void setEmplName(EmplNameType value) {
        this.emplName = value;
    }

    /**
     * Gets the value of the emplAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getEmplAddr() {
        return emplAddr;
    }

    /**
     * Sets the value of the emplAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setEmplAddr(AddrCType value) {
        this.emplAddr = value;
    }

    /**
     * Gets the value of the borwSelfEmpl property.
     * 
     * @return
     *     possible object is
     *     {@link BorwSelfEmplType }
     *     
     */
    public BorwSelfEmplType getBorwSelfEmpl() {
        return borwSelfEmpl;
    }

    /**
     * Sets the value of the borwSelfEmpl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorwSelfEmplType }
     *     
     */
    public void setBorwSelfEmpl(BorwSelfEmplType value) {
        this.borwSelfEmpl = value;
    }

    /**
     * Gets the value of the emplTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TermCType }
     *     
     */
    public TermCType getEmplTerm() {
        return emplTerm;
    }

    /**
     * Sets the value of the emplTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCType }
     *     
     */
    public void setEmplTerm(TermCType value) {
        this.emplTerm = value;
    }

    /**
     * Gets the value of the profesEmplTerm property.
     * 
     * @return
     *     possible object is
     *     {@link TermCType }
     *     
     */
    public TermCType getProfesEmplTerm() {
        return profesEmplTerm;
    }

    /**
     * Sets the value of the profesEmplTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCType }
     *     
     */
    public void setProfesEmplTerm(TermCType value) {
        this.profesEmplTerm = value;
    }

    /**
     * Gets the value of the emplTitle property.
     * 
     * @return
     *     possible object is
     *     {@link EmplTitleType }
     *     
     */
    public EmplTitleType getEmplTitle() {
        return emplTitle;
    }

    /**
     * Sets the value of the emplTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplTitleType }
     *     
     */
    public void setEmplTitle(EmplTitleType value) {
        this.emplTitle = value;
    }

    /**
     * Gets the value of the emplPhone property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneInfoCType }
     *     
     */
    public PhoneInfoCType getEmplPhone() {
        return emplPhone;
    }

    /**
     * Sets the value of the emplPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneInfoCType }
     *     
     */
    public void setEmplPhone(PhoneInfoCType value) {
        this.emplPhone = value;
    }

    /**
     * Gets the value of the emplStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link EmplStartDtType }
     *     
     */
    public EmplStartDtType getEmplStartDt() {
        return emplStartDt;
    }

    /**
     * Sets the value of the emplStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplStartDtType }
     *     
     */
    public void setEmplStartDt(EmplStartDtType value) {
        this.emplStartDt = value;
    }

    /**
     * Gets the value of the emplEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link EmplEndDtType }
     *     
     */
    public EmplEndDtType getEmplEndDt() {
        return emplEndDt;
    }

    /**
     * Sets the value of the emplEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplEndDtType }
     *     
     */
    public void setEmplEndDt(EmplEndDtType value) {
        this.emplEndDt = value;
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
     * Gets the value of the emplPrimType property.
     * 
     * @return
     *     possible object is
     *     {@link EmplPrimTypeType }
     *     
     */
    public EmplPrimTypeType getEmplPrimType() {
        return emplPrimType;
    }

    /**
     * Sets the value of the emplPrimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplPrimTypeType }
     *     
     */
    public void setEmplPrimType(EmplPrimTypeType value) {
        this.emplPrimType = value;
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
