
package pro.misoft.jackhenryintegration.generated.billpay;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Default message request headers
 * 
 * <p>Java class for MsgRqHdr_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MsgRqHdr_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="jXchangeHdr" type="{http://jackhenry.com/jxchange/TPG/2008}jXchangeHdr_CType"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="AuthenUsrCred" type="{http://jackhenry.com/jxchange/TPG/2008}AuthenUsrCred_CType" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="AuthenProdCred" type="{http://jackhenry.com/jxchange/TPG/2008}AuthenProdCred_CType" minOccurs="0"/&gt;
 *             &lt;sequence minOccurs="0"&gt;
 *               &lt;element name="Ver_3" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_3_CType"/&gt;
 *               &lt;any processContents='lax' namespace='http://jackhenry.com/jxchange/TPG/2008' maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
 *           &lt;/sequence&gt;
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
@XmlType(name = "MsgRqHdr_CType", propOrder = {
    "jXchangeHdr",
    "ver1",
    "authenUsrCred",
    "ver2",
    "authenProdCred",
    "ver3",
    "any"
})
public class MsgRqHdrCType {

    @XmlElement(required = true)
    protected JXchangeHdrCType jXchangeHdr;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlElement(name = "AuthenUsrCred")
    protected AuthenUsrCredCType authenUsrCred;
    @XmlElement(name = "Ver_2")
    protected Ver2CType ver2;
    @XmlElement(name = "AuthenProdCred")
    protected AuthenProdCredCType authenProdCred;
    @XmlElement(name = "Ver_3")
    protected Ver3CType ver3;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the jXchangeHdr property.
     * 
     * @return
     *     possible object is
     *     {@link JXchangeHdrCType }
     *     
     */
    public JXchangeHdrCType getJXchangeHdr() {
        return jXchangeHdr;
    }

    /**
     * Sets the value of the jXchangeHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JXchangeHdrCType }
     *     
     */
    public void setJXchangeHdr(JXchangeHdrCType value) {
        this.jXchangeHdr = value;
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
     * Gets the value of the authenUsrCred property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenUsrCredCType }
     *     
     */
    public AuthenUsrCredCType getAuthenUsrCred() {
        return authenUsrCred;
    }

    /**
     * Sets the value of the authenUsrCred property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenUsrCredCType }
     *     
     */
    public void setAuthenUsrCred(AuthenUsrCredCType value) {
        this.authenUsrCred = value;
    }

    /**
     * Gets the value of the ver2 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver2CType }
     *     
     */
    public Ver2CType getVer2() {
        return ver2;
    }

    /**
     * Sets the value of the ver2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver2CType }
     *     
     */
    public void setVer2(Ver2CType value) {
        this.ver2 = value;
    }

    /**
     * Gets the value of the authenProdCred property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenProdCredCType }
     *     
     */
    public AuthenProdCredCType getAuthenProdCred() {
        return authenProdCred;
    }

    /**
     * Sets the value of the authenProdCred property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenProdCredCType }
     *     
     */
    public void setAuthenProdCred(AuthenProdCredCType value) {
        this.authenProdCred = value;
    }

    /**
     * Gets the value of the ver3 property.
     * 
     * @return
     *     possible object is
     *     {@link Ver3CType }
     *     
     */
    public Ver3CType getVer3() {
        return ver3;
    }

    /**
     * Sets the value of the ver3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ver3CType }
     *     
     */
    public void setVer3(Ver3CType value) {
        this.ver3 = value;
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
     * {@link Element }
     * {@link Object }
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
