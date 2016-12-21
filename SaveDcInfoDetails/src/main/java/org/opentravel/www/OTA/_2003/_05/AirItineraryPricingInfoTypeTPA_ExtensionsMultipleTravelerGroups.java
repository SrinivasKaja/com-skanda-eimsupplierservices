/**
 * AirItineraryPricingInfoTypeTPA_ExtensionsMultipleTravelerGroups.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirItineraryPricingInfoTypeTPA_ExtensionsMultipleTravelerGroups  implements java.io.Serializable {
    private java.math.BigInteger groupNumber;  // attribute

    private boolean primaryGroup;  // attribute

    public AirItineraryPricingInfoTypeTPA_ExtensionsMultipleTravelerGroups() {
    }

    public AirItineraryPricingInfoTypeTPA_ExtensionsMultipleTravelerGroups(
           java.math.BigInteger groupNumber,
           boolean primaryGroup) {
           this.groupNumber = groupNumber;
           this.primaryGroup = primaryGroup;
    }


    /**
     * Gets the groupNumber value for this AirItineraryPricingInfoTypeTPA_ExtensionsMultipleTravelerGroups.
     * 
     * @return groupNumber
     */
    public java.math.BigInteger getGroupNumber() {
        return groupNumber;
    }


    /**
     * Sets the groupNumber value for this AirItineraryPricingInfoTypeTPA_ExtensionsMultipleTravelerGroups.
     * 
     * @param groupNumber
     */
    public void setGroupNumber(java.math.BigInteger groupNumber) {
        this.groupNumber = groupNumber;
    }


    /**
     * Gets the primaryGroup value for this AirItineraryPricingInfoTypeTPA_ExtensionsMultipleTravelerGroups.
     * 
     * @return primaryGroup
     */
    public boolean isPrimaryGroup() {
        return primaryGroup;
    }


    /**
     * Sets the primaryGroup value for this AirItineraryPricingInfoTypeTPA_ExtensionsMultipleTravelerGroups.
     * 
     * @param primaryGroup
     */
    public void setPrimaryGroup(boolean primaryGroup) {
        this.primaryGroup = primaryGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AirItineraryPricingInfoTypeTPA_ExtensionsMultipleTravelerGroups)) return false;
        AirItineraryPricingInfoTypeTPA_ExtensionsMultipleTravelerGroups other = (AirItineraryPricingInfoTypeTPA_ExtensionsMultipleTravelerGroups) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupNumber==null && other.getGroupNumber()==null) || 
             (this.groupNumber!=null &&
              this.groupNumber.equals(other.getGroupNumber()))) &&
            this.primaryGroup == other.isPrimaryGroup();
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
        if (getGroupNumber() != null) {
            _hashCode += getGroupNumber().hashCode();
        }
        _hashCode += (isPrimaryGroup() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirItineraryPricingInfoTypeTPA_ExtensionsMultipleTravelerGroups.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirItineraryPricingInfoType>TPA_Extensions>MultipleTravelerGroups"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("groupNumber");
        attrField.setXmlName(new javax.xml.namespace.QName("", "GroupNumber"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("primaryGroup");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PrimaryGroup"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
