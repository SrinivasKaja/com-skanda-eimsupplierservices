//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.30 at 10:02:03 PM IST 
//


package com.skandha.eim.air.jaxb.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for FareBasisCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareBasisCodes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareBasisCode" type="{http://www.xmlns.skandha.com/datatypes/Air/Service/1.0/}FareBasisCode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareBasisCodes", propOrder = {
    "fareBasisCode"
})
public class FareBasisCodes
    implements Equals, ToString
{

    protected List<FareBasisCode> fareBasisCode;

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareBasisCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareBasisCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareBasisCode }
     * 
     * 
     */
    public List<FareBasisCode> getFareBasisCode() {
        if (fareBasisCode == null) {
            fareBasisCode = new ArrayList<FareBasisCode>();
        }
        return this.fareBasisCode;
    }

    public void setFareBasisCode(List<FareBasisCode> value) {
        this.fareBasisCode = null;
        List<FareBasisCode> draftl = this.getFareBasisCode();
        draftl.addAll(value);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<FareBasisCode> theFareBasisCode;
            theFareBasisCode = (((this.fareBasisCode!= null)&&(!this.fareBasisCode.isEmpty()))?this.getFareBasisCode():null);
            strategy.appendField(locator, this, "fareBasisCode", buffer, theFareBasisCode);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FareBasisCodes)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FareBasisCodes that = ((FareBasisCodes) object);
        {
            List<FareBasisCode> lhsFareBasisCode;
            lhsFareBasisCode = (((this.fareBasisCode!= null)&&(!this.fareBasisCode.isEmpty()))?this.getFareBasisCode():null);
            List<FareBasisCode> rhsFareBasisCode;
            rhsFareBasisCode = (((that.fareBasisCode!= null)&&(!that.fareBasisCode.isEmpty()))?that.getFareBasisCode():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fareBasisCode", lhsFareBasisCode), LocatorUtils.property(thatLocator, "fareBasisCode", rhsFareBasisCode), lhsFareBasisCode, rhsFareBasisCode)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}