/**
 * OTA_AirLowFareSearchRQTPA_ExtensionsSplitTaxes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQTPA_ExtensionsSplitTaxes  implements java.io.Serializable {
    private boolean byLeg;  // attribute

    private boolean byFareComponent;  // attribute

    public OTA_AirLowFareSearchRQTPA_ExtensionsSplitTaxes() {
    }

    public OTA_AirLowFareSearchRQTPA_ExtensionsSplitTaxes(
           boolean byLeg,
           boolean byFareComponent) {
           this.byLeg = byLeg;
           this.byFareComponent = byFareComponent;
    }


    /**
     * Gets the byLeg value for this OTA_AirLowFareSearchRQTPA_ExtensionsSplitTaxes.
     * 
     * @return byLeg
     */
    public boolean isByLeg() {
        return byLeg;
    }


    /**
     * Sets the byLeg value for this OTA_AirLowFareSearchRQTPA_ExtensionsSplitTaxes.
     * 
     * @param byLeg
     */
    public void setByLeg(boolean byLeg) {
        this.byLeg = byLeg;
    }


    /**
     * Gets the byFareComponent value for this OTA_AirLowFareSearchRQTPA_ExtensionsSplitTaxes.
     * 
     * @return byFareComponent
     */
    public boolean isByFareComponent() {
        return byFareComponent;
    }


    /**
     * Sets the byFareComponent value for this OTA_AirLowFareSearchRQTPA_ExtensionsSplitTaxes.
     * 
     * @param byFareComponent
     */
    public void setByFareComponent(boolean byFareComponent) {
        this.byFareComponent = byFareComponent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQTPA_ExtensionsSplitTaxes)) return false;
        OTA_AirLowFareSearchRQTPA_ExtensionsSplitTaxes other = (OTA_AirLowFareSearchRQTPA_ExtensionsSplitTaxes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.byLeg == other.isByLeg() &&
            this.byFareComponent == other.isByFareComponent();
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
        _hashCode += (isByLeg() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isByFareComponent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQTPA_ExtensionsSplitTaxes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>SplitTaxes"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("byLeg");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ByLeg"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("byFareComponent");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ByFareComponent"));
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
