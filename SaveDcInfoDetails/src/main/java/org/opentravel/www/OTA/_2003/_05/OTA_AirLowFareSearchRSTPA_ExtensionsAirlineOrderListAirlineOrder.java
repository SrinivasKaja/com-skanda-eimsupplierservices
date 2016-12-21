/**
 * OTA_AirLowFareSearchRSTPA_ExtensionsAirlineOrderListAirlineOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRSTPA_ExtensionsAirlineOrderListAirlineOrder  extends org.opentravel.www.OTA._2003._05.CompanyNameType  implements java.io.Serializable {
    private short sequenceNumber;  // attribute

    public OTA_AirLowFareSearchRSTPA_ExtensionsAirlineOrderListAirlineOrder() {
    }

    // Simple Types must have a String constructor
    public OTA_AirLowFareSearchRSTPA_ExtensionsAirlineOrderListAirlineOrder(java.lang.String _value) {
        super(_value);
    }


    /**
     * Gets the sequenceNumber value for this OTA_AirLowFareSearchRSTPA_ExtensionsAirlineOrderListAirlineOrder.
     * 
     * @return sequenceNumber
     */
    public short getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this OTA_AirLowFareSearchRSTPA_ExtensionsAirlineOrderListAirlineOrder.
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(short sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRSTPA_ExtensionsAirlineOrderListAirlineOrder)) return false;
        OTA_AirLowFareSearchRSTPA_ExtensionsAirlineOrderListAirlineOrder other = (OTA_AirLowFareSearchRSTPA_ExtensionsAirlineOrderListAirlineOrder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.sequenceNumber == other.getSequenceNumber();
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
        _hashCode += getSequenceNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRSTPA_ExtensionsAirlineOrderListAirlineOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRS>TPA_Extensions>AirlineOrderList>AirlineOrder"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sequenceNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SequenceNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
