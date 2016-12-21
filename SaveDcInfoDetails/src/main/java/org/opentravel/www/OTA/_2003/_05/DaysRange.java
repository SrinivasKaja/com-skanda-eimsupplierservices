/**
 * DaysRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class DaysRange  implements java.io.Serializable {
    private java.lang.String fromDate;  // attribute

    private java.lang.String toDate;  // attribute

    private java.lang.String weekDays;  // attribute

    public DaysRange() {
    }

    public DaysRange(
           java.lang.String fromDate,
           java.lang.String toDate,
           java.lang.String weekDays) {
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.weekDays = weekDays;
    }


    /**
     * Gets the fromDate value for this DaysRange.
     * 
     * @return fromDate
     */
    public java.lang.String getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this DaysRange.
     * 
     * @param fromDate
     */
    public void setFromDate(java.lang.String fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this DaysRange.
     * 
     * @return toDate
     */
    public java.lang.String getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this DaysRange.
     * 
     * @param toDate
     */
    public void setToDate(java.lang.String toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the weekDays value for this DaysRange.
     * 
     * @return weekDays
     */
    public java.lang.String getWeekDays() {
        return weekDays;
    }


    /**
     * Sets the weekDays value for this DaysRange.
     * 
     * @param weekDays
     */
    public void setWeekDays(java.lang.String weekDays) {
        this.weekDays = weekDays;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DaysRange)) return false;
        DaysRange other = (DaysRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
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
        int _hashCode = 1;
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getWeekDays() != null) {
            _hashCode += getWeekDays().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DaysRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">DaysRange"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fromDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FromDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ISellDateType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("toDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ToDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ISellDateType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("weekDays");
        attrField.setXmlName(new javax.xml.namespace.QName("", "WeekDays"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ISellWeekDaysType"));
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
