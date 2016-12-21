/**
 * AirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup  implements java.io.Serializable {
    private java.lang.Object code;  // attribute

    private java.lang.Object count;  // attribute

    public AirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup() {
    }

    public AirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup(
           java.lang.Object code,
           java.lang.Object count) {
           this.code = code;
           this.count = count;
    }


    /**
     * Gets the code value for this AirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup.
     * 
     * @return code
     */
    public java.lang.Object getCode() {
        return code;
    }


    /**
     * Sets the code value for this AirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup.
     * 
     * @param code
     */
    public void setCode(java.lang.Object code) {
        this.code = code;
    }


    /**
     * Gets the count value for this AirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup.
     * 
     * @return count
     */
    public java.lang.Object getCount() {
        return count;
    }


    /**
     * Sets the count value for this AirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup.
     * 
     * @param count
     */
    public void setCount(java.lang.Object count) {
        this.count = count;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup)) return false;
        AirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup other = (AirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirSearchPrefsTypeAncillaryFeesAncillaryFeeGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>AncillaryFees>AncillaryFeeGroup"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("count");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Count"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
