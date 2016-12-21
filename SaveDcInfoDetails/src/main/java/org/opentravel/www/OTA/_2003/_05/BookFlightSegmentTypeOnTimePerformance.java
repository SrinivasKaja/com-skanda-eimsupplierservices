/**
 * BookFlightSegmentTypeOnTimePerformance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class BookFlightSegmentTypeOnTimePerformance  implements java.io.Serializable {
    private java.lang.String level;  // attribute

    private java.lang.String percentage;  // attribute

    public BookFlightSegmentTypeOnTimePerformance() {
    }

    public BookFlightSegmentTypeOnTimePerformance(
           java.lang.String level,
           java.lang.String percentage) {
           this.level = level;
           this.percentage = percentage;
    }


    /**
     * Gets the level value for this BookFlightSegmentTypeOnTimePerformance.
     * 
     * @return level
     */
    public java.lang.String getLevel() {
        return level;
    }


    /**
     * Sets the level value for this BookFlightSegmentTypeOnTimePerformance.
     * 
     * @param level
     */
    public void setLevel(java.lang.String level) {
        this.level = level;
    }


    /**
     * Gets the percentage value for this BookFlightSegmentTypeOnTimePerformance.
     * 
     * @return percentage
     */
    public java.lang.String getPercentage() {
        return percentage;
    }


    /**
     * Sets the percentage value for this BookFlightSegmentTypeOnTimePerformance.
     * 
     * @param percentage
     */
    public void setPercentage(java.lang.String percentage) {
        this.percentage = percentage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookFlightSegmentTypeOnTimePerformance)) return false;
        BookFlightSegmentTypeOnTimePerformance other = (BookFlightSegmentTypeOnTimePerformance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            ((this.percentage==null && other.getPercentage()==null) || 
             (this.percentage!=null &&
              this.percentage.equals(other.getPercentage())));
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
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getPercentage() != null) {
            _hashCode += getPercentage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookFlightSegmentTypeOnTimePerformance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BookFlightSegmentType>OnTimePerformance"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("level");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Level"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("percentage");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Percentage"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
