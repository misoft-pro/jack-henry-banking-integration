
package pro.misoft.jackhenryintegration.generated.creditcard;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for CrCardStmtSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrCardStmtSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocId" type="{http://jackhenry.com/jxchange/TPG/2008}DocId_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtId" type="{http://jackhenry.com/jxchange/TPG/2008}StmtId_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtDt" type="{http://jackhenry.com/jxchange/TPG/2008}StmtDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="StmtLoc" type="{http://jackhenry.com/jxchange/TPG/2008}StmtLoc_Type" minOccurs="0"/&gt;
 *         &lt;element name="Custom" type="{http://jackhenry.com/jxchange/TPG/2008}Custom_CType" minOccurs="0"/&gt;
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
@XmlType(name = "CrCardStmtSrchRec_CType", propOrder = {
    "docId",
    "stmtId",
    "stmtDt",
    "stmtLoc",
    "custom",
    "ver1",
    "any"
})
public class CrCardStmtSrchRecCType {

    @XmlElement(name = "DocId")
    protected DocIdType docId;
    @XmlElement(name = "StmtId")
    protected StmtIdType stmtId;
    @XmlElement(name = "StmtDt")
    protected StmtDtType stmtDt;
    @XmlElement(name = "StmtLoc")
    protected StmtLocType stmtLoc;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the docId property.
     * 
     * @return
     *     possible object is
     *     {@link DocIdType }
     *     
     */
    public DocIdType getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocIdType }
     *     
     */
    public void setDocId(DocIdType value) {
        this.docId = value;
    }

    /**
     * Gets the value of the stmtId property.
     * 
     * @return
     *     possible object is
     *     {@link StmtIdType }
     *     
     */
    public StmtIdType getStmtId() {
        return stmtId;
    }

    /**
     * Sets the value of the stmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtIdType }
     *     
     */
    public void setStmtId(StmtIdType value) {
        this.stmtId = value;
    }

    /**
     * Gets the value of the stmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link StmtDtType }
     *     
     */
    public StmtDtType getStmtDt() {
        return stmtDt;
    }

    /**
     * Sets the value of the stmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtDtType }
     *     
     */
    public void setStmtDt(StmtDtType value) {
        this.stmtDt = value;
    }

    /**
     * Gets the value of the stmtLoc property.
     * 
     * @return
     *     possible object is
     *     {@link StmtLocType }
     *     
     */
    public StmtLocType getStmtLoc() {
        return stmtLoc;
    }

    /**
     * Sets the value of the stmtLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link StmtLocType }
     *     
     */
    public void setStmtLoc(StmtLocType value) {
        this.stmtLoc = value;
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
     * {@link Element }
     * {@link Object }
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
