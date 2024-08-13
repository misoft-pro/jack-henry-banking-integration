
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
 * <p>Java class for TimeDepStmtInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeDepStmtInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncCombStmt" type="{http://jackhenry.com/jxchange/TPG/2008}IncCombStmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtPasCode" type="{http://jackhenry.com/jxchange/TPG/2008}StmtPasCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtFreqCode" type="{http://jackhenry.com/jxchange/TPG/2008}StmtFreqCode_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="StmtCycle" type="{http://jackhenry.com/jxchange/TPG/2008}StmtCycle_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="LastStmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}LastStmtDt_Type" minOccurs="0"/&gt;
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
@XmlType(name = "TimeDepStmtInfo_CType", propOrder = {
    "incCombStmt",
    "stmtPasCode",
    "stmtFreqCode",
    "ver1",
    "stmtCycle",
    "ver2",
    "lastStmtDt",
    "ver3",
    "any"
})
public class TimeDepStmtInfoCType {

    @XmlElementRef(name = "IncCombStmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IncCombStmtType> incCombStmt;
    @XmlElementRef(name = "StmtPasCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtPasCodeType> stmtPasCode;
    @XmlElementRef(name = "StmtFreqCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtFreqCodeType> stmtFreqCode;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElementRef(name = "StmtCycle", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtCycleType> stmtCycle;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElementRef(name = "LastStmtDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<LastStmtDtType> lastStmtDt;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the incCombStmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncCombStmtType }{@code >}
     *     
     */
    public JAXBElement<IncCombStmtType> getIncCombStmt() {
        return incCombStmt;
    }

    /**
     * Sets the value of the incCombStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncCombStmtType }{@code >}
     *     
     */
    public void setIncCombStmt(JAXBElement<IncCombStmtType> value) {
        this.incCombStmt = value;
    }

    /**
     * Gets the value of the stmtPasCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtPasCodeType }{@code >}
     *     
     */
    public JAXBElement<StmtPasCodeType> getStmtPasCode() {
        return stmtPasCode;
    }

    /**
     * Sets the value of the stmtPasCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtPasCodeType }{@code >}
     *     
     */
    public void setStmtPasCode(JAXBElement<StmtPasCodeType> value) {
        this.stmtPasCode = value;
    }

    /**
     * Gets the value of the stmtFreqCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtFreqCodeType }{@code >}
     *     
     */
    public JAXBElement<StmtFreqCodeType> getStmtFreqCode() {
        return stmtFreqCode;
    }

    /**
     * Sets the value of the stmtFreqCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtFreqCodeType }{@code >}
     *     
     */
    public void setStmtFreqCode(JAXBElement<StmtFreqCodeType> value) {
        this.stmtFreqCode = value;
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
     * Gets the value of the stmtCycle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtCycleType }{@code >}
     *     
     */
    public JAXBElement<StmtCycleType> getStmtCycle() {
        return stmtCycle;
    }

    /**
     * Sets the value of the stmtCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtCycleType }{@code >}
     *     
     */
    public void setStmtCycle(JAXBElement<StmtCycleType> value) {
        this.stmtCycle = value;
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
     * Gets the value of the lastStmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LastStmtDtType }{@code >}
     *     
     */
    public JAXBElement<LastStmtDtType> getLastStmtDt() {
        return lastStmtDt;
    }

    /**
     * Sets the value of the lastStmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LastStmtDtType }{@code >}
     *     
     */
    public void setLastStmtDt(JAXBElement<LastStmtDtType> value) {
        this.lastStmtDt = value;
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
