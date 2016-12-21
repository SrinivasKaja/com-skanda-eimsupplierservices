/**
 * PTCFareBreakdownTypeFareInfosFareInfoTPA_ExtensionsRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class PTCFareBreakdownTypeFareInfosFareInfoTPA_ExtensionsRule  implements java.io.Serializable {
    private java.lang.String type;  // attribute

    private int ID;  // attribute

    public PTCFareBreakdownTypeFareInfosFareInfoTPA_ExtensionsRule() {
    }

    public PTCFareBreakdownTypeFareInfosFareInfoTPA_ExtensionsRule(
           java.lang.String type,
           int ID) {
           this.type = type;
           this.ID = ID;
    }


    /**
     * Gets the type value for this PTCFareBreakdownTypeFareInfosFareInfoTPA_ExtensionsRule.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this PTCFareBreakdownTypeFareInfosFareInfoTPA_ExtensionsRule.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the ID value for this PTCFareBreakdownTypeFareInfosFareInfoTPA_ExtensionsRule.
     * 
     * @return ID
     */
    public int getID() {
        return ID;
    }


    /**
     * Sets the ID value for this PTCFareBreakdownTypeFareInfosFareInfoTPA_ExtensionsRule.
     * 
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PTCFareBreakdownTypeFareInfosFareInfoTPA_ExtensionsRule)) return false;
        PTCFareBreakdownTypeFareInfosFareInfoTPA_ExtensionsRule other = (PTCFareBreakdownTypeFareInfosFareInfoTPA_ExtensionsRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.ID == other.getID();
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += getID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PTCFareBreakdownTypeFareInfosFareInfoTPA_ExtensionsRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>>PTCFareBreakdownType>FareInfos>FareInfo>TPA_Extensions>Rule"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
