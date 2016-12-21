/**
 * AirSearchPrefsTypeTPA_ExtensionsDiversityParameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirSearchPrefsTypeTPA_ExtensionsDiversityParameters  implements java.io.Serializable {
    /* Defines how important various parameter options are in the
     * response. Sum of all weightings needs to equal 10. */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings weightings;

    /* Defines how the options in the response should be distributed
     * between certain departure time of day ranges. All defined TimeOfDayRanges
     * need to cover the whole day and the sum of all Percentages needs to
     * equal 100. */
    private org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange[] timeOfDayDistribution;

    private org.apache.axis.types.UnsignedShort inboundOutboundPairing;  // attribute

    private org.apache.axis.types.UnsignedShort additionalNonStopsNumber;  // attribute

    private org.apache.axis.types.UnsignedShort additionalNonStopsPercentage;  // attribute

    public AirSearchPrefsTypeTPA_ExtensionsDiversityParameters() {
    }

    public AirSearchPrefsTypeTPA_ExtensionsDiversityParameters(
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings weightings,
           org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange[] timeOfDayDistribution,
           org.apache.axis.types.UnsignedShort inboundOutboundPairing,
           org.apache.axis.types.UnsignedShort additionalNonStopsNumber,
           org.apache.axis.types.UnsignedShort additionalNonStopsPercentage) {
           this.weightings = weightings;
           this.timeOfDayDistribution = timeOfDayDistribution;
           this.inboundOutboundPairing = inboundOutboundPairing;
           this.additionalNonStopsNumber = additionalNonStopsNumber;
           this.additionalNonStopsPercentage = additionalNonStopsPercentage;
    }


    /**
     * Gets the weightings value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParameters.
     * 
     * @return weightings   * Defines how important various parameter options are in the
     * response. Sum of all weightings needs to equal 10.
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings getWeightings() {
        return weightings;
    }


    /**
     * Sets the weightings value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParameters.
     * 
     * @param weightings   * Defines how important various parameter options are in the
     * response. Sum of all weightings needs to equal 10.
     */
    public void setWeightings(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings weightings) {
        this.weightings = weightings;
    }


    /**
     * Gets the timeOfDayDistribution value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParameters.
     * 
     * @return timeOfDayDistribution   * Defines how the options in the response should be distributed
     * between certain departure time of day ranges. All defined TimeOfDayRanges
     * need to cover the whole day and the sum of all Percentages needs to
     * equal 100.
     */
    public org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange[] getTimeOfDayDistribution() {
        return timeOfDayDistribution;
    }


    /**
     * Sets the timeOfDayDistribution value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParameters.
     * 
     * @param timeOfDayDistribution   * Defines how the options in the response should be distributed
     * between certain departure time of day ranges. All defined TimeOfDayRanges
     * need to cover the whole day and the sum of all Percentages needs to
     * equal 100.
     */
    public void setTimeOfDayDistribution(org.opentravel.www.OTA._2003._05.AirSearchPrefsTypeTPA_ExtensionsDiversityParametersTimeOfDayDistributionTimeOfDayRange[] timeOfDayDistribution) {
        this.timeOfDayDistribution = timeOfDayDistribution;
    }


    /**
     * Gets the inboundOutboundPairing value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParameters.
     * 
     * @return inboundOutboundPairing
     */
    public org.apache.axis.types.UnsignedShort getInboundOutboundPairing() {
        return inboundOutboundPairing;
    }


    /**
     * Sets the inboundOutboundPairing value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParameters.
     * 
     * @param inboundOutboundPairing
     */
    public void setInboundOutboundPairing(org.apache.axis.types.UnsignedShort inboundOutboundPairing) {
        this.inboundOutboundPairing = inboundOutboundPairing;
    }


    /**
     * Gets the additionalNonStopsNumber value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParameters.
     * 
     * @return additionalNonStopsNumber
     */
    public org.apache.axis.types.UnsignedShort getAdditionalNonStopsNumber() {
        return additionalNonStopsNumber;
    }


    /**
     * Sets the additionalNonStopsNumber value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParameters.
     * 
     * @param additionalNonStopsNumber
     */
    public void setAdditionalNonStopsNumber(org.apache.axis.types.UnsignedShort additionalNonStopsNumber) {
        this.additionalNonStopsNumber = additionalNonStopsNumber;
    }


    /**
     * Gets the additionalNonStopsPercentage value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParameters.
     * 
     * @return additionalNonStopsPercentage
     */
    public org.apache.axis.types.UnsignedShort getAdditionalNonStopsPercentage() {
        return additionalNonStopsPercentage;
    }


    /**
     * Sets the additionalNonStopsPercentage value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParameters.
     * 
     * @param additionalNonStopsPercentage
     */
    public void setAdditionalNonStopsPercentage(org.apache.axis.types.UnsignedShort additionalNonStopsPercentage) {
        this.additionalNonStopsPercentage = additionalNonStopsPercentage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirSearchPrefsTypeTPA_ExtensionsDiversityParameters)) return false;
        AirSearchPrefsTypeTPA_ExtensionsDiversityParameters other = (AirSearchPrefsTypeTPA_ExtensionsDiversityParameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.weightings==null && other.getWeightings()==null) || 
             (this.weightings!=null &&
              this.weightings.equals(other.getWeightings()))) &&
            ((this.timeOfDayDistribution==null && other.getTimeOfDayDistribution()==null) || 
             (this.timeOfDayDistribution!=null &&
              java.util.Arrays.equals(this.timeOfDayDistribution, other.getTimeOfDayDistribution()))) &&
            ((this.inboundOutboundPairing==null && other.getInboundOutboundPairing()==null) || 
             (this.inboundOutboundPairing!=null &&
              this.inboundOutboundPairing.equals(other.getInboundOutboundPairing()))) &&
            ((this.additionalNonStopsNumber==null && other.getAdditionalNonStopsNumber()==null) || 
             (this.additionalNonStopsNumber!=null &&
              this.additionalNonStopsNumber.equals(other.getAdditionalNonStopsNumber()))) &&
            ((this.additionalNonStopsPercentage==null && other.getAdditionalNonStopsPercentage()==null) || 
             (this.additionalNonStopsPercentage!=null &&
              this.additionalNonStopsPercentage.equals(other.getAdditionalNonStopsPercentage())));
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
        if (getWeightings() != null) {
            _hashCode += getWeightings().hashCode();
        }
        if (getTimeOfDayDistribution() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeOfDayDistribution());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimeOfDayDistribution(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInboundOutboundPairing() != null) {
            _hashCode += getInboundOutboundPairing().hashCode();
        }
        if (getAdditionalNonStopsNumber() != null) {
            _hashCode += getAdditionalNonStopsNumber().hashCode();
        }
        if (getAdditionalNonStopsPercentage() != null) {
            _hashCode += getAdditionalNonStopsPercentage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirSearchPrefsTypeTPA_ExtensionsDiversityParameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>TPA_Extensions>DiversityParameters"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("inboundOutboundPairing");
        attrField.setXmlName(new javax.xml.namespace.QName("", "InboundOutboundPairing"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>DiversityParameters>InboundOutboundPairing"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("additionalNonStopsNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AdditionalNonStopsNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>DiversityParameters>AdditionalNonStopsNumber"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("additionalNonStopsPercentage");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AdditionalNonStopsPercentage"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PercentageType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Weightings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>DiversityParameters>Weightings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeOfDayDistribution");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeOfDayDistribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>AirSearchPrefsType>TPA_Extensions>DiversityParameters>TimeOfDayDistribution>TimeOfDayRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeOfDayRange"));
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
