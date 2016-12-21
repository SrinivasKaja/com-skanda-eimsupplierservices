/**
 * TravelDateTimeTypeArrivalDates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class TravelDateTimeTypeArrivalDates  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.Day day;

    private org.opentravel.www.OTA._2003._05.DaysRange daysRange;

    public TravelDateTimeTypeArrivalDates() {
    }

    public TravelDateTimeTypeArrivalDates(
           org.opentravel.www.OTA._2003._05.Day day,
           org.opentravel.www.OTA._2003._05.DaysRange daysRange) {
           this.day = day;
           this.daysRange = daysRange;
    }


    /**
     * Gets the day value for this TravelDateTimeTypeArrivalDates.
     * 
     * @return day
     */
    public org.opentravel.www.OTA._2003._05.Day getDay() {
        return day;
    }


    /**
     * Sets the day value for this TravelDateTimeTypeArrivalDates.
     * 
     * @param day
     */
    public void setDay(org.opentravel.www.OTA._2003._05.Day day) {
        this.day = day;
    }


    /**
     * Gets the daysRange value for this TravelDateTimeTypeArrivalDates.
     * 
     * @return daysRange
     */
    public org.opentravel.www.OTA._2003._05.DaysRange getDaysRange() {
        return daysRange;
    }


    /**
     * Sets the daysRange value for this TravelDateTimeTypeArrivalDates.
     * 
     * @param daysRange
     */
    public void setDaysRange(org.opentravel.www.OTA._2003._05.DaysRange daysRange) {
        this.daysRange = daysRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TravelDateTimeTypeArrivalDates)) return false;
        TravelDateTimeTypeArrivalDates other = (TravelDateTimeTypeArrivalDates) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            ((this.daysRange==null && other.getDaysRange()==null) || 
             (this.daysRange!=null &&
              this.daysRange.equals(other.getDaysRange())));
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
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        if (getDaysRange() != null) {
            _hashCode += getDaysRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TravelDateTimeTypeArrivalDates.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TravelDateTimeType>ArrivalDates"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">Day"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DaysRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">DaysRange"));
        elemField.setMinOccurs(0);
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
