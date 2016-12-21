/**
 * CurrencyConversionsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class CurrencyConversionsType  implements java.io.Serializable {
    private org.opentravel.www.OTA._2003._05.CurrencyConversionsTypeConversion conversion;

    public CurrencyConversionsType() {
    }

    public CurrencyConversionsType(
           org.opentravel.www.OTA._2003._05.CurrencyConversionsTypeConversion conversion) {
           this.conversion = conversion;
    }


    /**
     * Gets the conversion value for this CurrencyConversionsType.
     * 
     * @return conversion
     */
    public org.opentravel.www.OTA._2003._05.CurrencyConversionsTypeConversion getConversion() {
        return conversion;
    }


    /**
     * Sets the conversion value for this CurrencyConversionsType.
     * 
     * @param conversion
     */
    public void setConversion(org.opentravel.www.OTA._2003._05.CurrencyConversionsTypeConversion conversion) {
        this.conversion = conversion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurrencyConversionsType)) return false;
        CurrencyConversionsType other = (CurrencyConversionsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.conversion==null && other.getConversion()==null) || 
             (this.conversion!=null &&
              this.conversion.equals(other.getConversion())));
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
        if (getConversion() != null) {
            _hashCode += getConversion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrencyConversionsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CurrencyConversionsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Conversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">CurrencyConversionsType>Conversion"));
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
