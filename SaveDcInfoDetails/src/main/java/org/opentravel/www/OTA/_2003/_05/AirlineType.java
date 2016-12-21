/**
 * AirlineType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirlineType  implements java.io.Serializable {
    private java.lang.String operating;  // attribute

    private java.lang.String marketing;  // attribute

    public AirlineType() {
    }

    public AirlineType(
           java.lang.String operating,
           java.lang.String marketing) {
           this.operating = operating;
           this.marketing = marketing;
    }


    /**
     * Gets the operating value for this AirlineType.
     * 
     * @return operating
     */
    public java.lang.String getOperating() {
        return operating;
    }


    /**
     * Sets the operating value for this AirlineType.
     * 
     * @param operating
     */
    public void setOperating(java.lang.String operating) {
        this.operating = operating;
    }


    /**
     * Gets the marketing value for this AirlineType.
     * 
     * @return marketing
     */
    public java.lang.String getMarketing() {
        return marketing;
    }


    /**
     * Sets the marketing value for this AirlineType.
     * 
     * @param marketing
     */
    public void setMarketing(java.lang.String marketing) {
        this.marketing = marketing;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirlineType)) return false;
        AirlineType other = (AirlineType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operating==null && other.getOperating()==null) || 
             (this.operating!=null &&
              this.operating.equals(other.getOperating()))) &&
            ((this.marketing==null && other.getMarketing()==null) || 
             (this.marketing!=null &&
              this.marketing.equals(other.getMarketing())));
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
        if (getOperating() != null) {
            _hashCode += getOperating().hashCode();
        }
        if (getMarketing() != null) {
            _hashCode += getMarketing().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirlineType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirlineType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("operating");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Operating"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CarrierCode"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("marketing");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Marketing"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CarrierCode"));
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
