/**
 * PriceRequestInformationTypeTPA_ExtensionsPrivateFare.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PriceRequestInformationTypeTPA_ExtensionsPrivateFare  implements java.io.Serializable {
    private java.lang.Boolean ind;  // attribute

    public PriceRequestInformationTypeTPA_ExtensionsPrivateFare() {
    }

    public PriceRequestInformationTypeTPA_ExtensionsPrivateFare(
           java.lang.Boolean ind) {
           this.ind = ind;
    }


    /**
     * Gets the ind value for this PriceRequestInformationTypeTPA_ExtensionsPrivateFare.
     * 
     * @return ind
     */
    public java.lang.Boolean getInd() {
        return ind;
    }


    /**
     * Sets the ind value for this PriceRequestInformationTypeTPA_ExtensionsPrivateFare.
     * 
     * @param ind
     */
    public void setInd(java.lang.Boolean ind) {
        this.ind = ind;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceRequestInformationTypeTPA_ExtensionsPrivateFare)) return false;
        PriceRequestInformationTypeTPA_ExtensionsPrivateFare other = (PriceRequestInformationTypeTPA_ExtensionsPrivateFare) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ind==null && other.getInd()==null) || 
             (this.ind!=null &&
              this.ind.equals(other.getInd())));
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
        if (getInd() != null) {
            _hashCode += getInd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceRequestInformationTypeTPA_ExtensionsPrivateFare.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>PriceRequestInformationType>TPA_Extensions>PrivateFare"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ind");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Ind"));
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