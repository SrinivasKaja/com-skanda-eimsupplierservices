/**
 * AirSearchPrefsTypeTPA_ExtensionsLongConnectTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirSearchPrefsTypeTPA_ExtensionsLongConnectTime  implements java.io.Serializable {
    private short min;  // attribute

    private short max;  // attribute

    private boolean enable;  // attribute

    public AirSearchPrefsTypeTPA_ExtensionsLongConnectTime() {
    }

    public AirSearchPrefsTypeTPA_ExtensionsLongConnectTime(
           short min,
           short max,
           boolean enable) {
           this.min = min;
           this.max = max;
           this.enable = enable;
    }


    /**
     * Gets the min value for this AirSearchPrefsTypeTPA_ExtensionsLongConnectTime.
     * 
     * @return min
     */
    public short getMin() {
        return min;
    }


    /**
     * Sets the min value for this AirSearchPrefsTypeTPA_ExtensionsLongConnectTime.
     * 
     * @param min
     */
    public void setMin(short min) {
        this.min = min;
    }


    /**
     * Gets the max value for this AirSearchPrefsTypeTPA_ExtensionsLongConnectTime.
     * 
     * @return max
     */
    public short getMax() {
        return max;
    }


    /**
     * Sets the max value for this AirSearchPrefsTypeTPA_ExtensionsLongConnectTime.
     * 
     * @param max
     */
    public void setMax(short max) {
        this.max = max;
    }


    /**
     * Gets the enable value for this AirSearchPrefsTypeTPA_ExtensionsLongConnectTime.
     * 
     * @return enable
     */
    public boolean isEnable() {
        return enable;
    }


    /**
     * Sets the enable value for this AirSearchPrefsTypeTPA_ExtensionsLongConnectTime.
     * 
     * @param enable
     */
    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirSearchPrefsTypeTPA_ExtensionsLongConnectTime)) return false;
        AirSearchPrefsTypeTPA_ExtensionsLongConnectTime other = (AirSearchPrefsTypeTPA_ExtensionsLongConnectTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.min == other.getMin() &&
            this.max == other.getMax() &&
            this.enable == other.isEnable();
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
        _hashCode += (isEnable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirSearchPrefsTypeTPA_ExtensionsLongConnectTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>LongConnectTime"));
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
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("enable");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Enable"));
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
