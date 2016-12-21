/**
 * ExchangeTPA_ExtensionsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class ExchangeTPA_ExtensionsType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.AwardShoppingType awardShopping;

    public ExchangeTPA_ExtensionsType() {
    }

    public ExchangeTPA_ExtensionsType(
           org.opentravel.www.OTA._2003._05.AwardShoppingType awardShopping) {
           this.awardShopping = awardShopping;
    }


    /**
     * Gets the awardShopping value for this ExchangeTPA_ExtensionsType.
     * 
     * @return awardShopping
     */
    public org.opentravel.www.OTA._2003._05.AwardShoppingType getAwardShopping() {
        return awardShopping;
    }


    /**
     * Sets the awardShopping value for this ExchangeTPA_ExtensionsType.
     * 
     * @param awardShopping
     */
    public void setAwardShopping(org.opentravel.www.OTA._2003._05.AwardShoppingType awardShopping) {
        this.awardShopping = awardShopping;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExchangeTPA_ExtensionsType)) return false;
        ExchangeTPA_ExtensionsType other = (ExchangeTPA_ExtensionsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.awardShopping==null && other.getAwardShopping()==null) || 
             (this.awardShopping!=null &&
              this.awardShopping.equals(other.getAwardShopping())));
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
        if (getAwardShopping() != null) {
            _hashCode += getAwardShopping().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExchangeTPA_ExtensionsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeTPA_ExtensionsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awardShopping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AwardShopping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AwardShoppingType"));
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
