/**
 * PricedItineraryTypeTPA_ExtensionsAdditionalFaresAirItineraryPricingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PricedItineraryTypeTPA_ExtensionsAdditionalFaresAirItineraryPricingInfo  extends org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoType  implements java.io.Serializable {
    /* Pricing information for multiple separate tickets */
    private org.opentravel.www.OTA._2003._05.TicketPricingType[] tickets;

    public PricedItineraryTypeTPA_ExtensionsAdditionalFaresAirItineraryPricingInfo() {
    }

    public PricedItineraryTypeTPA_ExtensionsAdditionalFaresAirItineraryPricingInfo(
           java.lang.String pricingSource,
           java.lang.String pricingSubSource,
           java.lang.String pseudoCityCode,
           java.lang.String brandID,
           java.lang.Boolean fareReturned,
           java.lang.String fareStatus,
           java.lang.Boolean cachedItin,
           java.lang.String cachePartition,
           org.apache.axis.types.NonNegativeInteger cachePartitionPriority,
           java.lang.String cacheVersion,
           java.math.BigInteger timeToLive,
           boolean alternateCityOption,
           org.opentravel.www.OTA._2003._05.TimeOrDateTimeType lastTicketDate,
           java.lang.String privateFareType,
           org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeSpanishFamilyDiscountIndicator spanishFamilyDiscountIndicator,
           org.apache.axis.types.PositiveInteger flexibleFareID,
           java.util.Date previousExchangeDate,
           org.opentravel.www.OTA._2003._05.ReissueExchange reissueExchange,
           java.util.Date advancedPurchaseDate,
           java.util.Date purchaseByDate,
           org.opentravel.www.OTA._2003._05.ItinTotalFareType itinTotalFare,
           org.opentravel.www.OTA._2003._05.PTCFareBreakdownType[] PTC_FareBreakdowns,
           org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeFareInfosFareInfo[] fareInfos,
           org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoTypeTPA_Extensions TPA_Extensions,
           org.opentravel.www.OTA._2003._05.TicketPricingType[] tickets) {
        super(
            pricingSource,
            pricingSubSource,
            pseudoCityCode,
            brandID,
            fareReturned,
            fareStatus,
            cachedItin,
            cachePartition,
            cachePartitionPriority,
            cacheVersion,
            timeToLive,
            alternateCityOption,
            lastTicketDate,
            privateFareType,
            spanishFamilyDiscountIndicator,
            flexibleFareID,
            previousExchangeDate,
            reissueExchange,
            advancedPurchaseDate,
            purchaseByDate,
            itinTotalFare,
            PTC_FareBreakdowns,
            fareInfos,
            TPA_Extensions);
        this.tickets = tickets;
    }


    /**
     * Gets the tickets value for this PricedItineraryTypeTPA_ExtensionsAdditionalFaresAirItineraryPricingInfo.
     * 
     * @return tickets   * Pricing information for multiple separate tickets
     */
    public org.opentravel.www.OTA._2003._05.TicketPricingType[] getTickets() {
        return tickets;
    }


    /**
     * Sets the tickets value for this PricedItineraryTypeTPA_ExtensionsAdditionalFaresAirItineraryPricingInfo.
     * 
     * @param tickets   * Pricing information for multiple separate tickets
     */
    public void setTickets(org.opentravel.www.OTA._2003._05.TicketPricingType[] tickets) {
        this.tickets = tickets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PricedItineraryTypeTPA_ExtensionsAdditionalFaresAirItineraryPricingInfo)) return false;
        PricedItineraryTypeTPA_ExtensionsAdditionalFaresAirItineraryPricingInfo other = (PricedItineraryTypeTPA_ExtensionsAdditionalFaresAirItineraryPricingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tickets==null && other.getTickets()==null) || 
             (this.tickets!=null &&
              java.util.Arrays.equals(this.tickets, other.getTickets())));
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
        if (getTickets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTickets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTickets(), i);
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
        new org.apache.axis.description.TypeDesc(PricedItineraryTypeTPA_ExtensionsAdditionalFaresAirItineraryPricingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PricedItineraryType>TPA_Extensions>AdditionalFares>AirItineraryPricingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tickets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Tickets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TicketPricingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Ticket"));
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
