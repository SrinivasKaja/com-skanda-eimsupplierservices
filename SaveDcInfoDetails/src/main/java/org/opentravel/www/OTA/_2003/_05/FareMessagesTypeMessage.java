/**
 * FareMessagesTypeMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class FareMessagesTypeMessage  implements java.io.Serializable {
    private java.lang.String airlineCode;  // attribute

    private java.lang.String type;  // attribute

    private short failCode;  // attribute

    private java.lang.String info;  // attribute

    public FareMessagesTypeMessage() {
    }

    public FareMessagesTypeMessage(
           java.lang.String airlineCode,
           java.lang.String type,
           short failCode,
           java.lang.String info) {
           this.airlineCode = airlineCode;
           this.type = type;
           this.failCode = failCode;
           this.info = info;
    }


    /**
     * Gets the airlineCode value for this FareMessagesTypeMessage.
     * 
     * @return airlineCode
     */
    public java.lang.String getAirlineCode() {
        return airlineCode;
    }


    /**
     * Sets the airlineCode value for this FareMessagesTypeMessage.
     * 
     * @param airlineCode
     */
    public void setAirlineCode(java.lang.String airlineCode) {
        this.airlineCode = airlineCode;
    }


    /**
     * Gets the type value for this FareMessagesTypeMessage.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this FareMessagesTypeMessage.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the failCode value for this FareMessagesTypeMessage.
     * 
     * @return failCode
     */
    public short getFailCode() {
        return failCode;
    }


    /**
     * Sets the failCode value for this FareMessagesTypeMessage.
     * 
     * @param failCode
     */
    public void setFailCode(short failCode) {
        this.failCode = failCode;
    }


    /**
     * Gets the info value for this FareMessagesTypeMessage.
     * 
     * @return info
     */
    public java.lang.String getInfo() {
        return info;
    }


    /**
     * Sets the info value for this FareMessagesTypeMessage.
     * 
     * @param info
     */
    public void setInfo(java.lang.String info) {
        this.info = info;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareMessagesTypeMessage)) return false;
        FareMessagesTypeMessage other = (FareMessagesTypeMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airlineCode==null && other.getAirlineCode()==null) || 
             (this.airlineCode!=null &&
              this.airlineCode.equals(other.getAirlineCode()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.failCode == other.getFailCode() &&
            ((this.info==null && other.getInfo()==null) || 
             (this.info!=null &&
              this.info.equals(other.getInfo())));
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
        if (getAirlineCode() != null) {
            _hashCode += getAirlineCode().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += getFailCode();
        if (getInfo() != null) {
            _hashCode += getInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FareMessagesTypeMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">FareMessagesType>Message"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("airlineCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AirlineCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to8"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CharacterType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("failCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FailCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("info");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Info"));
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
