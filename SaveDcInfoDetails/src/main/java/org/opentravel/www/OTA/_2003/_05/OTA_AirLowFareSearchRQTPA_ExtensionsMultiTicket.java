/**
 * OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicket  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicketDisplayPolicy displayPolicy;  // attribute

    public OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicket() {
    }

    public OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicket(
           org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicketDisplayPolicy displayPolicy) {
           this.displayPolicy = displayPolicy;
    }


    /**
     * Gets the displayPolicy value for this OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicket.
     * 
     * @return displayPolicy
     */
    public org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicketDisplayPolicy getDisplayPolicy() {
        return displayPolicy;
    }


    /**
     * Sets the displayPolicy value for this OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicket.
     * 
     * @param displayPolicy
     */
    public void setDisplayPolicy(org.opentravel.www.OTA._2003._05.OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicketDisplayPolicy displayPolicy) {
        this.displayPolicy = displayPolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicket)) return false;
        OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicket other = (OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicket) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.displayPolicy==null && other.getDisplayPolicy()==null) || 
             (this.displayPolicy!=null &&
              this.displayPolicy.equals(other.getDisplayPolicy())));
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
        if (getDisplayPolicy() != null) {
            _hashCode += getDisplayPolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTA_AirLowFareSearchRQTPA_ExtensionsMultiTicket.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>OTA_AirLowFareSearchRQ>TPA_Extensions>MultiTicket"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("displayPolicy");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DisplayPolicy"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>OTA_AirLowFareSearchRQ>TPA_Extensions>MultiTicket>DisplayPolicy"));
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
