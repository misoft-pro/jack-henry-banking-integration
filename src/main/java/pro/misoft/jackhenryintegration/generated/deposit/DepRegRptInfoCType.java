
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
 * <p>Java class for DepRegRptInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepRegRptInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GLCostCtr" type="{http://jackhenry.com/jxchange/TPG/2008}GLCostCtr_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}GLProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CRARec" type="{http://jackhenry.com/jxchange/TPG/2008}CRARec_CType" minOccurs="0"/&gt;
 *         &lt;element name="StdIndustCode" type="{http://jackhenry.com/jxchange/TPG/2008}StdIndustCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CallRptCode" type="{http://jackhenry.com/jxchange/TPG/2008}CallRptCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ARGOProdCode" type="{http://jackhenry.com/jxchange/TPG/2008}ARGOProdCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="ODRegRptCode" type="{http://jackhenry.com/jxchange/TPG/2008}ODRegRptCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="GroupCode" type="{http://jackhenry.com/jxchange/TPG/2008}GroupCode_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="FraudSusType" type="{http://jackhenry.com/jxchange/TPG/2008}FraudSusType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "DepRegRptInfo_CType", propOrder = {
    "glCostCtr",
    "glProdCode",
    "craRec",
    "stdIndustCode",
    "callRptCode",
    "argoProdCode",
    "odRegRptCode",
    "ver1",
    "groupCode",
    "ver2",
    "fraudSusType",
    "ver3",
    "any"
})
public class DepRegRptInfoCType {

    @XmlElementRef(name = "GLCostCtr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<GLCostCtrType> glCostCtr;
    @XmlElementRef(name = "GLProdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<GLProdCodeType> glProdCode;
    @XmlElement(name = "CRARec")
    protected CRARecCType craRec;
    @XmlElementRef(name = "StdIndustCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StdIndustCodeType> stdIndustCode;
    @XmlElementRef(name = "CallRptCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<CallRptCodeType> callRptCode;
    @XmlElementRef(name = "ARGOProdCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ARGOProdCodeType> argoProdCode;
    @XmlElementRef(name = "ODRegRptCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ODRegRptCodeType> odRegRptCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "GroupCode")
    protected GroupCodeType groupCode;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "FraudSusType")
    protected FraudSusTypeType fraudSusType;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the glCostCtr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GLCostCtrType }{@code >}
     *     
     */
    public JAXBElement<GLCostCtrType> getGLCostCtr() {
        return glCostCtr;
    }

    /**
     * Sets the value of the glCostCtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GLCostCtrType }{@code >}
     *     
     */
    public void setGLCostCtr(JAXBElement<GLCostCtrType> value) {
        this.glCostCtr = value;
    }

    /**
     * Gets the value of the glProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GLProdCodeType }{@code >}
     *     
     */
    public JAXBElement<GLProdCodeType> getGLProdCode() {
        return glProdCode;
    }

    /**
     * Sets the value of the glProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GLProdCodeType }{@code >}
     *     
     */
    public void setGLProdCode(JAXBElement<GLProdCodeType> value) {
        this.glProdCode = value;
    }

    /**
     * Gets the value of the craRec property.
     * 
     * @return
     *     possible object is
     *     {@link CRARecCType }
     *     
     */
    public CRARecCType getCRARec() {
        return craRec;
    }

    /**
     * Sets the value of the craRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRARecCType }
     *     
     */
    public void setCRARec(CRARecCType value) {
        this.craRec = value;
    }

    /**
     * Gets the value of the stdIndustCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StdIndustCodeType }{@code >}
     *     
     */
    public JAXBElement<StdIndustCodeType> getStdIndustCode() {
        return stdIndustCode;
    }

    /**
     * Sets the value of the stdIndustCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StdIndustCodeType }{@code >}
     *     
     */
    public void setStdIndustCode(JAXBElement<StdIndustCodeType> value) {
        this.stdIndustCode = value;
    }

    /**
     * Gets the value of the callRptCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CallRptCodeType }{@code >}
     *     
     */
    public JAXBElement<CallRptCodeType> getCallRptCode() {
        return callRptCode;
    }

    /**
     * Sets the value of the callRptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CallRptCodeType }{@code >}
     *     
     */
    public void setCallRptCode(JAXBElement<CallRptCodeType> value) {
        this.callRptCode = value;
    }

    /**
     * Gets the value of the argoProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ARGOProdCodeType }{@code >}
     *     
     */
    public JAXBElement<ARGOProdCodeType> getARGOProdCode() {
        return argoProdCode;
    }

    /**
     * Sets the value of the argoProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ARGOProdCodeType }{@code >}
     *     
     */
    public void setARGOProdCode(JAXBElement<ARGOProdCodeType> value) {
        this.argoProdCode = value;
    }

    /**
     * Gets the value of the odRegRptCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ODRegRptCodeType }{@code >}
     *     
     */
    public JAXBElement<ODRegRptCodeType> getODRegRptCode() {
        return odRegRptCode;
    }

    /**
     * Sets the value of the odRegRptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ODRegRptCodeType }{@code >}
     *     
     */
    public void setODRegRptCode(JAXBElement<ODRegRptCodeType> value) {
        this.odRegRptCode = value;
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
     * Gets the value of the groupCode property.
     * 
     * @return
     *     possible object is
     *     {@link GroupCodeType }
     *     
     */
    public GroupCodeType getGroupCode() {
        return groupCode;
    }

    /**
     * Sets the value of the groupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupCodeType }
     *     
     */
    public void setGroupCode(GroupCodeType value) {
        this.groupCode = value;
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
     * Gets the value of the fraudSusType property.
     * 
     * @return
     *     possible object is
     *     {@link FraudSusTypeType }
     *     
     */
    public FraudSusTypeType getFraudSusType() {
        return fraudSusType;
    }

    /**
     * Sets the value of the fraudSusType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudSusTypeType }
     *     
     */
    public void setFraudSusType(FraudSusTypeType value) {
        this.fraudSusType = value;
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
