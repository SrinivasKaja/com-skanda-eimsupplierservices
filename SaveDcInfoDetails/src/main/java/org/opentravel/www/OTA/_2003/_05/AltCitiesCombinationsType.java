/**
 * AltCitiesCombinationsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Which (if any) alt cities locations should be handled in a special
 * way (i.e. Validate instead of precomputed path).
 */
public class AltCitiesCombinationsType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.AltCitiesCombinationsLocationsType origins;  // attribute

    private org.opentravel.www.OTA._2003._05.AltCitiesCombinationsLocationsType destinations;  // attribute

    public AltCitiesCombinationsType() {
    }

    public AltCitiesCombinationsType(
           org.opentravel.www.OTA._2003._05.AltCitiesCombinationsLocationsType origins,
           org.opentravel.www.OTA._2003._05.AltCitiesCombinationsLocationsType destinations) {
           this.origins = origins;
           this.destinations = destinations;
    }


    /**
     * Gets the origins value for this AltCitiesCombinationsType.
     * 
     * @return origins
     */
    public org.opentravel.www.OTA._2003._05.AltCitiesCombinationsLocationsType getOrigins() {
        return origins;
    }


    /**
     * Sets the origins value for this AltCitiesCombinationsType.
     * 
     * @param origins
     */
    public void setOrigins(org.opentravel.www.OTA._2003._05.AltCitiesCombinationsLocationsType origins) {
        this.origins = origins;
    }


    /**
     * Gets the destinations value for this AltCitiesCombinationsType.
     * 
     * @return destinations
     */
    public org.opentravel.www.OTA._2003._05.AltCitiesCombinationsLocationsType getDestinations() {
        return destinations;
    }


    /**
     * Sets the destinations value for this AltCitiesCombinationsType.
     * 
     * @param destinations
     */
    public void setDestinations(org.opentravel.www.OTA._2003._05.AltCitiesCombinationsLocationsType destinations) {
        this.destinations = destinations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AltCitiesCombinationsType)) return false;
        AltCitiesCombinationsType other = (AltCitiesCombinationsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.origins==null && other.getOrigins()==null) || 
             (this.origins!=null &&
              this.origins.equals(other.getOrigins()))) &&
            ((this.destinations==null && other.getDestinations()==null) || 
             (this.destinations!=null &&
              this.destinations.equals(other.getDestinations())));
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
        if (getOrigins() != null) {
            _hashCode += getOrigins().hashCode();
        }
        if (getDestinations() != null) {
            _hashCode += getDestinations().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AltCitiesCombinationsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AltCitiesCombinationsType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("origins");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Origins"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AltCitiesCombinationsLocationsType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("destinations");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Destinations"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AltCitiesCombinationsLocationsType"));
        typeDesc.addFieldDesc(attrField);
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
