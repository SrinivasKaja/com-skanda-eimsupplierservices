/**
 * AirSearchPrefsTypeFrequentFlyer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirSearchPrefsTypeFrequentFlyer  implements java.io.Serializable {
    private short status;  // attribute

    private java.lang.String airlineCode;  // attribute

    public AirSearchPrefsTypeFrequentFlyer() {
    }

    public AirSearchPrefsTypeFrequentFlyer(
           short status,
           java.lang.String airlineCode) {
           this.status = status;
           this.airlineCode = airlineCode;
    }


    /**
     * Gets the status value for this AirSearchPrefsTypeFrequentFlyer.
     * 
     * @return status
     */
    public short getStatus() {
        return status;
    }


    /**
     * Sets the status value for this AirSearchPrefsTypeFrequentFlyer.
     * 
     * @param status
     */
    public void setStatus(short status) {
        this.status = status;
    }


    /**
     * Gets the airlineCode value for this AirSearchPrefsTypeFrequentFlyer.
     * 
     * @return airlineCode
     */
    public java.lang.String getAirlineCode() {
        return airlineCode;
    }


    /**
     * Sets the airlineCode value for this AirSearchPrefsTypeFrequentFlyer.
     * 
     * @param airlineCode
     */
    public void setAirlineCode(java.lang.String airlineCode) {
        this.airlineCode = airlineCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirSearchPrefsTypeFrequentFlyer)) return false;
        AirSearchPrefsTypeFrequentFlyer other = (AirSearchPrefsTypeFrequentFlyer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.status == other.getStatus() &&
            ((this.airlineCode==null && other.getAirlineCode()==null) || 
             (this.airlineCode!=null &&
              this.airlineCode.equals(other.getAirlineCode())));
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
        _hashCode += getStatus();
        if (getAirlineCode() != null) {
            _hashCode += getAirlineCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirSearchPrefsTypeFrequentFlyer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirSearchPrefsType>FrequentFlyer"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("status");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("airlineCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AirlineCode"));
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
