/**
 * TransactionStatusCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class TransactionStatusCode implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransactionStatusCode(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _Start = new org.apache.axis.types.NMToken("Start");
    public static final org.apache.axis.types.NMToken _End = new org.apache.axis.types.NMToken("End");
    public static final org.apache.axis.types.NMToken _Rollback = new org.apache.axis.types.NMToken("Rollback");
    public static final org.apache.axis.types.NMToken _InSeries = new org.apache.axis.types.NMToken("InSeries");
    public static final TransactionStatusCode Start = new TransactionStatusCode(_Start);
    public static final TransactionStatusCode End = new TransactionStatusCode(_End);
    public static final TransactionStatusCode Rollback = new TransactionStatusCode(_Rollback);
    public static final TransactionStatusCode InSeries = new TransactionStatusCode(_InSeries);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static TransactionStatusCode fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        TransactionStatusCode enumeration = (TransactionStatusCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransactionStatusCode fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.NMToken(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
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
        new org.apache.axis.description.TypeDesc(TransactionStatusCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", ">TransactionStatusCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
