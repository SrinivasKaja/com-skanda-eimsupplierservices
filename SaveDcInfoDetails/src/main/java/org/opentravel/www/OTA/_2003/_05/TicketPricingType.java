/**
 * TicketPricingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Pricing Information for Single Ticket
 */
public class TicketPricingType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment[][] originDestinationOptions;

    /* Pricing Information for a Ticket. */
    private org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoType airItineraryPricingInfo;

    /* Provides for free form descriptive information for the priced
     * itinerary. */
    private org.opentravel.www.OTA._2003._05.FreeTextType[] notes;

    /* Container for TicketingInfoRS_Type. */
    private org.opentravel.www.OTA._2003._05.TicketingInfoRS_Type ticketingInfo;

    /* Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA). */
    private org.opentravel.www.OTA._2003._05.TicketPricingTypeTPA_Extensions TPA_Extensions;

    private int number;  // attribute

    public TicketPricingType() {
    }

    public TicketPricingType(
           org.opentravel.www.OTA._2003._05.TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment[][] originDestinationOptions,
           org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoType airItineraryPricingInfo,
           org.opentravel.www.OTA._2003._05.FreeTextType[] notes,
           org.opentravel.www.OTA._2003._05.TicketingInfoRS_Type ticketingInfo,
           org.opentravel.www.OTA._2003._05.TicketPricingTypeTPA_Extensions TPA_Extensions,
           int number) {
           this.originDestinationOptions = originDestinationOptions;
           this.airItineraryPricingInfo = airItineraryPricingInfo;
           this.notes = notes;
           this.ticketingInfo = ticketingInfo;
           this.TPA_Extensions = TPA_Extensions;
           this.number = number;
    }


    /**
     * Gets the originDestinationOptions value for this TicketPricingType.
     * 
     * @return originDestinationOptions
     */
    public org.opentravel.www.OTA._2003._05.TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment[][] getOriginDestinationOptions() {
        return originDestinationOptions;
    }


    /**
     * Sets the originDestinationOptions value for this TicketPricingType.
     * 
     * @param originDestinationOptions
     */
    public void setOriginDestinationOptions(org.opentravel.www.OTA._2003._05.TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment[][] originDestinationOptions) {
        this.originDestinationOptions = originDestinationOptions;
    }


    /**
     * Gets the airItineraryPricingInfo value for this TicketPricingType.
     * 
     * @return airItineraryPricingInfo   * Pricing Information for a Ticket.
     */
    public org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoType getAirItineraryPricingInfo() {
        return airItineraryPricingInfo;
    }


    /**
     * Sets the airItineraryPricingInfo value for this TicketPricingType.
     * 
     * @param airItineraryPricingInfo   * Pricing Information for a Ticket.
     */
    public void setAirItineraryPricingInfo(org.opentravel.www.OTA._2003._05.AirItineraryPricingInfoType airItineraryPricingInfo) {
        this.airItineraryPricingInfo = airItineraryPricingInfo;
    }


    /**
     * Gets the notes value for this TicketPricingType.
     * 
     * @return notes   * Provides for free form descriptive information for the priced
     * itinerary.
     */
    public org.opentravel.www.OTA._2003._05.FreeTextType[] getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this TicketPricingType.
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
     * Gets the ticketingInfo value for this TicketPricingType.
     * 
     * @return ticketingInfo   * Container for TicketingInfoRS_Type.
     */
    public org.opentravel.www.OTA._2003._05.TicketingInfoRS_Type getTicketingInfo() {
        return ticketingInfo;
    }


    /**
     * Sets the ticketingInfo value for this TicketPricingType.
     * 
     * @param ticketingInfo   * Container for TicketingInfoRS_Type.
     */
    public void setTicketingInfo(org.opentravel.www.OTA._2003._05.TicketingInfoRS_Type ticketingInfo) {
        this.ticketingInfo = ticketingInfo;
    }


    /**
     * Gets the TPA_Extensions value for this TicketPricingType.
     * 
     * @return TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public org.opentravel.www.OTA._2003._05.TicketPricingTypeTPA_Extensions getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this TicketPricingType.
     * 
     * @param TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public void setTPA_Extensions(org.opentravel.www.OTA._2003._05.TicketPricingTypeTPA_Extensions TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the number value for this TicketPricingType.
     * 
     * @return number
     */
    public int getNumber() {
        return number;
    }


    /**
     * Sets the number value for this TicketPricingType.
     * 
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicketPricingType)) return false;
        TicketPricingType other = (TicketPricingType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.originDestinationOptions==null && other.getOriginDestinationOptions()==null) || 
             (this.originDestinationOptions!=null &&
              java.util.Arrays.equals(this.originDestinationOptions, other.getOriginDestinationOptions()))) &&
            ((this.airItineraryPricingInfo==null && other.getAirItineraryPricingInfo()==null) || 
             (this.airItineraryPricingInfo!=null &&
              this.airItineraryPricingInfo.equals(other.getAirItineraryPricingInfo()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              java.util.Arrays.equals(this.notes, other.getNotes()))) &&
            ((this.ticketingInfo==null && other.getTicketingInfo()==null) || 
             (this.ticketingInfo!=null &&
              this.ticketingInfo.equals(other.getTicketingInfo()))) &&
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions()))) &&
            this.number == other.getNumber();
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
        if (getOriginDestinationOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOriginDestinationOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOriginDestinationOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getTPA_Extensions() != null) {
            _hashCode += getTPA_Extensions().hashCode();
        }
        _hashCode += getNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicketPricingType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TicketPricingType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("number");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Number"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originDestinationOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginDestinationOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TicketPricingType>OriginDestinationOptions>OriginDestinationOption"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginDestinationOption"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airItineraryPricingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirItineraryPricingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirItineraryPricingInfoType"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TicketPricingType>TPA_Extensions"));
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
