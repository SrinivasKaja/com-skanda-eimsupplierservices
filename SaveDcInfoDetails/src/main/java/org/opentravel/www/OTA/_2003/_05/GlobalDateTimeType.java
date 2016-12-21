/**
 * GlobalDateTimeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class GlobalDateTimeType  extends org.opentravel.www.OTA._2003._05.DateTimeType  implements java.io.Serializable {
    private java.lang.String dateTime;  // attribute

    public GlobalDateTimeType() {
    }

    public GlobalDateTimeType(
           java.lang.String timeWindowStart,
           java.lang.String timeWindowEnd,
           org.apache.axis.types.NonNegativeInteger timeTolerance,
           org.apache.axis.types.NonNegativeInteger dateFlexibility,
           org.apache.axis.types.NonNegativeInteger maxOptionsPerDate,
           org.apache.axis.types.NonNegativeInteger connectionTimeMin,
           org.apache.axis.types.NonNegativeInteger connectionTimeMax,
           java.lang.String dateTime) {
        super(
            timeWindowStart,
            timeWindowEnd,
            timeTolerance,
            dateFlexibility,
            maxOptionsPerDate,
            connectionTimeMin,
            connectionTimeMax);
        this.dateTime = dateTime;
    }


    /**
     * Gets the dateTime value for this GlobalDateTimeType.
     * 
     * @return dateTime
     */
    public java.lang.String getDateTime() {
        return dateTime;
    }


    /**
     * Sets the dateTime value for this GlobalDateTimeType.
     * 
     * @param dateTime
     */
    public void setDateTime(java.lang.String dateTime) {
        this.dateTime = dateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalDateTimeType)) return false;
        GlobalDateTimeType other = (GlobalDateTimeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dateTime==null && other.getDateTime()==null) || 
             (this.dateTime!=null &&
              this.dateTime.equals(other.getDateTime())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDateTime() != null) {
            _hashCode += getDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalDateTimeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "GlobalDateTimeType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dateTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DateTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "IntDateTime"));
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
