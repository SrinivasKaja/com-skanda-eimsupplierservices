/**
 * PTCFareBreakdownType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Per passenger type code pricing for this itinerary. Set if fareBreakdown
 * was requested.
 */
public class PTCFareBreakdownType  implements java.io.Serializable {
    /* Number of individuals traveling under this PTC */
    private org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType passengerTypeQuantity;

    /* This is a collection of Fare Basis Codes */
    private org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeFareBasisCodesFareBasisCode[] fareBasisCodes;

    /* The total passenger fare with cost breakdown. */
    private org.opentravel.www.OTA._2003._05.FareType passengerFare;

    /* Container for endorsements. */
    private org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeEndorsements endorsements;

    /* Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA). */
    private org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeTPA_Extensions TPA_Extensions;

    /* This is a collection of FareInfo */
    private org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeFareInfosFareInfo[] fareInfos;

    private java.lang.String pricingSource;  // attribute

    private java.lang.String privateFareType;  // attribute

    private org.opentravel.www.OTA._2003._05.TimeOrDateTimeType lastTicketDate;  // attribute

    private java.util.Date previousExchangeDate;  // attribute

    private org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeReissueExchange reissueExchange;  // attribute

    public PTCFareBreakdownType() {
    }

    public PTCFareBreakdownType(
           org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType passengerTypeQuantity,
           org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeFareBasisCodesFareBasisCode[] fareBasisCodes,
           org.opentravel.www.OTA._2003._05.FareType passengerFare,
           org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeEndorsements endorsements,
           org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeTPA_Extensions TPA_Extensions,
           org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeFareInfosFareInfo[] fareInfos,
           java.lang.String pricingSource,
           java.lang.String privateFareType,
           org.opentravel.www.OTA._2003._05.TimeOrDateTimeType lastTicketDate,
           java.util.Date previousExchangeDate,
           org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeReissueExchange reissueExchange) {
           this.passengerTypeQuantity = passengerTypeQuantity;
           this.fareBasisCodes = fareBasisCodes;
           this.passengerFare = passengerFare;
           this.endorsements = endorsements;
           this.TPA_Extensions = TPA_Extensions;
           this.fareInfos = fareInfos;
           this.pricingSource = pricingSource;
           this.privateFareType = privateFareType;
           this.lastTicketDate = lastTicketDate;
           this.previousExchangeDate = previousExchangeDate;
           this.reissueExchange = reissueExchange;
    }


    /**
     * Gets the passengerTypeQuantity value for this PTCFareBreakdownType.
     * 
     * @return passengerTypeQuantity   * Number of individuals traveling under this PTC
     */
    public org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType getPassengerTypeQuantity() {
        return passengerTypeQuantity;
    }


    /**
     * Sets the passengerTypeQuantity value for this PTCFareBreakdownType.
     * 
     * @param passengerTypeQuantity   * Number of individuals traveling under this PTC
     */
    public void setPassengerTypeQuantity(org.opentravel.www.OTA._2003._05.PassengerTypeQuantityType passengerTypeQuantity) {
        this.passengerTypeQuantity = passengerTypeQuantity;
    }


    /**
     * Gets the fareBasisCodes value for this PTCFareBreakdownType.
     * 
     * @return fareBasisCodes   * This is a collection of Fare Basis Codes
     */
    public org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeFareBasisCodesFareBasisCode[] getFareBasisCodes() {
        return fareBasisCodes;
    }


    /**
     * Sets the fareBasisCodes value for this PTCFareBreakdownType.
     * 
     * @param fareBasisCodes   * This is a collection of Fare Basis Codes
     */
    public void setFareBasisCodes(org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeFareBasisCodesFareBasisCode[] fareBasisCodes) {
        this.fareBasisCodes = fareBasisCodes;
    }


    /**
     * Gets the passengerFare value for this PTCFareBreakdownType.
     * 
     * @return passengerFare   * The total passenger fare with cost breakdown.
     */
    public org.opentravel.www.OTA._2003._05.FareType getPassengerFare() {
        return passengerFare;
    }


    /**
     * Sets the passengerFare value for this PTCFareBreakdownType.
     * 
     * @param passengerFare   * The total passenger fare with cost breakdown.
     */
    public void setPassengerFare(org.opentravel.www.OTA._2003._05.FareType passengerFare) {
        this.passengerFare = passengerFare;
    }


    /**
     * Gets the endorsements value for this PTCFareBreakdownType.
     * 
     * @return endorsements   * Container for endorsements.
     */
    public org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeEndorsements getEndorsements() {
        return endorsements;
    }


    /**
     * Sets the endorsements value for this PTCFareBreakdownType.
     * 
     * @param endorsements   * Container for endorsements.
     */
    public void setEndorsements(org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeEndorsements endorsements) {
        this.endorsements = endorsements;
    }


    /**
     * Gets the TPA_Extensions value for this PTCFareBreakdownType.
     * 
     * @return TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeTPA_Extensions getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this PTCFareBreakdownType.
     * 
     * @param TPA_Extensions   * Additional elements and attributes to be included if required,
     * per Trading Partner Agreement (TPA).
     */
    public void setTPA_Extensions(org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeTPA_Extensions TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the fareInfos value for this PTCFareBreakdownType.
     * 
     * @return fareInfos   * This is a collection of FareInfo
     */
    public org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeFareInfosFareInfo[] getFareInfos() {
        return fareInfos;
    }


    /**
     * Sets the fareInfos value for this PTCFareBreakdownType.
     * 
     * @param fareInfos   * This is a collection of FareInfo
     */
    public void setFareInfos(org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeFareInfosFareInfo[] fareInfos) {
        this.fareInfos = fareInfos;
    }


    /**
     * Gets the pricingSource value for this PTCFareBreakdownType.
     * 
     * @return pricingSource
     */
    public java.lang.String getPricingSource() {
        return pricingSource;
    }


    /**
     * Sets the pricingSource value for this PTCFareBreakdownType.
     * 
     * @param pricingSource
     */
    public void setPricingSource(java.lang.String pricingSource) {
        this.pricingSource = pricingSource;
    }


    /**
     * Gets the privateFareType value for this PTCFareBreakdownType.
     * 
     * @return privateFareType
     */
    public java.lang.String getPrivateFareType() {
        return privateFareType;
    }


    /**
     * Sets the privateFareType value for this PTCFareBreakdownType.
     * 
     * @param privateFareType
     */
    public void setPrivateFareType(java.lang.String privateFareType) {
        this.privateFareType = privateFareType;
    }


    /**
     * Gets the lastTicketDate value for this PTCFareBreakdownType.
     * 
     * @return lastTicketDate
     */
    public org.opentravel.www.OTA._2003._05.TimeOrDateTimeType getLastTicketDate() {
        return lastTicketDate;
    }


    /**
     * Sets the lastTicketDate value for this PTCFareBreakdownType.
     * 
     * @param lastTicketDate
     */
    public void setLastTicketDate(org.opentravel.www.OTA._2003._05.TimeOrDateTimeType lastTicketDate) {
        this.lastTicketDate = lastTicketDate;
    }


    /**
     * Gets the previousExchangeDate value for this PTCFareBreakdownType.
     * 
     * @return previousExchangeDate
     */
    public java.util.Date getPreviousExchangeDate() {
        return previousExchangeDate;
    }


    /**
     * Sets the previousExchangeDate value for this PTCFareBreakdownType.
     * 
     * @param previousExchangeDate
     */
    public void setPreviousExchangeDate(java.util.Date previousExchangeDate) {
        this.previousExchangeDate = previousExchangeDate;
    }


    /**
     * Gets the reissueExchange value for this PTCFareBreakdownType.
     * 
     * @return reissueExchange
     */
    public org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeReissueExchange getReissueExchange() {
        return reissueExchange;
    }


    /**
     * Sets the reissueExchange value for this PTCFareBreakdownType.
     * 
     * @param reissueExchange
     */
    public void setReissueExchange(org.opentravel.www.OTA._2003._05.PTCFareBreakdownTypeReissueExchange reissueExchange) {
        this.reissueExchange = reissueExchange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PTCFareBreakdownType)) return false;
        PTCFareBreakdownType other = (PTCFareBreakdownType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.passengerTypeQuantity==null && other.getPassengerTypeQuantity()==null) || 
             (this.passengerTypeQuantity!=null &&
              this.passengerTypeQuantity.equals(other.getPassengerTypeQuantity()))) &&
            ((this.fareBasisCodes==null && other.getFareBasisCodes()==null) || 
             (this.fareBasisCodes!=null &&
              java.util.Arrays.equals(this.fareBasisCodes, other.getFareBasisCodes()))) &&
            ((this.passengerFare==null && other.getPassengerFare()==null) || 
             (this.passengerFare!=null &&
              this.passengerFare.equals(other.getPassengerFare()))) &&
            ((this.endorsements==null && other.getEndorsements()==null) || 
             (this.endorsements!=null &&
              this.endorsements.equals(other.getEndorsements()))) &&
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions()))) &&
            ((this.fareInfos==null && other.getFareInfos()==null) || 
             (this.fareInfos!=null &&
              java.util.Arrays.equals(this.fareInfos, other.getFareInfos()))) &&
            ((this.pricingSource==null && other.getPricingSource()==null) || 
             (this.pricingSource!=null &&
              this.pricingSource.equals(other.getPricingSource()))) &&
            ((this.privateFareType==null && other.getPrivateFareType()==null) || 
             (this.privateFareType!=null &&
              this.privateFareType.equals(other.getPrivateFareType()))) &&
            ((this.lastTicketDate==null && other.getLastTicketDate()==null) || 
             (this.lastTicketDate!=null &&
              this.lastTicketDate.equals(other.getLastTicketDate()))) &&
            ((this.previousExchangeDate==null && other.getPreviousExchangeDate()==null) || 
             (this.previousExchangeDate!=null &&
              this.previousExchangeDate.equals(other.getPreviousExchangeDate()))) &&
            ((this.reissueExchange==null && other.getReissueExchange()==null) || 
             (this.reissueExchange!=null &&
              this.reissueExchange.equals(other.getReissueExchange())));
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
        if (getPassengerTypeQuantity() != null) {
            _hashCode += getPassengerTypeQuantity().hashCode();
        }
        if (getFareBasisCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFareBasisCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFareBasisCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPassengerFare() != null) {
            _hashCode += getPassengerFare().hashCode();
        }
        if (getEndorsements() != null) {
            _hashCode += getEndorsements().hashCode();
        }
        if (getTPA_Extensions() != null) {
            _hashCode += getTPA_Extensions().hashCode();
        }
        if (getFareInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFareInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFareInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPricingSource() != null) {
            _hashCode += getPricingSource().hashCode();
        }
        if (getPrivateFareType() != null) {
            _hashCode += getPrivateFareType().hashCode();
        }
        if (getLastTicketDate() != null) {
            _hashCode += getLastTicketDate().hashCode();
        }
        if (getPreviousExchangeDate() != null) {
            _hashCode += getPreviousExchangeDate().hashCode();
        }
        if (getReissueExchange() != null) {
            _hashCode += getReissueExchange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PTCFareBreakdownType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PTCFareBreakdownType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("pricingSource");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PricingSource"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ResponsePricingSourceType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("privateFareType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PrivateFareType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PTCFareBreakdownType>PrivateFareType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("lastTicketDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LastTicketDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeOrDateTimeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("previousExchangeDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PreviousExchangeDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("reissueExchange");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ReissueExchange"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PTCFareBreakdownType>ReissueExchange"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerTypeQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PassengerTypeQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PassengerTypeQuantityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareBasisCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareBasisCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PTCFareBreakdownType>FareBasisCodes>FareBasisCode"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareBasisCode"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PassengerFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endorsements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Endorsements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PTCFareBreakdownType>Endorsements"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">PTCFareBreakdownType>TPA_Extensions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PTCFareBreakdownType>FareInfos>FareInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareInfo"));
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
