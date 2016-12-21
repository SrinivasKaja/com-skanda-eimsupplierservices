/**
 * OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities  implements java.io.Serializable {
    /* A desired location (airport city). */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCitiesSpecifiedLocation specifiedLocation;

    /* An alternate location (airport city). */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCitiesAlternateLocation[] alternateLocation;

    public OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities() {
    }

    public OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities(
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCitiesSpecifiedLocation specifiedLocation,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCitiesAlternateLocation[] alternateLocation) {
           this.specifiedLocation = specifiedLocation;
           this.alternateLocation = alternateLocation;
    }


    /**
     * Gets the specifiedLocation value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities.
     * 
     * @return specifiedLocation   * A desired location (airport city).
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCitiesSpecifiedLocation getSpecifiedLocation() {
        return specifiedLocation;
    }


    /**
     * Sets the specifiedLocation value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities.
     * 
     * @param specifiedLocation   * A desired location (airport city).
     */
    public void setSpecifiedLocation(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCitiesSpecifiedLocation specifiedLocation) {
        this.specifiedLocation = specifiedLocation;
    }


    /**
     * Gets the alternateLocation value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities.
     * 
     * @return alternateLocation   * An alternate location (airport city).
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCitiesAlternateLocation[] getAlternateLocation() {
        return alternateLocation;
    }


    /**
     * Sets the alternateLocation value for this OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities.
     * 
     * @param alternateLocation   * An alternate location (airport city).
     */
    public void setAlternateLocation(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCitiesAlternateLocation[] alternateLocation) {
        this.alternateLocation = alternateLocation;
    }

    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCitiesAlternateLocation getAlternateLocation(int i) {
        return this.alternateLocation[i];
    }

    public void setAlternateLocation(int i, org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCitiesAlternateLocation _value) {
        this.alternateLocation[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities)) return false;
        OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities other = (OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.specifiedLocation==null && other.getSpecifiedLocation()==null) || 
             (this.specifiedLocation!=null &&
              this.specifiedLocation.equals(other.getSpecifiedLocation()))) &&
            ((this.alternateLocation==null && other.getAlternateLocation()==null) || 
             (this.alternateLocation!=null &&
              java.util.Arrays.equals(this.alternateLocation, other.getAlternateLocation())));
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
        if (getSpecifiedLocation() != null) {
            _hashCode += getSpecifiedLocation().hashCode();
        }
        if (getAlternateLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlternateLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlternateLocation(), i);
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
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQTPA_ExtensionsAlternateAirportCities.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternateAirportCities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specifiedLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SpecifiedLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternateAirportCities>SpecifiedLocation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlternateLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>TPA_Extensions>AlternateAirportCities>AlternateLocation"));
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
