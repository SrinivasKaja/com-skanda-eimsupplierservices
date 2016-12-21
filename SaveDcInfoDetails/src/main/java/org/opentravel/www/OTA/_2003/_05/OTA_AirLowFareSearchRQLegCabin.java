/**
 * OTA_AirLowFareSearchRQLegCabin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQLegCabin  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.PreferLevelType preferenceLevel;  // attribute

    private org.opentravel.www.OTA._2003._05.CabinType type;  // attribute

    public OTA_AirLowFareSearchRQLegCabin() {
    }

    public OTA_AirLowFareSearchRQLegCabin(
           org.opentravel.www.OTA._2003._05.PreferLevelType preferenceLevel,
           org.opentravel.www.OTA._2003._05.CabinType type) {
           this.preferenceLevel = preferenceLevel;
           this.type = type;
    }


    /**
     * Gets the preferenceLevel value for this OTA_AirLowFareSearchRQLegCabin.
     * 
     * @return preferenceLevel
     */
    public org.opentravel.www.OTA._2003._05.PreferLevelType getPreferenceLevel() {
        return preferenceLevel;
    }


    /**
     * Sets the preferenceLevel value for this OTA_AirLowFareSearchRQLegCabin.
     * 
     * @param preferenceLevel
     */
    public void setPreferenceLevel(org.opentravel.www.OTA._2003._05.PreferLevelType preferenceLevel) {
        this.preferenceLevel = preferenceLevel;
    }


    /**
     * Gets the type value for this OTA_AirLowFareSearchRQLegCabin.
     * 
     * @return type
     */
    public org.opentravel.www.OTA._2003._05.CabinType getType() {
        return type;
    }


    /**
     * Sets the type value for this OTA_AirLowFareSearchRQLegCabin.
     * 
     * @param type
     */
    public void setType(org.opentravel.www.OTA._2003._05.CabinType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQLegCabin)) return false;
        OTA_AirLowFareSearchRQLegCabin other = (OTA_AirLowFareSearchRQLegCabin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.preferenceLevel==null && other.getPreferenceLevel()==null) || 
             (this.preferenceLevel!=null &&
              this.preferenceLevel.equals(other.getPreferenceLevel()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getPreferenceLevel() != null) {
            _hashCode += getPreferenceLevel().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQLegCabin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>Leg>Cabin"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("preferenceLevel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PreferenceLevel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PreferLevelType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Type"));
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
