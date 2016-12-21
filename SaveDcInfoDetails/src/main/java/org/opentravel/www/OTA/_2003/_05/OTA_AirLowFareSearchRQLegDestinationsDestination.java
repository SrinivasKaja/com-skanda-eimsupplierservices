/**
 * OTA_AirLowFareSearchRQLegDestinationsDestination.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQLegDestinationsDestination  implements java.io.Serializable {
    /* Travel Connection Location - for example, air uses the IATA
     * 3 letter code. */
    private org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocation[][] connectionLocations;

    /* Carrier preferrence information */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDestinationsDestinationCarriers[] carriers;

    /* Overrides ArrivalDateTime attributes */
    private org.opentravel.www.OTA._2003._05.OverrideDateTimeType[] arrivalDateTimeOverride;

    private java.lang.String airportCode;  // attribute

    private java.lang.String airportsGroup;  // attribute

    public OTA_AirLowFareSearchRQLegDestinationsDestination() {
    }

    public OTA_AirLowFareSearchRQLegDestinationsDestination(
           org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocation[][] connectionLocations,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDestinationsDestinationCarriers[] carriers,
           org.opentravel.www.OTA._2003._05.OverrideDateTimeType[] arrivalDateTimeOverride,
           java.lang.String airportCode,
           java.lang.String airportsGroup) {
           this.connectionLocations = connectionLocations;
           this.carriers = carriers;
           this.arrivalDateTimeOverride = arrivalDateTimeOverride;
           this.airportCode = airportCode;
           this.airportsGroup = airportsGroup;
    }


    /**
     * Gets the connectionLocations value for this OTA_AirLowFareSearchRQLegDestinationsDestination.
     * 
     * @return connectionLocations   * Travel Connection Location - for example, air uses the IATA
     * 3 letter code.
     */
    public org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocation[][] getConnectionLocations() {
        return connectionLocations;
    }


    /**
     * Sets the connectionLocations value for this OTA_AirLowFareSearchRQLegDestinationsDestination.
     * 
     * @param connectionLocations   * Travel Connection Location - for example, air uses the IATA
     * 3 letter code.
     */
    public void setConnectionLocations(org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocation[][] connectionLocations) {
        this.connectionLocations = connectionLocations;
    }

    public org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocation[] getConnectionLocations(int i) {
        return this.connectionLocations[i];
    }

    public void setConnectionLocations(int i, org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocation[] _value) {
        this.connectionLocations[i] = _value;
    }


    /**
     * Gets the carriers value for this OTA_AirLowFareSearchRQLegDestinationsDestination.
     * 
     * @return carriers   * Carrier preferrence information
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDestinationsDestinationCarriers[] getCarriers() {
        return carriers;
    }


    /**
     * Sets the carriers value for this OTA_AirLowFareSearchRQLegDestinationsDestination.
     * 
     * @param carriers   * Carrier preferrence information
     */
    public void setCarriers(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDestinationsDestinationCarriers[] carriers) {
        this.carriers = carriers;
    }

    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDestinationsDestinationCarriers getCarriers(int i) {
        return this.carriers[i];
    }

    public void setCarriers(int i, org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQLegDestinationsDestinationCarriers _value) {
        this.carriers[i] = _value;
    }


    /**
     * Gets the arrivalDateTimeOverride value for this OTA_AirLowFareSearchRQLegDestinationsDestination.
     * 
     * @return arrivalDateTimeOverride   * Overrides ArrivalDateTime attributes
     */
    public org.opentravel.www.OTA._2003._05.OverrideDateTimeType[] getArrivalDateTimeOverride() {
        return arrivalDateTimeOverride;
    }


    /**
     * Sets the arrivalDateTimeOverride value for this OTA_AirLowFareSearchRQLegDestinationsDestination.
     * 
     * @param arrivalDateTimeOverride   * Overrides ArrivalDateTime attributes
     */
    public void setArrivalDateTimeOverride(org.opentravel.www.OTA._2003._05.OverrideDateTimeType[] arrivalDateTimeOverride) {
        this.arrivalDateTimeOverride = arrivalDateTimeOverride;
    }

    public org.opentravel.www.OTA._2003._05.OverrideDateTimeType getArrivalDateTimeOverride(int i) {
        return this.arrivalDateTimeOverride[i];
    }

    public void setArrivalDateTimeOverride(int i, org.opentravel.www.OTA._2003._05.OverrideDateTimeType _value) {
        this.arrivalDateTimeOverride[i] = _value;
    }


    /**
     * Gets the airportCode value for this OTA_AirLowFareSearchRQLegDestinationsDestination.
     * 
     * @return airportCode
     */
    public java.lang.String getAirportCode() {
        return airportCode;
    }


    /**
     * Sets the airportCode value for this OTA_AirLowFareSearchRQLegDestinationsDestination.
     * 
     * @param airportCode
     */
    public void setAirportCode(java.lang.String airportCode) {
        this.airportCode = airportCode;
    }


    /**
     * Gets the airportsGroup value for this OTA_AirLowFareSearchRQLegDestinationsDestination.
     * 
     * @return airportsGroup
     */
    public java.lang.String getAirportsGroup() {
        return airportsGroup;
    }


    /**
     * Sets the airportsGroup value for this OTA_AirLowFareSearchRQLegDestinationsDestination.
     * 
     * @param airportsGroup
     */
    public void setAirportsGroup(java.lang.String airportsGroup) {
        this.airportsGroup = airportsGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQLegDestinationsDestination)) return false;
        OTA_AirLowFareSearchRQLegDestinationsDestination other = (OTA_AirLowFareSearchRQLegDestinationsDestination) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.connectionLocations==null && other.getConnectionLocations()==null) || 
             (this.connectionLocations!=null &&
              java.util.Arrays.equals(this.connectionLocations, other.getConnectionLocations()))) &&
            ((this.carriers==null && other.getCarriers()==null) || 
             (this.carriers!=null &&
              java.util.Arrays.equals(this.carriers, other.getCarriers()))) &&
            ((this.arrivalDateTimeOverride==null && other.getArrivalDateTimeOverride()==null) || 
             (this.arrivalDateTimeOverride!=null &&
              java.util.Arrays.equals(this.arrivalDateTimeOverride, other.getArrivalDateTimeOverride()))) &&
            ((this.airportCode==null && other.getAirportCode()==null) || 
             (this.airportCode!=null &&
              this.airportCode.equals(other.getAirportCode()))) &&
            ((this.airportsGroup==null && other.getAirportsGroup()==null) || 
             (this.airportsGroup!=null &&
              this.airportsGroup.equals(other.getAirportsGroup())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCarriers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCarriers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArrivalDateTimeOverride() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArrivalDateTimeOverride());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArrivalDateTimeOverride(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAirportCode() != null) {
            _hashCode += getAirportCode().hashCode();
        }
        if (getAirportsGroup() != null) {
            _hashCode += getAirportsGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQLegDestinationsDestination.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>Leg>Destinations>Destination"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("airportCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AirportCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to8"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("airportsGroup");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AirportsGroup"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ConnectionLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ConnectionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carriers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Carriers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>OTA_AirLowFareSearchRQ>Leg>Destinations>Destination>Carriers"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalDateTimeOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ArrivalDateTimeOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OverrideDateTimeType"));
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
