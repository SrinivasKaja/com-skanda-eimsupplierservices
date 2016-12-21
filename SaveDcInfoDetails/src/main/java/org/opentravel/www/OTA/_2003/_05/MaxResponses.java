/**
 * MaxResponses.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class MaxResponses  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;
    public MaxResponses() {
    }

    // Simple Types must have a String constructor
    public MaxResponses(java.lang.String _value) {
        this._value = _value;
    }
    public MaxResponses(org.apache.axis.types.PositiveInteger _value) {
        setPositiveIntegerValue(_value);
    }

    public MaxResponses(java.math.BigInteger _value) {
        setIntegerValue(_value);
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the positiveIntegerValue value for this MaxResponses.
     * 
     * @return positiveIntegerValue
     */
    public org.apache.axis.types.PositiveInteger getPositiveIntegerValue() {
        return new org.apache.axis.types.PositiveInteger(_value);
    }


    /**
     * Sets the _value value for this MaxResponses.
     * 
     * @param _value
     */
    public void setPositiveIntegerValue(org.apache.axis.types.PositiveInteger _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the integerValue value for this MaxResponses.
     * 
     * @return integerValue
     */
    public java.math.BigInteger getIntegerValue() {
        return new java.math.BigInteger(_value);
    }


    /**
     * Sets the _value value for this MaxResponses.
     * 
     * @param _value
     */
    public void setIntegerValue(java.math.BigInteger _value) {
        this._value = _value == null ? null : _value.toString();
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MaxResponses)) return false;
        MaxResponses other = (MaxResponses) obj;
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
        new org.apache.axis.description.TypeDesc(MaxResponses.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">MaxResponses"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("positiveIntegerValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "positiveIntegerValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integerValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "integerValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
