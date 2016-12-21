/**
 * PriceRequestInformationTypeTPA_ExtensionsPriorityPrice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PriceRequestInformationTypeTPA_ExtensionsPriorityPrice  implements java.io.Serializable {
    private int priority;  // attribute

    public PriceRequestInformationTypeTPA_ExtensionsPriorityPrice() {
    }

    public PriceRequestInformationTypeTPA_ExtensionsPriorityPrice(
           int priority) {
           this.priority = priority;
    }


    /**
     * Gets the priority value for this PriceRequestInformationTypeTPA_ExtensionsPriorityPrice.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this PriceRequestInformationTypeTPA_ExtensionsPriorityPrice.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceRequestInformationTypeTPA_ExtensionsPriorityPrice)) return false;
        PriceRequestInformationTypeTPA_ExtensionsPriorityPrice other = (PriceRequestInformationTypeTPA_ExtensionsPriorityPrice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.priority == other.getPriority();
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
        _hashCode += getPriority();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceRequestInformationTypeTPA_ExtensionsPriorityPrice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PriceRequestInformationType>TPA_Extensions>Priority>Price"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("priority");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Priority"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>PriceRequestInformationType>TPA_Extensions>Priority>Price>Priority"));
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
