
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
 * <p>Java class for MemoPost_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemoPost_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MemoPost" type="{http://jackhenry.com/jxchange/TPG/2008}MemoPost_Type" minOccurs="0"/&gt;
 *         &lt;element name="MemoPostRmkArray" type="{http://jackhenry.com/jxchange/TPG/2008}MemoPostRmk_AType" minOccurs="0"/&gt;
 *         &lt;element name="MemoTimeEntry" type="{http://jackhenry.com/jxchange/TPG/2008}MemoTimeEntry_Type" minOccurs="0"/&gt;
 *         &lt;element name="MemoDtEntry" type="{http://jackhenry.com/jxchange/TPG/2008}MemoDtEntry_Type" minOccurs="0"/&gt;
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
@XmlType(name = "MemoPost_CType", propOrder = {
    "memoPost",
    "memoPostRmkArray",
    "memoTimeEntry",
    "memoDtEntry",
    "ver1",
    "any"
})
public class MemoPostCType {

    @XmlElement(name = "MemoPost")
    protected MemoPostType memoPost;
    @XmlElement(name = "MemoPostRmkArray")
    protected MemoPostRmkAType memoPostRmkArray;
    @XmlElement(name = "MemoTimeEntry")
    protected MemoTimeEntryType memoTimeEntry;
    @XmlElement(name = "MemoDtEntry")
    protected MemoDtEntryType memoDtEntry;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the memoPost property.
     * 
     * @return
     *     possible object is
     *     {@link MemoPostType }
     *     
     */
    public MemoPostType getMemoPost() {
        return memoPost;
    }

    /**
     * Sets the value of the memoPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemoPostType }
     *     
     */
    public void setMemoPost(MemoPostType value) {
        this.memoPost = value;
    }

    /**
     * Gets the value of the memoPostRmkArray property.
     * 
     * @return
     *     possible object is
     *     {@link MemoPostRmkAType }
     *     
     */
    public MemoPostRmkAType getMemoPostRmkArray() {
        return memoPostRmkArray;
    }

    /**
     * Sets the value of the memoPostRmkArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemoPostRmkAType }
     *     
     */
    public void setMemoPostRmkArray(MemoPostRmkAType value) {
        this.memoPostRmkArray = value;
    }

    /**
     * Gets the value of the memoTimeEntry property.
     * 
     * @return
     *     possible object is
     *     {@link MemoTimeEntryType }
     *     
     */
    public MemoTimeEntryType getMemoTimeEntry() {
        return memoTimeEntry;
    }

    /**
     * Sets the value of the memoTimeEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemoTimeEntryType }
     *     
     */
    public void setMemoTimeEntry(MemoTimeEntryType value) {
        this.memoTimeEntry = value;
    }

    /**
     * Gets the value of the memoDtEntry property.
     * 
     * @return
     *     possible object is
     *     {@link MemoDtEntryType }
     *     
     */
    public MemoDtEntryType getMemoDtEntry() {
        return memoDtEntry;
    }

    /**
     * Sets the value of the memoDtEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemoDtEntryType }
     *     
     */
    public void setMemoDtEntry(MemoDtEntryType value) {
        this.memoDtEntry = value;
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
