/**
 * TravelerInfoSummaryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Specifies passenger numbers and types.
 */
public class TravelerInfoSummaryType  implements java.io.Serializable {
    /* The sum of all seats required by all passenger groups. */
    private org.apache.axis.types.NonNegativeInteger[] seatsRequested;

    /* Specifies passenger numbers and types. */
    private org.opentravel.www.OTA._2003._05.TravelerInformationType[] airTravelerAvail;

    /* Identify pricing source, if negotiated fares are requested
     * and if it is a reprice request. */
    private org.opentravel.www.OTA._2003._05.PriceRequestInformationType priceRequestInformation;

    /* Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA). */
    private org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRating[] TPA_Extensions;

    private java.lang.Boolean specificPTC_Indicator;  // attribute

    public TravelerInfoSummaryType() {
    }

    public TravelerInfoSummaryType(
           org.apache.axis.types.NonNegativeInteger[] seatsRequested,
           org.opentravel.www.OTA._2003._05.TravelerInformationType[] airTravelerAvail,
           org.opentravel.www.OTA._2003._05.PriceRequestInformationType priceRequestInformation,
           org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRating[] TPA_Extensions,
           java.lang.Boolean specificPTC_Indicator) {
           this.seatsRequested = seatsRequested;
           this.airTravelerAvail = airTravelerAvail;
           this.priceRequestInformation = priceRequestInformation;
           this.TPA_Extensions = TPA_Extensions;
           this.specificPTC_Indicator = specificPTC_Indicator;
    }


    /**
     * Gets the seatsRequested value for this TravelerInfoSummaryType.
     * 
     * @return seatsRequested   * The sum of all seats required by all passenger groups.
     */
    public org.apache.axis.types.NonNegativeInteger[] getSeatsRequested() {
        return seatsRequested;
    }


    /**
     * Sets the seatsRequested value for this TravelerInfoSummaryType.
     * 
     * @param seatsRequested   * The sum of all seats required by all passenger groups.
     */
    public void setSeatsRequested(org.apache.axis.types.NonNegativeInteger[] seatsRequested) {
        this.seatsRequested = seatsRequested;
    }

    public org.apache.axis.types.NonNegativeInteger getSeatsRequested(int i) {
        return this.seatsRequested[i];
    }

    public void setSeatsRequested(int i, org.apache.axis.types.NonNegativeInteger _value) {
        this.seatsRequested[i] = _value;
    }


    /**
     * Gets the airTravelerAvail value for this TravelerInfoSummaryType.
     * 
     * @return airTravelerAvail   * Specifies passenger numbers and types.
     */
    public org.opentravel.www.OTA._2003._05.TravelerInformationType[] getAirTravelerAvail() {
        return airTravelerAvail;
    }


    /**
     * Sets the airTravelerAvail value for this TravelerInfoSummaryType.
     * 
     * @param airTravelerAvail   * Specifies passenger numbers and types.
     */
    public void setAirTravelerAvail(org.opentravel.www.OTA._2003._05.TravelerInformationType[] airTravelerAvail) {
        this.airTravelerAvail = airTravelerAvail;
    }

    public org.opentravel.www.OTA._2003._05.TravelerInformationType getAirTravelerAvail(int i) {
        return this.airTravelerAvail[i];
    }

    public void setAirTravelerAvail(int i, org.opentravel.www.OTA._2003._05.TravelerInformationType _value) {
        this.airTravelerAvail[i] = _value;
    }


    /**
     * Gets the priceRequestInformation value for this TravelerInfoSummaryType.
     * 
     * @return priceRequestInformation   * Identify pricing source, if negotiated fares are requested
     * and if it is a reprice request.
     */
    public org.opentravel.www.OTA._2003._05.PriceRequestInformationType getPriceRequestInformation() {
        return priceRequestInformation;
    }


    /**
     * Sets the priceRequestInformation value for this TravelerInfoSummaryType.
     * 
     * @param priceRequestInformation   * Identify pricing source, if negotiated fares are requested
     * and if it is a reprice request.
     */
    public void setPriceRequestInformation(org.opentravel.www.OTA._2003._05.PriceRequestInformationType priceRequestInformation) {
        this.priceRequestInformation = priceRequestInformation;
    }


    /**
     * Gets the TPA_Extensions value for this TravelerInfoSummaryType.
     * 
     * @return TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRating[] getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this TravelerInfoSummaryType.
     * 
     * @param TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public void setTPA_Extensions(org.opentravel.www.OTA._2003._05.TravelerInfoSummary_TPA_ExtensionsTypeTravelerRating[] TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the specificPTC_Indicator value for this TravelerInfoSummaryType.
     * 
     * @return specificPTC_Indicator
     */
    public java.lang.Boolean getSpecificPTC_Indicator() {
        return specificPTC_Indicator;
    }


    /**
     * Sets the specificPTC_Indicator value for this TravelerInfoSummaryType.
     * 
     * @param specificPTC_Indicator
     */
    public void setSpecificPTC_Indicator(java.lang.Boolean specificPTC_Indicator) {
        this.specificPTC_Indicator = specificPTC_Indicator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TravelerInfoSummaryType)) return false;
        TravelerInfoSummaryType other = (TravelerInfoSummaryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seatsRequested==null && other.getSeatsRequested()==null) || 
             (this.seatsRequested!=null &&
              java.util.Arrays.equals(this.seatsRequested, other.getSeatsRequested()))) &&
            ((this.airTravelerAvail==null && other.getAirTravelerAvail()==null) || 
             (this.airTravelerAvail!=null &&
              java.util.Arrays.equals(this.airTravelerAvail, other.getAirTravelerAvail()))) &&
            ((this.priceRequestInformation==null && other.getPriceRequestInformation()==null) || 
             (this.priceRequestInformation!=null &&
              this.priceRequestInformation.equals(other.getPriceRequestInformation()))) &&
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              java.util.Arrays.equals(this.TPA_Extensions, other.getTPA_Extensions()))) &&
            ((this.specificPTC_Indicator==null && other.getSpecificPTC_Indicator()==null) || 
             (this.specificPTC_Indicator!=null &&
              this.specificPTC_Indicator.equals(other.getSpecificPTC_Indicator())));
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
        if (getSeatsRequested() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeatsRequested());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeatsRequested(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAirTravelerAvail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAirTravelerAvail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAirTravelerAvail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriceRequestInformation() != null) {
            _hashCode += getPriceRequestInformation().hashCode();
        }
        if (getTPA_Extensions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTPA_Extensions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTPA_Extensions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpecificPTC_Indicator() != null) {
            _hashCode += getSpecificPTC_Indicator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TravelerInfoSummaryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelerInfoSummaryType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("specificPTC_Indicator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SpecificPTC_Indicator"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seatsRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "SeatsRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airTravelerAvail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirTravelerAvail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelerInformationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceRequestInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PriceRequestInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PriceRequestInformationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TravelerInfoSummary_TPA_ExtensionsType>TravelerRating"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelerRating"));
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
