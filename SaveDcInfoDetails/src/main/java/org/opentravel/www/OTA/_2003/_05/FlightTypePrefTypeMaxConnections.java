/**
 * FlightTypePrefTypeMaxConnections.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class FlightTypePrefTypeMaxConnections  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;
    public FlightTypePrefTypeMaxConnections() {
    }

    // Simple Types must have a String constructor
    public FlightTypePrefTypeMaxConnections(java.lang.String _value) {
        this._value = _value;
    }
    public FlightTypePrefTypeMaxConnections(org.apache.axis.types.NonNegativeInteger _value) {
        setNonNegativeIntegerValue(_value);
    }

    public FlightTypePrefTypeMaxConnections(boolean _value) {
        setBooleanValue(_value);
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the nonNegativeIntegerValue value for this FlightTypePrefTypeMaxConnections.
     * 
     * @return nonNegativeIntegerValue
     */
    public org.apache.axis.types.NonNegativeInteger getNonNegativeIntegerValue() {
        return new org.apache.axis.types.NonNegativeInteger(_value);
    }


    /**
     * Sets the _value value for this FlightTypePrefTypeMaxConnections.
     * 
     * @param _value
     */
    public void setNonNegativeIntegerValue(org.apache.axis.types.NonNegativeInteger _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the booleanValue value for this FlightTypePrefTypeMaxConnections.
     * 
     * @return booleanValue
     */
    public boolean isBooleanValue() {
        return new Boolean(_value).booleanValue();
    }


    /**
     * Sets the _value value for this FlightTypePrefTypeMaxConnections.
     * 
     * @param _value
     */
    public void setBooleanValue(boolean _value) {
        this._value = new Boolean(_value).toString();
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightTypePrefTypeMaxConnections)) return false;
        FlightTypePrefTypeMaxConnections other = (FlightTypePrefTypeMaxConnections) obj;
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
        new org.apache.axis.description.TypeDesc(FlightTypePrefTypeMaxConnections.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FlightTypePrefType>MaxConnections"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonNegativeIntegerValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonNegativeIntegerValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "booleanValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
