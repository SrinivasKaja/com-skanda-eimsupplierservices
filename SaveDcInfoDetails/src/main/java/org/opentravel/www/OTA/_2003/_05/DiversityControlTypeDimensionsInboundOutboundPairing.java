/**
 * DiversityControlTypeDimensionsInboundOutboundPairing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class DiversityControlTypeDimensionsInboundOutboundPairing  implements java.io.Serializable {
    private java.math.BigInteger weight;  // attribute

    private org.apache.axis.types.PositiveInteger duplicates;  // attribute

    public DiversityControlTypeDimensionsInboundOutboundPairing() {
    }

    public DiversityControlTypeDimensionsInboundOutboundPairing(
           java.math.BigInteger weight,
           org.apache.axis.types.PositiveInteger duplicates) {
           this.weight = weight;
           this.duplicates = duplicates;
    }


    /**
     * Gets the weight value for this DiversityControlTypeDimensionsInboundOutboundPairing.
     * 
     * @return weight
     */
    public java.math.BigInteger getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this DiversityControlTypeDimensionsInboundOutboundPairing.
     * 
     * @param weight
     */
    public void setWeight(java.math.BigInteger weight) {
        this.weight = weight;
    }


    /**
     * Gets the duplicates value for this DiversityControlTypeDimensionsInboundOutboundPairing.
     * 
     * @return duplicates
     */
    public org.apache.axis.types.PositiveInteger getDuplicates() {
        return duplicates;
    }


    /**
     * Sets the duplicates value for this DiversityControlTypeDimensionsInboundOutboundPairing.
     * 
     * @param duplicates
     */
    public void setDuplicates(org.apache.axis.types.PositiveInteger duplicates) {
        this.duplicates = duplicates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiversityControlTypeDimensionsInboundOutboundPairing)) return false;
        DiversityControlTypeDimensionsInboundOutboundPairing other = (DiversityControlTypeDimensionsInboundOutboundPairing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.duplicates==null && other.getDuplicates()==null) || 
             (this.duplicates!=null &&
              this.duplicates.equals(other.getDuplicates())));
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
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getDuplicates() != null) {
            _hashCode += getDuplicates().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiversityControlTypeDimensionsInboundOutboundPairing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>DiversityControlType>Dimensions>InboundOutboundPairing"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("weight");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Weight"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SumWeight"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("duplicates");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Duplicates"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
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
