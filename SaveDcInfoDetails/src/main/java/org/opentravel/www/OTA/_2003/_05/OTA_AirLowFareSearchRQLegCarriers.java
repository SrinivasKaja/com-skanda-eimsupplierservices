/**
 * OTA_AirLowFareSearchRQLegCarriers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQLegCarriers  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.IncludeVendorPrefType[] includeVendorPref;

    /* Do not consider these carriers for this leg. */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegCarriersExcludeVendorPref[] excludeVendorPref;

    public OTA_AirLowFareSearchRQLegCarriers() {
    }

    public OTA_AirLowFareSearchRQLegCarriers(
           org.opentravel.www.OTA._2003._05.IncludeVendorPrefType[] includeVendorPref,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegCarriersExcludeVendorPref[] excludeVendorPref) {
           this.includeVendorPref = includeVendorPref;
           this.excludeVendorPref = excludeVendorPref;
    }


    /**
     * Gets the includeVendorPref value for this OTA_AirLowFareSearchRQLegCarriers.
     * 
     * @return includeVendorPref
     */
    public org.opentravel.www.OTA._2003._05.IncludeVendorPrefType[] getIncludeVendorPref() {
        return includeVendorPref;
    }


    /**
     * Sets the includeVendorPref value for this OTA_AirLowFareSearchRQLegCarriers.
     * 
     * @param includeVendorPref
     */
    public void setIncludeVendorPref(org.opentravel.www.OTA._2003._05.IncludeVendorPrefType[] includeVendorPref) {
        this.includeVendorPref = includeVendorPref;
    }

    public org.opentravel.www.OTA._2003._05.IncludeVendorPrefType getIncludeVendorPref(int i) {
        return this.includeVendorPref[i];
    }

    public void setIncludeVendorPref(int i, org.opentravel.www.OTA._2003._05.IncludeVendorPrefType _value) {
        this.includeVendorPref[i] = _value;
    }


    /**
     * Gets the excludeVendorPref value for this OTA_AirLowFareSearchRQLegCarriers.
     * 
     * @return excludeVendorPref   * Do not consider these carriers for this leg.
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegCarriersExcludeVendorPref[] getExcludeVendorPref() {
        return excludeVendorPref;
    }


    /**
     * Sets the excludeVendorPref value for this OTA_AirLowFareSearchRQLegCarriers.
     * 
     * @param excludeVendorPref   * Do not consider these carriers for this leg.
     */
    public void setExcludeVendorPref(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegCarriersExcludeVendorPref[] excludeVendorPref) {
        this.excludeVendorPref = excludeVendorPref;
    }

    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegCarriersExcludeVendorPref getExcludeVendorPref(int i) {
        return this.excludeVendorPref[i];
    }

    public void setExcludeVendorPref(int i, org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegCarriersExcludeVendorPref _value) {
        this.excludeVendorPref[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQLegCarriers)) return false;
        OTA_AirLowFareSearchRQLegCarriers other = (OTA_AirLowFareSearchRQLegCarriers) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.includeVendorPref==null && other.getIncludeVendorPref()==null) || 
             (this.includeVendorPref!=null &&
              java.util.Arrays.equals(this.includeVendorPref, other.getIncludeVendorPref()))) &&
            ((this.excludeVendorPref==null && other.getExcludeVendorPref()==null) || 
             (this.excludeVendorPref!=null &&
              java.util.Arrays.equals(this.excludeVendorPref, other.getExcludeVendorPref())));
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
        if (getIncludeVendorPref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncludeVendorPref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludeVendorPref(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludeVendorPref() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludeVendorPref());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludeVendorPref(), i);
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
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQLegCarriers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>Leg>Carriers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeVendorPref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "IncludeVendorPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "IncludeVendorPrefType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeVendorPref");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExcludeVendorPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>Leg>Carriers>ExcludeVendorPref"));
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
