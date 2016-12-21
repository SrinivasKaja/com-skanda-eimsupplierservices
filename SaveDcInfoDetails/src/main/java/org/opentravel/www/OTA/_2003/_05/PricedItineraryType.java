/**
 * PricedItineraryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Itinerary with pricing information.
 */
public class PricedItineraryType  implements java.io.Serializable {
    /* Specifies the origin and destination of the traveler. */
    private org.opentravel.www.OTA._2003._05.AirItineraryType airItinerary;

    /* Pricing Information for an Air Itinerary. */
    private org.opentravel.www.OTA._2003._05.PricedItineraryTypeAirItineraryPricingInfo[] airItineraryPricingInfo;

    /* Provides for free form descriptive information for the priced
     * itinerary. */
    private org.opentravel.www.OTA._2003._05.FreeTextType[] notes;

    /* Container for TicketingInfoRS_Type. */
    private org.opentravel.www.OTA._2003._05.TicketingInfoRS_Type ticketingInfo;

    /* Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA). */
    private org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_Extensions TPA_Extensions;

    private java.lang.Boolean isFromCustomPath;  // attribute

    private org.apache.axis.types.PositiveInteger sequenceNumber;  // attribute

    private java.lang.String originDestinationRPH;  // attribute

    private java.lang.String campaignID;  // attribute

    private java.lang.Boolean alternateAirport;  // attribute

    private java.lang.Boolean multipleTickets;  // attribute

    public PricedItineraryType() {
    }

    public PricedItineraryType(
           org.opentravel.www.OTA._2003._05.AirItineraryType airItinerary,
           org.opentravel.www.OTA._2003._05.PricedItineraryTypeAirItineraryPricingInfo[] airItineraryPricingInfo,
           org.opentravel.www.OTA._2003._05.FreeTextType[] notes,
           org.opentravel.www.OTA._2003._05.TicketingInfoRS_Type ticketingInfo,
           org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_Extensions TPA_Extensions,
           java.lang.Boolean isFromCustomPath,
           org.apache.axis.types.PositiveInteger sequenceNumber,
           java.lang.String originDestinationRPH,
           java.lang.String campaignID,
           java.lang.Boolean alternateAirport,
           java.lang.Boolean multipleTickets) {
           this.airItinerary = airItinerary;
           this.airItineraryPricingInfo = airItineraryPricingInfo;
           this.notes = notes;
           this.ticketingInfo = ticketingInfo;
           this.TPA_Extensions = TPA_Extensions;
           this.isFromCustomPath = isFromCustomPath;
           this.sequenceNumber = sequenceNumber;
           this.originDestinationRPH = originDestinationRPH;
           this.campaignID = campaignID;
           this.alternateAirport = alternateAirport;
           this.multipleTickets = multipleTickets;
    }


    /**
     * Gets the airItinerary value for this PricedItineraryType.
     * 
     * @return airItinerary   * Specifies the origin and destination of the traveler.
     */
    public org.opentravel.www.OTA._2003._05.AirItineraryType getAirItinerary() {
        return airItinerary;
    }


    /**
     * Sets the airItinerary value for this PricedItineraryType.
     * 
     * @param airItinerary   * Specifies the origin and destination of the traveler.
     */
    public void setAirItinerary(org.opentravel.www.OTA._2003._05.AirItineraryType airItinerary) {
        this.airItinerary = airItinerary;
    }


    /**
     * Gets the airItineraryPricingInfo value for this PricedItineraryType.
     * 
     * @return airItineraryPricingInfo   * Pricing Information for an Air Itinerary.
     */
    public org.opentravel.www.OTA._2003._05.PricedItineraryTypeAirItineraryPricingInfo[] getAirItineraryPricingInfo() {
        return airItineraryPricingInfo;
    }


    /**
     * Sets the airItineraryPricingInfo value for this PricedItineraryType.
     * 
     * @param airItineraryPricingInfo   * Pricing Information for an Air Itinerary.
     */
    public void setAirItineraryPricingInfo(org.opentravel.www.OTA._2003._05.PricedItineraryTypeAirItineraryPricingInfo[] airItineraryPricingInfo) {
        this.airItineraryPricingInfo = airItineraryPricingInfo;
    }

    public org.opentravel.www.OTA._2003._05.PricedItineraryTypeAirItineraryPricingInfo getAirItineraryPricingInfo(int i) {
        return this.airItineraryPricingInfo[i];
    }

    public void setAirItineraryPricingInfo(int i, org.opentravel.www.OTA._2003._05.PricedItineraryTypeAirItineraryPricingInfo _value) {
        this.airItineraryPricingInfo[i] = _value;
    }


    /**
     * Gets the notes value for this PricedItineraryType.
     * 
     * @return notes   * Provides for free form descriptive information for the priced
     * itinerary.
     */
    public org.opentravel.www.OTA._2003._05.FreeTextType[] getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this PricedItineraryType.
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
     * Gets the ticketingInfo value for this PricedItineraryType.
     * 
     * @return ticketingInfo   * Container for TicketingInfoRS_Type.
     */
    public org.opentravel.www.OTA._2003._05.TicketingInfoRS_Type getTicketingInfo() {
        return ticketingInfo;
    }


    /**
     * Sets the ticketingInfo value for this PricedItineraryType.
     * 
     * @param ticketingInfo   * Container for TicketingInfoRS_Type.
     */
    public void setTicketingInfo(org.opentravel.www.OTA._2003._05.TicketingInfoRS_Type ticketingInfo) {
        this.ticketingInfo = ticketingInfo;
    }


    /**
     * Gets the TPA_Extensions value for this PricedItineraryType.
     * 
     * @return TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_Extensions getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this PricedItineraryType.
     * 
     * @param TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public void setTPA_Extensions(org.opentravel.www.OTA._2003._05.PricedItineraryTypeTPA_Extensions TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the isFromCustomPath value for this PricedItineraryType.
     * 
     * @return isFromCustomPath
     */
    public java.lang.Boolean getIsFromCustomPath() {
        return isFromCustomPath;
    }


    /**
     * Sets the isFromCustomPath value for this PricedItineraryType.
     * 
     * @param isFromCustomPath
     */
    public void setIsFromCustomPath(java.lang.Boolean isFromCustomPath) {
        this.isFromCustomPath = isFromCustomPath;
    }


    /**
     * Gets the sequenceNumber value for this PricedItineraryType.
     * 
     * @return sequenceNumber
     */
    public org.apache.axis.types.PositiveInteger getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this PricedItineraryType.
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(org.apache.axis.types.PositiveInteger sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the originDestinationRPH value for this PricedItineraryType.
     * 
     * @return originDestinationRPH
     */
    public java.lang.String getOriginDestinationRPH() {
        return originDestinationRPH;
    }


    /**
     * Sets the originDestinationRPH value for this PricedItineraryType.
     * 
     * @param originDestinationRPH
     */
    public void setOriginDestinationRPH(java.lang.String originDestinationRPH) {
        this.originDestinationRPH = originDestinationRPH;
    }


    /**
     * Gets the campaignID value for this PricedItineraryType.
     * 
     * @return campaignID
     */
    public java.lang.String getCampaignID() {
        return campaignID;
    }


    /**
     * Sets the campaignID value for this PricedItineraryType.
     * 
     * @param campaignID
     */
    public void setCampaignID(java.lang.String campaignID) {
        this.campaignID = campaignID;
    }


    /**
     * Gets the alternateAirport value for this PricedItineraryType.
     * 
     * @return alternateAirport
     */
    public java.lang.Boolean getAlternateAirport() {
        return alternateAirport;
    }


    /**
     * Sets the alternateAirport value for this PricedItineraryType.
     * 
     * @param alternateAirport
     */
    public void setAlternateAirport(java.lang.Boolean alternateAirport) {
        this.alternateAirport = alternateAirport;
    }


    /**
     * Gets the multipleTickets value for this PricedItineraryType.
     * 
     * @return multipleTickets
     */
    public java.lang.Boolean getMultipleTickets() {
        return multipleTickets;
    }


    /**
     * Sets the multipleTickets value for this PricedItineraryType.
     * 
     * @param multipleTickets
     */
    public void setMultipleTickets(java.lang.Boolean multipleTickets) {
        this.multipleTickets = multipleTickets;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PricedItineraryType)) return false;
        PricedItineraryType other = (PricedItineraryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airItinerary==null && other.getAirItinerary()==null) || 
             (this.airItinerary!=null &&
              this.airItinerary.equals(other.getAirItinerary()))) &&
            ((this.airItineraryPricingInfo==null && other.getAirItineraryPricingInfo()==null) || 
             (this.airItineraryPricingInfo!=null &&
              java.util.Arrays.equals(this.airItineraryPricingInfo, other.getAirItineraryPricingInfo()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              java.util.Arrays.equals(this.notes, other.getNotes()))) &&
            ((this.ticketingInfo==null && other.getTicketingInfo()==null) || 
             (this.ticketingInfo!=null &&
              this.ticketingInfo.equals(other.getTicketingInfo()))) &&
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions()))) &&
            ((this.isFromCustomPath==null && other.getIsFromCustomPath()==null) || 
             (this.isFromCustomPath!=null &&
              this.isFromCustomPath.equals(other.getIsFromCustomPath()))) &&
            ((this.sequenceNumber==null && other.getSequenceNumber()==null) || 
             (this.sequenceNumber!=null &&
              this.sequenceNumber.equals(other.getSequenceNumber()))) &&
            ((this.originDestinationRPH==null && other.getOriginDestinationRPH()==null) || 
             (this.originDestinationRPH!=null &&
              this.originDestinationRPH.equals(other.getOriginDestinationRPH()))) &&
            ((this.campaignID==null && other.getCampaignID()==null) || 
             (this.campaignID!=null &&
              this.campaignID.equals(other.getCampaignID()))) &&
            ((this.alternateAirport==null && other.getAlternateAirport()==null) || 
             (this.alternateAirport!=null &&
              this.alternateAirport.equals(other.getAlternateAirport()))) &&
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
        if (getAirItinerary() != null) {
            _hashCode += getAirItinerary().hashCode();
        }
        if (getAirItineraryPricingInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAirItineraryPricingInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAirItineraryPricingInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getIsFromCustomPath() != null) {
            _hashCode += getIsFromCustomPath().hashCode();
        }
        if (getSequenceNumber() != null) {
            _hashCode += getSequenceNumber().hashCode();
        }
        if (getOriginDestinationRPH() != null) {
            _hashCode += getOriginDestinationRPH().hashCode();
        }
        if (getCampaignID() != null) {
            _hashCode += getCampaignID().hashCode();
        }
        if (getAlternateAirport() != null) {
            _hashCode += getAlternateAirport().hashCode();
        }
        if (getMultipleTickets() != null) {
            _hashCode += getMultipleTickets().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PricedItineraryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PricedItineraryType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isFromCustomPath");
        attrField.setXmlName(new javax.xml.namespace.QName("", "isFromCustomPath"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sequenceNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SequenceNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("originDestinationRPH");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OriginDestinationRPH"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RPH_Type"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("campaignID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "CampaignID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("alternateAirport");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AlternateAirport"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("multipleTickets");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MultipleTickets"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airItinerary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirItinerary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirItineraryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airItineraryPricingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirItineraryPricingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PricedItineraryType>AirItineraryPricingInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PricedItineraryType>TPA_Extensions"));
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
