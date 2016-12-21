/**
 * TravelDateTimeTypeDepartureDatesLengthOfStay.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class TravelDateTimeTypeDepartureDatesLengthOfStay  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedShort days;  // attribute

    public TravelDateTimeTypeDepartureDatesLengthOfStay() {
    }

    public TravelDateTimeTypeDepartureDatesLengthOfStay(
           org.apache.axis.types.UnsignedShort days) {
           this.days = days;
    }


    /**
     * Gets the days value for this TravelDateTimeTypeDepartureDatesLengthOfStay.
     * 
     * @return days
     */
    public org.apache.axis.types.UnsignedShort getDays() {
        return days;
    }


    /**
     * Sets the days value for this TravelDateTimeTypeDepartureDatesLengthOfStay.
     * 
     * @param days
     */
    public void setDays(org.apache.axis.types.UnsignedShort days) {
        this.days = days;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TravelDateTimeTypeDepartureDatesLengthOfStay)) return false;
        TravelDateTimeTypeDepartureDatesLengthOfStay other = (TravelDateTimeTypeDepartureDatesLengthOfStay) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.days==null && other.getDays()==null) || 
             (this.days!=null &&
              this.days.equals(other.getDays())));
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
        if (getDays() != null) {
            _hashCode += getDays().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TravelDateTimeTypeDepartureDatesLengthOfStay.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TravelDateTimeType>DepartureDates>LengthOfStay"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("days");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Days"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
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
