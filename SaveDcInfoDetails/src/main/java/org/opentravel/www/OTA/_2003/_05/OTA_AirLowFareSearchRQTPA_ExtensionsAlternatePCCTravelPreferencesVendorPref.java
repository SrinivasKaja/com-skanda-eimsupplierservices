/**
 * OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref  implements java.io.Serializable {
    private java.lang.String code;  // attribute

    private org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel;  // attribute

    public OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref() {
    }

    public OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref(
           java.lang.String code,
           org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel) {
           this.code = code;
           this.preferLevel = preferLevel;
    }


    /**
     * Gets the code value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the preferLevel value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref.
     * 
     * @return preferLevel
     */
    public org.opentravel.www.OTA._2003._05.PreferLevelType getPreferLevel() {
        return preferLevel;
    }


    /**
     * Sets the preferLevel value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref.
     * 
     * @param preferLevel
     */
    public void setPreferLevel(org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel) {
        this.preferLevel = preferLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref)) return false;
        OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref other = (OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref) obj;
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getPreferLevel() != null) {
            _hashCode += getPreferLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternatePCC>TravelPreferences>VendorPref"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to8"));
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
