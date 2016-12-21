/**
 * AirSearchPrefsTypeTPA_ExtensionsSellingLevelsShowFareAmounts.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirSearchPrefsTypeTPA_ExtensionsSellingLevelsShowFareAmounts  implements java.io.Serializable {
    private java.lang.Boolean original;  // attribute

    private java.lang.Boolean adjusted;  // attribute

    public AirSearchPrefsTypeTPA_ExtensionsSellingLevelsShowFareAmounts() {
    }

    public AirSearchPrefsTypeTPA_ExtensionsSellingLevelsShowFareAmounts(
           java.lang.Boolean original,
           java.lang.Boolean adjusted) {
           this.original = original;
           this.adjusted = adjusted;
    }


    /**
     * Gets the original value for this AirSearchPrefsTypeTPA_ExtensionsSellingLevelsShowFareAmounts.
     * 
     * @return original
     */
    public java.lang.Boolean getOriginal() {
        return original;
    }


    /**
     * Sets the original value for this AirSearchPrefsTypeTPA_ExtensionsSellingLevelsShowFareAmounts.
     * 
     * @param original
     */
    public void setOriginal(java.lang.Boolean original) {
        this.original = original;
    }


    /**
     * Gets the adjusted value for this AirSearchPrefsTypeTPA_ExtensionsSellingLevelsShowFareAmounts.
     * 
     * @return adjusted
     */
    public java.lang.Boolean getAdjusted() {
        return adjusted;
    }


    /**
     * Sets the adjusted value for this AirSearchPrefsTypeTPA_ExtensionsSellingLevelsShowFareAmounts.
     * 
     * @param adjusted
     */
    public void setAdjusted(java.lang.Boolean adjusted) {
        this.adjusted = adjusted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirSearchPrefsTypeTPA_ExtensionsSellingLevelsShowFareAmounts)) return false;
        AirSearchPrefsTypeTPA_ExtensionsSellingLevelsShowFareAmounts other = (AirSearchPrefsTypeTPA_ExtensionsSellingLevelsShowFareAmounts) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.original==null && other.getOriginal()==null) || 
             (this.original!=null &&
              this.original.equals(other.getOriginal()))) &&
            ((this.adjusted==null && other.getAdjusted()==null) || 
             (this.adjusted!=null &&
              this.adjusted.equals(other.getAdjusted())));
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
        if (getOriginal() != null) {
            _hashCode += getOriginal().hashCode();
        }
        if (getAdjusted() != null) {
            _hashCode += getAdjusted().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirSearchPrefsTypeTPA_ExtensionsSellingLevelsShowFareAmounts.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>SellingLevels>ShowFareAmounts"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("original");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Original"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("adjusted");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Adjusted"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
