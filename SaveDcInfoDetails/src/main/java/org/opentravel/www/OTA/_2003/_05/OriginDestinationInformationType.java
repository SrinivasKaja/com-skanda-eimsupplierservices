/**
 * OriginDestinationInformationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Origin and Destination location, and time information for the request.
 * Also includes the ability to specify a connection location for the
 * search.
 */
public class OriginDestinationInformationType  extends org.opentravel.www.OTA._2003._05.TravelDateTimeType  implements java.io.Serializable {
    /* Travel Origin Location - for example, air uses the IATA 3 letter
     * code. */
    private org.opentravel.www.OTA._2003._05.OriginDestinationInformationTypeOriginLocation originLocation;

    /* Travel Destination Location - for example, air uses the IATA
     * 3 letter code. */
    private org.opentravel.www.OTA._2003._05.OriginDestinationInformationTypeDestinationLocation destinationLocation;

    /* Travel Connection Location - for example, air uses the IATA
     * 3 letter code. */
    private org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocation[] connectionLocations;

    public OriginDestinationInformationType() {
    }

    public OriginDestinationInformationType(
           java.lang.String departureDateTime,
           java.lang.String arrivalDateTime,
           org.opentravel.www.OTA._2003._05.TravelDateTimeTypeDepartureDates departureDates,
           org.opentravel.www.OTA._2003._05.TravelDateTimeTypeArrivalDates arrivalDates,
           java.lang.String departureWindow,
           java.lang.String arrivalWindow,
           org.opentravel.www.OTA._2003._05.OriginDestinationInformationTypeOriginLocation originLocation,
           org.opentravel.www.OTA._2003._05.OriginDestinationInformationTypeDestinationLocation destinationLocation,
           org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocation[] connectionLocations) {
        super(
            departureDateTime,
            arrivalDateTime,
            departureDates,
            arrivalDates,
            departureWindow,
            arrivalWindow);
        this.originLocation = originLocation;
        this.destinationLocation = destinationLocation;
        this.connectionLocations = connectionLocations;
    }


    /**
     * Gets the originLocation value for this OriginDestinationInformationType.
     * 
     * @return originLocation   * Travel Origin Location - for example, air uses the IATA 3 letter
     * code.
     */
    public org.opentravel.www.OTA._2003._05.OriginDestinationInformationTypeOriginLocation getOriginLocation() {
        return originLocation;
    }


    /**
     * Sets the originLocation value for this OriginDestinationInformationType.
     * 
     * @param originLocation   * Travel Origin Location - for example, air uses the IATA 3 letter
     * code.
     */
    public void setOriginLocation(org.opentravel.www.OTA._2003._05.OriginDestinationInformationTypeOriginLocation originLocation) {
        this.originLocation = originLocation;
    }


    /**
     * Gets the destinationLocation value for this OriginDestinationInformationType.
     * 
     * @return destinationLocation   * Travel Destination Location - for example, air uses the IATA
     * 3 letter code.
     */
    public org.opentravel.www.OTA._2003._05.OriginDestinationInformationTypeDestinationLocation getDestinationLocation() {
        return destinationLocation;
    }


    /**
     * Sets the destinationLocation value for this OriginDestinationInformationType.
     * 
     * @param destinationLocation   * Travel Destination Location - for example, air uses the IATA
     * 3 letter code.
     */
    public void setDestinationLocation(org.opentravel.www.OTA._2003._05.OriginDestinationInformationTypeDestinationLocation destinationLocation) {
        this.destinationLocation = destinationLocation;
    }


    /**
     * Gets the connectionLocations value for this OriginDestinationInformationType.
     * 
     * @return connectionLocations   * Travel Connection Location - for example, air uses the IATA
     * 3 letter code.
     */
    public org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocation[] getConnectionLocations() {
        return connectionLocations;
    }


    /**
     * Sets the connectionLocations value for this OriginDestinationInformationType.
     * 
     * @param connectionLocations   * Travel Connection Location - for example, air uses the IATA
     * 3 letter code.
     */
    public void setConnectionLocations(org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocation[] connectionLocations) {
        this.connectionLocations = connectionLocations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OriginDestinationInformationType)) return false;
        OriginDestinationInformationType other = (OriginDestinationInformationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.originLocation==null && other.getOriginLocation()==null) || 
             (this.originLocation!=null &&
              this.originLocation.equals(other.getOriginLocation()))) &&
            ((this.destinationLocation==null && other.getDestinationLocation()==null) || 
             (this.destinationLocation!=null &&
              this.destinationLocation.equals(other.getDestinationLocation()))) &&
            ((this.connectionLocations==null && other.getConnectionLocations()==null) || 
             (this.connectionLocations!=null &&
              java.util.Arrays.equals(this.connectionLocations, other.getConnectionLocations())));
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
        if (getOriginLocation() != null) {
            _hashCode += getOriginLocation().hashCode();
        }
        if (getDestinationLocation() != null) {
            _hashCode += getDestinationLocation().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OriginDestinationInformationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginDestinationInformationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">OriginDestinationInformationType>OriginLocation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DestinationLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">OriginDestinationInformationType>DestinationLocation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ConnectionLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">ConnectionType>ConnectionLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ConnectionLocation"));
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
