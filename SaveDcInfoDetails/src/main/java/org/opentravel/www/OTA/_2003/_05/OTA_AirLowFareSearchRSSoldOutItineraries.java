/**
 * OTA_AirLowFareSearchRSSoldOutItineraries.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRSSoldOutItineraries  implements java.io.Serializable {
    /* Low Fare priced itineraries container. */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSSoldOutItinerariesPricedItineraries pricedItineraries;

    /* Successfull Low Fare priced itineraries in response to a Simplified
     * One Way request. */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSSoldOutItinerariesOneWayItineraries oneWayItineraries;

    public OTA_AirLowFareSearchRSSoldOutItineraries() {
    }

    public OTA_AirLowFareSearchRSSoldOutItineraries(
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSSoldOutItinerariesPricedItineraries pricedItineraries,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSSoldOutItinerariesOneWayItineraries oneWayItineraries) {
           this.pricedItineraries = pricedItineraries;
           this.oneWayItineraries = oneWayItineraries;
    }


    /**
     * Gets the pricedItineraries value for this OTA_AirLowFareSearchRSSoldOutItineraries.
     * 
     * @return pricedItineraries   * Low Fare priced itineraries container.
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSSoldOutItinerariesPricedItineraries getPricedItineraries() {
        return pricedItineraries;
    }


    /**
     * Sets the pricedItineraries value for this OTA_AirLowFareSearchRSSoldOutItineraries.
     * 
     * @param pricedItineraries   * Low Fare priced itineraries container.
     */
    public void setPricedItineraries(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSSoldOutItinerariesPricedItineraries pricedItineraries) {
        this.pricedItineraries = pricedItineraries;
    }


    /**
     * Gets the oneWayItineraries value for this OTA_AirLowFareSearchRSSoldOutItineraries.
     * 
     * @return oneWayItineraries   * Successfull Low Fare priced itineraries in response to a Simplified
     * One Way request.
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSSoldOutItinerariesOneWayItineraries getOneWayItineraries() {
        return oneWayItineraries;
    }


    /**
     * Sets the oneWayItineraries value for this OTA_AirLowFareSearchRSSoldOutItineraries.
     * 
     * @param oneWayItineraries   * Successfull Low Fare priced itineraries in response to a Simplified
     * One Way request.
     */
    public void setOneWayItineraries(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRSSoldOutItinerariesOneWayItineraries oneWayItineraries) {
        this.oneWayItineraries = oneWayItineraries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRSSoldOutItineraries)) return false;
        OTA_AirLowFareSearchRSSoldOutItineraries other = (OTA_AirLowFareSearchRSSoldOutItineraries) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pricedItineraries==null && other.getPricedItineraries()==null) || 
             (this.pricedItineraries!=null &&
              this.pricedItineraries.equals(other.getPricedItineraries()))) &&
            ((this.oneWayItineraries==null && other.getOneWayItineraries()==null) || 
             (this.oneWayItineraries!=null &&
              this.oneWayItineraries.equals(other.getOneWayItineraries())));
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
        if (getPricedItineraries() != null) {
            _hashCode += getPricedItineraries().hashCode();
        }
        if (getOneWayItineraries() != null) {
            _hashCode += getOneWayItineraries().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRSSoldOutItineraries.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRS>SoldOutItineraries"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricedItineraries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PricedItineraries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRS>SoldOutItineraries>PricedItineraries"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneWayItineraries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OneWayItineraries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRS>SoldOutItineraries>OneWayItineraries"));
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
