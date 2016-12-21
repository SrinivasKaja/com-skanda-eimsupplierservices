/**
 * DateFlexibility.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class DateFlexibility  implements java.io.Serializable {
    private java.lang.Integer nbrOfDays;  // attribute

    private java.lang.Integer plus;  // attribute

    private java.lang.Integer minus;  // attribute

    private java.lang.Boolean validate;  // attribute

    public DateFlexibility() {
    }

    public DateFlexibility(
           java.lang.Integer nbrOfDays,
           java.lang.Integer plus,
           java.lang.Integer minus,
           java.lang.Boolean validate) {
           this.nbrOfDays = nbrOfDays;
           this.plus = plus;
           this.minus = minus;
           this.validate = validate;
    }


    /**
     * Gets the nbrOfDays value for this DateFlexibility.
     * 
     * @return nbrOfDays
     */
    public java.lang.Integer getNbrOfDays() {
        return nbrOfDays;
    }


    /**
     * Sets the nbrOfDays value for this DateFlexibility.
     * 
     * @param nbrOfDays
     */
    public void setNbrOfDays(java.lang.Integer nbrOfDays) {
        this.nbrOfDays = nbrOfDays;
    }


    /**
     * Gets the plus value for this DateFlexibility.
     * 
     * @return plus
     */
    public java.lang.Integer getPlus() {
        return plus;
    }


    /**
     * Sets the plus value for this DateFlexibility.
     * 
     * @param plus
     */
    public void setPlus(java.lang.Integer plus) {
        this.plus = plus;
    }


    /**
     * Gets the minus value for this DateFlexibility.
     * 
     * @return minus
     */
    public java.lang.Integer getMinus() {
        return minus;
    }


    /**
     * Sets the minus value for this DateFlexibility.
     * 
     * @param minus
     */
    public void setMinus(java.lang.Integer minus) {
        this.minus = minus;
    }


    /**
     * Gets the validate value for this DateFlexibility.
     * 
     * @return validate
     */
    public java.lang.Boolean getValidate() {
        return validate;
    }


    /**
     * Sets the validate value for this DateFlexibility.
     * 
     * @param validate
     */
    public void setValidate(java.lang.Boolean validate) {
        this.validate = validate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateFlexibility)) return false;
        DateFlexibility other = (DateFlexibility) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nbrOfDays==null && other.getNbrOfDays()==null) || 
             (this.nbrOfDays!=null &&
              this.nbrOfDays.equals(other.getNbrOfDays()))) &&
            ((this.plus==null && other.getPlus()==null) || 
             (this.plus!=null &&
              this.plus.equals(other.getPlus()))) &&
            ((this.minus==null && other.getMinus()==null) || 
             (this.minus!=null &&
              this.minus.equals(other.getMinus()))) &&
            ((this.validate==null && other.getValidate()==null) || 
             (this.validate!=null &&
              this.validate.equals(other.getValidate())));
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
        if (getNbrOfDays() != null) {
            _hashCode += getNbrOfDays().hashCode();
        }
        if (getPlus() != null) {
            _hashCode += getPlus().hashCode();
        }
        if (getMinus() != null) {
            _hashCode += getMinus().hashCode();
        }
        if (getValidate() != null) {
            _hashCode += getValidate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateFlexibility.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">DateFlexibility"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nbrOfDays");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NbrOfDays"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("plus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Plus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("minus");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Minus"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("validate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Validate"));
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
