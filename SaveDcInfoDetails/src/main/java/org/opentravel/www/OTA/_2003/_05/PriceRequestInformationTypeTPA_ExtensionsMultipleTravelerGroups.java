/**
 * PriceRequestInformationTypeTPA_ExtensionsMultipleTravelerGroups.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PriceRequestInformationTypeTPA_ExtensionsMultipleTravelerGroups  implements java.io.Serializable {
    private java.math.BigInteger itinerariesPerGroup;  // attribute

    public PriceRequestInformationTypeTPA_ExtensionsMultipleTravelerGroups() {
    }

    public PriceRequestInformationTypeTPA_ExtensionsMultipleTravelerGroups(
           java.math.BigInteger itinerariesPerGroup) {
           this.itinerariesPerGroup = itinerariesPerGroup;
    }


    /**
     * Gets the itinerariesPerGroup value for this PriceRequestInformationTypeTPA_ExtensionsMultipleTravelerGroups.
     * 
     * @return itinerariesPerGroup
     */
    public java.math.BigInteger getItinerariesPerGroup() {
        return itinerariesPerGroup;
    }


    /**
     * Sets the itinerariesPerGroup value for this PriceRequestInformationTypeTPA_ExtensionsMultipleTravelerGroups.
     * 
     * @param itinerariesPerGroup
     */
    public void setItinerariesPerGroup(java.math.BigInteger itinerariesPerGroup) {
        this.itinerariesPerGroup = itinerariesPerGroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceRequestInformationTypeTPA_ExtensionsMultipleTravelerGroups)) return false;
        PriceRequestInformationTypeTPA_ExtensionsMultipleTravelerGroups other = (PriceRequestInformationTypeTPA_ExtensionsMultipleTravelerGroups) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itinerariesPerGroup==null && other.getItinerariesPerGroup()==null) || 
             (this.itinerariesPerGroup!=null &&
              this.itinerariesPerGroup.equals(other.getItinerariesPerGroup())));
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
        if (getItinerariesPerGroup() != null) {
            _hashCode += getItinerariesPerGroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceRequestInformationTypeTPA_ExtensionsMultipleTravelerGroups.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>MultipleTravelerGroups"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("itinerariesPerGroup");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ItinerariesPerGroup"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric1to99"));
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
