/**
 * AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckSettlementValidation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * If set to true validate BSP agreement for given carriers.
 */
public class AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckSettlementValidation  implements java.io.Serializable {
    private boolean ind;  // attribute

    public AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckSettlementValidation() {
    }

    public AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckSettlementValidation(
           boolean ind) {
           this.ind = ind;
    }


    /**
     * Gets the ind value for this AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckSettlementValidation.
     * 
     * @return ind
     */
    public boolean isInd() {
        return ind;
    }


    /**
     * Sets the ind value for this AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckSettlementValidation.
     * 
     * @param ind
     */
    public void setInd(boolean ind) {
        this.ind = ind;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckSettlementValidation)) return false;
        AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckSettlementValidation other = (AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckSettlementValidation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ind == other.isInd();
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
        _hashCode += (isInd() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirSearchPrefsTypeTPA_ExtensionsValidatingCarrierCheckSettlementValidation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>ValidatingCarrierCheck>SettlementValidation"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ind");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Ind"));
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
