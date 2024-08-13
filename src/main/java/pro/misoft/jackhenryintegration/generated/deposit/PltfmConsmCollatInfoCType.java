
package pro.misoft.jackhenryintegration.generated.deposit;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for PltfmConsmCollatInfo_CType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PltfmConsmCollatInfo_CType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CollatCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatCode_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatHolderName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;element name="CollatHolderAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *         &lt;element name="CollatStat" type="{http://jackhenry.com/jxchange/TPG/2008}CollatStat_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatModel" type="{http://jackhenry.com/jxchange/TPG/2008}CollatModel_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatMake" type="{http://jackhenry.com/jxchange/TPG/2008}CollatMake_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatYr" type="{http://jackhenry.com/jxchange/TPG/2008}CollatYr_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatId" type="{http://jackhenry.com/jxchange/TPG/2008}CollatId_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatMeterVal" type="{http://jackhenry.com/jxchange/TPG/2008}CollatMeterVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatMeterValType" type="{http://jackhenry.com/jxchange/TPG/2008}CollatMeterValType_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatValMthd" type="{http://jackhenry.com/jxchange/TPG/2008}CollatValMthd_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollatEstVal" type="{http://jackhenry.com/jxchange/TPG/2008}CollatEstVal_Type" minOccurs="0"/&gt;
 *         &lt;element name="SpouseName" type="{http://jackhenry.com/jxchange/TPG/2008}PersonName_CType" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Ver_1" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_1_CType"/&gt;
 *           &lt;element name="PropPurchaseAmt" type="{http://jackhenry.com/jxchange/TPG/2008}PropPurchaseAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="CollatInstName" type="{http://jackhenry.com/jxchange/TPG/2008}CollatInstName_Type" minOccurs="0"/&gt;
 *           &lt;element name="CollatHolderOnUs" type="{http://jackhenry.com/jxchange/TPG/2008}CollatHolderOnUs_Type" minOccurs="0"/&gt;
 *           &lt;element name="CollatHolderAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *           &lt;element name="NonPurchCollatAmt" type="{http://jackhenry.com/jxchange/TPG/2008}NonPurchCollatAmt_Type" minOccurs="0"/&gt;
 *           &lt;element name="InstrmClsf" type="{http://jackhenry.com/jxchange/TPG/2008}InstrmClsf_Type" minOccurs="0"/&gt;
 *           &lt;element name="PledgeAcctId" type="{http://jackhenry.com/jxchange/TPG/2008}AcctId_Type" minOccurs="0"/&gt;
 *           &lt;element name="CollatDesc" type="{http://jackhenry.com/jxchange/TPG/2008}CollatDesc_Type" minOccurs="0"/&gt;
 *           &lt;element name="LienClsf" type="{http://jackhenry.com/jxchange/TPG/2008}LienClsf_Type" minOccurs="0"/&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="Ver_2" type="{http://jackhenry.com/jxchange/TPG/2008}Ver_2_CType"/&gt;
 *             &lt;element name="CollatInstAddr" type="{http://jackhenry.com/jxchange/TPG/2008}Addr_CType" minOccurs="0"/&gt;
 *             &lt;element name="CollatIssueDt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatIssueDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="CollatValDt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatValDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="CollatExpDt" type="{http://jackhenry.com/jxchange/TPG/2008}CollatExpDt_Type" minOccurs="0"/&gt;
 *             &lt;element name="CollatBodyStyleCode" type="{http://jackhenry.com/jxchange/TPG/2008}CollatBodyStyleCode_Type" minOccurs="0"/&gt;
 *             &lt;element name="CollatInsurArray" type="{http://jackhenry.com/jxchange/TPG/2008}CollatInsurArray_AType" minOccurs="0"/&gt;
 *             &lt;element name="CollatOwnArray" type="{http://jackhenry.com/jxchange/TPG/2008}CollatOwnArray_AType" minOccurs="0"/&gt;
 *             &lt;element name="LienExstArray" type="{http://jackhenry.com/jxchange/TPG/2008}LienExstArray_AType" minOccurs="0"/&gt;
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
@XmlType(name = "PltfmConsmCollatInfo_CType", propOrder = {
    "content"
})
public class PltfmConsmCollatInfoCType {

    @XmlElementRefs({
        @XmlElementRef(name = "CollatEstVal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatDesc", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatStat", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NonPurchCollatAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Ver_2", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Ver_3", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatInstName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LienExstArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatModel", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatYr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatHolderName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatInsurArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Ver_1", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SpouseName", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatMeterVal", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "InstrmClsf", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatValDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatBodyStyleCode", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LienClsf", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatOwnArray", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatMake", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatValMthd", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatExpDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatInstAddr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PropPurchaseAmt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PledgeAcctId", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatHolderAddr", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatHolderOnUs", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatMeterValType", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollatIssueDt", namespace = "http://jackhenry.com/jxchange/TPG/2008", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "CollatHolderAddr" is used by two different parts of a schema. See: 
     * line 24033 of file:/Users/admin/git/clients/Faction/demo/docs/API/TPG_DepositMaster.xsd
     * line 24017 of file:/Users/admin/git/clients/Faction/demo/docs/API/TPG_DepositMaster.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CollatEstValType }{@code >}
     * {@link JAXBElement }{@code <}{@link CollatDescType }{@code >}
     * {@link JAXBElement }{@code <}{@link CollatStatType }{@code >}
     * {@link JAXBElement }{@code <}{@link NonPurchCollatAmtType }{@code >}
     * {@link JAXBElement }{@code <}{@link Ver2CType }{@code >}
     * {@link JAXBElement }{@code <}{@link CollatCodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link Ver3CType }{@code >}
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link CollatInstNameType }{@code >}
     * {@link JAXBElement }{@code <}{@link LienExstArrayAType }{@code >}
     * {@link Element }
     * {@link JAXBElement }{@code <}{@link CollatModelType }{@code >}
     * {@link JAXBElement }{@code <}{@link CollatYrType }{@code >}
     * {@link JAXBElement }{@code <}{@link PersonNameCType }{@code >}
     * {@link JAXBElement }{@code <}{@link CollatInsurArrayAType }{@code >}
     * {@link JAXBElement }{@code <}{@link Ver1CType }{@code >}
     * {@link JAXBElement }{@code <}{@link PersonNameCType }{@code >}
     * {@link JAXBElement }{@code <}{@link CollatMeterValType }{@code >}
     * {@link JAXBElement }{@code <}{@link InstrmClsfType }{@code >}
     * {@link JAXBElement }{@code <}{@link CollatValDtType }{@code >}
     * {@link JAXBElement }{@code <}{@link CollatBodyStyleCodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link LienClsfType }{@code >}
     * {@link JAXBElement }{@code <}{@link CollatOwnArrayAType }{@code >}
     * {@link JAXBElement }{@code <}{@link CollatMakeType }{@code >}
     * {@link JAXBElement }{@code <}{@link CollatIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link CollatValMthdType }{@code >}
     * {@link JAXBElement }{@code <}{@link CollatExpDtType }{@code >}
     * {@link JAXBElement }{@code <}{@link AddrCType }{@code >}
     * {@link JAXBElement }{@code <}{@link PropPurchaseAmtType }{@code >}
     * {@link JAXBElement }{@code <}{@link AcctIdType }{@code >}
     * {@link JAXBElement }{@code <}{@link AddrCType }{@code >}
     * {@link JAXBElement }{@code <}{@link CollatHolderOnUsType }{@code >}
     * {@link JAXBElement }{@code <}{@link CollatMeterValTypeType }{@code >}
     * {@link JAXBElement }{@code <}{@link CollatIssueDtType }{@code >}
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
