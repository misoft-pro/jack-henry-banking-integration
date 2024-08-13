
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
 * <p>Java class for InfoMsgInqRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoMsgInqRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InfoMsgType" type="{http://jackhenry.com/jxchange/TPG/2008}InfoMsgType_Type"/&gt;
 *         &lt;element name="InfoMsgOrder" type="{http://jackhenry.com/jxchange/TPG/2008}InfoMsgOrder_Type" minOccurs="0"/&gt;
 *         &lt;element name="InfoMsgId" type="{http://jackhenry.com/jxchange/TPG/2008}InfoMsgId_Type" minOccurs="0"/&gt;
 *         &lt;element name="InfoMsg" type="{http://jackhenry.com/jxchange/TPG/2008}InfoMsg_Type" minOccurs="0"/&gt;
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
@XmlType(name = "InfoMsgInqRec_CType", propOrder = {
    "infoMsgType",
    "infoMsgOrder",
    "infoMsgId",
    "infoMsg",
    "ver1",
    "any"
})
public class InfoMsgInqRecCType {

    @XmlElement(name = "InfoMsgType", required = true)
    protected InfoMsgTypeType infoMsgType;
    @XmlElement(name = "InfoMsgOrder")
    protected InfoMsgOrderType infoMsgOrder;
    @XmlElement(name = "InfoMsgId")
    protected InfoMsgIdType infoMsgId;
    @XmlElement(name = "InfoMsg")
    protected InfoMsgType infoMsg;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the infoMsgType property.
     * 
     * @return
     *     possible object is
     *     {@link InfoMsgTypeType }
     *     
     */
    public InfoMsgTypeType getInfoMsgType() {
        return infoMsgType;
    }

    /**
     * Sets the value of the infoMsgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoMsgTypeType }
     *     
     */
    public void setInfoMsgType(InfoMsgTypeType value) {
        this.infoMsgType = value;
    }

    /**
     * Gets the value of the infoMsgOrder property.
     * 
     * @return
     *     possible object is
     *     {@link InfoMsgOrderType }
     *     
     */
    public InfoMsgOrderType getInfoMsgOrder() {
        return infoMsgOrder;
    }

    /**
     * Sets the value of the infoMsgOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoMsgOrderType }
     *     
     */
    public void setInfoMsgOrder(InfoMsgOrderType value) {
        this.infoMsgOrder = value;
    }

    /**
     * Gets the value of the infoMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link InfoMsgIdType }
     *     
     */
    public InfoMsgIdType getInfoMsgId() {
        return infoMsgId;
    }

    /**
     * Sets the value of the infoMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoMsgIdType }
     *     
     */
    public void setInfoMsgId(InfoMsgIdType value) {
        this.infoMsgId = value;
    }

    /**
     * Gets the value of the infoMsg property.
     * 
     * @return
     *     possible object is
     *     {@link InfoMsgType }
     *     
     */
    public InfoMsgType getInfoMsg() {
        return infoMsg;
    }

    /**
     * Sets the value of the infoMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoMsgType }
     *     
     */
    public void setInfoMsg(InfoMsgType value) {
        this.infoMsg = value;
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
