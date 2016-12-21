/**
 * RequestLocationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Code and optional string to describe a location point.
 */
public class RequestLocationType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private java.lang.String locationCode;  // attribute

    private java.lang.String airportsGroup;  // attribute

    private java.lang.String codeContext;  // attribute

    public RequestLocationType() {
    }

    // Simple Types must have a String constructor
    public RequestLocationType(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this RequestLocationType.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this RequestLocationType.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the locationCode value for this RequestLocationType.
     * 
     * @return locationCode
     */
    public java.lang.String getLocationCode() {
        return locationCode;
    }


    /**
     * Sets the locationCode value for this RequestLocationType.
     * 
     * @param locationCode
     */
    public void setLocationCode(java.lang.String locationCode) {
        this.locationCode = locationCode;
    }


    /**
     * Gets the airportsGroup value for this RequestLocationType.
     * 
     * @return airportsGroup
     */
    public java.lang.String getAirportsGroup() {
        return airportsGroup;
    }


    /**
     * Sets the airportsGroup value for this RequestLocationType.
     * 
     * @param airportsGroup
     */
    public void setAirportsGroup(java.lang.String airportsGroup) {
        this.airportsGroup = airportsGroup;
    }


    /**
     * Gets the codeContext value for this RequestLocationType.
     * 
     * @return codeContext
     */
    public java.lang.String getCodeContext() {
        return codeContext;
    }


    /**
     * Sets the codeContext value for this RequestLocationType.
     * 
     * @param codeContext
     */
    public void setCodeContext(java.lang.String codeContext) {
        this.codeContext = codeContext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestLocationType)) return false;
        RequestLocationType other = (RequestLocationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.locationCode==null && other.getLocationCode()==null) || 
             (this.locationCode!=null &&
              this.locationCode.equals(other.getLocationCode()))) &&
            ((this.airportsGroup==null && other.getAirportsGroup()==null) || 
             (this.airportsGroup!=null &&
              this.airportsGroup.equals(other.getAirportsGroup()))) &&
            ((this.codeContext==null && other.getCodeContext()==null) || 
             (this.codeContext!=null &&
              this.codeContext.equals(other.getCodeContext())));
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
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getLocationCode() != null) {
            _hashCode += getLocationCode().hashCode();
        }
        if (getAirportsGroup() != null) {
            _hashCode += getAirportsGroup().hashCode();
        }
        if (getCodeContext() != null) {
            _hashCode += getCodeContext().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestLocationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RequestLocationType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("locationCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LocationCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">RequestLocationType>LocationCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("airportsGroup");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AirportsGroup"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">RequestLocationType>AirportsGroup"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("codeContext");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CodeContext"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to32"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
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
