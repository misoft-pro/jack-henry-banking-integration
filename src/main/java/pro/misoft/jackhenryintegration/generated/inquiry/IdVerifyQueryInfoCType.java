
package pro.misoft.jackhenryintegration.generated.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for IdVerifyQueryInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdVerifyQueryInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdVerifyQuery" type="{http://jackhenry.com/jxchange/TPG/2008}IdVerifyQuery_Type"/&gt;
 *         &lt;element name="IdVerifyQueryVal" type="{http://jackhenry.com/jxchange/TPG/2008}IdVerifyQueryVal_Type"/&gt;
 *         &lt;element name="IdVerifyQueryDataType" type="{http://jackhenry.com/jxchange/TPG/2008}IdVerifyQueryDataType_Type" minOccurs="0"/&gt;
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
@XmlType(name = "IdVerifyQueryInfo_CType", propOrder = {
    "idVerifyQuery",
    "idVerifyQueryVal",
    "idVerifyQueryDataType",
    "ver1",
    "any"
})
public class IdVerifyQueryInfoCType {

    @XmlElement(name = "IdVerifyQuery", required = true)
    protected IdVerifyQueryType idVerifyQuery;
    @XmlElement(name = "IdVerifyQueryVal", required = true)
    protected IdVerifyQueryValType idVerifyQueryVal;
    @XmlElementRef(name = "IdVerifyQueryDataType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    protected JAXBElement<IdVerifyQueryDataTypeType> idVerifyQueryDataType;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the idVerifyQuery property.
     * 
     * @return
     *     possible object is
     *     {@link IdVerifyQueryType }
     *     
     */
    public IdVerifyQueryType getIdVerifyQuery() {
        return idVerifyQuery;
    }

    /**
     * Sets the value of the idVerifyQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdVerifyQueryType }
     *     
     */
    public void setIdVerifyQuery(IdVerifyQueryType value) {
        this.idVerifyQuery = value;
    }

    /**
     * Gets the value of the idVerifyQueryVal property.
     * 
     * @return
     *     possible object is
     *     {@link IdVerifyQueryValType }
     *     
     */
    public IdVerifyQueryValType getIdVerifyQueryVal() {
        return idVerifyQueryVal;
    }

    /**
     * Sets the value of the idVerifyQueryVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdVerifyQueryValType }
     *     
     */
    public void setIdVerifyQueryVal(IdVerifyQueryValType value) {
        this.idVerifyQueryVal = value;
    }

    /**
     * Gets the value of the idVerifyQueryDataType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdVerifyQueryDataTypeType }{@code >}
     *     
     */
    public JAXBElement<IdVerifyQueryDataTypeType> getIdVerifyQueryDataType() {
        return idVerifyQueryDataType;
    }

    /**
     * Sets the value of the idVerifyQueryDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdVerifyQueryDataTypeType }{@code >}
     *     
     */
    public void setIdVerifyQueryDataType(JAXBElement<IdVerifyQueryDataTypeType> value) {
        this.idVerifyQueryDataType = value;
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
