
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Array of Platform Product images
 * 
 * <p>Java class for x_ImgItemsArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="x_ImgItemsArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImgItemsInfoRec" type="{http://jackhenry.com/jxchange/TPG/2008}ImgItemsInfoRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "x_ImgItemsArray_AType", propOrder = {
    "imgItemsInfoRec"
})
public class XImgItemsArrayAType {

    @XmlElement(name = "ImgItemsInfoRec")
    protected List<ImgItemsInfoRecCType> imgItemsInfoRec;

    /**
     * Gets the value of the imgItemsInfoRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imgItemsInfoRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImgItemsInfoRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImgItemsInfoRecCType }
     * 
     * 
     */
    public List<ImgItemsInfoRecCType> getImgItemsInfoRec() {
        if (imgItemsInfoRec == null) {
            imgItemsInfoRec = new ArrayList<ImgItemsInfoRecCType>();
        }
        return this.imgItemsInfoRec;
    }

}
