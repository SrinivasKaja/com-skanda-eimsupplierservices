/**
 * AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsCabin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsCabin  implements java.io.Serializable {
    private java.lang.String cabin;  // attribute

    public AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsCabin() {
    }

    public AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsCabin(
           java.lang.String cabin) {
           this.cabin = cabin;
    }


    /**
     * Gets the cabin value for this AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsCabin.
     * 
     * @return cabin
     */
    public java.lang.String getCabin() {
        return cabin;
    }


    /**
     * Sets the cabin value for this AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsCabin.
     * 
     * @param cabin
     */
    public void setCabin(java.lang.String cabin) {
        this.cabin = cabin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsCabin)) return false;
        AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsCabin other = (AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsCabin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cabin==null && other.getCabin()==null) || 
             (this.cabin!=null &&
              this.cabin.equals(other.getCabin())));
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
        if (getCabin() != null) {
            _hashCode += getCabin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirItineraryPricingInfoTypeFareInfosFareInfoTPA_ExtensionsCabin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>AirItineraryPricingInfoType>FareInfos>FareInfo>TPA_Extensions>Cabin"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("cabin");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Cabin"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
