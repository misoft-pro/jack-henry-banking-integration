
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of information messages that provides general
 *     information about the general ledger account
 * 
 * <p>Java class for GLInfoMsgInqRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GLInfoMsgInqRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GLInfoMsgInqRec" type="{http://jackhenry.com/jxchange/TPG/2008}GLInfoMsgInqRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GLInfoMsgInqRecArray_AType", propOrder = {
    "glInfoMsgInqRec"
})
public class GLInfoMsgInqRecArrayAType {

    @XmlElement(name = "GLInfoMsgInqRec")
    protected List<GLInfoMsgInqRecCType> glInfoMsgInqRec;

    /**
     * Gets the value of the glInfoMsgInqRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glInfoMsgInqRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGLInfoMsgInqRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GLInfoMsgInqRecCType }
     * 
     * 
     */
    public List<GLInfoMsgInqRecCType> getGLInfoMsgInqRec() {
        if (glInfoMsgInqRec == null) {
            glInfoMsgInqRec = new ArrayList<GLInfoMsgInqRecCType>();
        }
        return this.glInfoMsgInqRec;
    }

}
