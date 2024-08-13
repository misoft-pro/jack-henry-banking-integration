
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for TimeDepBalDtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeDepBalDtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HldAmt" type="{http://jackhenry.com/jxchange/TPG/2008}HldAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="LastMainDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastMainDt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="LastDepDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastDepDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="LastDepAmt" type="{http://jackhenry.com/jxchange/TPG/2008}LastDepAmt_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="MinBal" type="{http://jackhenry.com/jxchange/TPG/2008}MinBal_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="NetMemoPostAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NetMemoPostAmt_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="LastTrnActDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastTrnActDt_Type" minOccurs="0"/&gt;
 *                 &lt;element name="ProjCurBal" type="{http://jackhenry.com/jxchange/TPG/2008}ProjCurBal_Type" minOccurs="0"/&gt;
 *                 &lt;element name="CurQtrMinBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurQtrMinBal_Type" minOccurs="0"/&gt;
 *                 &lt;element name="CurQtrMaxBal" type="{http://jackhenry.com/jxchange/TPG/2008}CurQtrMaxBal_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/sequence&gt;
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
@XmlType(name = "TimeDepBalDtInfo_CType", propOrder = {
    "hldAmt",
    "lastMainDt",
    "ver1",
    "lastDepDt",
    "lastDepAmt",
    "ver2",
    "minBal",
    "ver3",
    "netMemoPostAmt",
    "ver4",
    "lastTrnActDt",
    "projCurBal",
    "curQtrMinBal",
    "curQtrMaxBal",
    "ver5",
    "any"
})
public class TimeDepBalDtInfoCType {

    @XmlElementRef(name = "HldAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HldAmtType> hldAmt;
    @XmlElementRef(name = "LastMainDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastMainDtType> lastMainDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "LastDepDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastDepDtType> lastDepDt;
    @XmlElementRef(name = "LastDepAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastDepAmtType> lastDepAmt;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "MinBal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MinBalType> minBal;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "NetMemoPostAmt")
    protected NetMemoPostAmtType netMemoPostAmt;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "LastTrnActDt")
    protected LastTrnActDtType lastTrnActDt;
    @XmlElement(name = "ProjCurBal")
    protected ProjCurBalType projCurBal;
    @XmlElement(name = "CurQtrMinBal")
    protected CurQtrMinBalType curQtrMinBal;
    @XmlElement(name = "CurQtrMaxBal")
    protected CurQtrMaxBalType curQtrMaxBal;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the hldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HldAmtType }{@code >}
     *     
     */
    public JAXBElement<HldAmtType> getHldAmt() {
        return hldAmt;
    }

    /**
     * Sets the value of the hldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HldAmtType }{@code >}
     *     
     */
    public void setHldAmt(JAXBElement<HldAmtType> value) {
        this.hldAmt = value;
    }

    /**
     * Gets the value of the lastMainDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastMainDtType }{@code >}
     *     
     */
    public JAXBElement<LastMainDtType> getLastMainDt() {
        return lastMainDt;
    }

    /**
     * Sets the value of the lastMainDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastMainDtType }{@code >}
     *     
     */
    public void setLastMainDt(JAXBElement<LastMainDtType> value) {
        this.lastMainDt = value;
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
     * Gets the value of the lastDepDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastDepDtType }{@code >}
     *     
     */
    public JAXBElement<LastDepDtType> getLastDepDt() {
        return lastDepDt;
    }

    /**
     * Sets the value of the lastDepDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastDepDtType }{@code >}
     *     
     */
    public void setLastDepDt(JAXBElement<LastDepDtType> value) {
        this.lastDepDt = value;
    }

    /**
     * Gets the value of the lastDepAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastDepAmtType }{@code >}
     *     
     */
    public JAXBElement<LastDepAmtType> getLastDepAmt() {
        return lastDepAmt;
    }

    /**
     * Sets the value of the lastDepAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastDepAmtType }{@code >}
     *     
     */
    public void setLastDepAmt(JAXBElement<LastDepAmtType> value) {
        this.lastDepAmt = value;
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
     * Gets the value of the minBal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MinBalType }{@code >}
     *     
     */
    public JAXBElement<MinBalType> getMinBal() {
        return minBal;
    }

    /**
     * Sets the value of the minBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MinBalType }{@code >}
     *     
     */
    public void setMinBal(JAXBElement<MinBalType> value) {
        this.minBal = value;
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
     * Gets the value of the netMemoPostAmt property.
     * 
     * @return
     *     possible object is
     *     {@link NetMemoPostAmtType }
     *     
     */
    public NetMemoPostAmtType getNetMemoPostAmt() {
        return netMemoPostAmt;
    }

    /**
     * Sets the value of the netMemoPostAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetMemoPostAmtType }
     *     
     */
    public void setNetMemoPostAmt(NetMemoPostAmtType value) {
        this.netMemoPostAmt = value;
    }

    /**
     * Gets the value of the ver4 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver4CType }
     *     
     */
    public Ver4CType getVer4() {
        return ver4;
    }

    /**
     * Sets the value of the ver4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver4CType }
     *     
     */
    public void setVer4(Ver4CType value) {
        this.ver4 = value;
    }

    /**
     * Gets the value of the lastTrnActDt property.
     * 
     * @return
     *     possible object is
     *     {@link LastTrnActDtType }
     *     
     */
    public LastTrnActDtType getLastTrnActDt() {
        return lastTrnActDt;
    }

    /**
     * Sets the value of the lastTrnActDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastTrnActDtType }
     *     
     */
    public void setLastTrnActDt(LastTrnActDtType value) {
        this.lastTrnActDt = value;
    }

    /**
     * Gets the value of the projCurBal property.
     * 
     * @return
     *     possible object is
     *     {@link ProjCurBalType }
     *     
     */
    public ProjCurBalType getProjCurBal() {
        return projCurBal;
    }

    /**
     * Sets the value of the projCurBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjCurBalType }
     *     
     */
    public void setProjCurBal(ProjCurBalType value) {
        this.projCurBal = value;
    }

    /**
     * Gets the value of the curQtrMinBal property.
     * 
     * @return
     *     possible object is
     *     {@link CurQtrMinBalType }
     *     
     */
    public CurQtrMinBalType getCurQtrMinBal() {
        return curQtrMinBal;
    }

    /**
     * Sets the value of the curQtrMinBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurQtrMinBalType }
     *     
     */
    public void setCurQtrMinBal(CurQtrMinBalType value) {
        this.curQtrMinBal = value;
    }

    /**
     * Gets the value of the curQtrMaxBal property.
     * 
     * @return
     *     possible object is
     *     {@link CurQtrMaxBalType }
     *     
     */
    public CurQtrMaxBalType getCurQtrMaxBal() {
        return curQtrMaxBal;
    }

    /**
     * Sets the value of the curQtrMaxBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurQtrMaxBalType }
     *     
     */
    public void setCurQtrMaxBal(CurQtrMaxBalType value) {
        this.curQtrMaxBal = value;
    }

    /**
     * Gets the value of the ver5 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver5CType }
     *     
     */
    public Ver5CType getVer5() {
        return ver5;
    }

    /**
     * Sets the value of the ver5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver5CType }
     *     
     */
    public void setVer5(Ver5CType value) {
        this.ver5 = value;
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
