/**
 * AwardShoppingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AwardShoppingType  implements java.io.Serializable {
    private java.lang.Boolean enable;  // attribute

    private boolean useRAS;  // attribute

    public AwardShoppingType() {
    }

    public AwardShoppingType(
           java.lang.Boolean enable,
           boolean useRAS) {
           this.enable = enable;
           this.useRAS = useRAS;
    }


    /**
     * Gets the enable value for this AwardShoppingType.
     * 
     * @return enable
     */
    public java.lang.Boolean getEnable() {
        return enable;
    }


    /**
     * Sets the enable value for this AwardShoppingType.
     * 
     * @param enable
     */
    public void setEnable(java.lang.Boolean enable) {
        this.enable = enable;
    }


    /**
     * Gets the useRAS value for this AwardShoppingType.
     * 
     * @return useRAS
     */
    public boolean isUseRAS() {
        return useRAS;
    }


    /**
     * Sets the useRAS value for this AwardShoppingType.
     * 
     * @param useRAS
     */
    public void setUseRAS(boolean useRAS) {
        this.useRAS = useRAS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AwardShoppingType)) return false;
        AwardShoppingType other = (AwardShoppingType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enable==null && other.getEnable()==null) || 
             (this.enable!=null &&
              this.enable.equals(other.getEnable()))) &&
            this.useRAS == other.isUseRAS();
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
        if (getEnable() != null) {
            _hashCode += getEnable().hashCode();
        }
        _hashCode += (isUseRAS() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AwardShoppingType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AwardShoppingType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("enable");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Enable"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("useRAS");
        attrField.setXmlName(new javax.xml.namespace.QName("", "UseRAS"));
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
