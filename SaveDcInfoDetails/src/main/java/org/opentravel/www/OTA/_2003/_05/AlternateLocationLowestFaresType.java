/**
 * AlternateLocationLowestFaresType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * IntelliSell Type . lowest fare for alternate origin / destination
 * pair.
 */
public class AlternateLocationLowestFaresType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.ResponseLocationType originLocation;

    private org.opentravel.www.OTA._2003._05.ResponseLocationType destinationLocation;

    private org.opentravel.www.OTA._2003._05.CurrencyAmountType lowestFare;

    public AlternateLocationLowestFaresType() {
    }

    public AlternateLocationLowestFaresType(
           org.opentravel.www.OTA._2003._05.ResponseLocationType originLocation,
           org.opentravel.www.OTA._2003._05.ResponseLocationType destinationLocation,
           org.opentravel.www.OTA._2003._05.CurrencyAmountType lowestFare) {
           this.originLocation = originLocation;
           this.destinationLocation = destinationLocation;
           this.lowestFare = lowestFare;
    }


    /**
     * Gets the originLocation value for this AlternateLocationLowestFaresType.
     * 
     * @return originLocation
     */
    public org.opentravel.www.OTA._2003._05.ResponseLocationType getOriginLocation() {
        return originLocation;
    }


    /**
     * Sets the originLocation value for this AlternateLocationLowestFaresType.
     * 
     * @param originLocation
     */
    public void setOriginLocation(org.opentravel.www.OTA._2003._05.ResponseLocationType originLocation) {
        this.originLocation = originLocation;
    }


    /**
     * Gets the destinationLocation value for this AlternateLocationLowestFaresType.
     * 
     * @return destinationLocation
     */
    public org.opentravel.www.OTA._2003._05.ResponseLocationType getDestinationLocation() {
        return destinationLocation;
    }


    /**
     * Sets the destinationLocation value for this AlternateLocationLowestFaresType.
     * 
     * @param destinationLocation
     */
    public void setDestinationLocation(org.opentravel.www.OTA._2003._05.ResponseLocationType destinationLocation) {
        this.destinationLocation = destinationLocation;
    }


    /**
     * Gets the lowestFare value for this AlternateLocationLowestFaresType.
     * 
     * @return lowestFare
     */
    public org.opentravel.www.OTA._2003._05.CurrencyAmountType getLowestFare() {
        return lowestFare;
    }


    /**
     * Sets the lowestFare value for this AlternateLocationLowestFaresType.
     * 
     * @param lowestFare
     */
    public void setLowestFare(org.opentravel.www.OTA._2003._05.CurrencyAmountType lowestFare) {
        this.lowestFare = lowestFare;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlternateLocationLowestFaresType)) return false;
        AlternateLocationLowestFaresType other = (AlternateLocationLowestFaresType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.originLocation==null && other.getOriginLocation()==null) || 
             (this.originLocation!=null &&
              this.originLocation.equals(other.getOriginLocation()))) &&
            ((this.destinationLocation==null && other.getDestinationLocation()==null) || 
             (this.destinationLocation!=null &&
              this.destinationLocation.equals(other.getDestinationLocation()))) &&
            ((this.lowestFare==null && other.getLowestFare()==null) || 
             (this.lowestFare!=null &&
              this.lowestFare.equals(other.getLowestFare())));
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
        if (getOriginLocation() != null) {
            _hashCode += getOriginLocation().hashCode();
        }
        if (getDestinationLocation() != null) {
            _hashCode += getDestinationLocation().hashCode();
        }
        if (getLowestFare() != null) {
            _hashCode += getLowestFare().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlternateLocationLowestFaresType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AlternateLocationLowestFaresType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ResponseLocationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DestinationLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ResponseLocationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowestFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "LowestFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyAmountType"));
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
