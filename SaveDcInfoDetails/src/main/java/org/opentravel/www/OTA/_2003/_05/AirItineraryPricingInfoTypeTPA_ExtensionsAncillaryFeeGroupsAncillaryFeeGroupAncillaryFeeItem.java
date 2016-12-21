/**
 * AirItineraryPricingInfoTypeTPA_ExtensionsAncillaryFeeGroupsAncillaryFeeGroupAncillaryFeeItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirItineraryPricingInfoTypeTPA_ExtensionsAncillaryFeeGroupsAncillaryFeeGroupAncillaryFeeItem  extends org.opentravel.www.OTA._2003._05.OCFeeType  implements java.io.Serializable {
    public AirItineraryPricingInfoTypeTPA_ExtensionsAncillaryFeeGroupsAncillaryFeeGroupAncillaryFeeItem() {
    }

    public AirItineraryPricingInfoTypeTPA_ExtensionsAncillaryFeeGroupsAncillaryFeeGroupAncillaryFeeItem(
           java.math.BigDecimal amount,
           java.lang.String description,
           java.lang.String originAirport,
           java.lang.String destinationAirport,
           java.lang.String carrier,
           java.lang.String passengerCode,
           java.lang.String date,
           java.lang.Object startSegment,
           java.lang.Object endSegment) {
        super(
            amount,
            description,
            originAirport,
            destinationAirport,
            carrier,
            passengerCode,
            date,
            startSegment,
            endSegment);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirItineraryPricingInfoTypeTPA_ExtensionsAncillaryFeeGroupsAncillaryFeeGroupAncillaryFeeItem)) return false;
        AirItineraryPricingInfoTypeTPA_ExtensionsAncillaryFeeGroupsAncillaryFeeGroupAncillaryFeeItem other = (AirItineraryPricingInfoTypeTPA_ExtensionsAncillaryFeeGroupsAncillaryFeeGroupAncillaryFeeItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirItineraryPricingInfoTypeTPA_ExtensionsAncillaryFeeGroupsAncillaryFeeGroupAncillaryFeeItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>AirItineraryPricingInfoType>TPA_Extensions>AncillaryFeeGroups>AncillaryFeeGroup>AncillaryFeeItem"));
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
