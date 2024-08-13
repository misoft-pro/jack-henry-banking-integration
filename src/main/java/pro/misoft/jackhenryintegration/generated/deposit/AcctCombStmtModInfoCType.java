
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
 * <p>Java class for AcctCombStmtModInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcctCombStmtModInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StmtSerChg" type="{http://jackhenry.com/jxchange/TPG/2008}StmtSerChg_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtCrInt" type="{http://jackhenry.com/jxchange/TPG/2008}StmtCrInt_Type" minOccurs="0"/&gt;
 *         &lt;element name="IncEFTStmt" type="{http://jackhenry.com/jxchange/TPG/2008}IncEFTStmt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ForceComb" type="{http://jackhenry.com/jxchange/TPG/2008}ForceComb_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AcctCombStmtModInfo_CType", propOrder = {
    "stmtSerChg",
    "stmtCrInt",
    "incEFTStmt",
    "forceComb",
    "ver1",
    "any"
})
public class AcctCombStmtModInfoCType {

    @XmlElementRef(name = "StmtSerChg", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtSerChgType> stmtSerChg;
    @XmlElementRef(name = "StmtCrInt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<StmtCrIntType> stmtCrInt;
    @XmlElementRef(name = "IncEFTStmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IncEFTStmtType> incEFTStmt;
    @XmlElementRef(name = "ForceComb", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<ForceCombType> forceComb;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the stmtSerChg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtSerChgType }{@code >}
     *     
     */
    public JAXBElement<StmtSerChgType> getStmtSerChg() {
        return stmtSerChg;
    }

    /**
     * Sets the value of the stmtSerChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtSerChgType }{@code >}
     *     
     */
    public void setStmtSerChg(JAXBElement<StmtSerChgType> value) {
        this.stmtSerChg = value;
    }

    /**
     * Gets the value of the stmtCrInt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StmtCrIntType }{@code >}
     *     
     */
    public JAXBElement<StmtCrIntType> getStmtCrInt() {
        return stmtCrInt;
    }

    /**
     * Sets the value of the stmtCrInt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StmtCrIntType }{@code >}
     *     
     */
    public void setStmtCrInt(JAXBElement<StmtCrIntType> value) {
        this.stmtCrInt = value;
    }

    /**
     * Gets the value of the incEFTStmt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IncEFTStmtType }{@code >}
     *     
     */
    public JAXBElement<IncEFTStmtType> getIncEFTStmt() {
        return incEFTStmt;
    }

    /**
     * Sets the value of the incEFTStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IncEFTStmtType }{@code >}
     *     
     */
    public void setIncEFTStmt(JAXBElement<IncEFTStmtType> value) {
        this.incEFTStmt = value;
    }

    /**
     * Gets the value of the forceComb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ForceCombType }{@code >}
     *     
     */
    public JAXBElement<ForceCombType> getForceComb() {
        return forceComb;
    }

    /**
     * Sets the value of the forceComb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ForceCombType }{@code >}
     *     
     */
    public void setForceComb(JAXBElement<ForceCombType> value) {
        this.forceComb = value;
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
