/**
 * PassengerTypeQuantityTypeTPA_ExtensionsAge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PassengerTypeQuantityTypeTPA_ExtensionsAge  implements java.io.Serializable {
    private short years;  // attribute

    public PassengerTypeQuantityTypeTPA_ExtensionsAge() {
    }

    public PassengerTypeQuantityTypeTPA_ExtensionsAge(
           short years) {
           this.years = years;
    }


    /**
     * Gets the years value for this PassengerTypeQuantityTypeTPA_ExtensionsAge.
     * 
     * @return years
     */
    public short getYears() {
        return years;
    }


    /**
     * Sets the years value for this PassengerTypeQuantityTypeTPA_ExtensionsAge.
     * 
     * @param years
     */
    public void setYears(short years) {
        this.years = years;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PassengerTypeQuantityTypeTPA_ExtensionsAge)) return false;
        PassengerTypeQuantityTypeTPA_ExtensionsAge other = (PassengerTypeQuantityTypeTPA_ExtensionsAge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.years == other.getYears();
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
        _hashCode += getYears();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PassengerTypeQuantityTypeTPA_ExtensionsAge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PassengerTypeQuantityType>TPA_Extensions>Age"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("years");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Years"));
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
