
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of step up interest rates
 * 
 * <p>Java class for StepUpIntRateInfoArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StepUpIntRateInfoArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StepUpIntRateInfo" type="{http://jackhenry.com/jxchange/TPG/2008}StepUpIntRateInfo_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StepUpIntRateInfoArray_AType", propOrder = {
    "stepUpIntRateInfo"
})
public class StepUpIntRateInfoArrayAType {

    @XmlElement(name = "StepUpIntRateInfo")
    protected List<StepUpIntRateInfoCType> stepUpIntRateInfo;

    /**
     * Gets the value of the stepUpIntRateInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stepUpIntRateInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStepUpIntRateInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StepUpIntRateInfoCType }
     * 
     * 
     */
    public List<StepUpIntRateInfoCType> getStepUpIntRateInfo() {
        if (stepUpIntRateInfo == null) {
            stepUpIntRateInfo = new ArrayList<StepUpIntRateInfoCType>();
        }
        return this.stepUpIntRateInfo;
    }

}
