/**
 * TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer  implements java.io.Serializable {
    private java.math.BigInteger tier;  // attribute

    private java.lang.String carrier;  // attribute

    public TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer() {
    }

    public TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer(
           java.math.BigInteger tier,
           java.lang.String carrier) {
           this.tier = tier;
           this.carrier = carrier;
    }


    /**
     * Gets the tier value for this TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer.
     * 
     * @return tier
     */
    public java.math.BigInteger getTier() {
        return tier;
    }


    /**
     * Sets the tier value for this TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer.
     * 
     * @param tier
     */
    public void setTier(java.math.BigInteger tier) {
        this.tier = tier;
    }


    /**
     * Gets the carrier value for this TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer.
     * 
     * @return carrier
     */
    public java.lang.String getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer.
     * 
     * @param carrier
     */
    public void setCarrier(java.lang.String carrier) {
        this.carrier = carrier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer)) return false;
        TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer other = (TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tier==null && other.getTier()==null) || 
             (this.tier!=null &&
              this.tier.equals(other.getTier()))) &&
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier())));
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
        if (getTier() != null) {
            _hashCode += getTier().hashCode();
        }
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingFrequentFlyer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TravelerInfoSummary_TPA_ExtensionsType>TravelerRating>FrequentFlyer"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("tier");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Tier"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("carrier");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Carrier"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
