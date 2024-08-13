
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
 * <p>Java class for x_LnBalDtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_LnBalDtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnBalDtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnBalDtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="EscrwCurBal" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwCurBal_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="YestBal" type="{http://jackhenry.com/jxchange/TPG/2008}YestBal_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="NetLnAccrIntBal" type="{http://jackhenry.com/jxchange/TPG/2008}NetLnAccrIntBal_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;element name="NetLnBal" type="{http://jackhenry.com/jxchange/TPG/2008}NetLnBal_Type" minOccurs="0"/&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="Ver_5" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_5_CType"/&gt;
 *                   &lt;element name="NetCurBal" type="{http://jackhenry.com/jxchange/TPG/2008}NetCurBal_Type" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="Ver_6" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_6_CType"/&gt;
 *                     &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
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
@XmlType(name = "x_LnBalDtInfo_CType", propOrder = {
    "lnBalDtInfo",
    "custom",
    "ver1",
    "escrwCurBal",
    "ver2",
    "yestBal",
    "ver3",
    "netLnAccrIntBal",
    "ver4",
    "netLnBal",
    "ver5",
    "netCurBal",
    "ver6",
    "any"
})
public class XLnBalDtInfoCType {

    @XmlElement(name = "LnBalDtInfo")
    protected LnBalDtInfoCType lnBalDtInfo;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "EscrwCurBal")
    protected EscrwCurBalType escrwCurBal;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "YestBal")
    protected YestBalType yestBal;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "NetLnAccrIntBal")
    protected NetLnAccrIntBalType netLnAccrIntBal;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlElement(name = "NetLnBal")
    protected NetLnBalType netLnBal;
    @XmlElement(name = "Ver_5")
    protected Ver5CType ver5;
    @XmlElement(name = "NetCurBal")
    protected NetCurBalType netCurBal;
    @XmlElement(name = "Ver_6")
    protected Ver6CType ver6;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnBalDtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnBalDtInfoCType }
     *     
     */
    public LnBalDtInfoCType getLnBalDtInfo() {
        return lnBalDtInfo;
    }

    /**
     * Sets the value of the lnBalDtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnBalDtInfoCType }
     *     
     */
    public void setLnBalDtInfo(LnBalDtInfoCType value) {
        this.lnBalDtInfo = value;
    }

    /**
     * Gets the value of the custom property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustom() {
        return custom;
    }

    /**
     * Sets the value of the custom property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustom(CustomCType value) {
        this.custom = value;
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
     * Gets the value of the escrwCurBal property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwCurBalType }
     *     
     */
    public EscrwCurBalType getEscrwCurBal() {
        return escrwCurBal;
    }

    /**
     * Sets the value of the escrwCurBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwCurBalType }
     *     
     */
    public void setEscrwCurBal(EscrwCurBalType value) {
        this.escrwCurBal = value;
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
     * Gets the value of the yestBal property.
     * 
     * @return
     *     possible object is
     *     {@link YestBalType }
     *     
     */
    public YestBalType getYestBal() {
        return yestBal;
    }

    /**
     * Sets the value of the yestBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link YestBalType }
     *     
     */
    public void setYestBal(YestBalType value) {
        this.yestBal = value;
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
     * Gets the value of the netLnAccrIntBal property.
     * 
     * @return
     *     possible object is
     *     {@link NetLnAccrIntBalType }
     *     
     */
    public NetLnAccrIntBalType getNetLnAccrIntBal() {
        return netLnAccrIntBal;
    }

    /**
     * Sets the value of the netLnAccrIntBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetLnAccrIntBalType }
     *     
     */
    public void setNetLnAccrIntBal(NetLnAccrIntBalType value) {
        this.netLnAccrIntBal = value;
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
     * Gets the value of the netLnBal property.
     * 
     * @return
     *     possible object is
     *     {@link NetLnBalType }
     *     
     */
    public NetLnBalType getNetLnBal() {
        return netLnBal;
    }

    /**
     * Sets the value of the netLnBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetLnBalType }
     *     
     */
    public void setNetLnBal(NetLnBalType value) {
        this.netLnBal = value;
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
     * Gets the value of the netCurBal property.
     * 
     * @return
     *     possible object is
     *     {@link NetCurBalType }
     *     
     */
    public NetCurBalType getNetCurBal() {
        return netCurBal;
    }

    /**
     * Sets the value of the netCurBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetCurBalType }
     *     
     */
    public void setNetCurBal(NetCurBalType value) {
        this.netCurBal = value;
    }

    /**
     * Gets the value of the ver6 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver6CType }
     *     
     */
    public Ver6CType getVer6() {
        return ver6;
    }

    /**
     * Sets the value of the ver6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver6CType }
     *     
     */
    public void setVer6(Ver6CType value) {
        this.ver6 = value;
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
