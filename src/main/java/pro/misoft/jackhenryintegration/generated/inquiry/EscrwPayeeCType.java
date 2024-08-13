
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
 * <p>Java class for EscrwPayee_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EscrwPayee_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EscrwInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="EscrwId" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwId_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwTypeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwTypeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwPmtAgentDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPmtAgentDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwPmtCompDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPmtCompDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwPayeeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPayeeDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwStatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwStatDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="EscrwPrtNotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}EscrwPrtNotDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PMILTVNotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PMILTVNotDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PMICancelDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PMICancelDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PMICancelNotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PMICancelNotDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="CustomEscrwPayee" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PMIHOEPANotDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PMIHOEPANotDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="InstDefKey" type="{http://jackhenry.com/jxchange/TPG/2008}InstDefKey_Type" minOccurs="0"/&gt;
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
@XmlType(name = "EscrwPayee_CType", propOrder = {
    "escrwInfoRec",
    "escrwId",
    "escrwTypeDesc",
    "escrwPmtAgentDesc",
    "escrwPmtCompDesc",
    "escrwPayeeDesc",
    "escrwStatDesc",
    "escrwPrtNotDesc",
    "pmiltvNotDesc",
    "pmiCancelDesc",
    "pmiCancelNotDesc",
    "customEscrwPayee",
    "ver1",
    "pmihoepaNotDesc",
    "ver2",
    "instDefKey",
    "ver3",
    "any"
})
public class EscrwPayeeCType {

    @XmlElement(name = "EscrwInfoRec")
    protected EscrwInfoRecCType escrwInfoRec;
    @XmlElement(name = "EscrwId")
    protected EscrwIdType escrwId;
    @XmlElement(name = "EscrwTypeDesc")
    protected EscrwTypeDescType escrwTypeDesc;
    @XmlElement(name = "EscrwPmtAgentDesc")
    protected EscrwPmtAgentDescType escrwPmtAgentDesc;
    @XmlElement(name = "EscrwPmtCompDesc")
    protected EscrwPmtCompDescType escrwPmtCompDesc;
    @XmlElement(name = "EscrwPayeeDesc")
    protected EscrwPayeeDescType escrwPayeeDesc;
    @XmlElement(name = "EscrwStatDesc")
    protected EscrwStatDescType escrwStatDesc;
    @XmlElement(name = "EscrwPrtNotDesc")
    protected EscrwPrtNotDescType escrwPrtNotDesc;
    @XmlElement(name = "PMILTVNotDesc")
    protected PMILTVNotDescType pmiltvNotDesc;
    @XmlElement(name = "PMICancelDesc")
    protected PMICancelDescType pmiCancelDesc;
    @XmlElement(name = "PMICancelNotDesc")
    protected PMICancelNotDescType pmiCancelNotDesc;
    @XmlElement(name = "CustomEscrwPayee")
    protected CustomCType customEscrwPayee;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PMIHOEPANotDesc")
    protected PMIHOEPANotDescType pmihoepaNotDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "InstDefKey")
    protected InstDefKeyType instDefKey;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the escrwInfoRec property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwInfoRecCType }
     *     
     */
    public EscrwInfoRecCType getEscrwInfoRec() {
        return escrwInfoRec;
    }

    /**
     * Sets the value of the escrwInfoRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwInfoRecCType }
     *     
     */
    public void setEscrwInfoRec(EscrwInfoRecCType value) {
        this.escrwInfoRec = value;
    }

    /**
     * Gets the value of the escrwId property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwIdType }
     *     
     */
    public EscrwIdType getEscrwId() {
        return escrwId;
    }

    /**
     * Sets the value of the escrwId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwIdType }
     *     
     */
    public void setEscrwId(EscrwIdType value) {
        this.escrwId = value;
    }

    /**
     * Gets the value of the escrwTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwTypeDescType }
     *     
     */
    public EscrwTypeDescType getEscrwTypeDesc() {
        return escrwTypeDesc;
    }

    /**
     * Sets the value of the escrwTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwTypeDescType }
     *     
     */
    public void setEscrwTypeDesc(EscrwTypeDescType value) {
        this.escrwTypeDesc = value;
    }

    /**
     * Gets the value of the escrwPmtAgentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwPmtAgentDescType }
     *     
     */
    public EscrwPmtAgentDescType getEscrwPmtAgentDesc() {
        return escrwPmtAgentDesc;
    }

    /**
     * Sets the value of the escrwPmtAgentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwPmtAgentDescType }
     *     
     */
    public void setEscrwPmtAgentDesc(EscrwPmtAgentDescType value) {
        this.escrwPmtAgentDesc = value;
    }

    /**
     * Gets the value of the escrwPmtCompDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwPmtCompDescType }
     *     
     */
    public EscrwPmtCompDescType getEscrwPmtCompDesc() {
        return escrwPmtCompDesc;
    }

    /**
     * Sets the value of the escrwPmtCompDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwPmtCompDescType }
     *     
     */
    public void setEscrwPmtCompDesc(EscrwPmtCompDescType value) {
        this.escrwPmtCompDesc = value;
    }

    /**
     * Gets the value of the escrwPayeeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwPayeeDescType }
     *     
     */
    public EscrwPayeeDescType getEscrwPayeeDesc() {
        return escrwPayeeDesc;
    }

    /**
     * Sets the value of the escrwPayeeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwPayeeDescType }
     *     
     */
    public void setEscrwPayeeDesc(EscrwPayeeDescType value) {
        this.escrwPayeeDesc = value;
    }

    /**
     * Gets the value of the escrwStatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwStatDescType }
     *     
     */
    public EscrwStatDescType getEscrwStatDesc() {
        return escrwStatDesc;
    }

    /**
     * Sets the value of the escrwStatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwStatDescType }
     *     
     */
    public void setEscrwStatDesc(EscrwStatDescType value) {
        this.escrwStatDesc = value;
    }

    /**
     * Gets the value of the escrwPrtNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link EscrwPrtNotDescType }
     *     
     */
    public EscrwPrtNotDescType getEscrwPrtNotDesc() {
        return escrwPrtNotDesc;
    }

    /**
     * Sets the value of the escrwPrtNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscrwPrtNotDescType }
     *     
     */
    public void setEscrwPrtNotDesc(EscrwPrtNotDescType value) {
        this.escrwPrtNotDesc = value;
    }

    /**
     * Gets the value of the pmiltvNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PMILTVNotDescType }
     *     
     */
    public PMILTVNotDescType getPMILTVNotDesc() {
        return pmiltvNotDesc;
    }

    /**
     * Sets the value of the pmiltvNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PMILTVNotDescType }
     *     
     */
    public void setPMILTVNotDesc(PMILTVNotDescType value) {
        this.pmiltvNotDesc = value;
    }

    /**
     * Gets the value of the pmiCancelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PMICancelDescType }
     *     
     */
    public PMICancelDescType getPMICancelDesc() {
        return pmiCancelDesc;
    }

    /**
     * Sets the value of the pmiCancelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PMICancelDescType }
     *     
     */
    public void setPMICancelDesc(PMICancelDescType value) {
        this.pmiCancelDesc = value;
    }

    /**
     * Gets the value of the pmiCancelNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PMICancelNotDescType }
     *     
     */
    public PMICancelNotDescType getPMICancelNotDesc() {
        return pmiCancelNotDesc;
    }

    /**
     * Sets the value of the pmiCancelNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PMICancelNotDescType }
     *     
     */
    public void setPMICancelNotDesc(PMICancelNotDescType value) {
        this.pmiCancelNotDesc = value;
    }

    /**
     * Gets the value of the customEscrwPayee property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCType }
     *     
     */
    public CustomCType getCustomEscrwPayee() {
        return customEscrwPayee;
    }

    /**
     * Sets the value of the customEscrwPayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCType }
     *     
     */
    public void setCustomEscrwPayee(CustomCType value) {
        this.customEscrwPayee = value;
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
     * Gets the value of the pmihoepaNotDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PMIHOEPANotDescType }
     *     
     */
    public PMIHOEPANotDescType getPMIHOEPANotDesc() {
        return pmihoepaNotDesc;
    }

    /**
     * Sets the value of the pmihoepaNotDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PMIHOEPANotDescType }
     *     
     */
    public void setPMIHOEPANotDesc(PMIHOEPANotDescType value) {
        this.pmihoepaNotDesc = value;
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
     * Gets the value of the instDefKey property.
     * 
     * @return
     *     possible object is
     *     {@link InstDefKeyType }
     *     
     */
    public InstDefKeyType getInstDefKey() {
        return instDefKey;
    }

    /**
     * Sets the value of the instDefKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstDefKeyType }
     *     
     */
    public void setInstDefKey(InstDefKeyType value) {
        this.instDefKey = value;
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
