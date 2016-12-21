/**
 * TicketPricingTypeTPA_Extensions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class TicketPricingTypeTPA_Extensions  implements java.io.Serializable {
    /* Issuing airline whose numeric airline code is reflected in
     * the electronic transaction for the flight/value coupon(s).The Validating
     * Carrier shall be the controlling and authorising entity for Electronic
     * Ticketing transactions.. */
    private org.opentravel.www.OTA._2003._05.TicketPricingTypeTPA_ExtensionsValidatingCarrier validatingCarrier;

    public TicketPricingTypeTPA_Extensions() {
    }

    public TicketPricingTypeTPA_Extensions(
           org.opentravel.www.OTA._2003._05.TicketPricingTypeTPA_ExtensionsValidatingCarrier validatingCarrier) {
           this.validatingCarrier = validatingCarrier;
    }


    /**
     * Gets the validatingCarrier value for this TicketPricingTypeTPA_Extensions.
     * 
     * @return validatingCarrier   * Issuing airline whose numeric airline code is reflected in
     * the electronic transaction for the flight/value coupon(s).The Validating
     * Carrier shall be the controlling and authorising entity for Electronic
     * Ticketing transactions..
     */
    public org.opentravel.www.OTA._2003._05.TicketPricingTypeTPA_ExtensionsValidatingCarrier getValidatingCarrier() {
        return validatingCarrier;
    }


    /**
     * Sets the validatingCarrier value for this TicketPricingTypeTPA_Extensions.
     * 
     * @param validatingCarrier   * Issuing airline whose numeric airline code is reflected in
     * the electronic transaction for the flight/value coupon(s).The Validating
     * Carrier shall be the controlling and authorising entity for Electronic
     * Ticketing transactions..
     */
    public void setValidatingCarrier(org.opentravel.www.OTA._2003._05.TicketPricingTypeTPA_ExtensionsValidatingCarrier validatingCarrier) {
        this.validatingCarrier = validatingCarrier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicketPricingTypeTPA_Extensions)) return false;
        TicketPricingTypeTPA_Extensions other = (TicketPricingTypeTPA_Extensions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.validatingCarrier==null && other.getValidatingCarrier()==null) || 
             (this.validatingCarrier!=null &&
              this.validatingCarrier.equals(other.getValidatingCarrier())));
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
        if (getValidatingCarrier() != null) {
            _hashCode += getValidatingCarrier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicketPricingTypeTPA_Extensions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TicketPricingType>TPA_Extensions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validatingCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ValidatingCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>TicketPricingType>TPA_Extensions>ValidatingCarrier"));
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
