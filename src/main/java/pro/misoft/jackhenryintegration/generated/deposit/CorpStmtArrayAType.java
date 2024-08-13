
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of corporate/business
 *                 statements.
 * 
 * <p>Java class for CorpStmtArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorpStmtArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CorpStmtInfo" type="{http://jackhenry.com/jxchange/TPG/2008}CorpStmtInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorpStmtArray_AType", propOrder = {
    "corpStmtInfo"
})
public class CorpStmtArrayAType {

    @XmlElement(name = "CorpStmtInfo")
    protected List<CorpStmtInfoCType> corpStmtInfo;

    /**
     * Gets the value of the corpStmtInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corpStmtInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpStmtInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorpStmtInfoCType }
     * 
     * 
     */
    public List<CorpStmtInfoCType> getCorpStmtInfo() {
        if (corpStmtInfo == null) {
            corpStmtInfo = new ArrayList<CorpStmtInfoCType>();
        }
        return this.corpStmtInfo;
    }

}
