/**
 * AirlineLowestFaresType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * IntelliSell Type . lowest fare for airline. Currently not used.
 */
public class AirlineLowestFaresType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.CompanyNameType airline;

    private java.math.BigInteger noStops;

    private org.opentravel.www.OTA._2003._05.CurrencyAmountType lowestFare;

    private java.lang.Object itineraryCount;

    public AirlineLowestFaresType() {
    }

    public AirlineLowestFaresType(
           org.opentravel.www.OTA._2003._05.CompanyNameType airline,
           java.math.BigInteger noStops,
           org.opentravel.www.OTA._2003._05.CurrencyAmountType lowestFare,
           java.lang.Object itineraryCount) {
           this.airline = airline;
           this.noStops = noStops;
           this.lowestFare = lowestFare;
           this.itineraryCount = itineraryCount;
    }


    /**
     * Gets the airline value for this AirlineLowestFaresType.
     * 
     * @return airline
     */
    public org.opentravel.www.OTA._2003._05.CompanyNameType getAirline() {
        return airline;
    }


    /**
     * Sets the airline value for this AirlineLowestFaresType.
     * 
     * @param airline
     */
    public void setAirline(org.opentravel.www.OTA._2003._05.CompanyNameType airline) {
        this.airline = airline;
    }


    /**
     * Gets the noStops value for this AirlineLowestFaresType.
     * 
     * @return noStops
     */
    public java.math.BigInteger getNoStops() {
        return noStops;
    }


    /**
     * Sets the noStops value for this AirlineLowestFaresType.
     * 
     * @param noStops
     */
    public void setNoStops(java.math.BigInteger noStops) {
        this.noStops = noStops;
    }


    /**
     * Gets the lowestFare value for this AirlineLowestFaresType.
     * 
     * @return lowestFare
     */
    public org.opentravel.www.OTA._2003._05.CurrencyAmountType getLowestFare() {
        return lowestFare;
    }


    /**
     * Sets the lowestFare value for this AirlineLowestFaresType.
     * 
     * @param lowestFare
     */
    public void setLowestFare(org.opentravel.www.OTA._2003._05.CurrencyAmountType lowestFare) {
        this.lowestFare = lowestFare;
    }


    /**
     * Gets the itineraryCount value for this AirlineLowestFaresType.
     * 
     * @return itineraryCount
     */
    public java.lang.Object getItineraryCount() {
        return itineraryCount;
    }


    /**
     * Sets the itineraryCount value for this AirlineLowestFaresType.
     * 
     * @param itineraryCount
     */
    public void setItineraryCount(java.lang.Object itineraryCount) {
        this.itineraryCount = itineraryCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirlineLowestFaresType)) return false;
        AirlineLowestFaresType other = (AirlineLowestFaresType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airline==null && other.getAirline()==null) || 
             (this.airline!=null &&
              this.airline.equals(other.getAirline()))) &&
            ((this.noStops==null && other.getNoStops()==null) || 
             (this.noStops!=null &&
              this.noStops.equals(other.getNoStops()))) &&
            ((this.lowestFare==null && other.getLowestFare()==null) || 
             (this.lowestFare!=null &&
              this.lowestFare.equals(other.getLowestFare()))) &&
            ((this.itineraryCount==null && other.getItineraryCount()==null) || 
             (this.itineraryCount!=null &&
              this.itineraryCount.equals(other.getItineraryCount())));
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
        if (getAirline() != null) {
            _hashCode += getAirline().hashCode();
        }
        if (getNoStops() != null) {
            _hashCode += getNoStops().hashCode();
        }
        if (getLowestFare() != null) {
            _hashCode += getLowestFare().hashCode();
        }
        if (getItineraryCount() != null) {
            _hashCode += getItineraryCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirlineLowestFaresType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirlineLowestFaresType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Airline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CompanyNameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noStops");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NoStops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowestFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "LowestFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itineraryCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ItineraryCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
