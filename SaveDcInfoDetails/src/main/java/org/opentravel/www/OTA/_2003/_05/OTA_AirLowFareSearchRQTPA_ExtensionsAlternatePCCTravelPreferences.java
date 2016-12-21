/**
 * OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferences.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferences  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref[] vendorPref;

    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesTPA_Extensions TPA_Extensions;

    public OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferences() {
    }

    public OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferences(
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref[] vendorPref,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesTPA_Extensions TPA_Extensions) {
           this.vendorPref = vendorPref;
           this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the vendorPref value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferences.
     * 
     * @return vendorPref
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref[] getVendorPref() {
        return vendorPref;
    }


    /**
     * Sets the vendorPref value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferences.
     * 
     * @param vendorPref
     */
    public void setVendorPref(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref[] vendorPref) {
        this.vendorPref = vendorPref;
    }

    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref getVendorPref(int i) {
        return this.vendorPref[i];
    }

    public void setVendorPref(int i, org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesVendorPref _value) {
        this.vendorPref[i] = _value;
    }


    /**
     * Gets the TPA_Extensions value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferences.
     * 
     * @return TPA_Extensions
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesTPA_Extensions getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferences.
     * 
     * @param TPA_Extensions
     */
    public void setTPA_Extensions(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesTPA_Extensions TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferences)) return false;
        OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferences other = (OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferences) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vendorPref==null && other.getVendorPref()==null) || 
             (this.vendorPref!=null &&
              java.util.Arrays.equals(this.vendorPref, other.getVendorPref()))) &&
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions())));
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
        if (getVendorPref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorPref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorPref(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTPA_Extensions() != null) {
            _hashCode += getTPA_Extensions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferences.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternatePCC>TravelPreferences"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorPref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "VendorPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternatePCC>TravelPreferences>VendorPref"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternatePCC>TravelPreferences>TPA_Extensions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
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
