/**
 * StayUnitType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.opentravel.www.OTA._2003._05;

public class StayUnitType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StayUnitType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Minutes = "Minutes";
    public static final java.lang.String _Hours = "Hours";
    public static final java.lang.String _Days = "Days";
    public static final java.lang.String _Months = "Months";
    public static final java.lang.String _MON = "MON";
    public static final java.lang.String _TUES = "TUES";
    public static final java.lang.String _WED = "WED";
    public static final java.lang.String _THU = "THU";
    public static final java.lang.String _FRI = "FRI";
    public static final java.lang.String _SAT = "SAT";
    public static final java.lang.String _SUN = "SUN";
    public static final StayUnitType Minutes = new StayUnitType(_Minutes);
    public static final StayUnitType Hours = new StayUnitType(_Hours);
    public static final StayUnitType Days = new StayUnitType(_Days);
    public static final StayUnitType Months = new StayUnitType(_Months);
    public static final StayUnitType MON = new StayUnitType(_MON);
    public static final StayUnitType TUES = new StayUnitType(_TUES);
    public static final StayUnitType WED = new StayUnitType(_WED);
    public static final StayUnitType THU = new StayUnitType(_THU);
    public static final StayUnitType FRI = new StayUnitType(_FRI);
    public static final StayUnitType SAT = new StayUnitType(_SAT);
    public static final StayUnitType SUN = new StayUnitType(_SUN);
    public java.lang.String getValue() { return _value_;}
    public static StayUnitType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        StayUnitType enumeration = (StayUnitType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static StayUnitType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
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
        new org.apache.axis.description.TypeDesc(StayUnitType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.opentravel.org/OTA/2003/05", "StayUnitType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
