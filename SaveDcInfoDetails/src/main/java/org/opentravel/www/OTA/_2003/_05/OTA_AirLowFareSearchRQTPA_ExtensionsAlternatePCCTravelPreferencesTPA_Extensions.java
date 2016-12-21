/**
 * OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesTPA_Extensions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesTPA_Extensions  implements java.io.Serializable {
    /* Consider only these alliances. */
    private org.opentravel.www.OTA._2003._05.AllianceType[] includeAlliancePref;

    /* Do not consider these alliances. */
    private org.opentravel.www.OTA._2003._05.AllianceType[] excludeAlliancePref;

    public OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesTPA_Extensions() {
    }

    public OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesTPA_Extensions(
           org.opentravel.www.OTA._2003._05.AllianceType[] includeAlliancePref,
           org.opentravel.www.OTA._2003._05.AllianceType[] excludeAlliancePref) {
           this.includeAlliancePref = includeAlliancePref;
           this.excludeAlliancePref = excludeAlliancePref;
    }


    /**
     * Gets the includeAlliancePref value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesTPA_Extensions.
     * 
     * @return includeAlliancePref   * Consider only these alliances.
     */
    public org.opentravel.www.OTA._2003._05.AllianceType[] getIncludeAlliancePref() {
        return includeAlliancePref;
    }


    /**
     * Sets the includeAlliancePref value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesTPA_Extensions.
     * 
     * @param includeAlliancePref   * Consider only these alliances.
     */
    public void setIncludeAlliancePref(org.opentravel.www.OTA._2003._05.AllianceType[] includeAlliancePref) {
        this.includeAlliancePref = includeAlliancePref;
    }

    public org.opentravel.www.OTA._2003._05.AllianceType getIncludeAlliancePref(int i) {
        return this.includeAlliancePref[i];
    }

    public void setIncludeAlliancePref(int i, org.opentravel.www.OTA._2003._05.AllianceType _value) {
        this.includeAlliancePref[i] = _value;
    }


    /**
     * Gets the excludeAlliancePref value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesTPA_Extensions.
     * 
     * @return excludeAlliancePref   * Do not consider these alliances.
     */
    public org.opentravel.www.OTA._2003._05.AllianceType[] getExcludeAlliancePref() {
        return excludeAlliancePref;
    }


    /**
     * Sets the excludeAlliancePref value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesTPA_Extensions.
     * 
     * @param excludeAlliancePref   * Do not consider these alliances.
     */
    public void setExcludeAlliancePref(org.opentravel.www.OTA._2003._05.AllianceType[] excludeAlliancePref) {
        this.excludeAlliancePref = excludeAlliancePref;
    }

    public org.opentravel.www.OTA._2003._05.AllianceType getExcludeAlliancePref(int i) {
        return this.excludeAlliancePref[i];
    }

    public void setExcludeAlliancePref(int i, org.opentravel.www.OTA._2003._05.AllianceType _value) {
        this.excludeAlliancePref[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesTPA_Extensions)) return false;
        OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesTPA_Extensions other = (OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesTPA_Extensions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.includeAlliancePref==null && other.getIncludeAlliancePref()==null) || 
             (this.includeAlliancePref!=null &&
              java.util.Arrays.equals(this.includeAlliancePref, other.getIncludeAlliancePref()))) &&
            ((this.excludeAlliancePref==null && other.getExcludeAlliancePref()==null) || 
             (this.excludeAlliancePref!=null &&
              java.util.Arrays.equals(this.excludeAlliancePref, other.getExcludeAlliancePref())));
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
        if (getIncludeAlliancePref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncludeAlliancePref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludeAlliancePref(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludeAlliancePref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludeAlliancePref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludeAlliancePref(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferencesTPA_Extensions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternatePCC>TravelPreferences>TPA_Extensions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeAlliancePref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "IncludeAlliancePref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AllianceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeAlliancePref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExcludeAlliancePref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AllianceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
