/**
 * OTA_AirLowFareSearchRQLegDepartureDateTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQLegDepartureDateTime  extends org.opentravel.www.OTA._2003._05.GlobalDateTimeType  implements java.io.Serializable {
    private java.lang.String weekDays;  // attribute

    public OTA_AirLowFareSearchRQLegDepartureDateTime() {
    }

    public OTA_AirLowFareSearchRQLegDepartureDateTime(
           java.lang.String timeWindowStart,
           java.lang.String timeWindowEnd,
           org.apache.axis.types.NonNegativeInteger timeTolerance,
           org.apache.axis.types.NonNegativeInteger dateFlexibility,
           org.apache.axis.types.NonNegativeInteger maxOptionsPerDate,
           org.apache.axis.types.NonNegativeInteger connectionTimeMin,
           org.apache.axis.types.NonNegativeInteger connectionTimeMax,
           java.lang.String dateTime,
           java.lang.String weekDays) {
        super(
            timeWindowStart,
            timeWindowEnd,
            timeTolerance,
            dateFlexibility,
            maxOptionsPerDate,
            connectionTimeMin,
            connectionTimeMax,
            dateTime);
        this.weekDays = weekDays;
    }


    /**
     * Gets the weekDays value for this OTA_AirLowFareSearchRQLegDepartureDateTime.
     * 
     * @return weekDays
     */
    public java.lang.String getWeekDays() {
        return weekDays;
    }


    /**
     * Sets the weekDays value for this OTA_AirLowFareSearchRQLegDepartureDateTime.
     * 
     * @param weekDays
     */
    public void setWeekDays(java.lang.String weekDays) {
        this.weekDays = weekDays;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQLegDepartureDateTime)) return false;
        OTA_AirLowFareSearchRQLegDepartureDateTime other = (OTA_AirLowFareSearchRQLegDepartureDateTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.weekDays==null && other.getWeekDays()==null) || 
             (this.weekDays!=null &&
              this.weekDays.equals(other.getWeekDays())));
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
        if (getWeekDays() != null) {
            _hashCode += getWeekDays().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQLegDepartureDateTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>Leg>DepartureDateTime"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("weekDays");
        attrField.setXmlName(new javax.xml.namespace.QName("", "WeekDays"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>Leg>DepartureDateTime>WeekDays"));
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
