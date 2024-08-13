
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
 * <p>Java class for GLCombStmtInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GLCombStmtInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GLCombStmtText" type="{http://jackhenry.com/jxchange/TPG/2008}GLCombStmtText_Type"/&gt;
 *         &lt;element name="GLCombStmtCode" type="{http://jackhenry.com/jxchange/TPG/2008}GLCombStmtCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="GLCombStmtDesc" type="{http://jackhenry.com/jxchange/TPG/2008}GLCombStmtDesc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "GLCombStmtInfoRec_CType", propOrder = {
    "glCombStmtText",
    "glCombStmtCode",
    "glCombStmtDesc",
    "ver1",
    "any"
})
public class GLCombStmtInfoRecCType {

    @XmlElement(name = "GLCombStmtText", required = true)
    protected GLCombStmtTextType glCombStmtText;
    @XmlElement(name = "GLCombStmtCode")
    protected GLCombStmtCodeType glCombStmtCode;
    @XmlElement(name = "GLCombStmtDesc")
    protected GLCombStmtDescType glCombStmtDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the glCombStmtText property.
     * 
     * @return
     *     possible object is
     *     {@link GLCombStmtTextType }
     *     
     */
    public GLCombStmtTextType getGLCombStmtText() {
        return glCombStmtText;
    }

    /**
     * Sets the value of the glCombStmtText property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLCombStmtTextType }
     *     
     */
    public void setGLCombStmtText(GLCombStmtTextType value) {
        this.glCombStmtText = value;
    }

    /**
     * Gets the value of the glCombStmtCode property.
     * 
     * @return
     *     possible object is
     *     {@link GLCombStmtCodeType }
     *     
     */
    public GLCombStmtCodeType getGLCombStmtCode() {
        return glCombStmtCode;
    }

    /**
     * Sets the value of the glCombStmtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLCombStmtCodeType }
     *     
     */
    public void setGLCombStmtCode(GLCombStmtCodeType value) {
        this.glCombStmtCode = value;
    }

    /**
     * Gets the value of the glCombStmtDesc property.
     * 
     * @return
     *     possible object is
     *     {@link GLCombStmtDescType }
     *     
     */
    public GLCombStmtDescType getGLCombStmtDesc() {
        return glCombStmtDesc;
    }

    /**
     * Sets the value of the glCombStmtDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLCombStmtDescType }
     *     
     */
    public void setGLCombStmtDesc(GLCombStmtDescType value) {
        this.glCombStmtDesc = value;
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
