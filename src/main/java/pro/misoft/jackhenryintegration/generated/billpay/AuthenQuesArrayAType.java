
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of MFA authentication questions
 *             
 * 
 * <p>Java class for AuthenQuesArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenQuesArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthenQuesRec" type="{http://jackhenry.com/jxchange/TPG/2008}AuthenQuesRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenQuesArray_AType", propOrder = {
    "authenQuesRec"
})
public class AuthenQuesArrayAType {

    @XmlElement(name = "AuthenQuesRec")
    protected List<AuthenQuesRecCType> authenQuesRec;

    /**
     * Gets the value of the authenQuesRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authenQuesRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthenQuesRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthenQuesRecCType }
     * 
     * 
     */
    public List<AuthenQuesRecCType> getAuthenQuesRec() {
        if (authenQuesRec == null) {
            authenQuesRec = new ArrayList<AuthenQuesRecCType>();
        }
        return this.authenQuesRec;
    }

}
