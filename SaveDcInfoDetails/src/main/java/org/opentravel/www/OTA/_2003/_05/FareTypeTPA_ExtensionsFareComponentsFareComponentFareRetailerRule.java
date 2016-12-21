/**
 * FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule  implements java.io.Serializable {
    private java.lang.String transactionType;  // attribute

    private java.lang.String code;  // attribute

    public FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule() {
    }

    public FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule(
           java.lang.String transactionType,
           java.lang.String code) {
           this.transactionType = transactionType;
           this.code = code;
    }


    /**
     * Gets the transactionType value for this FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule.
     * 
     * @return transactionType
     */
    public java.lang.String getTransactionType() {
        return transactionType;
    }


    /**
     * Sets the transactionType value for this FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule.
     * 
     * @param transactionType
     */
    public void setTransactionType(java.lang.String transactionType) {
        this.transactionType = transactionType;
    }


    /**
     * Gets the code value for this FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule)) return false;
        FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule other = (FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionType==null && other.getTransactionType()==null) || 
             (this.transactionType!=null &&
              this.transactionType.equals(other.getTransactionType()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode())));
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
        if (getTransactionType() != null) {
            _hashCode += getTransactionType().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FareTypeTPA_ExtensionsFareComponentsFareComponentFareRetailerRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>FareType>TPA_Extensions>FareComponents>FareComponent>FareRetailerRule"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("transactionType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TransactionType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>FareType>TPA_Extensions>FareComponents>FareComponent>FareRetailerRule>TransactionType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>>FareType>TPA_Extensions>FareComponents>FareComponent>FareRetailerRule>Code"));
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
