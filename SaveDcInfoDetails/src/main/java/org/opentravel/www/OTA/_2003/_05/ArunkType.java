/**
 * ArunkType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class ArunkType  implements java.io.Serializable {
    /* Origin code */
    private org.opentravel.www.OTA._2003._05.RequestLocationType originLocation;

    /* Destination code */
    private org.opentravel.www.OTA._2003._05.RequestLocationType destinationLocation;

    /* Side trip information */
    private org.opentravel.www.OTA._2003._05.SideTripType sideTrip;

    public ArunkType() {
    }

    public ArunkType(
           org.opentravel.www.OTA._2003._05.RequestLocationType originLocation,
           org.opentravel.www.OTA._2003._05.RequestLocationType destinationLocation,
           org.opentravel.www.OTA._2003._05.SideTripType sideTrip) {
           this.originLocation = originLocation;
           this.destinationLocation = destinationLocation;
           this.sideTrip = sideTrip;
    }


    /**
     * Gets the originLocation value for this ArunkType.
     * 
     * @return originLocation   * Origin code
     */
    public org.opentravel.www.OTA._2003._05.RequestLocationType getOriginLocation() {
        return originLocation;
    }


    /**
     * Sets the originLocation value for this ArunkType.
     * 
     * @param originLocation   * Origin code
     */
    public void setOriginLocation(org.opentravel.www.OTA._2003._05.RequestLocationType originLocation) {
        this.originLocation = originLocation;
    }


    /**
     * Gets the destinationLocation value for this ArunkType.
     * 
     * @return destinationLocation   * Destination code
     */
    public org.opentravel.www.OTA._2003._05.RequestLocationType getDestinationLocation() {
        return destinationLocation;
    }


    /**
     * Sets the destinationLocation value for this ArunkType.
     * 
     * @param destinationLocation   * Destination code
     */
    public void setDestinationLocation(org.opentravel.www.OTA._2003._05.RequestLocationType destinationLocation) {
        this.destinationLocation = destinationLocation;
    }


    /**
     * Gets the sideTrip value for this ArunkType.
     * 
     * @return sideTrip   * Side trip information
     */
    public org.opentravel.www.OTA._2003._05.SideTripType getSideTrip() {
        return sideTrip;
    }


    /**
     * Sets the sideTrip value for this ArunkType.
     * 
     * @param sideTrip   * Side trip information
     */
    public void setSideTrip(org.opentravel.www.OTA._2003._05.SideTripType sideTrip) {
        this.sideTrip = sideTrip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArunkType)) return false;
        ArunkType other = (ArunkType) obj;
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
            ((this.sideTrip==null && other.getSideTrip()==null) || 
             (this.sideTrip!=null &&
              this.sideTrip.equals(other.getSideTrip())));
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
        if (getSideTrip() != null) {
            _hashCode += getSideTrip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArunkType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ArunkType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RequestLocationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DestinationLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RequestLocationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sideTrip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SideTrip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SideTripType"));
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
