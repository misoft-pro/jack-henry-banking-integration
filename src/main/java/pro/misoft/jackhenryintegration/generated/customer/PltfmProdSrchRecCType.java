
package pro.misoft.jackhenryintegration.generated.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * PltfmProdSrchRec purposely includes complexes and elements related to
 *     both Deposits and Loans. This was done to support the possible existence of multiple
 *     platform providers at a single FI.
 * 
 * <p>Java class for PltfmProdSrchRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmProdSrchRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PltfmSrchRec" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmSrchInfoRec_CType" minOccurs="0"/&gt;
 *         &lt;element name="PltfmProdDesc" type="{http://jackhenry.com/jxchange/TPG/2008}ProdDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="RegionDesc" type="{http://jackhenry.com/jxchange/TPG/2008}RegionDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="BrDesc" type="{http://jackhenry.com/jxchange/TPG/2008}BrDesc_Type" minOccurs="0"/&gt;
 *         &lt;element name="PltfmCatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}PltfmCatDesc_Type" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PltfmProdSrchRec_CType", propOrder = {
    "pltfmSrchRec",
    "pltfmProdDesc",
    "regionDesc",
    "brDesc",
    "pltfmCatDesc",
    "ver1",
    "any"
})
public class PltfmProdSrchRecCType {

    @XmlElement(name = "PltfmSrchRec")
    protected PltfmSrchInfoRecCType pltfmSrchRec;
    @XmlElement(name = "PltfmProdDesc")
    protected ProdDescType pltfmProdDesc;
    @XmlElement(name = "RegionDesc")
    protected RegionDescType regionDesc;
    @XmlElement(name = "BrDesc")
    protected BrDescType brDesc;
    @XmlElement(name = "PltfmCatDesc")
    protected PltfmCatDescType pltfmCatDesc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the pltfmSrchRec property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmSrchInfoRecCType }
     *     
     */
    public PltfmSrchInfoRecCType getPltfmSrchRec() {
        return pltfmSrchRec;
    }

    /**
     * Sets the value of the pltfmSrchRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmSrchInfoRecCType }
     *     
     */
    public void setPltfmSrchRec(PltfmSrchInfoRecCType value) {
        this.pltfmSrchRec = value;
    }

    /**
     * Gets the value of the pltfmProdDesc property.
     * 
     * @return
     *     possible object is
     *     {@link ProdDescType }
     *     
     */
    public ProdDescType getPltfmProdDesc() {
        return pltfmProdDesc;
    }

    /**
     * Sets the value of the pltfmProdDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdDescType }
     *     
     */
    public void setPltfmProdDesc(ProdDescType value) {
        this.pltfmProdDesc = value;
    }

    /**
     * Gets the value of the regionDesc property.
     * 
     * @return
     *     possible object is
     *     {@link RegionDescType }
     *     
     */
    public RegionDescType getRegionDesc() {
        return regionDesc;
    }

    /**
     * Sets the value of the regionDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionDescType }
     *     
     */
    public void setRegionDesc(RegionDescType value) {
        this.regionDesc = value;
    }

    /**
     * Gets the value of the brDesc property.
     * 
     * @return
     *     possible object is
     *     {@link BrDescType }
     *     
     */
    public BrDescType getBrDesc() {
        return brDesc;
    }

    /**
     * Sets the value of the brDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrDescType }
     *     
     */
    public void setBrDesc(BrDescType value) {
        this.brDesc = value;
    }

    /**
     * Gets the value of the pltfmCatDesc property.
     * 
     * @return
     *     possible object is
     *     {@link PltfmCatDescType }
     *     
     */
    public PltfmCatDescType getPltfmCatDesc() {
        return pltfmCatDesc;
    }

    /**
     * Sets the value of the pltfmCatDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PltfmCatDescType }
     *     
     */
    public void setPltfmCatDesc(PltfmCatDescType value) {
        this.pltfmCatDesc = value;
    }

    /**
     * Gets the value of the ver1 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver1CType }
     *     
     */
    public Ver1CType getVer1() {
        return ver1;
    }

    /**
     * Sets the value of the ver1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver1CType }
     *     
     */
    public void setVer1(Ver1CType value) {
        this.ver1 = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
