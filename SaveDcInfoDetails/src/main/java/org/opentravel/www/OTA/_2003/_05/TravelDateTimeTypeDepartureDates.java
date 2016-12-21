/**
 * TravelDateTimeTypeDepartureDates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class TravelDateTimeTypeDepartureDates  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.Day day;

    private org.opentravel.www.OTA._2003._05.DaysRange daysRange;

    /* Amount of days between previous leg's DEPARTURE date and current
     * leg's DEPARTURE date. NOTE: Allowed only in 2nd or further "OriginDestinationInformation".
     * 
     * 											Example: for outbound departing on Jan 20, LengthOfStay/@Days="2"
     * means inbound departing on Jan 22. */
    private org.opentravel.www.OTA._2003._05.TravelDateTimeTypeDepartureDatesLengthOfStay lengthOfStay;

    /* See comment on "LengthOfStay" element. */
    private org.opentravel.www.OTA._2003._05.TravelDateTimeTypeDepartureDatesLengthOfStayRange lengthOfStayRange;

    public TravelDateTimeTypeDepartureDates() {
    }

    public TravelDateTimeTypeDepartureDates(
           org.opentravel.www.OTA._2003._05.Day day,
           org.opentravel.www.OTA._2003._05.DaysRange daysRange,
           org.opentravel.www.OTA._2003._05.TravelDateTimeTypeDepartureDatesLengthOfStay lengthOfStay,
           org.opentravel.www.OTA._2003._05.TravelDateTimeTypeDepartureDatesLengthOfStayRange lengthOfStayRange) {
           this.day = day;
           this.daysRange = daysRange;
           this.lengthOfStay = lengthOfStay;
           this.lengthOfStayRange = lengthOfStayRange;
    }


    /**
     * Gets the day value for this TravelDateTimeTypeDepartureDates.
     * 
     * @return day
     */
    public org.opentravel.www.OTA._2003._05.Day getDay() {
        return day;
    }


    /**
     * Sets the day value for this TravelDateTimeTypeDepartureDates.
     * 
     * @param day
     */
    public void setDay(org.opentravel.www.OTA._2003._05.Day day) {
        this.day = day;
    }


    /**
     * Gets the daysRange value for this TravelDateTimeTypeDepartureDates.
     * 
     * @return daysRange
     */
    public org.opentravel.www.OTA._2003._05.DaysRange getDaysRange() {
        return daysRange;
    }


    /**
     * Sets the daysRange value for this TravelDateTimeTypeDepartureDates.
     * 
     * @param daysRange
     */
    public void setDaysRange(org.opentravel.www.OTA._2003._05.DaysRange daysRange) {
        this.daysRange = daysRange;
    }


    /**
     * Gets the lengthOfStay value for this TravelDateTimeTypeDepartureDates.
     * 
     * @return lengthOfStay   * Amount of days between previous leg's DEPARTURE date and current
     * leg's DEPARTURE date. NOTE: Allowed only in 2nd or further "OriginDestinationInformation".
     * 
     * 											Example: for outbound departing on Jan 20, LengthOfStay/@Days="2"
     * means inbound departing on Jan 22.
     */
    public org.opentravel.www.OTA._2003._05.TravelDateTimeTypeDepartureDatesLengthOfStay getLengthOfStay() {
        return lengthOfStay;
    }


    /**
     * Sets the lengthOfStay value for this TravelDateTimeTypeDepartureDates.
     * 
     * @param lengthOfStay   * Amount of days between previous leg's DEPARTURE date and current
     * leg's DEPARTURE date. NOTE: Allowed only in 2nd or further "OriginDestinationInformation".
     * 
     * 											Example: for outbound departing on Jan 20, LengthOfStay/@Days="2"
     * means inbound departing on Jan 22.
     */
    public void setLengthOfStay(org.opentravel.www.OTA._2003._05.TravelDateTimeTypeDepartureDatesLengthOfStay lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }


    /**
     * Gets the lengthOfStayRange value for this TravelDateTimeTypeDepartureDates.
     * 
     * @return lengthOfStayRange   * See comment on "LengthOfStay" element.
     */
    public org.opentravel.www.OTA._2003._05.TravelDateTimeTypeDepartureDatesLengthOfStayRange getLengthOfStayRange() {
        return lengthOfStayRange;
    }


    /**
     * Sets the lengthOfStayRange value for this TravelDateTimeTypeDepartureDates.
     * 
     * @param lengthOfStayRange   * See comment on "LengthOfStay" element.
     */
    public void setLengthOfStayRange(org.opentravel.www.OTA._2003._05.TravelDateTimeTypeDepartureDatesLengthOfStayRange lengthOfStayRange) {
        this.lengthOfStayRange = lengthOfStayRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TravelDateTimeTypeDepartureDates)) return false;
        TravelDateTimeTypeDepartureDates other = (TravelDateTimeTypeDepartureDates) obj;
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
              this.daysRange.equals(other.getDaysRange()))) &&
            ((this.lengthOfStay==null && other.getLengthOfStay()==null) || 
             (this.lengthOfStay!=null &&
              this.lengthOfStay.equals(other.getLengthOfStay()))) &&
            ((this.lengthOfStayRange==null && other.getLengthOfStayRange()==null) || 
             (this.lengthOfStayRange!=null &&
              this.lengthOfStayRange.equals(other.getLengthOfStayRange())));
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
        if (getLengthOfStay() != null) {
            _hashCode += getLengthOfStay().hashCode();
        }
        if (getLengthOfStayRange() != null) {
            _hashCode += getLengthOfStayRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TravelDateTimeTypeDepartureDates.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TravelDateTimeType>DepartureDates"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lengthOfStay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "LengthOfStay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TravelDateTimeType>DepartureDates>LengthOfStay"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lengthOfStayRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "LengthOfStayRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TravelDateTimeType>DepartureDates>LengthOfStayRange"));
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
