
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An array of monthly amounts as related to general
 *                 ledger accounts
 * 
 * <p>Java class for GLMonthAmtInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GLMonthAmtInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GLMonthAmtInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}GLMonthAmtInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GLMonthAmtInfoArray_AType", propOrder = {
    "glMonthAmtInfoRec"
})
public class GLMonthAmtInfoArrayAType {

    @XmlElement(name = "GLMonthAmtInfoRec", nillable = true)
    protected List<GLMonthAmtInfoRecCType> glMonthAmtInfoRec;

    /**
     * Gets the value of the glMonthAmtInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the glMonthAmtInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGLMonthAmtInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GLMonthAmtInfoRecCType }
     * 
     * 
     */
    public List<GLMonthAmtInfoRecCType> getGLMonthAmtInfoRec() {
        if (glMonthAmtInfoRec == null) {
            glMonthAmtInfoRec = new ArrayList<GLMonthAmtInfoRecCType>();
        }
        return this.glMonthAmtInfoRec;
    }

}
