/**
 * HandlingMarkupSummaryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class HandlingMarkupSummaryType  implements java.io.Serializable {
    private java.lang.String typeCode;  // attribute

    private java.lang.String description;  // attribute

    private java.math.BigDecimal monetaryAmountValue;  // attribute

    public HandlingMarkupSummaryType() {
    }

    public HandlingMarkupSummaryType(
           java.lang.String typeCode,
           java.lang.String description,
           java.math.BigDecimal monetaryAmountValue) {
           this.typeCode = typeCode;
           this.description = description;
           this.monetaryAmountValue = monetaryAmountValue;
    }


    /**
     * Gets the typeCode value for this HandlingMarkupSummaryType.
     * 
     * @return typeCode
     */
    public java.lang.String getTypeCode() {
        return typeCode;
    }


    /**
     * Sets the typeCode value for this HandlingMarkupSummaryType.
     * 
     * @param typeCode
     */
    public void setTypeCode(java.lang.String typeCode) {
        this.typeCode = typeCode;
    }


    /**
     * Gets the description value for this HandlingMarkupSummaryType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this HandlingMarkupSummaryType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the monetaryAmountValue value for this HandlingMarkupSummaryType.
     * 
     * @return monetaryAmountValue
     */
    public java.math.BigDecimal getMonetaryAmountValue() {
        return monetaryAmountValue;
    }


    /**
     * Sets the monetaryAmountValue value for this HandlingMarkupSummaryType.
     * 
     * @param monetaryAmountValue
     */
    public void setMonetaryAmountValue(java.math.BigDecimal monetaryAmountValue) {
        this.monetaryAmountValue = monetaryAmountValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HandlingMarkupSummaryType)) return false;
        HandlingMarkupSummaryType other = (HandlingMarkupSummaryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.typeCode==null && other.getTypeCode()==null) || 
             (this.typeCode!=null &&
              this.typeCode.equals(other.getTypeCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.monetaryAmountValue==null && other.getMonetaryAmountValue()==null) || 
             (this.monetaryAmountValue!=null &&
              this.monetaryAmountValue.equals(other.getMonetaryAmountValue())));
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
        if (getTypeCode() != null) {
            _hashCode += getTypeCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getMonetaryAmountValue() != null) {
            _hashCode += getMonetaryAmountValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HandlingMarkupSummaryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "HandlingMarkupSummaryType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("typeCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TypeCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CharacterType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("description");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("monetaryAmountValue");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MonetaryAmountValue"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Money"));
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
