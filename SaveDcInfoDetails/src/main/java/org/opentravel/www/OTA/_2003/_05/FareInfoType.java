/**
 * FareInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Rules for this priced option.
 */
public class FareInfoType  implements java.io.Serializable {
    /* Departure Date for this priced fare. */
    private java.lang.String departureDate;

    /* FareReferenceCode can be used for either the Fare Basis Code
     * or the Fare Class Code. */
    private java.lang.String fareReference;

    /* Information regarding restrictions governing use of the fare. */
    private org.opentravel.www.OTA._2003._05.RuleInfoType ruleInfo;

    /* The marketing airline. */
    private org.opentravel.www.OTA._2003._05.CompanyNameType[] marketingAirline;

    /* Departure point of flight segment. */
    private org.opentravel.www.OTA._2003._05.ResponseLocationType departureAirport;

    /* Arrival point of flight segment. */
    private org.opentravel.www.OTA._2003._05.ResponseLocationType arrivalAirport;

    private java.lang.Boolean negotiatedFare;  // attribute

    private java.lang.String negotiatedFareCode;  // attribute

    public FareInfoType() {
    }

    public FareInfoType(
           java.lang.String departureDate,
           java.lang.String fareReference,
           org.opentravel.www.OTA._2003._05.RuleInfoType ruleInfo,
           org.opentravel.www.OTA._2003._05.CompanyNameType[] marketingAirline,
           org.opentravel.www.OTA._2003._05.ResponseLocationType departureAirport,
           org.opentravel.www.OTA._2003._05.ResponseLocationType arrivalAirport,
           java.lang.Boolean negotiatedFare,
           java.lang.String negotiatedFareCode) {
           this.departureDate = departureDate;
           this.fareReference = fareReference;
           this.ruleInfo = ruleInfo;
           this.marketingAirline = marketingAirline;
           this.departureAirport = departureAirport;
           this.arrivalAirport = arrivalAirport;
           this.negotiatedFare = negotiatedFare;
           this.negotiatedFareCode = negotiatedFareCode;
    }


    /**
     * Gets the departureDate value for this FareInfoType.
     * 
     * @return departureDate   * Departure Date for this priced fare.
     */
    public java.lang.String getDepartureDate() {
        return departureDate;
    }


    /**
     * Sets the departureDate value for this FareInfoType.
     * 
     * @param departureDate   * Departure Date for this priced fare.
     */
    public void setDepartureDate(java.lang.String departureDate) {
        this.departureDate = departureDate;
    }


    /**
     * Gets the fareReference value for this FareInfoType.
     * 
     * @return fareReference   * FareReferenceCode can be used for either the Fare Basis Code
     * or the Fare Class Code.
     */
    public java.lang.String getFareReference() {
        return fareReference;
    }


    /**
     * Sets the fareReference value for this FareInfoType.
     * 
     * @param fareReference   * FareReferenceCode can be used for either the Fare Basis Code
     * or the Fare Class Code.
     */
    public void setFareReference(java.lang.String fareReference) {
        this.fareReference = fareReference;
    }


    /**
     * Gets the ruleInfo value for this FareInfoType.
     * 
     * @return ruleInfo   * Information regarding restrictions governing use of the fare.
     */
    public org.opentravel.www.OTA._2003._05.RuleInfoType getRuleInfo() {
        return ruleInfo;
    }


    /**
     * Sets the ruleInfo value for this FareInfoType.
     * 
     * @param ruleInfo   * Information regarding restrictions governing use of the fare.
     */
    public void setRuleInfo(org.opentravel.www.OTA._2003._05.RuleInfoType ruleInfo) {
        this.ruleInfo = ruleInfo;
    }


    /**
     * Gets the marketingAirline value for this FareInfoType.
     * 
     * @return marketingAirline   * The marketing airline.
     */
    public org.opentravel.www.OTA._2003._05.CompanyNameType[] getMarketingAirline() {
        return marketingAirline;
    }


    /**
     * Sets the marketingAirline value for this FareInfoType.
     * 
     * @param marketingAirline   * The marketing airline.
     */
    public void setMarketingAirline(org.opentravel.www.OTA._2003._05.CompanyNameType[] marketingAirline) {
        this.marketingAirline = marketingAirline;
    }

    public org.opentravel.www.OTA._2003._05.CompanyNameType getMarketingAirline(int i) {
        return this.marketingAirline[i];
    }

    public void setMarketingAirline(int i, org.opentravel.www.OTA._2003._05.CompanyNameType _value) {
        this.marketingAirline[i] = _value;
    }


    /**
     * Gets the departureAirport value for this FareInfoType.
     * 
     * @return departureAirport   * Departure point of flight segment.
     */
    public org.opentravel.www.OTA._2003._05.ResponseLocationType getDepartureAirport() {
        return departureAirport;
    }


    /**
     * Sets the departureAirport value for this FareInfoType.
     * 
     * @param departureAirport   * Departure point of flight segment.
     */
    public void setDepartureAirport(org.opentravel.www.OTA._2003._05.ResponseLocationType departureAirport) {
        this.departureAirport = departureAirport;
    }


    /**
     * Gets the arrivalAirport value for this FareInfoType.
     * 
     * @return arrivalAirport   * Arrival point of flight segment.
     */
    public org.opentravel.www.OTA._2003._05.ResponseLocationType getArrivalAirport() {
        return arrivalAirport;
    }


    /**
     * Sets the arrivalAirport value for this FareInfoType.
     * 
     * @param arrivalAirport   * Arrival point of flight segment.
     */
    public void setArrivalAirport(org.opentravel.www.OTA._2003._05.ResponseLocationType arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }


    /**
     * Gets the negotiatedFare value for this FareInfoType.
     * 
     * @return negotiatedFare
     */
    public java.lang.Boolean getNegotiatedFare() {
        return negotiatedFare;
    }


    /**
     * Sets the negotiatedFare value for this FareInfoType.
     * 
     * @param negotiatedFare
     */
    public void setNegotiatedFare(java.lang.Boolean negotiatedFare) {
        this.negotiatedFare = negotiatedFare;
    }


    /**
     * Gets the negotiatedFareCode value for this FareInfoType.
     * 
     * @return negotiatedFareCode
     */
    public java.lang.String getNegotiatedFareCode() {
        return negotiatedFareCode;
    }


    /**
     * Sets the negotiatedFareCode value for this FareInfoType.
     * 
     * @param negotiatedFareCode
     */
    public void setNegotiatedFareCode(java.lang.String negotiatedFareCode) {
        this.negotiatedFareCode = negotiatedFareCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareInfoType)) return false;
        FareInfoType other = (FareInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.departureDate==null && other.getDepartureDate()==null) || 
             (this.departureDate!=null &&
              this.departureDate.equals(other.getDepartureDate()))) &&
            ((this.fareReference==null && other.getFareReference()==null) || 
             (this.fareReference!=null &&
              this.fareReference.equals(other.getFareReference()))) &&
            ((this.ruleInfo==null && other.getRuleInfo()==null) || 
             (this.ruleInfo!=null &&
              this.ruleInfo.equals(other.getRuleInfo()))) &&
            ((this.marketingAirline==null && other.getMarketingAirline()==null) || 
             (this.marketingAirline!=null &&
              java.util.Arrays.equals(this.marketingAirline, other.getMarketingAirline()))) &&
            ((this.departureAirport==null && other.getDepartureAirport()==null) || 
             (this.departureAirport!=null &&
              this.departureAirport.equals(other.getDepartureAirport()))) &&
            ((this.arrivalAirport==null && other.getArrivalAirport()==null) || 
             (this.arrivalAirport!=null &&
              this.arrivalAirport.equals(other.getArrivalAirport()))) &&
            ((this.negotiatedFare==null && other.getNegotiatedFare()==null) || 
             (this.negotiatedFare!=null &&
              this.negotiatedFare.equals(other.getNegotiatedFare()))) &&
            ((this.negotiatedFareCode==null && other.getNegotiatedFareCode()==null) || 
             (this.negotiatedFareCode!=null &&
              this.negotiatedFareCode.equals(other.getNegotiatedFareCode())));
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
        if (getDepartureDate() != null) {
            _hashCode += getDepartureDate().hashCode();
        }
        if (getFareReference() != null) {
            _hashCode += getFareReference().hashCode();
        }
        if (getRuleInfo() != null) {
            _hashCode += getRuleInfo().hashCode();
        }
        if (getMarketingAirline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarketingAirline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarketingAirline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepartureAirport() != null) {
            _hashCode += getDepartureAirport().hashCode();
        }
        if (getArrivalAirport() != null) {
            _hashCode += getArrivalAirport().hashCode();
        }
        if (getNegotiatedFare() != null) {
            _hashCode += getNegotiatedFare().hashCode();
        }
        if (getNegotiatedFareCode() != null) {
            _hashCode += getNegotiatedFareCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FareInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareInfoType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("negotiatedFare");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NegotiatedFare"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("negotiatedFareCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NegotiatedFareCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DepartureDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RuleInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "RuleInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingAirline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "MarketingAirline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CompanyNameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureAirport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "DepartureAirport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ResponseLocationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalAirport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ArrivalAirport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ResponseLocationType"));
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
