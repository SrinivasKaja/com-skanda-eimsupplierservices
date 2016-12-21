/**
 * TransactionTypeSabreAth.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class TransactionTypeSabreAth  implements java.io.Serializable {
    private java.lang.String value;  // attribute

    private java.lang.String binarySecToken;  // attribute

    private java.lang.String conversationID;  // attribute

    public TransactionTypeSabreAth() {
    }

    public TransactionTypeSabreAth(
           java.lang.String value,
           java.lang.String binarySecToken,
           java.lang.String conversationID) {
           this.value = value;
           this.binarySecToken = binarySecToken;
           this.conversationID = conversationID;
    }


    /**
     * Gets the value value for this TransactionTypeSabreAth.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this TransactionTypeSabreAth.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the binarySecToken value for this TransactionTypeSabreAth.
     * 
     * @return binarySecToken
     */
    public java.lang.String getBinarySecToken() {
        return binarySecToken;
    }


    /**
     * Sets the binarySecToken value for this TransactionTypeSabreAth.
     * 
     * @param binarySecToken
     */
    public void setBinarySecToken(java.lang.String binarySecToken) {
        this.binarySecToken = binarySecToken;
    }


    /**
     * Gets the conversationID value for this TransactionTypeSabreAth.
     * 
     * @return conversationID
     */
    public java.lang.String getConversationID() {
        return conversationID;
    }


    /**
     * Sets the conversationID value for this TransactionTypeSabreAth.
     * 
     * @param conversationID
     */
    public void setConversationID(java.lang.String conversationID) {
        this.conversationID = conversationID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionTypeSabreAth)) return false;
        TransactionTypeSabreAth other = (TransactionTypeSabreAth) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.binarySecToken==null && other.getBinarySecToken()==null) || 
             (this.binarySecToken!=null &&
              this.binarySecToken.equals(other.getBinarySecToken()))) &&
            ((this.conversationID==null && other.getConversationID()==null) || 
             (this.conversationID!=null &&
              this.conversationID.equals(other.getConversationID())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getBinarySecToken() != null) {
            _hashCode += getBinarySecToken().hashCode();
        }
        if (getConversationID() != null) {
            _hashCode += getConversationID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionTypeSabreAth.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionType>SabreAth"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("value");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Value"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("binarySecToken");
        attrField.setXmlName(new javax.xml.namespace.QName("", "BinarySecToken"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("conversationID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ConversationID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
