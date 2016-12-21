/**
 * AirSearchPrefsTypeTPA_ExtensionsFareFocusRules.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirSearchPrefsTypeTPA_ExtensionsFareFocusRules  implements java.io.Serializable {
    private java.lang.Boolean exclude;  // attribute

    public AirSearchPrefsTypeTPA_ExtensionsFareFocusRules() {
    }

    public AirSearchPrefsTypeTPA_ExtensionsFareFocusRules(
           java.lang.Boolean exclude) {
           this.exclude = exclude;
    }


    /**
     * Gets the exclude value for this AirSearchPrefsTypeTPA_ExtensionsFareFocusRules.
     * 
     * @return exclude
     */
    public java.lang.Boolean getExclude() {
        return exclude;
    }


    /**
     * Sets the exclude value for this AirSearchPrefsTypeTPA_ExtensionsFareFocusRules.
     * 
     * @param exclude
     */
    public void setExclude(java.lang.Boolean exclude) {
        this.exclude = exclude;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirSearchPrefsTypeTPA_ExtensionsFareFocusRules)) return false;
        AirSearchPrefsTypeTPA_ExtensionsFareFocusRules other = (AirSearchPrefsTypeTPA_ExtensionsFareFocusRules) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exclude==null && other.getExclude()==null) || 
             (this.exclude!=null &&
              this.exclude.equals(other.getExclude())));
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
        if (getExclude() != null) {
            _hashCode += getExclude().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirSearchPrefsTypeTPA_ExtensionsFareFocusRules.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>FareFocusRules"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("exclude");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Exclude"));
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
