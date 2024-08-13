
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for DocSetInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocSetInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocId" type="{http://jackhenry.com/jxchange/TPG/2008}DocId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocName" type="{http://jackhenry.com/jxchange/TPG/2008}DocName_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocInstcId" type="{http://jackhenry.com/jxchange/TPG/2008}DocInstcId_Type" minOccurs="0"/&gt;
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
@XmlType(name = "DocSetInfo_CType", propOrder = {
    "docId",
    "docName",
    "docInstcId",
    "ver1",
    "any"
})
public class DocSetInfoCType {

    @XmlElement(name = "DocId")
    protected DocIdType docId;
    @XmlElement(name = "DocName")
    protected DocNameType docName;
    @XmlElement(name = "DocInstcId")
    protected DocInstcIdType docInstcId;
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
     * Gets the value of the docName property.
     * 
     * @return
     *     possible object is
     *     {@link DocNameType }
     *     
     */
    public DocNameType getDocName() {
        return docName;
    }

    /**
     * Sets the value of the docName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocNameType }
     *     
     */
    public void setDocName(DocNameType value) {
        this.docName = value;
    }

    /**
     * Gets the value of the docInstcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocInstcIdType }
     *     
     */
    public DocInstcIdType getDocInstcId() {
        return docInstcId;
    }

    /**
     * Sets the value of the docInstcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocInstcIdType }
     *     
     */
    public void setDocInstcId(DocInstcIdType value) {
        this.docInstcId = value;
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
