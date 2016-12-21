/**
 * AdvResTicketingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Container used to hold information regarding advance reservation
 * and/or advance ticketing.
 */
public class AdvResTicketingType  implements java.io.Serializable {
    /* Specifies constraints on date of advance reservations. */
    private org.opentravel.www.OTA._2003._05.AdvResTicketingTypeAdvReservation advReservation;

    /* Specifies advance ticketing restrictions. */
    private org.opentravel.www.OTA._2003._05.AdvResTicketingTypeAdvTicketing advTicketing;

    private boolean advResInd;  // attribute

    private boolean advTicketingInd;  // attribute

    public AdvResTicketingType() {
    }

    public AdvResTicketingType(
           org.opentravel.www.OTA._2003._05.AdvResTicketingTypeAdvReservation advReservation,
           org.opentravel.www.OTA._2003._05.AdvResTicketingTypeAdvTicketing advTicketing,
           boolean advResInd,
           boolean advTicketingInd) {
           this.advReservation = advReservation;
           this.advTicketing = advTicketing;
           this.advResInd = advResInd;
           this.advTicketingInd = advTicketingInd;
    }


    /**
     * Gets the advReservation value for this AdvResTicketingType.
     * 
     * @return advReservation   * Specifies constraints on date of advance reservations.
     */
    public org.opentravel.www.OTA._2003._05.AdvResTicketingTypeAdvReservation getAdvReservation() {
        return advReservation;
    }


    /**
     * Sets the advReservation value for this AdvResTicketingType.
     * 
     * @param advReservation   * Specifies constraints on date of advance reservations.
     */
    public void setAdvReservation(org.opentravel.www.OTA._2003._05.AdvResTicketingTypeAdvReservation advReservation) {
        this.advReservation = advReservation;
    }


    /**
     * Gets the advTicketing value for this AdvResTicketingType.
     * 
     * @return advTicketing   * Specifies advance ticketing restrictions.
     */
    public org.opentravel.www.OTA._2003._05.AdvResTicketingTypeAdvTicketing getAdvTicketing() {
        return advTicketing;
    }


    /**
     * Sets the advTicketing value for this AdvResTicketingType.
     * 
     * @param advTicketing   * Specifies advance ticketing restrictions.
     */
    public void setAdvTicketing(org.opentravel.www.OTA._2003._05.AdvResTicketingTypeAdvTicketing advTicketing) {
        this.advTicketing = advTicketing;
    }


    /**
     * Gets the advResInd value for this AdvResTicketingType.
     * 
     * @return advResInd
     */
    public boolean isAdvResInd() {
        return advResInd;
    }


    /**
     * Sets the advResInd value for this AdvResTicketingType.
     * 
     * @param advResInd
     */
    public void setAdvResInd(boolean advResInd) {
        this.advResInd = advResInd;
    }


    /**
     * Gets the advTicketingInd value for this AdvResTicketingType.
     * 
     * @return advTicketingInd
     */
    public boolean isAdvTicketingInd() {
        return advTicketingInd;
    }


    /**
     * Sets the advTicketingInd value for this AdvResTicketingType.
     * 
     * @param advTicketingInd
     */
    public void setAdvTicketingInd(boolean advTicketingInd) {
        this.advTicketingInd = advTicketingInd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvResTicketingType)) return false;
        AdvResTicketingType other = (AdvResTicketingType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.advReservation==null && other.getAdvReservation()==null) || 
             (this.advReservation!=null &&
              this.advReservation.equals(other.getAdvReservation()))) &&
            ((this.advTicketing==null && other.getAdvTicketing()==null) || 
             (this.advTicketing!=null &&
              this.advTicketing.equals(other.getAdvTicketing()))) &&
            this.advResInd == other.isAdvResInd() &&
            this.advTicketingInd == other.isAdvTicketingInd();
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
        if (getAdvReservation() != null) {
            _hashCode += getAdvReservation().hashCode();
        }
        if (getAdvTicketing() != null) {
            _hashCode += getAdvTicketing().hashCode();
        }
        _hashCode += (isAdvResInd() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAdvTicketingInd() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdvResTicketingType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AdvResTicketingType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("advResInd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AdvResInd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("advTicketingInd");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AdvTicketingInd"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advReservation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AdvReservation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AdvResTicketingType>AdvReservation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advTicketing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AdvTicketing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AdvResTicketingType>AdvTicketing"));
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
