/**
 * ExchangeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class ExchangeType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.ExchangeFareType fare;

    private org.opentravel.www.OTA._2003._05.ExchangePOSType POS;

    private org.opentravel.www.OTA._2003._05.ExchangeOriginDestinationInformationType originDestinationInformation;

    private org.opentravel.www.OTA._2003._05.ArunkType arunk;

    private org.opentravel.www.OTA._2003._05.ExchangeOriginDestinationInformationType originDestinationInformation2;

    private org.opentravel.www.OTA._2003._05.ExchangeAirSearchPrefsType travelPreferences;

    private org.opentravel.www.OTA._2003._05.TravelerInfoSummaryType travelerInfoSummary;

    private org.opentravel.www.OTA._2003._05.ExchangeTPA_ExtensionsType TPA_Extensions;

    private java.lang.String originalTktIssueDateTime;  // attribute

    private java.lang.String exchangedTktIssueDateTime;  // attribute

    private java.lang.String previousExchangeDateTime;  // attribute

    private java.lang.Short numberOfTaxBoxes;  // attribute

    private java.lang.String bypassAdvancePurchaseOption;  // attribute

    public ExchangeType() {
    }

    public ExchangeType(
           org.opentravel.www.OTA._2003._05.ExchangeFareType fare,
           org.opentravel.www.OTA._2003._05.ExchangePOSType POS,
           org.opentravel.www.OTA._2003._05.ExchangeOriginDestinationInformationType originDestinationInformation,
           org.opentravel.www.OTA._2003._05.ArunkType arunk,
           org.opentravel.www.OTA._2003._05.ExchangeOriginDestinationInformationType originDestinationInformation2,
           org.opentravel.www.OTA._2003._05.ExchangeAirSearchPrefsType travelPreferences,
           org.opentravel.www.OTA._2003._05.TravelerInfoSummaryType travelerInfoSummary,
           org.opentravel.www.OTA._2003._05.ExchangeTPA_ExtensionsType TPA_Extensions,
           java.lang.String originalTktIssueDateTime,
           java.lang.String exchangedTktIssueDateTime,
           java.lang.String previousExchangeDateTime,
           java.lang.Short numberOfTaxBoxes,
           java.lang.String bypassAdvancePurchaseOption) {
           this.fare = fare;
           this.POS = POS;
           this.originDestinationInformation = originDestinationInformation;
           this.arunk = arunk;
           this.originDestinationInformation2 = originDestinationInformation2;
           this.travelPreferences = travelPreferences;
           this.travelerInfoSummary = travelerInfoSummary;
           this.TPA_Extensions = TPA_Extensions;
           this.originalTktIssueDateTime = originalTktIssueDateTime;
           this.exchangedTktIssueDateTime = exchangedTktIssueDateTime;
           this.previousExchangeDateTime = previousExchangeDateTime;
           this.numberOfTaxBoxes = numberOfTaxBoxes;
           this.bypassAdvancePurchaseOption = bypassAdvancePurchaseOption;
    }


    /**
     * Gets the fare value for this ExchangeType.
     * 
     * @return fare
     */
    public org.opentravel.www.OTA._2003._05.ExchangeFareType getFare() {
        return fare;
    }


    /**
     * Sets the fare value for this ExchangeType.
     * 
     * @param fare
     */
    public void setFare(org.opentravel.www.OTA._2003._05.ExchangeFareType fare) {
        this.fare = fare;
    }


    /**
     * Gets the POS value for this ExchangeType.
     * 
     * @return POS
     */
    public org.opentravel.www.OTA._2003._05.ExchangePOSType getPOS() {
        return POS;
    }


    /**
     * Sets the POS value for this ExchangeType.
     * 
     * @param POS
     */
    public void setPOS(org.opentravel.www.OTA._2003._05.ExchangePOSType POS) {
        this.POS = POS;
    }


    /**
     * Gets the originDestinationInformation value for this ExchangeType.
     * 
     * @return originDestinationInformation
     */
    public org.opentravel.www.OTA._2003._05.ExchangeOriginDestinationInformationType getOriginDestinationInformation() {
        return originDestinationInformation;
    }


    /**
     * Sets the originDestinationInformation value for this ExchangeType.
     * 
     * @param originDestinationInformation
     */
    public void setOriginDestinationInformation(org.opentravel.www.OTA._2003._05.ExchangeOriginDestinationInformationType originDestinationInformation) {
        this.originDestinationInformation = originDestinationInformation;
    }


    /**
     * Gets the arunk value for this ExchangeType.
     * 
     * @return arunk
     */
    public org.opentravel.www.OTA._2003._05.ArunkType getArunk() {
        return arunk;
    }


    /**
     * Sets the arunk value for this ExchangeType.
     * 
     * @param arunk
     */
    public void setArunk(org.opentravel.www.OTA._2003._05.ArunkType arunk) {
        this.arunk = arunk;
    }


    /**
     * Gets the originDestinationInformation2 value for this ExchangeType.
     * 
     * @return originDestinationInformation2
     */
    public org.opentravel.www.OTA._2003._05.ExchangeOriginDestinationInformationType getOriginDestinationInformation2() {
        return originDestinationInformation2;
    }


    /**
     * Sets the originDestinationInformation2 value for this ExchangeType.
     * 
     * @param originDestinationInformation2
     */
    public void setOriginDestinationInformation2(org.opentravel.www.OTA._2003._05.ExchangeOriginDestinationInformationType originDestinationInformation2) {
        this.originDestinationInformation2 = originDestinationInformation2;
    }


    /**
     * Gets the travelPreferences value for this ExchangeType.
     * 
     * @return travelPreferences
     */
    public org.opentravel.www.OTA._2003._05.ExchangeAirSearchPrefsType getTravelPreferences() {
        return travelPreferences;
    }


    /**
     * Sets the travelPreferences value for this ExchangeType.
     * 
     * @param travelPreferences
     */
    public void setTravelPreferences(org.opentravel.www.OTA._2003._05.ExchangeAirSearchPrefsType travelPreferences) {
        this.travelPreferences = travelPreferences;
    }


    /**
     * Gets the travelerInfoSummary value for this ExchangeType.
     * 
     * @return travelerInfoSummary
     */
    public org.opentravel.www.OTA._2003._05.TravelerInfoSummaryType getTravelerInfoSummary() {
        return travelerInfoSummary;
    }


    /**
     * Sets the travelerInfoSummary value for this ExchangeType.
     * 
     * @param travelerInfoSummary
     */
    public void setTravelerInfoSummary(org.opentravel.www.OTA._2003._05.TravelerInfoSummaryType travelerInfoSummary) {
        this.travelerInfoSummary = travelerInfoSummary;
    }


    /**
     * Gets the TPA_Extensions value for this ExchangeType.
     * 
     * @return TPA_Extensions
     */
    public org.opentravel.www.OTA._2003._05.ExchangeTPA_ExtensionsType getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this ExchangeType.
     * 
     * @param TPA_Extensions
     */
    public void setTPA_Extensions(org.opentravel.www.OTA._2003._05.ExchangeTPA_ExtensionsType TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the originalTktIssueDateTime value for this ExchangeType.
     * 
     * @return originalTktIssueDateTime
     */
    public java.lang.String getOriginalTktIssueDateTime() {
        return originalTktIssueDateTime;
    }


    /**
     * Sets the originalTktIssueDateTime value for this ExchangeType.
     * 
     * @param originalTktIssueDateTime
     */
    public void setOriginalTktIssueDateTime(java.lang.String originalTktIssueDateTime) {
        this.originalTktIssueDateTime = originalTktIssueDateTime;
    }


    /**
     * Gets the exchangedTktIssueDateTime value for this ExchangeType.
     * 
     * @return exchangedTktIssueDateTime
     */
    public java.lang.String getExchangedTktIssueDateTime() {
        return exchangedTktIssueDateTime;
    }


    /**
     * Sets the exchangedTktIssueDateTime value for this ExchangeType.
     * 
     * @param exchangedTktIssueDateTime
     */
    public void setExchangedTktIssueDateTime(java.lang.String exchangedTktIssueDateTime) {
        this.exchangedTktIssueDateTime = exchangedTktIssueDateTime;
    }


    /**
     * Gets the previousExchangeDateTime value for this ExchangeType.
     * 
     * @return previousExchangeDateTime
     */
    public java.lang.String getPreviousExchangeDateTime() {
        return previousExchangeDateTime;
    }


    /**
     * Sets the previousExchangeDateTime value for this ExchangeType.
     * 
     * @param previousExchangeDateTime
     */
    public void setPreviousExchangeDateTime(java.lang.String previousExchangeDateTime) {
        this.previousExchangeDateTime = previousExchangeDateTime;
    }


    /**
     * Gets the numberOfTaxBoxes value for this ExchangeType.
     * 
     * @return numberOfTaxBoxes
     */
    public java.lang.Short getNumberOfTaxBoxes() {
        return numberOfTaxBoxes;
    }


    /**
     * Sets the numberOfTaxBoxes value for this ExchangeType.
     * 
     * @param numberOfTaxBoxes
     */
    public void setNumberOfTaxBoxes(java.lang.Short numberOfTaxBoxes) {
        this.numberOfTaxBoxes = numberOfTaxBoxes;
    }


    /**
     * Gets the bypassAdvancePurchaseOption value for this ExchangeType.
     * 
     * @return bypassAdvancePurchaseOption
     */
    public java.lang.String getBypassAdvancePurchaseOption() {
        return bypassAdvancePurchaseOption;
    }


    /**
     * Sets the bypassAdvancePurchaseOption value for this ExchangeType.
     * 
     * @param bypassAdvancePurchaseOption
     */
    public void setBypassAdvancePurchaseOption(java.lang.String bypassAdvancePurchaseOption) {
        this.bypassAdvancePurchaseOption = bypassAdvancePurchaseOption;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExchangeType)) return false;
        ExchangeType other = (ExchangeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fare==null && other.getFare()==null) || 
             (this.fare!=null &&
              this.fare.equals(other.getFare()))) &&
            ((this.POS==null && other.getPOS()==null) || 
             (this.POS!=null &&
              this.POS.equals(other.getPOS()))) &&
            ((this.originDestinationInformation==null && other.getOriginDestinationInformation()==null) || 
             (this.originDestinationInformation!=null &&
              this.originDestinationInformation.equals(other.getOriginDestinationInformation()))) &&
            ((this.arunk==null && other.getArunk()==null) || 
             (this.arunk!=null &&
              this.arunk.equals(other.getArunk()))) &&
            ((this.originDestinationInformation2==null && other.getOriginDestinationInformation2()==null) || 
             (this.originDestinationInformation2!=null &&
              this.originDestinationInformation2.equals(other.getOriginDestinationInformation2()))) &&
            ((this.travelPreferences==null && other.getTravelPreferences()==null) || 
             (this.travelPreferences!=null &&
              this.travelPreferences.equals(other.getTravelPreferences()))) &&
            ((this.travelerInfoSummary==null && other.getTravelerInfoSummary()==null) || 
             (this.travelerInfoSummary!=null &&
              this.travelerInfoSummary.equals(other.getTravelerInfoSummary()))) &&
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions()))) &&
            ((this.originalTktIssueDateTime==null && other.getOriginalTktIssueDateTime()==null) || 
             (this.originalTktIssueDateTime!=null &&
              this.originalTktIssueDateTime.equals(other.getOriginalTktIssueDateTime()))) &&
            ((this.exchangedTktIssueDateTime==null && other.getExchangedTktIssueDateTime()==null) || 
             (this.exchangedTktIssueDateTime!=null &&
              this.exchangedTktIssueDateTime.equals(other.getExchangedTktIssueDateTime()))) &&
            ((this.previousExchangeDateTime==null && other.getPreviousExchangeDateTime()==null) || 
             (this.previousExchangeDateTime!=null &&
              this.previousExchangeDateTime.equals(other.getPreviousExchangeDateTime()))) &&
            ((this.numberOfTaxBoxes==null && other.getNumberOfTaxBoxes()==null) || 
             (this.numberOfTaxBoxes!=null &&
              this.numberOfTaxBoxes.equals(other.getNumberOfTaxBoxes()))) &&
            ((this.bypassAdvancePurchaseOption==null && other.getBypassAdvancePurchaseOption()==null) || 
             (this.bypassAdvancePurchaseOption!=null &&
              this.bypassAdvancePurchaseOption.equals(other.getBypassAdvancePurchaseOption())));
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
        if (getFare() != null) {
            _hashCode += getFare().hashCode();
        }
        if (getPOS() != null) {
            _hashCode += getPOS().hashCode();
        }
        if (getOriginDestinationInformation() != null) {
            _hashCode += getOriginDestinationInformation().hashCode();
        }
        if (getArunk() != null) {
            _hashCode += getArunk().hashCode();
        }
        if (getOriginDestinationInformation2() != null) {
            _hashCode += getOriginDestinationInformation2().hashCode();
        }
        if (getTravelPreferences() != null) {
            _hashCode += getTravelPreferences().hashCode();
        }
        if (getTravelerInfoSummary() != null) {
            _hashCode += getTravelerInfoSummary().hashCode();
        }
        if (getTPA_Extensions() != null) {
            _hashCode += getTPA_Extensions().hashCode();
        }
        if (getOriginalTktIssueDateTime() != null) {
            _hashCode += getOriginalTktIssueDateTime().hashCode();
        }
        if (getExchangedTktIssueDateTime() != null) {
            _hashCode += getExchangedTktIssueDateTime().hashCode();
        }
        if (getPreviousExchangeDateTime() != null) {
            _hashCode += getPreviousExchangeDateTime().hashCode();
        }
        if (getNumberOfTaxBoxes() != null) {
            _hashCode += getNumberOfTaxBoxes().hashCode();
        }
        if (getBypassAdvancePurchaseOption() != null) {
            _hashCode += getBypassAdvancePurchaseOption().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExchangeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("originalTktIssueDateTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OriginalTktIssueDateTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ISellDateOptTimeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("exchangedTktIssueDateTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ExchangedTktIssueDateTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ISellDateOptTimeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("previousExchangeDateTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PreviousExchangeDateTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ISellDateOptTimeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("numberOfTaxBoxes");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NumberOfTaxBoxes"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("bypassAdvancePurchaseOption");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BypassAdvancePurchaseOption"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CharacterType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Fare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeFareType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "POS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangePOSType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originDestinationInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginDestinationInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeOriginDestinationInformationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arunk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Arunk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ArunkType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originDestinationInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OriginDestinationInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeOriginDestinationInformationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelPreferences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelPreferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeAirSearchPrefsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelerInfoSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelerInfoSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelerInfoSummaryType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeTPA_ExtensionsType"));
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
