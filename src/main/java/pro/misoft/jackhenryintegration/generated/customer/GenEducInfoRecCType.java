
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
 * <p>Java class for GenEducInfoRec_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenEducInfoRec_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EducLvl" type="{http://jackhenry.com/jxchange/TPG/2008}EducLvl_Type" minOccurs="0"/&gt;
 *         &lt;element name="SchoolName" type="{http://jackhenry.com/jxchange/TPG/2008}SchoolName_Type" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://jackhenry.com/jxchange/TPG/2008}City_Type" minOccurs="0"/&gt;
 *         &lt;element name="State" type="{http://jackhenry.com/jxchange/TPG/2008}StateCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="StudentStat" type="{http://jackhenry.com/jxchange/TPG/2008}StudentStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="EducGrade" type="{http://jackhenry.com/jxchange/TPG/2008}EducGrade_Type" minOccurs="0"/&gt;
 *         &lt;element name="YrEduc" type="{http://jackhenry.com/jxchange/TPG/2008}YrEduc_Type" minOccurs="0"/&gt;
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
@XmlType(name = "GenEducInfoRec_CType", propOrder = {
    "educLvl",
    "schoolName",
    "city",
    "state",
    "studentStat",
    "educGrade",
    "yrEduc",
    "ver1",
    "any"
})
public class GenEducInfoRecCType {

    @XmlElement(name = "EducLvl")
    protected EducLvlType educLvl;
    @XmlElement(name = "SchoolName")
    protected SchoolNameType schoolName;
    @XmlElement(name = "City")
    protected CityType city;
    @XmlElement(name = "State")
    protected StateCodeType state;
    @XmlElement(name = "StudentStat")
    protected StudentStatType studentStat;
    @XmlElement(name = "EducGrade")
    protected EducGradeType educGrade;
    @XmlElement(name = "YrEduc")
    protected YrEducType yrEduc;
    @XmlElement(name = "Ver_1")
    protected Ver1CType ver1;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the educLvl property.
     * 
     * @return
     *     possible object is
     *     {@link EducLvlType }
     *     
     */
    public EducLvlType getEducLvl() {
        return educLvl;
    }

    /**
     * Sets the value of the educLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducLvlType }
     *     
     */
    public void setEducLvl(EducLvlType value) {
        this.educLvl = value;
    }

    /**
     * Gets the value of the schoolName property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolNameType }
     *     
     */
    public SchoolNameType getSchoolName() {
        return schoolName;
    }

    /**
     * Sets the value of the schoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolNameType }
     *     
     */
    public void setSchoolName(SchoolNameType value) {
        this.schoolName = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setCity(CityType value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateCodeType }
     *     
     */
    public StateCodeType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateCodeType }
     *     
     */
    public void setState(StateCodeType value) {
        this.state = value;
    }

    /**
     * Gets the value of the studentStat property.
     * 
     * @return
     *     possible object is
     *     {@link StudentStatType }
     *     
     */
    public StudentStatType getStudentStat() {
        return studentStat;
    }

    /**
     * Sets the value of the studentStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentStatType }
     *     
     */
    public void setStudentStat(StudentStatType value) {
        this.studentStat = value;
    }

    /**
     * Gets the value of the educGrade property.
     * 
     * @return
     *     possible object is
     *     {@link EducGradeType }
     *     
     */
    public EducGradeType getEducGrade() {
        return educGrade;
    }

    /**
     * Sets the value of the educGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducGradeType }
     *     
     */
    public void setEducGrade(EducGradeType value) {
        this.educGrade = value;
    }

    /**
     * Gets the value of the yrEduc property.
     * 
     * @return
     *     possible object is
     *     {@link YrEducType }
     *     
     */
    public YrEducType getYrEduc() {
        return yrEduc;
    }

    /**
     * Sets the value of the yrEduc property.
     * 
     * @param value
     *     allowed object is
     *     {@link YrEducType }
     *     
     */
    public void setYrEduc(YrEducType value) {
        this.yrEduc = value;
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
