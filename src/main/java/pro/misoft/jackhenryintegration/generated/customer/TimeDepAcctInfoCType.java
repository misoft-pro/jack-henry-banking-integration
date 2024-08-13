
package pro.misoft.jackhenryintegration.generated.customer;

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
 * <p>Java class for TimeDepAcctInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeDepAcctInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HldMailCode" type="{http://jackhenry.com/jxchange/TPG/2008}HldMailCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="RepoBlkId" type="{http://jackhenry.com/jxchange/TPG/2008}RepoBlkId_Type" minOccurs="0"/&gt;
 *         &lt;element name="AcctLvlSecCode" type="{http://jackhenry.com/jxchange/TPG/2008}AcctLvlSecCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="SrcFundsCode" type="{http://jackhenry.com/jxchange/TPG/2008}SrcFundsCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PenCode" type="{http://jackhenry.com/jxchange/TPG/2008}PenCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="PaperLessCode" type="{http://jackhenry.com/jxchange/TPG/2008}PaperLessCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="UserDefInfoArray" type="{http://jackhenry.com/jxchange/TPG/2008}UserDefInfoArray_AType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PrtIntNotCode" type="{http://jackhenry.com/jxchange/TPG/2008}PrtIntNotCode_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="LangType" type="{http://jackhenry.com/jxchange/TPG/2008}LangType_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="EstbPersonName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *               &lt;element name="EstbPersonTitle" type="{http://jackhenry.com/jxchange/TPG/2008}EmplTitle_Type" minOccurs="0"/&gt;
 *               &lt;sequence minOccurs="0"&gt;
 *                 &lt;element name="Ver_4" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_4_CType"/&gt;
 *                 &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TimeDepAcctInfo_CType", propOrder = {
    "hldMailCode",
    "repoBlkId",
    "acctLvlSecCode",
    "srcFundsCode",
    "penCode",
    "paperLessCode",
    "userDefInfoArray",
    "ver1",
    "prtIntNotCode",
    "ver2",
    "langType",
    "ver3",
    "estbPersonName",
    "estbPersonTitle",
    "ver4",
    "any"
})
public class TimeDepAcctInfoCType {

    @XmlElementRef(name = "HldMailCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<HldMailCodeType> hldMailCode;
    @XmlElementRef(name = "RepoBlkId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<RepoBlkIdType> repoBlkId;
    @XmlElementRef(name = "AcctLvlSecCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<AcctLvlSecCodeType> acctLvlSecCode;
    @XmlElementRef(name = "SrcFundsCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<SrcFundsCodeType> srcFundsCode;
    @XmlElementRef(name = "PenCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PenCodeType> penCode;
    @XmlElementRef(name = "PaperLessCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PaperLessCodeType> paperLessCode;
    @XmlElement(name = "UserDefInfoArray")
    protected UserDefInfoArrayAType userDefInfoArray;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "PrtIntNotCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<PrtIntNotCodeType> prtIntNotCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "LangType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LangTypeType> langType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "EstbPersonName")
    protected PersonNameCType estbPersonName;
    @XmlElement(name = "EstbPersonTitle")
    protected EmplTitleType estbPersonTitle;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the hldMailCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HldMailCodeType }{@code >}
     *     
     */
    public JAXBElement<HldMailCodeType> getHldMailCode() {
        return hldMailCode;
    }

    /**
     * Sets the value of the hldMailCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HldMailCodeType }{@code >}
     *     
     */
    public void setHldMailCode(JAXBElement<HldMailCodeType> value) {
        this.hldMailCode = value;
    }

    /**
     * Gets the value of the repoBlkId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RepoBlkIdType }{@code >}
     *     
     */
    public JAXBElement<RepoBlkIdType> getRepoBlkId() {
        return repoBlkId;
    }

    /**
     * Sets the value of the repoBlkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RepoBlkIdType }{@code >}
     *     
     */
    public void setRepoBlkId(JAXBElement<RepoBlkIdType> value) {
        this.repoBlkId = value;
    }

    /**
     * Gets the value of the acctLvlSecCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcctLvlSecCodeType }{@code >}
     *     
     */
    public JAXBElement<AcctLvlSecCodeType> getAcctLvlSecCode() {
        return acctLvlSecCode;
    }

    /**
     * Sets the value of the acctLvlSecCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcctLvlSecCodeType }{@code >}
     *     
     */
    public void setAcctLvlSecCode(JAXBElement<AcctLvlSecCodeType> value) {
        this.acctLvlSecCode = value;
    }

    /**
     * Gets the value of the srcFundsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SrcFundsCodeType }{@code >}
     *     
     */
    public JAXBElement<SrcFundsCodeType> getSrcFundsCode() {
        return srcFundsCode;
    }

    /**
     * Sets the value of the srcFundsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SrcFundsCodeType }{@code >}
     *     
     */
    public void setSrcFundsCode(JAXBElement<SrcFundsCodeType> value) {
        this.srcFundsCode = value;
    }

    /**
     * Gets the value of the penCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PenCodeType }{@code >}
     *     
     */
    public JAXBElement<PenCodeType> getPenCode() {
        return penCode;
    }

    /**
     * Sets the value of the penCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PenCodeType }{@code >}
     *     
     */
    public void setPenCode(JAXBElement<PenCodeType> value) {
        this.penCode = value;
    }

    /**
     * Gets the value of the paperLessCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PaperLessCodeType }{@code >}
     *     
     */
    public JAXBElement<PaperLessCodeType> getPaperLessCode() {
        return paperLessCode;
    }

    /**
     * Sets the value of the paperLessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PaperLessCodeType }{@code >}
     *     
     */
    public void setPaperLessCode(JAXBElement<PaperLessCodeType> value) {
        this.paperLessCode = value;
    }

    /**
     * Gets the value of the userDefInfoArray property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public UserDefInfoArrayAType getUserDefInfoArray() {
        return userDefInfoArray;
    }

    /**
     * Sets the value of the userDefInfoArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefInfoArrayAType }
     *     
     */
    public void setUserDefInfoArray(UserDefInfoArrayAType value) {
        this.userDefInfoArray = value;
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
     * Gets the value of the prtIntNotCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrtIntNotCodeType }{@code >}
     *     
     */
    public JAXBElement<PrtIntNotCodeType> getPrtIntNotCode() {
        return prtIntNotCode;
    }

    /**
     * Sets the value of the prtIntNotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrtIntNotCodeType }{@code >}
     *     
     */
    public void setPrtIntNotCode(JAXBElement<PrtIntNotCodeType> value) {
        this.prtIntNotCode = value;
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
     * Gets the value of the langType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LangTypeType }{@code >}
     *     
     */
    public JAXBElement<LangTypeType> getLangType() {
        return langType;
    }

    /**
     * Sets the value of the langType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LangTypeType }{@code >}
     *     
     */
    public void setLangType(JAXBElement<LangTypeType> value) {
        this.langType = value;
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
     * Gets the value of the estbPersonName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameCType }
     *     
     */
    public PersonNameCType getEstbPersonName() {
        return estbPersonName;
    }

    /**
     * Sets the value of the estbPersonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameCType }
     *     
     */
    public void setEstbPersonName(PersonNameCType value) {
        this.estbPersonName = value;
    }

    /**
     * Gets the value of the estbPersonTitle property.
     * 
     * @return
     *     possible object is
     *     {@link EmplTitleType }
     *     
     */
    public EmplTitleType getEstbPersonTitle() {
        return estbPersonTitle;
    }

    /**
     * Sets the value of the estbPersonTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmplTitleType }
     *     
     */
    public void setEstbPersonTitle(EmplTitleType value) {
        this.estbPersonTitle = value;
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
