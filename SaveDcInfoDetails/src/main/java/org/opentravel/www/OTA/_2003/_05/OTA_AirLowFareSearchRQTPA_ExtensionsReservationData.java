/**
 * OTA_AirLowFareSearchRQTPA_ExtensionsReservationData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQTPA_ExtensionsReservationData  implements java.io.Serializable {
    private java.lang.String DKNumber;  // attribute

    public OTA_AirLowFareSearchRQTPA_ExtensionsReservationData() {
    }

    public OTA_AirLowFareSearchRQTPA_ExtensionsReservationData(
           java.lang.String DKNumber) {
           this.DKNumber = DKNumber;
    }


    /**
     * Gets the DKNumber value for this OTA_AirLowFareSearchRQTPA_ExtensionsReservationData.
     * 
     * @return DKNumber
     */
    public java.lang.String getDKNumber() {
        return DKNumber;
    }


    /**
     * Sets the DKNumber value for this OTA_AirLowFareSearchRQTPA_ExtensionsReservationData.
     * 
     * @param DKNumber
     */
    public void setDKNumber(java.lang.String DKNumber) {
        this.DKNumber = DKNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQTPA_ExtensionsReservationData)) return false;
        OTA_AirLowFareSearchRQTPA_ExtensionsReservationData other = (OTA_AirLowFareSearchRQTPA_ExtensionsReservationData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DKNumber==null && other.getDKNumber()==null) || 
             (this.DKNumber!=null &&
              this.DKNumber.equals(other.getDKNumber())));
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
        if (getDKNumber() != null) {
            _hashCode += getDKNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQTPA_ExtensionsReservationData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>ReservationData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DKNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DKNumber"));
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
