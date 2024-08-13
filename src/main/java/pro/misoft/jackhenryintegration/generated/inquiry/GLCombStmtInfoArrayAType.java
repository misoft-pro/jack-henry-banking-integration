
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of general ledger combined statement
 *                 codes
 * 
 * <p>Java class for GLCombStmtInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GLCombStmtInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GLCombStmtInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}GLCombStmtInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GLCombStmtInfoArray_AType", propOrder = {
    "glCombStmtInfoRec"
})
public class GLCombStmtInfoArrayAType {

    @XmlElement(name = "GLCombStmtInfoRec", nillable = true)
    protected List<GLCombStmtInfoRecCType> glCombStmtInfoRec;

    /**
     * Gets the value of the glCombStmtInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glCombStmtInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGLCombStmtInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GLCombStmtInfoRecCType }
     * 
     * 
     */
    public List<GLCombStmtInfoRecCType> getGLCombStmtInfoRec() {
        if (glCombStmtInfoRec == null) {
            glCombStmtInfoRec = new ArrayList<GLCombStmtInfoRecCType>();
        }
        return this.glCombStmtInfoRec;
    }

}
