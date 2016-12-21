/**
 * OTA_AirLowFareSearchRQLeg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQLeg  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDepartureDateTime departureDateTime;

    private org.opentravel.www.OTA._2003._05.GlobalDateTimeType arrivalDateTime;

    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegOriginsOrigin[] origins;

    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDestinationsDestination[] destinations;

    /* Travel Connection Location - for example, air uses the IATA
     * 3 letter code. */
    private org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocation[] connectionLocations;

    /* Carrier preferrence information */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegCarriers carriers;

    /* Defines preferred cabin to be used in a search for this leg
     * level. */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegCabin cabin;

    private java.lang.String RPH;  // attribute

    private org.apache.axis.types.NonNegativeInteger maxOptions;  // attribute

    public OTA_AirLowFareSearchRQLeg() {
    }

    public OTA_AirLowFareSearchRQLeg(
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDepartureDateTime departureDateTime,
           org.opentravel.www.OTA._2003._05.GlobalDateTimeType arrivalDateTime,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegOriginsOrigin[] origins,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDestinationsDestination[] destinations,
           org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocation[] connectionLocations,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegCarriers carriers,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegCabin cabin,
           java.lang.String RPH,
           org.apache.axis.types.NonNegativeInteger maxOptions) {
           this.departureDateTime = departureDateTime;
           this.arrivalDateTime = arrivalDateTime;
           this.origins = origins;
           this.destinations = destinations;
           this.connectionLocations = connectionLocations;
           this.carriers = carriers;
           this.cabin = cabin;
           this.RPH = RPH;
           this.maxOptions = maxOptions;
    }


    /**
     * Gets the departureDateTime value for this OTA_AirLowFareSearchRQLeg.
     * 
     * @return departureDateTime
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDepartureDateTime getDepartureDateTime() {
        return departureDateTime;
    }


    /**
     * Sets the departureDateTime value for this OTA_AirLowFareSearchRQLeg.
     * 
     * @param departureDateTime
     */
    public void setDepartureDateTime(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDepartureDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }


    /**
     * Gets the arrivalDateTime value for this OTA_AirLowFareSearchRQLeg.
     * 
     * @return arrivalDateTime
     */
    public org.opentravel.www.OTA._2003._05.GlobalDateTimeType getArrivalDateTime() {
        return arrivalDateTime;
    }


    /**
     * Sets the arrivalDateTime value for this OTA_AirLowFareSearchRQLeg.
     * 
     * @param arrivalDateTime
     */
    public void setArrivalDateTime(org.opentravel.www.OTA._2003._05.GlobalDateTimeType arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }


    /**
     * Gets the origins value for this OTA_AirLowFareSearchRQLeg.
     * 
     * @return origins
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegOriginsOrigin[] getOrigins() {
        return origins;
    }


    /**
     * Sets the origins value for this OTA_AirLowFareSearchRQLeg.
     * 
     * @param origins
     */
    public void setOrigins(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegOriginsOrigin[] origins) {
        this.origins = origins;
    }


    /**
     * Gets the destinations value for this OTA_AirLowFareSearchRQLeg.
     * 
     * @return destinations
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDestinationsDestination[] getDestinations() {
        return destinations;
    }


    /**
     * Sets the destinations value for this OTA_AirLowFareSearchRQLeg.
     * 
     * @param destinations
     */
    public void setDestinations(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDestinationsDestination[] destinations) {
        this.destinations = destinations;
    }


    /**
     * Gets the connectionLocations value for this OTA_AirLowFareSearchRQLeg.
     * 
     * @return connectionLocations   * Travel Connection Location - for example, air uses the IATA
     * 3 letter code.
     */
    public org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocation[] getConnectionLocations() {
        return connectionLocations;
    }


    /**
     * Sets the connectionLocations value for this OTA_AirLowFareSearchRQLeg.
     * 
     * @param connectionLocations   * Travel Connection Location - for example, air uses the IATA
     * 3 letter code.
     */
    public void setConnectionLocations(org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocation[] connectionLocations) {
        this.connectionLocations = connectionLocations;
    }


    /**
     * Gets the carriers value for this OTA_AirLowFareSearchRQLeg.
     * 
     * @return carriers   * Carrier preferrence information
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegCarriers getCarriers() {
        return carriers;
    }


    /**
     * Sets the carriers value for this OTA_AirLowFareSearchRQLeg.
     * 
     * @param carriers   * Carrier preferrence information
     */
    public void setCarriers(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegCarriers carriers) {
        this.carriers = carriers;
    }


    /**
     * Gets the cabin value for this OTA_AirLowFareSearchRQLeg.
     * 
     * @return cabin   * Defines preferred cabin to be used in a search for this leg
     * level.
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegCabin getCabin() {
        return cabin;
    }


    /**
     * Sets the cabin value for this OTA_AirLowFareSearchRQLeg.
     * 
     * @param cabin   * Defines preferred cabin to be used in a search for this leg
     * level.
     */
    public void setCabin(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegCabin cabin) {
        this.cabin = cabin;
    }


    /**
     * Gets the RPH value for this OTA_AirLowFareSearchRQLeg.
     * 
     * @return RPH
     */
    public java.lang.String getRPH() {
        return RPH;
    }


    /**
     * Sets the RPH value for this OTA_AirLowFareSearchRQLeg.
     * 
     * @param RPH
     */
    public void setRPH(java.lang.String RPH) {
        this.RPH = RPH;
    }


    /**
     * Gets the maxOptions value for this OTA_AirLowFareSearchRQLeg.
     * 
     * @return maxOptions
     */
    public org.apache.axis.types.NonNegativeInteger getMaxOptions() {
        return maxOptions;
    }


    /**
     * Sets the maxOptions value for this OTA_AirLowFareSearchRQLeg.
     * 
     * @param maxOptions
     */
    public void setMaxOptions(org.apache.axis.types.NonNegativeInteger maxOptions) {
        this.maxOptions = maxOptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQLeg)) return false;
        OTA_AirLowFareSearchRQLeg other = (OTA_AirLowFareSearchRQLeg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.departureDateTime==null && other.getDepartureDateTime()==null) || 
             (this.departureDateTime!=null &&
              this.departureDateTime.equals(other.getDepartureDateTime()))) &&
            ((this.arrivalDateTime==null && other.getArrivalDateTime()==null) || 
             (this.arrivalDateTime!=null &&
              this.arrivalDateTime.equals(other.getArrivalDateTime()))) &&
            ((this.origins==null && other.getOrigins()==null) || 
             (this.origins!=null &&
              java.util.Arrays.equals(this.origins, other.getOrigins()))) &&
            ((this.destinations==null && other.getDestinations()==null) || 
             (this.destinations!=null &&
              java.util.Arrays.equals(this.destinations, other.getDestinations()))) &&
            ((this.connectionLocations==null && other.getConnectionLocations()==null) || 
             (this.connectionLocations!=null &&
              java.util.Arrays.equals(this.connectionLocations, other.getConnectionLocations()))) &&
            ((this.carriers==null && other.getCarriers()==null) || 
             (this.carriers!=null &&
              this.carriers.equals(other.getCarriers()))) &&
            ((this.cabin==null && other.getCabin()==null) || 
             (this.cabin!=null &&
              this.cabin.equals(other.getCabin()))) &&
            ((this.RPH==null && other.getRPH()==null) || 
             (this.RPH!=null &&
              this.RPH.equals(other.getRPH()))) &&
            ((this.maxOptions==null && other.getMaxOptions()==null) || 
             (this.maxOptions!=null &&
              this.maxOptions.equals(other.getMaxOptions())));
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
        if (getDepartureDateTime() != null) {
            _hashCode += getDepartureDateTime().hashCode();
        }
        if (getArrivalDateTime() != null) {
            _hashCode += getArrivalDateTime().hashCode();
        }
        if (getOrigins() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrigins());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrigins(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDestinations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDestinations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDestinations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConnectionLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConnectionLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConnectionLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCarriers() != null) {
            _hashCode += getCarriers().hashCode();
        }
        if (getCabin() != null) {
            _hashCode += getCabin().hashCode();
        }
        if (getRPH() != null) {
            _hashCode += getRPH().hashCode();
        }
        if (getMaxOptions() != null) {
            _hashCode += getMaxOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQLeg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRQ>Leg"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("RPH");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RPH"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RPH_Type"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxOptions");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MaxOptions"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DepartureDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>Leg>DepartureDateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ArrivalDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "GlobalDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Origins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>Leg>Origins>Origin"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Origin"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Destinations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>Leg>Destinations>Destination"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Destination"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ConnectionLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ConnectionType>ConnectionLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ConnectionLocation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carriers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Carriers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>Leg>Carriers"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cabin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Cabin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>Leg>Cabin"));
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
