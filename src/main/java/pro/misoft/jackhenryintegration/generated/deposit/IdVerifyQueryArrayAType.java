
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array - of identification query/questions and their
 *                 respective values for customer/account verification 
 * 
 * <p>Java class for IdVerifyQueryArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdVerifyQueryArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdVerifyQueryInfo" type="{http://jackhenry.com/jxchange/TPG/2008}IdVerifyQueryInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdVerifyQueryArray_AType", propOrder = {
    "idVerifyQueryInfo"
})
public class IdVerifyQueryArrayAType {

    @XmlElement(name = "IdVerifyQueryInfo", nillable = true)
    protected List<IdVerifyQueryInfoCType> idVerifyQueryInfo;

    /**
     * Gets the value of the idVerifyQueryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idVerifyQueryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdVerifyQueryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdVerifyQueryInfoCType }
     * 
     * 
     */
    public List<IdVerifyQueryInfoCType> getIdVerifyQueryInfo() {
        if (idVerifyQueryInfo == null) {
            idVerifyQueryInfo = new ArrayList<IdVerifyQueryInfoCType>();
        }
        return this.idVerifyQueryInfo;
    }

}
