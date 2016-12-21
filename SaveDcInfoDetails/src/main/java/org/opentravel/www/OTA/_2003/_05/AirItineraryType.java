/**
 * AirItineraryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Specifies the origin and destination of the traveler.
 */
public class AirItineraryType  implements java.io.Serializable {
    /* A collection of  OriginDestinationOption */
    private org.opentravel.www.OTA._2003._05.BookFlightSegmentType[][] originDestinationOptions;

    private org.opentravel.www.OTA._2003._05.AirTripType directionInd;  // attribute

    private java.util.Date departureDate;  // attribute

    public AirItineraryType() {
    }

    public AirItineraryType(
           org.opentravel.www.OTA._2003._05.BookFlightSegmentType[][] originDestinationOptions,
           org.opentravel.www.OTA._2003._05.AirTripType directionInd,
           java.util.Date departureDate) {
           this.originDestinationOptions = originDestinationOptions;
           this.directionInd = directionInd;
           this.departureDate = departureDate;
    }


    /**
     * Gets the originDestinationOptions value for this AirItineraryType.
     * 
     * @return originDestinationOptions   * A collection of  OriginDestinationOption
     */
    public org.opentravel.www.OTA._2003._05.BookFlightSegmentType[][] getOriginDestinationOptions() {
        return originDestinationOptions;
    }


    /**
     * Sets the originDestinationOptions value for this AirItineraryType.
     * 
     * @param originDestinationOptions   * A collection of  OriginDestinationOption
     */
    public void setOriginDestinationOptions(org.opentravel.www.OTA._2003._05.BookFlightSegmentType[][] originDestinationOptions) {
        this.originDestinationOptions = originDestinationOptions;
    }


    /**
     * Gets the directionInd value for this AirItineraryType.
     * 
     * @return directionInd
     */
    public org.opentravel.www.OTA._2003._05.AirTripType getDirectionInd() {
        return directionInd;
    }


    /**
     * Sets the directionInd value for this AirItineraryType.
     * 
     * @param directionInd
     */
    public void setDirectionInd(org.opentravel.www.OTA._2003._05.AirTripType directionInd) {
        this.directionInd = directionInd;
    }


    /**
     * Gets the departureDate value for this AirItineraryType.
     * 
     * @return departureDate
     */
    public java.util.Date getDepartureDate() {
        return departureDate;
    }


    /**
     * Sets the departureDate value for this AirItineraryType.
     * 
     * @param departureDate
     */
    public void setDepartureDate(java.util.Date departureDate) {
        this.departureDate = departureDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirItineraryType)) return false;
        AirItineraryType other = (AirItineraryType) obj;
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
            ((this.directionInd==null && other.getDirectionInd()==null) || 
             (this.directionInd!=null &&
              this.directionInd.equals(other.getDirectionInd()))) &&
            ((this.departureDate==null && other.getDepartureDate()==null) || 
             (this.departureDate!=null &&
              this.departureDate.equals(other.getDepartureDate())));
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
        if (getDirectionInd() != null) {
            _hashCode += getDirectionInd().hashCode();
        }
        if (getDepartureDate() != null) {
            _hashCode += getDepartureDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirItineraryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirItineraryType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("directionInd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DirectionInd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirTripType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("departureDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DepartureDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originDestinationOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginDestinationOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginDestinationOptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginDestinationOption"));
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
