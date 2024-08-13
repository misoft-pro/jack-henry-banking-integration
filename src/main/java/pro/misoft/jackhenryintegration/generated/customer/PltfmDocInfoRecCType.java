
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
 * <p>Java class for PltfmDocInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmDocInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocImg" type="{http://jackhenry.com/jxchange/TPG/2008}DocImg_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocImgFormat" type="{http://jackhenry.com/jxchange/TPG/2008}DocImgFormat_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocImgSize" type="{http://jackhenry.com/jxchange/TPG/2008}DocImgSize_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocId" type="{http://jackhenry.com/jxchange/TPG/2008}DocId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocName" type="{http://jackhenry.com/jxchange/TPG/2008}DocName_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocInstcId" type="{http://jackhenry.com/jxchange/TPG/2008}DocInstcId_Type" minOccurs="0"/&gt;
 *         &lt;element name="DocDataArray" type="{http://jackhenry.com/jxchange/TPG/2008}DocDataArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmDocInfoRec_CType", propOrder = {
    "docImg",
    "docImgFormat",
    "docImgSize",
    "docId",
    "docName",
    "docInstcId",
    "docDataArray",
    "custom",
    "ver1",
    "any"
})
public class PltfmDocInfoRecCType {

    @XmlElement(name = "DocImg")
    protected DocImgType docImg;
    @XmlElement(name = "DocImgFormat")
    protected DocImgFormatType docImgFormat;
    @XmlElement(name = "DocImgSize")
    protected DocImgSizeType docImgSize;
    @XmlElement(name = "DocId")
    protected DocIdType docId;
    @XmlElement(name = "DocName")
    protected DocNameType docName;
    @XmlElement(name = "DocInstcId")
    protected DocInstcIdType docInstcId;
    @XmlElement(name = "DocDataArray")
    protected DocDataArrayAType docDataArray;
    @XmlElement(name = "Custom")
    protected CustomCType custom;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the docImg property.
     * 
     * @return
     *     possible object is
     *     {@link DocImgType }
     *     
     */
    public DocImgType getDocImg() {
        return docImg;
    }

    /**
     * Sets the value of the docImg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocImgType }
     *     
     */
    public void setDocImg(DocImgType value) {
        this.docImg = value;
    }

    /**
     * Gets the value of the docImgFormat property.
     * 
     * @return
     *     possible object is
     *     {@link DocImgFormatType }
     *     
     */
    public DocImgFormatType getDocImgFormat() {
        return docImgFormat;
    }

    /**
     * Sets the value of the docImgFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocImgFormatType }
     *     
     */
    public void setDocImgFormat(DocImgFormatType value) {
        this.docImgFormat = value;
    }

    /**
     * Gets the value of the docImgSize property.
     * 
     * @return
     *     possible object is
     *     {@link DocImgSizeType }
     *     
     */
    public DocImgSizeType getDocImgSize() {
        return docImgSize;
    }

    /**
     * Sets the value of the docImgSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocImgSizeType }
     *     
     */
    public void setDocImgSize(DocImgSizeType value) {
        this.docImgSize = value;
    }

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
     * Gets the value of the docDataArray property.
     * 
     * @return
     *     possible object is
     *     {@link DocDataArrayAType }
     *     
     */
    public DocDataArrayAType getDocDataArray() {
        return docDataArray;
    }

    /**
     * Sets the value of the docDataArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocDataArrayAType }
     *     
     */
    public void setDocDataArray(DocDataArrayAType value) {
        this.docDataArray = value;
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
