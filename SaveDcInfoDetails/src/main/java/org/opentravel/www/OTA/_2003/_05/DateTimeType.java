/**
 * DateTimeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public abstract class DateTimeType  implements java.io.Serializable {
    private java.lang.String timeWindowStart;  // attribute

    private java.lang.String timeWindowEnd;  // attribute

    private org.apache.axis.types.NonNegativeInteger timeTolerance;  // attribute

    private org.apache.axis.types.NonNegativeInteger dateFlexibility;  // attribute

    private org.apache.axis.types.NonNegativeInteger maxOptionsPerDate;  // attribute

    private org.apache.axis.types.NonNegativeInteger connectionTimeMin;  // attribute

    private org.apache.axis.types.NonNegativeInteger connectionTimeMax;  // attribute

    public DateTimeType() {
    }

    public DateTimeType(
           java.lang.String timeWindowStart,
           java.lang.String timeWindowEnd,
           org.apache.axis.types.NonNegativeInteger timeTolerance,
           org.apache.axis.types.NonNegativeInteger dateFlexibility,
           org.apache.axis.types.NonNegativeInteger maxOptionsPerDate,
           org.apache.axis.types.NonNegativeInteger connectionTimeMin,
           org.apache.axis.types.NonNegativeInteger connectionTimeMax) {
           this.timeWindowStart = timeWindowStart;
           this.timeWindowEnd = timeWindowEnd;
           this.timeTolerance = timeTolerance;
           this.dateFlexibility = dateFlexibility;
           this.maxOptionsPerDate = maxOptionsPerDate;
           this.connectionTimeMin = connectionTimeMin;
           this.connectionTimeMax = connectionTimeMax;
    }


    /**
     * Gets the timeWindowStart value for this DateTimeType.
     * 
     * @return timeWindowStart
     */
    public java.lang.String getTimeWindowStart() {
        return timeWindowStart;
    }


    /**
     * Sets the timeWindowStart value for this DateTimeType.
     * 
     * @param timeWindowStart
     */
    public void setTimeWindowStart(java.lang.String timeWindowStart) {
        this.timeWindowStart = timeWindowStart;
    }


    /**
     * Gets the timeWindowEnd value for this DateTimeType.
     * 
     * @return timeWindowEnd
     */
    public java.lang.String getTimeWindowEnd() {
        return timeWindowEnd;
    }


    /**
     * Sets the timeWindowEnd value for this DateTimeType.
     * 
     * @param timeWindowEnd
     */
    public void setTimeWindowEnd(java.lang.String timeWindowEnd) {
        this.timeWindowEnd = timeWindowEnd;
    }


    /**
     * Gets the timeTolerance value for this DateTimeType.
     * 
     * @return timeTolerance
     */
    public org.apache.axis.types.NonNegativeInteger getTimeTolerance() {
        return timeTolerance;
    }


    /**
     * Sets the timeTolerance value for this DateTimeType.
     * 
     * @param timeTolerance
     */
    public void setTimeTolerance(org.apache.axis.types.NonNegativeInteger timeTolerance) {
        this.timeTolerance = timeTolerance;
    }


    /**
     * Gets the dateFlexibility value for this DateTimeType.
     * 
     * @return dateFlexibility
     */
    public org.apache.axis.types.NonNegativeInteger getDateFlexibility() {
        return dateFlexibility;
    }


    /**
     * Sets the dateFlexibility value for this DateTimeType.
     * 
     * @param dateFlexibility
     */
    public void setDateFlexibility(org.apache.axis.types.NonNegativeInteger dateFlexibility) {
        this.dateFlexibility = dateFlexibility;
    }


    /**
     * Gets the maxOptionsPerDate value for this DateTimeType.
     * 
     * @return maxOptionsPerDate
     */
    public org.apache.axis.types.NonNegativeInteger getMaxOptionsPerDate() {
        return maxOptionsPerDate;
    }


    /**
     * Sets the maxOptionsPerDate value for this DateTimeType.
     * 
     * @param maxOptionsPerDate
     */
    public void setMaxOptionsPerDate(org.apache.axis.types.NonNegativeInteger maxOptionsPerDate) {
        this.maxOptionsPerDate = maxOptionsPerDate;
    }


    /**
     * Gets the connectionTimeMin value for this DateTimeType.
     * 
     * @return connectionTimeMin
     */
    public org.apache.axis.types.NonNegativeInteger getConnectionTimeMin() {
        return connectionTimeMin;
    }


    /**
     * Sets the connectionTimeMin value for this DateTimeType.
     * 
     * @param connectionTimeMin
     */
    public void setConnectionTimeMin(org.apache.axis.types.NonNegativeInteger connectionTimeMin) {
        this.connectionTimeMin = connectionTimeMin;
    }


    /**
     * Gets the connectionTimeMax value for this DateTimeType.
     * 
     * @return connectionTimeMax
     */
    public org.apache.axis.types.NonNegativeInteger getConnectionTimeMax() {
        return connectionTimeMax;
    }


    /**
     * Sets the connectionTimeMax value for this DateTimeType.
     * 
     * @param connectionTimeMax
     */
    public void setConnectionTimeMax(org.apache.axis.types.NonNegativeInteger connectionTimeMax) {
        this.connectionTimeMax = connectionTimeMax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateTimeType)) return false;
        DateTimeType other = (DateTimeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timeWindowStart==null && other.getTimeWindowStart()==null) || 
             (this.timeWindowStart!=null &&
              this.timeWindowStart.equals(other.getTimeWindowStart()))) &&
            ((this.timeWindowEnd==null && other.getTimeWindowEnd()==null) || 
             (this.timeWindowEnd!=null &&
              this.timeWindowEnd.equals(other.getTimeWindowEnd()))) &&
            ((this.timeTolerance==null && other.getTimeTolerance()==null) || 
             (this.timeTolerance!=null &&
              this.timeTolerance.equals(other.getTimeTolerance()))) &&
            ((this.dateFlexibility==null && other.getDateFlexibility()==null) || 
             (this.dateFlexibility!=null &&
              this.dateFlexibility.equals(other.getDateFlexibility()))) &&
            ((this.maxOptionsPerDate==null && other.getMaxOptionsPerDate()==null) || 
             (this.maxOptionsPerDate!=null &&
              this.maxOptionsPerDate.equals(other.getMaxOptionsPerDate()))) &&
            ((this.connectionTimeMin==null && other.getConnectionTimeMin()==null) || 
             (this.connectionTimeMin!=null &&
              this.connectionTimeMin.equals(other.getConnectionTimeMin()))) &&
            ((this.connectionTimeMax==null && other.getConnectionTimeMax()==null) || 
             (this.connectionTimeMax!=null &&
              this.connectionTimeMax.equals(other.getConnectionTimeMax())));
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
        if (getTimeWindowStart() != null) {
            _hashCode += getTimeWindowStart().hashCode();
        }
        if (getTimeWindowEnd() != null) {
            _hashCode += getTimeWindowEnd().hashCode();
        }
        if (getTimeTolerance() != null) {
            _hashCode += getTimeTolerance().hashCode();
        }
        if (getDateFlexibility() != null) {
            _hashCode += getDateFlexibility().hashCode();
        }
        if (getMaxOptionsPerDate() != null) {
            _hashCode += getMaxOptionsPerDate().hashCode();
        }
        if (getConnectionTimeMin() != null) {
            _hashCode += getConnectionTimeMin().hashCode();
        }
        if (getConnectionTimeMax() != null) {
            _hashCode += getConnectionTimeMax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateTimeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DateTimeType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("timeWindowStart");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TimeWindowStart"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeWindowBoundaryType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("timeWindowEnd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TimeWindowEnd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeWindowBoundaryType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("timeTolerance");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TimeTolerance"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dateFlexibility");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DateFlexibility"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxOptionsPerDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MaxOptionsPerDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("connectionTimeMin");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ConnectionTimeMin"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("connectionTimeMax");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ConnectionTimeMax"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
