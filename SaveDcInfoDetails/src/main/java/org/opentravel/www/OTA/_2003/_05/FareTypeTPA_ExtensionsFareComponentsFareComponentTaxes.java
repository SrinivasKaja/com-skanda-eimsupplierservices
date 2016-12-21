/**
 * FareTypeTPA_ExtensionsFareComponentsFareComponentTaxes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class FareTypeTPA_ExtensionsFareComponentsFareComponentTaxes  implements java.io.Serializable {
    /* Any individual tax applied to the fare */
    private org.opentravel.www.OTA._2003._05.AirTaxType tax;

    public FareTypeTPA_ExtensionsFareComponentsFareComponentTaxes() {
    }

    public FareTypeTPA_ExtensionsFareComponentsFareComponentTaxes(
           org.opentravel.www.OTA._2003._05.AirTaxType tax) {
           this.tax = tax;
    }


    /**
     * Gets the tax value for this FareTypeTPA_ExtensionsFareComponentsFareComponentTaxes.
     * 
     * @return tax   * Any individual tax applied to the fare
     */
    public org.opentravel.www.OTA._2003._05.AirTaxType getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this FareTypeTPA_ExtensionsFareComponentsFareComponentTaxes.
     * 
     * @param tax   * Any individual tax applied to the fare
     */
    public void setTax(org.opentravel.www.OTA._2003._05.AirTaxType tax) {
        this.tax = tax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareTypeTPA_ExtensionsFareComponentsFareComponentTaxes)) return false;
        FareTypeTPA_ExtensionsFareComponentsFareComponentTaxes other = (FareTypeTPA_ExtensionsFareComponentsFareComponentTaxes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax())));
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
        if (getTax() != null) {
            _hashCode += getTax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FareTypeTPA_ExtensionsFareComponentsFareComponentTaxes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>FareComponents>FareComponent>Taxes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "AirTaxType"));
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
