
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
 * <p>Java class for LnUnitBalDtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LnUnitBalDtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClsDt" type="{http://jackhenry.com/jxchange/TPG/2008}ClsDt_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="FirstPmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}FirstPmtDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="IntPaidYTD" type="{http://jackhenry.com/jxchange/TPG/2008}IntPaidYTD_Type" minOccurs="0"/&gt;
 *           &lt;element name="IntPaidPYTD" type="{http://jackhenry.com/jxchange/TPG/2008}IntPaidPYTD_Type" minOccurs="0"/&gt;
 *           &lt;element name="IntPaidLTD" type="{http://jackhenry.com/jxchange/TPG/2008}IntPaidLTD_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrincPaidYTD" type="{http://jackhenry.com/jxchange/TPG/2008}PrincPaidYTD_Type" minOccurs="0"/&gt;
 *           &lt;element name="PrincPaidPYTD" type="{http://jackhenry.com/jxchange/TPG/2008}PrincPaidPYTD_Type" minOccurs="0"/&gt;
 *           &lt;element name="IntChgdYTD" type="{http://jackhenry.com/jxchange/TPG/2008}IntChgdYTD_Type" minOccurs="0"/&gt;
 *           &lt;element name="IntChgdPYTD" type="{http://jackhenry.com/jxchange/TPG/2008}IntChgdPYTD_Type" minOccurs="0"/&gt;
 *           &lt;element name="FeeChgdYTD" type="{http://jackhenry.com/jxchange/TPG/2008}FeeChgdYTD_Type" minOccurs="0"/&gt;
 *           &lt;element name="FeeChgdPYTD" type="{http://jackhenry.com/jxchange/TPG/2008}FeeChgdPYTD_Type" minOccurs="0"/&gt;
 *           &lt;element name="MinInt" type="{http://jackhenry.com/jxchange/TPG/2008}MinInt_Type" minOccurs="0"/&gt;
 *           &lt;element name="NxtRvwDt" type="{http://jackhenry.com/jxchange/TPG/2008}NxtRvwDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="CollatInsurExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatInsurExpDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="UCCExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}UCCExpDt_Type" minOccurs="0"/&gt;
 *           &lt;element name="OrigFeesYTD" type="{http://jackhenry.com/jxchange/TPG/2008}OrigFeesYTD_Type" minOccurs="0"/&gt;
 *           &lt;element name="BalDueAtMat" type="{http://jackhenry.com/jxchange/TPG/2008}BalDueAtMat_Type" minOccurs="0"/&gt;
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
@XmlType(name = "LnUnitBalDtInfo_CType", propOrder = {
    "clsDt",
    "ver1",
    "firstPmtDt",
    "intPaidYTD",
    "intPaidPYTD",
    "intPaidLTD",
    "princPaidYTD",
    "princPaidPYTD",
    "intChgdYTD",
    "intChgdPYTD",
    "feeChgdYTD",
    "feeChgdPYTD",
    "minInt",
    "nxtRvwDt",
    "collatInsurExpDt",
    "uccExpDt",
    "origFeesYTD",
    "balDueAtMat",
    "ver2",
    "any"
})
public class LnUnitBalDtInfoCType {

    @XmlElement(name = "ClsDt")
    protected ClsDtType clsDt;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "FirstPmtDt")
    protected FirstPmtDtType firstPmtDt;
    @XmlElement(name = "IntPaidYTD")
    protected IntPaidYTDType intPaidYTD;
    @XmlElement(name = "IntPaidPYTD")
    protected IntPaidPYTDType intPaidPYTD;
    @XmlElement(name = "IntPaidLTD")
    protected IntPaidLTDType intPaidLTD;
    @XmlElement(name = "PrincPaidYTD")
    protected PrincPaidYTDType princPaidYTD;
    @XmlElement(name = "PrincPaidPYTD")
    protected PrincPaidPYTDType princPaidPYTD;
    @XmlElement(name = "IntChgdYTD")
    protected IntChgdYTDType intChgdYTD;
    @XmlElement(name = "IntChgdPYTD")
    protected IntChgdPYTDType intChgdPYTD;
    @XmlElement(name = "FeeChgdYTD")
    protected FeeChgdYTDType feeChgdYTD;
    @XmlElement(name = "FeeChgdPYTD")
    protected FeeChgdPYTDType feeChgdPYTD;
    @XmlElement(name = "MinInt")
    protected MinIntType minInt;
    @XmlElement(name = "NxtRvwDt")
    protected NxtRvwDtType nxtRvwDt;
    @XmlElement(name = "CollatInsurExpDt")
    protected CollatInsurExpDtType collatInsurExpDt;
    @XmlElement(name = "UCCExpDt")
    protected UCCExpDtType uccExpDt;
    @XmlElement(name = "OrigFeesYTD")
    protected OrigFeesYTDType origFeesYTD;
    @XmlElement(name = "BalDueAtMat")
    protected BalDueAtMatType balDueAtMat;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the clsDt property.
     * 
     * @return
     *     possible object is
     *     {@link ClsDtType }
     *     
     */
    public ClsDtType getClsDt() {
        return clsDt;
    }

    /**
     * Sets the value of the clsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsDtType }
     *     
     */
    public void setClsDt(ClsDtType value) {
        this.clsDt = value;
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
     * Gets the value of the firstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link FirstPmtDtType }
     *     
     */
    public FirstPmtDtType getFirstPmtDt() {
        return firstPmtDt;
    }

    /**
     * Sets the value of the firstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstPmtDtType }
     *     
     */
    public void setFirstPmtDt(FirstPmtDtType value) {
        this.firstPmtDt = value;
    }

    /**
     * Gets the value of the intPaidYTD property.
     * 
     * @return
     *     possible object is
     *     {@link IntPaidYTDType }
     *     
     */
    public IntPaidYTDType getIntPaidYTD() {
        return intPaidYTD;
    }

    /**
     * Sets the value of the intPaidYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntPaidYTDType }
     *     
     */
    public void setIntPaidYTD(IntPaidYTDType value) {
        this.intPaidYTD = value;
    }

    /**
     * Gets the value of the intPaidPYTD property.
     * 
     * @return
     *     possible object is
     *     {@link IntPaidPYTDType }
     *     
     */
    public IntPaidPYTDType getIntPaidPYTD() {
        return intPaidPYTD;
    }

    /**
     * Sets the value of the intPaidPYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntPaidPYTDType }
     *     
     */
    public void setIntPaidPYTD(IntPaidPYTDType value) {
        this.intPaidPYTD = value;
    }

    /**
     * Gets the value of the intPaidLTD property.
     * 
     * @return
     *     possible object is
     *     {@link IntPaidLTDType }
     *     
     */
    public IntPaidLTDType getIntPaidLTD() {
        return intPaidLTD;
    }

    /**
     * Sets the value of the intPaidLTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntPaidLTDType }
     *     
     */
    public void setIntPaidLTD(IntPaidLTDType value) {
        this.intPaidLTD = value;
    }

    /**
     * Gets the value of the princPaidYTD property.
     * 
     * @return
     *     possible object is
     *     {@link PrincPaidYTDType }
     *     
     */
    public PrincPaidYTDType getPrincPaidYTD() {
        return princPaidYTD;
    }

    /**
     * Sets the value of the princPaidYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincPaidYTDType }
     *     
     */
    public void setPrincPaidYTD(PrincPaidYTDType value) {
        this.princPaidYTD = value;
    }

    /**
     * Gets the value of the princPaidPYTD property.
     * 
     * @return
     *     possible object is
     *     {@link PrincPaidPYTDType }
     *     
     */
    public PrincPaidPYTDType getPrincPaidPYTD() {
        return princPaidPYTD;
    }

    /**
     * Sets the value of the princPaidPYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincPaidPYTDType }
     *     
     */
    public void setPrincPaidPYTD(PrincPaidPYTDType value) {
        this.princPaidPYTD = value;
    }

    /**
     * Gets the value of the intChgdYTD property.
     * 
     * @return
     *     possible object is
     *     {@link IntChgdYTDType }
     *     
     */
    public IntChgdYTDType getIntChgdYTD() {
        return intChgdYTD;
    }

    /**
     * Sets the value of the intChgdYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntChgdYTDType }
     *     
     */
    public void setIntChgdYTD(IntChgdYTDType value) {
        this.intChgdYTD = value;
    }

    /**
     * Gets the value of the intChgdPYTD property.
     * 
     * @return
     *     possible object is
     *     {@link IntChgdPYTDType }
     *     
     */
    public IntChgdPYTDType getIntChgdPYTD() {
        return intChgdPYTD;
    }

    /**
     * Sets the value of the intChgdPYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntChgdPYTDType }
     *     
     */
    public void setIntChgdPYTD(IntChgdPYTDType value) {
        this.intChgdPYTD = value;
    }

    /**
     * Gets the value of the feeChgdYTD property.
     * 
     * @return
     *     possible object is
     *     {@link FeeChgdYTDType }
     *     
     */
    public FeeChgdYTDType getFeeChgdYTD() {
        return feeChgdYTD;
    }

    /**
     * Sets the value of the feeChgdYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeChgdYTDType }
     *     
     */
    public void setFeeChgdYTD(FeeChgdYTDType value) {
        this.feeChgdYTD = value;
    }

    /**
     * Gets the value of the feeChgdPYTD property.
     * 
     * @return
     *     possible object is
     *     {@link FeeChgdPYTDType }
     *     
     */
    public FeeChgdPYTDType getFeeChgdPYTD() {
        return feeChgdPYTD;
    }

    /**
     * Sets the value of the feeChgdPYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeChgdPYTDType }
     *     
     */
    public void setFeeChgdPYTD(FeeChgdPYTDType value) {
        this.feeChgdPYTD = value;
    }

    /**
     * Gets the value of the minInt property.
     * 
     * @return
     *     possible object is
     *     {@link MinIntType }
     *     
     */
    public MinIntType getMinInt() {
        return minInt;
    }

    /**
     * Sets the value of the minInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinIntType }
     *     
     */
    public void setMinInt(MinIntType value) {
        this.minInt = value;
    }

    /**
     * Gets the value of the nxtRvwDt property.
     * 
     * @return
     *     possible object is
     *     {@link NxtRvwDtType }
     *     
     */
    public NxtRvwDtType getNxtRvwDt() {
        return nxtRvwDt;
    }

    /**
     * Sets the value of the nxtRvwDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NxtRvwDtType }
     *     
     */
    public void setNxtRvwDt(NxtRvwDtType value) {
        this.nxtRvwDt = value;
    }

    /**
     * Gets the value of the collatInsurExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link CollatInsurExpDtType }
     *     
     */
    public CollatInsurExpDtType getCollatInsurExpDt() {
        return collatInsurExpDt;
    }

    /**
     * Sets the value of the collatInsurExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollatInsurExpDtType }
     *     
     */
    public void setCollatInsurExpDt(CollatInsurExpDtType value) {
        this.collatInsurExpDt = value;
    }

    /**
     * Gets the value of the uccExpDt property.
     * 
     * @return
     *     possible object is
     *     {@link UCCExpDtType }
     *     
     */
    public UCCExpDtType getUCCExpDt() {
        return uccExpDt;
    }

    /**
     * Sets the value of the uccExpDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UCCExpDtType }
     *     
     */
    public void setUCCExpDt(UCCExpDtType value) {
        this.uccExpDt = value;
    }

    /**
     * Gets the value of the origFeesYTD property.
     * 
     * @return
     *     possible object is
     *     {@link OrigFeesYTDType }
     *     
     */
    public OrigFeesYTDType getOrigFeesYTD() {
        return origFeesYTD;
    }

    /**
     * Sets the value of the origFeesYTD property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrigFeesYTDType }
     *     
     */
    public void setOrigFeesYTD(OrigFeesYTDType value) {
        this.origFeesYTD = value;
    }

    /**
     * Gets the value of the balDueAtMat property.
     * 
     * @return
     *     possible object is
     *     {@link BalDueAtMatType }
     *     
     */
    public BalDueAtMatType getBalDueAtMat() {
        return balDueAtMat;
    }

    /**
     * Sets the value of the balDueAtMat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalDueAtMatType }
     *     
     */
    public void setBalDueAtMat(BalDueAtMatType value) {
        this.balDueAtMat = value;
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
