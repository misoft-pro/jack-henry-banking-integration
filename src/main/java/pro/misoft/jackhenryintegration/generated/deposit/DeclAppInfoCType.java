
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
 * The complex for loan application declarations
 * 
 * <p>Java class for DeclAppInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeclAppInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JudgementExst" type="{http://jackhenry.com/jxchange/TPG/2008}JudgementExst_Type" minOccurs="0"/&gt;
 *         &lt;element name="JudgementToName" type="{http://jackhenry.com/jxchange/TPG/2008}JudgementToName_Type" minOccurs="0"/&gt;
 *         &lt;element name="JudgementAmt" type="{http://jackhenry.com/jxchange/TPG/2008}JudgementAmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="DeclBnkrptcy" type="{http://jackhenry.com/jxchange/TPG/2008}DeclBnkrptcy_Type" minOccurs="0"/&gt;
 *         &lt;element name="DeclBnkrptcyYr" type="{http://jackhenry.com/jxchange/TPG/2008}DeclBnkrptcyYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="DeclBnkrptcyLoc" type="{http://jackhenry.com/jxchange/TPG/2008}DeclBnkrptcyLoc_Type" minOccurs="0"/&gt;
 *         &lt;element name="ForeClosureExst" type="{http://jackhenry.com/jxchange/TPG/2008}ForeClosureExst_Type" minOccurs="0"/&gt;
 *         &lt;element name="LawsuitExst" type="{http://jackhenry.com/jxchange/TPG/2008}LawsuitExst_Type" minOccurs="0"/&gt;
 *         &lt;element name="OthForeClosureExst" type="{http://jackhenry.com/jxchange/TPG/2008}OthForeClosureExst_Type" minOccurs="0"/&gt;
 *         &lt;element name="OthForeClosureName" type="{http://jackhenry.com/jxchange/TPG/2008}OthForeClosureName_Type" minOccurs="0"/&gt;
 *         &lt;element name="OthForeClosureAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="OthForeClosureDt" type="{http://jackhenry.com/jxchange/TPG/2008}OthForeClosureDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="OthForeClosureRsn" type="{http://jackhenry.com/jxchange/TPG/2008}OthForeClosureRsn_Type" minOccurs="0"/&gt;
 *         &lt;element name="OthDlqExst" type="{http://jackhenry.com/jxchange/TPG/2008}OthDlqExst_Type" minOccurs="0"/&gt;
 *         &lt;element name="AlimonyMainExst" type="{http://jackhenry.com/jxchange/TPG/2008}AlimonyMainExst_Type" minOccurs="0"/&gt;
 *         &lt;element name="DownPmtBorw" type="{http://jackhenry.com/jxchange/TPG/2008}DownPmtBorw_Type" minOccurs="0"/&gt;
 *         &lt;element name="EndorCoBorwExst" type="{http://jackhenry.com/jxchange/TPG/2008}EndorCoBorwExst_Type" minOccurs="0"/&gt;
 *         &lt;element name="EndorCoBorwToName" type="{http://jackhenry.com/jxchange/TPG/2008}EndorCoBorwToName_Type" minOccurs="0"/&gt;
 *         &lt;element name="EndorCoBorwForName" type="{http://jackhenry.com/jxchange/TPG/2008}EndorCoBorwForName_Type" minOccurs="0"/&gt;
 *         &lt;element name="NonUSCitizen" type="{http://jackhenry.com/jxchange/TPG/2008}NonUSCitizen_Type" minOccurs="0"/&gt;
 *         &lt;element name="AlienResident" type="{http://jackhenry.com/jxchange/TPG/2008}AlienResident_Type" minOccurs="0"/&gt;
 *         &lt;element name="OccupProp" type="{http://jackhenry.com/jxchange/TPG/2008}OccupProp_Type" minOccurs="0"/&gt;
 *         &lt;element name="PriorPropOwner" type="{http://jackhenry.com/jxchange/TPG/2008}PriorPropOwner_Type" minOccurs="0"/&gt;
 *         &lt;element name="PriorPropType" type="{http://jackhenry.com/jxchange/TPG/2008}PriorPropType_Type" minOccurs="0"/&gt;
 *         &lt;element name="PriorPropTitleType" type="{http://jackhenry.com/jxchange/TPG/2008}PriorPropTitleType_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AlienNonResidentType" type="{http://jackhenry.com/jxchange/TPG/2008}AlienNonResidentType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "DeclAppInfo_CType", propOrder = {
    "judgementExst",
    "judgementToName",
    "judgementAmt",
    "declBnkrptcy",
    "declBnkrptcyYr",
    "declBnkrptcyLoc",
    "foreClosureExst",
    "lawsuitExst",
    "othForeClosureExst",
    "othForeClosureName",
    "othForeClosureAddr",
    "othForeClosureDt",
    "othForeClosureRsn",
    "othDlqExst",
    "alimonyMainExst",
    "downPmtBorw",
    "endorCoBorwExst",
    "endorCoBorwToName",
    "endorCoBorwForName",
    "nonUSCitizen",
    "alienResident",
    "occupProp",
    "priorPropOwner",
    "priorPropType",
    "priorPropTitleType",
    "ver1",
    "alienNonResidentType",
    "ver2",
    "any"
})
public class DeclAppInfoCType {

    @XmlElement(name = "JudgementExst")
    protected JudgementExstType judgementExst;
    @XmlElement(name = "JudgementToName")
    protected JudgementToNameType judgementToName;
    @XmlElement(name = "JudgementAmt")
    protected JudgementAmtType judgementAmt;
    @XmlElement(name = "DeclBnkrptcy")
    protected DeclBnkrptcyType declBnkrptcy;
    @XmlElement(name = "DeclBnkrptcyYr")
    protected DeclBnkrptcyYrType declBnkrptcyYr;
    @XmlElement(name = "DeclBnkrptcyLoc")
    protected DeclBnkrptcyLocType declBnkrptcyLoc;
    @XmlElement(name = "ForeClosureExst")
    protected ForeClosureExstType foreClosureExst;
    @XmlElement(name = "LawsuitExst")
    protected LawsuitExstType lawsuitExst;
    @XmlElement(name = "OthForeClosureExst")
    protected OthForeClosureExstType othForeClosureExst;
    @XmlElement(name = "OthForeClosureName")
    protected OthForeClosureNameType othForeClosureName;
    @XmlElement(name = "OthForeClosureAddr")
    protected AddrCType othForeClosureAddr;
    @XmlElement(name = "OthForeClosureDt")
    protected OthForeClosureDtType othForeClosureDt;
    @XmlElement(name = "OthForeClosureRsn")
    protected OthForeClosureRsnType othForeClosureRsn;
    @XmlElement(name = "OthDlqExst")
    protected OthDlqExstType othDlqExst;
    @XmlElement(name = "AlimonyMainExst")
    protected AlimonyMainExstType alimonyMainExst;
    @XmlElement(name = "DownPmtBorw")
    protected DownPmtBorwType downPmtBorw;
    @XmlElement(name = "EndorCoBorwExst")
    protected EndorCoBorwExstType endorCoBorwExst;
    @XmlElement(name = "EndorCoBorwToName")
    protected EndorCoBorwToNameType endorCoBorwToName;
    @XmlElement(name = "EndorCoBorwForName")
    protected EndorCoBorwForNameType endorCoBorwForName;
    @XmlElement(name = "NonUSCitizen")
    protected NonUSCitizenType nonUSCitizen;
    @XmlElement(name = "AlienResident")
    protected AlienResidentType alienResident;
    @XmlElement(name = "OccupProp")
    protected OccupPropType occupProp;
    @XmlElement(name = "PriorPropOwner")
    protected PriorPropOwnerType priorPropOwner;
    @XmlElement(name = "PriorPropType")
    protected PriorPropTypeType priorPropType;
    @XmlElement(name = "PriorPropTitleType")
    protected PriorPropTitleTypeType priorPropTitleType;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AlienNonResidentType")
    protected AlienNonResidentTypeType alienNonResidentType;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the judgementExst property.
     * 
     * @return
     *     possible object is
     *     {@link JudgementExstType }
     *     
     */
    public JudgementExstType getJudgementExst() {
        return judgementExst;
    }

    /**
     * Sets the value of the judgementExst property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudgementExstType }
     *     
     */
    public void setJudgementExst(JudgementExstType value) {
        this.judgementExst = value;
    }

    /**
     * Gets the value of the judgementToName property.
     * 
     * @return
     *     possible object is
     *     {@link JudgementToNameType }
     *     
     */
    public JudgementToNameType getJudgementToName() {
        return judgementToName;
    }

    /**
     * Sets the value of the judgementToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudgementToNameType }
     *     
     */
    public void setJudgementToName(JudgementToNameType value) {
        this.judgementToName = value;
    }

    /**
     * Gets the value of the judgementAmt property.
     * 
     * @return
     *     possible object is
     *     {@link JudgementAmtType }
     *     
     */
    public JudgementAmtType getJudgementAmt() {
        return judgementAmt;
    }

    /**
     * Sets the value of the judgementAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudgementAmtType }
     *     
     */
    public void setJudgementAmt(JudgementAmtType value) {
        this.judgementAmt = value;
    }

    /**
     * Gets the value of the declBnkrptcy property.
     * 
     * @return
     *     possible object is
     *     {@link DeclBnkrptcyType }
     *     
     */
    public DeclBnkrptcyType getDeclBnkrptcy() {
        return declBnkrptcy;
    }

    /**
     * Sets the value of the declBnkrptcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclBnkrptcyType }
     *     
     */
    public void setDeclBnkrptcy(DeclBnkrptcyType value) {
        this.declBnkrptcy = value;
    }

    /**
     * Gets the value of the declBnkrptcyYr property.
     * 
     * @return
     *     possible object is
     *     {@link DeclBnkrptcyYrType }
     *     
     */
    public DeclBnkrptcyYrType getDeclBnkrptcyYr() {
        return declBnkrptcyYr;
    }

    /**
     * Sets the value of the declBnkrptcyYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclBnkrptcyYrType }
     *     
     */
    public void setDeclBnkrptcyYr(DeclBnkrptcyYrType value) {
        this.declBnkrptcyYr = value;
    }

    /**
     * Gets the value of the declBnkrptcyLoc property.
     * 
     * @return
     *     possible object is
     *     {@link DeclBnkrptcyLocType }
     *     
     */
    public DeclBnkrptcyLocType getDeclBnkrptcyLoc() {
        return declBnkrptcyLoc;
    }

    /**
     * Sets the value of the declBnkrptcyLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclBnkrptcyLocType }
     *     
     */
    public void setDeclBnkrptcyLoc(DeclBnkrptcyLocType value) {
        this.declBnkrptcyLoc = value;
    }

    /**
     * Gets the value of the foreClosureExst property.
     * 
     * @return
     *     possible object is
     *     {@link ForeClosureExstType }
     *     
     */
    public ForeClosureExstType getForeClosureExst() {
        return foreClosureExst;
    }

    /**
     * Sets the value of the foreClosureExst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeClosureExstType }
     *     
     */
    public void setForeClosureExst(ForeClosureExstType value) {
        this.foreClosureExst = value;
    }

    /**
     * Gets the value of the lawsuitExst property.
     * 
     * @return
     *     possible object is
     *     {@link LawsuitExstType }
     *     
     */
    public LawsuitExstType getLawsuitExst() {
        return lawsuitExst;
    }

    /**
     * Sets the value of the lawsuitExst property.
     * 
     * @param value
     *     allowed object is
     *     {@link LawsuitExstType }
     *     
     */
    public void setLawsuitExst(LawsuitExstType value) {
        this.lawsuitExst = value;
    }

    /**
     * Gets the value of the othForeClosureExst property.
     * 
     * @return
     *     possible object is
     *     {@link OthForeClosureExstType }
     *     
     */
    public OthForeClosureExstType getOthForeClosureExst() {
        return othForeClosureExst;
    }

    /**
     * Sets the value of the othForeClosureExst property.
     * 
     * @param value
     *     allowed object is
     *     {@link OthForeClosureExstType }
     *     
     */
    public void setOthForeClosureExst(OthForeClosureExstType value) {
        this.othForeClosureExst = value;
    }

    /**
     * Gets the value of the othForeClosureName property.
     * 
     * @return
     *     possible object is
     *     {@link OthForeClosureNameType }
     *     
     */
    public OthForeClosureNameType getOthForeClosureName() {
        return othForeClosureName;
    }

    /**
     * Sets the value of the othForeClosureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OthForeClosureNameType }
     *     
     */
    public void setOthForeClosureName(OthForeClosureNameType value) {
        this.othForeClosureName = value;
    }

    /**
     * Gets the value of the othForeClosureAddr property.
     * 
     * @return
     *     possible object is
     *     {@link AddrCType }
     *     
     */
    public AddrCType getOthForeClosureAddr() {
        return othForeClosureAddr;
    }

    /**
     * Sets the value of the othForeClosureAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddrCType }
     *     
     */
    public void setOthForeClosureAddr(AddrCType value) {
        this.othForeClosureAddr = value;
    }

    /**
     * Gets the value of the othForeClosureDt property.
     * 
     * @return
     *     possible object is
     *     {@link OthForeClosureDtType }
     *     
     */
    public OthForeClosureDtType getOthForeClosureDt() {
        return othForeClosureDt;
    }

    /**
     * Sets the value of the othForeClosureDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OthForeClosureDtType }
     *     
     */
    public void setOthForeClosureDt(OthForeClosureDtType value) {
        this.othForeClosureDt = value;
    }

    /**
     * Gets the value of the othForeClosureRsn property.
     * 
     * @return
     *     possible object is
     *     {@link OthForeClosureRsnType }
     *     
     */
    public OthForeClosureRsnType getOthForeClosureRsn() {
        return othForeClosureRsn;
    }

    /**
     * Sets the value of the othForeClosureRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OthForeClosureRsnType }
     *     
     */
    public void setOthForeClosureRsn(OthForeClosureRsnType value) {
        this.othForeClosureRsn = value;
    }

    /**
     * Gets the value of the othDlqExst property.
     * 
     * @return
     *     possible object is
     *     {@link OthDlqExstType }
     *     
     */
    public OthDlqExstType getOthDlqExst() {
        return othDlqExst;
    }

    /**
     * Sets the value of the othDlqExst property.
     * 
     * @param value
     *     allowed object is
     *     {@link OthDlqExstType }
     *     
     */
    public void setOthDlqExst(OthDlqExstType value) {
        this.othDlqExst = value;
    }

    /**
     * Gets the value of the alimonyMainExst property.
     * 
     * @return
     *     possible object is
     *     {@link AlimonyMainExstType }
     *     
     */
    public AlimonyMainExstType getAlimonyMainExst() {
        return alimonyMainExst;
    }

    /**
     * Sets the value of the alimonyMainExst property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlimonyMainExstType }
     *     
     */
    public void setAlimonyMainExst(AlimonyMainExstType value) {
        this.alimonyMainExst = value;
    }

    /**
     * Gets the value of the downPmtBorw property.
     * 
     * @return
     *     possible object is
     *     {@link DownPmtBorwType }
     *     
     */
    public DownPmtBorwType getDownPmtBorw() {
        return downPmtBorw;
    }

    /**
     * Sets the value of the downPmtBorw property.
     * 
     * @param value
     *     allowed object is
     *     {@link DownPmtBorwType }
     *     
     */
    public void setDownPmtBorw(DownPmtBorwType value) {
        this.downPmtBorw = value;
    }

    /**
     * Gets the value of the endorCoBorwExst property.
     * 
     * @return
     *     possible object is
     *     {@link EndorCoBorwExstType }
     *     
     */
    public EndorCoBorwExstType getEndorCoBorwExst() {
        return endorCoBorwExst;
    }

    /**
     * Sets the value of the endorCoBorwExst property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorCoBorwExstType }
     *     
     */
    public void setEndorCoBorwExst(EndorCoBorwExstType value) {
        this.endorCoBorwExst = value;
    }

    /**
     * Gets the value of the endorCoBorwToName property.
     * 
     * @return
     *     possible object is
     *     {@link EndorCoBorwToNameType }
     *     
     */
    public EndorCoBorwToNameType getEndorCoBorwToName() {
        return endorCoBorwToName;
    }

    /**
     * Sets the value of the endorCoBorwToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorCoBorwToNameType }
     *     
     */
    public void setEndorCoBorwToName(EndorCoBorwToNameType value) {
        this.endorCoBorwToName = value;
    }

    /**
     * Gets the value of the endorCoBorwForName property.
     * 
     * @return
     *     possible object is
     *     {@link EndorCoBorwForNameType }
     *     
     */
    public EndorCoBorwForNameType getEndorCoBorwForName() {
        return endorCoBorwForName;
    }

    /**
     * Sets the value of the endorCoBorwForName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndorCoBorwForNameType }
     *     
     */
    public void setEndorCoBorwForName(EndorCoBorwForNameType value) {
        this.endorCoBorwForName = value;
    }

    /**
     * Gets the value of the nonUSCitizen property.
     * 
     * @return
     *     possible object is
     *     {@link NonUSCitizenType }
     *     
     */
    public NonUSCitizenType getNonUSCitizen() {
        return nonUSCitizen;
    }

    /**
     * Sets the value of the nonUSCitizen property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonUSCitizenType }
     *     
     */
    public void setNonUSCitizen(NonUSCitizenType value) {
        this.nonUSCitizen = value;
    }

    /**
     * Gets the value of the alienResident property.
     * 
     * @return
     *     possible object is
     *     {@link AlienResidentType }
     *     
     */
    public AlienResidentType getAlienResident() {
        return alienResident;
    }

    /**
     * Sets the value of the alienResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlienResidentType }
     *     
     */
    public void setAlienResident(AlienResidentType value) {
        this.alienResident = value;
    }

    /**
     * Gets the value of the occupProp property.
     * 
     * @return
     *     possible object is
     *     {@link OccupPropType }
     *     
     */
    public OccupPropType getOccupProp() {
        return occupProp;
    }

    /**
     * Sets the value of the occupProp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupPropType }
     *     
     */
    public void setOccupProp(OccupPropType value) {
        this.occupProp = value;
    }

    /**
     * Gets the value of the priorPropOwner property.
     * 
     * @return
     *     possible object is
     *     {@link PriorPropOwnerType }
     *     
     */
    public PriorPropOwnerType getPriorPropOwner() {
        return priorPropOwner;
    }

    /**
     * Sets the value of the priorPropOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorPropOwnerType }
     *     
     */
    public void setPriorPropOwner(PriorPropOwnerType value) {
        this.priorPropOwner = value;
    }

    /**
     * Gets the value of the priorPropType property.
     * 
     * @return
     *     possible object is
     *     {@link PriorPropTypeType }
     *     
     */
    public PriorPropTypeType getPriorPropType() {
        return priorPropType;
    }

    /**
     * Sets the value of the priorPropType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorPropTypeType }
     *     
     */
    public void setPriorPropType(PriorPropTypeType value) {
        this.priorPropType = value;
    }

    /**
     * Gets the value of the priorPropTitleType property.
     * 
     * @return
     *     possible object is
     *     {@link PriorPropTitleTypeType }
     *     
     */
    public PriorPropTitleTypeType getPriorPropTitleType() {
        return priorPropTitleType;
    }

    /**
     * Sets the value of the priorPropTitleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorPropTitleTypeType }
     *     
     */
    public void setPriorPropTitleType(PriorPropTitleTypeType value) {
        this.priorPropTitleType = value;
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
     * Gets the value of the alienNonResidentType property.
     * 
     * @return
     *     possible object is
     *     {@link AlienNonResidentTypeType }
     *     
     */
    public AlienNonResidentTypeType getAlienNonResidentType() {
        return alienNonResidentType;
    }

    /**
     * Sets the value of the alienNonResidentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlienNonResidentTypeType }
     *     
     */
    public void setAlienNonResidentType(AlienNonResidentTypeType value) {
        this.alienNonResidentType = value;
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
