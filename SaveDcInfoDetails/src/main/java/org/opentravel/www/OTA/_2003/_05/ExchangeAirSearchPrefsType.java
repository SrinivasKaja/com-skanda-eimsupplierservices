/**
 * ExchangeAirSearchPrefsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class ExchangeAirSearchPrefsType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.ExchangeTravelPreferencesTPA_ExtensionsType TPA_Extensions;

    private java.lang.Boolean validInterlineTicket;  // attribute

    public ExchangeAirSearchPrefsType() {
    }

    public ExchangeAirSearchPrefsType(
           org.opentravel.www.OTA._2003._05.ExchangeTravelPreferencesTPA_ExtensionsType TPA_Extensions,
           java.lang.Boolean validInterlineTicket) {
           this.TPA_Extensions = TPA_Extensions;
           this.validInterlineTicket = validInterlineTicket;
    }


    /**
     * Gets the TPA_Extensions value for this ExchangeAirSearchPrefsType.
     * 
     * @return TPA_Extensions
     */
    public org.opentravel.www.OTA._2003._05.ExchangeTravelPreferencesTPA_ExtensionsType getTPA_Extensions() {
        return TPA_Extensions;
    }


    /**
     * Sets the TPA_Extensions value for this ExchangeAirSearchPrefsType.
     * 
     * @param TPA_Extensions
     */
    public void setTPA_Extensions(org.opentravel.www.OTA._2003._05.ExchangeTravelPreferencesTPA_ExtensionsType TPA_Extensions) {
        this.TPA_Extensions = TPA_Extensions;
    }


    /**
     * Gets the validInterlineTicket value for this ExchangeAirSearchPrefsType.
     * 
     * @return validInterlineTicket
     */
    public java.lang.Boolean getValidInterlineTicket() {
        return validInterlineTicket;
    }


    /**
     * Sets the validInterlineTicket value for this ExchangeAirSearchPrefsType.
     * 
     * @param validInterlineTicket
     */
    public void setValidInterlineTicket(java.lang.Boolean validInterlineTicket) {
        this.validInterlineTicket = validInterlineTicket;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExchangeAirSearchPrefsType)) return false;
        ExchangeAirSearchPrefsType other = (ExchangeAirSearchPrefsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TPA_Extensions==null && other.getTPA_Extensions()==null) || 
             (this.TPA_Extensions!=null &&
              this.TPA_Extensions.equals(other.getTPA_Extensions()))) &&
            ((this.validInterlineTicket==null && other.getValidInterlineTicket()==null) || 
             (this.validInterlineTicket!=null &&
              this.validInterlineTicket.equals(other.getValidInterlineTicket())));
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
        if (getTPA_Extensions() != null) {
            _hashCode += getTPA_Extensions().hashCode();
        }
        if (getValidInterlineTicket() != null) {
            _hashCode += getValidInterlineTicket().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExchangeAirSearchPrefsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeAirSearchPrefsType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("validInterlineTicket");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ValidInterlineTicket"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TPA_Extensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "TPA_Extensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ExchangeTravelPreferencesTPA_ExtensionsType"));
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
