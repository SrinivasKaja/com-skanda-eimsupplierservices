/**
 * FlightTypePrefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Indicates preferences for certain types of flights, such as connections
 * or stopovers, when used for a specific travel situation.
 */
public class FlightTypePrefType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel;  // attribute

    private org.opentravel.www.OTA._2003._05.FlightTypeType flightType;  // attribute

    private org.opentravel.www.OTA._2003._05.FlightTypePrefTypeMaxConnections maxConnections;  // attribute

    public FlightTypePrefType() {
    }

    public FlightTypePrefType(
           org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel,
           org.opentravel.www.OTA._2003._05.FlightTypeType flightType,
           org.opentravel.www.OTA._2003._05.FlightTypePrefTypeMaxConnections maxConnections) {
           this.preferLevel = preferLevel;
           this.flightType = flightType;
           this.maxConnections = maxConnections;
    }


    /**
     * Gets the preferLevel value for this FlightTypePrefType.
     * 
     * @return preferLevel
     */
    public org.opentravel.www.OTA._2003._05.PreferLevelType getPreferLevel() {
        return preferLevel;
    }


    /**
     * Sets the preferLevel value for this FlightTypePrefType.
     * 
     * @param preferLevel
     */
    public void setPreferLevel(org.opentravel.www.OTA._2003._05.PreferLevelType preferLevel) {
        this.preferLevel = preferLevel;
    }


    /**
     * Gets the flightType value for this FlightTypePrefType.
     * 
     * @return flightType
     */
    public org.opentravel.www.OTA._2003._05.FlightTypeType getFlightType() {
        return flightType;
    }


    /**
     * Sets the flightType value for this FlightTypePrefType.
     * 
     * @param flightType
     */
    public void setFlightType(org.opentravel.www.OTA._2003._05.FlightTypeType flightType) {
        this.flightType = flightType;
    }


    /**
     * Gets the maxConnections value for this FlightTypePrefType.
     * 
     * @return maxConnections
     */
    public org.opentravel.www.OTA._2003._05.FlightTypePrefTypeMaxConnections getMaxConnections() {
        return maxConnections;
    }


    /**
     * Sets the maxConnections value for this FlightTypePrefType.
     * 
     * @param maxConnections
     */
    public void setMaxConnections(org.opentravel.www.OTA._2003._05.FlightTypePrefTypeMaxConnections maxConnections) {
        this.maxConnections = maxConnections;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightTypePrefType)) return false;
        FlightTypePrefType other = (FlightTypePrefType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.preferLevel==null && other.getPreferLevel()==null) || 
             (this.preferLevel!=null &&
              this.preferLevel.equals(other.getPreferLevel()))) &&
            ((this.flightType==null && other.getFlightType()==null) || 
             (this.flightType!=null &&
              this.flightType.equals(other.getFlightType()))) &&
            ((this.maxConnections==null && other.getMaxConnections()==null) || 
             (this.maxConnections!=null &&
              this.maxConnections.equals(other.getMaxConnections())));
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
        if (getPreferLevel() != null) {
            _hashCode += getPreferLevel().hashCode();
        }
        if (getFlightType() != null) {
            _hashCode += getFlightType().hashCode();
        }
        if (getMaxConnections() != null) {
            _hashCode += getMaxConnections().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightTypePrefType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightTypePrefType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("preferLevel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PreferLevel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PreferLevelType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("flightType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FlightType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FlightTypeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxConnections");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MaxConnections"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FlightTypePrefType>MaxConnections"));
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
