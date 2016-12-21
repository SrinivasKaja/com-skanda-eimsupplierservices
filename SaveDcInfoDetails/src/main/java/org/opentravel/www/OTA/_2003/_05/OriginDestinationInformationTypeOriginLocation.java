/**
 * OriginDestinationInformationTypeOriginLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OriginDestinationInformationTypeOriginLocation  extends org.opentravel.www.OTA._2003._05.RequestLocationType  implements java.io.Serializable {
    private java.lang.Boolean allAirports;  // attribute

    public OriginDestinationInformationTypeOriginLocation() {
    }

    // Simple Types must have a String constructor
    public OriginDestinationInformationTypeOriginLocation(java.lang.String _value) {
        super(_value);
    }


    /**
     * Gets the allAirports value for this OriginDestinationInformationTypeOriginLocation.
     * 
     * @return allAirports
     */
    public java.lang.Boolean getAllAirports() {
        return allAirports;
    }


    /**
     * Sets the allAirports value for this OriginDestinationInformationTypeOriginLocation.
     * 
     * @param allAirports
     */
    public void setAllAirports(java.lang.Boolean allAirports) {
        this.allAirports = allAirports;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OriginDestinationInformationTypeOriginLocation)) return false;
        OriginDestinationInformationTypeOriginLocation other = (OriginDestinationInformationTypeOriginLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allAirports==null && other.getAllAirports()==null) || 
             (this.allAirports!=null &&
              this.allAirports.equals(other.getAllAirports())));
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
        if (getAllAirports() != null) {
            _hashCode += getAllAirports().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OriginDestinationInformationTypeOriginLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">OriginDestinationInformationType>OriginLocation"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("allAirports");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AllAirports"));
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
