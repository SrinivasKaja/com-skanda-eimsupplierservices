/**
 * DiversityControlTypeDimensions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class DiversityControlTypeDimensions  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsTravelTime travelTime;

    private org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsCarrier carrier;

    private org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsOperatingDuplicatePreferredCarrier[] operatingDuplicate;

    private org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsInboundOutboundPairing inboundOutboundPairing;

    private org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsTimeOfDayDistributionRange[][] timeOfDay;

    private org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsStopsNumber stopsNumber;

    private org.apache.axis.types.UnsignedShort priceWeight;  // attribute

    public DiversityControlTypeDimensions() {
    }

    public DiversityControlTypeDimensions(
           org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsTravelTime travelTime,
           org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsCarrier carrier,
           org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsOperatingDuplicatePreferredCarrier[] operatingDuplicate,
           org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsInboundOutboundPairing inboundOutboundPairing,
           org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsTimeOfDayDistributionRange[][] timeOfDay,
           org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsStopsNumber stopsNumber,
           org.apache.axis.types.UnsignedShort priceWeight) {
           this.travelTime = travelTime;
           this.carrier = carrier;
           this.operatingDuplicate = operatingDuplicate;
           this.inboundOutboundPairing = inboundOutboundPairing;
           this.timeOfDay = timeOfDay;
           this.stopsNumber = stopsNumber;
           this.priceWeight = priceWeight;
    }


    /**
     * Gets the travelTime value for this DiversityControlTypeDimensions.
     * 
     * @return travelTime
     */
    public org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsTravelTime getTravelTime() {
        return travelTime;
    }


    /**
     * Sets the travelTime value for this DiversityControlTypeDimensions.
     * 
     * @param travelTime
     */
    public void setTravelTime(org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsTravelTime travelTime) {
        this.travelTime = travelTime;
    }


    /**
     * Gets the carrier value for this DiversityControlTypeDimensions.
     * 
     * @return carrier
     */
    public org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsCarrier getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this DiversityControlTypeDimensions.
     * 
     * @param carrier
     */
    public void setCarrier(org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsCarrier carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the operatingDuplicate value for this DiversityControlTypeDimensions.
     * 
     * @return operatingDuplicate
     */
    public org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsOperatingDuplicatePreferredCarrier[] getOperatingDuplicate() {
        return operatingDuplicate;
    }


    /**
     * Sets the operatingDuplicate value for this DiversityControlTypeDimensions.
     * 
     * @param operatingDuplicate
     */
    public void setOperatingDuplicate(org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsOperatingDuplicatePreferredCarrier[] operatingDuplicate) {
        this.operatingDuplicate = operatingDuplicate;
    }


    /**
     * Gets the inboundOutboundPairing value for this DiversityControlTypeDimensions.
     * 
     * @return inboundOutboundPairing
     */
    public org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsInboundOutboundPairing getInboundOutboundPairing() {
        return inboundOutboundPairing;
    }


    /**
     * Sets the inboundOutboundPairing value for this DiversityControlTypeDimensions.
     * 
     * @param inboundOutboundPairing
     */
    public void setInboundOutboundPairing(org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsInboundOutboundPairing inboundOutboundPairing) {
        this.inboundOutboundPairing = inboundOutboundPairing;
    }


    /**
     * Gets the timeOfDay value for this DiversityControlTypeDimensions.
     * 
     * @return timeOfDay
     */
    public org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsTimeOfDayDistributionRange[][] getTimeOfDay() {
        return timeOfDay;
    }


    /**
     * Sets the timeOfDay value for this DiversityControlTypeDimensions.
     * 
     * @param timeOfDay
     */
    public void setTimeOfDay(org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsTimeOfDayDistributionRange[][] timeOfDay) {
        this.timeOfDay = timeOfDay;
    }


    /**
     * Gets the stopsNumber value for this DiversityControlTypeDimensions.
     * 
     * @return stopsNumber
     */
    public org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsStopsNumber getStopsNumber() {
        return stopsNumber;
    }


    /**
     * Sets the stopsNumber value for this DiversityControlTypeDimensions.
     * 
     * @param stopsNumber
     */
    public void setStopsNumber(org.opentravel.www.OTA._2003._05.DiversityControlTypeDimensionsStopsNumber stopsNumber) {
        this.stopsNumber = stopsNumber;
    }


    /**
     * Gets the priceWeight value for this DiversityControlTypeDimensions.
     * 
     * @return priceWeight
     */
    public org.apache.axis.types.UnsignedShort getPriceWeight() {
        return priceWeight;
    }


    /**
     * Sets the priceWeight value for this DiversityControlTypeDimensions.
     * 
     * @param priceWeight
     */
    public void setPriceWeight(org.apache.axis.types.UnsignedShort priceWeight) {
        this.priceWeight = priceWeight;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiversityControlTypeDimensions)) return false;
        DiversityControlTypeDimensions other = (DiversityControlTypeDimensions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.travelTime==null && other.getTravelTime()==null) || 
             (this.travelTime!=null &&
              this.travelTime.equals(other.getTravelTime()))) &&
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            ((this.operatingDuplicate==null && other.getOperatingDuplicate()==null) || 
             (this.operatingDuplicate!=null &&
              java.util.Arrays.equals(this.operatingDuplicate, other.getOperatingDuplicate()))) &&
            ((this.inboundOutboundPairing==null && other.getInboundOutboundPairing()==null) || 
             (this.inboundOutboundPairing!=null &&
              this.inboundOutboundPairing.equals(other.getInboundOutboundPairing()))) &&
            ((this.timeOfDay==null && other.getTimeOfDay()==null) || 
             (this.timeOfDay!=null &&
              java.util.Arrays.equals(this.timeOfDay, other.getTimeOfDay()))) &&
            ((this.stopsNumber==null && other.getStopsNumber()==null) || 
             (this.stopsNumber!=null &&
              this.stopsNumber.equals(other.getStopsNumber()))) &&
            ((this.priceWeight==null && other.getPriceWeight()==null) || 
             (this.priceWeight!=null &&
              this.priceWeight.equals(other.getPriceWeight())));
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
        if (getTravelTime() != null) {
            _hashCode += getTravelTime().hashCode();
        }
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        if (getOperatingDuplicate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperatingDuplicate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperatingDuplicate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInboundOutboundPairing() != null) {
            _hashCode += getInboundOutboundPairing().hashCode();
        }
        if (getTimeOfDay() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeOfDay());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimeOfDay(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStopsNumber() != null) {
            _hashCode += getStopsNumber().hashCode();
        }
        if (getPriceWeight() != null) {
            _hashCode += getPriceWeight().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiversityControlTypeDimensions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">DiversityControlType>Dimensions"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("priceWeight");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PriceWeight"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric0To10Type"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TravelTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>DiversityControlType>Dimensions>TravelTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Carrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>DiversityControlType>Dimensions>Carrier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingDuplicate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OperatingDuplicate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>DiversityControlType>Dimensions>OperatingDuplicate>PreferredCarrier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "PreferredCarrier"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundOutboundPairing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "InboundOutboundPairing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>DiversityControlType>Dimensions>InboundOutboundPairing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeOfDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TimeOfDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>DiversityControlType>Dimensions>TimeOfDay>Distribution"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Distribution"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StopsNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>DiversityControlType>Dimensions>StopsNumber"));
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
