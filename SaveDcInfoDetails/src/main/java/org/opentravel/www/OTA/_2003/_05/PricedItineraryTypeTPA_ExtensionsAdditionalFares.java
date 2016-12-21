/**
 * PricedItineraryTypeTPA_ExtensionsAdditionalFares.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PricedItineraryTypeTPA_ExtensionsAdditionalFares  implements java.io.Serializable {
    /* Pricing Information for an Air Itinerary. */
    private org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsAdditionalFaresAirItineraryPricingInfo airItineraryPricingInfo;

    /* Provides for free form descriptive information for the priced
     * itinerary. */
    private org.opentravel.www.OTA._2003._05.FreeTextType[] notes;

    /* Information about ticketing (including eTicketNumber). */
    private org.opentravel.www.OTA._2003._05.TicketingInfoRS_Type ticketingInfo;

    private java.lang.Boolean multipleTickets;  // attribute

    public PricedItineraryTypeTPA_ExtensionsAdditionalFares() {
    }

    public PricedItineraryTypeTPA_ExtensionsAdditionalFares(
           org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsAdditionalFaresAirItineraryPricingInfo airItineraryPricingInfo,
           org.opentravel.www.OTA._2003._05.FreeTextType[] notes,
           org.opentravel.www.OTA._2003._05.TicketingInfoRS_Type ticketingInfo,
           java.lang.Boolean multipleTickets) {
           this.airItineraryPricingInfo = airItineraryPricingInfo;
           this.notes = notes;
           this.ticketingInfo = ticketingInfo;
           this.multipleTickets = multipleTickets;
    }


    /**
     * Gets the airItineraryPricingInfo value for this PricedItineraryTypeTPA_ExtensionsAdditionalFares.
     * 
     * @return airItineraryPricingInfo   * Pricing Information for an Air Itinerary.
     */
    public org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsAdditionalFaresAirItineraryPricingInfo getAirItineraryPricingInfo() {
        return airItineraryPricingInfo;
    }


    /**
     * Sets the airItineraryPricingInfo value for this PricedItineraryTypeTPA_ExtensionsAdditionalFares.
     * 
     * @param airItineraryPricingInfo   * Pricing Information for an Air Itinerary.
     */
    public void setAirItineraryPricingInfo(org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_ExtensionsAdditionalFaresAirItineraryPricingInfo airItineraryPricingInfo) {
        this.airItineraryPricingInfo = airItineraryPricingInfo;
    }


    /**
     * Gets the notes value for this PricedItineraryTypeTPA_ExtensionsAdditionalFares.
     * 
     * @return notes   * Provides for free form descriptive information for the priced
     * itinerary.
     */
    public org.opentravel.www.OTA._2003._05.FreeTextType[] getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this PricedItineraryTypeTPA_ExtensionsAdditionalFares.
     * 
     * @param notes   * Provides for free form descriptive information for the priced
     * itinerary.
     */
    public void setNotes(org.opentravel.www.OTA._2003._05.FreeTextType[] notes) {
        this.notes = notes;
    }

    public org.opentravel.www.OTA._2003._05.FreeTextType getNotes(int i) {
        return this.notes[i];
    }

    public void setNotes(int i, org.opentravel.www.OTA._2003._05.FreeTextType _value) {
        this.notes[i] = _value;
    }


    /**
     * Gets the ticketingInfo value for this PricedItineraryTypeTPA_ExtensionsAdditionalFares.
     * 
     * @return ticketingInfo   * Information about ticketing (including eTicketNumber).
     */
    public org.opentravel.www.OTA._2003._05.TicketingInfoRS_Type getTicketingInfo() {
        return ticketingInfo;
    }


    /**
     * Sets the ticketingInfo value for this PricedItineraryTypeTPA_ExtensionsAdditionalFares.
     * 
     * @param ticketingInfo   * Information about ticketing (including eTicketNumber).
     */
    public void setTicketingInfo(org.opentravel.www.OTA._2003._05.TicketingInfoRS_Type ticketingInfo) {
        this.ticketingInfo = ticketingInfo;
    }


    /**
     * Gets the multipleTickets value for this PricedItineraryTypeTPA_ExtensionsAdditionalFares.
     * 
     * @return multipleTickets
     */
    public java.lang.Boolean getMultipleTickets() {
        return multipleTickets;
    }


    /**
     * Sets the multipleTickets value for this PricedItineraryTypeTPA_ExtensionsAdditionalFares.
     * 
     * @param multipleTickets
     */
    public void setMultipleTickets(java.lang.Boolean multipleTickets) {
        this.multipleTickets = multipleTickets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PricedItineraryTypeTPA_ExtensionsAdditionalFares)) return false;
        PricedItineraryTypeTPA_ExtensionsAdditionalFares other = (PricedItineraryTypeTPA_ExtensionsAdditionalFares) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airItineraryPricingInfo==null && other.getAirItineraryPricingInfo()==null) || 
             (this.airItineraryPricingInfo!=null &&
              this.airItineraryPricingInfo.equals(other.getAirItineraryPricingInfo()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              java.util.Arrays.equals(this.notes, other.getNotes()))) &&
            ((this.ticketingInfo==null && other.getTicketingInfo()==null) || 
             (this.ticketingInfo!=null &&
              this.ticketingInfo.equals(other.getTicketingInfo()))) &&
            ((this.multipleTickets==null && other.getMultipleTickets()==null) || 
             (this.multipleTickets!=null &&
              this.multipleTickets.equals(other.getMultipleTickets())));
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
        if (getAirItineraryPricingInfo() != null) {
            _hashCode += getAirItineraryPricingInfo().hashCode();
        }
        if (getNotes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTicketingInfo() != null) {
            _hashCode += getTicketingInfo().hashCode();
        }
        if (getMultipleTickets() != null) {
            _hashCode += getMultipleTickets().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PricedItineraryTypeTPA_ExtensionsAdditionalFares.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PricedItineraryType>TPA_Extensions>AdditionalFares"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("multipleTickets");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MultipleTickets"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airItineraryPricingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirItineraryPricingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>PricedItineraryType>TPA_Extensions>AdditionalFares>AirItineraryPricingInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FreeTextType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TicketingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TicketingInfoRS_Type"));
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
