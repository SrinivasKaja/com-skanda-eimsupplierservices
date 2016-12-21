/**
 * PriceRequestInformationTypeTPA_ExtensionsCurrency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PriceRequestInformationTypeTPA_ExtensionsCurrency  implements java.io.Serializable {
    private java.lang.String dual;  // attribute

    private java.lang.Boolean MOverride;  // attribute

    public PriceRequestInformationTypeTPA_ExtensionsCurrency() {
    }

    public PriceRequestInformationTypeTPA_ExtensionsCurrency(
           java.lang.String dual,
           java.lang.Boolean MOverride) {
           this.dual = dual;
           this.MOverride = MOverride;
    }


    /**
     * Gets the dual value for this PriceRequestInformationTypeTPA_ExtensionsCurrency.
     * 
     * @return dual
     */
    public java.lang.String getDual() {
        return dual;
    }


    /**
     * Sets the dual value for this PriceRequestInformationTypeTPA_ExtensionsCurrency.
     * 
     * @param dual
     */
    public void setDual(java.lang.String dual) {
        this.dual = dual;
    }


    /**
     * Gets the MOverride value for this PriceRequestInformationTypeTPA_ExtensionsCurrency.
     * 
     * @return MOverride
     */
    public java.lang.Boolean getMOverride() {
        return MOverride;
    }


    /**
     * Sets the MOverride value for this PriceRequestInformationTypeTPA_ExtensionsCurrency.
     * 
     * @param MOverride
     */
    public void setMOverride(java.lang.Boolean MOverride) {
        this.MOverride = MOverride;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceRequestInformationTypeTPA_ExtensionsCurrency)) return false;
        PriceRequestInformationTypeTPA_ExtensionsCurrency other = (PriceRequestInformationTypeTPA_ExtensionsCurrency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dual==null && other.getDual()==null) || 
             (this.dual!=null &&
              this.dual.equals(other.getDual()))) &&
            ((this.MOverride==null && other.getMOverride()==null) || 
             (this.MOverride!=null &&
              this.MOverride.equals(other.getMOverride())));
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
        if (getDual() != null) {
            _hashCode += getDual().hashCode();
        }
        if (getMOverride() != null) {
            _hashCode += getMOverride().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceRequestInformationTypeTPA_ExtensionsCurrency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>Currency"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dual");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Dual"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlphaLength3"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("MOverride");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MOverride"));
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
