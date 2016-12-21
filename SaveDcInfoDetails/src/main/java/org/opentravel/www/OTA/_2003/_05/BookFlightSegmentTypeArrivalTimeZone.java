/**
 * BookFlightSegmentTypeArrivalTimeZone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class BookFlightSegmentTypeArrivalTimeZone  implements java.io.Serializable {
    private float GMTOffset;  // attribute

    public BookFlightSegmentTypeArrivalTimeZone() {
    }

    public BookFlightSegmentTypeArrivalTimeZone(
           float GMTOffset) {
           this.GMTOffset = GMTOffset;
    }


    /**
     * Gets the GMTOffset value for this BookFlightSegmentTypeArrivalTimeZone.
     * 
     * @return GMTOffset
     */
    public float getGMTOffset() {
        return GMTOffset;
    }


    /**
     * Sets the GMTOffset value for this BookFlightSegmentTypeArrivalTimeZone.
     * 
     * @param GMTOffset
     */
    public void setGMTOffset(float GMTOffset) {
        this.GMTOffset = GMTOffset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookFlightSegmentTypeArrivalTimeZone)) return false;
        BookFlightSegmentTypeArrivalTimeZone other = (BookFlightSegmentTypeArrivalTimeZone) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.GMTOffset == other.getGMTOffset();
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
        _hashCode += new Float(getGMTOffset()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookFlightSegmentTypeArrivalTimeZone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BookFlightSegmentType>ArrivalTimeZone"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("GMTOffset");
        attrField.setXmlName(new javax.xml.namespace.QName("", "GMTOffset"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
