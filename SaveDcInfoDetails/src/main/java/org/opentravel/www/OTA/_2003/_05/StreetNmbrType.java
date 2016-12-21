/**
 * StreetNmbrType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * Street name; number on street.
 */
public class StreetNmbrType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String PO_Box;  // attribute

    public StreetNmbrType() {
    }

    // Simple Types must have a String constructor
    public StreetNmbrType(java.lang.String _value) {
        super(_value);
    }


    /**
     * Gets the PO_Box value for this StreetNmbrType.
     * 
     * @return PO_Box
     */
    public java.lang.String getPO_Box() {
        return PO_Box;
    }


    /**
     * Sets the PO_Box value for this StreetNmbrType.
     * 
     * @param PO_Box
     */
    public void setPO_Box(java.lang.String PO_Box) {
        this.PO_Box = PO_Box;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StreetNmbrType)) return false;
        StreetNmbrType other = (StreetNmbrType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.PO_Box==null && other.getPO_Box()==null) || 
             (this.PO_Box!=null &&
              this.PO_Box.equals(other.getPO_Box())));
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
        if (getPO_Box() != null) {
            _hashCode += getPO_Box().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StreetNmbrType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StreetNmbrType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("PO_Box");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PO_Box"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StringLength1to16"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
