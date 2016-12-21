/**
 * AdvResTicketingTypeAdvReservation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AdvResTicketingTypeAdvReservation  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.TimeOrDateTimeType latestTimeOfDay;  // attribute

    private java.lang.String latestPeriod;  // attribute

    private org.opentravel.www.OTA._2003._05.StayUnitType latestUnit;  // attribute

    public AdvResTicketingTypeAdvReservation() {
    }

    public AdvResTicketingTypeAdvReservation(
           org.opentravel.www.OTA._2003._05.TimeOrDateTimeType latestTimeOfDay,
           java.lang.String latestPeriod,
           org.opentravel.www.OTA._2003._05.StayUnitType latestUnit) {
           this.latestTimeOfDay = latestTimeOfDay;
           this.latestPeriod = latestPeriod;
           this.latestUnit = latestUnit;
    }


    /**
     * Gets the latestTimeOfDay value for this AdvResTicketingTypeAdvReservation.
     * 
     * @return latestTimeOfDay
     */
    public org.opentravel.www.OTA._2003._05.TimeOrDateTimeType getLatestTimeOfDay() {
        return latestTimeOfDay;
    }


    /**
     * Sets the latestTimeOfDay value for this AdvResTicketingTypeAdvReservation.
     * 
     * @param latestTimeOfDay
     */
    public void setLatestTimeOfDay(org.opentravel.www.OTA._2003._05.TimeOrDateTimeType latestTimeOfDay) {
        this.latestTimeOfDay = latestTimeOfDay;
    }


    /**
     * Gets the latestPeriod value for this AdvResTicketingTypeAdvReservation.
     * 
     * @return latestPeriod
     */
    public java.lang.String getLatestPeriod() {
        return latestPeriod;
    }


    /**
     * Sets the latestPeriod value for this AdvResTicketingTypeAdvReservation.
     * 
     * @param latestPeriod
     */
    public void setLatestPeriod(java.lang.String latestPeriod) {
        this.latestPeriod = latestPeriod;
    }


    /**
     * Gets the latestUnit value for this AdvResTicketingTypeAdvReservation.
     * 
     * @return latestUnit
     */
    public org.opentravel.www.OTA._2003._05.StayUnitType getLatestUnit() {
        return latestUnit;
    }


    /**
     * Sets the latestUnit value for this AdvResTicketingTypeAdvReservation.
     * 
     * @param latestUnit
     */
    public void setLatestUnit(org.opentravel.www.OTA._2003._05.StayUnitType latestUnit) {
        this.latestUnit = latestUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvResTicketingTypeAdvReservation)) return false;
        AdvResTicketingTypeAdvReservation other = (AdvResTicketingTypeAdvReservation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.latestTimeOfDay==null && other.getLatestTimeOfDay()==null) || 
             (this.latestTimeOfDay!=null &&
              this.latestTimeOfDay.equals(other.getLatestTimeOfDay()))) &&
            ((this.latestPeriod==null && other.getLatestPeriod()==null) || 
             (this.latestPeriod!=null &&
              this.latestPeriod.equals(other.getLatestPeriod()))) &&
            ((this.latestUnit==null && other.getLatestUnit()==null) || 
             (this.latestUnit!=null &&
              this.latestUnit.equals(other.getLatestUnit())));
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
        if (getLatestTimeOfDay() != null) {
            _hashCode += getLatestTimeOfDay().hashCode();
        }
        if (getLatestPeriod() != null) {
            _hashCode += getLatestPeriod().hashCode();
        }
        if (getLatestUnit() != null) {
            _hashCode += getLatestUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdvResTicketingTypeAdvReservation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AdvResTicketingType>AdvReservation"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("latestTimeOfDay");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LatestTimeOfDay"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeOrDateTimeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("latestPeriod");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LatestPeriod"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NumericStringLength1to3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("latestUnit");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LatestUnit"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StayUnitType"));
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
