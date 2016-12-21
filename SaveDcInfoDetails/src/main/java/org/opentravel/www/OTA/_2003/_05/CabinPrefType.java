/**
 * CabinPrefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Indicates preferences for choice of airline cabin for a given travel
 * situation.
 */
public class CabinPrefType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel;  // attribute

    private org.opentravel.www.OTA._2003._05.CabinType cabin;  // attribute

    public CabinPrefType() {
    }

    public CabinPrefType(
           org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel,
           org.opentravel.www.OTA._2003._05.CabinType cabin) {
           this.preferLevel = preferLevel;
           this.cabin = cabin;
    }


    /**
     * Gets the preferLevel value for this CabinPrefType.
     * 
     * @return preferLevel
     */
    public org.opentravel.www.OTA._2003._05.PreferLevelType getPreferLevel() {
        return preferLevel;
    }


    /**
     * Sets the preferLevel value for this CabinPrefType.
     * 
     * @param preferLevel
     */
    public void setPreferLevel(org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel) {
        this.preferLevel = preferLevel;
    }


    /**
     * Gets the cabin value for this CabinPrefType.
     * 
     * @return cabin
     */
    public org.opentravel.www.OTA._2003._05.CabinType getCabin() {
        return cabin;
    }


    /**
     * Sets the cabin value for this CabinPrefType.
     * 
     * @param cabin
     */
    public void setCabin(org.opentravel.www.OTA._2003._05.CabinType cabin) {
        this.cabin = cabin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CabinPrefType)) return false;
        CabinPrefType other = (CabinPrefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.preferLevel==null && other.getPreferLevel()==null) || 
             (this.preferLevel!=null &&
              this.preferLevel.equals(other.getPreferLevel()))) &&
            ((this.cabin==null && other.getCabin()==null) || 
             (this.cabin!=null &&
              this.cabin.equals(other.getCabin())));
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
        if (getPreferLevel() != null) {
            _hashCode += getPreferLevel().hashCode();
        }
        if (getCabin() != null) {
            _hashCode += getCabin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CabinPrefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CabinPrefType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("preferLevel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PreferLevel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PreferLevelType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("cabin");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Cabin"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CabinType"));
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
