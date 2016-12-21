/**
 * OperatingAirlineType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * This is an extension of CompanyNameType to include a FlightNumber.
 */
public class OperatingAirlineType  extends org.opentravel.www.OTA._2003._05.CompanyNameType  implements java.io.Serializable {
    private java.lang.String flightNumber;  // attribute

    public OperatingAirlineType() {
    }

    // Simple Types must have a String constructor
    public OperatingAirlineType(java.lang.String _value) {
        super(_value);
    }


    /**
     * Gets the flightNumber value for this OperatingAirlineType.
     * 
     * @return flightNumber
     */
    public java.lang.String getFlightNumber() {
        return flightNumber;
    }


    /**
     * Sets the flightNumber value for this OperatingAirlineType.
     * 
     * @param flightNumber
     */
    public void setFlightNumber(java.lang.String flightNumber) {
        this.flightNumber = flightNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperatingAirlineType)) return false;
        OperatingAirlineType other = (OperatingAirlineType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.flightNumber==null && other.getFlightNumber()==null) || 
             (this.flightNumber!=null &&
              this.flightNumber.equals(other.getFlightNumber())));
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
        if (getFlightNumber() != null) {
            _hashCode += getFlightNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperatingAirlineType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OperatingAirlineType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("flightNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FlightNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightNumberType"));
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
