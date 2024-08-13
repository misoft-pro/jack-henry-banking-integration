
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An Array of responses of File Maintenance
 *     search.
 * 
 * <p>Java class for FileMainSrchRecArray_AType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileMainSrchRecArray_AType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileMainSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}FileMainSrchRec_CType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileMainSrchRecArray_AType", propOrder = {
    "fileMainSrchRec"
})
public class FileMainSrchRecArrayAType {

    @XmlElement(name = "FileMainSrchRec")
    protected List<FileMainSrchRecCType> fileMainSrchRec;

    /**
     * Gets the value of the fileMainSrchRec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileMainSrchRec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileMainSrchRec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileMainSrchRecCType }
     * 
     * 
     */
    public List<FileMainSrchRecCType> getFileMainSrchRec() {
        if (fileMainSrchRec == null) {
            fileMainSrchRec = new ArrayList<FileMainSrchRecCType>();
        }
        return this.fileMainSrchRec;
    }

}
