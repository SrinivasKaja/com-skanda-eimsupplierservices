/**
 * FareGroupType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * IntelliSell Type
 */
public class FareGroupType  implements java.io.Serializable {
    private java.lang.String fareTypeName;  // attribute

    public FareGroupType() {
    }

    public FareGroupType(
           java.lang.String fareTypeName) {
           this.fareTypeName = fareTypeName;
    }


    /**
     * Gets the fareTypeName value for this FareGroupType.
     * 
     * @return fareTypeName
     */
    public java.lang.String getFareTypeName() {
        return fareTypeName;
    }


    /**
     * Sets the fareTypeName value for this FareGroupType.
     * 
     * @param fareTypeName
     */
    public void setFareTypeName(java.lang.String fareTypeName) {
        this.fareTypeName = fareTypeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareGroupType)) return false;
        FareGroupType other = (FareGroupType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fareTypeName==null && other.getFareTypeName()==null) || 
             (this.fareTypeName!=null &&
              this.fareTypeName.equals(other.getFareTypeName())));
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
        if (getFareTypeName() != null) {
            _hashCode += getFareTypeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FareGroupType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareGroupType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fareTypeName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FareTypeName"));
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
