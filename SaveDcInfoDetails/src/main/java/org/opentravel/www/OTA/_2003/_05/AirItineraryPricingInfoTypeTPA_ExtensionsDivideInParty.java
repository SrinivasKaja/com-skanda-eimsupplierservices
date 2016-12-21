/**
 * AirItineraryPricingInfoTypeTPA_ExtensionsDivideInParty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirItineraryPricingInfoTypeTPA_ExtensionsDivideInParty  implements java.io.Serializable {
    private java.lang.Boolean indicator;  // attribute

    public AirItineraryPricingInfoTypeTPA_ExtensionsDivideInParty() {
    }

    public AirItineraryPricingInfoTypeTPA_ExtensionsDivideInParty(
           java.lang.Boolean indicator) {
           this.indicator = indicator;
    }


    /**
     * Gets the indicator value for this AirItineraryPricingInfoTypeTPA_ExtensionsDivideInParty.
     * 
     * @return indicator
     */
    public java.lang.Boolean getIndicator() {
        return indicator;
    }


    /**
     * Sets the indicator value for this AirItineraryPricingInfoTypeTPA_ExtensionsDivideInParty.
     * 
     * @param indicator
     */
    public void setIndicator(java.lang.Boolean indicator) {
        this.indicator = indicator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirItineraryPricingInfoTypeTPA_ExtensionsDivideInParty)) return false;
        AirItineraryPricingInfoTypeTPA_ExtensionsDivideInParty other = (AirItineraryPricingInfoTypeTPA_ExtensionsDivideInParty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.indicator==null && other.getIndicator()==null) || 
             (this.indicator!=null &&
              this.indicator.equals(other.getIndicator())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIndicator() != null) {
            _hashCode += getIndicator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirItineraryPricingInfoTypeTPA_ExtensionsDivideInParty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>TPA_Extensions>DivideInParty"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("indicator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Indicator"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
