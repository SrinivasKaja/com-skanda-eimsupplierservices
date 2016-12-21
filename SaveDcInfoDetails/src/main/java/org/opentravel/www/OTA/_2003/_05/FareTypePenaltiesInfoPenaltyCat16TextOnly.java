/**
 * FareTypePenaltiesInfoPenaltyCat16TextOnly.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class FareTypePenaltiesInfoPenaltyCat16TextOnly  implements java.io.Serializable {
    private java.lang.String fareBasisCode;  // attribute

    private java.math.BigInteger fareComponentID;  // attribute

    public FareTypePenaltiesInfoPenaltyCat16TextOnly() {
    }

    public FareTypePenaltiesInfoPenaltyCat16TextOnly(
           java.lang.String fareBasisCode,
           java.math.BigInteger fareComponentID) {
           this.fareBasisCode = fareBasisCode;
           this.fareComponentID = fareComponentID;
    }


    /**
     * Gets the fareBasisCode value for this FareTypePenaltiesInfoPenaltyCat16TextOnly.
     * 
     * @return fareBasisCode
     */
    public java.lang.String getFareBasisCode() {
        return fareBasisCode;
    }


    /**
     * Sets the fareBasisCode value for this FareTypePenaltiesInfoPenaltyCat16TextOnly.
     * 
     * @param fareBasisCode
     */
    public void setFareBasisCode(java.lang.String fareBasisCode) {
        this.fareBasisCode = fareBasisCode;
    }


    /**
     * Gets the fareComponentID value for this FareTypePenaltiesInfoPenaltyCat16TextOnly.
     * 
     * @return fareComponentID
     */
    public java.math.BigInteger getFareComponentID() {
        return fareComponentID;
    }


    /**
     * Sets the fareComponentID value for this FareTypePenaltiesInfoPenaltyCat16TextOnly.
     * 
     * @param fareComponentID
     */
    public void setFareComponentID(java.math.BigInteger fareComponentID) {
        this.fareComponentID = fareComponentID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareTypePenaltiesInfoPenaltyCat16TextOnly)) return false;
        FareTypePenaltiesInfoPenaltyCat16TextOnly other = (FareTypePenaltiesInfoPenaltyCat16TextOnly) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fareBasisCode==null && other.getFareBasisCode()==null) || 
             (this.fareBasisCode!=null &&
              this.fareBasisCode.equals(other.getFareBasisCode()))) &&
            ((this.fareComponentID==null && other.getFareComponentID()==null) || 
             (this.fareComponentID!=null &&
              this.fareComponentID.equals(other.getFareComponentID())));
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
        if (getFareBasisCode() != null) {
            _hashCode += getFareBasisCode().hashCode();
        }
        if (getFareComponentID() != null) {
            _hashCode += getFareComponentID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FareTypePenaltiesInfoPenaltyCat16TextOnly.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>>FareType>PenaltiesInfo>Penalty>Cat16TextOnly"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fareBasisCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FareBasisCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "FareBasisCodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fareComponentID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FareComponentID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
