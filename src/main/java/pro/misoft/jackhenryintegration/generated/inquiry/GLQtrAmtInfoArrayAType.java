
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of calendar quarter amounts as related to
 *                 general ledger accounts
 * 
 * <p>Java class for GLQtrAmtInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GLQtrAmtInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GLQtrAmtInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}GLQtrAmtInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GLQtrAmtInfoArray_AType", propOrder = {
    "glQtrAmtInfoRec"
})
public class GLQtrAmtInfoArrayAType {

    @XmlElement(name = "GLQtrAmtInfoRec", nillable = true)
    protected List<GLQtrAmtInfoRecCType> glQtrAmtInfoRec;

    /**
     * Gets the value of the glQtrAmtInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glQtrAmtInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGLQtrAmtInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GLQtrAmtInfoRecCType }
     * 
     * 
     */
    public List<GLQtrAmtInfoRecCType> getGLQtrAmtInfoRec() {
        if (glQtrAmtInfoRec == null) {
            glQtrAmtInfoRec = new ArrayList<GLQtrAmtInfoRecCType>();
        }
        return this.glQtrAmtInfoRec;
    }

}
