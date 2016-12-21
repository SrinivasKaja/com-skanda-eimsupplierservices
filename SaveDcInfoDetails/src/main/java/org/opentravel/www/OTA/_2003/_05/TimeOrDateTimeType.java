/**
 * TimeOrDateTimeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Allows for the specification of a date time or just time.
 */
public class TimeOrDateTimeType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;
    public TimeOrDateTimeType() {
    }

    // Simple Types must have a String constructor
    public TimeOrDateTimeType(java.lang.String _value) {
        this._value = _value;
    }
    public TimeOrDateTimeType(org.apache.axis.types.Time _value) {
        setTimeValue(_value);
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the stringValue value for this TimeOrDateTimeType.
     * 
     * @return stringValue
     */
    public java.lang.String getStringValue() {
        return new java.lang.String(_value);
    }


    /**
     * Sets the _value value for this TimeOrDateTimeType.
     * 
     * @param _value
     */
    public void setStringValue(java.lang.String _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the timeValue value for this TimeOrDateTimeType.
     * 
     * @return timeValue
     */
    public org.apache.axis.types.Time getTimeValue() {
        return new org.apache.axis.types.Time(_value);
    }


    /**
     * Sets the _value value for this TimeOrDateTimeType.
     * 
     * @param _value
     */
    public void setTimeValue(org.apache.axis.types.Time _value) {
        this._value = _value == null ? null : _value.toString();
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeOrDateTimeType)) return false;
        TimeOrDateTimeType other = (TimeOrDateTimeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&  this.toString().equals(obj.toString());
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
        if (this._value != null) {
            _hashCode += this._value.hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeOrDateTimeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeOrDateTimeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stringValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
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
