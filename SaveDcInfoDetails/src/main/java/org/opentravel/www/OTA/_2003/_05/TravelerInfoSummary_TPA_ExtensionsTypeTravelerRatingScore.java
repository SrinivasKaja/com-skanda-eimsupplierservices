/**
 * TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore  implements java.io.Serializable {
    private java.math.BigInteger value;  // attribute

    private java.lang.String carrier;  // attribute

    public TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore() {
    }

    public TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore(
           java.math.BigInteger value,
           java.lang.String carrier) {
           this.value = value;
           this.carrier = carrier;
    }


    /**
     * Gets the value value for this TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore.
     * 
     * @return value
     */
    public java.math.BigInteger getValue() {
        return value;
    }


    /**
     * Sets the value value for this TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore.
     * 
     * @param value
     */
    public void setValue(java.math.BigInteger value) {
        this.value = value;
    }


    /**
     * Gets the carrier value for this TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore.
     * 
     * @return carrier
     */
    public java.lang.String getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore.
     * 
     * @param carrier
     */
    public void setCarrier(java.lang.String carrier) {
        this.carrier = carrier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore)) return false;
        TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore other = (TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TravelerInfoSummary_TPA_ExtensionsTypeTravelerRatingScore.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TravelerInfoSummary_TPA_ExtensionsType>TravelerRating>Score"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("value");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Value"));
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
