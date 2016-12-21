/**
 * BookingClassPrefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Booking class code and preference level for specifying booking
 * classes preferred/not preferred in a request.
 */
public class BookingClassPrefType  implements java.io.Serializable {
    private java.lang.String resBookDesigCode;  // attribute

    private org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel;  // attribute

    public BookingClassPrefType() {
    }

    public BookingClassPrefType(
           java.lang.String resBookDesigCode,
           org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel) {
           this.resBookDesigCode = resBookDesigCode;
           this.preferLevel = preferLevel;
    }


    /**
     * Gets the resBookDesigCode value for this BookingClassPrefType.
     * 
     * @return resBookDesigCode
     */
    public java.lang.String getResBookDesigCode() {
        return resBookDesigCode;
    }


    /**
     * Sets the resBookDesigCode value for this BookingClassPrefType.
     * 
     * @param resBookDesigCode
     */
    public void setResBookDesigCode(java.lang.String resBookDesigCode) {
        this.resBookDesigCode = resBookDesigCode;
    }


    /**
     * Gets the preferLevel value for this BookingClassPrefType.
     * 
     * @return preferLevel
     */
    public org.opentravel.www.OTA._2003._05.PreferLevelType getPreferLevel() {
        return preferLevel;
    }


    /**
     * Sets the preferLevel value for this BookingClassPrefType.
     * 
     * @param preferLevel
     */
    public void setPreferLevel(org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel) {
        this.preferLevel = preferLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookingClassPrefType)) return false;
        BookingClassPrefType other = (BookingClassPrefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resBookDesigCode==null && other.getResBookDesigCode()==null) || 
             (this.resBookDesigCode!=null &&
              this.resBookDesigCode.equals(other.getResBookDesigCode()))) &&
            ((this.preferLevel==null && other.getPreferLevel()==null) || 
             (this.preferLevel!=null &&
              this.preferLevel.equals(other.getPreferLevel())));
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
        if (getResBookDesigCode() != null) {
            _hashCode += getResBookDesigCode().hashCode();
        }
        if (getPreferLevel() != null) {
            _hashCode += getPreferLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookingClassPrefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "BookingClassPrefType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("resBookDesigCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ResBookDesigCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "UpperCaseAlphaLength1to2"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("preferLevel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PreferLevel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PreferLevelType"));
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
