/**
 * AirSearchPrefsTypeSpanishFamilyDiscountLevel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class AirSearchPrefsTypeSpanishFamilyDiscountLevel implements java.io.Serializable {
    private short _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AirSearchPrefsTypeSpanishFamilyDiscountLevel(short value) {
        _value_ = value;
        _table_.put(new java.lang.Short(_value_),this);
    }

    public static final short _value1 = 1;
    public static final short _value2 = 2;
    public static final AirSearchPrefsTypeSpanishFamilyDiscountLevel value1 = new AirSearchPrefsTypeSpanishFamilyDiscountLevel(_value1);
    public static final AirSearchPrefsTypeSpanishFamilyDiscountLevel value2 = new AirSearchPrefsTypeSpanishFamilyDiscountLevel(_value2);
    public short getValue() { return _value_;}
    public static AirSearchPrefsTypeSpanishFamilyDiscountLevel fromValue(short value)
          throws java.lang.IllegalArgumentException {
        AirSearchPrefsTypeSpanishFamilyDiscountLevel enumeration = (AirSearchPrefsTypeSpanishFamilyDiscountLevel)
            _table_.get(new java.lang.Short(value));
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AirSearchPrefsTypeSpanishFamilyDiscountLevel fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(java.lang.Short.parseShort(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return java.lang.String.valueOf(_value_);}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AirSearchPrefsTypeSpanishFamilyDiscountLevel.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">>AirSearchPrefsType>SpanishFamilyDiscount>Level"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
