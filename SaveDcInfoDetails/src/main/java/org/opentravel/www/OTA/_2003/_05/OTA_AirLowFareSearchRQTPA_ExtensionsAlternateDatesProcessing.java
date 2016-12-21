/**
 * OTA_AirLowFareSearchRQTPA_ExtensionsAlternateDatesProcessing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQTPA_ExtensionsAlternateDatesProcessing  implements java.io.Serializable {
    private boolean calendarMode;  // attribute

    private int numOptionsPerAlternateDate;  // attribute

    public OTA_AirLowFareSearchRQTPA_ExtensionsAlternateDatesProcessing() {
    }

    public OTA_AirLowFareSearchRQTPA_ExtensionsAlternateDatesProcessing(
           boolean calendarMode,
           int numOptionsPerAlternateDate) {
           this.calendarMode = calendarMode;
           this.numOptionsPerAlternateDate = numOptionsPerAlternateDate;
    }


    /**
     * Gets the calendarMode value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternateDatesProcessing.
     * 
     * @return calendarMode
     */
    public boolean isCalendarMode() {
        return calendarMode;
    }


    /**
     * Sets the calendarMode value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternateDatesProcessing.
     * 
     * @param calendarMode
     */
    public void setCalendarMode(boolean calendarMode) {
        this.calendarMode = calendarMode;
    }


    /**
     * Gets the numOptionsPerAlternateDate value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternateDatesProcessing.
     * 
     * @return numOptionsPerAlternateDate
     */
    public int getNumOptionsPerAlternateDate() {
        return numOptionsPerAlternateDate;
    }


    /**
     * Sets the numOptionsPerAlternateDate value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternateDatesProcessing.
     * 
     * @param numOptionsPerAlternateDate
     */
    public void setNumOptionsPerAlternateDate(int numOptionsPerAlternateDate) {
        this.numOptionsPerAlternateDate = numOptionsPerAlternateDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQTPA_ExtensionsAlternateDatesProcessing)) return false;
        OTA_AirLowFareSearchRQTPA_ExtensionsAlternateDatesProcessing other = (OTA_AirLowFareSearchRQTPA_ExtensionsAlternateDatesProcessing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.calendarMode == other.isCalendarMode() &&
            this.numOptionsPerAlternateDate == other.getNumOptionsPerAlternateDate();
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
        _hashCode += (isCalendarMode() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getNumOptionsPerAlternateDate();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQTPA_ExtensionsAlternateDatesProcessing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternateDatesProcessing"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("calendarMode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CalendarMode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("numOptionsPerAlternateDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NumOptionsPerAlternateDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
