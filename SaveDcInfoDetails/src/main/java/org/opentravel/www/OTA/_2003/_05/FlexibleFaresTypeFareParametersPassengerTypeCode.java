/**
 * FlexibleFaresTypeFareParametersPassengerTypeCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class FlexibleFaresTypeFareParametersPassengerTypeCode  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;
    public FlexibleFaresTypeFareParametersPassengerTypeCode() {
    }

    // Simple Types must have a String constructor
    public FlexibleFaresTypeFareParametersPassengerTypeCode(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the stringLength1To8Value value for this FlexibleFaresTypeFareParametersPassengerTypeCode.
     * 
     * @return stringLength1To8Value
     */
    public java.lang.String getStringLength1To8Value() {
        return new java.lang.String(_value);
    }


    /**
     * Sets the _value value for this FlexibleFaresTypeFareParametersPassengerTypeCode.
     * 
     * @param _value
     */
    public void setStringLength1To8Value(java.lang.String _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the OTA_CodeTypeValue value for this FlexibleFaresTypeFareParametersPassengerTypeCode.
     * 
     * @return OTA_CodeTypeValue
     */
    public java.lang.String getOTA_CodeTypeValue() {
        return new java.lang.String(_value);
    }


    /**
     * Sets the _value value for this FlexibleFaresTypeFareParametersPassengerTypeCode.
     * 
     * @param _value
     */
    public void setOTA_CodeTypeValue(java.lang.String _value) {
        this._value = _value == null ? null : _value.toString();
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlexibleFaresTypeFareParametersPassengerTypeCode)) return false;
        FlexibleFaresTypeFareParametersPassengerTypeCode other = (FlexibleFaresTypeFareParametersPassengerTypeCode) obj;
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
        new org.apache.axis.description.TypeDesc(FlexibleFaresTypeFareParametersPassengerTypeCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>FlexibleFaresType>FareParameters>PassengerType>Code"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringLength1To8Value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StringLength1to8Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OTA_CodeTypeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OTA_CodeTypeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
