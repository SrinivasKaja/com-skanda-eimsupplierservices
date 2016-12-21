/**
 * FareComponentTaxesTypeFlightSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class FareComponentTaxesTypeFlightSegment  implements java.io.Serializable {
    private java.lang.Object departureAirportCode;  // attribute

    private java.lang.Object arrivalAirportCode;  // attribute

    public FareComponentTaxesTypeFlightSegment() {
    }

    public FareComponentTaxesTypeFlightSegment(
           java.lang.Object departureAirportCode,
           java.lang.Object arrivalAirportCode) {
           this.departureAirportCode = departureAirportCode;
           this.arrivalAirportCode = arrivalAirportCode;
    }


    /**
     * Gets the departureAirportCode value for this FareComponentTaxesTypeFlightSegment.
     * 
     * @return departureAirportCode
     */
    public java.lang.Object getDepartureAirportCode() {
        return departureAirportCode;
    }


    /**
     * Sets the departureAirportCode value for this FareComponentTaxesTypeFlightSegment.
     * 
     * @param departureAirportCode
     */
    public void setDepartureAirportCode(java.lang.Object departureAirportCode) {
        this.departureAirportCode = departureAirportCode;
    }


    /**
     * Gets the arrivalAirportCode value for this FareComponentTaxesTypeFlightSegment.
     * 
     * @return arrivalAirportCode
     */
    public java.lang.Object getArrivalAirportCode() {
        return arrivalAirportCode;
    }


    /**
     * Sets the arrivalAirportCode value for this FareComponentTaxesTypeFlightSegment.
     * 
     * @param arrivalAirportCode
     */
    public void setArrivalAirportCode(java.lang.Object arrivalAirportCode) {
        this.arrivalAirportCode = arrivalAirportCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareComponentTaxesTypeFlightSegment)) return false;
        FareComponentTaxesTypeFlightSegment other = (FareComponentTaxesTypeFlightSegment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.departureAirportCode==null && other.getDepartureAirportCode()==null) || 
             (this.departureAirportCode!=null &&
              this.departureAirportCode.equals(other.getDepartureAirportCode()))) &&
            ((this.arrivalAirportCode==null && other.getArrivalAirportCode()==null) || 
             (this.arrivalAirportCode!=null &&
              this.arrivalAirportCode.equals(other.getArrivalAirportCode())));
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
        if (getDepartureAirportCode() != null) {
            _hashCode += getDepartureAirportCode().hashCode();
        }
        if (getArrivalAirportCode() != null) {
            _hashCode += getArrivalAirportCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FareComponentTaxesTypeFlightSegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareComponentTaxesType>FlightSegment"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("departureAirportCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DepartureAirportCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("arrivalAirportCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ArrivalAirportCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
