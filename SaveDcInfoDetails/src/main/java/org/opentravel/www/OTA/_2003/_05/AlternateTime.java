/**
 * AlternateTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AlternateTime  implements java.io.Serializable {
    private java.math.BigInteger plusMinus;  // attribute

    private java.math.BigInteger plus;  // attribute

    private java.math.BigInteger minus;  // attribute

    public AlternateTime() {
    }

    public AlternateTime(
           java.math.BigInteger plusMinus,
           java.math.BigInteger plus,
           java.math.BigInteger minus) {
           this.plusMinus = plusMinus;
           this.plus = plus;
           this.minus = minus;
    }


    /**
     * Gets the plusMinus value for this AlternateTime.
     * 
     * @return plusMinus
     */
    public java.math.BigInteger getPlusMinus() {
        return plusMinus;
    }


    /**
     * Sets the plusMinus value for this AlternateTime.
     * 
     * @param plusMinus
     */
    public void setPlusMinus(java.math.BigInteger plusMinus) {
        this.plusMinus = plusMinus;
    }


    /**
     * Gets the plus value for this AlternateTime.
     * 
     * @return plus
     */
    public java.math.BigInteger getPlus() {
        return plus;
    }


    /**
     * Sets the plus value for this AlternateTime.
     * 
     * @param plus
     */
    public void setPlus(java.math.BigInteger plus) {
        this.plus = plus;
    }


    /**
     * Gets the minus value for this AlternateTime.
     * 
     * @return minus
     */
    public java.math.BigInteger getMinus() {
        return minus;
    }


    /**
     * Sets the minus value for this AlternateTime.
     * 
     * @param minus
     */
    public void setMinus(java.math.BigInteger minus) {
        this.minus = minus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlternateTime)) return false;
        AlternateTime other = (AlternateTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.plusMinus==null && other.getPlusMinus()==null) || 
             (this.plusMinus!=null &&
              this.plusMinus.equals(other.getPlusMinus()))) &&
            ((this.plus==null && other.getPlus()==null) || 
             (this.plus!=null &&
              this.plus.equals(other.getPlus()))) &&
            ((this.minus==null && other.getMinus()==null) || 
             (this.minus!=null &&
              this.minus.equals(other.getMinus())));
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
        if (getPlusMinus() != null) {
            _hashCode += getPlusMinus().hashCode();
        }
        if (getPlus() != null) {
            _hashCode += getPlus().hashCode();
        }
        if (getMinus() != null) {
            _hashCode += getMinus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlternateTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">AlternateTime"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("plusMinus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PlusMinus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric0to9"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("plus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Plus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric0to9"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("minus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Minus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "Numeric0to72"));
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
