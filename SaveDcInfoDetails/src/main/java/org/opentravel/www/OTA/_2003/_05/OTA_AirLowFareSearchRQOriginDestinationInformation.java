/**
 * OTA_AirLowFareSearchRQOriginDestinationInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQOriginDestinationInformation  extends org.opentravel.www.OTA._2003._05.OriginDestinationInformationType  implements java.io.Serializable {
    /* Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA). */
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions TPA_Extensions;

    private java.lang.String RPH;  // attribute

    private java.lang.Boolean fixed;  // attribute

    private java.lang.Boolean fullDiversity;  // attribute

    public OTA_AirLowFareSearchRQOriginDestinationInformation() {
    }

    public OTA_AirLowFareSearchRQOriginDestinationInformation(
           java.lang.String departureDateTime,
           java.lang.String arrivalDateTime,
           org.opentravel.www.OTA._2003._05.TravelDateTimeTypeDepartureDates departureDates,
           org.opentravel.www.OTA._2003._05.TravelDateTimeTypeArrivalDates arrivalDates,
           java.lang.String departureWindow,
           java.lang.String arrivalWindow,
           org.opentravel.www.OTA._2003._05.OriginDestinationInformationTypeOriginLocation originLocation,
           org.opentravel.www.OTA._2003._05.OriginDestinationInformationTypeDestinationLocation destinationLocation,
           org.opentravel.www.OTA._2003._05.ConnectionTypeConnectionLocation[] connectionLocations,
           java.lang.String RPH,
           java.lang.Boolean fixed,
           java.lang.Boolean fullDiversity,
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions TPA_Extensions) {
        super(
            departureDateTime,
            arrivalDateTime,
            departureDates,
            arrivalDates,
            departureWindow,
            arrivalWindow,
            originLocation,
            destinationLocation,
            connectionLocations);
        this.RPH = RPH;
        this.fixed = fixed;
        this.fullDiversity = fullDiversity;
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the TPA_Extensions value for this OTA_AirLowFareSearchRQOriginDestinationInformation.
     * 
     * @return TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this OTA_AirLowFareSearchRQOriginDestinationInformation.
     * 
     * @param TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public void setTPA_Extensions(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQOriginDestinationInformationTPA_Extensions TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the RPH value for this OTA_AirLowFareSearchRQOriginDestinationInformation.
     * 
     * @return RPH
     */
    public java.lang.String getRPH() {
        return RPH;
    }


    /**
     * Sets the RPH value for this OTA_AirLowFareSearchRQOriginDestinationInformation.
     * 
     * @param RPH
     */
    public void setRPH(java.lang.String RPH) {
        this.RPH = RPH;
    }


    /**
     * Gets the fixed value for this OTA_AirLowFareSearchRQOriginDestinationInformation.
     * 
     * @return fixed
     */
    public java.lang.Boolean getFixed() {
        return fixed;
    }


    /**
     * Sets the fixed value for this OTA_AirLowFareSearchRQOriginDestinationInformation.
     * 
     * @param fixed
     */
    public void setFixed(java.lang.Boolean fixed) {
        this.fixed = fixed;
    }


    /**
     * Gets the fullDiversity value for this OTA_AirLowFareSearchRQOriginDestinationInformation.
     * 
     * @return fullDiversity
     */
    public java.lang.Boolean getFullDiversity() {
        return fullDiversity;
    }


    /**
     * Sets the fullDiversity value for this OTA_AirLowFareSearchRQOriginDestinationInformation.
     * 
     * @param fullDiversity
     */
    public void setFullDiversity(java.lang.Boolean fullDiversity) {
        this.fullDiversity = fullDiversity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQOriginDestinationInformation)) return false;
        OTA_AirLowFareSearchRQOriginDestinationInformation other = (OTA_AirLowFareSearchRQOriginDestinationInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions()))) &&
            ((this.RPH==null && other.getRPH()==null) || 
             (this.RPH!=null &&
              this.RPH.equals(other.getRPH()))) &&
            ((this.fixed==null && other.getFixed()==null) || 
             (this.fixed!=null &&
              this.fixed.equals(other.getFixed()))) &&
            ((this.fullDiversity==null && other.getFullDiversity()==null) || 
             (this.fullDiversity!=null &&
              this.fullDiversity.equals(other.getFullDiversity())));
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
        if (getTPA_Extensions() != null) {
            _hashCode += getTPA_Extensions().hashCode();
        }
        if (getRPH() != null) {
            _hashCode += getRPH().hashCode();
        }
        if (getFixed() != null) {
            _hashCode += getFixed().hashCode();
        }
        if (getFullDiversity() != null) {
            _hashCode += getFullDiversity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQOriginDestinationInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>OTA_AirLowFareSearchRQ>OriginDestinationInformation"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("RPH");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RPH"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RPH_Type"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fixed");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Fixed"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fullDiversity");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FullDiversity"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>OriginDestinationInformation>TPA_Extensions"));
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
