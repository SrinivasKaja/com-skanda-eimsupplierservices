/**
 * ProcessingMessageType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Message generated per for particular date and leg
 */
public class ProcessingMessageType  implements java.io.Serializable {
    private java.lang.String pricingSource;  // attribute

    private java.lang.String message;  // attribute

    public ProcessingMessageType() {
    }

    public ProcessingMessageType(
           java.lang.String pricingSource,
           java.lang.String message) {
           this.pricingSource = pricingSource;
           this.message = message;
    }


    /**
     * Gets the pricingSource value for this ProcessingMessageType.
     * 
     * @return pricingSource
     */
    public java.lang.String getPricingSource() {
        return pricingSource;
    }


    /**
     * Sets the pricingSource value for this ProcessingMessageType.
     * 
     * @param pricingSource
     */
    public void setPricingSource(java.lang.String pricingSource) {
        this.pricingSource = pricingSource;
    }


    /**
     * Gets the message value for this ProcessingMessageType.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ProcessingMessageType.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessingMessageType)) return false;
        ProcessingMessageType other = (ProcessingMessageType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pricingSource==null && other.getPricingSource()==null) || 
             (this.pricingSource!=null &&
              this.pricingSource.equals(other.getPricingSource()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getPricingSource() != null) {
            _hashCode += getPricingSource().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessingMessageType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ProcessingMessageType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("pricingSource");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PricingSource"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ResponsePricingSourceType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("message");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Message"));
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
