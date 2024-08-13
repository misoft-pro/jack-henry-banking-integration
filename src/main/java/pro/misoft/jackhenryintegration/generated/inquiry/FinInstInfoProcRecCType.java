
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
 * <p>Java class for FinInstInfoProcRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinInstInfoProcRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProcDt" type="{http://jackhenry.com/jxchange/TPG/2008}ProcDt_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProcEOD" type="{http://jackhenry.com/jxchange/TPG/2008}ProcEOD_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProcACH" type="{http://jackhenry.com/jxchange/TPG/2008}ProcEOD_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProcWires" type="{http://jackhenry.com/jxchange/TPG/2008}ProcEOD_Type" minOccurs="0"/&gt;
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
@XmlType(name = "FinInstInfoProcRec_CType", propOrder = {
    "procDt",
    "procEOD",
    "procACH",
    "procWires",
    "ver1",
    "any"
})
public class FinInstInfoProcRecCType {

    @XmlElement(name = "ProcDt")
    protected ProcDtType procDt;
    @XmlElement(name = "ProcEOD")
    protected ProcEODType procEOD;
    @XmlElement(name = "ProcACH")
    protected ProcEODType procACH;
    @XmlElement(name = "ProcWires")
    protected ProcEODType procWires;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the procDt property.
     * 
     * @return
     *     possible object is
     *     {@link ProcDtType }
     *     
     */
    public ProcDtType getProcDt() {
        return procDt;
    }

    /**
     * Sets the value of the procDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcDtType }
     *     
     */
    public void setProcDt(ProcDtType value) {
        this.procDt = value;
    }

    /**
     * Gets the value of the procEOD property.
     * 
     * @return
     *     possible object is
     *     {@link ProcEODType }
     *     
     */
    public ProcEODType getProcEOD() {
        return procEOD;
    }

    /**
     * Sets the value of the procEOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcEODType }
     *     
     */
    public void setProcEOD(ProcEODType value) {
        this.procEOD = value;
    }

    /**
     * Gets the value of the procACH property.
     * 
     * @return
     *     possible object is
     *     {@link ProcEODType }
     *     
     */
    public ProcEODType getProcACH() {
        return procACH;
    }

    /**
     * Sets the value of the procACH property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcEODType }
     *     
     */
    public void setProcACH(ProcEODType value) {
        this.procACH = value;
    }

    /**
     * Gets the value of the procWires property.
     * 
     * @return
     *     possible object is
     *     {@link ProcEODType }
     *     
     */
    public ProcEODType getProcWires() {
        return procWires;
    }

    /**
     * Sets the value of the procWires property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcEODType }
     *     
     */
    public void setProcWires(ProcEODType value) {
        this.procWires = value;
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
