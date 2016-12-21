/**
 * AirSearchPrefsTypeTPA_ExtensionsLongConnectPoints.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirSearchPrefsTypeTPA_ExtensionsLongConnectPoints  implements java.io.Serializable {
    private short min;  // attribute

    private short max;  // attribute

    public AirSearchPrefsTypeTPA_ExtensionsLongConnectPoints() {
    }

    public AirSearchPrefsTypeTPA_ExtensionsLongConnectPoints(
           short min,
           short max) {
           this.min = min;
           this.max = max;
    }


    /**
     * Gets the min value for this AirSearchPrefsTypeTPA_ExtensionsLongConnectPoints.
     * 
     * @return min
     */
    public short getMin() {
        return min;
    }


    /**
     * Sets the min value for this AirSearchPrefsTypeTPA_ExtensionsLongConnectPoints.
     * 
     * @param min
     */
    public void setMin(short min) {
        this.min = min;
    }


    /**
     * Gets the max value for this AirSearchPrefsTypeTPA_ExtensionsLongConnectPoints.
     * 
     * @return max
     */
    public short getMax() {
        return max;
    }


    /**
     * Sets the max value for this AirSearchPrefsTypeTPA_ExtensionsLongConnectPoints.
     * 
     * @param max
     */
    public void setMax(short max) {
        this.max = max;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirSearchPrefsTypeTPA_ExtensionsLongConnectPoints)) return false;
        AirSearchPrefsTypeTPA_ExtensionsLongConnectPoints other = (AirSearchPrefsTypeTPA_ExtensionsLongConnectPoints) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.min == other.getMin() &&
            this.max == other.getMax();
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
        _hashCode += getMin();
        _hashCode += getMax();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirSearchPrefsTypeTPA_ExtensionsLongConnectPoints.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>LongConnectPoints"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("min");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Min"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("max");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Max"));
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
