/**
 * CabinType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class CabinType implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CabinType(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _PremiumFirst = new org.apache.axis.types.NMToken("PremiumFirst");
    public static final org.apache.axis.types.NMToken _First = new org.apache.axis.types.NMToken("First");
    public static final org.apache.axis.types.NMToken _PremiumBusiness = new org.apache.axis.types.NMToken("PremiumBusiness");
    public static final org.apache.axis.types.NMToken _Business = new org.apache.axis.types.NMToken("Business");
    public static final org.apache.axis.types.NMToken _PremiumEconomy = new org.apache.axis.types.NMToken("PremiumEconomy");
    public static final org.apache.axis.types.NMToken _Economy = new org.apache.axis.types.NMToken("Economy");
    public static final org.apache.axis.types.NMToken _Y = new org.apache.axis.types.NMToken("Y");
    public static final org.apache.axis.types.NMToken _S = new org.apache.axis.types.NMToken("S");
    public static final org.apache.axis.types.NMToken _C = new org.apache.axis.types.NMToken("C");
    public static final org.apache.axis.types.NMToken _J = new org.apache.axis.types.NMToken("J");
    public static final org.apache.axis.types.NMToken _F = new org.apache.axis.types.NMToken("F");
    public static final org.apache.axis.types.NMToken _P = new org.apache.axis.types.NMToken("P");
    public static final CabinType PremiumFirst = new CabinType(_PremiumFirst);
    public static final CabinType First = new CabinType(_First);
    public static final CabinType PremiumBusiness = new CabinType(_PremiumBusiness);
    public static final CabinType Business = new CabinType(_Business);
    public static final CabinType PremiumEconomy = new CabinType(_PremiumEconomy);
    public static final CabinType Economy = new CabinType(_Economy);
    public static final CabinType Y = new CabinType(_Y);
    public static final CabinType S = new CabinType(_S);
    public static final CabinType C = new CabinType(_C);
    public static final CabinType J = new CabinType(_J);
    public static final CabinType F = new CabinType(_F);
    public static final CabinType P = new CabinType(_P);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static CabinType fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        CabinType enumeration = (CabinType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CabinType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CabinType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "CabinType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
