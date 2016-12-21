/**
 * OTA_AirLowFareSearchRSOneWayItinerariesSimpleOneWayItineraries.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRSOneWayItinerariesSimpleOneWayItineraries  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.OneWayProcessingMessageType[] TPA_Extensions;

    /* Container for priced itinerary type. */
    private org.opentravel.www.OTA._2003._05.PricedItineraryType[] pricedItinerary;

    private java.lang.String RPH;  // attribute

    public OTA_AirLowFareSearchRSOneWayItinerariesSimpleOneWayItineraries() {
    }

    public OTA_AirLowFareSearchRSOneWayItinerariesSimpleOneWayItineraries(
           org.opentravel.www.OTA._2003._05.OneWayProcessingMessageType[] TPA_Extensions,
           org.opentravel.www.OTA._2003._05.PricedItineraryType[] pricedItinerary,
           java.lang.String RPH) {
           this.TPA_Extensions = TPA_Extensions;
           this.pricedItinerary = pricedItinerary;
           this.RPH = RPH;
    }


    /**
     * Gets the TPA_Extensions value for this OTA_AirLowFareSearchRSOneWayItinerariesSimpleOneWayItineraries.
     * 
     * @return TPA_Extensions
     */
    public org.opentravel.www.OTA._2003._05.OneWayProcessingMessageType[] getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this OTA_AirLowFareSearchRSOneWayItinerariesSimpleOneWayItineraries.
     * 
     * @param TPA_Extensions
     */
    public void setTPA_Extensions(org.opentravel.www.OTA._2003._05.OneWayProcessingMessageType[] TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the pricedItinerary value for this OTA_AirLowFareSearchRSOneWayItinerariesSimpleOneWayItineraries.
     * 
     * @return pricedItinerary   * Container for priced itinerary type.
     */
    public org.opentravel.www.OTA._2003._05.PricedItineraryType[] getPricedItinerary() {
        return pricedItinerary;
    }


    /**
     * Sets the pricedItinerary value for this OTA_AirLowFareSearchRSOneWayItinerariesSimpleOneWayItineraries.
     * 
     * @param pricedItinerary   * Container for priced itinerary type.
     */
    public void setPricedItinerary(org.opentravel.www.OTA._2003._05.PricedItineraryType[] pricedItinerary) {
        this.pricedItinerary = pricedItinerary;
    }

    public org.opentravel.www.OTA._2003._05.PricedItineraryType getPricedItinerary(int i) {
        return this.pricedItinerary[i];
    }

    public void setPricedItinerary(int i, org.opentravel.www.OTA._2003._05.PricedItineraryType _value) {
        this.pricedItinerary[i] = _value;
    }


    /**
     * Gets the RPH value for this OTA_AirLowFareSearchRSOneWayItinerariesSimpleOneWayItineraries.
     * 
     * @return RPH
     */
    public java.lang.String getRPH() {
        return RPH;
    }


    /**
     * Sets the RPH value for this OTA_AirLowFareSearchRSOneWayItinerariesSimpleOneWayItineraries.
     * 
     * @param RPH
     */
    public void setRPH(java.lang.String RPH) {
        this.RPH = RPH;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRSOneWayItinerariesSimpleOneWayItineraries)) return false;
        OTA_AirLowFareSearchRSOneWayItinerariesSimpleOneWayItineraries other = (OTA_AirLowFareSearchRSOneWayItinerariesSimpleOneWayItineraries) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              java.util.Arrays.equals(this.TPA_Extensions, other.getTPA_Extensions()))) &&
            ((this.pricedItinerary==null && other.getPricedItinerary()==null) || 
             (this.pricedItinerary!=null &&
              java.util.Arrays.equals(this.pricedItinerary, other.getPricedItinerary()))) &&
            ((this.RPH==null && other.getRPH()==null) || 
             (this.RPH!=null &&
              this.RPH.equals(other.getRPH())));
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
        if (getTPA_Extensions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTPA_Extensions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTPA_Extensions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPricedItinerary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPricedItinerary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPricedItinerary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRPH() != null) {
            _hashCode += getRPH().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRSOneWayItinerariesSimpleOneWayItineraries.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRS>OneWayItineraries>SimpleOneWayItineraries"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("RPH");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RPH"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RPH_Type"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OneWayProcessingMessageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ProcessingMessage"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricedItinerary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PricedItinerary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PricedItineraryType"));
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
