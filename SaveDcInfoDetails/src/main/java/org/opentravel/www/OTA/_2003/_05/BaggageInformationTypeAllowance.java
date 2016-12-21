/**
 * BaggageInformationTypeAllowance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class BaggageInformationTypeAllowance  implements java.io.Serializable {
    private int pieces;  // attribute

    private short weight;  // attribute

    private org.opentravel.www.OTA._2003._05.BaggageInformationTypeAllowanceUnit unit;  // attribute

    public BaggageInformationTypeAllowance() {
    }

    public BaggageInformationTypeAllowance(
           int pieces,
           short weight,
           org.opentravel.www.OTA._2003._05.BaggageInformationTypeAllowanceUnit unit) {
           this.pieces = pieces;
           this.weight = weight;
           this.unit = unit;
    }


    /**
     * Gets the pieces value for this BaggageInformationTypeAllowance.
     * 
     * @return pieces
     */
    public int getPieces() {
        return pieces;
    }


    /**
     * Sets the pieces value for this BaggageInformationTypeAllowance.
     * 
     * @param pieces
     */
    public void setPieces(int pieces) {
        this.pieces = pieces;
    }


    /**
     * Gets the weight value for this BaggageInformationTypeAllowance.
     * 
     * @return weight
     */
    public short getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this BaggageInformationTypeAllowance.
     * 
     * @param weight
     */
    public void setWeight(short weight) {
        this.weight = weight;
    }


    /**
     * Gets the unit value for this BaggageInformationTypeAllowance.
     * 
     * @return unit
     */
    public org.opentravel.www.OTA._2003._05.BaggageInformationTypeAllowanceUnit getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this BaggageInformationTypeAllowance.
     * 
     * @param unit
     */
    public void setUnit(org.opentravel.www.OTA._2003._05.BaggageInformationTypeAllowanceUnit unit) {
        this.unit = unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaggageInformationTypeAllowance)) return false;
        BaggageInformationTypeAllowance other = (BaggageInformationTypeAllowance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.pieces == other.getPieces() &&
            this.weight == other.getWeight() &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit())));
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
        _hashCode += getPieces();
        _hashCode += getWeight();
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaggageInformationTypeAllowance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">BaggageInformationType>Allowance"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("pieces");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Pieces"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("weight");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Weight"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("unit");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Unit"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>BaggageInformationType>Allowance>Unit"));
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
