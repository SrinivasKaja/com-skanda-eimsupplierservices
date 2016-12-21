/**
 * PricedItineraryTypeTPA_ExtensionsValueBucket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PricedItineraryTypeTPA_ExtensionsValueBucket  implements java.io.Serializable {
    private double priceTimeValueRank;  // attribute

    private java.math.BigInteger valueBucketNumber;  // attribute

    public PricedItineraryTypeTPA_ExtensionsValueBucket() {
    }

    public PricedItineraryTypeTPA_ExtensionsValueBucket(
           double priceTimeValueRank,
           java.math.BigInteger valueBucketNumber) {
           this.priceTimeValueRank = priceTimeValueRank;
           this.valueBucketNumber = valueBucketNumber;
    }


    /**
     * Gets the priceTimeValueRank value for this PricedItineraryTypeTPA_ExtensionsValueBucket.
     * 
     * @return priceTimeValueRank
     */
    public double getPriceTimeValueRank() {
        return priceTimeValueRank;
    }


    /**
     * Sets the priceTimeValueRank value for this PricedItineraryTypeTPA_ExtensionsValueBucket.
     * 
     * @param priceTimeValueRank
     */
    public void setPriceTimeValueRank(double priceTimeValueRank) {
        this.priceTimeValueRank = priceTimeValueRank;
    }


    /**
     * Gets the valueBucketNumber value for this PricedItineraryTypeTPA_ExtensionsValueBucket.
     * 
     * @return valueBucketNumber
     */
    public java.math.BigInteger getValueBucketNumber() {
        return valueBucketNumber;
    }


    /**
     * Sets the valueBucketNumber value for this PricedItineraryTypeTPA_ExtensionsValueBucket.
     * 
     * @param valueBucketNumber
     */
    public void setValueBucketNumber(java.math.BigInteger valueBucketNumber) {
        this.valueBucketNumber = valueBucketNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PricedItineraryTypeTPA_ExtensionsValueBucket)) return false;
        PricedItineraryTypeTPA_ExtensionsValueBucket other = (PricedItineraryTypeTPA_ExtensionsValueBucket) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.priceTimeValueRank == other.getPriceTimeValueRank() &&
            ((this.valueBucketNumber==null && other.getValueBucketNumber()==null) || 
             (this.valueBucketNumber!=null &&
              this.valueBucketNumber.equals(other.getValueBucketNumber())));
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
        _hashCode += new Double(getPriceTimeValueRank()).hashCode();
        if (getValueBucketNumber() != null) {
            _hashCode += getValueBucketNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PricedItineraryTypeTPA_ExtensionsValueBucket.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PricedItineraryType>TPA_Extensions>ValueBucket"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("priceTimeValueRank");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PriceTimeValueRank"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("valueBucketNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ValueBucketNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
