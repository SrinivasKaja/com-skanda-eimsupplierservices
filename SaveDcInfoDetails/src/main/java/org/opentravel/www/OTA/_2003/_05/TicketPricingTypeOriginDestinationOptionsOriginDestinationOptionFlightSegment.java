/**
 * TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment  implements java.io.Serializable {
    /* Departure point of flight segment. */
    private org.opentravel.www.OTA._2003._05.ResponseLocationType departureAirport;

    /* Arrival point of flight segment. */
    private org.opentravel.www.OTA._2003._05.ResponseLocationType arrivalAirport;

    private java.lang.String departureDateTime;  // attribute

    public TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment() {
    }

    public TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment(
           org.opentravel.www.OTA._2003._05.ResponseLocationType departureAirport,
           org.opentravel.www.OTA._2003._05.ResponseLocationType arrivalAirport,
           java.lang.String departureDateTime) {
           this.departureAirport = departureAirport;
           this.arrivalAirport = arrivalAirport;
           this.departureDateTime = departureDateTime;
    }


    /**
     * Gets the departureAirport value for this TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment.
     * 
     * @return departureAirport   * Departure point of flight segment.
     */
    public org.opentravel.www.OTA._2003._05.ResponseLocationType getDepartureAirport() {
        return departureAirport;
    }


    /**
     * Sets the departureAirport value for this TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment.
     * 
     * @param departureAirport   * Departure point of flight segment.
     */
    public void setDepartureAirport(org.opentravel.www.OTA._2003._05.ResponseLocationType departureAirport) {
        this.departureAirport = departureAirport;
    }


    /**
     * Gets the arrivalAirport value for this TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment.
     * 
     * @return arrivalAirport   * Arrival point of flight segment.
     */
    public org.opentravel.www.OTA._2003._05.ResponseLocationType getArrivalAirport() {
        return arrivalAirport;
    }


    /**
     * Sets the arrivalAirport value for this TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment.
     * 
     * @param arrivalAirport   * Arrival point of flight segment.
     */
    public void setArrivalAirport(org.opentravel.www.OTA._2003._05.ResponseLocationType arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }


    /**
     * Gets the departureDateTime value for this TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment.
     * 
     * @return departureDateTime
     */
    public java.lang.String getDepartureDateTime() {
        return departureDateTime;
    }


    /**
     * Sets the departureDateTime value for this TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment.
     * 
     * @param departureDateTime
     */
    public void setDepartureDateTime(java.lang.String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment)) return false;
        TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment other = (TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.departureAirport==null && other.getDepartureAirport()==null) || 
             (this.departureAirport!=null &&
              this.departureAirport.equals(other.getDepartureAirport()))) &&
            ((this.arrivalAirport==null && other.getArrivalAirport()==null) || 
             (this.arrivalAirport!=null &&
              this.arrivalAirport.equals(other.getArrivalAirport()))) &&
            ((this.departureDateTime==null && other.getDepartureDateTime()==null) || 
             (this.departureDateTime!=null &&
              this.departureDateTime.equals(other.getDepartureDateTime())));
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
        if (getDepartureAirport() != null) {
            _hashCode += getDepartureAirport().hashCode();
        }
        if (getArrivalAirport() != null) {
            _hashCode += getArrivalAirport().hashCode();
        }
        if (getDepartureDateTime() != null) {
            _hashCode += getDepartureDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicketPricingTypeOriginDestinationOptionsOriginDestinationOptionFlightSegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>TicketPricingType>OriginDestinationOptions>OriginDestinationOption>FlightSegment"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("departureDateTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DepartureDateTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureAirport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DepartureAirport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ResponseLocationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalAirport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ArrivalAirport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ResponseLocationType"));
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
