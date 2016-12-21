/**
 * OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferences travelPreferences;

    private java.lang.String pseudoCityCode;  // attribute

    public OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC() {
    }

    public OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC(
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferences travelPreferences,
           java.lang.String pseudoCityCode) {
           this.travelPreferences = travelPreferences;
           this.pseudoCityCode = pseudoCityCode;
    }


    /**
     * Gets the travelPreferences value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC.
     * 
     * @return travelPreferences
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferences getTravelPreferences() {
        return travelPreferences;
    }


    /**
     * Sets the travelPreferences value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC.
     * 
     * @param travelPreferences
     */
    public void setTravelPreferences(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCCTravelPreferences travelPreferences) {
        this.travelPreferences = travelPreferences;
    }


    /**
     * Gets the pseudoCityCode value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC.
     * 
     * @return pseudoCityCode
     */
    public java.lang.String getPseudoCityCode() {
        return pseudoCityCode;
    }


    /**
     * Sets the pseudoCityCode value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC.
     * 
     * @param pseudoCityCode
     */
    public void setPseudoCityCode(java.lang.String pseudoCityCode) {
        this.pseudoCityCode = pseudoCityCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC)) return false;
        OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC other = (OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.travelPreferences==null && other.getTravelPreferences()==null) || 
             (this.travelPreferences!=null &&
              this.travelPreferences.equals(other.getTravelPreferences()))) &&
            ((this.pseudoCityCode==null && other.getPseudoCityCode()==null) || 
             (this.pseudoCityCode!=null &&
              this.pseudoCityCode.equals(other.getPseudoCityCode())));
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
        if (getTravelPreferences() != null) {
            _hashCode += getTravelPreferences().hashCode();
        }
        if (getPseudoCityCode() != null) {
            _hashCode += getPseudoCityCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQTPA_ExtensionsAlternatePCC.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternatePCC"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("pseudoCityCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PseudoCityCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelPreferences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelPreferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternatePCC>TravelPreferences"));
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
