/**
 * DiversityControlTypeLowFareBucket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class DiversityControlTypeLowFareBucket  implements java.io.Serializable {
    private java.lang.String options;  // attribute

    private java.lang.String fareCutOff;  // attribute

    public DiversityControlTypeLowFareBucket() {
    }

    public DiversityControlTypeLowFareBucket(
           java.lang.String options,
           java.lang.String fareCutOff) {
           this.options = options;
           this.fareCutOff = fareCutOff;
    }


    /**
     * Gets the options value for this DiversityControlTypeLowFareBucket.
     * 
     * @return options
     */
    public java.lang.String getOptions() {
        return options;
    }


    /**
     * Sets the options value for this DiversityControlTypeLowFareBucket.
     * 
     * @param options
     */
    public void setOptions(java.lang.String options) {
        this.options = options;
    }


    /**
     * Gets the fareCutOff value for this DiversityControlTypeLowFareBucket.
     * 
     * @return fareCutOff
     */
    public java.lang.String getFareCutOff() {
        return fareCutOff;
    }


    /**
     * Sets the fareCutOff value for this DiversityControlTypeLowFareBucket.
     * 
     * @param fareCutOff
     */
    public void setFareCutOff(java.lang.String fareCutOff) {
        this.fareCutOff = fareCutOff;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiversityControlTypeLowFareBucket)) return false;
        DiversityControlTypeLowFareBucket other = (DiversityControlTypeLowFareBucket) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions()))) &&
            ((this.fareCutOff==null && other.getFareCutOff()==null) || 
             (this.fareCutOff!=null &&
              this.fareCutOff.equals(other.getFareCutOff())));
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
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        if (getFareCutOff() != null) {
            _hashCode += getFareCutOff().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiversityControlTypeLowFareBucket.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">DiversityControlType>LowFareBucket"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("options");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Options"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CountOrPercentage"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fareCutOff");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FareCutOff"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "IntPercentage"));
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
