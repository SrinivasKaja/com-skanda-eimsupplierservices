/**
 * NumTripsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;


/**
 * This element allows a user to specify the number of itineraries
 * returned.
 */
public class NumTripsType  implements java.io.Serializable {
    private java.lang.Short number;  // attribute

    private org.apache.axis.types.UnsignedShort perDateMin;  // attribute

    private org.apache.axis.types.UnsignedShort perDateMax;  // attribute

    private org.apache.axis.types.UnsignedShort perMarket;  // attribute

    private org.apache.axis.types.UnsignedShort perMonth;  // attribute

    public NumTripsType() {
    }

    public NumTripsType(
           java.lang.Short number,
           org.apache.axis.types.UnsignedShort perDateMin,
           org.apache.axis.types.UnsignedShort perDateMax,
           org.apache.axis.types.UnsignedShort perMarket,
           org.apache.axis.types.UnsignedShort perMonth) {
           this.number = number;
           this.perDateMin = perDateMin;
           this.perDateMax = perDateMax;
           this.perMarket = perMarket;
           this.perMonth = perMonth;
    }


    /**
     * Gets the number value for this NumTripsType.
     * 
     * @return number
     */
    public java.lang.Short getNumber() {
        return number;
    }


    /**
     * Sets the number value for this NumTripsType.
     * 
     * @param number
     */
    public void setNumber(java.lang.Short number) {
        this.number = number;
    }


    /**
     * Gets the perDateMin value for this NumTripsType.
     * 
     * @return perDateMin
     */
    public org.apache.axis.types.UnsignedShort getPerDateMin() {
        return perDateMin;
    }


    /**
     * Sets the perDateMin value for this NumTripsType.
     * 
     * @param perDateMin
     */
    public void setPerDateMin(org.apache.axis.types.UnsignedShort perDateMin) {
        this.perDateMin = perDateMin;
    }


    /**
     * Gets the perDateMax value for this NumTripsType.
     * 
     * @return perDateMax
     */
    public org.apache.axis.types.UnsignedShort getPerDateMax() {
        return perDateMax;
    }


    /**
     * Sets the perDateMax value for this NumTripsType.
     * 
     * @param perDateMax
     */
    public void setPerDateMax(org.apache.axis.types.UnsignedShort perDateMax) {
        this.perDateMax = perDateMax;
    }


    /**
     * Gets the perMarket value for this NumTripsType.
     * 
     * @return perMarket
     */
    public org.apache.axis.types.UnsignedShort getPerMarket() {
        return perMarket;
    }


    /**
     * Sets the perMarket value for this NumTripsType.
     * 
     * @param perMarket
     */
    public void setPerMarket(org.apache.axis.types.UnsignedShort perMarket) {
        this.perMarket = perMarket;
    }


    /**
     * Gets the perMonth value for this NumTripsType.
     * 
     * @return perMonth
     */
    public org.apache.axis.types.UnsignedShort getPerMonth() {
        return perMonth;
    }


    /**
     * Sets the perMonth value for this NumTripsType.
     * 
     * @param perMonth
     */
    public void setPerMonth(org.apache.axis.types.UnsignedShort perMonth) {
        this.perMonth = perMonth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumTripsType)) return false;
        NumTripsType other = (NumTripsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.perDateMin==null && other.getPerDateMin()==null) || 
             (this.perDateMin!=null &&
              this.perDateMin.equals(other.getPerDateMin()))) &&
            ((this.perDateMax==null && other.getPerDateMax()==null) || 
             (this.perDateMax!=null &&
              this.perDateMax.equals(other.getPerDateMax()))) &&
            ((this.perMarket==null && other.getPerMarket()==null) || 
             (this.perMarket!=null &&
              this.perMarket.equals(other.getPerMarket()))) &&
            ((this.perMonth==null && other.getPerMonth()==null) || 
             (this.perMonth!=null &&
              this.perMonth.equals(other.getPerMonth())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getPerDateMin() != null) {
            _hashCode += getPerDateMin().hashCode();
        }
        if (getPerDateMax() != null) {
            _hashCode += getPerDateMax().hashCode();
        }
        if (getPerMarket() != null) {
            _hashCode += getPerMarket().hashCode();
        }
        if (getPerMonth() != null) {
            _hashCode += getPerMonth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumTripsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "NumTripsType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("number");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Number"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">NumTripsType>Number"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("perDateMin");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PerDateMin"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("perDateMax");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PerDateMax"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("perMarket");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PerMarket"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("perMonth");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PerMonth"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
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
