/**
 * PositionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Used to identify geospatial postion of the requesting entity.
 */
public class PositionType  implements java.io.Serializable {
    private java.lang.String latitude;  // attribute

    private java.lang.String longitude;  // attribute

    private java.lang.String altitude;  // attribute

    public PositionType() {
    }

    public PositionType(
           java.lang.String latitude,
           java.lang.String longitude,
           java.lang.String altitude) {
           this.latitude = latitude;
           this.longitude = longitude;
           this.altitude = altitude;
    }


    /**
     * Gets the latitude value for this PositionType.
     * 
     * @return latitude
     */
    public java.lang.String getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this PositionType.
     * 
     * @param latitude
     */
    public void setLatitude(java.lang.String latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this PositionType.
     * 
     * @return longitude
     */
    public java.lang.String getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this PositionType.
     * 
     * @param longitude
     */
    public void setLongitude(java.lang.String longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the altitude value for this PositionType.
     * 
     * @return altitude
     */
    public java.lang.String getAltitude() {
        return altitude;
    }


    /**
     * Sets the altitude value for this PositionType.
     * 
     * @param altitude
     */
    public void setAltitude(java.lang.String altitude) {
        this.altitude = altitude;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PositionType)) return false;
        PositionType other = (PositionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.altitude==null && other.getAltitude()==null) || 
             (this.altitude!=null &&
              this.altitude.equals(other.getAltitude())));
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
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getAltitude() != null) {
            _hashCode += getAltitude().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PositionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PositionType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("latitude");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Latitude"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("longitude");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Longitude"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("altitude");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Altitude"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
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
