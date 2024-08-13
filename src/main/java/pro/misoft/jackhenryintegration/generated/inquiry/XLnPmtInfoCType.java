
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
 * <p>Java class for x_LnPmtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_LnPmtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LnPmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}LnPmtInfo_CType" minOccurs="0"/&gt;
 *         &lt;element name="PostSeq5Desc" type="{http://jackhenry.com/jxchange/TPG/2008}PostSeq5Desc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostSeq4Desc" type="{http://jackhenry.com/jxchange/TPG/2008}PostSeq4Desc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostSeq3Desc" type="{http://jackhenry.com/jxchange/TPG/2008}PostSeq3Desc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostSeq2Desc" type="{http://jackhenry.com/jxchange/TPG/2008}PostSeq2Desc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PostSeq1Desc" type="{http://jackhenry.com/jxchange/TPG/2008}PostSeq1Desc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PmtSuspPostDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PmtSuspPostDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PostPmtPastDueDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PostPmtPastDueDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="PostPmtPrePaidDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PostPmtPrePaidDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="GradPmtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}GradPmtDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrePaidAmtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrePaidAmtDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="PostPrincCurtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PostPrincCurtDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrtcpFirstPmtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpFirstPmtDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrtcpPmtSplitDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PrtcpPmtSplitDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="CrLifeCompDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CrLifeCompDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="AHInsurCompDesc" type="{http://jackhenry.com/jxchange/TPG/2008}AHInsurCompDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="UEInsurCompDesc" type="{http://jackhenry.com/jxchange/TPG/2008}UEInsurCompDesc_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="IntPmtPostDesc" type="{http://jackhenry.com/jxchange/TPG/2008}IntPmtPostDesc_Type" minOccurs="0"/&gt;
 *             &lt;element name="PmtReAmrtzFreqDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PmtReAmrtzFreqDesc_Type" minOccurs="0"/&gt;
 *             &lt;element name="ChgYrFeeDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ChgYrFeeDesc_Type" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;element name="AmtLastIntPd" type="{http://jackhenry.com/jxchange/TPG/2008}AmtLastIntPd_Type" minOccurs="0"/&gt;
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
@XmlType(name = "x_LnPmtInfo_CType", propOrder = {
    "lnPmtInfo",
    "postSeq5Desc",
    "postSeq4Desc",
    "postSeq3Desc",
    "postSeq2Desc",
    "postSeq1Desc",
    "pmtSuspPostDesc",
    "custom",
    "ver1",
    "postPmtPastDueDesc",
    "postPmtPrePaidDesc",
    "gradPmtDesc",
    "prePaidAmtDesc",
    "postPrincCurtDesc",
    "prtcpFirstPmtDesc",
    "prtcpPmtSplitDesc",
    "crLifeCompDesc",
    "ahInsurCompDesc",
    "ueInsurCompDesc",
    "ver2",
    "intPmtPostDesc",
    "pmtReAmrtzFreqDesc",
    "chgYrFeeDesc",
    "ver3",
    "amtLastIntPd",
    "ver4",
    "any"
})
public class XLnPmtInfoCType {

    @XmlElement(name = "LnPmtInfo")
    protected LnPmtInfoCType lnPmtInfo;
    @XmlElement(name = "PostSeq5Desc")
    protected PostSeq5DescType postSeq5Desc;
    @XmlElement(name = "PostSeq4Desc")
    protected PostSeq4DescType postSeq4Desc;
    @XmlElement(name = "PostSeq3Desc")
    protected PostSeq3DescType postSeq3Desc;
    @XmlElement(name = "PostSeq2Desc")
    protected PostSeq2DescType postSeq2Desc;
    @XmlElement(name = "PostSeq1Desc")
    protected PostSeq1DescType postSeq1Desc;
    @XmlElement(name = "PmtSuspPostDesc")
    protected PmtSuspPostDescType pmtSuspPostDesc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "PostPmtPastDueDesc")
    protected PostPmtPastDueDescType postPmtPastDueDesc;
    @XmlElement(name = "PostPmtPrePaidDesc")
    protected PostPmtPrePaidDescType postPmtPrePaidDesc;
    @XmlElement(name = "GradPmtDesc")
    protected GradPmtDescType gradPmtDesc;
    @XmlElement(name = "PrePaidAmtDesc")
    protected PrePaidAmtDescType prePaidAmtDesc;
    @XmlElement(name = "PostPrincCurtDesc")
    protected PostPrincCurtDescType postPrincCurtDesc;
    @XmlElement(name = "PrtcpFirstPmtDesc")
    protected PrtcpFirstPmtDescType prtcpFirstPmtDesc;
    @XmlElement(name = "PrtcpPmtSplitDesc")
    protected PrtcpPmtSplitDescType prtcpPmtSplitDesc;
    @XmlElement(name = "CrLifeCompDesc")
    protected CrLifeCompDescType crLifeCompDesc;
    @XmlElement(name = "AHInsurCompDesc")
    protected AHInsurCompDescType ahInsurCompDesc;
    @XmlElement(name = "UEInsurCompDesc")
    protected UEInsurCompDescType ueInsurCompDesc;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "IntPmtPostDesc")
    protected IntPmtPostDescType intPmtPostDesc;
    @XmlElement(name = "PmtReAmrtzFreqDesc")
    protected PmtReAmrtzFreqDescType pmtReAmrtzFreqDesc;
    @XmlElement(name = "ChgYrFeeDesc")
    protected ChgYrFeeDescType chgYrFeeDesc;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlElement(name = "AmtLastIntPd")
    protected AmtLastIntPdType amtLastIntPd;
    @XmlElement(name = "Ver_4")
    protected Ver4CType ver4;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the lnPmtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LnPmtInfoCType }
     *     
     */
    public LnPmtInfoCType getLnPmtInfo() {
        return lnPmtInfo;
    }

    /**
     * Sets the value of the lnPmtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LnPmtInfoCType }
     *     
     */
    public void setLnPmtInfo(LnPmtInfoCType value) {
        this.lnPmtInfo = value;
    }

    /**
     * Gets the value of the postSeq5Desc property.
     * 
     * @return
     *     possible object is
     *     {@link PostSeq5DescType }
     *     
     */
    public PostSeq5DescType getPostSeq5Desc() {
        return postSeq5Desc;
    }

    /**
     * Sets the value of the postSeq5Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostSeq5DescType }
     *     
     */
    public void setPostSeq5Desc(PostSeq5DescType value) {
        this.postSeq5Desc = value;
    }

    /**
     * Gets the value of the postSeq4Desc property.
     * 
     * @return
     *     possible object is
     *     {@link PostSeq4DescType }
     *     
     */
    public PostSeq4DescType getPostSeq4Desc() {
        return postSeq4Desc;
    }

    /**
     * Sets the value of the postSeq4Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostSeq4DescType }
     *     
     */
    public void setPostSeq4Desc(PostSeq4DescType value) {
        this.postSeq4Desc = value;
    }

    /**
     * Gets the value of the postSeq3Desc property.
     * 
     * @return
     *     possible object is
     *     {@link PostSeq3DescType }
     *     
     */
    public PostSeq3DescType getPostSeq3Desc() {
        return postSeq3Desc;
    }

    /**
     * Sets the value of the postSeq3Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostSeq3DescType }
     *     
     */
    public void setPostSeq3Desc(PostSeq3DescType value) {
        this.postSeq3Desc = value;
    }

    /**
     * Gets the value of the postSeq2Desc property.
     * 
     * @return
     *     possible object is
     *     {@link PostSeq2DescType }
     *     
     */
    public PostSeq2DescType getPostSeq2Desc() {
        return postSeq2Desc;
    }

    /**
     * Sets the value of the postSeq2Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostSeq2DescType }
     *     
     */
    public void setPostSeq2Desc(PostSeq2DescType value) {
        this.postSeq2Desc = value;
    }

    /**
     * Gets the value of the postSeq1Desc property.
     * 
     * @return
     *     possible object is
     *     {@link PostSeq1DescType }
     *     
     */
    public PostSeq1DescType getPostSeq1Desc() {
        return postSeq1Desc;
    }

    /**
     * Sets the value of the postSeq1Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostSeq1DescType }
     *     
     */
    public void setPostSeq1Desc(PostSeq1DescType value) {
        this.postSeq1Desc = value;
    }

    /**
     * Gets the value of the pmtSuspPostDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PmtSuspPostDescType }
     *     
     */
    public PmtSuspPostDescType getPmtSuspPostDesc() {
        return pmtSuspPostDesc;
    }

    /**
     * Sets the value of the pmtSuspPostDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtSuspPostDescType }
     *     
     */
    public void setPmtSuspPostDesc(PmtSuspPostDescType value) {
        this.pmtSuspPostDesc = value;
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
     * Gets the value of the postPmtPastDueDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PostPmtPastDueDescType }
     *     
     */
    public PostPmtPastDueDescType getPostPmtPastDueDesc() {
        return postPmtPastDueDesc;
    }

    /**
     * Sets the value of the postPmtPastDueDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostPmtPastDueDescType }
     *     
     */
    public void setPostPmtPastDueDesc(PostPmtPastDueDescType value) {
        this.postPmtPastDueDesc = value;
    }

    /**
     * Gets the value of the postPmtPrePaidDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PostPmtPrePaidDescType }
     *     
     */
    public PostPmtPrePaidDescType getPostPmtPrePaidDesc() {
        return postPmtPrePaidDesc;
    }

    /**
     * Sets the value of the postPmtPrePaidDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostPmtPrePaidDescType }
     *     
     */
    public void setPostPmtPrePaidDesc(PostPmtPrePaidDescType value) {
        this.postPmtPrePaidDesc = value;
    }

    /**
     * Gets the value of the gradPmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link GradPmtDescType }
     *     
     */
    public GradPmtDescType getGradPmtDesc() {
        return gradPmtDesc;
    }

    /**
     * Sets the value of the gradPmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradPmtDescType }
     *     
     */
    public void setGradPmtDesc(GradPmtDescType value) {
        this.gradPmtDesc = value;
    }

    /**
     * Gets the value of the prePaidAmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrePaidAmtDescType }
     *     
     */
    public PrePaidAmtDescType getPrePaidAmtDesc() {
        return prePaidAmtDesc;
    }

    /**
     * Sets the value of the prePaidAmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePaidAmtDescType }
     *     
     */
    public void setPrePaidAmtDesc(PrePaidAmtDescType value) {
        this.prePaidAmtDesc = value;
    }

    /**
     * Gets the value of the postPrincCurtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PostPrincCurtDescType }
     *     
     */
    public PostPrincCurtDescType getPostPrincCurtDesc() {
        return postPrincCurtDesc;
    }

    /**
     * Sets the value of the postPrincCurtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostPrincCurtDescType }
     *     
     */
    public void setPostPrincCurtDesc(PostPrincCurtDescType value) {
        this.postPrincCurtDesc = value;
    }

    /**
     * Gets the value of the prtcpFirstPmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrtcpFirstPmtDescType }
     *     
     */
    public PrtcpFirstPmtDescType getPrtcpFirstPmtDesc() {
        return prtcpFirstPmtDesc;
    }

    /**
     * Sets the value of the prtcpFirstPmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtcpFirstPmtDescType }
     *     
     */
    public void setPrtcpFirstPmtDesc(PrtcpFirstPmtDescType value) {
        this.prtcpFirstPmtDesc = value;
    }

    /**
     * Gets the value of the prtcpPmtSplitDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PrtcpPmtSplitDescType }
     *     
     */
    public PrtcpPmtSplitDescType getPrtcpPmtSplitDesc() {
        return prtcpPmtSplitDesc;
    }

    /**
     * Sets the value of the prtcpPmtSplitDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrtcpPmtSplitDescType }
     *     
     */
    public void setPrtcpPmtSplitDesc(PrtcpPmtSplitDescType value) {
        this.prtcpPmtSplitDesc = value;
    }

    /**
     * Gets the value of the crLifeCompDesc property.
     * 
     * @return
     *     possible object is
     *     {@link CrLifeCompDescType }
     *     
     */
    public CrLifeCompDescType getCrLifeCompDesc() {
        return crLifeCompDesc;
    }

    /**
     * Sets the value of the crLifeCompDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrLifeCompDescType }
     *     
     */
    public void setCrLifeCompDesc(CrLifeCompDescType value) {
        this.crLifeCompDesc = value;
    }

    /**
     * Gets the value of the ahInsurCompDesc property.
     * 
     * @return
     *     possible object is
     *     {@link AHInsurCompDescType }
     *     
     */
    public AHInsurCompDescType getAHInsurCompDesc() {
        return ahInsurCompDesc;
    }

    /**
     * Sets the value of the ahInsurCompDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AHInsurCompDescType }
     *     
     */
    public void setAHInsurCompDesc(AHInsurCompDescType value) {
        this.ahInsurCompDesc = value;
    }

    /**
     * Gets the value of the ueInsurCompDesc property.
     * 
     * @return
     *     possible object is
     *     {@link UEInsurCompDescType }
     *     
     */
    public UEInsurCompDescType getUEInsurCompDesc() {
        return ueInsurCompDesc;
    }

    /**
     * Sets the value of the ueInsurCompDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link UEInsurCompDescType }
     *     
     */
    public void setUEInsurCompDesc(UEInsurCompDescType value) {
        this.ueInsurCompDesc = value;
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
     * Gets the value of the intPmtPostDesc property.
     * 
     * @return
     *     possible object is
     *     {@link IntPmtPostDescType }
     *     
     */
    public IntPmtPostDescType getIntPmtPostDesc() {
        return intPmtPostDesc;
    }

    /**
     * Sets the value of the intPmtPostDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntPmtPostDescType }
     *     
     */
    public void setIntPmtPostDesc(IntPmtPostDescType value) {
        this.intPmtPostDesc = value;
    }

    /**
     * Gets the value of the pmtReAmrtzFreqDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PmtReAmrtzFreqDescType }
     *     
     */
    public PmtReAmrtzFreqDescType getPmtReAmrtzFreqDesc() {
        return pmtReAmrtzFreqDesc;
    }

    /**
     * Sets the value of the pmtReAmrtzFreqDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmtReAmrtzFreqDescType }
     *     
     */
    public void setPmtReAmrtzFreqDesc(PmtReAmrtzFreqDescType value) {
        this.pmtReAmrtzFreqDesc = value;
    }

    /**
     * Gets the value of the chgYrFeeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ChgYrFeeDescType }
     *     
     */
    public ChgYrFeeDescType getChgYrFeeDesc() {
        return chgYrFeeDesc;
    }

    /**
     * Sets the value of the chgYrFeeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChgYrFeeDescType }
     *     
     */
    public void setChgYrFeeDesc(ChgYrFeeDescType value) {
        this.chgYrFeeDesc = value;
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
     * Gets the value of the amtLastIntPd property.
     * 
     * @return
     *     possible object is
     *     {@link AmtLastIntPdType }
     *     
     */
    public AmtLastIntPdType getAmtLastIntPd() {
        return amtLastIntPd;
    }

    /**
     * Sets the value of the amtLastIntPd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmtLastIntPdType }
     *     
     */
    public void setAmtLastIntPd(AmtLastIntPdType value) {
        this.amtLastIntPd = value;
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
