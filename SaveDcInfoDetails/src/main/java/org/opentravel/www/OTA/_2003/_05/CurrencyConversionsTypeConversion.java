/**
 * CurrencyConversionsTypeConversion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class CurrencyConversionsTypeConversion  implements java.io.Serializable {
    private java.lang.String from;  // attribute

    private java.lang.String to;  // attribute

    private double rateOfExchange;  // attribute

    public CurrencyConversionsTypeConversion() {
    }

    public CurrencyConversionsTypeConversion(
           java.lang.String from,
           java.lang.String to,
           double rateOfExchange) {
           this.from = from;
           this.to = to;
           this.rateOfExchange = rateOfExchange;
    }


    /**
     * Gets the from value for this CurrencyConversionsTypeConversion.
     * 
     * @return from
     */
    public java.lang.String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this CurrencyConversionsTypeConversion.
     * 
     * @param from
     */
    public void setFrom(java.lang.String from) {
        this.from = from;
    }


    /**
     * Gets the to value for this CurrencyConversionsTypeConversion.
     * 
     * @return to
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this CurrencyConversionsTypeConversion.
     * 
     * @param to
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }


    /**
     * Gets the rateOfExchange value for this CurrencyConversionsTypeConversion.
     * 
     * @return rateOfExchange
     */
    public double getRateOfExchange() {
        return rateOfExchange;
    }


    /**
     * Sets the rateOfExchange value for this CurrencyConversionsTypeConversion.
     * 
     * @param rateOfExchange
     */
    public void setRateOfExchange(double rateOfExchange) {
        this.rateOfExchange = rateOfExchange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurrencyConversionsTypeConversion)) return false;
        CurrencyConversionsTypeConversion other = (CurrencyConversionsTypeConversion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            this.rateOfExchange == other.getRateOfExchange();
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
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        _hashCode += new Double(getRateOfExchange()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrencyConversionsTypeConversion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">CurrencyConversionsType>Conversion"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("from");
        attrField.setXmlName(new javax.xml.namespace.QName("", "From"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyCodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("to");
        attrField.setXmlName(new javax.xml.namespace.QName("", "To"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyCodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("rateOfExchange");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RateOfExchange"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
