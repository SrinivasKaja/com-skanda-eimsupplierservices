/**
 * MessageStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ebxml.www.namespaces.messageHeader;

public class MessageStatusType implements java.io.Serializable {
    private org.apache.axis.types.NMToken _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MessageStatusType(org.apache.axis.types.NMToken value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NMToken _UnAuthorized = new org.apache.axis.types.NMToken("UnAuthorized");
    public static final org.apache.axis.types.NMToken _NotRecognized = new org.apache.axis.types.NMToken("NotRecognized");
    public static final org.apache.axis.types.NMToken _Received = new org.apache.axis.types.NMToken("Received");
    public static final org.apache.axis.types.NMToken _Processed = new org.apache.axis.types.NMToken("Processed");
    public static final org.apache.axis.types.NMToken _Forwarded = new org.apache.axis.types.NMToken("Forwarded");
    public static final MessageStatusType UnAuthorized = new MessageStatusType(_UnAuthorized);
    public static final MessageStatusType NotRecognized = new MessageStatusType(_NotRecognized);
    public static final MessageStatusType Received = new MessageStatusType(_Received);
    public static final MessageStatusType Processed = new MessageStatusType(_Processed);
    public static final MessageStatusType Forwarded = new MessageStatusType(_Forwarded);
    public org.apache.axis.types.NMToken getValue() { return _value_;}
    public static MessageStatusType fromValue(org.apache.axis.types.NMToken value)
          throws java.lang.IllegalArgumentException {
        MessageStatusType enumeration = (MessageStatusType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MessageStatusType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MessageStatusType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ebxml.org/namespaces/messageHeader", "messageStatus.type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
