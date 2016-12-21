/**
 * OTA_AirLowFareSearchRQTPA_ExtensionsItineraryCache.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQTPA_ExtensionsItineraryCache  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt publicTimeToLive;  // attribute

    private boolean removePreviousOnUpdate;  // attribute

    public OTA_AirLowFareSearchRQTPA_ExtensionsItineraryCache() {
    }

    public OTA_AirLowFareSearchRQTPA_ExtensionsItineraryCache(
           org.apache.axis.types.UnsignedInt publicTimeToLive,
           boolean removePreviousOnUpdate) {
           this.publicTimeToLive = publicTimeToLive;
           this.removePreviousOnUpdate = removePreviousOnUpdate;
    }


    /**
     * Gets the publicTimeToLive value for this OTA_AirLowFareSearchRQTPA_ExtensionsItineraryCache.
     * 
     * @return publicTimeToLive
     */
    public org.apache.axis.types.UnsignedInt getPublicTimeToLive() {
        return publicTimeToLive;
    }


    /**
     * Sets the publicTimeToLive value for this OTA_AirLowFareSearchRQTPA_ExtensionsItineraryCache.
     * 
     * @param publicTimeToLive
     */
    public void setPublicTimeToLive(org.apache.axis.types.UnsignedInt publicTimeToLive) {
        this.publicTimeToLive = publicTimeToLive;
    }


    /**
     * Gets the removePreviousOnUpdate value for this OTA_AirLowFareSearchRQTPA_ExtensionsItineraryCache.
     * 
     * @return removePreviousOnUpdate
     */
    public boolean isRemovePreviousOnUpdate() {
        return removePreviousOnUpdate;
    }


    /**
     * Sets the removePreviousOnUpdate value for this OTA_AirLowFareSearchRQTPA_ExtensionsItineraryCache.
     * 
     * @param removePreviousOnUpdate
     */
    public void setRemovePreviousOnUpdate(boolean removePreviousOnUpdate) {
        this.removePreviousOnUpdate = removePreviousOnUpdate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQTPA_ExtensionsItineraryCache)) return false;
        OTA_AirLowFareSearchRQTPA_ExtensionsItineraryCache other = (OTA_AirLowFareSearchRQTPA_ExtensionsItineraryCache) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.publicTimeToLive==null && other.getPublicTimeToLive()==null) || 
             (this.publicTimeToLive!=null &&
              this.publicTimeToLive.equals(other.getPublicTimeToLive()))) &&
            this.removePreviousOnUpdate == other.isRemovePreviousOnUpdate();
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
        if (getPublicTimeToLive() != null) {
            _hashCode += getPublicTimeToLive().hashCode();
        }
        _hashCode += (isRemovePreviousOnUpdate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQTPA_ExtensionsItineraryCache.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>ItineraryCache"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("publicTimeToLive");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PublicTimeToLive"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("removePreviousOnUpdate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RemovePreviousOnUpdate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
