/**
 * DateRangeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class DateRangeType  implements java.io.Serializable {
    private java.util.Date outboundDate;  // attribute

    private short dateRange;  // attribute

    public DateRangeType() {
    }

    public DateRangeType(
           java.util.Date outboundDate,
           short dateRange) {
           this.outboundDate = outboundDate;
           this.dateRange = dateRange;
    }


    /**
     * Gets the outboundDate value for this DateRangeType.
     * 
     * @return outboundDate
     */
    public java.util.Date getOutboundDate() {
        return outboundDate;
    }


    /**
     * Sets the outboundDate value for this DateRangeType.
     * 
     * @param outboundDate
     */
    public void setOutboundDate(java.util.Date outboundDate) {
        this.outboundDate = outboundDate;
    }


    /**
     * Gets the dateRange value for this DateRangeType.
     * 
     * @return dateRange
     */
    public short getDateRange() {
        return dateRange;
    }


    /**
     * Sets the dateRange value for this DateRangeType.
     * 
     * @param dateRange
     */
    public void setDateRange(short dateRange) {
        this.dateRange = dateRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateRangeType)) return false;
        DateRangeType other = (DateRangeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outboundDate==null && other.getOutboundDate()==null) || 
             (this.outboundDate!=null &&
              this.outboundDate.equals(other.getOutboundDate()))) &&
            this.dateRange == other.getDateRange();
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
        if (getOutboundDate() != null) {
            _hashCode += getOutboundDate().hashCode();
        }
        _hashCode += getDateRange();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateRangeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DateRangeType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("outboundDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OutboundDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dateRange");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DateRange"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
