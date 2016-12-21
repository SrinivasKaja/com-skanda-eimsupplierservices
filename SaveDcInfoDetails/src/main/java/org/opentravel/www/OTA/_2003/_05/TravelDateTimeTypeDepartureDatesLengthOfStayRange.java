/**
 * TravelDateTimeTypeDepartureDatesLengthOfStayRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class TravelDateTimeTypeDepartureDatesLengthOfStayRange  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedShort minDays;  // attribute

    private org.apache.axis.types.UnsignedShort maxDays;  // attribute

    public TravelDateTimeTypeDepartureDatesLengthOfStayRange() {
    }

    public TravelDateTimeTypeDepartureDatesLengthOfStayRange(
           org.apache.axis.types.UnsignedShort minDays,
           org.apache.axis.types.UnsignedShort maxDays) {
           this.minDays = minDays;
           this.maxDays = maxDays;
    }


    /**
     * Gets the minDays value for this TravelDateTimeTypeDepartureDatesLengthOfStayRange.
     * 
     * @return minDays
     */
    public org.apache.axis.types.UnsignedShort getMinDays() {
        return minDays;
    }


    /**
     * Sets the minDays value for this TravelDateTimeTypeDepartureDatesLengthOfStayRange.
     * 
     * @param minDays
     */
    public void setMinDays(org.apache.axis.types.UnsignedShort minDays) {
        this.minDays = minDays;
    }


    /**
     * Gets the maxDays value for this TravelDateTimeTypeDepartureDatesLengthOfStayRange.
     * 
     * @return maxDays
     */
    public org.apache.axis.types.UnsignedShort getMaxDays() {
        return maxDays;
    }


    /**
     * Sets the maxDays value for this TravelDateTimeTypeDepartureDatesLengthOfStayRange.
     * 
     * @param maxDays
     */
    public void setMaxDays(org.apache.axis.types.UnsignedShort maxDays) {
        this.maxDays = maxDays;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TravelDateTimeTypeDepartureDatesLengthOfStayRange)) return false;
        TravelDateTimeTypeDepartureDatesLengthOfStayRange other = (TravelDateTimeTypeDepartureDatesLengthOfStayRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.minDays==null && other.getMinDays()==null) || 
             (this.minDays!=null &&
              this.minDays.equals(other.getMinDays()))) &&
            ((this.maxDays==null && other.getMaxDays()==null) || 
             (this.maxDays!=null &&
              this.maxDays.equals(other.getMaxDays())));
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
        if (getMinDays() != null) {
            _hashCode += getMinDays().hashCode();
        }
        if (getMaxDays() != null) {
            _hashCode += getMaxDays().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TravelDateTimeTypeDepartureDatesLengthOfStayRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TravelDateTimeType>DepartureDates>LengthOfStayRange"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("minDays");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MinDays"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxDays");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MaxDays"));
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
