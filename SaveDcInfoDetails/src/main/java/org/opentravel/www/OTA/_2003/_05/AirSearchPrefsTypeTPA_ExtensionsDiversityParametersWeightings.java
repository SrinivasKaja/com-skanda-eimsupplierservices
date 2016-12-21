/**
 * AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedShort priceWeight;  // attribute

    private org.apache.axis.types.UnsignedShort travelTimeWeight;  // attribute

    public AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings() {
    }

    public AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings(
           org.apache.axis.types.UnsignedShort priceWeight,
           org.apache.axis.types.UnsignedShort travelTimeWeight) {
           this.priceWeight = priceWeight;
           this.travelTimeWeight = travelTimeWeight;
    }


    /**
     * Gets the priceWeight value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings.
     * 
     * @return priceWeight
     */
    public org.apache.axis.types.UnsignedShort getPriceWeight() {
        return priceWeight;
    }


    /**
     * Sets the priceWeight value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings.
     * 
     * @param priceWeight
     */
    public void setPriceWeight(org.apache.axis.types.UnsignedShort priceWeight) {
        this.priceWeight = priceWeight;
    }


    /**
     * Gets the travelTimeWeight value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings.
     * 
     * @return travelTimeWeight
     */
    public org.apache.axis.types.UnsignedShort getTravelTimeWeight() {
        return travelTimeWeight;
    }


    /**
     * Sets the travelTimeWeight value for this AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings.
     * 
     * @param travelTimeWeight
     */
    public void setTravelTimeWeight(org.apache.axis.types.UnsignedShort travelTimeWeight) {
        this.travelTimeWeight = travelTimeWeight;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings)) return false;
        AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings other = (AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.priceWeight==null && other.getPriceWeight()==null) || 
             (this.priceWeight!=null &&
              this.priceWeight.equals(other.getPriceWeight()))) &&
            ((this.travelTimeWeight==null && other.getTravelTimeWeight()==null) || 
             (this.travelTimeWeight!=null &&
              this.travelTimeWeight.equals(other.getTravelTimeWeight())));
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
        if (getPriceWeight() != null) {
            _hashCode += getPriceWeight().hashCode();
        }
        if (getTravelTimeWeight() != null) {
            _hashCode += getTravelTimeWeight().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirSearchPrefsTypeTPA_ExtensionsDiversityParametersWeightings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>AirSearchPrefsType>TPA_Extensions>DiversityParameters>Weightings"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("priceWeight");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PriceWeight"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric0To10Type"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("travelTimeWeight");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TravelTimeWeight"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric0To10Type"));
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
