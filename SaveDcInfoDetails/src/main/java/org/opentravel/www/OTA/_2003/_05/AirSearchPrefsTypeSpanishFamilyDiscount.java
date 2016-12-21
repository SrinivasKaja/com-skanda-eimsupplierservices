/**
 * AirSearchPrefsTypeSpanishFamilyDiscount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirSearchPrefsTypeSpanishFamilyDiscount  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeSpanishFamilyDiscountLevel level;  // attribute

    public AirSearchPrefsTypeSpanishFamilyDiscount() {
    }

    public AirSearchPrefsTypeSpanishFamilyDiscount(
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeSpanishFamilyDiscountLevel level) {
           this.level = level;
    }


    /**
     * Gets the level value for this AirSearchPrefsTypeSpanishFamilyDiscount.
     * 
     * @return level
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeSpanishFamilyDiscountLevel getLevel() {
        return level;
    }


    /**
     * Sets the level value for this AirSearchPrefsTypeSpanishFamilyDiscount.
     * 
     * @param level
     */
    public void setLevel(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeSpanishFamilyDiscountLevel level) {
        this.level = level;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirSearchPrefsTypeSpanishFamilyDiscount)) return false;
        AirSearchPrefsTypeSpanishFamilyDiscount other = (AirSearchPrefsTypeSpanishFamilyDiscount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel())));
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
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirSearchPrefsTypeSpanishFamilyDiscount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AirSearchPrefsType>SpanishFamilyDiscount"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("level");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Level"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>SpanishFamilyDiscount>Level"));
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
