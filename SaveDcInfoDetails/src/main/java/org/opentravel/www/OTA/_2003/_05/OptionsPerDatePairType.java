/**
 * OptionsPerDatePairType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class OptionsPerDatePairType  implements java.io.Serializable {
    private java.lang.String departure;  // attribute

    private java.lang.String _return;  // attribute

    private org.apache.axis.types.UnsignedShort min;  // attribute

    private org.apache.axis.types.UnsignedShort max;  // attribute

    public OptionsPerDatePairType() {
    }

    public OptionsPerDatePairType(
           java.lang.String departure,
           java.lang.String _return,
           org.apache.axis.types.UnsignedShort min,
           org.apache.axis.types.UnsignedShort max) {
           this.departure = departure;
           this._return = _return;
           this.min = min;
           this.max = max;
    }


    /**
     * Gets the departure value for this OptionsPerDatePairType.
     * 
     * @return departure
     */
    public java.lang.String getDeparture() {
        return departure;
    }


    /**
     * Sets the departure value for this OptionsPerDatePairType.
     * 
     * @param departure
     */
    public void setDeparture(java.lang.String departure) {
        this.departure = departure;
    }


    /**
     * Gets the _return value for this OptionsPerDatePairType.
     * 
     * @return _return
     */
    public java.lang.String get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this OptionsPerDatePairType.
     * 
     * @param _return
     */
    public void set_return(java.lang.String _return) {
        this._return = _return;
    }


    /**
     * Gets the min value for this OptionsPerDatePairType.
     * 
     * @return min
     */
    public org.apache.axis.types.UnsignedShort getMin() {
        return min;
    }


    /**
     * Sets the min value for this OptionsPerDatePairType.
     * 
     * @param min
     */
    public void setMin(org.apache.axis.types.UnsignedShort min) {
        this.min = min;
    }


    /**
     * Gets the max value for this OptionsPerDatePairType.
     * 
     * @return max
     */
    public org.apache.axis.types.UnsignedShort getMax() {
        return max;
    }


    /**
     * Sets the max value for this OptionsPerDatePairType.
     * 
     * @param max
     */
    public void setMax(org.apache.axis.types.UnsignedShort max) {
        this.max = max;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OptionsPerDatePairType)) return false;
        OptionsPerDatePairType other = (OptionsPerDatePairType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.departure==null && other.getDeparture()==null) || 
             (this.departure!=null &&
              this.departure.equals(other.getDeparture()))) &&
            ((this._return==null && other.get_return()==null) || 
             (this._return!=null &&
              this._return.equals(other.get_return()))) &&
            ((this.min==null && other.getMin()==null) || 
             (this.min!=null &&
              this.min.equals(other.getMin()))) &&
            ((this.max==null && other.getMax()==null) || 
             (this.max!=null &&
              this.max.equals(other.getMax())));
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
        if (getDeparture() != null) {
            _hashCode += getDeparture().hashCode();
        }
        if (get_return() != null) {
            _hashCode += get_return().hashCode();
        }
        if (getMin() != null) {
            _hashCode += getMin().hashCode();
        }
        if (getMax() != null) {
            _hashCode += getMax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OptionsPerDatePairType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "OptionsPerDatePairType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("departure");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Departure"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ISellDateType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("_return");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Return"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "ISellDateType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("min");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Min"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("max");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Max"));
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
